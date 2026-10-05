package org.apache.commons.compress.archivers.cpio;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -15;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).getNextCPIOEntry();
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -15;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -15;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)25)};
    Object v4 = 0;
    Object v5 = -57;
    Object v6 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -15;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)-37),Byte.valueOf((byte)9),Byte.valueOf((byte)-23)};
    Object v4 = 0;
    Object v5 = 43;
    Object v6 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 23;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -15;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).read();
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -15;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).close();
    Object v3 = null;
    Object v4 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).available();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -15;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).getNextCPIOEntry();
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-12)};
    Object v1 = 256;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -15;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -15;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 6L;
    Object v4 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).skip((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new byte[]{};
    Object v3 = 0;
    Object v4 = 0;
    ((java.io.OutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)27),Byte.valueOf((byte)-9)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 6;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -15;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -19;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -15;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = -12L;
    Object v4 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).skip((((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -15;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)26),Byte.valueOf((byte)24),Byte.valueOf((byte)1)};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -15;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "no current CPIO enry";
    Object v4 = false;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -15;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 51L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).read();
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = 4;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -15;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    ((java.io.InputStream)v2).reset();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -15;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 50;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).available();
    Object v4 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)20),Byte.valueOf((byte)2),Byte.valueOf((byte)10)};
    Object v4 = 1;
    Object v5 = 15;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{};
    Object v2 = -1;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v4 = -3;
    Object v5 = 1;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{};
    Object v4 = 16;
    Object v5 = 1;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).read();
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -15;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).available();
    Object v4 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).getNextCPIOEntry();
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)-36)};
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)11),Byte.valueOf((byte)0)};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).getBytesRead();
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 16;
    ((java.io.InputStream)v2).mark((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).skip((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-7)};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 65600;
    ((java.io.InputStream)v2).mark((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)70),Byte.valueOf((byte)-27)};
    Object v4 = 26;
    Object v5 = 9;
    Object v6 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.io.InputStream)v2).readAllBytes();
    Object v4 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v4 = 24;
    Object v5 = -28;
    Object v6 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).read();
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-7)};
    Object v1 = 8;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{};
    Object v4 = 255;
    Object v5 = 2;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)0)};
    Object v4 = 50;
    Object v5 = 0;
    Object v6 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)37),Byte.valueOf((byte)1)};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v5));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{};
    Object v4 = 1;
    Object v5 = 6;
    Object v6 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = -1;
    ((java.io.OutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = ((java.io.InputStream)v0).readAllBytes();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).skip((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 17;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v5));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0),Byte.valueOf((byte)-30)};
    Object v1 = -19;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).skip((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).getNextCPIOEntry();
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)17)};
    Object v4 = 39;
    Object v5 = 1;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)17)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).getNextCPIOEntry();
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-3),Byte.valueOf((byte)0)};
    Object v1 = 48;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 11L;
    Object v4 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).skip((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)0)};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)6)};
    Object v4 = -6;
    Object v5 = 58;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)0)};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v2));
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v5).close();
    Object v6 = null;
    Object v7 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v5).getNextCPIOEntry();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)31),Byte.valueOf((byte)7)};
    Object v1 = -32;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    Object v5 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)0)};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v2));
    Object v6 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v5).available();
    org.junit.Assert.assertEquals((Object)(1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 0;
    ((java.io.OutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)8)};
    Object v4 = 36;
    Object v5 = -15;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)0)};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v2));
    Object v6 = new byte[]{};
    Object v7 = 2;
    Object v8 = -10;
    Object v9 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v5).read(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).read();
    Object v4 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)0)};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v2));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = ((java.io.InputStream)v5).transferTo(((java.io.OutputStream)v6));
    Object v8 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v5).read();
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)0)};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v2));
    Object v6 = new byte[]{};
    Object v7 = 14;
    Object v8 = 0;
    Object v9 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v5).read(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.io.InputStream)v2).readAllBytes();
    ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)35)};
    Object v1 = -16;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).skip((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).getNextEntry();
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v4 = 1;
    Object v5 = 16;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 40;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    Object v5 = -34L;
    Object v6 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).skip((((java.lang.Long)v5).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)12),Byte.valueOf((byte)-70),Byte.valueOf((byte)0)};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = 43;
    ((java.io.InputStream)v2).mark((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = 2;
    Object v2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)1)};
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 12;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 4;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).read();
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)12)};
    Object v4 = 1;
    Object v5 = 4104;
    Object v6 = ((org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }
}
