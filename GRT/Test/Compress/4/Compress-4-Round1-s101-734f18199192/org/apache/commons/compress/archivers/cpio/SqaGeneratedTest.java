package org.apache.commons.compress.archivers.cpio;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "/";
    Object v3 = new java.util.zip.ZipEntry(((java.lang.String)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.zip.ZipEntry)v3));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-1),Byte.valueOf((byte)1)};
    Object v3 = -1;
    Object v4 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).finish();
    Object v2 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).closeArchiveEntry();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).finish();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-17),Byte.valueOf((byte)38),Byte.valueOf((byte)1)};
    Object v3 = 1;
    Object v4 = 9525;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)32)};
    Object v3 = 0;
    Object v4 = 212;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).close();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)0);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "/";
    Object v3 = new java.util.zip.ZipEntry(((java.lang.String)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.zip.ZipEntry)v3));
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveEntry)v4).isDirectory();
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v4));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)4);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)4);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).closeArchiveEntry();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)4);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    Object v4 = Short.valueOf((short)6);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)46),Byte.valueOf((byte)64),Byte.valueOf((byte)0)};
    Object v3 = -25;
    Object v4 = 1;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    Object v3 = 0;
    Object v4 = 23;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 4;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)4);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    Object v4 = "/";
    Object v5 = new java.util.zip.ZipEntry(((java.lang.String)v4));
    Object v6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.zip.ZipEntry)v5));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)72);
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new byte[]{};
    ((java.io.OutputStream)v0).write(((byte[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)4);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    Object v4 = "Compresso: ";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = ((java.io.File)v5).exists();
    Object v7 = "";
    Object v8 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v5),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).closeArchiveEntry();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)4);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).finish();
    Object v2 = null;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)2)};
    Object v4 = -11;
    Object v5 = -1;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = Short.valueOf((short)4);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v4).shortValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)3)};
    ((java.io.OutputStream)v0).write(((byte[])v1));
    Object v2 = null;
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)15)};
    ((java.io.OutputStream)v0).write(((byte[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).close();
    Object v2 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).closeArchiveEntry();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).close();
    Object v2 = null;
    Object v3 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)1),Byte.valueOf((byte)16)};
    Object v4 = 0;
    Object v5 = 14;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    Object v3 = -4;
    Object v4 = 240578815;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).close();
    Object v2 = null;
    Object v3 = new byte[]{Byte.valueOf((byte)-89)};
    Object v4 = 184;
    Object v5 = 2;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).close();
    Object v2 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).finish();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = Short.valueOf((short)4);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v4).shortValue()));
    Object v6 = "/";
    Object v7 = new java.util.zip.ZipEntry(((java.lang.String)v6));
    Object v8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.zip.ZipEntry)v7));
    Object v9 = ((org.apache.commons.compress.archivers.ArchiveEntry)v8).isDirectory();
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)4);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    Object v4 = new byte[]{};
    Object v5 = -23;
    Object v6 = 62;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)6),Byte.valueOf((byte)0),Byte.valueOf((byte)24)};
    Object v4 = 0;
    Object v5 = 525;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).finish();
    Object v2 = null;
    Object v3 = "/";
    Object v4 = new java.util.zip.ZipEntry(((java.lang.String)v3));
    Object v5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.zip.ZipEntry)v4));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveEntry)v5).isDirectory();
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = Short.valueOf((short)4);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v4).shortValue()));
    Object v6 = new byte[]{};
    ((java.io.OutputStream)v5).write(((byte[])v6));
    Object v7 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).closeArchiveEntry();
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).closeArchiveEntry();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).finish();
    Object v2 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).finish();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "/";
    Object v3 = new java.util.zip.ZipEntry(((java.lang.String)v2));
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.zip.ZipEntry)v3));
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveEntry)v4).getName();
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v4));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "Compresso: ";
    Object v3 = new java.io.File(((java.lang.String)v2));
    Object v4 = "failed tocread entry header. Occured at byte: ";
    Object v5 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).createArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).finish();
    Object v2 = null;
    Object v3 = "Compresso: ";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = ((java.io.File)v4).canExecute();
    Object v6 = "L";
    Object v7 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).createArchiveEntry(((java.io.File)v4),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v2));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)4);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    Object v4 = 0;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 13;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v2));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    Object v5 = "/";
    Object v6 = new java.util.zip.ZipEntry(((java.lang.String)v5));
    Object v7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.zip.ZipEntry)v6));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = Short.valueOf((short)22);
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0),(((java.lang.Short)v1).shortValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = Short.valueOf((short)4);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v4).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).close();
    Object v6 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).finish();
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)4);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    Object v4 = Short.valueOf((short)33);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v2));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).closeArchiveEntry();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-8),Byte.valueOf((byte)0),Byte.valueOf((byte)13)};
    Object v3 = -25;
    Object v4 = 1;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = Short.valueOf((short)0);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).finish();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)4);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    Object v4 = Short.valueOf((short)-62);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)-6);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)4);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)15)};
    Object v5 = 3;
    Object v6 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = Short.valueOf((short)4);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v4).shortValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)48),Byte.valueOf((byte)-10)};
    Object v7 = 8;
    Object v8 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).write(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-22),Byte.valueOf((byte)1)};
    Object v3 = 6;
    Object v4 = 3;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v2));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).finish();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = Short.valueOf((short)4);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v4).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).closeArchiveEntry();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 1;
    ((java.io.OutputStream)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new byte[]{Byte.valueOf((byte)-13)};
    ((java.io.OutputStream)v0).write(((byte[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = Short.valueOf((short)1);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)4);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).closeArchiveEntry();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = Short.valueOf((short)1);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).closeArchiveEntry();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)4);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = Short.valueOf((short)4);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v4).shortValue()));
    ((java.io.OutputStream)v5).flush();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = Short.valueOf((short)4);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v4).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).close();
    Object v6 = null;
    Object v7 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)11),Byte.valueOf((byte)0)};
    Object v8 = -40;
    Object v9 = 1;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).write(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).finish();
    Object v2 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v2));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-57)};
    Object v6 = 523;
    Object v7 = 1;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).close();
    Object v3 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).closeArchiveEntry();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)4);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    Object v4 = Short.valueOf((short)42);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)27)};
    ((java.io.OutputStream)v0).write(((byte[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = Short.valueOf((short)315);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = new byte[]{};
    ((java.io.OutputStream)v3).write(((byte[])v4));
    Object v5 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)4);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)8)};
    Object v5 = 1;
    Object v6 = 1;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-8)};
    Object v3 = -35;
    Object v4 = -35;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = Short.valueOf((short)4);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v4).shortValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)-30)};
    Object v7 = 1;
    Object v8 = 20;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).write(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)-1);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)6)};
    Object v6 = 0;
    Object v7 = -3;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v4).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = Short.valueOf((short)4);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v4).shortValue()));
    Object v6 = new byte[]{};
    Object v7 = 0;
    Object v8 = -22;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).write(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v5 = new byte[]{};
    Object v6 = 8;
    Object v7 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v4).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    ((java.io.OutputStream)v0).flush();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = Short.valueOf((short)1);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).finish();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v5 = new byte[]{};
    ((java.io.OutputStream)v4).write(((byte[])v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v2));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).closeArchiveEntry();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = "/";
    Object v5 = new java.util.zip.ZipEntry(((java.lang.String)v4));
    Object v6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.util.zip.ZipEntry)v5));
    Object v7 = ((org.apache.commons.compress.archivers.ArchiveEntry)v6).isDirectory();
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = -19;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)4);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).finish();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = Short.valueOf((short)1);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-34)};
    Object v7 = 0;
    Object v8 = -24;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).write(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v5 = new byte[]{};
    ((java.io.OutputStream)v4).write(((byte[])v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v4));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v7).finish();
    Object v8 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = "Compresso: ";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = ((java.io.File)v5).getAbsolutePath();
    Object v7 = "Y";
    Object v8 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).createArchiveEntry(((java.io.File)v5),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)30),Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v5 = 0;
    Object v6 = 6;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)4);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    Object v4 = Short.valueOf((short)-21);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = Short.valueOf((short)1);
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v3),(((java.lang.Short)v4).shortValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)-15),Byte.valueOf((byte)54),Byte.valueOf((byte)15)};
    Object v7 = 24;
    Object v8 = 142;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v5).write(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v4).closeArchiveEntry();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)12);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v5 = new byte[]{};
    ((java.io.OutputStream)v4).write(((byte[])v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v4));
    Object v8 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v9 = 1;
    Object v10 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v7).write(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v7).finish();
    Object v12 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }
}
