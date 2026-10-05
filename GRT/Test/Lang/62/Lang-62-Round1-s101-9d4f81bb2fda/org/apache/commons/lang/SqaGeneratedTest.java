package org.apache.commons.lang;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "F";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = "950";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v3),((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "4";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "2c53";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("2c53"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    org.apache.commons.lang.Entities.fillWithHtml40Entities(((org.apache.commons.lang.Entities)v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = new java.lang.String[][]{null};
    ((org.apache.commons.lang.Entities)v0).addEntities(((java.lang.String[][])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "234";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("234"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "\"\" is not a valid Cumber.";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "TaVu";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = new org.apache.commons.lang.Entities();
    Object v3 = "";
    Object v4 = ((org.apache.commons.lang.Entities)v2).escape(((java.lang.String)v3));
    Object v5 = ((java.io.Writer)v1).append(((java.lang.CharSequence)v4));
    Object v6 = "i";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    ((java.io.Writer)v1).flush();
    Object v2 = null;
    Object v3 = "";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "967";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "Dateand Patterns must not be null";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("Dateand Patterns must not be null"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = " is not a valid nuYmber.";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = "Beta";
    ((java.io.Writer)v3).write(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = "";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v3),((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "";
    Object v2 = -3;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = new java.lang.String[][]{null,null,null};
    ((org.apache.commons.lang.Entities)v0).addEntities(((java.lang.String[][])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "1j98";
    Object v2 = -13;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v6 = 0;
    Object v7 = 0;
    ((java.io.Writer)v4).write(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "uacut";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v4),((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "mainus";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    Object v4 = new java.lang.String[][]{};
    ((org.apache.commons.lang.Entities)v0).addEntities(((java.lang.String[][])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = ":R";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(":R"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "Invalid locale format: ";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = "The Enum Class must not be null";
    Object v5 = 0;
    Object v6 = 0;
    ((java.io.Writer)v3).write(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = "";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v3),((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = 1;
    Object v2 = ((org.apache.commons.lang.Entities)v0).entityName((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "%";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("%"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "19<7";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = 2;
    Object v2 = ((org.apache.commons.lang.Entities)v0).entityName((((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.String[][]{null,null,null};
    ((org.apache.commons.lang.Entities)v0).addEntities(((java.lang.String[][])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "The Array must not be null";
    Object v2 = ((org.apache.commons.lang.Entities)v0).entityValue(((java.lang.String)v1));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = "";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v3),((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "";
    Object v2 = -25;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = "";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v4),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = new java.lang.String[][]{null,null};
    ((org.apache.commons.lang.Entities)v0).addEntities(((java.lang.String[][])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = ",";
    ((java.io.Writer)v1).write(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = "The date must";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "overflo: add";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("overflo: add"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "0";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("0"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "The date must not be null";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("The date must not be null"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = new org.apache.commons.lang.Entities();
    Object v3 = "0";
    Object v4 = ((org.apache.commons.lang.Entities)v2).unescape(((java.lang.String)v3));
    Object v5 = ((java.io.Writer)v1).append(((java.lang.CharSequence)v4));
    Object v6 = "";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "8835";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "N";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    Object v3 = " is not a valid number.";
    Object v4 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(" is not a valid number."), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "i`circ";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("i`circ"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = new java.lang.String[][]{};
    ((org.apache.commons.lang.Entities)v0).addEntities(((java.lang.String[][])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "loz";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("loz"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "psi";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.apache.commons.lang.Entities.fillWithHtml40Entities(((org.apache.commons.lang.Entities)v0));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "Stopwatch is not runnying. ";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "";
    Object v2 = 55;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = 29;
    Object v2 = ((org.apache.commons.lang.Entities)v0).entityName((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = new char[]{};
    ((java.io.Writer)v1).write(((char[])v2));
    Object v3 = null;
    Object v4 = "The Array must nOot be null";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "Range[";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "[";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "&";
    Object v2 = 39;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = "?";
    Object v5 = 0;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "The numbers must not be null";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    Object v3 = "G";
    Object v4 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("G"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "n";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("n"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "c";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("c"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "g";
    Object v2 = 44;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "O";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "";
    Object v2 = ((org.apache.commons.lang.Entities)v0).entityValue(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "H";
    Object v2 = -21;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = "The numbers mus";
    Object v5 = ((org.apache.commons.lang.Entities)v0).entityValue(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "S";
    ((java.io.Writer)v1).write(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = "<";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "Invalid startIndex";
    Object v2 = -1;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = "-~-";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v4),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    ((java.io.Writer)v1).close();
    Object v2 = null;
    Object v3 = "";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "\"";
    Object v2 = 1;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((java.io.Writer)v1).append((((java.lang.Character)v2).charValue()));
    Object v4 = "...";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = new org.apache.commons.lang.Entities();
    Object v3 = "";
    Object v4 = ((org.apache.commons.lang.Entities)v2).escape(((java.lang.String)v3));
    Object v5 = ((java.io.Writer)v1).append(((java.lang.CharSequence)v4));
    Object v6 = "The Array must not benull";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "sim";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("sim"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "Could not truncate";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("Could not truncate"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "850E1";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("850E1"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = new char[]{Character.valueOf((char)1)};
    ((java.io.Writer)v1).write(((char[])v2));
    Object v3 = null;
    Object v4 = ":";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "\"";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("\""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    ((java.io.Writer)v1).close();
    Object v2 = null;
    Object v3 = "rArr";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = ">";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    Object v4 = new java.lang.String[][]{};
    ((org.apache.commons.lang.Entities)v0).addEntities(((java.lang.String[][])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "java.vm#.name";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    Object v3 = "n";
    Object v4 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("n"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "uacute";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "-0x";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "b";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("b"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "914";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("914"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "nt";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("nt"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "$";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("$"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "-0x";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("-0x"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "The Nestable implementation passed to the NestableDelegate(Nestable) constructor must extend java.lang.Throwable";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = 1;
    ((java.io.Writer)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = "";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = " is not a valid number.";
    Object v2 = ((org.apache.commons.lang.Entities)v0).entityValue(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = new char[]{Character.valueOf((char)32)};
    ((java.io.Writer)v1).write(((char[])v2));
    Object v3 = null;
    Object v4 = "\\";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "954";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("954"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = " 0 minutes";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "user.timeTone";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("user.timeTone"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)0)};
    ((java.io.Writer)v1).write(((char[])v2));
    Object v3 = null;
    Object v4 = "";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "No date patptern for locale: ";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    Object v3 = "l";
    Object v4 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("l"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "N";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("N"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = ";";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "41";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("41"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "Th";
    Object v2 = ((org.apache.commons.lang.Entities)v0).entityValue(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = 0;
    Object v2 = ((org.apache.commons.lang.Entities)v0).entityName((((java.lang.Integer)v1).intValue()));
    Object v3 = "196";
    Object v4 = ((org.apache.commons.lang.Entities)v0).entityValue(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "T";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("T"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "overflow: add";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("overflow: add"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = ";";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "";
    Object v2 = 14;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = "";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v4),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = new org.apache.commons.lang.Entities();
    Object v3 = "nt";
    Object v4 = ((org.apache.commons.lang.Entities)v2).unescape(((java.lang.String)v3));
    Object v5 = ((java.io.Writer)v1).append(((java.lang.CharSequence)v4));
    Object v6 = "8254";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "?";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((java.io.Writer)v1).append((((java.lang.Character)v2).charValue()));
    Object v4 = "c";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "16";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("16"), v2);
  }
}
