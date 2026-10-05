package org.apache.commons.lang3.text.translate;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v1));
    Object v3 = ((java.lang.CharSequence)v2).toString();
    Object v4 = 0;
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v4).intValue()),((java.io.Writer)v5));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v1));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((java.io.Writer)v3).append((((java.lang.Character)v4).charValue()));
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),((java.io.Writer)v3));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v1));
    Object v3 = ((java.lang.CharSequence)v2).toString();
    Object v4 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),((java.io.Writer)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v1));
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = "";
    Object v5 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v5 = "";
    Object v6 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v5 = "";
    Object v6 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7));
    Object v9 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = "";
    Object v3 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3));
    Object v5 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = "";
    Object v3 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3));
    Object v5 = 32;
    Object v6 = java.io.Writer.nullWriter();
    ((java.io.Writer)v6).flush();
    Object v7 = null;
    Object v8 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v5 = "";
    Object v6 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7));
    Object v9 = 1;
    Object v10 = java.io.Writer.nullWriter();
    Object v11 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v8),(((java.lang.Integer)v9).intValue()),((java.io.Writer)v10));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v5 = "";
    Object v6 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7));
    Object v9 = ((java.lang.CharSequence)v8).toString();
    Object v10 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v8),((java.io.Writer)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = "";
    Object v3 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3));
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v4));
    Object v6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v10 = "";
    Object v11 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v12));
    Object v14 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v13),((java.io.Writer)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = "";
    Object v3 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3));
    Object v5 = ((java.lang.CharSequence)v4).codePoints();
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v3 = "";
    Object v4 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4));
    Object v6 = ((java.lang.CharSequence)v5).codePoints();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v5));
    Object v8 = -16;
    Object v9 = java.io.Writer.nullWriter();
    Object v10 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v7),(((java.lang.Integer)v8).intValue()),((java.io.Writer)v9));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("0"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = java.io.Writer.nullWriter();
    ((java.io.Writer)v7).flush();
    Object v8 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v7 = "";
    Object v8 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 0;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = " 1 days";
    ((java.io.Writer)v5).write(((java.lang.String)v6));
    Object v7 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = "";
    Object v9 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v11));
    Object v13 = -56;
    Object v14 = java.io.Writer.nullWriter();
    Object v15 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v12),(((java.lang.Integer)v13).intValue()),((java.io.Writer)v14));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v10 = "";
    Object v11 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v13));
    Object v15 = ((java.lang.CharSequence)v14).chars();
    Object v16 = 0;
    Object v17 = java.io.Writer.nullWriter();
    Object v18 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v14),(((java.lang.Integer)v16).intValue()),((java.io.Writer)v17));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 0;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v10 = "";
    Object v11 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v13));
    Object v15 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v14),((java.io.Writer)v15));
    Object v16 = null;
    Object v17 = 0;
    Object v18 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = 13;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = java.io.Writer.nullWriter();
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((java.io.Writer)v7).append((((java.lang.Character)v8).charValue()));
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v5 = "";
    Object v6 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((java.lang.CharSequence)v7).codePoints();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v7));
    Object v10 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v9),((java.io.Writer)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 0;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.lang.CharSequence)v4).toString();
    Object v6 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = "";
    Object v5 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5));
    Object v7 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v3 = "";
    Object v4 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4));
    Object v6 = ((java.lang.CharSequence)v5).codePoints();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v5));
    Object v8 = 1;
    Object v9 = java.io.Writer.nullWriter();
    Object v10 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v7),(((java.lang.Integer)v8).intValue()),((java.io.Writer)v9));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 0;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.Writer.nullWriter();
    ((java.io.Writer)v5).flush();
    Object v6 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 0;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = 9;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = "";
    Object v9 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v11));
    Object v13 = 0;
    Object v14 = java.io.Writer.nullWriter();
    Object v15 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v12),(((java.lang.Integer)v13).intValue()),((java.io.Writer)v14));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 0;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v6 = "";
    Object v7 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v6));
    Object v8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v9 = "";
    Object v10 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v11));
    Object v13 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v12),((java.io.Writer)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 0;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = "Reference to field ";
    ((java.io.Writer)v5).write(((java.lang.String)v6));
    Object v7 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v3 = "";
    Object v4 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4));
    Object v6 = ((java.lang.CharSequence)v5).codePoints();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v5));
    Object v8 = 0;
    Object v9 = java.io.Writer.nullWriter();
    Object v10 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v7),(((java.lang.Integer)v8).intValue()),((java.io.Writer)v9));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = "";
    Object v5 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = "";
    Object v9 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v11));
    Object v13 = ((java.lang.CharSequence)v12).chars();
    Object v14 = -23;
    Object v15 = java.io.Writer.nullWriter();
    Object v16 = new char[]{};
    ((java.io.Writer)v15).write(((char[])v16));
    Object v17 = null;
    Object v18 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v12),(((java.lang.Integer)v14).intValue()),((java.io.Writer)v15));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v5 = "";
    Object v6 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v7));
    Object v9 = 1;
    Object v10 = java.io.Writer.nullWriter();
    ((java.io.Writer)v10).close();
    Object v11 = null;
    Object v12 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v8),(((java.lang.Integer)v9).intValue()),((java.io.Writer)v10));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v5 = "";
    Object v6 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7));
    Object v9 = 2;
    Object v10 = java.io.Writer.nullWriter();
    Object v11 = new char[]{Character.valueOf((char)1)};
    ((java.io.Writer)v10).write(((char[])v11));
    Object v12 = null;
    Object v13 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v8),(((java.lang.Integer)v9).intValue()),((java.io.Writer)v10));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v6));
    Object v8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v9 = "";
    Object v10 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v12));
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 0;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = -11;
    ((java.io.Writer)v5).write((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v11 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v11));
    Object v13 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v14 = "";
    Object v15 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v14));
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v13).translate(((java.lang.CharSequence)v15));
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).translate(((java.lang.CharSequence)v16));
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v17));
    Object v19 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v18),((java.io.Writer)v19));
    Object v20 = null;
    Object v21 = 0;
    Object v22 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v5 = "";
    Object v6 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v7));
    Object v9 = ((java.lang.CharSequence)v8).codePoints();
    Object v10 = 13;
    Object v11 = java.io.Writer.nullWriter();
    Object v12 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v8),(((java.lang.Integer)v10).intValue()),((java.io.Writer)v11));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v7 = "";
    Object v8 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v11 = "";
    Object v12 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).translate(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v13));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v14));
    org.junit.Assert.assertEquals((Object)(""), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = 3;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v11 = "";
    Object v12 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).translate(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v13));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v14));
    Object v16 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v17 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v16).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v17));
    Object v19 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v20 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v21 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v19).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v20));
    Object v22 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v23 = "";
    Object v24 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v23));
    Object v25 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v22).translate(((java.lang.CharSequence)v24));
    Object v26 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v19).translate(((java.lang.CharSequence)v25));
    Object v27 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v18).translate(((java.lang.CharSequence)v26));
    Object v28 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v27));
    org.junit.Assert.assertEquals((Object)(""), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v10 = "";
    Object v11 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v13));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v14));
    org.junit.Assert.assertEquals((Object)(""), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v7 = "";
    Object v8 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    Object v10 = ((java.lang.CharSequence)v9).codePoints();
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v9));
    Object v12 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v11),((java.io.Writer)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v9 = "";
    Object v10 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10));
    Object v12 = ((java.lang.CharSequence)v11).codePoints();
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v11));
    Object v14 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v13),((java.io.Writer)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = 0;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v5 = "";
    Object v6 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v7));
    Object v9 = 1;
    Object v10 = java.io.Writer.nullWriter();
    Object v11 = "";
    ((java.io.Writer)v10).write(((java.lang.String)v11));
    Object v12 = null;
    Object v13 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v8),(((java.lang.Integer)v9).intValue()),((java.io.Writer)v10));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v6));
    Object v8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v9 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v9));
    Object v11 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v12 = "";
    Object v13 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v11).translate(((java.lang.CharSequence)v13));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).translate(((java.lang.CharSequence)v14));
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v15));
    Object v17 = ((java.lang.CharSequence)v16).chars();
    Object v18 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v16),((java.io.Writer)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v10 = "";
    Object v11 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v13));
    Object v15 = 0;
    Object v16 = java.io.Writer.nullWriter();
    Object v17 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v14),(((java.lang.Integer)v15).intValue()),((java.io.Writer)v16));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v10 = "";
    Object v11 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v13));
    Object v15 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v14),((java.io.Writer)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = 31;
    Object v4 = java.io.Writer.nullWriter();
    ((java.io.Writer)v4).close();
    Object v5 = null;
    Object v6 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v11 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v11));
    Object v13 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v13));
    Object v15 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v16 = "";
    Object v17 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v16));
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).translate(((java.lang.CharSequence)v17));
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).translate(((java.lang.CharSequence)v18));
    Object v20 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v19));
    Object v21 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v20));
    org.junit.Assert.assertEquals((Object)(""), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v11 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v11));
    Object v13 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v13));
    Object v15 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v16 = "";
    Object v17 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v16));
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).translate(((java.lang.CharSequence)v17));
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).translate(((java.lang.CharSequence)v18));
    Object v20 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v19));
    Object v21 = ((java.lang.CharSequence)v20).codePoints();
    Object v22 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v20));
    org.junit.Assert.assertEquals((Object)(""), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v6));
    Object v8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v9 = "";
    Object v10 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v11));
    Object v13 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v12),((java.io.Writer)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = 0;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.lang.CharSequence)v8).codePoints();
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v6));
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v10));
    Object v12 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v13 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v13));
    Object v15 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v16 = "";
    Object v17 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v16));
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).translate(((java.lang.CharSequence)v17));
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v14).translate(((java.lang.CharSequence)v18));
    Object v20 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v11).translate(((java.lang.CharSequence)v19));
    Object v21 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v20));
    org.junit.Assert.assertEquals((Object)(""), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v6));
    Object v8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v9 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v9));
    Object v11 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v11));
    Object v13 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v13));
    Object v15 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v16 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v16));
    Object v18 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v19 = "";
    Object v20 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v19));
    Object v21 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v18).translate(((java.lang.CharSequence)v20));
    Object v22 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v17).translate(((java.lang.CharSequence)v21));
    Object v23 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v14).translate(((java.lang.CharSequence)v22));
    Object v24 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v23));
    Object v25 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v24),((java.io.Writer)v25));
    Object v26 = null;
    Object v27 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v28 = "";
    Object v29 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v28));
    Object v30 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v27).translate(((java.lang.CharSequence)v29));
    Object v31 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v30),((java.io.Writer)v31));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v10));
    Object v12 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v11).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v12));
    Object v14 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v15 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v14).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v15));
    Object v17 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v18 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v17).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v18));
    Object v20 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v21 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v19).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v20));
    Object v22 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v23 = "";
    Object v24 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v23));
    Object v25 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v22).translate(((java.lang.CharSequence)v24));
    Object v26 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v19).translate(((java.lang.CharSequence)v25));
    Object v27 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v16).translate(((java.lang.CharSequence)v26));
    Object v28 = ((java.lang.CharSequence)v27).codePoints();
    Object v29 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v13).translate(((java.lang.CharSequence)v27));
    Object v30 = ((java.lang.CharSequence)v29).codePoints();
    Object v31 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v29),((java.io.Writer)v31));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 12;
    Object v1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("C"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v11 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v11));
    Object v13 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v13));
    Object v15 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v16 = "";
    Object v17 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v16));
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).translate(((java.lang.CharSequence)v17));
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).translate(((java.lang.CharSequence)v18));
    Object v20 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v19));
    Object v21 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v20));
    Object v22 = 12;
    Object v23 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v22).intValue()));
    Object v24 = 0;
    Object v25 = ((java.lang.CharSequence)v23).charAt((((java.lang.Integer)v24).intValue()));
    Object v26 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v23),((java.io.Writer)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v11 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v11));
    Object v13 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v14 = "";
    Object v15 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v14));
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v13).translate(((java.lang.CharSequence)v15));
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).translate(((java.lang.CharSequence)v16));
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v17));
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v18));
    org.junit.Assert.assertEquals((Object)(""), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v6));
    Object v8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v9 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v9));
    Object v11 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v12 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v11).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v12));
    Object v14 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v15 = "";
    Object v16 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v15));
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v14).translate(((java.lang.CharSequence)v16));
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v13).translate(((java.lang.CharSequence)v17));
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).translate(((java.lang.CharSequence)v18));
    Object v20 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v19));
    Object v21 = -31;
    Object v22 = java.io.Writer.nullWriter();
    Object v23 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v20),(((java.lang.Integer)v21).intValue()),((java.io.Writer)v22));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v6 = "";
    Object v7 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v9));
    Object v11 = 0;
    Object v12 = java.io.Writer.nullWriter();
    Object v13 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v10),(((java.lang.Integer)v11).intValue()),((java.io.Writer)v12));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v6));
    Object v8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v9 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v9));
    Object v11 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v11));
    Object v13 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v13));
    Object v15 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v16 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v16));
    Object v18 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v19 = "";
    Object v20 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v19));
    Object v21 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v18).translate(((java.lang.CharSequence)v20));
    Object v22 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v17).translate(((java.lang.CharSequence)v21));
    Object v23 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v14).translate(((java.lang.CharSequence)v22));
    Object v24 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v23));
    Object v25 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v24));
    org.junit.Assert.assertEquals((Object)(""), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v9));
    Object v11 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v11));
    Object v13 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v14 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v13).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v14));
    Object v16 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v17 = "";
    Object v18 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v17));
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v16).translate(((java.lang.CharSequence)v18));
    Object v20 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).translate(((java.lang.CharSequence)v19));
    Object v21 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).translate(((java.lang.CharSequence)v20));
    Object v22 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v21));
    Object v23 = ((java.lang.CharSequence)v22).toString();
    Object v24 = -69;
    Object v25 = java.io.Writer.nullWriter();
    Object v26 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v22),(((java.lang.Integer)v24).intValue()),((java.io.Writer)v25));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 12;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v10));
    Object v12 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v11).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v12));
    Object v14 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v15 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v14).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v15));
    Object v17 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v18 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v17).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v18));
    Object v20 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v21 = "";
    Object v22 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v21));
    Object v23 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v20).translate(((java.lang.CharSequence)v22));
    Object v24 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v19).translate(((java.lang.CharSequence)v23));
    Object v25 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v16).translate(((java.lang.CharSequence)v24));
    Object v26 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v13).translate(((java.lang.CharSequence)v25));
    Object v27 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v26));
    org.junit.Assert.assertEquals((Object)(""), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v11 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v11));
    Object v13 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v14 = "";
    Object v15 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v14));
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v13).translate(((java.lang.CharSequence)v15));
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).translate(((java.lang.CharSequence)v16));
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v17));
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v18));
    org.junit.Assert.assertEquals((Object)(""), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = 12;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.lang.CharSequence)v8).chars();
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 12;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.lang.CharSequence)v6).length();
    Object v8 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = 12;
    Object v10 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v9).intValue()));
    Object v11 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v10),((java.io.Writer)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 12;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v6));
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v10));
    Object v12 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v13 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v13));
    Object v15 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v16 = "";
    Object v17 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v16));
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).translate(((java.lang.CharSequence)v17));
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v14).translate(((java.lang.CharSequence)v18));
    Object v20 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v11).translate(((java.lang.CharSequence)v19));
    Object v21 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v20),((java.io.Writer)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v10 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v11 = "";
    Object v12 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).translate(((java.lang.CharSequence)v12));
    Object v14 = ((java.lang.CharSequence)v13).codePoints();
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v13));
    Object v16 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v15),((java.io.Writer)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v10 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v11 = "";
    Object v12 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).translate(((java.lang.CharSequence)v12));
    Object v14 = ((java.lang.CharSequence)v13).codePoints();
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v13));
    Object v16 = ((java.lang.CharSequence)v15).codePoints();
    Object v17 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v15),((java.io.Writer)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = 12;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = java.io.Writer.nullWriter();
    ((java.io.Writer)v9).flush();
    Object v10 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v6));
    Object v8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v9 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v9));
    Object v11 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v11));
    Object v13 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v14 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v13).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v14));
    Object v16 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v16));
    Object v18 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v18));
    Object v20 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v21 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v22 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v20).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v21));
    Object v23 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v24 = "";
    Object v25 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v24));
    Object v26 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v23).translate(((java.lang.CharSequence)v25));
    Object v27 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v22).translate(((java.lang.CharSequence)v26));
    Object v28 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v19).translate(((java.lang.CharSequence)v27));
    Object v29 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).translate(((java.lang.CharSequence)v28));
    Object v30 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v29));
    Object v31 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v30),((java.io.Writer)v31));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v10));
    Object v12 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v12));
    Object v14 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v15 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v14).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v15));
    Object v17 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v18 = "";
    Object v19 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v18));
    Object v20 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v17).translate(((java.lang.CharSequence)v19));
    Object v21 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v16).translate(((java.lang.CharSequence)v20));
    Object v22 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v13).translate(((java.lang.CharSequence)v21));
    Object v23 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v22),((java.io.Writer)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = 12;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.lang.CharSequence)v8).chars();
    Object v10 = java.io.Writer.nullWriter();
    ((java.io.Writer)v10).flush();
    Object v11 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8),((java.io.Writer)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = 12;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = 12;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v9 = "";
    Object v10 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10));
    Object v12 = ((java.lang.CharSequence)v11).codePoints();
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v11));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v13));
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v11 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v11));
    Object v13 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v14 = "";
    Object v15 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v14));
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v13).translate(((java.lang.CharSequence)v15));
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).translate(((java.lang.CharSequence)v16));
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v17));
    Object v19 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v18),((java.io.Writer)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v6));
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v10));
    Object v12 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v13 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v13));
    Object v15 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v16 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v16));
    Object v18 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v17).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v18));
    Object v20 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v21 = "";
    Object v22 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v21));
    Object v23 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v20).translate(((java.lang.CharSequence)v22));
    Object v24 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v17).translate(((java.lang.CharSequence)v23));
    Object v25 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v14).translate(((java.lang.CharSequence)v24));
    Object v26 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v11).translate(((java.lang.CharSequence)v25));
    Object v27 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v26),((java.io.Writer)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }
}
