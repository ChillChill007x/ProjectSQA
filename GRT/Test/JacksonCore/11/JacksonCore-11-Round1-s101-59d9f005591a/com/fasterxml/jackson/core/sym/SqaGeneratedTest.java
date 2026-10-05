package com.fasterxml.jackson.core.sym;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).primaryCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 6;
    Object v3 = -6;
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).findName((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "CurrentStoken (";
    Object v3 = -7;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).findName((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "]";
    Object v3 = 10;
    Object v4 = -19;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).release();
    Object v2 = null;
    ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).release();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = -8;
    Object v3 = 16;
    Object v4 = 14;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).findName((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).tertiaryCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).secondaryCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "artifactId";
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).maybeDirty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).makeChild((((java.lang.Integer)v2).intValue()));
    Object v4 = "'";
    Object v5 = -4;
    Object v6 = 38;
    Object v7 = 48;
    Object v8 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = new int[]{};
    Object v3 = 32;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).findName(((int[])v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = 43;
    Object v4 = 24;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).calcHash((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(24124498), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).hashSeed();
    org.junit.Assert.assertEquals((Object)(40), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = new int[]{1};
    Object v3 = 127;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).calcHash(((int[])v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 17;
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).calcHash((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(522), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "Decimal point not foAlowed by a digit";
    Object v3 = 1;
    Object v4 = 44;
    Object v5 = 50;
    Object v6 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = new int[]{};
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).findName(((int[])v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = new int[]{};
    Object v3 = 1;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).calcHash(((int[])v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 24;
    Object v3 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).calcHash((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(432), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).release();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 17;
    Object v3 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).findName((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "z";
    Object v3 = new int[]{0,87,0};
    Object v4 = 119;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),((int[])v3),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 9;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(4), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1)._reportTooManyCollisions();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = new int[]{0};
    Object v3 = 4;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).findName(((int[])v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "writea string";
    Object v3 = 1;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).totalCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "Q'";
    Object v3 = 8;
    Object v4 = 1;
    Object v5 = 24;
    Object v6 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).makeChild((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).secondaryCount();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).release();
    Object v2 = null;
    Object v3 = "write a string";
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = -35;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).findName((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).toString();
    Object v3 = ") out of range of int";
    Object v4 = 0;
    Object v5 = -50;
    Object v6 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).release();
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).totalCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).toString();
    Object v3 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).totalCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = new int[]{-4,-31};
    Object v3 = -6;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).calcHash(((int[])v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = -62;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).findName((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = -44;
    Object v3 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).makeChild((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).findName((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).toString();
    Object v3 = 1;
    Object v4 = 55361;
    Object v5 = 0;
    Object v6 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).findName((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = -34;
    Object v3 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).makeChild((((java.lang.Integer)v2).intValue()));
    Object v4 = -23;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).findName((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v0)._reportTooManyCollisions();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).toString();
    ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).release();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "write a number";
    Object v3 = new int[]{1,1,-29};
    Object v4 = -7;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),((int[])v3),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).release();
    Object v2 = null;
    Object v3 = 0;
    Object v4 = -12;
    Object v5 = 0;
    Object v6 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).findName((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v1 = "'";
    Object v2 = new int[]{1};
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v0).addName(((java.lang.String)v1),((int[])v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "MIME";
    Object v3 = new int[]{1,66,50};
    Object v4 = 42;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),((int[])v3),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v1 = "Decimal point not followed by a digit";
    Object v2 = 255;
    Object v3 = -51;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v0).addName(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(4), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).maybeDirty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v1 = " (versYion: ";
    Object v2 = 1;
    Object v3 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v0).addName(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "true";
    Object v3 = 24;
    Object v4 = -64;
    Object v5 = 12;
    Object v6 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).totalCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).spilloverCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "Leading zeroes not allowed";
    Object v3 = 42;
    Object v4 = 18;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 4;
    Object v3 = 1;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).findName((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).hashSeed();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).release();
    Object v2 = null;
    Object v3 = -1;
    Object v4 = -46;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).findName((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ", second 0x";
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v1 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v0).secondaryCount();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(4), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = new int[]{56320};
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).calcHash(((int[])v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v1 = "+";
    Object v2 = 0;
    Object v3 = 106;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v0).addName(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v1 = 72;
    Object v2 = 23;
    Object v3 = 8;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v0).findName((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = -39;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(4), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = " -- suspect a DoS attack based on hash collisions";
    Object v3 = 1;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "write a number";
    Object v3 = new int[]{11,0};
    Object v4 = 1;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),((int[])v3),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).findName((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v1 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v0).toString();
    Object v2 = 192;
    Object v3 = 1;
    Object v4 = 250;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v0).findName((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v1 = 0;
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v0).makeChild((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ")";
    Object v3 = -5;
    Object v4 = 24;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 53;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 53;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).maybeDirty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = " in character escapDe sequence";
    Object v3 = 1;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 53;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).tertiaryCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v1 = "expect";
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = 22;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v0).addName(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).primaryCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v1 = "v";
    Object v2 = 1;
    Object v3 = 2;
    Object v4 = 5;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v0).addName(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = 53;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = -24;
    Object v3 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).makeChild((((java.lang.Integer)v2).intValue()));
    Object v4 = 25;
    Object v5 = 4;
    Object v6 = 6;
    Object v7 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).findName((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).tertiaryCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "ALLOW_NUMERIC_LEADIN";
    Object v3 = 47;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = 53;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "true";
    Object v3 = new int[]{1,1,-8};
    Object v4 = 7;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),((int[])v3),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = new int[]{0,56};
    Object v3 = 92;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).calcHash(((int[])v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 53;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).secondaryCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).bucketCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "ESCAPE_NON_ASCII";
    Object v3 = 128;
    Object v4 = 1;
    Object v5 = 93;
    Object v6 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).release();
    Object v2 = null;
    Object v3 = ")";
    Object v4 = 0;
    Object v5 = 8;
    Object v6 = 1;
    Object v7 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).release();
    Object v2 = null;
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).findName((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = -61;
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).calcHash((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(1107765), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).findName((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 53;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "write a raw (unencoded) value";
    Object v3 = new int[]{58,0,1};
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v2),((int[])v3),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v0).release();
    Object v1 = null;
    Object v2 = new int[]{0,-59};
    Object v3 = 1;
    Object v4 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v0).calcHash(((int[])v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 53;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).totalCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v1 = 0;
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v0).makeChild((((java.lang.Integer)v1).intValue()));
    ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v2).release();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).toString();
    Object v3 = "MIME-NO-LINEFEEDS";
    Object v4 = 1;
    Object v5 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).addName(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 53;
    Object v1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }
}
