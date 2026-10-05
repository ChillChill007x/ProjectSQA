package org.apache.commons.compress.archivers.tar;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "len(";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveEntry)v4).getSize();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v4));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)26),Byte.valueOf((byte)15)};
    Object v4 = 0;
    Object v5 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).finish();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 40;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setLongFileMode((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new byte[]{Byte.valueOf((byte)-12),Byte.valueOf((byte)-12)};
    Object v6 = -6;
    Object v7 = 4;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)32)};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).closeArchiveEntry();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).flush();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "len(";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v3));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = -16;
    Object v3 = 13;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = ((java.io.File)v5).canWrite();
    Object v7 = "f";
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v5),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setLongFileMode((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new byte[]{};
    Object v6 = 28;
    Object v7 = 1;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = -1;
    Object v3 = 8;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = "TRAILER!!!";
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v4),((java.lang.String)v5));
    Object v7 = "len(";
    Object v8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v7));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = -21;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1)};
    Object v5 = -1824608069;
    Object v6 = 264;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "len(";
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveEntry)v5).getSize();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).closeArchiveEntry();
    Object v3 = null;
    Object v4 = new byte[]{Byte.valueOf((byte)-41),Byte.valueOf((byte)45),Byte.valueOf((byte)1)};
    Object v5 = 128;
    Object v6 = 1;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).closeArchiveEntry();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-9)};
    Object v5 = 469;
    Object v6 = 5;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 204;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "len(";
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveEntry)v5).getName();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = "userid too long";
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)76),Byte.valueOf((byte)1),Byte.valueOf((byte)8)};
    Object v5 = 0;
    Object v6 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = "len(";
    Object v9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v8));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 204;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).flush();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = -8;
    Object v3 = -2;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 204;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{};
    Object v4 = 14;
    Object v5 = 10;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).finish();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 1;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setLongFileMode((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = "len(";
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v5));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "len(";
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v4));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).closeArchiveEntry();
    Object v4 = null;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).finish();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 18;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setLongFileMode((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 204;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).closeArchiveEntry();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)1)};
    Object v5 = 0;
    Object v6 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "len(";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveEntry)v4).getName();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v4));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).getRecordSize();
    org.junit.Assert.assertEquals((Object)(512), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)-35)};
    Object v4 = -6;
    Object v5 = -10;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).finish();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 56;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)0)};
    Object v4 = 27;
    Object v5 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = "!";
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v4),((java.lang.String)v5));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).closeArchiveEntry();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 204;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)1)};
    Object v4 = 0;
    Object v5 = -16;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = 31;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 204;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).finish();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = "";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = "ustar\u0000";
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).finish();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).closeArchiveEntry();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = -2;
    Object v3 = 13;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = "len(";
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v4));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = 1;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v5 = 1;
    Object v6 = 1;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = "";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = "U";
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).closeArchiveEntry();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)15)};
    Object v5 = 66;
    Object v6 = 255;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 204;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = -18;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).setLongFileMode((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).finish();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).finish();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = 2;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = 2;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v4).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).finish();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = 2;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v4).intValue()));
    Object v6 = new byte[]{};
    Object v7 = 21;
    Object v8 = 21;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).write(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = 2;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v4).intValue()));
    Object v6 = "len(";
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v6));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = 0;
    Object v5 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v4).intValue()));
    Object v6 = 16;
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = new java.io.File(((java.lang.String)v8));
    Object v10 = ((java.io.File)v9).canWrite();
    Object v11 = "f";
    Object v12 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v7).createArchiveEntry(((java.io.File)v9),((java.lang.String)v11));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = -10;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).setLongFileMode((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = 2;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v4).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0)};
    Object v5 = 0;
    Object v6 = 1;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)5),Byte.valueOf((byte)1),Byte.valueOf((byte)-7)};
    Object v5 = 0;
    Object v6 = 2;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = 16;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)6),Byte.valueOf((byte)27)};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = 2;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v6).intValue()));
    Object v8 = 16;
    Object v9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = "";
    Object v11 = new java.io.File(((java.lang.String)v10));
    Object v12 = "userid too long";
    Object v13 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v9).createArchiveEntry(((java.io.File)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.compress.archivers.ArchiveEntry)v13).isDirectory();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-12)};
    Object v5 = -1;
    Object v6 = 1;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = 2;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v4).intValue()));
    Object v6 = new byte[]{};
    ((java.io.OutputStream)v5).write(((byte[])v6));
    Object v7 = null;
    Object v8 = "len(";
    Object v9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v8));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = 2;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v4).intValue()));
    Object v6 = 60;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).setLongFileMode((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).closeArchiveEntry();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = "";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).closeArchiveEntry();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)1),Byte.valueOf((byte)8)};
    Object v5 = -23;
    Object v6 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).flush();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 40;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).setLongFileMode((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = 2;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = "X";
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 204;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)0)};
    Object v4 = 32;
    Object v5 = 1;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = "";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = "+UTF8";
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).finish();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)-43),Byte.valueOf((byte)75)};
    Object v5 = 51;
    Object v6 = 14;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = new byte[]{};
    Object v5 = -25;
    Object v6 = 177;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = 1;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).setLongFileMode((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = "";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = ((java.io.File)v5).getTotalSpace();
    Object v7 = "This archives contains unclosed entries.";
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v5),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = 16;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = " \u0000";
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).finish();
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = 2;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v4).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).flush();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)1)};
    Object v5 = -10;
    Object v6 = -58;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = 2;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v7));
    Object v9 = "";
    Object v10 = new java.io.File(((java.lang.String)v9));
    Object v11 = "X";
    Object v12 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v8).createArchiveEntry(((java.io.File)v10),((java.lang.String)v11));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = 2;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v4).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).close();
    Object v6 = null;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).closeArchiveEntry();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = 2;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-58)};
    Object v7 = 0;
    Object v8 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).write(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = 2;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v4).intValue()));
    Object v6 = new byte[]{};
    Object v7 = 0;
    Object v8 = 22;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).write(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = 2;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "len(";
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v6));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = 2;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v4).intValue()));
    Object v6 = "";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "Header format: ";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).close();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }
}
