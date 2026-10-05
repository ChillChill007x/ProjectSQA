package org.apache.commons.compress.archivers.tar;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "bad block header";
    Object v4 = Byte.valueOf((byte)0);
    Object v5 = true;
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v3),(((java.lang.Byte)v4).byteValue()),(((java.lang.Boolean)v5).booleanValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v6));
    Object v7 = null;
    Object v8 = "bad block header";
    Object v9 = Byte.valueOf((byte)0);
    Object v10 = true;
    Object v11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v8),(((java.lang.Byte)v9).byteValue()),(((java.lang.Boolean)v10).booleanValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)-56),Byte.valueOf((byte)-37),Byte.valueOf((byte)1)};
    Object v4 = 0;
    Object v5 = -3;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "SOCKET";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = "record to write has length '";
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)1)};
    Object v4 = 0;
    Object v5 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setLongFileMode((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).finish();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).getCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "SOCKET";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "bad block header";
    Object v4 = Byte.valueOf((byte)0);
    Object v5 = true;
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v3),(((java.lang.Byte)v4).byteValue()),(((java.lang.Boolean)v5).booleanValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v6));
    Object v7 = null;
    Object v8 = 10;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setLongFileMode((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).closeArchiveEntry();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "SOCKET";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = "././@LngLink";
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v4),((java.lang.String)v5));
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = 26;
    Object v9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = "SOCKET";
    Object v11 = new java.io.File(((java.lang.String)v10));
    Object v12 = "record to write has length '";
    Object v13 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v9).createArchiveEntry(((java.io.File)v11),((java.lang.String)v12));
    Object v14 = "/";
    Object v15 = new java.util.TreeMap();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v13),((java.lang.String)v14),((java.util.Map)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).finish();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 26;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "record to write has length '";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    Object v10 = ((org.apache.commons.compress.archivers.ArchiveOutputStream)v2).canWriteEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{};
    Object v4 = 2;
    Object v5 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 6;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setBigNumberMode((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).finish();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 12;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).closeArchiveEntry();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).setAddPaxHeadersForNonAsciiNames((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).finish();
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 26;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "record to write has length '";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    Object v10 = "invalid entry size (expected ";
    Object v11 = new java.util.TreeMap();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v9),((java.lang.String)v10),((java.util.Map)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "SOCKET";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = "Stream has already been finished";
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 26;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "Stream has already been finished";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    Object v10 = "TRAIER!!!";
    Object v11 = new java.util.TreeMap();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v9),((java.lang.String)v10),((java.util.Map)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 98;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setBigNumberMode((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).close();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 12;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    Object v10 = "!<arch>\n";
    Object v11 = new java.util.TreeMap();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v9),((java.lang.String)v10),((java.util.Map)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = "SOCKET";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = "no current CPIO entry";
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).createArchiveEntry(((java.io.File)v6),((java.lang.String)v7));
    Object v9 = "SOCKET";
    Object v10 = new java.io.File(((java.lang.String)v9));
    Object v11 = ((java.io.File)v10).getParent();
    Object v12 = "unexpected EOF";
    Object v13 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).createArchiveEntry(((java.io.File)v10),((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)-1)};
    Object v4 = 1328;
    Object v5 = -26;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = new byte[]{Byte.valueOf((byte)-45)};
    Object v6 = 0;
    Object v7 = 30;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)-19),Byte.valueOf((byte)1)};
    ((java.io.OutputStream)v0).write(((byte[])v1));
    Object v2 = null;
    Object v3 = new byte[]{Byte.valueOf((byte)-27)};
    ((java.io.OutputStream)v0).write(((byte[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).close();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setBigNumberMode((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = "bad block header";
    Object v6 = Byte.valueOf((byte)0);
    Object v7 = true;
    Object v8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v5),(((java.lang.Byte)v6).byteValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "Multi input/output stream coders are not yet supporteT";
    Object v10 = new java.util.TreeMap();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v8),((java.lang.String)v9),((java.util.Map)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "bad block header";
    Object v4 = Byte.valueOf((byte)0);
    Object v5 = true;
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v3),(((java.lang.Byte)v4).byteValue()),(((java.lang.Boolean)v5).booleanValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).finish();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).getCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).closeArchiveEntry();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).flush();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v4 = 0;
    Object v5 = 1;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 26;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "record to write has length '";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    Object v10 = ".";
    Object v11 = new java.util.TreeMap();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v9),((java.lang.String)v10),((java.util.Map)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "SOCKET";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = "Compressor name and stream must not be null.";
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "SOCKET";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = "<";
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v4),((java.lang.String)v5));
    Object v7 = true;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setAddPaxHeadersForNonAsciiNames((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = 26;
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = "SOCKET";
    Object v9 = new java.io.File(((java.lang.String)v8));
    Object v10 = "record to write has length '";
    Object v11 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v7).createArchiveEntry(((java.io.File)v9),((java.lang.String)v10));
    Object v12 = ((org.apache.commons.compress.archivers.ArchiveOutputStream)v4).canWriteEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 12;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "Compressor name and stream must not be null.";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    Object v10 = "Stre";
    Object v11 = new java.util.TreeMap();
    Object v12 = java.io.OutputStream.nullOutputStream();
    Object v13 = 26;
    Object v14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v14).getCount();
    Object v16 = java.util.function.Function.identity();
    Object v17 = ((java.util.Map)v11).computeIfAbsent(((java.lang.Object)v15),((java.util.function.Function)v16));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v9),((java.lang.String)v10),((java.util.Map)v11));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = -42;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setLongFileMode((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = false;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setAddPaxHeadersForNonAsciiNames((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).getRecordSize();
    org.junit.Assert.assertEquals((Object)(512), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "SOCKET";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = "FATAL: UTF-8 encoding not supported.";
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).close();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 26;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "FATAL: UTF-8 encoding not supported.";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "SOCKET";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = "TUTF-16BE";
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v4),((java.lang.String)v5));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).finish();
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 26;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "FATAL: UTF-8 encoding not supported.";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    Object v10 = "/";
    Object v11 = new java.util.TreeMap();
    Object v12 = ((java.util.Map)v11).entrySet();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v9),((java.lang.String)v10),((java.util.Map)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "`\n";
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "SOCKET";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = "BCJ_PPC_FILTER";
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = -1;
    Object v4 = "UTLF-8";
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = -7;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = -7;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = false;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setAddPaxHeadersForNonAsciiNames((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).getBytesWritten();
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = -7;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setLongFileMode((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).setLongFileMode((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).close();
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = false;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setAddPaxHeadersForNonAsciiNames((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = 26;
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = "SOCKET";
    Object v9 = new java.io.File(((java.lang.String)v8));
    Object v10 = "record to write has length '";
    Object v11 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v7).createArchiveEntry(((java.io.File)v9),((java.lang.String)v10));
    Object v12 = ".taF";
    Object v13 = new java.util.TreeMap();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v11),((java.lang.String)v12),((java.util.Map)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).getRecordSize();
    org.junit.Assert.assertEquals((Object)(512), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).getBytesWritten();
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 12;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    Object v10 = ((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v9).hashCode();
    Object v11 = "70707";
    Object v12 = new java.util.TreeMap();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v9),((java.lang.String)v11),((java.util.Map)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "J";
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).finish();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = -7;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 12;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "Compressor name and stream must not be null.";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = new java.util.TreeMap();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v9),((java.lang.String)v10),((java.util.Map)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 5;
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).setAddPaxHeadersForNonAsciiNames((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).closeArchiveEntry();
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 2;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setLongFileMode((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 26;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = "SOCKET";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = "BCJ_PPC_FILTER";
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).createArchiveEntry(((java.io.File)v6),((java.lang.String)v7));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 26;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "FATAL: UTF-8 encoding not supported.";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    Object v10 = ((org.apache.commons.compress.archivers.ArchiveOutputStream)v2).canWriteEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = 21;
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v4),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = -54;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).setBigNumberMode((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = -7;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).finish();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = -7;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "SOCKET";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = ((java.io.File)v4).isDirectory();
    Object v6 = " read=";
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v4),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = -7;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = ((java.io.File)v7).isDirectory();
    Object v9 = " read=";
    Object v10 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v9));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v10));
    Object v11 = null;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).closeArchiveEntry();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = 26;
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = "SOCKET";
    Object v11 = new java.io.File(((java.lang.String)v10));
    Object v12 = "no current CPIO entry";
    Object v13 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v9).createArchiveEntry(((java.io.File)v11),((java.lang.String)v12));
    Object v14 = "SOCKET";
    Object v15 = new java.io.File(((java.lang.String)v14));
    Object v16 = ((java.io.File)v15).getParent();
    Object v17 = "unexpected EOF";
    Object v18 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v9).createArchiveEntry(((java.io.File)v15),((java.lang.String)v17));
    Object v19 = "EXPANDING_LEVEL_1";
    Object v20 = new java.util.TreeMap();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).writePaxHeaders(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v18),((java.lang.String)v19),((java.util.Map)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 12;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "Compressor name and stream must not be null.";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    Object v10 = ((org.apache.commons.compress.archivers.ArchiveEntry)v9).getLastModifiedDate();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = -7;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = ((java.io.File)v7).isDirectory();
    Object v9 = " read=";
    Object v10 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v9));
    Object v11 = "]";
    Object v12 = new java.util.TreeMap();
    Object v13 = "070702";
    Object v14 = new java.net.URI(((java.lang.String)v13));
    Object v15 = ((java.util.Map)v12).remove(((java.lang.Object)v14));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v10),((java.lang.String)v11),((java.util.Map)v12));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = -7;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 26;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "FATAL: UTF-8 encoding not supported.";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    Object v10 = ((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v9).isGNULongLinkEntry();
    Object v11 = "TRAILER!!!";
    Object v12 = new java.util.TreeMap();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v9),((java.lang.String)v11),((java.util.Map)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 26;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "record to write has length '";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v9));
    Object v10 = null;
    Object v11 = java.io.OutputStream.nullOutputStream();
    Object v12 = 26;
    Object v13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = "SOCKET";
    Object v15 = new java.io.File(((java.lang.String)v14));
    Object v16 = "record to write has length '";
    Object v17 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v13).createArchiveEntry(((java.io.File)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.compress.archivers.ArchiveEntry)v17).getSize();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v17));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setLongFileMode((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = "SOCKET";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = ((java.io.File)v6).toPath();
    Object v8 = "This archive has already been finished";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v6),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "J";
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),((java.lang.String)v3));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).flush();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{};
    ((java.io.OutputStream)v2).write(((byte[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 12;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "Compressor name and stream must not be null.";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v9));
    Object v10 = null;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).finish();
    Object v11 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).close();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = 20;
    Object v5 = "filenamy too long, > 16 chars: ";
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = -7;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = true;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setAddPaxHeadersForNonAsciiNames((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 26;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "FATAL: UTF-8 encoding not supported.";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    Object v10 = "This archive has already been finished";
    Object v11 = new java.util.TreeMap();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v9),((java.lang.String)v10),((java.util.Map)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-49)};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).finish();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).getBytesWritten();
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 12;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "Compressor name and stream must not be null.";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 12;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SOCKET";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "Compressor name and stream must not be null.";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    Object v10 = ", minVersionToExtract=";
    Object v11 = new java.util.TreeMap();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v9),((java.lang.String)v10),((java.util.Map)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).closeArchiveEntry();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = -20;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 26;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = -20;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).close();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }
}
