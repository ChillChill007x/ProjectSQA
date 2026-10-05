package org.apache.commons.compress.utils;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = 0;
    Object v4 = 24;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    org.apache.commons.compress.utils.IOUtils.closeQuietly(((java.io.Closeable)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = -22L;
    Object v3 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 2L;
    Object v3 = ((java.io.InputStream)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = -3L;
    Object v5 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = 0;
    Object v4 = 15;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    Object v4 = 0L;
    Object v5 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 30;
    ((java.io.OutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = 1;
    Object v6 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = -1351185476;
    Object v4 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 0;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = 12;
    Object v6 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v4),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    org.apache.commons.compress.utils.IOUtils.closeQuietly(((java.io.Closeable)v0));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = org.apache.commons.compress.utils.IOUtils.toByteArray(((java.io.InputStream)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = -24;
    Object v4 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 0;
    ((java.io.OutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = 11;
    Object v6 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 30;
    Object v4 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 0L;
    Object v3 = ((java.io.InputStream)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = new byte[]{Byte.valueOf((byte)11),Byte.valueOf((byte)2)};
    ((java.io.OutputStream)v4).write(((byte[])v5));
    Object v6 = null;
    Object v7 = 1;
    Object v8 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v4),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 38;
    Object v4 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = 38;
    Object v4 = -52;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = -13L;
    Object v3 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 1L;
    Object v3 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = -53;
    Object v4 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    ((java.io.Closeable)v1).close();
    Object v2 = null;
    org.apache.commons.compress.utils.IOUtils.closeQuietly(((java.io.Closeable)v1));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    Object v3 = -19L;
    Object v4 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 1;
    Object v4 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)97)};
    Object v3 = 16;
    Object v4 = -28;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v3 = ((java.io.InputStream)v1).read(((byte[])v2));
    Object v4 = org.apache.commons.compress.utils.IOUtils.toByteArray(((java.io.InputStream)v1));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 8L;
    Object v3 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 1993132622;
    Object v4 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)54)};
    Object v3 = 9;
    Object v4 = -30;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 0L;
    Object v3 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = -7;
    Object v4 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    ((java.io.OutputStream)v2).write(((byte[])v3));
    Object v4 = null;
    Object v5 = 1282693747;
    Object v6 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    Object v4 = new byte[]{};
    Object v5 = 70;
    Object v6 = 0;
    Object v7 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = -11L;
    Object v3 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)13),Byte.valueOf((byte)-104)};
    Object v3 = 9;
    Object v4 = -14;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    Object v3 = 49L;
    Object v4 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 10L;
    Object v3 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    ((java.io.InputStream)v1).reset();
    Object v2 = null;
    Object v3 = 17L;
    Object v4 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 4089L;
    Object v3 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)0)};
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0L;
    Object v7 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = -1L;
    Object v3 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = 255;
    Object v4 = 18;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)2),Byte.valueOf((byte)-23)};
    Object v3 = 41;
    Object v4 = 0;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = -33;
    Object v4 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 54L;
    Object v3 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    org.apache.commons.compress.utils.IOUtils.closeQuietly(((java.io.Closeable)v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = -12L;
    Object v3 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-21),Byte.valueOf((byte)2)};
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0L;
    Object v7 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-24),Byte.valueOf((byte)24),Byte.valueOf((byte)23)};
    Object v3 = 1;
    Object v4 = 10;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 8;
    Object v4 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = 42;
    Object v4 = 0;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = 1;
    Object v4 = 7;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 35;
    Object v4 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = -18L;
    Object v3 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 2L;
    Object v3 = ((java.io.InputStream)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = 0;
    Object v6 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v4),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = -24;
    Object v4 = 0;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = -25L;
    Object v3 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = -38;
    Object v4 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)18),Byte.valueOf((byte)-7),Byte.valueOf((byte)1)};
    Object v3 = -23;
    Object v4 = 0;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0)};
    Object v3 = 11;
    Object v4 = 75;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)-13)};
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)5),Byte.valueOf((byte)-25)};
    Object v3 = -17;
    Object v4 = 41;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = -10;
    Object v4 = 0;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = -29L;
    Object v3 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)64),Byte.valueOf((byte)-9)};
    Object v3 = ((java.io.InputStream)v1).read(((byte[])v2));
    Object v4 = new byte[]{};
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-25),Byte.valueOf((byte)10),Byte.valueOf((byte)5)};
    Object v3 = 1;
    Object v4 = -16;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)18)};
    Object v3 = 1;
    Object v4 = -12;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-96),Byte.valueOf((byte)0)};
    Object v3 = 1;
    Object v4 = -31;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 39;
    Object v4 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)12),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v3 = 8;
    Object v4 = 255;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = -32;
    Object v4 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 249;
    Object v5 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 50;
    Object v4 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v3 = 1372;
    Object v4 = 0;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)9),Byte.valueOf((byte)49),Byte.valueOf((byte)58)};
    Object v3 = 1;
    Object v4 = 8;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 6;
    Object v4 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 0;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)26)};
    Object v3 = 4;
    Object v4 = 0;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = 1;
    Object v6 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v4),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 2L;
    Object v3 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0)};
    Object v3 = 1;
    Object v4 = -48;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    Object v4 = -61L;
    Object v5 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 0L;
    Object v3 = ((java.io.InputStream)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = -10;
    Object v6 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v4),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = -8;
    Object v4 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 1644;
    Object v5 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1)};
    Object v3 = 51;
    Object v4 = 6;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-36),Byte.valueOf((byte)-28),Byte.valueOf((byte)1)};
    Object v3 = 2;
    Object v4 = 19;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = -6L;
    Object v3 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-18),Byte.valueOf((byte)-44)};
    Object v3 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = -35;
    Object v4 = 33;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    ((java.io.InputStream)v1).reset();
    Object v2 = null;
    Object v3 = new byte[]{Byte.valueOf((byte)-36),Byte.valueOf((byte)29)};
    Object v4 = -26;
    Object v5 = 491;
    Object v6 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    ((java.io.InputStream)v1).reset();
    Object v2 = null;
    Object v3 = new byte[]{};
    Object v4 = 5;
    Object v5 = 11;
    Object v6 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 25;
    Object v4 = org.apache.commons.compress.utils.IOUtils.copy(((java.io.InputStream)v1),((java.io.OutputStream)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)52),Byte.valueOf((byte)0)};
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)34),Byte.valueOf((byte)14),Byte.valueOf((byte)1)};
    Object v3 = ((java.io.InputStream)v1).read(((byte[])v2));
    Object v4 = new byte[]{};
    Object v5 = 1;
    Object v6 = 2;
    Object v7 = org.apache.commons.compress.utils.IOUtils.readFully(((java.io.InputStream)v1),((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    Object v3 = 2L;
    Object v4 = org.apache.commons.compress.utils.IOUtils.skip(((java.io.InputStream)v1),(((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }
}
