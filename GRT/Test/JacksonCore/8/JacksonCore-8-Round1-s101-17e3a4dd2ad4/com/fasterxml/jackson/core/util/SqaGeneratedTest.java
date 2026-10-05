package com.fasterxml.jackson.core.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).emptyAndGetCurrentSegment();
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).releaseBuffers();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "line.separator";
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithString(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).emptyAndGetCurrentSegment();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsDecimal();
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = " entries, hash area of ";
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithString(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = "N";
    Object v5 = 0;
    Object v6 = 29;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = 0;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).setCurrentAndReturn((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
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
    Object v2 = ")";
    Object v3 = 1;
    Object v4 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).hasTextAsCharacters();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsArray();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).ensureNotShared();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).ensureNotShared();
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).hasTextAsCharacters();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithEmpty();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{};
    Object v3 = -20;
    Object v4 = 42;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithShared(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{};
    Object v3 = 0;
    Object v4 = 24;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsString();
    Object v3 = 1;
    Object v4 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).emptyAndGetCurrentSegment();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getCurrentSegment();
    Object v3 = "t";
    Object v4 = 0;
    Object v5 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsString();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsDecimal();
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getCurrentSegment();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v3 = 23;
    Object v4 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithShared(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v7 = -23;
    Object v8 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithCopy(((char[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = -29;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).setCurrentAndReturn((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).releaseBuffers();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsDecimal();
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = Character.valueOf((char)1);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v2).charValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).releaseBuffers();
    Object v2 = null;
    Object v3 = new char[]{Character.valueOf((char)0)};
    Object v4 = 4;
    Object v5 = -54;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithShared(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithEmpty();
    Object v2 = null;
    Object v3 = new char[]{Character.valueOf((char)4),Character.valueOf((char)0)};
    Object v4 = -18;
    Object v5 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = Character.valueOf((char)4);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v2).charValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "'";
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithString(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{};
    Object v3 = 1;
    Object v4 = -1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithShared(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = Character.valueOf((char)0);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v2).charValue()));
    Object v3 = null;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithEmpty();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).finishCurrentSegment();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = -40;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).setCurrentAndReturn((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithEmpty();
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).hasTextAsCharacters();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithEmpty();
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsString();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{};
    Object v3 = 1;
    Object v4 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithShared(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "ALLO";
    Object v3 = 32;
    Object v4 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getCurrentSegment();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).hasTextAsCharacters();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithEmpty();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)8),Character.valueOf((char)3)};
    Object v3 = -17;
    Object v4 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithCopy(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = -41;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v3 = 255;
    Object v4 = -1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = Character.valueOf((char)0);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v2).charValue()));
    Object v3 = null;
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).setCurrentAndReturn((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsArray();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithEmpty();
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsArray();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "Can not ";
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithString(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getCurrentSegment();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "write a string";
    Object v3 = 16;
    Object v4 = 39;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).ensureNotShared();
    Object v2 = null;
    Object v3 = "";
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithString(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "Exponent indicator not followed by a digit";
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithString(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "write a nu)ber";
    Object v3 = 17;
    Object v4 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "Numeric value (";
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithString(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).emptyAndGetCurrentSegment();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = Character.valueOf((char)0);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v2).charValue()));
    Object v3 = null;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).releaseBuffers();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getCurrentSegment();
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).ensureNotShared();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = Character.valueOf((char)0);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v2).charValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = Character.valueOf((char)1);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v2).charValue()));
    Object v3 = null;
    Object v4 = new char[]{Character.valueOf((char)0)};
    Object v5 = 16;
    Object v6 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithCopy(((char[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{};
    Object v3 = 1;
    Object v4 = 22;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).toString();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsArray();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ") in numeric value";
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithString(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ")}";
    Object v3 = 0;
    Object v4 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsDouble();
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ") not VALUE_STRING or VALUE_(EMBEDDED_OBJECT, can not access as binary";
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithString(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).emptyAndGetCurrentSegment();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = 255;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)0)};
    Object v3 = 1;
    Object v4 = 7;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v3 = 0;
    Object v4 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithCopy(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "~";
    Object v3 = 0;
    Object v4 = 8;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).toString();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = Character.valueOf((char)1);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v2).charValue()));
    Object v3 = null;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).ensureNotShared();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).setCurrentLength((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = 1;
    Object v5 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v3 = 1;
    Object v4 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsString();
    org.junit.Assert.assertEquals((Object)("\u0001"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = 1;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsArray();
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithEmpty();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithEmpty();
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).toString();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)0)};
    Object v3 = 0;
    Object v4 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithShared(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = 54;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).setCurrentAndReturn((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "";
    Object v3 = 49;
    Object v4 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    Object v3 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v4 = 4;
    Object v5 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithCopy(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = -7;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).emptyAndGetCurrentSegment();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v3 = 0;
    Object v4 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = 4;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)4),Character.valueOf((char)1)};
    Object v3 = 0;
    Object v4 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithCopy(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = Character.valueOf((char)0);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v2).charValue()));
    Object v3 = null;
    Object v4 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getTextBuffer();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = 0;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).expandCurrentSegment((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v3 = -13;
    Object v4 = -14;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "': enable JsonParser.Feature.ALLOW_NON_NvMERIC_NUMBERS to allow";
    Object v3 = 0;
    Object v4 = 115;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).releaseBuffers();
    Object v2 = null;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).ensureNotShared();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = -31;
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).setCurrentAndReturn((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)0)};
    Object v3 = -35;
    Object v4 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithCopy(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).emptyAndGetCurrentSegment();
    Object v3 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).contentsAsString();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = "VALUE_NyLL";
    Object v3 = 10;
    Object v4 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v3 = 3;
    Object v4 = 0;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = Character.valueOf((char)0);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v2).charValue()));
    Object v3 = null;
    Object v4 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).getCurrentSegment();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = Character.valueOf((char)0);
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append((((java.lang.Character)v2).charValue()));
    Object v3 = null;
    Object v4 = ((com.fasterxml.jackson.core.util.TextBuffer)v1).hasTextAsCharacters();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{};
    Object v3 = 0;
    Object v4 = -6;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).resetWithCopy(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler)v0));
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = 24;
    Object v4 = 1;
    ((com.fasterxml.jackson.core.util.TextBuffer)v1).append(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }
}
