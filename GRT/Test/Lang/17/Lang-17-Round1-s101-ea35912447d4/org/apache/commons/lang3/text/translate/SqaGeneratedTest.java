package org.apache.commons.lang3.text.translate;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v1).intValue()));
    Object v3 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),((java.io.Writer)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v1).intValue()));
    Object v3 = 29;
    Object v4 = new java.io.StringWriter();
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v1).intValue()));
    Object v3 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),((java.io.Writer)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = 1;
    Object v7 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7));
    Object v9 = ((java.lang.CharSequence)v8).chars();
    Object v10 = 0;
    Object v11 = new java.io.StringWriter();
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v8),(((java.lang.Integer)v10).intValue()),((java.io.Writer)v11));
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3));
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v4));
    Object v6 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v7 = 1;
    Object v8 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.lang.CharSequence)v8).chars();
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    Object v11 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v10),((java.io.Writer)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v3).intValue()));
    Object v5 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v3).intValue()));
    Object v5 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
    Object v7 = 1;
    Object v8 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v9));
    Object v11 = -21;
    Object v12 = new java.io.StringWriter();
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v10),(((java.lang.Integer)v11).intValue()),((java.io.Writer)v12));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v5).intValue()));
    Object v7 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
    Object v9 = 1;
    Object v10 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v11));
    Object v13 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v12),((java.io.Writer)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v3).intValue()));
    Object v5 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
    Object v7 = 1;
    Object v8 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v9));
    Object v11 = ((java.lang.CharSequence)v10).length();
    Object v12 = 1;
    Object v13 = new java.io.StringWriter();
    Object v14 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v15 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v16 = 1;
    Object v17 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v16).intValue()));
    Object v18 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).translate(((java.lang.CharSequence)v17),((java.io.Writer)v18));
    Object v19 = null;
    Object v20 = 1;
    Object v21 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).translate(((java.lang.CharSequence)v21));
    Object v23 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v14).translate(((java.lang.CharSequence)v22));
    Object v24 = ((java.io.Writer)v13).append(((java.lang.CharSequence)v23));
    Object v25 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v10),(((java.lang.Integer)v12).intValue()),((java.io.Writer)v13));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.lang.CharSequence)v3).chars();
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3));
    Object v6 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v5),((java.io.Writer)v6));
    Object v7 = null;
    Object v8 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v9 = 1;
    Object v10 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v9).intValue()));
    Object v11 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10),((java.io.Writer)v11));
    Object v12 = null;
    Object v13 = 1;
    Object v14 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v14));
    Object v16 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v15),((java.io.Writer)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v2).intValue()));
    Object v4 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3),((java.io.Writer)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7));
    Object v9 = ((java.lang.CharSequence)v8).chars();
    Object v10 = new java.io.StringWriter();
    Object v11 = new char[]{};
    ((java.io.Writer)v10).write(((char[])v11));
    Object v12 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v8),((java.io.Writer)v10));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 2;
    Object v1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("2"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.lang.CharSequence)v3).chars();
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3));
    Object v6 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v5),((java.io.Writer)v6));
    Object v7 = null;
    Object v8 = 1;
    Object v9 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = new java.io.StringWriter();
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v9),(((java.lang.Integer)v10).intValue()),((java.io.Writer)v11));
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v3).intValue()));
    Object v5 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
    Object v7 = 1;
    Object v8 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v9));
    Object v11 = ((java.lang.CharSequence)v10).toString();
    Object v12 = 1;
    Object v13 = new java.io.StringWriter();
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v10),(((java.lang.Integer)v12).intValue()),((java.io.Writer)v13));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v2).intValue()));
    Object v4 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3),((java.io.Writer)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7));
    Object v9 = 0;
    Object v10 = new java.io.StringWriter();
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v8),(((java.lang.Integer)v9).intValue()),((java.io.Writer)v10));
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = 2;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),((java.io.Writer)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v2).intValue()));
    Object v4 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3),((java.io.Writer)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7));
    Object v9 = new java.io.StringWriter();
    Object v10 = 70;
    ((java.io.Writer)v9).write((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = 2;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = new java.io.StringWriter();
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v7),((java.io.Writer)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = 1;
    Object v5 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v4).intValue()));
    Object v6 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5),((java.io.Writer)v6));
    Object v7 = null;
    Object v8 = 1;
    Object v9 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v9));
    Object v11 = ((java.lang.CharSequence)v10).toString();
    Object v12 = 0;
    Object v13 = new java.io.StringWriter();
    Object v14 = 1;
    ((java.io.Writer)v13).write((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v10),(((java.lang.Integer)v12).intValue()),((java.io.Writer)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = 1;
    Object v7 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7),((java.io.Writer)v8));
    Object v9 = null;
    Object v10 = 1;
    Object v11 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v13));
    Object v15 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v16 = 1;
    Object v17 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).translate(((java.lang.CharSequence)v17));
    Object v19 = 0;
    Object v20 = ((java.lang.CharSequence)v18).charAt((((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v18));
    Object v22 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((java.lang.CharSequence)v7).toString();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v7));
    Object v10 = ((java.lang.CharSequence)v9).chars();
    Object v11 = 23;
    Object v12 = new java.io.StringWriter();
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v9),(((java.lang.Integer)v11).intValue()),((java.io.Writer)v12));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new java.io.StringWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = 1;
    Object v5 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v4).intValue()));
    Object v6 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5),((java.io.Writer)v6));
    Object v7 = null;
    Object v8 = 1;
    Object v9 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v7 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v9 = 1;
    Object v10 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v9).intValue()));
    Object v11 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10),((java.io.Writer)v11));
    Object v12 = null;
    Object v13 = 1;
    Object v14 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v14));
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v15));
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v16));
    Object v18 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v19 = 1;
    Object v20 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v18).translate(((java.lang.CharSequence)v20));
    Object v22 = 0;
    Object v23 = ((java.lang.CharSequence)v21).charAt((((java.lang.Integer)v22).intValue()));
    Object v24 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v21));
    Object v25 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v24));
    Object v26 = 1;
    Object v27 = new java.io.StringWriter();
    Object v28 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v25),(((java.lang.Integer)v26).intValue()),((java.io.Writer)v27));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((java.lang.CharSequence)v7).toString();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v7));
    Object v10 = ((java.lang.CharSequence)v9).length();
    Object v11 = -38;
    Object v12 = new java.io.StringWriter();
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v9),(((java.lang.Integer)v11).intValue()),((java.io.Writer)v12));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = 1;
    Object v5 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5));
    Object v7 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v8 = 1;
    Object v9 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v9),((java.io.Writer)v10));
    Object v11 = null;
    Object v12 = 1;
    Object v13 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v13));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v14));
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((java.lang.CharSequence)v7).toString();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v7));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v5).intValue()));
    Object v7 = 15;
    Object v8 = new java.io.StringWriter();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),(((java.lang.Integer)v7).intValue()),((java.io.Writer)v8));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v3).intValue()));
    Object v5 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
    Object v7 = 1;
    Object v8 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v9));
    Object v11 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v10),((java.io.Writer)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 2;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = -1;
    Object v8 = new java.io.StringWriter();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),(((java.lang.Integer)v7).intValue()),((java.io.Writer)v8));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v5).intValue()));
    Object v7 = -68;
    Object v8 = new java.io.StringWriter();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),(((java.lang.Integer)v7).intValue()),((java.io.Writer)v8));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((java.lang.CharSequence)v7).toString();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v7));
    Object v10 = ((java.lang.CharSequence)v9).length();
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v7 = 1;
    Object v8 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    Object v10 = ((java.lang.CharSequence)v9).toString();
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v9));
    Object v12 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v11),((java.io.Writer)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = -40;
    Object v1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("FFFFFFD8"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = 1;
    Object v7 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7),((java.io.Writer)v8));
    Object v9 = null;
    Object v10 = 1;
    Object v11 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v11));
    Object v13 = 4;
    Object v14 = new java.io.StringWriter();
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v12),(((java.lang.Integer)v13).intValue()),((java.io.Writer)v14));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v5).intValue()));
    Object v7 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
    Object v9 = 1;
    Object v10 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v11));
    Object v13 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v12),((java.io.Writer)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v9 = 1;
    Object v10 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v9).intValue()));
    Object v11 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10),((java.io.Writer)v11));
    Object v12 = null;
    Object v13 = 1;
    Object v14 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v14));
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v15));
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((java.lang.CharSequence)v7).toString();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v7));
    Object v10 = new java.io.StringWriter();
    ((java.io.Writer)v10).flush();
    Object v11 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v9),((java.io.Writer)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = 1;
    Object v5 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.lang.CharSequence)v5).codePoints();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5));
    Object v8 = ((java.lang.CharSequence)v7).chars();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v7 = 1;
    Object v8 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v7).intValue()));
    Object v9 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v10 = null;
    Object v11 = 1;
    Object v12 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v13));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v14));
    Object v16 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v17 = 1;
    Object v18 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v16).translate(((java.lang.CharSequence)v18));
    Object v20 = 0;
    Object v21 = ((java.lang.CharSequence)v19).charAt((((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v19));
    Object v23 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v22));
    Object v24 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v23),((java.io.Writer)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v5).intValue()));
    Object v7 = 30;
    Object v8 = new java.io.StringWriter();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),(((java.lang.Integer)v7).intValue()),((java.io.Writer)v8));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((java.lang.CharSequence)v7).toString();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v7));
    Object v10 = -6;
    Object v11 = new java.io.StringWriter();
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v9),(((java.lang.Integer)v10).intValue()),((java.io.Writer)v11));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((java.lang.CharSequence)v7).toString();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v7));
    Object v10 = ((java.lang.CharSequence)v9).chars();
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = 1;
    Object v7 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7),((java.io.Writer)v8));
    Object v9 = null;
    Object v10 = 1;
    Object v11 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v11));
    Object v13 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v12),((java.io.Writer)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((java.lang.CharSequence)v7).toString();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v7));
    Object v10 = 20;
    Object v11 = new java.io.StringWriter();
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v9),(((java.lang.Integer)v10).intValue()),((java.io.Writer)v11));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v5).intValue()));
    Object v7 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
    Object v9 = 1;
    Object v10 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v11));
    Object v13 = -9;
    Object v14 = new java.io.StringWriter();
    Object v15 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v16 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v17 = 1;
    Object v18 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v16).translate(((java.lang.CharSequence)v18));
    Object v20 = ((java.lang.CharSequence)v19).toString();
    Object v21 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).translate(((java.lang.CharSequence)v19));
    Object v22 = ((java.io.Writer)v14).append(((java.lang.CharSequence)v21));
    Object v23 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v12),(((java.lang.Integer)v13).intValue()),((java.io.Writer)v14));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v2).intValue()));
    Object v4 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3),((java.io.Writer)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7));
    Object v9 = 8;
    Object v10 = new java.io.StringWriter();
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v8),(((java.lang.Integer)v9).intValue()),((java.io.Writer)v10));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((java.lang.CharSequence)v7).toString();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v7));
    Object v10 = -17;
    Object v11 = new java.io.StringWriter();
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v9),(((java.lang.Integer)v10).intValue()),((java.io.Writer)v11));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = 1;
    Object v5 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v4).intValue()));
    Object v6 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5),((java.io.Writer)v6));
    Object v7 = null;
    Object v8 = 1;
    Object v9 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v9));
    Object v11 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v10),((java.io.Writer)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((java.lang.CharSequence)v7).toString();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v7));
    Object v10 = -3;
    Object v11 = new java.io.StringWriter();
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v9),(((java.lang.Integer)v10).intValue()),((java.io.Writer)v11));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 1;
    Object v1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("1"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.lang.CharSequence)v4).chars();
    Object v6 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = 1;
    Object v7 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7),((java.io.Writer)v8));
    Object v9 = null;
    Object v10 = 1;
    Object v11 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v11));
    Object v13 = ((java.lang.CharSequence)v12).chars();
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = new java.io.StringWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = 1;
    Object v5 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v4).intValue()));
    Object v6 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5),((java.io.Writer)v6));
    Object v7 = null;
    Object v8 = 1;
    Object v9 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v9));
    Object v11 = 1;
    Object v12 = new java.io.StringWriter();
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v10),(((java.lang.Integer)v11).intValue()),((java.io.Writer)v12));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = 1;
    Object v5 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v4).intValue()));
    Object v6 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5),((java.io.Writer)v6));
    Object v7 = null;
    Object v8 = 1;
    Object v9 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v9));
    Object v11 = 48;
    Object v12 = new java.io.StringWriter();
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v10),(((java.lang.Integer)v11).intValue()),((java.io.Writer)v12));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = 41;
    Object v6 = new java.io.StringWriter();
    Object v7 = -10;
    ((java.io.Writer)v6).write((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = 1;
    Object v7 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7),((java.io.Writer)v8));
    Object v9 = null;
    Object v10 = 1;
    Object v11 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v13));
    Object v15 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v16 = 1;
    Object v17 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v15).translate(((java.lang.CharSequence)v17));
    Object v19 = 0;
    Object v20 = ((java.lang.CharSequence)v18).charAt((((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v18));
    Object v22 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v21),((java.io.Writer)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = 1;
    Object v7 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.lang.CharSequence)v7).codePoints();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7));
    Object v10 = ((java.lang.CharSequence)v9).toString();
    Object v11 = 32;
    Object v12 = new java.io.StringWriter();
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v9),(((java.lang.Integer)v11).intValue()),((java.io.Writer)v12));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = new java.io.StringWriter();
    ((java.io.Writer)v5).close();
    Object v6 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v3).intValue()));
    Object v5 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = new java.io.StringWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.lang.CharSequence)v6).codePoints();
    Object v8 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),((java.io.Writer)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v7 = 1;
    Object v8 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
    Object v10 = ((java.lang.CharSequence)v9).toString();
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v9));
    Object v12 = 16;
    Object v13 = new java.io.StringWriter();
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v11),(((java.lang.Integer)v12).intValue()),((java.io.Writer)v13));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = -18;
    Object v1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("FFFFFFEE"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.lang.CharSequence)v6).toString();
    Object v8 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),((java.io.Writer)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = -18;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new java.io.StringWriter();
    Object v7 = new char[]{};
    ((java.io.Writer)v6).write(((char[])v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.lang.CharSequence)v4).toString();
    Object v6 = -14;
    Object v7 = new java.io.StringWriter();
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v6).intValue()),((java.io.Writer)v7));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = -18;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.lang.CharSequence)v4).codePoints();
    Object v6 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = -18;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = new java.io.StringWriter();
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((java.io.Writer)v5).append((((java.lang.Character)v6).charValue()));
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = 50;
    Object v6 = new java.io.StringWriter();
    Object v7 = 7;
    ((java.io.Writer)v6).write((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = -40;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.lang.CharSequence)v4).toString();
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = -18;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = new java.io.StringWriter();
    Object v6 = new char[]{Character.valueOf((char)1)};
    Object v7 = 1;
    Object v8 = 0;
    ((java.io.Writer)v5).write(((char[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new java.io.StringWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = 1;
    Object v5 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v4).intValue()));
    Object v6 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5),((java.io.Writer)v6));
    Object v7 = null;
    Object v8 = 1;
    Object v9 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v9));
    Object v11 = ((java.lang.CharSequence)v10).toString();
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = new java.io.StringWriter();
    ((java.io.Writer)v4).flush();
    Object v5 = null;
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = -18;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new java.io.StringWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = -18;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = -18;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.lang.CharSequence)v6).length();
    Object v8 = 1;
    Object v9 = new java.io.StringWriter();
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),(((java.lang.Integer)v8).intValue()),((java.io.Writer)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = new java.io.StringWriter();
    Object v8 = 9;
    ((java.io.Writer)v7).write((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = -30;
    Object v6 = new java.io.StringWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 2;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = -18;
    Object v6 = new java.io.StringWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = -18;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = 2;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = new java.io.StringWriter();
    ((java.io.Writer)v9).flush();
    Object v10 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = new java.io.StringWriter();
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v8),(((java.lang.Integer)v9).intValue()),((java.io.Writer)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = -18;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = -40;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),((java.io.Writer)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.RandomStringUtils.randomAscii((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6));
    Object v8 = ((java.lang.CharSequence)v7).toString();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v7));
    Object v10 = new java.io.StringWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v9),((java.io.Writer)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = -18;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = new java.io.StringWriter();
    Object v8 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)1)};
    ((java.io.Writer)v7).write(((char[])v8));
    Object v9 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    org.junit.Assert.assertNotNull(v6);
  }
}
