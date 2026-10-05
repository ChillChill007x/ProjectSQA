package com.fasterxml.jackson.core.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).toString();
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).releaseBuffers();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).hasTextAsCharacters();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).emptyAndGetCurrentSegment();
    Object v3 = "+Infnity";
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithString(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsDecimal();
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = Character.valueOf((char)0);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v2).charValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v3 = -6;
    Object v4 = 43;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithCopy(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)2)};
    Object v3 = 0;
    Object v4 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithShared(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = Character.valueOf((char)0);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v6).charValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "ALLOW_NUMERIC_LEADING_ZEROS";
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithString(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).ensureNotShared();
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsDecimal();
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v3 = 1;
    Object v4 = 3;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithCopy(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getCurrentSegment();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsArray();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).releaseBuffers();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "'";
    Object v3 = 47;
    Object v4 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getCurrentSegment();
    Object v3 = new char[]{};
    Object v4 = 19;
    Object v5 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = " of 4-char base64 unit: can only used between units";
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithString(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).hasTextAsCharacters();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "true";
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithString(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v5 = -8;
    Object v6 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "'";
    Object v3 = 6;
    Object v4 = -17;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).emptyAndGetCurrentSegment();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsString();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = 0;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v3 = 0;
    Object v4 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{};
    Object v3 = 3;
    Object v4 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithShared(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).ensureNotShared();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsArray();
    Object v3 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)48)};
    Object v4 = 49;
    Object v5 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithCopy(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).finishCurrentSegment();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)0)};
    Object v3 = 3;
    Object v4 = -12;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithShared(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsString();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).toString();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = Character.valueOf((char)69);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v2).charValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = 10;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = -3;
    Object v4 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithShared(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)0)};
    Object v3 = -14;
    Object v4 = -97;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithCopy(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getCurrentSegmentSize();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = 12;
    Object v4 = 63;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = Character.valueOf((char)1);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v2).charValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ")";
    Object v3 = 30;
    Object v4 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)0)};
    Object v3 = -9;
    Object v4 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithShared(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    Object v3 = "VALUE_NULL";
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithString(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).releaseBuffers();
    Object v2 = null;
    Object v3 = Character.valueOf((char)1);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v3).charValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithEmpty();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v3 = 13;
    Object v4 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithCopy(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{};
    Object v3 = 0;
    Object v4 = 34;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "B";
    Object v3 = 4;
    Object v4 = 32;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getCurrentSegment();
    Object v3 = -53;
    Object v4 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = 2;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).setCurrentLength((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "Current token (";
    Object v3 = 1;
    Object v4 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "fal";
    Object v3 = 960;
    Object v4 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithEmpty();
    Object v2 = null;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).releaseBuffers();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getCurrentSegment();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getCurrentSegment();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = -3;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)125),Character.valueOf((char)1)};
    Object v3 = 12;
    Object v4 = -1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "-10";
    Object v3 = 0;
    Object v4 = 9;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsString();
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).ensureNotShared();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getCurrentSegment();
    Object v3 = "' (code";
    Object v4 = -79;
    Object v5 = -10;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsString();
    Object v3 = "p";
    Object v4 = 25;
    Object v5 = 38;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).releaseBuffers();
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsString();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v3 = 2;
    Object v4 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = Character.valueOf((char)1);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v2).charValue()));
    Object v3 = null;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).releaseBuffers();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = Character.valueOf((char)57);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v2).charValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getCurrentSegment();
    Object v3 = new char[]{};
    Object v4 = 3;
    Object v5 = 211;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsDouble();
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getCurrentSegment();
    Object v3 = Character.valueOf((char)1);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v3).charValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = 2;
    Object v4 = 32;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v3 = 1;
    Object v4 = -6;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithShared(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{};
    Object v3 = -5;
    Object v4 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithCopy(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).ensureNotShared();
    Object v2 = null;
    Object v3 = Character.valueOf((char)1);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v3).charValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).toString();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getCurrentSegment();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).emptyAndGetCurrentSegment();
    Object v3 = new char[]{Character.valueOf((char)1)};
    Object v4 = 0;
    Object v5 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithShared(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v3 = 324;
    Object v4 = -19;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithCopy(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "Invalid numeric value: ";
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithString(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "Du<licate field '";
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithString(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).releaseBuffers();
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithEmpty();
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{};
    Object v3 = 13;
    Object v4 = 18;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithCopy(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).toString();
    Object v3 = "UTF-8";
    Object v4 = 12;
    Object v5 = -5;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).setCurrentLength((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).emptyAndGetCurrentSegment();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).emptyAndGetCurrentSegment();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).toString();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsArray();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ")";
    Object v3 = -10;
    Object v4 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    Object v3 = 32;
    Object v4 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = 8;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).emptyAndGetCurrentSegment();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = 127;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).setCurrentLength((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).hasTextAsCharacters();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)255),Character.valueOf((char)0),Character.valueOf((char)8)};
    Object v3 = 1;
    Object v4 = -48;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithShared(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "'";
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithString(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)6),Character.valueOf((char)1)};
    Object v3 = 7;
    Object v4 = -77;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithShared(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "Leading ze";
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithString(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsArray();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).hasTextAsCharacters();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{};
    Object v3 = 0;
    Object v4 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithCopy(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)128),Character.valueOf((char)0)};
    Object v3 = -26;
    Object v4 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithCopy(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).hasTextAsCharacters();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }
}
