package com.fasterxml.jackson.core.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ") in base64 content";
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithString(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = new char[]{Character.valueOf((char)0)};
    Object v5 = 4;
    Object v6 = 90;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithCopy(((char[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).toString();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsDouble();
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsArray();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).releaseBuffers();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).emptyAndGetCurrentSegment();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getCurrentSegment();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithEmpty();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = "\\";
    Object v6 = 1;
    Object v7 = -6;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithEmpty();
    Object v5 = null;
    Object v6 = new char[]{Character.valueOf((char)1)};
    Object v7 = -12;
    Object v8 = -32;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithShared(((char[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).contentsAsString();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsString();
    Object v3 = new char[]{};
    Object v4 = 0;
    Object v5 = 2;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v6 = 0;
    Object v7 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithCopy(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).releaseBuffers();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).getTextBuffer();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).hasTextAsCharacters();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).emptyAndGetCurrentSegment();
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = "VALUE_NUMBER_FLOAT";
    Object v6 = 0;
    Object v7 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).contentsAsString();
    org.junit.Assert.assertEquals((Object)("V"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).expandCurrentSegment();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).contentsAsArray();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = Character.valueOf((char)0);
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append((((java.lang.Character)v5).charValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).toString();
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).getCurrentSegment();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).finishCurrentSegment();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).contentsAsDecimal();
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v6 = 20;
    Object v7 = -46;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).getCurrentSegment();
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).size();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = Character.valueOf((char)1);
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append((((java.lang.Character)v5).charValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{};
    Object v6 = 35;
    Object v7 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithShared(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{};
    Object v6 = -29;
    Object v7 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithShared(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).ensureNotShared();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithEmpty();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).contentsAsArray();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithEmpty();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).emptyAndGetCurrentSegment();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ">)";
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithString(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{Character.valueOf((char)0)};
    Object v6 = 46;
    Object v7 = 25;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).ensureNotShared();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).releaseBuffers();
    Object v5 = null;
    Object v6 = new char[]{};
    Object v7 = 1;
    Object v8 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithShared(((char[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).getTextBuffer();
    Object v6 = new char[]{Character.valueOf((char)1)};
    Object v7 = -32;
    Object v8 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithCopy(((char[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "' (code\\0x";
    Object v3 = -1;
    Object v4 = 9;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v6 = -40;
    Object v7 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = Character.valueOf((char)1);
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append((((java.lang.Character)v5).charValue()));
    Object v6 = null;
    Object v7 = "nuln";
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithString(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).getTextBuffer();
    Object v6 = Character.valueOf((char)0);
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append((((java.lang.Character)v6).charValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = "'";
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithString(((java.lang.String)v5));
    Object v6 = null;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).releaseBuffers();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).toString();
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).hasTextAsCharacters();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = Character.valueOf((char)34);
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append((((java.lang.Character)v5).charValue()));
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).getCurrentSegmentSize();
    org.junit.Assert.assertEquals((Object)(1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).getCurrentSegment();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = "VALUE_STRING";
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithString(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = new char[]{};
    Object v8 = 0;
    Object v9 = -2147483593;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithCopy(((char[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).size();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ")";
    Object v6 = -45;
    Object v7 = 3;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = Character.valueOf((char)0);
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append((((java.lang.Character)v5).charValue()));
    Object v6 = null;
    Object v7 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).setCurrentLength((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = " of 4-cuar base64 unit: padding only legal as 3rd or 4th character";
    Object v6 = 21;
    Object v7 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = "No ObjectCodec defined for the parser, can not deserialize JSON into Java objects";
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithString(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{};
    Object v6 = 0;
    Object v7 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{};
    Object v3 = 65535;
    Object v4 = 2;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithShared(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).toString();
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).expandCurrentSegment();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = "WRIOTE_ENCODING_BUFFER";
    Object v6 = 1;
    Object v7 = 11;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{};
    Object v6 = 36;
    Object v7 = 35;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithCopy(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).emptyAndGetCurrentSegment();
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).hasTextAsCharacters();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{};
    Object v6 = 27;
    Object v7 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).getCurrentSegmentSize();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v6 = -52;
    Object v7 = 71;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = "true";
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithString(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).toString();
    org.junit.Assert.assertEquals((Object)("true"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = -16;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).setCurrentLength((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).releaseBuffers();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).emptyAndGetCurrentSegment();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = Character.valueOf((char)5);
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append((((java.lang.Character)v5).charValue()));
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).emptyAndGetCurrentSegment();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).contentsAsArray();
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).contentsAsString();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithEmpty();
    Object v5 = null;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithEmpty();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{Character.valueOf((char)1)};
    Object v6 = 0;
    Object v7 = -24;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithShared(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v10 = -40;
    Object v11 = -9;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append(((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).ensureNotShared();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).finishCurrentSegment();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).getTextBuffer();
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).emptyAndGetCurrentSegment();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).setCurrentLength((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v6 = 0;
    Object v7 = 2;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithShared(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithEmpty();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v6 = 4;
    Object v7 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).emptyAndGetCurrentSegment();
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).expandCurrentSegment();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v6 = 1;
    Object v7 = 36;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithShared(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).getTextOffset();
    org.junit.Assert.assertEquals((Object)(1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = "true";
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithString(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = new char[]{};
    Object v8 = -28;
    Object v9 = 4;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithShared(((char[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{Character.valueOf((char)1)};
    Object v6 = 1;
    Object v7 = 12;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v6 = 21;
    Object v7 = -25;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithCopy(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsString();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = "A\\.";
    Object v6 = 55;
    Object v7 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v6 = -6;
    Object v7 = 13;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ")";
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithString(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{};
    Object v6 = -17;
    Object v7 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithShared(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).getTextBuffer();
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).getTextBuffer();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).contentsAsArray();
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).contentsAsDecimal();
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = Character.valueOf((char)2);
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append((((java.lang.Character)v5).charValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{Character.valueOf((char)1),Character.valueOf((char)2)};
    Object v6 = 0;
    Object v7 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithShared(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).contentsAsString();
    Object v6 = new char[]{Character.valueOf((char)1)};
    Object v7 = 58;
    Object v8 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append(((char[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1),Character.valueOf((char)3)};
    Object v6 = 18;
    Object v7 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = Character.valueOf((char)0);
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append((((java.lang.Character)v5).charValue()));
    Object v6 = null;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).ensureNotShared();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v6 = 1;
    Object v7 = 204;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).append(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = "'<";
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithString(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)3)};
    Object v6 = 224;
    Object v7 = 3;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithShared(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).contentsAsDecimal();
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = new char[]{Character.valueOf((char)0)};
    Object v6 = 1;
    Object v7 = 255;
    ((com.fasterxml.jackson.core.util.TextBuffer)v4).resetWithCopy(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).toString();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER;
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.BufferRecycler)v0).allocCharBuffer(((com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).getCurrentSegment();
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v4).emptyAndGetCurrentSegment();
    org.junit.Assert.assertNotNull(v6);
  }
}
