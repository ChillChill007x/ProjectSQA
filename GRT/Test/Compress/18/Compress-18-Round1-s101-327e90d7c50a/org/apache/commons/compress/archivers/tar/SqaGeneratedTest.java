package org.apache.commons.compress.archivers.tar;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).setAddPaxHeadersForNonAsciiNames((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = "m";
    Object v7 = 33L;
    Object v8 = -46;
    Object v9 = 49;
    Object v10 = -21;
    Object v11 = 0L;
    Object v12 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(((java.lang.String)v6),(((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Long)v11).longValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "UTF";
    Object v5 = java.util.Map.of();
    Object v6 = ((java.util.Map)v5).hashCode();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).writePaxHeaders(((java.lang.String)v4),((java.util.Map)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).close();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{};
    Object v5 = -63;
    Object v6 = 1;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).finish();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v5 = 0;
    Object v6 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).closeArchiveEntry();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "No current enry to close";
    Object v5 = "archive's size exceeds the limit of 4GByte.";
    Object v6 = new java.io.File(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "07077";
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).getRecordSize();
    org.junit.Assert.assertEquals((Object)(148), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "No current enry to close";
    Object v5 = "archive's size exceeds the limit of 4GByte.";
    Object v6 = new java.io.File(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "filename too long, > 16 chars: ";
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 25;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).setLongFileMode((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).setLongFileMode((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).getBytesWritten();
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "/x";
    Object v5 = java.util.Map.of();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).writePaxHeaders(((java.lang.String)v4),((java.util.Map)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = " bytVs.";
    Object v5 = java.util.Map.of();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).writePaxHeaders(((java.lang.String)v4),((java.util.Map)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).finish();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 34;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).setBigNumberMode((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).finish();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "m";
    Object v3 = 33L;
    Object v4 = -46;
    Object v5 = 49;
    Object v6 = -21;
    Object v7 = 0L;
    Object v8 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(((java.lang.String)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Long)v7).longValue()));
    Object v9 = ((org.apache.commons.compress.archivers.ArchiveOutputStream)v1).canWriteEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25)};
    ((java.io.OutputStream)v0).write(((byte[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1)};
    Object v3 = 14;
    Object v4 = -3;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 0;
    Object v4 = 148;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "No current enry to close";
    Object v7 = "archive's size exceeds the limit of 4GByte.";
    Object v8 = new java.io.File(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "07077";
    Object v10 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v8),((java.lang.String)v9));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "m";
    Object v5 = 33L;
    Object v6 = -46;
    Object v7 = 49;
    Object v8 = -21;
    Object v9 = 0L;
    Object v10 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(((java.lang.String)v4),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Long)v9).longValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).close();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-16),Byte.valueOf((byte)36)};
    Object v3 = -70;
    Object v4 = 8;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)4)};
    Object v4 = 0;
    Object v5 = -10;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).flush();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = 0;
    Object v6 = 148;
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = "No current enry to close";
    Object v9 = "archive's size exceeds the limit of 4GByte.";
    Object v10 = new java.io.File(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "filename too long, > 16 chars: ";
    Object v12 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v7).createArchiveEntry(((java.io.File)v10),((java.lang.String)v11));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "No current enry to close";
    Object v4 = "archive's size exceeds the limit of 4GByte.";
    Object v5 = new java.io.File(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "request to write '";
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = -7;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setLongFileMode((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0)};
    Object v5 = 1;
    Object v6 = -9;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).closeArchiveEntry();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Major device number is out of` range: ";
    Object v5 = java.util.Map.of();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).writePaxHeaders(((java.lang.String)v4),((java.util.Map)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{};
    Object v5 = 0;
    Object v6 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -1;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)17),Byte.valueOf((byte)4),Byte.valueOf((byte)-32)};
    Object v5 = 92;
    Object v6 = 113;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).close();
    Object v2 = null;
    Object v3 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)-5),Byte.valueOf((byte)-30)};
    Object v4 = -7;
    Object v5 = -62;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = "";
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = 0;
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "No current enry to close";
    Object v8 = "archive's size exceeds the limit of 4GByte.";
    Object v9 = new java.io.File(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "request to write '";
    Object v11 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v6).createArchiveEntry(((java.io.File)v9),((java.lang.String)v10));
    Object v12 = ((org.apache.commons.compress.archivers.ArchiveEntry)v11).getName();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "K";
    Object v4 = java.util.Map.of();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((java.lang.String)v3),((java.util.Map)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).getRecordSize();
    org.junit.Assert.assertEquals((Object)(512), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).close();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = -34;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setBigNumberMode((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).flush();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{};
    ((java.io.OutputStream)v3).write(((byte[])v4));
    Object v5 = null;
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).getRecordSize();
    org.junit.Assert.assertEquals((Object)(148), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "No current enry to close";
    Object v5 = "archive's size exceeds the limit of 4GByte.";
    Object v6 = new java.io.File(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.io.File)v6).getFreeSpace();
    Object v8 = " bytes.";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v6),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "g";
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "m";
    Object v3 = 33L;
    Object v4 = -46;
    Object v5 = 49;
    Object v6 = -21;
    Object v7 = 0L;
    Object v8 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(((java.lang.String)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Long)v7).longValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "No current enry to close";
    Object v4 = "archive's size exceeds the limit of 4GByte.";
    Object v5 = new java.io.File(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "offs(";
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    Object v8 = "";
    Object v9 = java.util.Map.of();
    Object v10 = ((java.util.Map)v9).values();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((java.lang.String)v8),((java.util.Map)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Z";
    Object v5 = java.util.Map.of();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).writePaxHeaders(((java.lang.String)v4),((java.util.Map)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "Cou";
    Object v4 = java.util.Map.of();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((java.lang.String)v3),((java.util.Map)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "No current enry to close";
    Object v5 = "archive's size exceeds the limit of 4GByte.";
    Object v6 = new java.io.File(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.io.File)v6).exists();
    Object v8 = "i";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v6),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "No current enry to close";
    Object v5 = "archive's size exceeds the limit of 4GByte.";
    Object v6 = new java.io.File(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "TUTF-16LE";
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v6),((java.lang.String)v7));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).finish();
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 1;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "w";
    Object v5 = java.util.Map.of();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).writePaxHeaders(((java.lang.String)v4),((java.util.Map)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "No current enry to close";
    Object v3 = "archive's size exceeds the limit of 4GByte.";
    Object v4 = new java.io.File(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "/";
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).createArchiveEntry(((java.io.File)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).closeArchiveEntry();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = false;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setAddPaxHeadersForNonAsciiNames((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new byte[]{Byte.valueOf((byte)0)};
    Object v6 = 37;
    Object v7 = 17;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1)};
    Object v5 = 0;
    Object v6 = -19;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).getBytesWritten();
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 1;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "At offset ";
    Object v5 = java.util.Map.of();
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v6));
    Object v8 = "m";
    Object v9 = 33L;
    Object v10 = -46;
    Object v11 = 49;
    Object v12 = -21;
    Object v13 = 0L;
    Object v14 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(((java.lang.String)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Long)v13).longValue()));
    Object v15 = ((org.apache.commons.compress.archivers.ArchiveOutputStream)v7).canWriteEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v14));
    Object v16 = ((java.util.Map)v5).containsValue(((java.lang.Object)v15));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).writePaxHeaders(((java.lang.String)v4),((java.util.Map)v5));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 1;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = 0;
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "No current enry to close";
    Object v8 = "archive's size exceeds the limit of 4GByte.";
    Object v9 = new java.io.File(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "request to write '";
    Object v11 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v6).createArchiveEntry(((java.io.File)v9),((java.lang.String)v10));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "all reads must be multiple of record size (";
    Object v4 = java.util.Map.of();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((java.lang.String)v3),((java.util.Map)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 1;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).close();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).setBigNumberMode((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 1;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)-10)};
    Object v5 = 16;
    Object v6 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Stream has already been finished";
    Object v5 = java.util.Map.of();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).writePaxHeaders(((java.lang.String)v4),((java.util.Map)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).setAddPaxHeadersForNonAsciiNames((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).setLongFileMode((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 1;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)5),Byte.valueOf((byte)-2),Byte.valueOf((byte)-26)};
    Object v5 = 26;
    Object v6 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).getCount();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 0;
    Object v4 = 148;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "No current enry to close";
    Object v7 = "archive's size exceeds the limit of 4GByte.";
    Object v8 = new java.io.File(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((java.io.File)v8).getFreeSpace();
    Object v10 = " bytes.";
    Object v11 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v8),((java.lang.String)v10));
    Object v12 = ((org.apache.commons.compress.archivers.ArchiveEntry)v11).isDirectory();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 1;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 1;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1)};
    ((java.io.OutputStream)v3).write(((byte[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Zip64 extended information must ";
    Object v5 = java.util.Map.of();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).writePaxHeaders(((java.lang.String)v4),((java.util.Map)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).setAddPaxHeadersForNonAsciiNames((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = "TRAIL";
    Object v7 = java.util.Map.of();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).writePaxHeaders(((java.lang.String)v6),((java.util.Map)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "cp437";
    Object v4 = java.util.Map.of();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).writePaxHeaders(((java.lang.String)v3),((java.util.Map)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "No current enry to close";
    Object v4 = "archive's size exceeds the limit of 4GByte.";
    Object v5 = new java.io.File(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.io.File)v5).mkdir();
    Object v7 = "archive contains more thXn 65535 entries.";
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v5),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "No current enry to close";
    Object v4 = "archive's size exceeds the limit of 4GByte.";
    Object v5 = new java.io.File(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "Error parsing extra fields for entry: ";
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = 0;
    Object v10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = "No current enry to close";
    Object v12 = "archive's size exceeds the limit of 4GByte.";
    Object v13 = new java.io.File(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((java.io.File)v13).mkdir();
    Object v15 = "archive contains more thXn 65535 entries.";
    Object v16 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v10).createArchiveEntry(((java.io.File)v13),((java.lang.String)v15));
    Object v17 = ((org.apache.commons.compress.archivers.ArchiveEntry)v16).getName();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v16));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = false;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setAddPaxHeadersForNonAsciiNames((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "No current enry to close";
    Object v5 = "archive's size exceeds the limit of 4GByte.";
    Object v6 = new java.io.File(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "UKTF8";
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 1;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).finish();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).setBigNumberMode((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = "No current enry to close";
    Object v6 = "archive's size exceeds the limit of 4GByte.";
    Object v7 = new java.io.File(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "TRAILER!!!";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "No current enry to close";
    Object v5 = "archive's size exceeds the limit of 4GByte.";
    Object v6 = new java.io.File(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "ustar\u0000";
    Object v8 = ((org.apache.commons.compress.archivers.ArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v6),((java.lang.String)v7));
    Object v9 = -34;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v3).write((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).finish();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 1;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3));
    Object v5 = "No current enry to close";
    Object v6 = "archive's size exceeds the limit of 4GByte.";
    Object v7 = new java.io.File(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "Stream has already been finished";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).finish();
    Object v10 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "No current enry to close";
    Object v4 = "archive's size exceeds the limit of 4GByte.";
    Object v5 = new java.io.File(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "00";
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "m";
    Object v5 = 33L;
    Object v6 = -46;
    Object v7 = 49;
    Object v8 = -21;
    Object v9 = 0L;
    Object v10 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(((java.lang.String)v4),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Long)v9).longValue()));
    Object v11 = ((org.apache.commons.compress.archivers.ArchiveEntry)v10).getSize();
    Object v12 = ((org.apache.commons.compress.archivers.ArchiveOutputStream)v3).canWriteEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v10));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 1;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3));
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = 0;
    Object v7 = 148;
    Object v8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "No current enry to close";
    Object v10 = "archive's size exceeds the limit of 4GByte.";
    Object v11 = new java.io.File(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "UKTF8";
    Object v13 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v8).createArchiveEntry(((java.io.File)v11),((java.lang.String)v12));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "No current enry to close";
    Object v5 = "archive's size exceeds the limit of 4GByte.";
    Object v6 = new java.io.File(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.io.File)v6).getTotalSpace();
    Object v8 = "";
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v6),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1)};
    Object v5 = 8;
    Object v6 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).finish();
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "m";
    Object v4 = 33L;
    Object v5 = -46;
    Object v6 = 49;
    Object v7 = -21;
    Object v8 = 0L;
    Object v9 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(((java.lang.String)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Long)v8).longValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "No current enry to close";
    Object v3 = "archive's size exceeds the limit of 4GByte.";
    Object v4 = new java.io.File(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).createArchiveEntry(((java.io.File)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "UTF-8";
    Object v5 = java.util.Map.of();
    Object v6 = ((java.util.Map)v5).size();
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).writePaxHeaders(((java.lang.String)v4),((java.util.Map)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)0),Byte.valueOf((byte)-14)};
    Object v2 = 0;
    Object v3 = 0;
    ((java.io.OutputStream)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = "No current entry to close";
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "No current enry to close";
    Object v4 = "archive's size exceeds the limit of 4GByte.";
    Object v5 = new java.io.File(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "I";
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v2).finish();
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).finish();
    Object v2 = null;
    Object v3 = "No current enry to close";
    Object v4 = "archive's size exceeds the limit of 4GByte.";
    Object v5 = new java.io.File(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.io.File)v5).listFiles();
    Object v7 = "Y";
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v1).createArchiveEntry(((java.io.File)v5),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    Object v2 = 148;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = 0;
    Object v6 = 148;
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = "No current enry to close";
    Object v9 = "archive's size exceeds the limit of 4GByte.";
    Object v10 = new java.io.File(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((java.io.File)v10).exists();
    Object v12 = "i";
    Object v13 = ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v7).createArchiveEntry(((java.io.File)v10),((java.lang.String)v12));
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 1;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)14)};
    Object v6 = -23;
    Object v7 = 1;
    ((org.apache.commons.compress.archivers.tar.TarArchiveOutputStream)v4).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }
}
