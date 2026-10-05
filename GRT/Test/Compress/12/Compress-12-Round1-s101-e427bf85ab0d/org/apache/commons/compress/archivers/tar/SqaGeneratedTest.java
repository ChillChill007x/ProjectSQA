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
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).read();
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).close();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{};
    Object v3 = -17;
    Object v4 = 8;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0L;
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).getRecordSize();
    org.junit.Assert.assertEquals((Object)(512), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.Reader.nullReader();
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).parsePaxHeaders(((java.io.Reader)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0L;
    Object v3 = ((java.io.InputStream)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).read();
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)32),Byte.valueOf((byte)3),Byte.valueOf((byte)0)};
    Object v3 = 0;
    Object v4 = -10;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).read();
    Object v3 = java.io.Reader.nullReader();
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).parsePaxHeaders(((java.io.Reader)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{};
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).available();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).getNextTarEntry();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v3 = -3;
    Object v4 = -1;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).getNextTarEntry();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "/";
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = 51;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "/";
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveEntry)v5).getName();
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).available();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{};
    Object v3 = 16;
    Object v4 = 25;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).read();
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).getCurrentEntry();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 1;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = -41;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 23L;
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-52),Byte.valueOf((byte)-12)};
    Object v5 = ((java.io.InputStream)v3).read(((byte[])v4));
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).getNextTarEntry();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 8;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)2)};
    Object v5 = 7;
    Object v6 = 37;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -16L;
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 1;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = 42;
    Object v4 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v3).read();
    Object v5 = new byte[]{};
    Object v6 = 0;
    Object v7 = -2;
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).read(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).getCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = "/";
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = true;
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).setAtEOF((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)11),Byte.valueOf((byte)28)};
    Object v1 = 19;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-41),Byte.valueOf((byte)8)};
    Object v1 = -18;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).getNextEntry();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 10;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{};
    Object v3 = -9;
    Object v4 = 60;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).getBytesRead();
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v3).read();
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{};
    Object v3 = 0;
    Object v4 = 16;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 2L;
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -18L;
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-3),Byte.valueOf((byte)25),Byte.valueOf((byte)10)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.InputStream)v3).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = "/";
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v2));
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).setCurrentEntry(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).getNextTarEntry();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0)};
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = java.io.Reader.nullReader();
    Object v9 = new java.io.StringWriter();
    Object v10 = ((java.io.Reader)v8).transferTo(((java.io.Writer)v9));
    Object v11 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).parsePaxHeaders(((java.io.Reader)v8));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).getNextEntry();
    Object v3 = "/";
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v3).read();
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).getCurrentEntry();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v3 = 0;
    Object v4 = -12;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = "/";
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveEntry)v3).getLastModifiedDate();
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v3));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 2;
    ((java.io.InputStream)v3).mark((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).reset();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)-19)};
    Object v3 = 13;
    Object v4 = 0;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1)};
    Object v5 = ((java.io.InputStream)v3).read(((byte[])v4));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = -29L;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)3),Byte.valueOf((byte)31)};
    Object v5 = 0;
    Object v6 = 29;
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = "/";
    Object v9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.InputStream)v3).readAllBytes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = "/";
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveEntry)v3).isDirectory();
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v3));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).isAtEOF();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{};
    Object v3 = 39;
    Object v4 = 12;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).getNextTarEntry();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -62L;
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).isAtEOF();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 0;
    ((java.io.OutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).getNextTarEntry();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 21;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v3).read();
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "/";
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v4));
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).setCurrentEntry(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    Object v4 = new byte[]{};
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((java.io.InputStream)v1).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)1)};
    Object v5 = 16;
    Object v6 = 0;
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 1L;
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).available();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)58),Byte.valueOf((byte)0),Byte.valueOf((byte)36)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.InputStream)v3).readAllBytes();
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v5));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)31)};
    Object v3 = 205;
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "/";
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v3).read();
    Object v5 = "/";
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.compress.archivers.ArchiveEntry)v6).isDirectory();
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v6));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 1;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 32L;
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).read();
    Object v3 = new byte[]{Byte.valueOf((byte)-3)};
    Object v4 = 3;
    Object v5 = 0;
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-28)};
    Object v1 = 33;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 36;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{};
    Object v5 = ((java.io.InputStream)v3).read(((byte[])v4));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = false;
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v1).setAtEOF((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }
}
