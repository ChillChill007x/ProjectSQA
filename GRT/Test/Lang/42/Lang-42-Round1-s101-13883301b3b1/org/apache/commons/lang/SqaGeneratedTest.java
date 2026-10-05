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
    Object v4 = "922";
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
    org.apache.commons.lang.Entities.fillWithHtml40Entities(((org.apache.commons.lang.Entities)v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = new java.lang.String[][]{null,null,null};
    ((org.apache.commons.lang.Entities)v0).addEntities(((java.lang.String[][])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = new java.lang.String[][]{null,null};
    ((org.apache.commons.lang.Entities)v0).addEntities(((java.lang.String[][])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "lceil";
    Object v2 = 0;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = "\\u00w";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v4),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "javW.runtime.name";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("javW.runtime.name"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "Caught a SecurityException reading th} system property '";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("Caught a SecurityException reading th} system property '"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = new java.lang.String[][]{};
    ((org.apache.commons.lang.Entities)v0).addEntities(((java.lang.String[][])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "D";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "t";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "omi4ron";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("omi4ron"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((java.io.Writer)v1).append((((java.lang.Character)v2).charValue()));
    Object v4 = "249";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((java.io.Writer)v1).append((((java.lang.Character)v2).charValue()));
    Object v4 = "%";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "Variable prefix matcher must not be nFll!";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("Variable prefix matcher must not be nFll!"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "poujnd";
    Object v2 = -13;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v6 = 0;
    Object v7 = 0;
    ((java.io.Writer)v4).write(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "23";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v4),((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "8660a";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    Object v4 = new java.lang.String[][]{};
    ((org.apache.commons.lang.Entities)v0).addEntities(((java.lang.String[][])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = new java.lang.String[][]{null};
    ((org.apache.commons.lang.Entities)v0).addEntities(((java.lang.String[][])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "TRe number must not be NaN";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("TRe number must not be NaN"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "Invalid locale format: ";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    Object v3 = "K";
    Object v4 = ((org.apache.commons.lang.Entities)v0).entityValue(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = new org.apache.commons.lang.Entities();
    Object v3 = "javW.runtime.name";
    Object v4 = ((org.apache.commons.lang.Entities)v2).unescape(((java.lang.String)v3));
    Object v5 = ((java.io.Writer)v1).append(((java.lang.CharSequence)v4));
    Object v6 = "G";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = " is not a valid number.";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "E";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("E"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "W";
    Object v2 = ((org.apache.commons.lang.Entities)v0).entityValue(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "968";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("968"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "UTF-16BE";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = ";";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(";"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "";
    Object v2 = 1;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = new org.apache.commons.lang.Entities();
    Object v6 = ";";
    Object v7 = ((org.apache.commons.lang.Entities)v5).unescape(((java.lang.String)v6));
    Object v8 = ((java.io.Writer)v4).append(((java.lang.CharSequence)v7));
    Object v9 = "";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v4),((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "9674";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "Range[";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "-0x";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "&";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("&"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = 1;
    Object v2 = ((org.apache.commons.lang.Entities)v0).entityName((((java.lang.Integer)v1).intValue()));
    Object v3 = "exist";
    Object v4 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("exist"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.Entities)v0).entityName((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = "R";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v4),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    ((java.io.Writer)v1).flush();
    Object v2 = null;
    Object v3 = "The validated arry is empty";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = " is not supported";
    Object v2 = 1;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "0";
    Object v2 = 58;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = "X6i";
    Object v5 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("X6i"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "<210";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    Object v3 = new java.lang.String[][]{null,null,null};
    ((org.apache.commons.lang.Entities)v0).addEntities(((java.lang.String[][])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    ((java.io.Writer)v1).write(((char[])v2));
    Object v3 = null;
    Object v4 = "";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "";
    Object v2 = -2;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "";
    Object v2 = 31;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = "";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v4),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "\\";
    Object v2 = 0;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "9";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "r";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "8658";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = "Array cannot be empty";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v4),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "{";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("{"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "1.2";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1.2"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    ((java.io.Writer)v1).flush();
    Object v2 = null;
    Object v3 = "883";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "";
    Object v2 = ((org.apache.commons.lang.Entities)v0).entityValue(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = 0;
    Object v2 = ((org.apache.commons.lang.Entities)v0).entityName((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "~";
    Object v2 = ((org.apache.commons.lang.Entities)v0).entityValue(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "\"";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "S";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "!";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    Object v3 = new java.lang.String[][]{null,null,null};
    ((org.apache.commons.lang.Entities)v0).addEntities(((java.lang.String[][])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "[";
    Object v2 = -7;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "an";
    Object v2 = 0;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = " more";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "The array must not contain any null elemexts";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = 1;
    Object v2 = ((org.apache.commons.lang.Entities)v0).entityName((((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.String[][]{null,null};
    ((org.apache.commons.lang.Entities)v0).addEntities(((java.lang.String[][])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "user.country";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "eist";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = " ";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "!";
    Object v2 = ((org.apache.commons.lang.Entities)v0).entityValue(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "The Array must not be null";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = "8773";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v4),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "338";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("338"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
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
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "os.#name";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    Object v3 = "uAr";
    Object v4 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("uAr"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "223";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "Cannot get the toString of a null identity";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "\\u000";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((java.io.Writer)v1).append((((java.lang.Character)v2).charValue()));
    Object v4 = "i";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "ange[";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = " is incomplete.";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "The numbers must not be NaN";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
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
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "The Writer must not be null.";
    Object v2 = 21;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "871C5";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "\\u";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("\\u"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    ((java.io.Writer)v1).flush();
    Object v2 = null;
    Object v3 = "917";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    ((java.io.Writer)v1).write(((char[])v2));
    Object v3 = null;
    Object v4 = "X";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    Object v4 = new java.lang.String[][]{};
    ((org.apache.commons.lang.Entities)v0).addEntities(((java.lang.String[][])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    ((java.io.Writer)v1).close();
    Object v2 = null;
    Object v3 = "x";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "";
    Object v2 = ((org.apache.commons.lang.Entities)v0).escape(((java.lang.String)v1));
    Object v3 = "plusmn";
    Object v4 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("plusmn"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "X";
    Object v2 = ((org.apache.commons.lang.Entities)v0).entityValue(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "&";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "";
    Object v2 = 49;
    ((org.apache.commons.lang.Entities)v0).addEntity(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = "";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v4),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "962";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "7";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "[";
    ((org.apache.commons.lang.Entities)v0).unescape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "185";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("185"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = java.io.Writer.nullWriter();
    Object v2 = "1.5";
    ((org.apache.commons.lang.Entities)v0).escape(((java.io.Writer)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.lang.Entities();
    Object v1 = "The Array must not be null";
    Object v2 = ((org.apache.commons.lang.Entities)v0).unescape(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("The Array must not be null"), v2);
  }
}
