package org.apache.commons.compress.archivers.ar;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)40)};
    Object v1 = -6;
    Object v2 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 1;
    ((java.io.InputStream)v0).mark((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 19;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).read();
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    ((java.io.InputStream)v1).reset();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).close();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).getNextArEntry();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-37),Byte.valueOf((byte)1)};
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)18),Byte.valueOf((byte)-7)};
    Object v3 = 1;
    Object v4 = -56;
    Object v5 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -36L;
    Object v3 = ((java.io.InputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -61;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = -13;
    Object v2 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)46),Byte.valueOf((byte)33)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    Object v3 = 51;
    Object v4 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).available();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 1;
    ((java.io.OutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)12),Byte.valueOf((byte)18),Byte.valueOf((byte)1)};
    Object v1 = 255;
    Object v2 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)41)};
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).close();
    Object v2 = null;
    Object v3 = new byte[]{};
    Object v4 = -18;
    Object v5 = -11;
    Object v6 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 31;
    ((java.io.InputStream)v1).mark((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -5L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 6;
    ((java.io.OutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-1)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)25)};
    Object v3 = 11;
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-3),Byte.valueOf((byte)1)};
    Object v1 = 26;
    Object v2 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).available();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 225;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    Object v4 = 1L;
    Object v5 = ((java.io.InputStream)v1).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0L;
    Object v3 = ((java.io.InputStream)v1).skip((((java.lang.Long)v2).longValue()));
    ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -53L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)16),Byte.valueOf((byte)0)};
    Object v4 = 65280;
    Object v5 = -10;
    Object v6 = ((java.io.InputStream)v1).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).getNextEntry();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = -50;
    Object v2 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).read();
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)8)};
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 1;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 1L;
    Object v3 = ((java.io.InputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)30)};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 10L;
    Object v3 = ((java.io.InputStream)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = new byte[]{};
    Object v5 = 16;
    Object v6 = 22;
    Object v7 = ((java.io.InputStream)v1).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = 249L;
    Object v4 = ((java.io.InputStream)v0).skip((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{};
    Object v3 = -9;
    Object v4 = 0;
    Object v5 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-59),Byte.valueOf((byte)-42),Byte.valueOf((byte)2)};
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).getNextEntry();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-1)};
    Object v3 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).read(((byte[])v2));
    Object v4 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).getNextArEntry();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 1;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)65),Byte.valueOf((byte)-34),Byte.valueOf((byte)-7)};
    Object v5 = 38;
    Object v6 = 25;
    Object v7 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v3 = 25;
    Object v4 = -15;
    Object v5 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0L;
    Object v3 = ((java.io.InputStream)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).read();
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)32)};
    Object v3 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).read(((byte[])v2));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v3 = 1;
    Object v4 = 26;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 50;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)42),Byte.valueOf((byte)8)};
    Object v3 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).read(((byte[])v2));
    ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 42;
    Object v2 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = 1L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)-47),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v2 = 1;
    Object v3 = 2;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v2).close();
    Object v3 = null;
    Object v4 = new byte[]{Byte.valueOf((byte)31),Byte.valueOf((byte)-124)};
    Object v5 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v2).read(((byte[])v4));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)3),Byte.valueOf((byte)0)};
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 58;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = new byte[]{};
    ((java.io.OutputStream)v4).write(((byte[])v5));
    Object v6 = null;
    Object v7 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)48),Byte.valueOf((byte)1)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v2).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)0)};
    Object v4 = 11;
    Object v5 = 3;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 512;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v1 = -12;
    Object v2 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 0L;
    Object v3 = ((java.io.InputStream)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)6)};
    Object v3 = 10;
    Object v4 = 2;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = 0L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).close();
    Object v2 = null;
    ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    ((java.io.InputStream)v0).reset();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v2).read();
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)12),Byte.valueOf((byte)1),Byte.valueOf((byte)2)};
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)71)};
    Object v1 = 33;
    Object v2 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)36)};
    Object v4 = -8;
    Object v5 = 0;
    Object v6 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)1)};
    Object v4 = 17;
    Object v5 = 0;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0)};
    Object v3 = ((java.io.InputStream)v1).read(((byte[])v2));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)0),Byte.valueOf((byte)4)};
    ((java.io.OutputStream)v4).write(((byte[])v5));
    Object v6 = null;
    Object v7 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = 255;
    Object v3 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)-16)};
    Object v3 = 10;
    Object v4 = 29;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = 8L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
    ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v2).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-17)};
    Object v3 = 241;
    Object v4 = 0;
    Object v5 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)1)};
    Object v6 = 4;
    Object v7 = 0;
    Object v8 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v2).read(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = 235L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
    Object v5 = new byte[]{};
    Object v6 = 8;
    Object v7 = -39;
    Object v8 = ((java.io.InputStream)v2).readNBytes(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0),Byte.valueOf((byte)49)};
    Object v1 = 102;
    Object v2 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)78),Byte.valueOf((byte)-2)};
    Object v1 = 28;
    Object v2 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v2).getNextArEntry();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).close();
    Object v2 = null;
    Object v3 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v1).getNextArEntry();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-14)};
    Object v5 = 1;
    Object v6 = -3;
    Object v7 = ((org.apache.commons.compress.archivers.ar.ArArchiveInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }
}
