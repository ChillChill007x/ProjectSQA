package org.apache.commons.compress.changes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v6));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v7).finish();
    Object v8 = null;
    Object v9 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v7));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v6));
    Object v8 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v6));
    Object v8 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v7));
    Object v9 = java.io.InputStream.nullInputStream();
    Object v10 = "u";
    Object v11 = true;
    Object v12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 27;
    Object v14 = ((java.io.InputStream)v12).readNBytes((((java.lang.Integer)v13).intValue()));
    Object v15 = java.io.OutputStream.nullOutputStream();
    Object v16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v15));
    Object v17 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v12),((org.apache.commons.compress.archivers.ArchiveOutputStream)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v6));
    Object v8 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v7));
    Object v9 = java.io.InputStream.nullInputStream();
    Object v10 = "u";
    Object v11 = true;
    Object v12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 0L;
    Object v14 = ((java.io.InputStream)v12).skip((((java.lang.Long)v13).longValue()));
    Object v15 = java.io.OutputStream.nullOutputStream();
    Object v16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v15));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v16).finish();
    Object v17 = null;
    Object v18 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v12),((org.apache.commons.compress.archivers.ArchiveOutputStream)v16));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v6));
    Object v8 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v7));
    Object v9 = java.io.InputStream.nullInputStream();
    Object v10 = "u";
    Object v11 = true;
    Object v12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = java.io.OutputStream.nullOutputStream();
    Object v14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v13));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v14).finish();
    Object v15 = null;
    Object v16 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v12),((org.apache.commons.compress.archivers.ArchiveOutputStream)v14));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v5).getNextEntry();
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v7));
    Object v9 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v6));
    Object v8 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v7));
    Object v9 = java.io.InputStream.nullInputStream();
    Object v10 = "u";
    Object v11 = true;
    Object v12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = java.io.OutputStream.nullOutputStream();
    Object v14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v13));
    Object v15 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v12),((org.apache.commons.compress.archivers.ArchiveOutputStream)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)22),Byte.valueOf((byte)26),Byte.valueOf((byte)2)};
    Object v7 = -62;
    Object v8 = 4;
    Object v9 = ((java.io.InputStream)v5).read(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = java.io.OutputStream.nullOutputStream();
    Object v11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v10));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v11).finish();
    Object v12 = null;
    Object v13 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = ((java.io.InputStream)v5).transferTo(((java.io.OutputStream)v6));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)-7),Byte.valueOf((byte)-6)};
    Object v7 = 1;
    Object v8 = 2;
    Object v9 = ((java.io.InputStream)v5).read(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = java.io.OutputStream.nullOutputStream();
    Object v11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v10));
    Object v12 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((java.io.InputStream)v5).readAllBytes();
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v7));
    Object v9 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v6));
    Object v8 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v7));
    Object v9 = java.io.InputStream.nullInputStream();
    Object v10 = "u";
    Object v11 = true;
    Object v12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v12).getNextEntry();
    Object v14 = java.io.OutputStream.nullOutputStream();
    Object v15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v14));
    Object v16 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v12),((org.apache.commons.compress.archivers.ArchiveOutputStream)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)8),Byte.valueOf((byte)47)};
    Object v7 = 8;
    Object v8 = 20;
    Object v9 = ((java.io.InputStream)v5).read(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = java.io.OutputStream.nullOutputStream();
    Object v11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v10));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v11).finish();
    Object v12 = null;
    Object v13 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)14),Byte.valueOf((byte)-9)};
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = ((java.io.InputStream)v5).readNBytes(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = java.io.OutputStream.nullOutputStream();
    Object v11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v10));
    Object v12 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "%";
    Object v2 = new java.util.jar.JarEntry(((java.lang.String)v1));
    Object v3 = new java.util.jar.JarEntry(((java.util.zip.ZipEntry)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.jar.JarEntry)v3));
    Object v5 = java.io.InputStream.nullInputStream();
    ((org.apache.commons.compress.changes.ChangeSet)v0).add(((org.apache.commons.compress.archivers.ArchiveEntry)v4),((java.io.InputStream)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "%";
    Object v2 = new java.util.jar.JarEntry(((java.lang.String)v1));
    Object v3 = new java.util.jar.JarEntry(((java.util.zip.ZipEntry)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.jar.JarEntry)v3));
    Object v5 = java.io.InputStream.nullInputStream();
    ((org.apache.commons.compress.changes.ChangeSet)v0).add(((org.apache.commons.compress.archivers.ArchiveEntry)v4),((java.io.InputStream)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v8 = java.io.InputStream.nullInputStream();
    Object v9 = "u";
    Object v10 = true;
    Object v11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = java.io.OutputStream.nullOutputStream();
    Object v13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v12));
    Object v14 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v7).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v11),((org.apache.commons.compress.archivers.ArchiveOutputStream)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "%";
    Object v2 = new java.util.jar.JarEntry(((java.lang.String)v1));
    Object v3 = new java.util.jar.JarEntry(((java.util.zip.ZipEntry)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.jar.JarEntry)v3));
    Object v5 = java.io.InputStream.nullInputStream();
    ((org.apache.commons.compress.changes.ChangeSet)v0).add(((org.apache.commons.compress.archivers.ArchiveEntry)v4),((java.io.InputStream)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v8 = java.io.InputStream.nullInputStream();
    Object v9 = "u";
    Object v10 = true;
    Object v11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = java.io.OutputStream.nullOutputStream();
    Object v13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v12));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v13).finish();
    Object v14 = null;
    Object v15 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v7).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v11),((org.apache.commons.compress.archivers.ArchiveOutputStream)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v5).getNextEntry();
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v7));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v8).finish();
    Object v9 = null;
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v8));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = ((java.io.InputStream)v5).transferTo(((java.io.OutputStream)v6));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v9).finish();
    Object v10 = null;
    Object v11 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)6),Byte.valueOf((byte)15)};
    Object v7 = ((java.io.InputStream)v5).read(((byte[])v6));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "%";
    Object v2 = new java.util.jar.JarEntry(((java.lang.String)v1));
    Object v3 = new java.util.jar.JarEntry(((java.util.zip.ZipEntry)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.jar.JarEntry)v3));
    Object v5 = java.io.InputStream.nullInputStream();
    ((org.apache.commons.compress.changes.ChangeSet)v0).add(((org.apache.commons.compress.archivers.ArchiveEntry)v4),((java.io.InputStream)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v8 = java.io.InputStream.nullInputStream();
    Object v9 = "u";
    Object v10 = true;
    Object v11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new byte[]{};
    Object v13 = ((java.io.InputStream)v11).read(((byte[])v12));
    Object v14 = java.io.OutputStream.nullOutputStream();
    Object v15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v14));
    Object v16 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v7).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v11),((org.apache.commons.compress.archivers.ArchiveOutputStream)v15));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)0)};
    Object v7 = ((java.io.InputStream)v5).read(((byte[])v6));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "%";
    Object v2 = new java.util.jar.JarEntry(((java.lang.String)v1));
    Object v3 = new java.util.jar.JarEntry(((java.util.zip.ZipEntry)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.jar.JarEntry)v3));
    Object v5 = java.io.InputStream.nullInputStream();
    ((org.apache.commons.compress.changes.ChangeSet)v0).add(((org.apache.commons.compress.archivers.ArchiveEntry)v4),((java.io.InputStream)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v8 = java.io.InputStream.nullInputStream();
    Object v9 = "u";
    Object v10 = true;
    Object v11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = java.io.OutputStream.nullOutputStream();
    Object v13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v12));
    Object v14 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0),Byte.valueOf((byte)-14)};
    Object v15 = 0;
    Object v16 = 0;
    ((java.io.OutputStream)v13).write(((byte[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v7).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v11),((org.apache.commons.compress.archivers.ArchiveOutputStream)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)28)};
    Object v7 = ((java.io.InputStream)v5).read(((byte[])v6));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v9).finish();
    Object v10 = null;
    Object v11 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "%";
    Object v2 = new java.util.jar.JarEntry(((java.lang.String)v1));
    Object v3 = new java.util.jar.JarEntry(((java.util.zip.ZipEntry)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.jar.JarEntry)v3));
    Object v5 = java.io.InputStream.nullInputStream();
    ((org.apache.commons.compress.changes.ChangeSet)v0).add(((org.apache.commons.compress.archivers.ArchiveEntry)v4),((java.io.InputStream)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v8 = java.io.InputStream.nullInputStream();
    Object v9 = "u";
    Object v10 = true;
    Object v11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new byte[]{Byte.valueOf((byte)0)};
    Object v13 = ((java.io.InputStream)v11).read(((byte[])v12));
    Object v14 = java.io.OutputStream.nullOutputStream();
    Object v15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v14));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v15).finish();
    Object v16 = null;
    Object v17 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v7).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v11),((org.apache.commons.compress.archivers.ArchiveOutputStream)v15));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v6));
    Object v8 = new byte[]{};
    ((java.io.OutputStream)v7).write(((byte[])v8));
    Object v9 = null;
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)-26),Byte.valueOf((byte)41),Byte.valueOf((byte)12)};
    Object v7 = 2;
    Object v8 = 2;
    Object v9 = ((java.io.InputStream)v5).read(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = java.io.OutputStream.nullOutputStream();
    Object v11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v10));
    Object v12 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "%";
    Object v2 = new java.util.jar.JarEntry(((java.lang.String)v1));
    Object v3 = new java.util.jar.JarEntry(((java.util.zip.ZipEntry)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.jar.JarEntry)v3));
    Object v5 = java.io.InputStream.nullInputStream();
    ((org.apache.commons.compress.changes.ChangeSet)v0).add(((org.apache.commons.compress.archivers.ArchiveEntry)v4),((java.io.InputStream)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v8 = java.io.InputStream.nullInputStream();
    Object v9 = "u";
    Object v10 = true;
    Object v11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = java.io.OutputStream.nullOutputStream();
    Object v13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v12));
    Object v14 = ((java.io.InputStream)v11).transferTo(((java.io.OutputStream)v13));
    Object v15 = java.io.OutputStream.nullOutputStream();
    Object v16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v15));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v16).finish();
    Object v17 = null;
    Object v18 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v7).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v11),((org.apache.commons.compress.archivers.ArchiveOutputStream)v16));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "%";
    Object v2 = new java.util.jar.JarEntry(((java.lang.String)v1));
    Object v3 = new java.util.jar.JarEntry(((java.util.zip.ZipEntry)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.jar.JarEntry)v3));
    Object v5 = java.io.InputStream.nullInputStream();
    ((org.apache.commons.compress.changes.ChangeSet)v0).add(((org.apache.commons.compress.archivers.ArchiveEntry)v4),((java.io.InputStream)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v8 = java.io.InputStream.nullInputStream();
    Object v9 = "u";
    Object v10 = true;
    Object v11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v11).read();
    Object v13 = java.io.OutputStream.nullOutputStream();
    Object v14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v13));
    Object v15 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v7).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v11),((org.apache.commons.compress.archivers.ArchiveOutputStream)v14));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "%";
    Object v2 = new java.util.jar.JarEntry(((java.lang.String)v1));
    Object v3 = new java.util.jar.JarEntry(((java.util.zip.ZipEntry)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.jar.JarEntry)v3));
    Object v5 = java.io.InputStream.nullInputStream();
    ((org.apache.commons.compress.changes.ChangeSet)v0).add(((org.apache.commons.compress.archivers.ArchiveEntry)v4),((java.io.InputStream)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v8 = java.io.InputStream.nullInputStream();
    Object v9 = "u";
    Object v10 = true;
    Object v11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = java.io.OutputStream.nullOutputStream();
    Object v13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v12));
    Object v14 = new byte[]{Byte.valueOf((byte)-55),Byte.valueOf((byte)-22),Byte.valueOf((byte)1)};
    Object v15 = 0;
    Object v16 = 0;
    ((java.io.OutputStream)v13).write(((byte[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v7).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v11),((org.apache.commons.compress.archivers.ArchiveOutputStream)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((java.io.InputStream)v5).readAllBytes();
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v7));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v8).finish();
    Object v9 = null;
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v8));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v6));
    Object v8 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v7));
    Object v9 = java.io.InputStream.nullInputStream();
    Object v10 = "u";
    Object v11 = true;
    Object v12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((java.io.InputStream)v12).readAllBytes();
    Object v14 = java.io.OutputStream.nullOutputStream();
    Object v15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v14));
    Object v16 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v12),((org.apache.commons.compress.archivers.ArchiveOutputStream)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v6));
    Object v8 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v7));
    Object v9 = java.io.InputStream.nullInputStream();
    Object v10 = "u";
    Object v11 = true;
    Object v12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((java.io.InputStream)v12).readAllBytes();
    Object v14 = java.io.OutputStream.nullOutputStream();
    Object v15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v14));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v15).finish();
    Object v16 = null;
    Object v17 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v12),((org.apache.commons.compress.archivers.ArchiveOutputStream)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "%";
    Object v2 = new java.util.jar.JarEntry(((java.lang.String)v1));
    Object v3 = new java.util.jar.JarEntry(((java.util.zip.ZipEntry)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.jar.JarEntry)v3));
    Object v5 = java.io.InputStream.nullInputStream();
    ((org.apache.commons.compress.changes.ChangeSet)v0).add(((org.apache.commons.compress.archivers.ArchiveEntry)v4),((java.io.InputStream)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v8 = java.io.InputStream.nullInputStream();
    Object v9 = "u";
    Object v10 = true;
    Object v11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((java.io.InputStream)v11).readAllBytes();
    Object v13 = java.io.OutputStream.nullOutputStream();
    Object v14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v13));
    Object v15 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v7).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v11),((org.apache.commons.compress.archivers.ArchiveOutputStream)v14));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "%";
    Object v2 = new java.util.jar.JarEntry(((java.lang.String)v1));
    Object v3 = new java.util.jar.JarEntry(((java.util.zip.ZipEntry)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.jar.JarEntry)v3));
    Object v5 = java.io.InputStream.nullInputStream();
    ((org.apache.commons.compress.changes.ChangeSet)v0).add(((org.apache.commons.compress.archivers.ArchiveEntry)v4),((java.io.InputStream)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v8 = java.io.InputStream.nullInputStream();
    Object v9 = "u";
    Object v10 = true;
    Object v11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)-8)};
    Object v13 = 33;
    Object v14 = 4;
    Object v15 = ((java.io.InputStream)v11).read(((byte[])v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = java.io.OutputStream.nullOutputStream();
    Object v17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v16));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v17).finish();
    Object v18 = null;
    Object v19 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v7).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v11),((org.apache.commons.compress.archivers.ArchiveOutputStream)v17));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "%";
    Object v2 = new java.util.jar.JarEntry(((java.lang.String)v1));
    Object v3 = new java.util.jar.JarEntry(((java.util.zip.ZipEntry)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.jar.JarEntry)v3));
    Object v5 = java.io.InputStream.nullInputStream();
    ((org.apache.commons.compress.changes.ChangeSet)v0).add(((org.apache.commons.compress.archivers.ArchiveEntry)v4),((java.io.InputStream)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v8 = java.io.InputStream.nullInputStream();
    Object v9 = "u";
    Object v10 = true;
    Object v11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = java.io.OutputStream.nullOutputStream();
    Object v13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v12));
    Object v14 = ((java.io.InputStream)v11).transferTo(((java.io.OutputStream)v13));
    Object v15 = java.io.OutputStream.nullOutputStream();
    Object v16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v15));
    Object v17 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v7).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v11),((org.apache.commons.compress.archivers.ArchiveOutputStream)v16));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "IBM437";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "IBM437";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v7).getNextEntry();
    Object v9 = java.io.OutputStream.nullOutputStream();
    Object v10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v9));
    Object v11 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "IBM437";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "IBM437";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    Object v11 = java.io.InputStream.nullInputStream();
    Object v12 = "u";
    Object v13 = true;
    Object v14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = java.io.OutputStream.nullOutputStream();
    Object v16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v15));
    Object v17 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v14),((org.apache.commons.compress.archivers.ArchiveOutputStream)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "IBM437";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v9).finish();
    Object v10 = null;
    Object v11 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "IBM437";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)-11)};
    Object v11 = 0;
    Object v12 = 0;
    ((java.io.OutputStream)v9).write(((byte[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "IBM437";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-7)};
    Object v9 = ((java.io.InputStream)v7).read(((byte[])v8));
    Object v10 = java.io.OutputStream.nullOutputStream();
    Object v11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v10));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v11).finish();
    Object v12 = null;
    Object v13 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 1;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "IBM437";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)0),Byte.valueOf((byte)-8)};
    Object v9 = -15;
    Object v10 = 1;
    Object v11 = ((java.io.InputStream)v7).read(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = java.io.OutputStream.nullOutputStream();
    Object v13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v12));
    Object v14 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "IBM437";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = new byte[]{};
    ((java.io.OutputStream)v9).write(((byte[])v10));
    Object v11 = null;
    Object v12 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "%";
    Object v2 = new java.util.jar.JarEntry(((java.lang.String)v1));
    Object v3 = new java.util.jar.JarEntry(((java.util.zip.ZipEntry)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.jar.JarEntry)v3));
    Object v5 = java.io.InputStream.nullInputStream();
    ((org.apache.commons.compress.changes.ChangeSet)v0).add(((org.apache.commons.compress.archivers.ArchiveEntry)v4),((java.io.InputStream)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v8 = java.io.InputStream.nullInputStream();
    Object v9 = "u";
    Object v10 = true;
    Object v11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((java.io.InputStream)v11).readAllBytes();
    Object v13 = java.io.OutputStream.nullOutputStream();
    Object v14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v13));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v14).finish();
    Object v15 = null;
    Object v16 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v7).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v11),((org.apache.commons.compress.archivers.ArchiveOutputStream)v14));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "IBM437";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v7).getNextEntry();
    Object v9 = java.io.OutputStream.nullOutputStream();
    Object v10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v9));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v10).finish();
    Object v11 = null;
    Object v12 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "%";
    Object v2 = new java.util.jar.JarEntry(((java.lang.String)v1));
    Object v3 = new java.util.jar.JarEntry(((java.util.zip.ZipEntry)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.jar.JarEntry)v3));
    Object v5 = java.io.InputStream.nullInputStream();
    ((org.apache.commons.compress.changes.ChangeSet)v0).add(((org.apache.commons.compress.archivers.ArchiveEntry)v4),((java.io.InputStream)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v8 = java.io.InputStream.nullInputStream();
    Object v9 = "u";
    Object v10 = true;
    Object v11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = java.io.OutputStream.nullOutputStream();
    Object v13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v12));
    Object v14 = new byte[]{};
    ((java.io.OutputStream)v13).write(((byte[])v14));
    Object v15 = null;
    Object v16 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v7).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v11),((org.apache.commons.compress.archivers.ArchiveOutputStream)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "%";
    Object v2 = new java.util.jar.JarEntry(((java.lang.String)v1));
    Object v3 = new java.util.jar.JarEntry(((java.util.zip.ZipEntry)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.jar.JarEntry)v3));
    Object v5 = java.io.InputStream.nullInputStream();
    ((org.apache.commons.compress.changes.ChangeSet)v0).add(((org.apache.commons.compress.archivers.ArchiveEntry)v4),((java.io.InputStream)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v8 = java.io.InputStream.nullInputStream();
    Object v9 = "u";
    Object v10 = true;
    Object v11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = java.io.OutputStream.nullOutputStream();
    Object v13 = ((java.io.InputStream)v11).transferTo(((java.io.OutputStream)v12));
    Object v14 = java.io.OutputStream.nullOutputStream();
    Object v15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v14));
    Object v16 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v7).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v11),((org.apache.commons.compress.archivers.ArchiveOutputStream)v15));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "+";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "+";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "+";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    Object v11 = java.io.InputStream.nullInputStream();
    Object v12 = "u";
    Object v13 = true;
    Object v14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 32;
    Object v16 = ((java.io.InputStream)v14).readNBytes((((java.lang.Integer)v15).intValue()));
    Object v17 = java.io.OutputStream.nullOutputStream();
    Object v18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v17));
    Object v19 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v14),((org.apache.commons.compress.archivers.ArchiveOutputStream)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "IBM437";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    Object v11 = java.io.InputStream.nullInputStream();
    Object v12 = "u";
    Object v13 = true;
    Object v14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = java.io.OutputStream.nullOutputStream();
    Object v16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v15));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v16).finish();
    Object v17 = null;
    Object v18 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v14),((org.apache.commons.compress.archivers.ArchiveOutputStream)v16));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "+";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = new byte[]{};
    ((java.io.OutputStream)v9).write(((byte[])v10));
    Object v11 = null;
    Object v12 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "+";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v7).read();
    Object v9 = java.io.OutputStream.nullOutputStream();
    Object v10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v9));
    Object v11 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "+";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v9).finish();
    Object v10 = null;
    Object v11 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "+";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    Object v11 = java.io.InputStream.nullInputStream();
    Object v12 = "u";
    Object v13 = true;
    Object v14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = java.io.OutputStream.nullOutputStream();
    Object v16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v15));
    Object v17 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v14),((org.apache.commons.compress.archivers.ArchiveOutputStream)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "IBM437";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.io.InputStream)v7).readAllBytes();
    Object v9 = java.io.OutputStream.nullOutputStream();
    Object v10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v9));
    Object v11 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = "u";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)-7),Byte.valueOf((byte)4),Byte.valueOf((byte)6)};
    Object v7 = ((java.io.InputStream)v5).read(((byte[])v6));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v1).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v5),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "TRAILER!!!";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "TRAILER!!!";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v7).getNextEntry();
    Object v9 = java.io.OutputStream.nullOutputStream();
    Object v10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v9));
    Object v11 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "TRAILER!!!";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "+";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new byte[]{};
    Object v9 = 0;
    Object v10 = -14;
    Object v11 = ((java.io.InputStream)v7).read(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = java.io.OutputStream.nullOutputStream();
    Object v13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v12));
    Object v14 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "TRAILER!!!";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    Object v11 = java.io.InputStream.nullInputStream();
    Object v12 = "u";
    Object v13 = true;
    Object v14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((java.io.InputStream)v14).readAllBytes();
    Object v16 = java.io.OutputStream.nullOutputStream();
    Object v17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v16));
    Object v18 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v14),((org.apache.commons.compress.archivers.ArchiveOutputStream)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "TRAILER!!!";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v9).finish();
    Object v10 = null;
    Object v11 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "+";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.io.InputStream)v7).readAllBytes();
    Object v9 = java.io.OutputStream.nullOutputStream();
    Object v10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v9));
    Object v11 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "TRAILER!!!";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 4L;
    Object v9 = ((java.io.InputStream)v7).skip((((java.lang.Long)v8).longValue()));
    Object v10 = java.io.OutputStream.nullOutputStream();
    Object v11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v10));
    Object v12 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "IBM437";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    Object v11 = java.io.InputStream.nullInputStream();
    Object v12 = "u";
    Object v13 = true;
    Object v14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = java.io.OutputStream.nullOutputStream();
    Object v16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v15));
    Object v17 = ((java.io.InputStream)v14).transferTo(((java.io.OutputStream)v16));
    Object v18 = java.io.OutputStream.nullOutputStream();
    Object v19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v18));
    Object v20 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v14),((org.apache.commons.compress.archivers.ArchiveOutputStream)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "+";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v9 = ((java.io.InputStream)v7).read(((byte[])v8));
    Object v10 = java.io.OutputStream.nullOutputStream();
    Object v11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v10));
    Object v12 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "IBM437";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((java.io.InputStream)v7).transferTo(((java.io.OutputStream)v9));
    Object v11 = java.io.OutputStream.nullOutputStream();
    Object v12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v11));
    Object v13 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "TRAILER!!!";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    Object v11 = java.io.InputStream.nullInputStream();
    Object v12 = "u";
    Object v13 = true;
    Object v14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = java.io.OutputStream.nullOutputStream();
    Object v16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v15));
    Object v17 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v14),((org.apache.commons.compress.archivers.ArchiveOutputStream)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "Th";
    ((org.apache.commons.compress.changes.ChangeSet)v0).deleteDir(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "TRAILER!!!";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    Object v11 = java.io.InputStream.nullInputStream();
    Object v12 = "u";
    Object v13 = true;
    Object v14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new byte[]{Byte.valueOf((byte)-10),Byte.valueOf((byte)0),Byte.valueOf((byte)-13)};
    Object v16 = ((java.io.InputStream)v14).read(((byte[])v15));
    Object v17 = java.io.OutputStream.nullOutputStream();
    Object v18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v17));
    Object v19 = new byte[]{};
    ((java.io.OutputStream)v18).write(((byte[])v19));
    Object v20 = null;
    Object v21 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v14),((org.apache.commons.compress.archivers.ArchiveOutputStream)v18));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "UTF8";
    ((org.apache.commons.compress.changes.ChangeSet)v0).deleteDir(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "IBM437";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 1L;
    Object v9 = ((java.io.InputStream)v7).skip((((java.lang.Long)v8).longValue()));
    Object v10 = java.io.OutputStream.nullOutputStream();
    Object v11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v10));
    Object v12 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "Th";
    ((org.apache.commons.compress.changes.ChangeSet)v0).deleteDir(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "UTF8";
    ((org.apache.commons.compress.changes.ChangeSet)v0).deleteDir(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 1;
    Object v9 = ((java.io.InputStream)v7).readNBytes((((java.lang.Integer)v8).intValue()));
    Object v10 = java.io.OutputStream.nullOutputStream();
    Object v11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v10));
    Object v12 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "UTF8";
    ((org.apache.commons.compress.changes.ChangeSet)v0).deleteDir(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "+";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    Object v11 = java.io.InputStream.nullInputStream();
    Object v12 = "u";
    Object v13 = true;
    Object v14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new byte[]{Byte.valueOf((byte)31)};
    Object v16 = 7;
    Object v17 = -17;
    Object v18 = ((java.io.InputStream)v14).read(((byte[])v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = java.io.OutputStream.nullOutputStream();
    Object v20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v19));
    Object v21 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v14),((org.apache.commons.compress.archivers.ArchiveOutputStream)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "TRAILER!!!";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.io.InputStream)v7).readAllBytes();
    Object v9 = java.io.OutputStream.nullOutputStream();
    Object v10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v9));
    Object v11 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "TRAILER!!!";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    Object v11 = java.io.InputStream.nullInputStream();
    Object v12 = "u";
    Object v13 = true;
    Object v14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = java.io.OutputStream.nullOutputStream();
    Object v16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v15));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v16).finish();
    Object v17 = null;
    Object v18 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v14),((org.apache.commons.compress.archivers.ArchiveOutputStream)v16));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "Th";
    ((org.apache.commons.compress.changes.ChangeSet)v0).deleteDir(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    Object v11 = java.io.InputStream.nullInputStream();
    Object v12 = "u";
    Object v13 = true;
    Object v14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = java.io.OutputStream.nullOutputStream();
    Object v16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v15));
    Object v17 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v14),((org.apache.commons.compress.archivers.ArchiveOutputStream)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "TRAILER!!!";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((java.io.InputStream)v7).transferTo(((java.io.OutputStream)v9));
    Object v11 = java.io.OutputStream.nullOutputStream();
    Object v12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v11));
    Object v13 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "Th";
    ((org.apache.commons.compress.changes.ChangeSet)v0).deleteDir(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 1;
    Object v9 = ((java.io.InputStream)v7).readNBytes((((java.lang.Integer)v8).intValue()));
    Object v10 = java.io.OutputStream.nullOutputStream();
    Object v11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v10));
    Object v12 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "%";
    Object v2 = new java.util.jar.JarEntry(((java.lang.String)v1));
    Object v3 = new java.util.jar.JarEntry(((java.util.zip.ZipEntry)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.jar.JarEntry)v3));
    Object v5 = java.io.InputStream.nullInputStream();
    Object v6 = true;
    ((org.apache.commons.compress.changes.ChangeSet)v0).add(((org.apache.commons.compress.archivers.ArchiveEntry)v4),((java.io.InputStream)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "TRAILER!!!";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    Object v11 = java.io.InputStream.nullInputStream();
    Object v12 = "u";
    Object v13 = true;
    Object v14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new byte[]{Byte.valueOf((byte)-58)};
    Object v16 = -15;
    Object v17 = -29;
    Object v18 = ((java.io.InputStream)v14).read(((byte[])v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = java.io.OutputStream.nullOutputStream();
    Object v20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v19));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v20).finish();
    Object v21 = null;
    Object v22 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v14),((org.apache.commons.compress.archivers.ArchiveOutputStream)v20));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "TRAILER!!!";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v7).read();
    Object v9 = java.io.OutputStream.nullOutputStream();
    Object v10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v9));
    Object v11 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "IBM437";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2L;
    Object v9 = ((java.io.InputStream)v7).skip((((java.lang.Long)v8).longValue()));
    Object v10 = java.io.OutputStream.nullOutputStream();
    Object v11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v10));
    Object v12 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "%";
    Object v2 = new java.util.jar.JarEntry(((java.lang.String)v1));
    Object v3 = new java.util.jar.JarEntry(((java.util.zip.ZipEntry)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.jar.JarEntry)v3));
    Object v5 = java.io.InputStream.nullInputStream();
    Object v6 = true;
    ((org.apache.commons.compress.changes.ChangeSet)v0).add(((org.apache.commons.compress.archivers.ArchiveEntry)v4),((java.io.InputStream)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v9 = java.io.InputStream.nullInputStream();
    Object v10 = "u";
    Object v11 = true;
    Object v12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = java.io.OutputStream.nullOutputStream();
    Object v14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v13));
    Object v15 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v8).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v12),((org.apache.commons.compress.archivers.ArchiveOutputStream)v14));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "UTF8";
    ((org.apache.commons.compress.changes.ChangeSet)v0).deleteDir(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v9).finish();
    Object v10 = null;
    Object v11 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "Th";
    ((org.apache.commons.compress.changes.ChangeSet)v0).deleteDir(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((java.io.InputStream)v7).transferTo(((java.io.OutputStream)v9));
    Object v11 = java.io.OutputStream.nullOutputStream();
    Object v12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v11));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v12).finish();
    Object v13 = null;
    Object v14 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "Th";
    ((org.apache.commons.compress.changes.ChangeSet)v0).deleteDir(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.io.InputStream)v7).readAllBytes();
    Object v9 = java.io.OutputStream.nullOutputStream();
    Object v10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v9));
    Object v11 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "IBM437";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new byte[]{Byte.valueOf((byte)75),Byte.valueOf((byte)-14)};
    Object v9 = 15;
    Object v10 = 1;
    Object v11 = ((java.io.InputStream)v7).read(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = java.io.OutputStream.nullOutputStream();
    Object v13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v12));
    Object v14 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "$";
    ((org.apache.commons.compress.changes.ChangeSet)v0).deleteDir(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "TRAILER!!!";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 16;
    Object v9 = ((java.io.InputStream)v7).readNBytes((((java.lang.Integer)v8).intValue()));
    Object v10 = java.io.OutputStream.nullOutputStream();
    Object v11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v10));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v11).finish();
    Object v12 = null;
    Object v13 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "+";
    ((org.apache.commons.compress.changes.ChangeSet)v0).delete(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = ((java.io.InputStream)v7).transferTo(((java.io.OutputStream)v8));
    Object v10 = java.io.OutputStream.nullOutputStream();
    Object v11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v10));
    Object v12 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "$";
    ((org.apache.commons.compress.changes.ChangeSet)v0).deleteDir(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.compress.changes.ChangeSet();
    Object v1 = "$";
    ((org.apache.commons.compress.changes.ChangeSet)v0).deleteDir(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.changes.ChangeSetPerformer(((org.apache.commons.compress.changes.ChangeSet)v0));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = "u";
    Object v6 = true;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v8));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v9).finish();
    Object v10 = null;
    Object v11 = ((org.apache.commons.compress.changes.ChangeSetPerformer)v3).perform(((org.apache.commons.compress.archivers.ArchiveInputStream)v7),((org.apache.commons.compress.archivers.ArchiveOutputStream)v9));
    org.junit.Assert.assertNotNull(v11);
  }
}
