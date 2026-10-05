package org.apache.commons.compress.archivers.cpio;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).getNextCPIOEntry();
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).close();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)35),Byte.valueOf((byte)1)};
    Object v1 = 22;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).read();
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).available();
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).read();
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-16),Byte.valueOf((byte)13),Byte.valueOf((byte)0)};
    Object v3 = 2;
    Object v4 = 6;
    Object v5 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = -14;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = 4;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).close();
    Object v2 = null;
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).getNextCPIOEntry();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-11)};
    Object v2 = 2;
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)8)};
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 14L;
    Object v7 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).skip((((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-1)};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{};
    Object v3 = 2;
    Object v4 = 0;
    Object v5 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).close();
    Object v2 = null;
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).available();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)27)};
    Object v1 = -15;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-6),Byte.valueOf((byte)1)};
    Object v3 = ((java.io.InputStream)v1).read(((byte[])v2));
    Object v4 = ((java.io.InputStream)v1).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)50)};
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = "Garbage after a valid gz stream";
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -13L;
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)22),Byte.valueOf((byte)9),Byte.valueOf((byte)0)};
    Object v3 = -5;
    Object v4 = -15;
    Object v5 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).getBytesRead();
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0)};
    Object v3 = 1;
    Object v4 = -49;
    Object v5 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).available();
    Object v3 = 1L;
    Object v4 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).skip((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 30;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    Object v4 = 29;
    ((java.io.InputStream)v1).mark((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 16;
    ((java.io.InputStream)v1).mark((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).getNextCPIOEntry();
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = -42;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 255;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)11)};
    Object v3 = 1;
    Object v4 = -15;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    Object v4 = new byte[]{};
    Object v5 = -66;
    Object v6 = -39;
    Object v7 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 28;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 8;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = -9;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 1;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0L;
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v3 = 0;
    Object v4 = -28;
    Object v5 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).getNextEntry();
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-8),Byte.valueOf((byte)-1)};
    Object v3 = ((java.io.InputStream)v1).read(((byte[])v2));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)19)};
    Object v3 = ((java.io.InputStream)v1).read(((byte[])v2));
    Object v4 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).available();
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 4L;
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).getBytesRead();
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).available();
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).close();
    Object v3 = null;
    Object v4 = new byte[]{Byte.valueOf((byte)45)};
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = -54;
    Object v4 = "path";
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).getNextEntry();
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((java.io.InputStream)v2).readAllBytes();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0)};
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = -54;
    Object v4 = "path";
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v5).close();
    Object v6 = null;
    Object v7 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v5).getNextCPIOEntry();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = "";
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).read();
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 62L;
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-16)};
    Object v3 = 39;
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)17)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-3),Byte.valueOf((byte)0)};
    Object v1 = 48;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    Object v2 = "TRAIL:ER!!!";
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    ((java.io.InputStream)v0).reset();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).getCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).available();
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).available();
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 11;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-40)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)10),Byte.valueOf((byte)0)};
    Object v2 = 1;
    Object v3 = -13;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 0;
    ((java.io.OutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)8)};
    Object v2 = 28;
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).read();
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 10;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).close();
    Object v2 = null;
    Object v3 = new byte[]{Byte.valueOf((byte)5)};
    Object v4 = 0;
    Object v5 = 10;
    Object v6 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 1;
    Object v2 = "premature end ofstream";
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -25;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).read();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).read();
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-58),Byte.valueOf((byte)35)};
    Object v4 = 37;
    Object v5 = 245;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)19)};
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 1L;
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)0)};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = "Q";
    Object v6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = -54;
    Object v4 = "path";
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v5).getCount();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 4;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).available();
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).getNextCPIOEntry();
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v3 = -43;
    Object v4 = 6;
    Object v5 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)0)};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = "Q";
    Object v6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v6).available();
    org.junit.Assert.assertEquals((Object)(1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = 1L;
    Object v4 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).skip((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 1;
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v3).read();
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }
}
