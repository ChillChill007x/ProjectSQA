package org.apache.commons.lang3.text.translate;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v3 = true;
    Object v4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v1),((org.apache.commons.lang3.builder.ToStringStyle)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((java.lang.CharSequence)v4).subSequence((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 35;
    Object v9 = java.io.Writer.nullWriter();
    Object v10 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v8).intValue()),((java.io.Writer)v9));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v3 = true;
    Object v4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v1),((org.apache.commons.lang3.builder.ToStringStyle)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v3 = true;
    Object v4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v1),((org.apache.commons.lang3.builder.ToStringStyle)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
    Object v8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v9 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v10 = true;
    Object v11 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v8),((org.apache.commons.lang3.builder.ToStringStyle)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((java.lang.CharSequence)v11).chars();
    Object v13 = 0;
    Object v14 = java.io.Writer.nullWriter();
    Object v15 = new char[]{};
    ((java.io.Writer)v14).write(((char[])v15));
    Object v16 = null;
    Object v17 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v11),(((java.lang.Integer)v13).intValue()),((java.io.Writer)v14));
    org.junit.Assert.assertEquals((Object)(0), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v3 = true;
    Object v4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v1),((org.apache.commons.lang3.builder.ToStringStyle)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v9 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v10 = true;
    Object v11 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v8),((org.apache.commons.lang3.builder.ToStringStyle)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v11));
    Object v13 = ((java.lang.CharSequence)v12).chars();
    Object v14 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v12),((java.io.Writer)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 1;
    Object v1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("1"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),((java.io.Writer)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = 2;
    ((java.io.Writer)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),((java.io.Writer)v3));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2));
    Object v4 = 1;
    Object v5 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v5));
    org.junit.Assert.assertEquals((Object)("1"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v6));
    Object v8 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v7),((java.io.Writer)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v4 = true;
    Object v5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v2),((org.apache.commons.lang3.builder.ToStringStyle)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v9 = true;
    Object v10 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v7),((org.apache.commons.lang3.builder.ToStringStyle)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v10));
    Object v12 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v11),((java.io.Writer)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v4 = true;
    Object v5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v2),((org.apache.commons.lang3.builder.ToStringStyle)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v9 = true;
    Object v10 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v7),((org.apache.commons.lang3.builder.ToStringStyle)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v10));
    Object v12 = -17;
    Object v13 = java.io.Writer.nullWriter();
    Object v14 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v11),(((java.lang.Integer)v12).intValue()),((java.io.Writer)v13));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v5 = true;
    Object v6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v3),((org.apache.commons.lang3.builder.ToStringStyle)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1;
    Object v8 = ((java.lang.CharSequence)v6).charAt((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v10));
    Object v12 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v13 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v14 = true;
    Object v15 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v12),((org.apache.commons.lang3.builder.ToStringStyle)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 1;
    Object v17 = java.io.Writer.nullWriter();
    Object v18 = 0;
    ((java.io.Writer)v17).write((((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v15),(((java.lang.Integer)v16).intValue()),((java.io.Writer)v17));
    org.junit.Assert.assertEquals((Object)(0), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.lang.CharSequence)v2).chars();
    Object v4 = -41;
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v4).intValue()),((java.io.Writer)v5));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.lang.CharSequence)v2).toString();
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2));
    org.junit.Assert.assertEquals((Object)("1"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.lang.CharSequence)v4).toString();
    Object v6 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = 1;
    Object v5 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.lang.CharSequence)v5).toString();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5));
    Object v8 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v7),((java.io.Writer)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = 8;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v4 = true;
    Object v5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v2),((org.apache.commons.lang3.builder.ToStringStyle)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v9 = true;
    Object v10 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v7),((org.apache.commons.lang3.builder.ToStringStyle)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v10));
    Object v12 = 1;
    Object v13 = java.io.Writer.nullWriter();
    Object v14 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v11),(((java.lang.Integer)v12).intValue()),((java.io.Writer)v13));
    org.junit.Assert.assertEquals((Object)(0), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2));
    Object v4 = 1;
    Object v5 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = java.io.Writer.nullWriter();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0)};
    ((java.io.Writer)v7).write(((char[])v8));
    Object v9 = null;
    Object v10 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v5),(((java.lang.Integer)v6).intValue()),((java.io.Writer)v7));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)("1"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v5 = true;
    Object v6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v3),((org.apache.commons.lang3.builder.ToStringStyle)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v4 = true;
    Object v5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v2),((org.apache.commons.lang3.builder.ToStringStyle)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v9 = true;
    Object v10 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v7),((org.apache.commons.lang3.builder.ToStringStyle)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v10));
    Object v12 = java.io.Writer.nullWriter();
    ((java.io.Writer)v12).flush();
    Object v13 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v11),((java.io.Writer)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v4 = true;
    Object v5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v2),((org.apache.commons.lang3.builder.ToStringStyle)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v9 = true;
    Object v10 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v7),((org.apache.commons.lang3.builder.ToStringStyle)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v10));
    Object v12 = 0;
    Object v13 = java.io.Writer.nullWriter();
    Object v14 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v11),(((java.lang.Integer)v12).intValue()),((java.io.Writer)v13));
    org.junit.Assert.assertEquals((Object)(0), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = 46;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = 1;
    Object v5 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5));
    Object v7 = 2;
    Object v8 = java.io.Writer.nullWriter();
    Object v9 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v6),(((java.lang.Integer)v7).intValue()),((java.io.Writer)v8));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v6 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v7 = true;
    Object v8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v5),((org.apache.commons.lang3.builder.ToStringStyle)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v8));
    Object v10 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v11 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v12 = true;
    Object v13 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v10),((org.apache.commons.lang3.builder.ToStringStyle)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v13));
    Object v15 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v14),((java.io.Writer)v15));
    Object v16 = null;
    Object v17 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v18 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v19 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v20 = true;
    Object v21 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v18),((org.apache.commons.lang3.builder.ToStringStyle)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v17).translate(((java.lang.CharSequence)v21));
    Object v23 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v24 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v25 = true;
    Object v26 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v23),((org.apache.commons.lang3.builder.ToStringStyle)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v17).translate(((java.lang.CharSequence)v26));
    Object v28 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v27));
    Object v29 = -42;
    Object v30 = java.io.Writer.nullWriter();
    Object v31 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v28),(((java.lang.Integer)v29).intValue()),((java.io.Writer)v30));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v6 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v7 = true;
    Object v8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v5),((org.apache.commons.lang3.builder.ToStringStyle)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v6 = 1;
    Object v7 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7));
    Object v9 = 1;
    Object v10 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v10));
    Object v12 = ((java.lang.CharSequence)v11).length();
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v6 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v7 = true;
    Object v8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v5),((org.apache.commons.lang3.builder.ToStringStyle)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 1;
    Object v10 = ((java.lang.CharSequence)v8).charAt((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v8));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = 1;
    Object v5 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.lang.CharSequence)v5).toString();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v5 = true;
    Object v6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v3),((org.apache.commons.lang3.builder.ToStringStyle)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((java.lang.CharSequence)v6).toString();
    Object v8 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),((java.io.Writer)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v4 = true;
    Object v5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v2),((org.apache.commons.lang3.builder.ToStringStyle)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v9 = true;
    Object v10 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v7),((org.apache.commons.lang3.builder.ToStringStyle)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v10));
    Object v12 = 39;
    Object v13 = java.io.Writer.nullWriter();
    Object v14 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v11),(((java.lang.Integer)v12).intValue()),((java.io.Writer)v13));
    org.junit.Assert.assertEquals((Object)(0), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = -22;
    Object v1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("FFFFFFEA"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = -22;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.lang.CharSequence)v8).length();
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    org.junit.Assert.assertEquals((Object)("FFFFFFEA"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v5 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v6 = true;
    Object v7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v4),((org.apache.commons.lang3.builder.ToStringStyle)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v7));
    Object v9 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v10 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v11 = true;
    Object v12 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v9),((org.apache.commons.lang3.builder.ToStringStyle)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v12));
    Object v14 = -44;
    Object v15 = java.io.Writer.nullWriter();
    Object v16 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v13),(((java.lang.Integer)v14).intValue()),((java.io.Writer)v15));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = 1;
    Object v5 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.lang.CharSequence)v5).toString();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5));
    Object v8 = ((java.lang.CharSequence)v7).chars();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v6));
    Object v8 = -22;
    Object v9 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v8).intValue()));
    Object v10 = ((java.lang.CharSequence)v9).length();
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v9));
    Object v12 = java.io.Writer.nullWriter();
    ((java.io.Writer)v12).close();
    Object v13 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v11),((java.io.Writer)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v9 = true;
    Object v10 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v7),((org.apache.commons.lang3.builder.ToStringStyle)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v10),((java.io.Writer)v11));
    Object v12 = null;
    Object v13 = 1;
    Object v14 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v13).intValue()));
    Object v15 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v14),((java.io.Writer)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v9 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v10 = true;
    Object v11 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v8),((org.apache.commons.lang3.builder.ToStringStyle)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v11));
    Object v13 = 1;
    Object v14 = ((java.lang.CharSequence)v12).charAt((((java.lang.Integer)v13).intValue()));
    Object v15 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v12),((java.io.Writer)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    org.junit.Assert.assertEquals((Object)("1"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v6));
    Object v8 = 1;
    Object v9 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v9));
    Object v11 = 2;
    Object v12 = java.io.Writer.nullWriter();
    Object v13 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v10),(((java.lang.Integer)v11).intValue()),((java.io.Writer)v12));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v6));
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = 1;
    Object v11 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v12));
    org.junit.Assert.assertEquals((Object)("1"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = -2;
    Object v1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("FFFFFFFE"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = -2;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = -2;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v10));
    Object v12 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v12));
    Object v14 = 1;
    Object v15 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v13).translate(((java.lang.CharSequence)v15));
    Object v17 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v16),((java.io.Writer)v17));
    Object v18 = null;
    Object v19 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v20 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v21 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v19).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v20));
    Object v22 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v23 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v21).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v22));
    Object v24 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v25 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v21).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v24));
    Object v26 = 1;
    Object v27 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v26).intValue()));
    Object v28 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v25).translate(((java.lang.CharSequence)v27));
    Object v29 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v28));
    org.junit.Assert.assertEquals((Object)("1"), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v7 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v8 = true;
    Object v9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v6),((org.apache.commons.lang3.builder.ToStringStyle)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v9));
    Object v11 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v12 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v13 = true;
    Object v14 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v11),((org.apache.commons.lang3.builder.ToStringStyle)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v14));
    Object v16 = ((java.lang.CharSequence)v15).toString();
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v6));
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = 1;
    Object v11 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v11));
    Object v13 = 1;
    Object v14 = java.io.Writer.nullWriter();
    Object v15 = -2;
    Object v16 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v15).intValue()));
    Object v17 = ((java.io.Writer)v14).append(((java.lang.CharSequence)v16));
    Object v18 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v12),(((java.lang.Integer)v13).intValue()),((java.io.Writer)v14));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v2));
    Object v4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v4));
    Object v6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v6));
    Object v8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v9 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v9));
    Object v11 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v11));
    Object v13 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v13));
    Object v15 = 1;
    Object v16 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v14).translate(((java.lang.CharSequence)v16));
    Object v18 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v17),((java.io.Writer)v18));
    Object v19 = null;
    Object v20 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v21 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v22 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v20).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v21));
    Object v23 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v24 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v22).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v23));
    Object v25 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v26 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v22).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v25));
    Object v27 = 1;
    Object v28 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v27).intValue()));
    Object v29 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v26).translate(((java.lang.CharSequence)v28));
    Object v30 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v29));
    Object v31 = 0;
    Object v32 = java.io.Writer.nullWriter();
    Object v33 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v30),(((java.lang.Integer)v31).intValue()),((java.io.Writer)v32));
    org.junit.Assert.assertEquals((Object)(0), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = -17;
    Object v1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("FFFFFFEF"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = -2;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),((java.io.Writer)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v6));
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v10));
    Object v12 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v13 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v13));
    Object v15 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v14).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v15));
    Object v17 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v14).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v17));
    Object v19 = 1;
    Object v20 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v18).translate(((java.lang.CharSequence)v20));
    Object v22 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v11).translate(((java.lang.CharSequence)v21),((java.io.Writer)v22));
    Object v23 = null;
    Object v24 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v25 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v26 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v24).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v25));
    Object v27 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v28 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v26).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v27));
    Object v29 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v30 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v26).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v29));
    Object v31 = 1;
    Object v32 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v31).intValue()));
    Object v33 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v30).translate(((java.lang.CharSequence)v32));
    Object v34 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v11).translate(((java.lang.CharSequence)v33));
    Object v35 = 1;
    Object v36 = java.io.Writer.nullWriter();
    ((java.io.Writer)v36).close();
    Object v37 = null;
    Object v38 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v34),(((java.lang.Integer)v35).intValue()),((java.io.Writer)v36));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = -2;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = -24;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = -2;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = -2;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = "";
    ((java.io.Writer)v4).write(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v4 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v5 = true;
    Object v6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v3),((org.apache.commons.lang3.builder.ToStringStyle)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6));
    Object v8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v9 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v10 = true;
    Object v11 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v8),((org.apache.commons.lang3.builder.ToStringStyle)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v12));
    Object v14 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v15 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v16 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v17 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v18 = true;
    Object v19 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v16),((org.apache.commons.lang3.builder.ToStringStyle)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = 1;
    Object v21 = ((java.lang.CharSequence)v19).charAt((((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).translate(((java.lang.CharSequence)v19));
    Object v23 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v14).translate(((java.lang.CharSequence)v22));
    Object v24 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v23));
    Object v25 = 1;
    Object v26 = java.io.Writer.nullWriter();
    Object v27 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v24),(((java.lang.Integer)v25).intValue()),((java.io.Writer)v26));
    org.junit.Assert.assertEquals((Object)(0), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = -17;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.lang.CharSequence)v8).chars();
    Object v10 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8),((java.io.Writer)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = -2;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = -1;
    Object v1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("FFFFFFFF"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = -1;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = -25;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = -1;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = 6;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v10));
    Object v12 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v12));
    Object v14 = -22;
    Object v15 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v14).intValue()));
    Object v16 = ((java.lang.CharSequence)v15).length();
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v13).translate(((java.lang.CharSequence)v15));
    Object v18 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v17),((java.io.Writer)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = -2;
    Object v10 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v9).intValue()));
    Object v11 = ((java.lang.CharSequence)v10).chars();
    Object v12 = java.io.Writer.nullWriter();
    ((java.io.Writer)v12).flush();
    Object v13 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10),((java.io.Writer)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v9));
    Object v11 = -1;
    Object v12 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v11).intValue()));
    Object v13 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).translate(((java.lang.CharSequence)v12),((java.io.Writer)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
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
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = -17;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = -1;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = -17;
    Object v10 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v9).intValue()));
    Object v11 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10),((java.io.Writer)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = -2;
    Object v10 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v8));
    Object v10 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v10));
    Object v12 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v12));
    Object v14 = 1;
    Object v15 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v13).translate(((java.lang.CharSequence)v15));
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v16));
    org.junit.Assert.assertEquals((Object)("1"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = -17;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = 4;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v10 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v11 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v12 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v13 = true;
    Object v14 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v11),((org.apache.commons.lang3.builder.ToStringStyle)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 1;
    Object v16 = ((java.lang.CharSequence)v14).charAt((((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).translate(((java.lang.CharSequence)v14));
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v17));
    Object v19 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v18),((java.io.Writer)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = -1;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.lang.CharSequence)v2).toString();
    Object v4 = 27;
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v4).intValue()),((java.io.Writer)v5));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = -1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v10 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v10));
    Object v12 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v11).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v12));
    Object v14 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v11).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v14));
    Object v16 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v17 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v16).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v17));
    Object v19 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v20 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v18).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v19));
    Object v21 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v22 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v18).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v21));
    Object v23 = 1;
    Object v24 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v23).intValue()));
    Object v25 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v22).translate(((java.lang.CharSequence)v24));
    Object v26 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).translate(((java.lang.CharSequence)v25));
    Object v27 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v9));
    Object v11 = -1;
    Object v12 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v11).intValue()));
    Object v13 = ((java.lang.CharSequence)v12).chars();
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).translate(((java.lang.CharSequence)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = -1;
    Object v10 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = ((java.lang.CharSequence)v10).subSequence((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10),((java.io.Writer)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v9));
    Object v11 = -1;
    Object v12 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v11).intValue()));
    Object v13 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v12),((java.io.Writer)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = -1;
    Object v10 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v9).intValue()));
    Object v11 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10),((java.io.Writer)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = -17;
    Object v10 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v9).intValue()));
    Object v11 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10),((java.io.Writer)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v9));
    Object v11 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v11));
    Object v13 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v14 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v15 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v16 = true;
    Object v17 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v14),((org.apache.commons.lang3.builder.ToStringStyle)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v13).translate(((java.lang.CharSequence)v17));
    Object v19 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v20 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
    Object v21 = true;
    Object v22 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(((java.lang.Object)v19),((org.apache.commons.lang3.builder.ToStringStyle)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v13).translate(((java.lang.CharSequence)v22));
    Object v24 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).translate(((java.lang.CharSequence)v23),((java.io.Writer)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = -17;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.lang.CharSequence)v8).codePoints();
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    org.junit.Assert.assertEquals((Object)("FFFFFFEF"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = -17;
    Object v10 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = -1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.lang.CharSequence)v6).chars();
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = -1;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = -12;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = ((org.apache.commons.lang3.text.translate.NumericEntityUnescaper)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = -2;
    Object v10 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v9));
    Object v11 = -2;
    Object v12 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = -1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = java.io.Writer.nullWriter();
    Object v8 = 0;
    ((java.io.Writer)v7).write((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
