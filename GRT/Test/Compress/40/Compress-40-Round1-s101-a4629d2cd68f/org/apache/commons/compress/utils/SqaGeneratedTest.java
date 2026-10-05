package org.apache.commons.compress.utils;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = -38;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    ((org.apache.commons.compress.utils.BitInputStream)v2).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 8;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    ((org.apache.commons.compress.utils.BitInputStream)v2).clearBitCache();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 0;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 16;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    ((org.apache.commons.compress.utils.BitInputStream)v2).clearBitCache();
    Object v3 = null;
    ((org.apache.commons.compress.utils.BitInputStream)v2).clearBitCache();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = -12;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = -4;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    ((org.apache.commons.compress.utils.BitInputStream)v2).clearBitCache();
    Object v3 = null;
    Object v4 = 1;
    Object v5 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = -57;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 1;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    ((org.apache.commons.compress.utils.BitInputStream)v2).clearBitCache();
    Object v3 = null;
    Object v4 = 0;
    Object v5 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 4;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = -25;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = -9;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 6;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = -7;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = -27;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = -50;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 9;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 7;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 31;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 36;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 28;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 36;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.compress.utils.BitInputStream)v2).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 2;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 2;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
    Object v5 = 16;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = -1;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = -29;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 72;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = -48;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 1460091384;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 0;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
    Object v5 = 57;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = -6;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    ((org.apache.commons.compress.utils.BitInputStream)v2).clearBitCache();
    Object v3 = null;
    Object v4 = -5;
    Object v5 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 32;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    ((org.apache.commons.compress.utils.BitInputStream)v2).clearBitCache();
    Object v3 = null;
    Object v4 = -43;
    Object v5 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 0;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
    Object v5 = 40;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 12;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 135;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = 28;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 0;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = -66;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 1;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 1;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    ((org.apache.commons.compress.utils.BitInputStream)v4).clearBitCache();
    Object v5 = null;
    Object v6 = -39;
    Object v7 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = -29;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 51;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    ((org.apache.commons.compress.utils.BitInputStream)v4).clearBitCache();
    Object v5 = null;
    Object v6 = 8;
    Object v7 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    ((org.apache.commons.compress.utils.BitInputStream)v4).clearBitCache();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    ((org.apache.commons.compress.utils.BitInputStream)v4).clearBitCache();
    Object v5 = null;
    Object v6 = -24;
    Object v7 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    ((org.apache.commons.compress.utils.BitInputStream)v4).clearBitCache();
    Object v5 = null;
    Object v6 = 18;
    Object v7 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    ((org.apache.commons.compress.utils.BitInputStream)v4).clearBitCache();
    Object v5 = null;
    Object v6 = 17;
    Object v7 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = -3;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 3;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    Object v7 = 8;
    Object v8 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = -13;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 0;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    Object v7 = 8;
    Object v8 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 59;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    ((org.apache.commons.compress.utils.BitInputStream)v2).clearBitCache();
    Object v3 = null;
    ((org.apache.commons.compress.utils.BitInputStream)v2).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 0;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    ((org.apache.commons.compress.utils.BitInputStream)v4).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = -78;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = -10;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 22;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 7;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = -24;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 0;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.ByteOrder.nativeOrder();
    Object v2 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v1));
    Object v3 = -17;
    Object v4 = ((org.apache.commons.compress.utils.BitInputStream)v2).readBits((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 39;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    ((org.apache.commons.compress.utils.BitInputStream)v4).clearBitCache();
    Object v5 = null;
    Object v6 = -3;
    Object v7 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = -39;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 17;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 2;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 16;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = -6;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 8;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = -12;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    ((org.apache.commons.compress.utils.BitInputStream)v4).clearBitCache();
    Object v5 = null;
    Object v6 = 1;
    Object v7 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -5L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -5L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = -27;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -5L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    ((org.apache.commons.compress.utils.BitInputStream)v4).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -5L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    ((org.apache.commons.compress.utils.BitInputStream)v4).clearBitCache();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -5L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 0;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -5L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 944;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -5L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    ((org.apache.commons.compress.utils.BitInputStream)v4).clearBitCache();
    Object v5 = null;
    Object v6 = 0;
    Object v7 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -5L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 3;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -5L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = -57;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    ((org.apache.commons.compress.utils.BitInputStream)v4).clearBitCache();
    Object v5 = null;
    Object v6 = -4;
    Object v7 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -5L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 35;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -5L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 60;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -5L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 2;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -5L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 27;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 0;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    Object v7 = -42;
    Object v8 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    ((org.apache.commons.compress.utils.BitInputStream)v4).clearBitCache();
    Object v5 = null;
    ((org.apache.commons.compress.utils.BitInputStream)v4).clearBitCache();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 37;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    Object v5 = 1;
    Object v6 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v5).intValue()));
    ((org.apache.commons.compress.utils.BitInputStream)v4).close();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.nio.ByteOrder.nativeOrder();
    Object v4 = new org.apache.commons.compress.utils.BitInputStream(((java.io.InputStream)v0),((java.nio.ByteOrder)v3));
    ((org.apache.commons.compress.utils.BitInputStream)v4).clearBitCache();
    Object v5 = null;
    Object v6 = 0;
    Object v7 = ((org.apache.commons.compress.utils.BitInputStream)v4).readBits((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }
}
