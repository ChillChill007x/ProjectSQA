package org.apache.commons.compress.archivers.tar;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)39)};
    Object v1 = -7;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "t";
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).getNextTarEntry();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "t";
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),((java.lang.String)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)-25),Byte.valueOf((byte)20),Byte.valueOf((byte)-6)};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "t";
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "t";
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).getNextTarEntry();
    Object v4 = new byte[]{Byte.valueOf((byte)0)};
    Object v5 = 0;
    Object v6 = 6;
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "t";
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "t";
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).getNextTarEntry();
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).isAtEOF();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "t";
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),((java.lang.String)v1));
    Object v3 = 32;
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).mark((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 1;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-43),Byte.valueOf((byte)-30),Byte.valueOf((byte)4)};
    Object v3 = -16;
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = 1L;
    Object v5 = ((java.io.InputStream)v3).skip((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).parsePaxHeaders(((java.io.InputStream)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).getLongNameData();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 1L;
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).readRecord();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).readRecord();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 1;
    ((java.io.OutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v3));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = false;
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).setAtEOF((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)8)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -41L;
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).getNextEntry();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)-71),Byte.valueOf((byte)0)};
    Object v3 = 41;
    Object v4 = 35;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).read();
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).getLongNameData();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = "' which is less than the record size of '";
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v2));
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).setCurrentEntry(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "t";
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),((java.lang.String)v1));
    Object v3 = 217L;
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).skip((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)5),Byte.valueOf((byte)53),Byte.valueOf((byte)1)};
    Object v3 = -22;
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-15),Byte.valueOf((byte)-96),Byte.valueOf((byte)0)};
    Object v3 = -9;
    Object v4 = 95;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).parsePaxHeaders(((java.io.InputStream)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-37),Byte.valueOf((byte)1),Byte.valueOf((byte)-12)};
    Object v1 = 17;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).getNextEntry();
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3));
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).parsePaxHeaders(((java.io.InputStream)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)20)};
    Object v3 = 0;
    Object v4 = 30;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = ((java.io.InputStream)v0).readAllBytes();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).read();
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-15)};
    Object v2 = 0;
    Object v3 = -11;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).read();
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).getNextTarEntry();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1)};
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).isEOFRecord(((byte[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)63),Byte.valueOf((byte)32),Byte.valueOf((byte)14)};
    Object v3 = ((java.io.InputStream)v1).read(((byte[])v2));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).available();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)33)};
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).isEOFRecord(((byte[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = 4;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((java.io.InputStream)v3).reset();
    Object v4 = null;
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v5));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -47;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 2L;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).getLongNameData();
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = 2;
    Object v6 = -6;
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).parsePaxHeaders(((java.io.InputStream)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)8)};
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).isEOFRecord(((byte[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1)};
    Object v5 = 55;
    Object v6 = 1;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).getCurrentEntry();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).readRecord();
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 6L;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).getNextTarEntry();
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 13L;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = 47;
    Object v3 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 1;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v4));
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).parsePaxHeaders(((java.io.InputStream)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "' which is less than the record size of '";
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v4));
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).setCurrentEntry(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 1L;
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-126),Byte.valueOf((byte)-21)};
    Object v3 = 8;
    Object v4 = 1000;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-25),Byte.valueOf((byte)-38)};
    Object v3 = 1;
    Object v4 = -30;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 18L;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 256;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = ((java.io.InputStream)v4).transferTo(((java.io.OutputStream)v5));
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).parsePaxHeaders(((java.io.InputStream)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-18),Byte.valueOf((byte)28)};
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).isEOFRecord(((byte[])v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.InputStream)v3).readAllBytes();
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).getLongNameData();
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-78),Byte.valueOf((byte)-11)};
    Object v5 = 59;
    Object v6 = 3;
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-10),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v1 = -13;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = 10;
    Object v6 = "6linkpath";
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).parsePaxHeaders(((java.io.InputStream)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1)};
    Object v5 = ((java.io.InputStream)v3).read(((byte[])v4));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v3).read();
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).getCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).getBytesRead();
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).getNextTarEntry();
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).readRecord();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).reset();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-16),Byte.valueOf((byte)0)};
    Object v1 = -5;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).getNextTarEntry();
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    Object v5 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v3).read();
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).isAtEOF();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v3 = ((java.io.InputStream)v2).readAllBytes();
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new byte[]{};
    Object v4 = 8;
    Object v5 = -7;
    Object v6 = ((java.io.InputStream)v0).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)-14)};
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = java.io.InputStream.nullInputStream();
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).parsePaxHeaders(((java.io.InputStream)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{};
    Object v5 = 8;
    Object v6 = 255;
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v3).read();
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "The dictionary size mus";
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-21),Byte.valueOf((byte)0)};
    Object v5 = ((java.io.InputStream)v3).read(((byte[])v4));
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).getCurrentEntry();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = 2;
    Object v4 = -6;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).parsePaxHeaders(((java.io.InputStream)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.InputStream)v3).readAllBytes();
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).available();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0L;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v3 = new byte[]{Byte.valueOf((byte)2)};
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).getNextTarEntry();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).read();
    Object v4 = new byte[]{};
    Object v5 = 211;
    Object v6 = 0;
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = 2;
    Object v5 = -6;
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).parsePaxHeaders(((java.io.InputStream)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.InputStream)v3).readAllBytes();
    Object v5 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2;
    Object v2 = -6;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)50),Byte.valueOf((byte)21)};
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).isEOFRecord(((byte[])v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }
}
