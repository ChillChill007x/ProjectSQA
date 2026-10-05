package org.apache.commons.lang3.text.translate;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = 0L;
    Object v2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v1).longValue()));
    Object v3 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),((java.io.Writer)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = 0L;
    Object v2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v1).longValue()));
    Object v3 = ((java.lang.CharSequence)v2).toString();
    Object v4 = 0;
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v4).intValue()),((java.io.Writer)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = 0L;
    Object v2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v1).longValue()));
    Object v3 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),((java.io.Writer)v3));
    Object v4 = null;
    Object v5 = 0L;
    Object v6 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v5).longValue()));
    Object v7 = 18;
    Object v8 = java.io.Writer.nullWriter();
    Object v9 = 0L;
    Object v10 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v9).longValue()));
    Object v11 = ((java.io.Writer)v8).append(((java.lang.CharSequence)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v6),(((java.lang.Integer)v7).intValue()),((java.io.Writer)v8));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = 0L;
    Object v2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v1).longValue()));
    Object v3 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),((java.io.Writer)v3));
    Object v4 = null;
    Object v5 = 0L;
    Object v6 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v5).longValue()));
    Object v7 = ((java.lang.CharSequence)v6).chars();
    Object v8 = 0;
    Object v9 = java.io.Writer.nullWriter();
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v6),(((java.lang.Integer)v8).intValue()),((java.io.Writer)v9));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = 0L;
    Object v2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v1).longValue()));
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2));
    Object v4 = 0L;
    Object v5 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v4).longValue()));
    Object v6 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v5),((java.io.Writer)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = 0L;
    Object v2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v1).longValue()));
    Object v3 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),((java.io.Writer)v3));
    Object v4 = null;
    Object v5 = 0L;
    Object v6 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v6));
    org.junit.Assert.assertEquals((Object)("0:00:00.000"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 0L;
    Object v4 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v3).longValue()));
    Object v5 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = 0L;
    Object v3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v2).longValue()));
    Object v4 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3),((java.io.Writer)v4));
    Object v5 = null;
    Object v6 = 0L;
    Object v7 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v8));
    org.junit.Assert.assertEquals((Object)("0:00:00.000"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v3 = 0L;
    Object v4 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v3).longValue()));
    Object v5 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
    Object v7 = 0L;
    Object v8 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v9));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v10));
    Object v12 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v13 = 0L;
    Object v14 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v13).longValue()));
    Object v15 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).translate(((java.lang.CharSequence)v14),((java.io.Writer)v15));
    Object v16 = null;
    Object v17 = 0L;
    Object v18 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v17).longValue()));
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).translate(((java.lang.CharSequence)v18));
    Object v20 = 0;
    Object v21 = ((java.lang.CharSequence)v19).charAt((((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v19));
    org.junit.Assert.assertEquals((Object)("0:00:00.000"), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v3 = 0L;
    Object v4 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v3).longValue()));
    Object v5 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
    Object v7 = 0L;
    Object v8 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v9));
    Object v11 = -21;
    Object v12 = java.io.Writer.nullWriter();
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v10),(((java.lang.Integer)v11).intValue()),((java.io.Writer)v12));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = 0L;
    Object v2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v1).longValue()));
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2));
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 0L;
    Object v6 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v5).longValue()));
    Object v7 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
    Object v9 = 0L;
    Object v10 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v9).longValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v11));
    org.junit.Assert.assertEquals((Object)("0:00:00.000"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = 0L;
    Object v5 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5));
    Object v7 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v8 = 0L;
    Object v9 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v8).longValue()));
    Object v10 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v9),((java.io.Writer)v10));
    Object v11 = null;
    Object v12 = 0L;
    Object v13 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v12).longValue()));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v13));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v14));
    Object v16 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v15),((java.io.Writer)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = 0L;
    Object v3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v2).longValue()));
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3));
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = 0L;
    Object v7 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v6).longValue()));
    Object v8 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7),((java.io.Writer)v8));
    Object v9 = null;
    Object v10 = 0L;
    Object v11 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v10).longValue()));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v12));
    Object v14 = ((java.lang.CharSequence)v13).length();
    Object v15 = 1;
    Object v16 = java.io.Writer.nullWriter();
    Object v17 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v18 = 0L;
    Object v19 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v18).longValue()));
    Object v20 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v17).translate(((java.lang.CharSequence)v19));
    Object v21 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v22 = 0L;
    Object v23 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v22).longValue()));
    Object v24 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v21).translate(((java.lang.CharSequence)v23),((java.io.Writer)v24));
    Object v25 = null;
    Object v26 = 0L;
    Object v27 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v26).longValue()));
    Object v28 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v21).translate(((java.lang.CharSequence)v27));
    Object v29 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v17).translate(((java.lang.CharSequence)v28));
    Object v30 = ((java.io.Writer)v16).append(((java.lang.CharSequence)v29));
    Object v31 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v13),(((java.lang.Integer)v15).intValue()),((java.io.Writer)v16));
    org.junit.Assert.assertEquals((Object)(0), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = 0L;
    Object v3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v2).longValue()));
    Object v4 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3),((java.io.Writer)v4));
    Object v5 = null;
    Object v6 = 0L;
    Object v7 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7));
    Object v9 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v10 = null;
    Object v11 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v12 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v13 = 0L;
    Object v14 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v13).longValue()));
    Object v15 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).translate(((java.lang.CharSequence)v14),((java.io.Writer)v15));
    Object v16 = null;
    Object v17 = 0L;
    Object v18 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v17).longValue()));
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v12).translate(((java.lang.CharSequence)v18));
    Object v20 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v11).translate(((java.lang.CharSequence)v19));
    Object v21 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v20),((java.io.Writer)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v3 = 0L;
    Object v4 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v3).longValue()));
    Object v5 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
    Object v7 = 0L;
    Object v8 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v9));
    Object v11 = ((java.lang.CharSequence)v10).chars();
    Object v12 = java.io.Writer.nullWriter();
    Object v13 = new char[]{};
    ((java.io.Writer)v12).write(((char[])v13));
    Object v14 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v10),((java.io.Writer)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 2;
    Object v1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("2"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = 0L;
    Object v3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v2).longValue()));
    Object v4 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3),((java.io.Writer)v4));
    Object v5 = null;
    Object v6 = 0L;
    Object v7 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7));
    Object v9 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v10 = null;
    Object v11 = 0L;
    Object v12 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v11).longValue()));
    Object v13 = 0;
    Object v14 = java.io.Writer.nullWriter();
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v12),(((java.lang.Integer)v13).intValue()),((java.io.Writer)v14));
    org.junit.Assert.assertEquals((Object)(0), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = 2;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.lang.CharSequence)v2).toString();
    Object v4 = 1;
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v4).intValue()),((java.io.Writer)v5));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = 2;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2));
    org.junit.Assert.assertEquals((Object)("2"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = 0L;
    Object v3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v2).longValue()));
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3));
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = 0L;
    Object v7 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v6).longValue()));
    Object v8 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7),((java.io.Writer)v8));
    Object v9 = null;
    Object v10 = 0L;
    Object v11 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v10).longValue()));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v12));
    Object v14 = 0;
    Object v15 = java.io.Writer.nullWriter();
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v13),(((java.lang.Integer)v14).intValue()),((java.io.Writer)v15));
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = 2;
    Object v3 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3));
    Object v5 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v3 = 0L;
    Object v4 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v3).longValue()));
    Object v5 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
    Object v7 = 0L;
    Object v8 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v9));
    Object v11 = java.io.Writer.nullWriter();
    Object v12 = 4;
    ((java.io.Writer)v11).write((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v10),((java.io.Writer)v11));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = 2;
    Object v3 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3));
    Object v5 = 0;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
    Object v8 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v9 = 2;
    Object v10 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10));
    Object v12 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v11),((java.io.Writer)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = 0L;
    Object v3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v2).longValue()));
    Object v4 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v3),((java.io.Writer)v4));
    Object v5 = null;
    Object v6 = 0L;
    Object v7 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v7));
    Object v9 = ((java.lang.CharSequence)v8).toString();
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v8));
    org.junit.Assert.assertEquals((Object)("0:00:00.000"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
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
  public void test26() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = 0L;
    Object v8 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = 0L;
    Object v5 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5));
    Object v7 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v8 = 0L;
    Object v9 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v8).longValue()));
    Object v10 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v9),((java.io.Writer)v10));
    Object v11 = null;
    Object v12 = 0L;
    Object v13 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v12).longValue()));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v13));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v14));
    Object v16 = ((java.lang.CharSequence)v15).toString();
    Object v17 = 0;
    Object v18 = java.io.Writer.nullWriter();
    Object v19 = 1;
    ((java.io.Writer)v18).write((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v15),(((java.lang.Integer)v17).intValue()),((java.io.Writer)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 2;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = 2;
    Object v5 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5));
    Object v7 = ((java.lang.CharSequence)v6).chars();
    Object v8 = 23;
    Object v9 = java.io.Writer.nullWriter();
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),(((java.lang.Integer)v8).intValue()),((java.io.Writer)v9));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = 0L;
    Object v5 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v4).longValue()));
    Object v6 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5),((java.io.Writer)v6));
    Object v7 = null;
    Object v8 = 0L;
    Object v9 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v8).longValue()));
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v9));
    Object v11 = 1;
    Object v12 = java.io.Writer.nullWriter();
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v10),(((java.lang.Integer)v11).intValue()),((java.io.Writer)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 0L;
    Object v6 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v5).longValue()));
    Object v7 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
    Object v9 = 0L;
    Object v10 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v9).longValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v11));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = 2;
    Object v7 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7));
    Object v9 = 1;
    Object v10 = java.io.Writer.nullWriter();
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v8),(((java.lang.Integer)v9).intValue()),((java.io.Writer)v10));
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
    Object v5 = 0L;
    Object v6 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v5).longValue()));
    Object v7 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
    Object v9 = 0L;
    Object v10 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v9).longValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v10));
    Object v12 = ((java.lang.CharSequence)v11).toString();
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v11));
    Object v14 = ((java.lang.CharSequence)v13).length();
    Object v15 = -38;
    Object v16 = java.io.Writer.nullWriter();
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v13),(((java.lang.Integer)v15).intValue()),((java.io.Writer)v16));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 0L;
    Object v6 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v5).longValue()));
    Object v7 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
    Object v9 = 0L;
    Object v10 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v9).longValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v10));
    Object v12 = ((java.lang.CharSequence)v11).toString();
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v11));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = 0L;
    Object v7 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v6).longValue()));
    Object v8 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7),((java.io.Writer)v8));
    Object v9 = null;
    Object v10 = 0L;
    Object v11 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v10).longValue()));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v11));
    Object v13 = 15;
    Object v14 = java.io.Writer.nullWriter();
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v12),(((java.lang.Integer)v13).intValue()),((java.io.Writer)v14));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = 2;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),((java.io.Writer)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = 2;
    Object v7 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7));
    Object v9 = -1;
    Object v10 = java.io.Writer.nullWriter();
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v8),(((java.lang.Integer)v9).intValue()),((java.io.Writer)v10));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = 0L;
    Object v7 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v6).longValue()));
    Object v8 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7),((java.io.Writer)v8));
    Object v9 = null;
    Object v10 = 0L;
    Object v11 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v10).longValue()));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v11));
    Object v13 = -68;
    Object v14 = java.io.Writer.nullWriter();
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v12),(((java.lang.Integer)v13).intValue()),((java.io.Writer)v14));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 0L;
    Object v6 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v5).longValue()));
    Object v7 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
    Object v9 = 0L;
    Object v10 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v9).longValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v10));
    Object v12 = ((java.lang.CharSequence)v11).toString();
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v11));
    Object v14 = ((java.lang.CharSequence)v13).length();
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v7));
    Object v9 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v10 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v11 = 0L;
    Object v12 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v11).longValue()));
    Object v13 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).translate(((java.lang.CharSequence)v12),((java.io.Writer)v13));
    Object v14 = null;
    Object v15 = 0L;
    Object v16 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v15).longValue()));
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v10).translate(((java.lang.CharSequence)v16));
    Object v18 = ((java.lang.CharSequence)v17).toString();
    Object v19 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v17));
    Object v20 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v19),((java.io.Writer)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = -40;
    Object v1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("FFFFFFD8"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 2;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = 4;
    Object v8 = java.io.Writer.nullWriter();
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
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v8 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v9 = 0L;
    Object v10 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v9).longValue()));
    Object v11 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v10),((java.io.Writer)v11));
    Object v12 = null;
    Object v13 = 0L;
    Object v14 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v13).longValue()));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v8).translate(((java.lang.CharSequence)v14));
    Object v16 = ((java.lang.CharSequence)v15).toString();
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v15));
    Object v18 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v17),((java.io.Writer)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = -40;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2));
    org.junit.Assert.assertEquals((Object)("FFFFFFD8"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = -40;
    Object v5 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5));
    Object v7 = java.io.Writer.nullWriter();
    ((java.io.Writer)v7).flush();
    Object v8 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v9 = null;
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
    Object v4 = 0L;
    Object v5 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5));
    Object v7 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v8 = 0L;
    Object v9 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v8).longValue()));
    Object v10 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v9),((java.io.Writer)v10));
    Object v11 = null;
    Object v12 = 0L;
    Object v13 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v12).longValue()));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v7).translate(((java.lang.CharSequence)v13));
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v14));
    Object v16 = ((java.lang.CharSequence)v15).chars();
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = -40;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v7 = 0L;
    Object v8 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v7).longValue()));
    Object v9 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v10 = null;
    Object v11 = 0L;
    Object v12 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v11).longValue()));
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v13));
    Object v15 = 30;
    Object v16 = java.io.Writer.nullWriter();
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v14),(((java.lang.Integer)v15).intValue()),((java.io.Writer)v16));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = -40;
    Object v5 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5));
    Object v7 = -6;
    Object v8 = java.io.Writer.nullWriter();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),(((java.lang.Integer)v7).intValue()),((java.io.Writer)v8));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = -40;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.lang.CharSequence)v8).chars();
    Object v10 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = 2;
    Object v7 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7));
    Object v9 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = -40;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = 21;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = -40;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = -9;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = -40;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.io.Writer)v4).append(((java.lang.CharSequence)v6));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 0L;
    Object v4 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v3 = 0L;
    Object v4 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v3).longValue()));
    Object v5 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
    Object v7 = 0L;
    Object v8 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v8));
    Object v10 = ((java.lang.CharSequence)v9).toString();
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v1).translate(((java.lang.CharSequence)v9));
    Object v12 = 8;
    Object v13 = java.io.Writer.nullWriter();
    Object v14 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v11),(((java.lang.Integer)v12).intValue()),((java.io.Writer)v13));
    org.junit.Assert.assertEquals((Object)(0), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = 2;
    Object v5 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5));
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = -40;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = -17;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = -40;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = -3;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 1;
    Object v1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("1"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.lang.CharSequence)v4).chars();
    Object v6 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 2;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.lang.CharSequence)v6).chars();
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 2;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 0L;
    Object v6 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v5).longValue()));
    Object v7 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
    Object v9 = 0L;
    Object v10 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v9).longValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v10));
    Object v12 = ((java.lang.CharSequence)v11).toString();
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v11));
    Object v14 = 48;
    Object v15 = java.io.Writer.nullWriter();
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v13),(((java.lang.Integer)v14).intValue()),((java.io.Writer)v15));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = 41;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = -10;
    ((java.io.Writer)v6).write((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = 0L;
    Object v7 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7));
    Object v9 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v10 = 0L;
    Object v11 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v10).longValue()));
    Object v12 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v11),((java.io.Writer)v12));
    Object v13 = null;
    Object v14 = 0L;
    Object v15 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v14).longValue()));
    Object v16 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v9).translate(((java.lang.CharSequence)v15));
    Object v17 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v16));
    Object v18 = 1;
    Object v19 = ((java.lang.CharSequence)v17).charAt((((java.lang.Integer)v18).intValue()));
    Object v20 = 10;
    Object v21 = java.io.Writer.nullWriter();
    Object v22 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v17),(((java.lang.Integer)v20).intValue()),((java.io.Writer)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.Writer.nullWriter();
    ((java.io.Writer)v5).close();
    Object v6 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 0L;
    Object v6 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v5).longValue()));
    Object v7 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
    Object v9 = 0L;
    Object v10 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v9).longValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v10));
    Object v12 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v11));
    Object v13 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v12),((java.io.Writer)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 0L;
    Object v6 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v5).longValue()));
    Object v7 = ((java.lang.CharSequence)v6).codePoints();
    Object v8 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),((java.io.Writer)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v6 = -40;
    Object v7 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v5).translate(((java.lang.CharSequence)v7));
    Object v9 = 16;
    Object v10 = java.io.Writer.nullWriter();
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v8),(((java.lang.Integer)v9).intValue()),((java.io.Writer)v10));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = -18;
    Object v1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("FFFFFFEE"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.lang.CharSequence)v6).toString();
    Object v8 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),((java.io.Writer)v8));
    Object v9 = null;
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
    Object v5 = 1;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new char[]{};
    ((java.io.Writer)v6).write(((char[])v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
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
    Object v5 = ((java.lang.CharSequence)v4).toString();
    Object v6 = -14;
    Object v7 = java.io.Writer.nullWriter();
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v6).intValue()),((java.io.Writer)v7));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
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
  public void test77() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.lang.CharSequence)v4).codePoints();
    Object v6 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = -18;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((java.io.Writer)v5).append((((java.lang.Character)v6).charValue()));
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v8 = null;
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
    Object v5 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),((java.io.Writer)v5));
    Object v6 = null;
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
    Object v5 = 50;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = 7;
    ((java.io.Writer)v6).write((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
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
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
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
  public void test84() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = -18;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.Writer.nullWriter();
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
  public void test85() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = -18;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v5 = 0L;
    Object v6 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v5).longValue()));
    Object v7 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
    Object v9 = 0L;
    Object v10 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v9).longValue()));
    Object v11 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v10));
    Object v12 = ((java.lang.CharSequence)v11).toString();
    Object v13 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v11));
    Object v14 = ((java.lang.CharSequence)v13).toString();
    Object v15 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = -18;
    Object v2 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = java.io.Writer.nullWriter();
    ((java.io.Writer)v4).flush();
    Object v5 = null;
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).translate(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()),((java.io.Writer)v4));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v4 = 2;
    Object v5 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v3).translate(((java.lang.CharSequence)v5));
    Object v7 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = -18;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v6 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v5));
    Object v7 = -18;
    Object v8 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v7).intValue()));
    Object v9 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v6).translate(((java.lang.CharSequence)v8),((java.io.Writer)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = -18;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.lang.CharSequence)v4).length();
    Object v6 = 1;
    Object v7 = java.io.Writer.nullWriter();
    Object v8 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v6).intValue()),((java.io.Writer)v7));
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
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = java.io.Writer.nullWriter();
    Object v8 = 9;
    ((java.io.Writer)v7).write((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v4).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = -18;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = -30;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = -40;
    Object v4 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v3).intValue()));
    Object v5 = -18;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),((java.io.Writer)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = java.io.Writer.nullWriter();
    ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),((java.io.Writer)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = -40;
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
  public void test99() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    Object v1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null};
    Object v2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v0).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v1));
    Object v3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[]{null,null,null};
    Object v4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).with(((org.apache.commons.lang3.text.translate.CharSequenceTranslator[])v3));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = java.io.Writer.nullWriter();
    Object v9 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator)v2).translate(((java.lang.CharSequence)v6),(((java.lang.Integer)v7).intValue()),((java.io.Writer)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
