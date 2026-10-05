package org.apache.commons.compress.archivers.zip;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)39)};
    Object v1 = -7;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    ((java.io.InputStream)v0).mark((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 13;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-37),Byte.valueOf((byte)0),Byte.valueOf((byte)-1)};
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)-14)};
    Object v2 = 44;
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)6),Byte.valueOf((byte)5),Byte.valueOf((byte)0)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)21)};
    Object v4 = -16;
    Object v5 = 1;
    Object v6 = ((java.io.InputStream)v1).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-31),Byte.valueOf((byte)20),Byte.valueOf((byte)-6)};
    Object v3 = ((java.io.InputStream)v1).read(((byte[])v2));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).read();
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).read();
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).read();
    Object v3 = new byte[]{Byte.valueOf((byte)-14)};
    Object v4 = 70;
    Object v5 = -46;
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v1).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 6L;
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -7L;
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v1).close();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).available();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).getCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 32;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)-59),Byte.valueOf((byte)6),Byte.valueOf((byte)0)};
    Object v2 = 240;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).getCount();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v1).getNextZipEntry();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 87L;
    Object v3 = ((java.io.InputStream)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)49),Byte.valueOf((byte)-54),Byte.valueOf((byte)27)};
    Object v5 = 0;
    Object v6 = 50;
    Object v7 = ((java.io.InputStream)v1).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 29;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v1).getNextZipEntry();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)4),Byte.valueOf((byte)16)};
    ((java.io.OutputStream)v2).write(((byte[])v3));
    Object v4 = null;
    Object v5 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)1)};
    Object v8 = 701822548;
    Object v9 = 232;
    Object v10 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v6).read(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v6).getNextZipEntry();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v1).getNextEntry();
    Object v3 = new byte[]{Byte.valueOf((byte)1)};
    Object v4 = -33;
    Object v5 = 16;
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v1).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v3).read();
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    ((java.io.InputStream)v0).reset();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = "";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = 18L;
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -10L;
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v3).getNextZipEntry();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = -25;
    Object v8 = ((java.io.InputStream)v6).readNBytes((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)6)};
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = ((java.io.InputStream)v6).readNBytes((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 2;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 1;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{};
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = ((java.io.InputStream)v6).readNBytes((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v6).getNextZipEntry();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 23;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = ((java.io.InputStream)v3).available();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = -5L;
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v6).skip((((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = 1;
    ((java.io.OutputStream)v7).write((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = ((java.io.InputStream)v6).transferTo(((java.io.OutputStream)v7));
    org.junit.Assert.assertEquals((Object)(0L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v3 = 2;
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.io.InputStream)v1).readAllBytes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 240L;
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).available();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)12),Byte.valueOf((byte)-49),Byte.valueOf((byte)-28)};
    Object v8 = 0;
    Object v9 = 3;
    Object v10 = ((java.io.InputStream)v6).read(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((java.io.InputStream)v6).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = new byte[]{};
    Object v5 = 25;
    Object v6 = 14;
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = new byte[]{Byte.valueOf((byte)30),Byte.valueOf((byte)60)};
    Object v5 = 255;
    Object v6 = 0;
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new byte[]{};
    Object v8 = ((java.io.InputStream)v6).read(((byte[])v7));
    Object v9 = new byte[]{Byte.valueOf((byte)57)};
    Object v10 = ((java.io.InputStream)v6).read(((byte[])v9));
    org.junit.Assert.assertEquals((Object)(-1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1;
    Object v8 = ((java.io.InputStream)v6).readNBytes((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -28L;
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -7;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    ((java.io.InputStream)v3).reset();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).read();
    Object v3 = new byte[]{Byte.valueOf((byte)1)};
    Object v4 = 1;
    Object v5 = -65;
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v1).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0L;
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v6).skip((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = 6;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 49;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((java.io.InputStream)v6).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1L;
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v6).skip((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)28)};
    Object v3 = -22;
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 1L;
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 1;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v3));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v3 = 2;
    Object v4 = 43;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = new byte[]{};
    Object v5 = 19;
    Object v6 = 1;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 14;
    ((java.io.OutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = -31;
    ((java.io.OutputStream)v7).write((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = ((java.io.InputStream)v6).transferTo(((java.io.OutputStream)v7));
    org.junit.Assert.assertEquals((Object)(0L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((java.io.InputStream)v6).readAllBytes();
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v6).getNextZipEntry();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)21)};
    Object v1 = 6;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = new byte[]{Byte.valueOf((byte)7)};
    Object v5 = 3;
    Object v6 = 0;
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)48),Byte.valueOf((byte)-10)};
    Object v8 = 8;
    Object v9 = 0;
    Object v10 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v6).read(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 13L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)-53)};
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v3));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v6).close();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 5;
    Object v8 = ((java.io.InputStream)v6).readNBytes((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)89),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v1 = -13;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)8)};
    Object v5 = -2009983462;
    Object v6 = 1;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = 0;
    ((java.io.OutputStream)v4).write((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 4;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    ((java.io.InputStream)v1).reset();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 4;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 11L;
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v6).skip((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = 21;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-53)};
    Object v1 = 31;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 44L;
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v6));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v7).close();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = new byte[]{};
    Object v5 = -26;
    Object v6 = 8;
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = "UTF8";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v6));
    Object v8 = 0;
    Object v9 = ((java.io.InputStream)v7).readNBytes((((java.lang.Integer)v8).intValue()));
    Object v10 = java.io.OutputStream.nullOutputStream();
    Object v11 = new byte[]{Byte.valueOf((byte)106),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v12 = 2;
    Object v13 = 0;
    ((java.io.OutputStream)v10).write(((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = ((java.io.InputStream)v7).transferTo(((java.io.OutputStream)v10));
    org.junit.Assert.assertEquals((Object)(0L), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v4 = -5;
    ((java.io.InputStream)v3).mark((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }
}
