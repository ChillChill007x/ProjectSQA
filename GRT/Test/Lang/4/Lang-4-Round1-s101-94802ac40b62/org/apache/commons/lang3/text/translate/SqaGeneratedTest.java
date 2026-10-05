package org.apache.commons.lang3.text.translate;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new java.lang.CharSequence[][]{null};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = "&Auml";
    Object v4 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v3));
    Object v5 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = "&Auml";
    Object v4 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)("&Auml"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = "&Auml";
    Object v4 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4));
    Object v6 = "&Auml";
    Object v7 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v7));
    org.junit.Assert.assertEquals((Object)("&Auml"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -10;
    Object v4 = -21;
    Object v5 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "&Auml";
    Object v7 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7));
    Object v9 = "&Auml";
    Object v10 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v10));
    Object v12 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v11),((java.io.Writer)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = -10;
    Object v5 = -21;
    Object v6 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = "&Auml";
    Object v8 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    Object v10 = ((java.lang.CharSequence)v9).codePoints();
    Object v11 = -1;
    Object v12 = java.io.Writer.nullWriter();
    Object v13 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v9),(((java.lang.Integer)v11).intValue()),((java.io.Writer)v12));
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -10;
    Object v3 = -21;
    Object v4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "&Auml";
    Object v6 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((java.lang.CharSequence)v7).chars();
    Object v9 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7),((java.io.Writer)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -10;
    Object v3 = -21;
    Object v4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "&Auml";
    Object v6 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = "&Auml";
    Object v9 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v10));
    org.junit.Assert.assertEquals((Object)("&Auml"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -10;
    Object v4 = -21;
    Object v5 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "&Auml";
    Object v7 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v8));
    org.junit.Assert.assertEquals((Object)("&Auml"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -10;
    Object v3 = -21;
    Object v4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "&Auml";
    Object v6 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = "&Auml";
    Object v9 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v9));
    Object v11 = 0;
    Object v12 = java.io.Writer.nullWriter();
    Object v13 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v10),(((java.lang.Integer)v11).intValue()),((java.io.Writer)v12));
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -10;
    Object v3 = -21;
    Object v4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "&Auml";
    Object v6 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = 0;
    Object v9 = ((java.lang.CharSequence)v7).charAt((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7));
    org.junit.Assert.assertEquals((Object)("&Auml"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new java.lang.CharSequence[][]{null,null,null};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 1;
    Object v1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("1"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -10;
    Object v3 = -21;
    Object v4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "&Auml";
    Object v6 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = "&Auml";
    Object v9 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v9));
    Object v11 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v10),((java.io.Writer)v11));
    Object v12 = null;
    Object v13 = -10;
    Object v14 = -21;
    Object v15 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "&Auml";
    Object v17 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v16));
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).translate(((java.lang.CharSequence)v17));
    Object v19 = "&Auml";
    Object v20 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v19));
    Object v21 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).translate(((java.lang.CharSequence)v20));
    Object v22 = 1;
    Object v23 = java.io.Writer.nullWriter();
    Object v24 = 1;
    Object v25 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v24).intValue()));
    Object v26 = ((java.io.Writer)v23).append(((java.lang.CharSequence)v25));
    Object v27 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v21),(((java.lang.Integer)v22).intValue()),((java.io.Writer)v23));
    org.junit.Assert.assertEquals((Object)(0), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)("1"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -10;
    Object v3 = -21;
    Object v4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((java.lang.CharSequence)v7).codePoints();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7));
    org.junit.Assert.assertEquals((Object)("1"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -10;
    Object v3 = -21;
    Object v4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "&Auml";
    Object v6 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = "&Auml";
    Object v9 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v9));
    Object v11 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v10),((java.io.Writer)v11));
    Object v12 = null;
    Object v13 = "&Auml";
    Object v14 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v13));
    Object v15 = 6;
    Object v16 = java.io.Writer.nullWriter();
    Object v17 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v14),(((java.lang.Integer)v15).intValue()),((java.io.Writer)v16));
    org.junit.Assert.assertEquals((Object)(0), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = -10;
    Object v5 = -21;
    Object v6 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = "&Auml";
    Object v8 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v9));
    org.junit.Assert.assertEquals((Object)("&Auml"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new java.lang.CharSequence[][]{};
    Object v3 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v2));
    Object v4 = -10;
    Object v5 = -21;
    Object v6 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    Object v10 = ((java.lang.CharSequence)v9).codePoints();
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v9));
    Object v12 = java.io.Writer.nullWriter();
    Object v13 = "\\E";
    ((java.io.Writer)v12).write(((java.lang.String)v13));
    Object v14 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v11),((java.io.Writer)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -10;
    Object v3 = -21;
    Object v4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7));
    org.junit.Assert.assertEquals((Object)("1"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new java.lang.CharSequence[][]{};
    Object v5 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v4));
    Object v6 = -10;
    Object v7 = -21;
    Object v8 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v12));
    org.junit.Assert.assertEquals((Object)("1"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new java.lang.CharSequence[][]{};
    Object v5 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v4));
    Object v6 = -10;
    Object v7 = -21;
    Object v8 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v11));
    Object v13 = ((java.lang.CharSequence)v12).chars();
    Object v14 = 25;
    Object v15 = java.io.Writer.nullWriter();
    Object v16 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v12),(((java.lang.Integer)v14).intValue()),((java.io.Writer)v15));
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new java.lang.CharSequence[][]{};
    Object v3 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v2));
    Object v4 = -10;
    Object v5 = -21;
    Object v6 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v9));
    Object v11 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v10),((java.io.Writer)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new java.lang.CharSequence[][]{};
    Object v3 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = -10;
    Object v7 = -21;
    Object v8 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "&Auml";
    Object v10 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v11));
    Object v13 = 0;
    Object v14 = java.io.Writer.nullWriter();
    Object v15 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v12),(((java.lang.Integer)v13).intValue()),((java.io.Writer)v14));
    org.junit.Assert.assertEquals((Object)(0), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new java.lang.CharSequence[][]{};
    Object v3 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = new java.lang.CharSequence[][]{};
    Object v7 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v6));
    Object v8 = -10;
    Object v9 = -21;
    Object v10 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).translate(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v13));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v14));
    Object v16 = 54;
    Object v17 = java.io.Writer.nullWriter();
    Object v18 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v15),(((java.lang.Integer)v16).intValue()),((java.io.Writer)v17));
    org.junit.Assert.assertEquals((Object)(0), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new java.lang.CharSequence[][]{};
    Object v3 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = new java.lang.CharSequence[][]{};
    Object v7 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v6));
    Object v8 = -10;
    Object v9 = -21;
    Object v10 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).translate(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v13));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v14));
    Object v16 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v15),((java.io.Writer)v16));
    Object v17 = null;
    Object v18 = 1;
    Object v19 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v18).intValue()));
    Object v20 = 0;
    Object v21 = java.io.Writer.nullWriter();
    Object v22 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    ((java.io.Writer)v21).write(((char[])v22));
    Object v23 = null;
    Object v24 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v19),(((java.lang.Integer)v20).intValue()),((java.io.Writer)v21));
    org.junit.Assert.assertEquals((Object)(0), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -10;
    Object v4 = -21;
    Object v5 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "&Auml";
    Object v7 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7));
    Object v9 = "&Auml";
    Object v10 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v11));
    org.junit.Assert.assertEquals((Object)("&Auml"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -10;
    Object v3 = -21;
    Object v4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "&Auml";
    Object v6 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7),((java.io.Writer)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new java.lang.CharSequence[][]{};
    Object v3 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v2));
    Object v4 = -10;
    Object v5 = -21;
    Object v6 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = "&Auml";
    Object v8 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    Object v10 = "&Auml";
    Object v11 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v12));
    Object v14 = 1;
    Object v15 = java.io.Writer.nullWriter();
    Object v16 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v13),(((java.lang.Integer)v14).intValue()),((java.io.Writer)v15));
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -10;
    Object v4 = -21;
    Object v5 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "&Auml";
    Object v7 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7));
    Object v9 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new java.lang.CharSequence[][]{};
    Object v3 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v2));
    Object v4 = -10;
    Object v5 = -21;
    Object v6 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = "&Auml";
    Object v8 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    Object v10 = "&Auml";
    Object v11 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v12));
    Object v14 = 10;
    Object v15 = java.io.Writer.nullWriter();
    Object v16 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v13),(((java.lang.Integer)v14).intValue()),((java.io.Writer)v15));
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = "&Auml";
    Object v3 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v2));
    Object v4 = ((java.lang.CharSequence)v3).codePoints();
    Object v5 = 23;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v3),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new java.lang.CharSequence[][]{};
    Object v3 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v2));
    Object v4 = -10;
    Object v5 = -21;
    Object v6 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = "&Auml";
    Object v8 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    Object v10 = "&Auml";
    Object v11 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v13));
    Object v15 = -10;
    Object v16 = -21;
    Object v17 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "&Auml";
    Object v19 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v18));
    Object v20 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v17).translate(((java.lang.CharSequence)v19));
    Object v21 = "&Auml";
    Object v22 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v21));
    Object v23 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v17).translate(((java.lang.CharSequence)v22));
    Object v24 = 1;
    Object v25 = java.io.Writer.nullWriter();
    ((java.io.Writer)v25).close();
    Object v26 = null;
    Object v27 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v23),(((java.lang.Integer)v24).intValue()),((java.io.Writer)v25));
    org.junit.Assert.assertEquals((Object)(0), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = "&Auml";
    Object v3 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v2));
    Object v4 = -29;
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v3),(((java.lang.Integer)v4).intValue()),((java.io.Writer)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.lang.CharSequence)v4).chars();
    Object v6 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new java.lang.CharSequence[][]{null,null};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -10;
    Object v3 = -21;
    Object v4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((java.lang.CharSequence)v7).chars();
    Object v9 = 21;
    Object v10 = java.io.Writer.nullWriter();
    Object v11 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v7),(((java.lang.Integer)v9).intValue()),((java.io.Writer)v10));
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -10;
    Object v3 = -21;
    Object v4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((java.lang.CharSequence)v7).toString();
    Object v9 = 0;
    Object v10 = java.io.Writer.nullWriter();
    Object v11 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v7),(((java.lang.Integer)v9).intValue()),((java.io.Writer)v10));
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.CharSequence[][]{};
    Object v4 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v3));
    Object v5 = -10;
    Object v6 = -21;
    Object v7 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v10));
    Object v12 = java.io.Writer.nullWriter();
    ((java.io.Writer)v12).close();
    Object v13 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v11),((java.io.Writer)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -10;
    Object v3 = -21;
    Object v4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = 42;
    Object v9 = java.io.Writer.nullWriter();
    Object v10 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v7),(((java.lang.Integer)v8).intValue()),((java.io.Writer)v9));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new java.lang.CharSequence[][]{};
    Object v8 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v7));
    Object v9 = -10;
    Object v10 = -21;
    Object v11 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "&Auml";
    Object v13 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v11).translate(((java.lang.CharSequence)v13));
    Object v15 = 0;
    Object v16 = ((java.lang.CharSequence)v14).charAt((((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v14));
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -10;
    Object v3 = -21;
    Object v4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "&Auml";
    Object v6 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = "&Auml";
    Object v9 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v9));
    Object v11 = ((java.lang.CharSequence)v10).codePoints();
    Object v12 = -12;
    Object v13 = java.io.Writer.nullWriter();
    Object v14 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v10),(((java.lang.Integer)v12).intValue()),((java.io.Writer)v13));
    org.junit.Assert.assertEquals((Object)(0), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new java.lang.CharSequence[][]{};
    Object v3 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v2));
    Object v4 = -10;
    Object v5 = -21;
    Object v6 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    Object v10 = ((java.lang.CharSequence)v9).codePoints();
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v9));
    Object v12 = 1;
    Object v13 = java.io.Writer.nullWriter();
    Object v14 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v11),(((java.lang.Integer)v12).intValue()),((java.io.Writer)v13));
    Object v15 = -10;
    Object v16 = -21;
    Object v17 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v18).intValue()));
    Object v20 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v17).translate(((java.lang.CharSequence)v19));
    Object v21 = 0;
    Object v22 = java.io.Writer.nullWriter();
    Object v23 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v20),(((java.lang.Integer)v21).intValue()),((java.io.Writer)v22));
    org.junit.Assert.assertEquals((Object)(0), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = -10;
    Object v6 = -21;
    Object v7 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -10;
    Object v3 = -21;
    Object v4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "&Auml";
    Object v6 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7));
    org.junit.Assert.assertEquals((Object)("&Auml"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new java.lang.CharSequence[][]{};
    Object v8 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v7));
    Object v9 = -10;
    Object v10 = -21;
    Object v11 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "&Auml";
    Object v13 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v11).translate(((java.lang.CharSequence)v13));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v14));
    Object v16 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v15),((java.io.Writer)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = -10;
    Object v6 = -21;
    Object v7 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = "&Auml";
    Object v9 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v9));
    Object v11 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v10),((java.io.Writer)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new java.lang.CharSequence[][]{};
    Object v3 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v2));
    Object v4 = -10;
    Object v5 = -21;
    Object v6 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v9));
    Object v11 = -20;
    Object v12 = java.io.Writer.nullWriter();
    Object v13 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v10),(((java.lang.Integer)v11).intValue()),((java.io.Writer)v12));
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new java.lang.CharSequence[][]{};
    Object v3 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v2));
    Object v4 = -10;
    Object v5 = -21;
    Object v6 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v10));
    org.junit.Assert.assertEquals((Object)("1"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = -2;
    Object v1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("FFFFFFFE"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = -2;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.lang.CharSequence)v6).chars();
    Object v8 = java.io.Writer.nullWriter();
    Object v9 = -2;
    Object v10 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v9).intValue()));
    Object v11 = ((java.io.Writer)v8).append(((java.lang.CharSequence)v10));
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.CharSequence[][]{};
    Object v4 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = -10;
    Object v8 = -21;
    Object v9 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "&Auml";
    Object v11 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v13));
    org.junit.Assert.assertEquals((Object)("&Auml"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = -2;
    Object v5 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v4).intValue()));
    Object v6 = -13;
    Object v7 = java.io.Writer.nullWriter();
    Object v8 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v5),(((java.lang.Integer)v6).intValue()),((java.io.Writer)v7));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = -10;
    Object v6 = -21;
    Object v7 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = "&Auml";
    Object v9 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v9));
    Object v11 = "&Auml";
    Object v12 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4));
    Object v6 = -10;
    Object v7 = -21;
    Object v8 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "&Auml";
    Object v10 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10));
    Object v12 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v11),((java.io.Writer)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -2;
    Object v3 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.lang.CharSequence)v3).chars();
    Object v5 = 27;
    Object v6 = java.io.Writer.nullWriter();
    ((java.io.Writer)v6).close();
    Object v7 = null;
    Object v8 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v3),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -2;
    Object v3 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3),((java.io.Writer)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -10;
    Object v3 = -21;
    Object v4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = java.io.Writer.nullWriter();
    Object v9 = "";
    ((java.io.Writer)v8).write(((java.lang.String)v9));
    Object v10 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7),((java.io.Writer)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = -10;
    Object v8 = -21;
    Object v9 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -10;
    Object v11 = -21;
    Object v12 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "&Auml";
    Object v14 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v13));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).translate(((java.lang.CharSequence)v14));
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v15));
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -2;
    Object v3 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.lang.CharSequence)v3).codePoints();
    Object v5 = 3;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = -2;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.io.Writer)v6).append(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v3),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -2;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)("FFFFFFFE"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -2;
    Object v3 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3));
    Object v5 = new java.lang.CharSequence[][]{};
    Object v6 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = -10;
    Object v10 = -21;
    Object v11 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "&Auml";
    Object v13 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((java.lang.String)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v11).translate(((java.lang.CharSequence)v13));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v14));
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v15));
    org.junit.Assert.assertEquals((Object)("&Auml"), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = -2;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -2;
    Object v3 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3));
    Object v5 = -2;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v6));
    org.junit.Assert.assertEquals((Object)("FFFFFFFE"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new java.lang.CharSequence[][]{};
    Object v5 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v4));
    Object v6 = new java.lang.CharSequence[][]{};
    Object v7 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v6));
    Object v8 = -10;
    Object v9 = -21;
    Object v10 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).translate(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v13));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v14));
    Object v16 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v15),((java.io.Writer)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -2;
    Object v3 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v3),(((java.lang.Integer)v4).intValue()),((java.io.Writer)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new java.lang.CharSequence[][]{};
    Object v3 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v2));
    Object v4 = -2;
    Object v5 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5));
    Object v7 = -2;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v9));
    org.junit.Assert.assertEquals((Object)("FFFFFFFE"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -10;
    Object v3 = -21;
    Object v4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = 0;
    Object v9 = java.io.Writer.nullWriter();
    Object v10 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v7),(((java.lang.Integer)v8).intValue()),((java.io.Writer)v9));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new java.lang.CharSequence[][]{};
    Object v6 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v5));
    Object v7 = new java.lang.CharSequence[][]{};
    Object v8 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v7));
    Object v9 = -2;
    Object v10 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10));
    Object v12 = -2;
    Object v13 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v13));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v14));
    Object v16 = java.io.Writer.nullWriter();
    Object v17 = "OpHnBSD";
    Object v18 = 0;
    Object v19 = 0;
    ((java.io.Writer)v16).write(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v15),((java.io.Writer)v16));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.CharSequence[][]{};
    Object v4 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v3));
    Object v5 = new java.lang.CharSequence[][]{};
    Object v6 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v5));
    Object v7 = -10;
    Object v8 = -21;
    Object v9 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    Object v11 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v13));
    Object v15 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v14),((java.io.Writer)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new java.lang.CharSequence[][]{};
    Object v6 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v5));
    Object v7 = -2;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    Object v10 = -2;
    Object v11 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v11));
    Object v13 = 0;
    Object v14 = ((java.lang.CharSequence)v12).charAt((((java.lang.Integer)v13).intValue()));
    Object v15 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v12),((java.io.Writer)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = -2;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = -2;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.lang.CharSequence)v6).length();
    Object v8 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new java.lang.CharSequence[][]{};
    Object v6 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v5));
    Object v7 = new java.lang.CharSequence[][]{};
    Object v8 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v7));
    Object v9 = -10;
    Object v10 = -21;
    Object v11 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v11).translate(((java.lang.CharSequence)v13));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v14));
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v15));
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = -2;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = -2;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.lang.CharSequence)v6).toString();
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("0"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new java.lang.CharSequence[][]{};
    Object v8 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v7));
    Object v9 = new java.lang.CharSequence[][]{};
    Object v10 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v9));
    Object v11 = -10;
    Object v12 = -21;
    Object v13 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v13).translate(((java.lang.CharSequence)v15));
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).translate(((java.lang.CharSequence)v16));
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v17));
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -2;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3),((java.io.Writer)v4));
    Object v5 = null;
    Object v6 = new java.lang.CharSequence[][]{};
    Object v7 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v6));
    Object v8 = new java.lang.CharSequence[][]{};
    Object v9 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v8));
    Object v10 = -10;
    Object v11 = -21;
    Object v12 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).translate(((java.lang.CharSequence)v14));
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v15));
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v16));
    Object v18 = 2;
    Object v19 = java.io.Writer.nullWriter();
    Object v20 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v17),(((java.lang.Integer)v18).intValue()),((java.io.Writer)v19));
    org.junit.Assert.assertEquals((Object)(0), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -10;
    Object v4 = -21;
    Object v5 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7));
    Object v9 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new java.lang.CharSequence[][]{};
    Object v3 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v2));
    Object v4 = -2;
    Object v5 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5));
    Object v7 = -2;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v9));
    Object v11 = 0;
    Object v12 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v11).intValue()));
    Object v13 = -41;
    Object v14 = java.io.Writer.nullWriter();
    Object v15 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v12),(((java.lang.Integer)v13).intValue()),((java.io.Writer)v14));
    org.junit.Assert.assertEquals((Object)(0), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = -2;
    Object v9 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v8).intValue()));
    Object v10 = ((java.lang.CharSequence)v9).codePoints();
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v9));
    org.junit.Assert.assertEquals((Object)("FFFFFFFE"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = new java.lang.CharSequence[][]{};
    Object v3 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v2));
    Object v4 = new java.lang.CharSequence[][]{};
    Object v5 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v4));
    Object v6 = -2;
    Object v7 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7));
    Object v9 = -2;
    Object v10 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v11));
    Object v13 = ((java.lang.CharSequence)v12).chars();
    Object v14 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v12),((java.io.Writer)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = ((java.lang.CharSequence)v6).charAt((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    org.junit.Assert.assertEquals((Object)("0"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -2;
    Object v3 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = 15;
    ((java.io.Writer)v5).write((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v3),(((java.lang.Integer)v4).intValue()),((java.io.Writer)v5));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = -10;
    Object v6 = -21;
    Object v7 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v11));
    Object v13 = -2;
    Object v14 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v13).intValue()));
    Object v15 = ((java.lang.CharSequence)v14).codePoints();
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v14));
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    org.junit.Assert.assertEquals((Object)("0"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = -2;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    org.junit.Assert.assertEquals((Object)("FFFFFFFE"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    org.junit.Assert.assertEquals((Object)("1"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new java.lang.CharSequence[][]{};
    Object v1 = new org.apache.commons.lang3.text.translate.LookupTranslator(((java.lang.CharSequence[][])v0));
    Object v2 = -2;
    Object v3 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = ((org.apache.commons.lang3.text.translate.LookupTranslator)v1).translate(((java.lang.CharSequence)v3),(((java.lang.Integer)v4).intValue()),((java.io.Writer)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = -21;
    Object v2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = 0;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
