package org.apache.commons.compress.archivers.cpio;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).finish();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new byte[]{};
    ((java.io.OutputStream)v0).write(((byte[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = "ustar ";
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "Zip64 extended information must contain both size values in te local file header.";
    Object v3 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v2));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "Archivername must not be null.";
    Object v3 = new java.io.File(((java.lang.String)v2));
    Object v4 = "UNKNOWN";
    Object v5 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).createArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).close();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)-1);
    Object v2 = 1;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).closeArchiveEntry();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 46;
    ((java.io.OutputStream)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = Short.valueOf((short)0);
    Object v4 = -52;
    Object v5 = "(' used in entry ";
    Object v6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v3).shortValue()),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-33),Byte.valueOf((byte)-38)};
    Object v3 = 0;
    Object v4 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Archivername must not be null.";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = false;
    Object v8 = ((java.io.File)v5).setReadable((((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ", dateTimeCreated=";
    Object v10 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v5),((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).closeArchiveEntry();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Zip64 extended information must contain both size values in te local file header.";
    Object v5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveEntry)v5).getName();
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -46;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).finish();
    Object v4 = null;
    Object v5 = new byte[]{Byte.valueOf((byte)11)};
    Object v6 = 11;
    Object v7 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).closeArchiveEntry();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)2);
    Object v5 = -4;
    Object v6 = "";
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveOutputStream)v3).getCount();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{};
    Object v5 = 28;
    Object v6 = -19;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Zip64 extended information must contain both size values in te local file header.";
    Object v5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveEntry)v5).getLastModifiedDate();
    Object v7 = ((org.apache.commons.compress.archivers.ArchiveOutputStream)v3).canWriteEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)3);
    Object v2 = 0;
    Object v3 = "The child ";
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 0;
    ((java.io.OutputStream)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = Short.valueOf((short)-3);
    Object v4 = 0;
    Object v5 = "Y\u0000";
    Object v6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v3).shortValue()),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).finish();
    Object v4 = null;
    Object v5 = "Zip64 extended information must contain both size values in te local file header.";
    Object v6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v5));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    Object v5 = "Zip64 extended information must contain both size values in te local file header.";
    Object v6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v5));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).finish();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Archivername must not be null.";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = "ISO-8859-1";
    Object v7 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    Object v5 = new byte[]{Byte.valueOf((byte)83)};
    Object v6 = -1;
    Object v7 = 8;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    Object v5 = "Archivername must not be null.";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v6),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Archivername must not be null.";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = "/";
    Object v7 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)3);
    Object v2 = -6;
    Object v3 = "No curren6t 7z entry";
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).finish();
    Object v4 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).finish();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Zip64 extended information must contain both size values in te local file header.";
    Object v5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveEntry)v5).isDirectory();
    Object v7 = ((org.apache.commons.compress.archivers.ArchiveOutputStream)v3).canWriteEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Archivername must not be null.";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = "Offset is larger than block size";
    Object v7 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    ((java.io.OutputStream)v0).flush();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)1);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)1);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)-14),Byte.valueOf((byte)-33),Byte.valueOf((byte)2)};
    Object v7 = 22;
    Object v8 = -11;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).write(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    Object v5 = "Archivername must not be null.";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = "TRAILER!!!";
    Object v8 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v6),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    Object v5 = new byte[]{Byte.valueOf((byte)5)};
    Object v6 = -28;
    Object v7 = -7;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)-1);
    Object v5 = 5;
    Object v6 = "";
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 2;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)0)};
    Object v5 = -52;
    Object v6 = 1;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)1);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
    Object v6 = "Zip64 extended information must contain both size values in te local file header.";
    Object v7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v6));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Archivername must not be null.";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = false;
    Object v7 = false;
    Object v8 = ((java.io.File)v5).setExecutable((((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "archive conta6ins more than 65535 entries.";
    Object v10 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v5),((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-38)};
    Object v5 = -1;
    Object v6 = 4;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)-21);
    Object v2 = -24;
    Object v3 = "/";
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-75),Byte.valueOf((byte)32),Byte.valueOf((byte)-8)};
    Object v5 = 0;
    Object v6 = 7;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-25),Byte.valueOf((byte)0)};
    Object v5 = -36;
    Object v6 = 1684;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Zip64 extended information must contain both size values in te local file header.";
    Object v5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v4));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)1);
    Object v5 = 2;
    Object v6 = "=";
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)1);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)1)};
    Object v7 = 2;
    Object v8 = 256;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).write(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)1);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
    Object v6 = "Zip64 extended information must contain both size values in te local file header.";
    Object v7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.compress.archivers.ArchiveEntry)v7).getName();
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((java.io.OutputStream)v1).flush();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{};
    Object v5 = 8;
    Object v6 = 7;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)0);
    Object v2 = 159;
    Object v3 = "/";
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = ", +xtendedHeaderBytes=";
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    Object v5 = "Archivername must not be null.";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = "/n";
    Object v8 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v6),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = -21;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Archivername must not be null.";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = "l";
    Object v7 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)0);
    Object v2 = 1;
    Object v3 = "G/";
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)1);
    Object v5 = 1;
    Object v6 = "8";
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = "/";
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "Archivername must not be null.";
    Object v3 = new java.io.File(((java.lang.String)v2));
    Object v4 = ((java.io.File)v3).getCanonicalFile();
    Object v5 = "=";
    Object v6 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).createArchiveEntry(((java.io.File)v3),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)3);
    Object v5 = 1426090617;
    Object v6 = "/";
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)1);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).closeArchiveEntry();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)0);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{};
    Object v5 = 0;
    Object v6 = 1;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-37),Byte.valueOf((byte)1),Byte.valueOf((byte)32)};
    Object v5 = -23;
    Object v6 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)32);
    Object v5 = 42;
    Object v6 = "070701";
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)1);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
    Object v6 = Short.valueOf((short)-24);
    Object v7 = 24;
    Object v8 = ".tar";
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v5),(((java.lang.Short)v6).shortValue()),(((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)1);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
    Object v6 = new byte[]{};
    ((java.io.OutputStream)v5).write(((byte[])v6));
    Object v7 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).closeArchiveEntry();
    Object v8 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Archivername must not be null.";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = "Mode 0 only allowed in te trailer. Found entry name: ";
    Object v7 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)1);
    Object v5 = -3;
    Object v6 = "Neer";
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).finish();
    Object v4 = null;
    Object v5 = new byte[]{};
    Object v6 = 0;
    Object v7 = -21;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)35);
    Object v2 = 23;
    Object v3 = "co0mons-compress";
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)1);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).close();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)1);
    Object v5 = 1;
    Object v6 = "8";
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = Short.valueOf((short)-11);
    Object v9 = 1;
    Object v10 = ")";
    Object v11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v7),(((java.lang.Short)v8).shortValue()),(((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Archivername must not be null.";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = "len(";
    Object v7 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).finish();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    Object v5 = "Archivername must not be null.";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = "compressionElaps=d=";
    Object v8 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v6),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)1);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
    Object v6 = "Archivername must not be null.";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "+TF-16BE";
    Object v9 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).createArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()));
    Object v3 = new byte[]{};
    ((java.io.OutputStream)v2).write(((byte[])v3));
    Object v4 = null;
    Object v5 = "Archivername must not be null.";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v6),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)-4),Byte.valueOf((byte)1)};
    Object v4 = -30;
    Object v5 = 32;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v1).finish();
    Object v2 = null;
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveOutputStream)v1).getBytesWritten();
    org.junit.Assert.assertEquals((Object)(512L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)1);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
    Object v6 = 150;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v5).write((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)2);
    Object v5 = 72;
    Object v6 = "Mark is not supported.";
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).finish();
    Object v3 = null;
    Object v4 = "Zip64 extended information must contain both size values in te local file header.";
    Object v5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v4));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveOutputStream)v3).getBytesWritten();
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).finish();
    Object v4 = null;
    Object v5 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0),Byte.valueOf((byte)-10)};
    Object v6 = 113;
    Object v7 = -10;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).closeArchiveEntry();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).finish();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)-39),Byte.valueOf((byte)30)};
    Object v4 = -30;
    Object v5 = 1;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)1);
    Object v5 = -3;
    Object v6 = "Neer";
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = Short.valueOf((short)1);
    Object v9 = 2;
    Object v10 = "Stream has already been fini";
    Object v11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v7),(((java.lang.Short)v8).shortValue()),(((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = -12;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = Short.valueOf((short)9);
    Object v5 = 222;
    Object v6 = "Failed to read complete // record";
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)1);
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }
}
