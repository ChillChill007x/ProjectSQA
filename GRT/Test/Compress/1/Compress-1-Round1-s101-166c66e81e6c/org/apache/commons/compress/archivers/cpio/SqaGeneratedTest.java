package org.apache.commons.compress.archivers.cpio;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "Found unspported compression method ";
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v2));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1)};
    Object v3 = 182;
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
    Object v2 = "Found unspported compression method ";
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v2));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v3));
    Object v4 = null;
    Object v5 = new byte[]{};
    Object v6 = 15;
    Object v7 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).closeArchiveEntry();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    Object v4 = new byte[]{};
    Object v5 = -11;
    Object v6 = 1;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "Found unspported compression method ";
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v2));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v3));
    Object v4 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).finish();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 22;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).close();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).finish();
    Object v2 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).finish();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)-4)};
    Object v3 = -57;
    Object v4 = 34;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).finish();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).close();
    Object v2 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).finish();
    Object v2 = null;
    Object v3 = "Found unspported compression method ";
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v3));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "Found unspported compression method ";
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v3));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v4));
    Object v5 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).finish();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)62);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((java.io.OutputStream)v1).flush();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
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
  public void test18() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "Found unspported compression method ";
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v2));
    Object v4 = 2L;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v3).setChksum((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v3));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1)};
    Object v3 = 2;
    Object v4 = 19;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-47),Byte.valueOf((byte)0)};
    Object v3 = 0;
    Object v4 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "Found unspported compression method ";
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveEntry)v3).isDirectory();
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).close();
    Object v2 = null;
    Object v3 = "Found unspported compression method ";
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v3));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    Object v3 = 1;
    Object v4 = -29;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)0)};
    Object v4 = -22;
    Object v5 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)52),Byte.valueOf((byte)33),Byte.valueOf((byte)1)};
    Object v3 = 1;
    Object v4 = -1;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "Found unspported compression method ";
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v2));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v3));
    Object v4 = null;
    Object v5 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-41),Byte.valueOf((byte)11),Byte.valueOf((byte)1)};
    Object v3 = 211;
    Object v4 = 2;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)-86),Byte.valueOf((byte)-11),Byte.valueOf((byte)72)};
    ((java.io.OutputStream)v2).write(((byte[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)1);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)32);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)1);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).finish();
    Object v4 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).finish();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "Found unspported compression method ";
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v2));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v3));
    Object v4 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).closeArchiveEntry();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)1);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    Object v4 = "Found unspported compression method ";
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v4));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v5));
    Object v6 = null;
    Object v7 = "Found unspported compression method ";
    Object v8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v7));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)1);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-41),Byte.valueOf((byte)1),Byte.valueOf((byte)-64)};
    ((java.io.OutputStream)v3).write(((byte[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)1);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    Object v4 = new byte[]{};
    Object v5 = 35;
    Object v6 = 1;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)1);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).closeArchiveEntry();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "Found unspported compression method ";
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v2));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v3));
    Object v4 = null;
    Object v5 = "Found unspported compression method ";
    Object v6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v5));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)1);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).finish();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)12)};
    Object v3 = 2;
    Object v4 = -66;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)1);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)-72)};
    Object v4 = 1;
    Object v5 = 1;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "Found unspported compression method ";
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v2));
    Object v4 = -56L;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v3).setGID((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v3));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 35;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "Found unspported compression method ";
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v3));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v4));
    Object v5 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).finish();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)1);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    Object v3 = -39;
    Object v4 = 954;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)3);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = -36;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 6;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).closeArchiveEntry();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)34)};
    Object v4 = 1;
    Object v5 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).close();
    Object v2 = null;
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)4)};
    Object v4 = 6;
    Object v5 = 560;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).finish();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "Found unspported compression method ";
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v2));
    Object v4 = 0L;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v3).setNumberOfLinks((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v3));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-14),Byte.valueOf((byte)0),Byte.valueOf((byte)42)};
    Object v3 = -26;
    Object v4 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)3),Byte.valueOf((byte)0)};
    Object v4 = 0;
    Object v5 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).closeArchiveEntry();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "Found unspported compression method ";
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v3));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)-36)};
    Object v4 = 60;
    Object v5 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1)};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 35;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v5 = new byte[]{Byte.valueOf((byte)5),Byte.valueOf((byte)0)};
    Object v6 = 2;
    Object v7 = 1;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v4).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-43),Byte.valueOf((byte)0)};
    Object v3 = -6;
    Object v4 = 3;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)1);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).finish();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 35;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v4).finish();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 2;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 2;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v4).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 2;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v6 = -71;
    Object v7 = 1;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v4).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 2;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v5 = new byte[]{Byte.valueOf((byte)8)};
    Object v6 = -23;
    Object v7 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v4).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 27;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).finish();
    Object v2 = null;
    Object v3 = new byte[]{Byte.valueOf((byte)48),Byte.valueOf((byte)48),Byte.valueOf((byte)1)};
    Object v4 = -34;
    Object v5 = 32;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 2;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v4).finish();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v3 = 43;
    Object v4 = 12;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)-2)};
    Object v3 = 0;
    Object v4 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 27;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v4).closeArchiveEntry();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 27;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v4).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 2;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v5 = "Found unspported compression method ";
    Object v6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v5));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v4).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v6));
    Object v7 = null;
    Object v8 = "Found unspported compression method ";
    Object v9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v8));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v4).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = -21;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 5;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 2;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v5 = Short.valueOf((short)2);
    Object v6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v4),(((java.lang.Short)v5).shortValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)8)};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 35;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v4).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-5)};
    Object v3 = 65;
    Object v4 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).finish();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 42;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new byte[]{Byte.valueOf((byte)24),Byte.valueOf((byte)30)};
    ((java.io.OutputStream)v1).write(((byte[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 1;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 35;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v5 = "Found unspported compression method ";
    Object v6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v5));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v4).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "Found unspported compression method ";
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v3));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v4));
    Object v5 = null;
    Object v6 = new byte[]{};
    Object v7 = 0;
    Object v8 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).write(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 45;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v2).closeArchiveEntry();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)17),Byte.valueOf((byte)-17)};
    Object v3 = 2;
    Object v4 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 2;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v5 = "Found unspported compression method ";
    Object v6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v5));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v4).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1)};
    Object v3 = 0;
    Object v4 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = Short.valueOf((short)0);
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v2),(((java.lang.Short)v3).shortValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 2;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v5 = Short.valueOf((short)2);
    Object v6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v4),(((java.lang.Short)v5).shortValue()));
    Object v7 = "Found unspported compression method ";
    Object v8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v7));
    Object v9 = 0L;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v8).setDeviceMaj((((java.lang.Long)v9).longValue()));
    Object v10 = null;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v6).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = Short.valueOf((short)1);
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1),(((java.lang.Short)v2).shortValue()));
    Object v4 = new byte[]{};
    ((java.io.OutputStream)v3).write(((byte[])v4));
    Object v5 = null;
    Object v6 = "Found unspported compression method ";
    Object v7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v6));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v3).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 2;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v5 = Short.valueOf((short)2);
    Object v6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v4),(((java.lang.Short)v5).shortValue()));
    Object v7 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v6).write((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 2;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v5 = Short.valueOf((short)2);
    Object v6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v4),(((java.lang.Short)v5).shortValue()));
    Object v7 = "Found unspported compression method ";
    Object v8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v7));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v6).putNextEntry(((org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 2;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(((java.io.OutputStream)v1));
    Object v5 = 0;
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v4).write((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = "Found unspported compression method ";
    Object v8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v7));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream)v4).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }
}
