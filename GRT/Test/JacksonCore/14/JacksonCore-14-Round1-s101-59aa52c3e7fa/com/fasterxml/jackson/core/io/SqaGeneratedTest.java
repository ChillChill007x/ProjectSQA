package com.fasterxml.jackson.core.io;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)16)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseReadIOBuffer(((byte[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocWriteEncodingBuffer();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    ((com.fasterxml.jackson.core.io.IOContext)v3)._verifyAlloc(((java.lang.Object)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)1)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseConcatBuffer(((char[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-36),Byte.valueOf((byte)-25)};
    Object v5 = new byte[]{Byte.valueOf((byte)12)};
    ((com.fasterxml.jackson.core.io.IOContext)v3)._verifyRelease(((byte[])v4),((byte[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)2)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseBase64Buffer(((byte[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new char[]{};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseConcatBuffer(((char[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new char[]{Character.valueOf((char)0),Character.valueOf((char)34),Character.valueOf((char)1)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseTokenBuffer(((char[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v5 = new char[]{};
    ((com.fasterxml.jackson.core.io.IOContext)v3)._verifyRelease(((char[])v4),((char[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocTokenBuffer();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseWriteEncodingBuffer(((byte[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).constructTextBuffer();
    Object v5 = new char[]{};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseNameCopyBuffer(((char[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocWriteEncodingBuffer();
    Object v5 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseNameCopyBuffer(((char[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).isResourceManaged();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)3)};
    Object v5 = new byte[]{Byte.valueOf((byte)47),Byte.valueOf((byte)-5)};
    ((com.fasterxml.jackson.core.io.IOContext)v3)._verifyRelease(((byte[])v4),((byte[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 2;
    Object v5 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocTokenBuffer((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-14)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseBase64Buffer(((byte[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new char[]{};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseTokenBuffer(((char[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseConcatBuffer(((char[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-5),Byte.valueOf((byte)-35)};
    Object v5 = new byte[]{};
    ((com.fasterxml.jackson.core.io.IOContext)v3)._verifyRelease(((byte[])v4),((byte[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocTokenBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = new char[]{};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseNameCopyBuffer(((char[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocWriteEncodingBuffer();
    Object v5 = new byte[]{Byte.valueOf((byte)-8),Byte.valueOf((byte)0)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseWriteEncodingBuffer(((byte[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = true;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = ((com.fasterxml.jackson.core.io.IOContext)v7).allocTokenBuffer((((java.lang.Integer)v8).intValue()));
    ((com.fasterxml.jackson.core.io.IOContext)v3)._verifyAlloc(((java.lang.Object)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new char[]{Character.valueOf((char)0)};
    Object v5 = new char[]{};
    ((com.fasterxml.jackson.core.io.IOContext)v3)._verifyRelease(((char[])v4),((char[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 6;
    Object v5 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocNameCopyBuffer((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.core.JsonEncoding.UTF8;
    ((com.fasterxml.jackson.core.io.IOContext)v3).setEncoding(((com.fasterxml.jackson.core.JsonEncoding)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new char[]{Character.valueOf((char)192)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseConcatBuffer(((char[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    ((com.fasterxml.jackson.core.io.IOContext)v3).setEncoding(((com.fasterxml.jackson.core.JsonEncoding)v4));
    Object v5 = null;
    Object v6 = new byte[]{Byte.valueOf((byte)6),Byte.valueOf((byte)-12)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseWriteEncodingBuffer(((byte[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new char[]{Character.valueOf((char)1),Character.valueOf((char)92)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseConcatBuffer(((char[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = new char[]{};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseNameCopyBuffer(((char[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).getEncoding();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)-3)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseWriteEncodingBuffer(((byte[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new char[]{Character.valueOf((char)0)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseNameCopyBuffer(((char[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = com.fasterxml.jackson.core.JsonEncoding.UTF16_LE;
    ((com.fasterxml.jackson.core.io.IOContext)v6).setEncoding(((com.fasterxml.jackson.core.JsonEncoding)v7));
    Object v8 = null;
    Object v9 = new char[]{};
    ((com.fasterxml.jackson.core.io.IOContext)v6).releaseConcatBuffer(((char[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new char[]{Character.valueOf((char)0),Character.valueOf((char)34),Character.valueOf((char)4)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseConcatBuffer(((char[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = ((com.fasterxml.jackson.core.io.IOContext)v6).getEncoding();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -1;
    Object v5 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = new char[]{Character.valueOf((char)240),Character.valueOf((char)128)};
    ((com.fasterxml.jackson.core.io.IOContext)v6).releaseConcatBuffer(((char[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v9 = false;
    Object v10 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v7),((java.lang.Object)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).allocReadIOBuffer();
    Object v12 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v13 = ((com.fasterxml.jackson.core.io.IOContext)v10).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v12));
    Object v14 = ((com.fasterxml.jackson.core.io.IOContext)v13).getEncoding();
    Object v15 = ((com.fasterxml.jackson.core.io.IOContext)v6).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)2)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseReadIOBuffer(((byte[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = new char[]{Character.valueOf((char)2)};
    ((com.fasterxml.jackson.core.io.IOContext)v6).releaseTokenBuffer(((char[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1),Character.valueOf((char)0)};
    ((com.fasterxml.jackson.core.io.IOContext)v6).releaseTokenBuffer(((char[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new char[]{Character.valueOf((char)0),Character.valueOf((char)48),Character.valueOf((char)2)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseConcatBuffer(((char[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).getSourceReference();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    ((com.fasterxml.jackson.core.io.IOContext)v3)._verifyAlloc(((java.lang.Object)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.core.io.IOContext)v7).allocReadIOBuffer();
    Object v9 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v10 = ((com.fasterxml.jackson.core.io.IOContext)v7).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v9));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).getEncoding();
    ((com.fasterxml.jackson.core.io.IOContext)v3).setEncoding(((com.fasterxml.jackson.core.JsonEncoding)v11));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = false;
    Object v16 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v13),((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.core.io.IOContext)v16).allocReadIOBuffer();
    Object v18 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v19 = ((com.fasterxml.jackson.core.io.IOContext)v16).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v18));
    Object v20 = ((com.fasterxml.jackson.core.io.IOContext)v19).getEncoding();
    Object v21 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v5 = new char[]{};
    ((com.fasterxml.jackson.core.io.IOContext)v3)._verifyRelease(((char[])v4),((char[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-25),Byte.valueOf((byte)-31),Byte.valueOf((byte)22)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseReadIOBuffer(((byte[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.core.io.IOContext)v7).allocReadIOBuffer();
    Object v9 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v10 = ((com.fasterxml.jackson.core.io.IOContext)v7).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v9));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).getEncoding();
    Object v12 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.core.io.IOContext)v7).allocReadIOBuffer();
    Object v9 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v10 = ((com.fasterxml.jackson.core.io.IOContext)v7).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v9));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).getEncoding();
    ((com.fasterxml.jackson.core.io.IOContext)v3).setEncoding(((com.fasterxml.jackson.core.JsonEncoding)v11));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = false;
    Object v16 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v13),((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.core.io.IOContext)v16).allocReadIOBuffer();
    Object v18 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v19 = ((com.fasterxml.jackson.core.io.IOContext)v16).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v18));
    Object v20 = ((com.fasterxml.jackson.core.io.IOContext)v19).getEncoding();
    Object v21 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v20));
    Object v22 = 1;
    Object v23 = ((com.fasterxml.jackson.core.io.IOContext)v21).allocNameCopyBuffer((((java.lang.Integer)v22).intValue()));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v9 = false;
    Object v10 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v7),((java.lang.Object)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).allocReadIOBuffer();
    Object v12 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v13 = ((com.fasterxml.jackson.core.io.IOContext)v10).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v12));
    Object v14 = ((com.fasterxml.jackson.core.io.IOContext)v13).getEncoding();
    Object v15 = ((com.fasterxml.jackson.core.io.IOContext)v6).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v14));
    Object v16 = new char[]{};
    Object v17 = new char[]{};
    ((com.fasterxml.jackson.core.io.IOContext)v15)._verifyRelease(((char[])v16),((char[])v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v9 = false;
    Object v10 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v7),((java.lang.Object)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).allocReadIOBuffer();
    Object v12 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v13 = ((com.fasterxml.jackson.core.io.IOContext)v10).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v12));
    Object v14 = ((com.fasterxml.jackson.core.io.IOContext)v13).getEncoding();
    Object v15 = ((com.fasterxml.jackson.core.io.IOContext)v6).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v14));
    Object v16 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v17 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v18 = false;
    Object v19 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v16),((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = 1;
    Object v21 = ((com.fasterxml.jackson.core.io.IOContext)v19).allocReadIOBuffer((((java.lang.Integer)v20).intValue()));
    ((com.fasterxml.jackson.core.io.IOContext)v15)._verifyAlloc(((java.lang.Object)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseWriteEncodingBuffer(((byte[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v9 = false;
    Object v10 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v7),((java.lang.Object)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).allocReadIOBuffer();
    Object v12 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v13 = ((com.fasterxml.jackson.core.io.IOContext)v10).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v12));
    Object v14 = ((com.fasterxml.jackson.core.io.IOContext)v13).getEncoding();
    Object v15 = ((com.fasterxml.jackson.core.io.IOContext)v6).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v14));
    Object v16 = 1;
    Object v17 = ((com.fasterxml.jackson.core.io.IOContext)v15).allocNameCopyBuffer((((java.lang.Integer)v16).intValue()));
    Object v18 = new byte[]{Byte.valueOf((byte)8)};
    Object v19 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-31),Byte.valueOf((byte)1)};
    ((com.fasterxml.jackson.core.io.IOContext)v15)._verifyRelease(((byte[])v18),((byte[])v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseBase64Buffer(((byte[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.core.io.IOContext)v7).allocReadIOBuffer();
    Object v9 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v10 = ((com.fasterxml.jackson.core.io.IOContext)v7).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v9));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).getEncoding();
    Object v12 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v11));
    Object v13 = -44;
    Object v14 = ((com.fasterxml.jackson.core.io.IOContext)v12).allocNameCopyBuffer((((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v9 = false;
    Object v10 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v7),((java.lang.Object)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).allocReadIOBuffer();
    Object v12 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v13 = ((com.fasterxml.jackson.core.io.IOContext)v10).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v12));
    Object v14 = ((com.fasterxml.jackson.core.io.IOContext)v13).getEncoding();
    Object v15 = ((com.fasterxml.jackson.core.io.IOContext)v6).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v14));
    Object v16 = 24;
    Object v17 = ((com.fasterxml.jackson.core.io.IOContext)v15).allocWriteEncodingBuffer((((java.lang.Integer)v16).intValue()));
    Object v18 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)42)};
    ((com.fasterxml.jackson.core.io.IOContext)v15).releaseBase64Buffer(((byte[])v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v9 = false;
    Object v10 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v7),((java.lang.Object)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).allocReadIOBuffer();
    Object v12 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v13 = ((com.fasterxml.jackson.core.io.IOContext)v10).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v12));
    Object v14 = ((com.fasterxml.jackson.core.io.IOContext)v13).getEncoding();
    Object v15 = ((com.fasterxml.jackson.core.io.IOContext)v6).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v14));
    Object v16 = ((com.fasterxml.jackson.core.io.IOContext)v15).allocWriteEncodingBuffer();
    Object v17 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v18 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v19 = true;
    Object v20 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v17),((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((com.fasterxml.jackson.core.io.IOContext)v20).isResourceManaged();
    ((com.fasterxml.jackson.core.io.IOContext)v15)._verifyAlloc(((java.lang.Object)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)-28),Byte.valueOf((byte)-8),Byte.valueOf((byte)2)};
    Object v8 = new byte[]{Byte.valueOf((byte)-8),Byte.valueOf((byte)3),Byte.valueOf((byte)15)};
    ((com.fasterxml.jackson.core.io.IOContext)v6)._verifyRelease(((byte[])v7),((byte[])v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.core.io.IOContext)v7).allocReadIOBuffer();
    Object v9 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v10 = ((com.fasterxml.jackson.core.io.IOContext)v7).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v9));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).getEncoding();
    Object v12 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v11));
    Object v13 = ((com.fasterxml.jackson.core.io.IOContext)v12).getEncoding();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseTokenBuffer(((char[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseConcatBuffer(((char[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-10),Byte.valueOf((byte)-6),Byte.valueOf((byte)21)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseWriteEncodingBuffer(((byte[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = true;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.core.io.IOContext)v7).isResourceManaged();
    ((com.fasterxml.jackson.core.io.IOContext)v3)._verifyAlloc(((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new char[]{Character.valueOf((char)0)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseConcatBuffer(((char[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = -33;
    Object v8 = ((com.fasterxml.jackson.core.io.IOContext)v6).allocTokenBuffer((((java.lang.Integer)v7).intValue()));
    Object v9 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)1)};
    ((com.fasterxml.jackson.core.io.IOContext)v6).releaseTokenBuffer(((char[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)22)};
    ((com.fasterxml.jackson.core.io.IOContext)v6).releaseWriteEncodingBuffer(((byte[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v9 = false;
    Object v10 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v7),((java.lang.Object)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).allocReadIOBuffer();
    Object v12 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v13 = ((com.fasterxml.jackson.core.io.IOContext)v10).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v12));
    Object v14 = ((com.fasterxml.jackson.core.io.IOContext)v13).getEncoding();
    ((com.fasterxml.jackson.core.io.IOContext)v6).setEncoding(((com.fasterxml.jackson.core.JsonEncoding)v14));
    Object v15 = null;
    Object v16 = ((com.fasterxml.jackson.core.io.IOContext)v6).allocReadIOBuffer();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v9 = false;
    Object v10 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v7),((java.lang.Object)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).allocReadIOBuffer();
    Object v12 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v13 = ((com.fasterxml.jackson.core.io.IOContext)v10).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v12));
    Object v14 = ((com.fasterxml.jackson.core.io.IOContext)v13).getEncoding();
    Object v15 = ((com.fasterxml.jackson.core.io.IOContext)v6).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v14));
    Object v16 = new byte[]{};
    Object v17 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    ((com.fasterxml.jackson.core.io.IOContext)v15)._verifyRelease(((byte[])v16),((byte[])v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new char[]{Character.valueOf((char)4),Character.valueOf((char)1)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseTokenBuffer(((char[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.core.io.IOContext)v7).allocReadIOBuffer();
    Object v9 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v10 = ((com.fasterxml.jackson.core.io.IOContext)v7).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v9));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).getEncoding();
    Object v12 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v11));
    Object v13 = ((com.fasterxml.jackson.core.io.IOContext)v12).allocTokenBuffer();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.core.io.IOContext)v7).allocReadIOBuffer();
    Object v9 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v10 = ((com.fasterxml.jackson.core.io.IOContext)v7).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v9));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).getEncoding();
    ((com.fasterxml.jackson.core.io.IOContext)v3).setEncoding(((com.fasterxml.jackson.core.JsonEncoding)v11));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = false;
    Object v16 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v13),((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.core.io.IOContext)v16).allocReadIOBuffer();
    Object v18 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v19 = ((com.fasterxml.jackson.core.io.IOContext)v16).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v18));
    Object v20 = ((com.fasterxml.jackson.core.io.IOContext)v19).getEncoding();
    Object v21 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v20));
    Object v22 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)4)};
    ((com.fasterxml.jackson.core.io.IOContext)v21).releaseBase64Buffer(((byte[])v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseWriteEncodingBuffer(((byte[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v9 = false;
    Object v10 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v7),((java.lang.Object)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).allocReadIOBuffer();
    Object v12 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v13 = ((com.fasterxml.jackson.core.io.IOContext)v10).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v12));
    Object v14 = ((com.fasterxml.jackson.core.io.IOContext)v13).getEncoding();
    Object v15 = ((com.fasterxml.jackson.core.io.IOContext)v6).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v14));
    Object v16 = ((com.fasterxml.jackson.core.io.IOContext)v15).allocBase64Buffer();
    Object v17 = new byte[]{};
    ((com.fasterxml.jackson.core.io.IOContext)v15).releaseReadIOBuffer(((byte[])v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v9 = false;
    Object v10 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v7),((java.lang.Object)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).allocReadIOBuffer();
    Object v12 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v13 = ((com.fasterxml.jackson.core.io.IOContext)v10).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v12));
    Object v14 = ((com.fasterxml.jackson.core.io.IOContext)v13).getEncoding();
    Object v15 = ((com.fasterxml.jackson.core.io.IOContext)v6).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v14));
    Object v16 = new char[]{Character.valueOf((char)1)};
    ((com.fasterxml.jackson.core.io.IOContext)v15).releaseNameCopyBuffer(((char[])v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.core.io.IOContext)v7).allocReadIOBuffer();
    Object v9 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v10 = ((com.fasterxml.jackson.core.io.IOContext)v7).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v9));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).getEncoding();
    ((com.fasterxml.jackson.core.io.IOContext)v3).setEncoding(((com.fasterxml.jackson.core.JsonEncoding)v11));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = false;
    Object v16 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v13),((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.core.io.IOContext)v16).allocReadIOBuffer();
    Object v18 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v19 = ((com.fasterxml.jackson.core.io.IOContext)v16).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v18));
    Object v20 = ((com.fasterxml.jackson.core.io.IOContext)v19).getEncoding();
    Object v21 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v20));
    Object v22 = 3;
    Object v23 = ((com.fasterxml.jackson.core.io.IOContext)v21).allocTokenBuffer((((java.lang.Integer)v22).intValue()));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.core.io.IOContext)v7).allocReadIOBuffer();
    Object v9 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v10 = ((com.fasterxml.jackson.core.io.IOContext)v7).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v9));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).getEncoding();
    Object v12 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v11));
    Object v13 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = false;
    Object v16 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v13),((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.core.io.IOContext)v16).allocReadIOBuffer();
    Object v18 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v19 = ((com.fasterxml.jackson.core.io.IOContext)v16).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v18));
    Object v20 = ((com.fasterxml.jackson.core.io.IOContext)v19).getEncoding();
    ((com.fasterxml.jackson.core.io.IOContext)v12).setEncoding(((com.fasterxml.jackson.core.JsonEncoding)v20));
    Object v21 = null;
    Object v22 = 1;
    Object v23 = ((com.fasterxml.jackson.core.io.IOContext)v12).allocWriteEncodingBuffer((((java.lang.Integer)v22).intValue()));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v1),((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 6;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v4).allocNameCopyBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseReadIOBuffer(((byte[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v1),((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 6;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v4).allocNameCopyBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new char[]{};
    ((com.fasterxml.jackson.core.io.IOContext)v8).releaseNameCopyBuffer(((char[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.core.io.IOContext)v7).allocReadIOBuffer();
    Object v9 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v10 = ((com.fasterxml.jackson.core.io.IOContext)v7).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v9));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).getEncoding();
    ((com.fasterxml.jackson.core.io.IOContext)v3).setEncoding(((com.fasterxml.jackson.core.JsonEncoding)v11));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = false;
    Object v16 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v13),((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.core.io.IOContext)v16).allocReadIOBuffer();
    Object v18 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v19 = ((com.fasterxml.jackson.core.io.IOContext)v16).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v18));
    Object v20 = ((com.fasterxml.jackson.core.io.IOContext)v19).getEncoding();
    Object v21 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v20));
    Object v22 = ((com.fasterxml.jackson.core.io.IOContext)v21).allocTokenBuffer();
    Object v23 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-53)};
    ((com.fasterxml.jackson.core.io.IOContext)v21).releaseBase64Buffer(((byte[])v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.core.io.IOContext)v7).allocReadIOBuffer();
    Object v9 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v10 = ((com.fasterxml.jackson.core.io.IOContext)v7).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v9));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).getEncoding();
    ((com.fasterxml.jackson.core.io.IOContext)v3).setEncoding(((com.fasterxml.jackson.core.JsonEncoding)v11));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = false;
    Object v16 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v13),((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.core.io.IOContext)v16).allocReadIOBuffer();
    Object v18 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v19 = ((com.fasterxml.jackson.core.io.IOContext)v16).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v18));
    Object v20 = ((com.fasterxml.jackson.core.io.IOContext)v19).getEncoding();
    Object v21 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v20));
    Object v22 = new byte[]{};
    ((com.fasterxml.jackson.core.io.IOContext)v21).releaseBase64Buffer(((byte[])v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v9 = false;
    Object v10 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v7),((java.lang.Object)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).allocReadIOBuffer();
    Object v12 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v13 = ((com.fasterxml.jackson.core.io.IOContext)v10).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v12));
    Object v14 = ((com.fasterxml.jackson.core.io.IOContext)v13).getEncoding();
    Object v15 = ((com.fasterxml.jackson.core.io.IOContext)v6).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v14));
    Object v16 = new char[]{Character.valueOf((char)0),Character.valueOf((char)3)};
    ((com.fasterxml.jackson.core.io.IOContext)v15).releaseConcatBuffer(((char[])v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v1),((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 6;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v4).allocNameCopyBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1),Character.valueOf((char)2)};
    ((com.fasterxml.jackson.core.io.IOContext)v8).releaseConcatBuffer(((char[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v9 = false;
    Object v10 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v7),((java.lang.Object)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).allocReadIOBuffer();
    Object v12 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v13 = ((com.fasterxml.jackson.core.io.IOContext)v10).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v12));
    Object v14 = ((com.fasterxml.jackson.core.io.IOContext)v13).getEncoding();
    Object v15 = ((com.fasterxml.jackson.core.io.IOContext)v6).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v14));
    Object v16 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v17 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v18 = false;
    Object v19 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v16),((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.fasterxml.jackson.core.io.IOContext)v19).allocReadIOBuffer();
    Object v21 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v22 = ((com.fasterxml.jackson.core.io.IOContext)v19).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v21));
    Object v23 = ((com.fasterxml.jackson.core.io.IOContext)v22).getEncoding();
    ((com.fasterxml.jackson.core.io.IOContext)v15).setEncoding(((com.fasterxml.jackson.core.JsonEncoding)v23));
    Object v24 = null;
    Object v25 = new char[]{};
    ((com.fasterxml.jackson.core.io.IOContext)v15).releaseConcatBuffer(((char[])v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)90)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseBase64Buffer(((byte[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocTokenBuffer();
    Object v5 = new char[]{};
    Object v6 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)1)};
    ((com.fasterxml.jackson.core.io.IOContext)v3)._verifyRelease(((char[])v5),((char[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v1),((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 6;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v4).allocNameCopyBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v9),((java.lang.Object)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.io.IOContext)v12).allocReadIOBuffer();
    Object v14 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v15 = ((com.fasterxml.jackson.core.io.IOContext)v12).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v14));
    Object v16 = ((com.fasterxml.jackson.core.io.IOContext)v15).getEncoding();
    ((com.fasterxml.jackson.core.io.IOContext)v8).setEncoding(((com.fasterxml.jackson.core.JsonEncoding)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v1),((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 6;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v4).allocNameCopyBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{Byte.valueOf((byte)-6),Byte.valueOf((byte)0),Byte.valueOf((byte)14)};
    ((com.fasterxml.jackson.core.io.IOContext)v8).releaseReadIOBuffer(((byte[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = false;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.core.io.IOContext)v8).allocReadIOBuffer();
    Object v10 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v8).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v10));
    Object v12 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v13 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v12),((java.lang.Object)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.io.IOContext)v15).allocReadIOBuffer();
    Object v17 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v18 = ((com.fasterxml.jackson.core.io.IOContext)v15).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v17));
    Object v19 = ((com.fasterxml.jackson.core.io.IOContext)v18).getEncoding();
    Object v20 = ((com.fasterxml.jackson.core.io.IOContext)v11).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v19));
    ((com.fasterxml.jackson.core.io.IOContext)v3)._verifyAlloc(((java.lang.Object)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.core.io.IOContext)v7).allocReadIOBuffer();
    Object v9 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v10 = ((com.fasterxml.jackson.core.io.IOContext)v7).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v9));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).getEncoding();
    ((com.fasterxml.jackson.core.io.IOContext)v3).setEncoding(((com.fasterxml.jackson.core.JsonEncoding)v11));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = false;
    Object v16 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v13),((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.core.io.IOContext)v16).allocReadIOBuffer();
    Object v18 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v19 = ((com.fasterxml.jackson.core.io.IOContext)v16).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v18));
    Object v20 = ((com.fasterxml.jackson.core.io.IOContext)v19).getEncoding();
    Object v21 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v20));
    Object v22 = new char[]{Character.valueOf((char)256)};
    ((com.fasterxml.jackson.core.io.IOContext)v21).releaseConcatBuffer(((char[])v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.core.io.IOContext)v7).allocReadIOBuffer();
    Object v9 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v10 = ((com.fasterxml.jackson.core.io.IOContext)v7).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v9));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).getEncoding();
    Object v12 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v11));
    Object v13 = ((com.fasterxml.jackson.core.io.IOContext)v12).allocConcatBuffer();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.core.io.IOContext)v7).allocReadIOBuffer();
    Object v9 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v10 = ((com.fasterxml.jackson.core.io.IOContext)v7).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v9));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).getEncoding();
    Object v12 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v11));
    Object v13 = new byte[]{Byte.valueOf((byte)17),Byte.valueOf((byte)0)};
    ((com.fasterxml.jackson.core.io.IOContext)v12).releaseBase64Buffer(((byte[])v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.core.io.IOContext)v7).allocReadIOBuffer();
    Object v9 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v10 = ((com.fasterxml.jackson.core.io.IOContext)v7).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v9));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).getEncoding();
    Object v12 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v11));
    Object v13 = new byte[]{};
    ((com.fasterxml.jackson.core.io.IOContext)v12).releaseBase64Buffer(((byte[])v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0)};
    ((com.fasterxml.jackson.core.io.IOContext)v3).releaseReadIOBuffer(((byte[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.core.io.IOContext)v7).allocReadIOBuffer();
    Object v9 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v10 = ((com.fasterxml.jackson.core.io.IOContext)v7).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v9));
    Object v11 = ((com.fasterxml.jackson.core.io.IOContext)v10).getEncoding();
    ((com.fasterxml.jackson.core.io.IOContext)v3).setEncoding(((com.fasterxml.jackson.core.JsonEncoding)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v3).withEncoding(((com.fasterxml.jackson.core.JsonEncoding)v5));
    Object v7 = ((com.fasterxml.jackson.core.io.IOContext)v6).allocWriteEncodingBuffer();
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v9 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v8),((java.lang.Object)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 1;
    Object v13 = ((com.fasterxml.jackson.core.io.IOContext)v11).allocReadIOBuffer((((java.lang.Integer)v12).intValue()));
    ((com.fasterxml.jackson.core.io.IOContext)v6)._verifyAlloc(((java.lang.Object)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v1),((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 6;
    Object v6 = ((com.fasterxml.jackson.core.io.IOContext)v4).allocNameCopyBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    ((com.fasterxml.jackson.core.io.IOContext)v8).releaseNameCopyBuffer(((char[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
