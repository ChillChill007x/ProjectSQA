package org.apache.commons.csv;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)44);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = 0;
    Object v3 = new java.io.StringWriter((((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.csv.CSVFormat)v1).println(((java.lang.Appendable)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape((((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v1).withQuote(((java.lang.Character)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).isCommentMarkerSet();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withTrim((((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0000> CommentStart=<\u0001> SkipHeaderRecord:false"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withTrim((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = ((org.apache.commons.csv.CSVFormat)v1).withHeaderComments(((java.lang.Object[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getAllowMissingColumnNames();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getHeader();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).isQuoteCharacterSet();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).isEscapeCharacterSet();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).isNullStringSet();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0000> SkipHeaderRecord:false"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = java.io.Reader.nullReader();
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).parse(((java.io.Reader)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v1).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0000> SkipHeaderRecord:false"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)44);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withCommentMarker((((java.lang.Character)v4).charValue()));
    Object v6 = 0;
    Object v7 = new java.io.StringWriter((((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.csv.CSVFormat)v3).println(((java.lang.Appendable)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.lang.Class)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.lang.Class)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withTrailingDelimiter();
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).isNullStringSet();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).hashCode();
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = 0;
    Object v6 = new java.io.StringWriter((((java.lang.Integer)v5).intValue()));
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = Character.valueOf((char)1);
    Object v10 = ((org.apache.commons.csv.CSVFormat)v8).withCommentMarker(((java.lang.Character)v9));
    Object v11 = ((org.apache.commons.csv.CSVFormat)v10).toString();
    Object v12 = ((java.lang.Appendable)v6).append(((java.lang.CharSequence)v11));
    Object v13 = false;
    ((org.apache.commons.csv.CSVFormat)v1).print(((java.lang.Object)v4),((java.lang.Appendable)v6),(((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1941554113), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.lang.Class)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).getHeaderComments();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines();
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withCommentMarker((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = 0;
    Object v3 = new java.io.StringWriter((((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.csv.CSVFormat)v1).println(((java.lang.Appendable)v3));
    Object v4 = null;
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v5).charValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.csv.CSVFormat)v6).withHeader(((java.lang.Class)v7));
    Object v9 = ((org.apache.commons.csv.CSVFormat)v8).withTrailingDelimiter();
    Object v10 = ((org.apache.commons.csv.CSVFormat)v8).isNullStringSet();
    Object v11 = ((org.apache.commons.csv.CSVFormat)v1).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)44);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = 0;
    Object v5 = new java.io.StringWriter((((java.lang.Integer)v4).intValue()));
    ((org.apache.commons.csv.CSVFormat)v3).println(((java.lang.Appendable)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines();
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withCommentMarker((((java.lang.Character)v3).charValue()));
    Object v5 = ((org.apache.commons.csv.CSVFormat)v4).isCommentMarkerSet();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)35);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withRecordSeparator((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)44);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).isNullStringSet();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuote((((java.lang.Character)v4).charValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withSkipHeaderRecord();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withTrim((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withSkipHeaderRecord();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.lang.Class)v2));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withSkipHeaderRecord((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = Character.valueOf((char)4);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v3).withQuote(((java.lang.Character)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withTrim((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = ((org.apache.commons.csv.CSVFormat)v1).withHeaderComments(((java.lang.Object[])v4));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).getQuoteMode();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)10);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)44);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0000> CommentStart=<,> SkipHeaderRecord:false"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withTrim((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)110);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = "`";
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withNullString(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)35);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withRecordSeparator((((java.lang.Character)v2).charValue()));
    Object v4 = 0;
    Object v5 = new java.io.StringWriter((((java.lang.Integer)v4).intValue()));
    Object v6 = new java.lang.Object[]{null,null,null};
    ((org.apache.commons.csv.CSVFormat)v3).printRecord(((java.lang.Appendable)v5),((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = "`";
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withNullString(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).getHeader();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withFirstRecordAsHeader();
    Object v3 = new java.lang.Object[]{null};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v1).format(((java.lang.Object[])v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getHeaderComments();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)2);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withSkipHeaderRecord();
    Object v3 = ((org.apache.commons.csv.CSVFormat)v2).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0000> SkipHeaderRecord:true"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines();
    Object v3 = false;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withSkipHeaderRecord((((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withTrim((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withSkipHeaderRecord();
    Object v5 = true;
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withTrailingDelimiter((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.csv.CSVFormat)v4).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0000> SkipHeaderRecord:true"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withTrim((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withSkipHeaderRecord();
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withDelimiter((((java.lang.Character)v5).charValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)44);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreHeaderCase();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines((((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.lang.Class)v2));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withSkipHeaderRecord((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = Character.valueOf((char)4);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v3).withQuote(((java.lang.Character)v6));
    Object v8 = true;
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withTrailingDelimiter((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 0;
    Object v11 = new java.io.StringWriter((((java.lang.Integer)v10).intValue()));
    Object v12 = Character.valueOf((char)0);
    Object v13 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v12).charValue()));
    Object v14 = ((org.apache.commons.csv.CSVFormat)v13).toString();
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = ((java.lang.Appendable)v11).append(((java.lang.CharSequence)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((org.apache.commons.csv.CSVFormat)v7).println(((java.lang.Appendable)v11));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = "`";
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withNullString(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreEmptyLines();
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).isCommentMarkerSet();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withTrim((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).getHeaderComments();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = "`";
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withNullString(((java.lang.String)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v4).charValue()));
    Object v6 = "`";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v7).withIgnoreEmptyLines();
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).isCommentMarkerSet();
    Object v10 = ((org.apache.commons.csv.CSVFormat)v3).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withTrim((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withSkipHeaderRecord();
    Object v5 = ((org.apache.commons.csv.CSVFormat)v4).isNullStringSet();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = "`";
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withNullString(((java.lang.String)v2));
    Object v4 = ") invalid char b|tween encapsulated token and delimiter";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreEmptyLines();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 0;
    Object v7 = new java.io.StringWriter((((java.lang.Integer)v6).intValue()));
    Object v8 = Character.valueOf((char)0);
    Object v9 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v8).charValue()));
    Object v10 = true;
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withTrim((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.apache.commons.csv.CSVFormat)v11).withSkipHeaderRecord();
    Object v13 = true;
    Object v14 = ((org.apache.commons.csv.CSVFormat)v12).withTrailingDelimiter((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((org.apache.commons.csv.CSVFormat)v12).toString();
    Object v16 = ((java.lang.Appendable)v7).append(((java.lang.CharSequence)v15));
    ((org.apache.commons.csv.CSVFormat)v3).println(((java.lang.Appendable)v7));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = "`";
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withNullString(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withTrailingDelimiter();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withFirstRecordAsHeader();
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1941554113), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withRecordSeparator((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withTrim((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = ((org.apache.commons.csv.CSVFormat)v1).withHeaderComments(((java.lang.Object[])v4));
    Object v6 = 0;
    Object v7 = new java.io.StringWriter((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.lang.Object[]{null,null};
    ((org.apache.commons.csv.CSVFormat)v5).printRecord(((java.lang.Appendable)v7),((java.lang.Object[])v8));
    Object v9 = null;
    Object v10 = "\u2029";
    Object v11 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.lang.Class)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).isQuoteCharacterSet();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).getTrailingDelimiter();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withRecordSeparator((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withFirstRecordAsHeader();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withTrim((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).isEscapeCharacterSet();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.lang.Class)v2));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withSkipHeaderRecord((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = Character.valueOf((char)4);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v3).withQuote(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape(((java.lang.Character)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = org.apache.commons.csv.QuoteMode.ALL;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withQuoteMode(((org.apache.commons.csv.QuoteMode)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v1).withSkipHeaderRecord();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)2);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)0);
    Object v7 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v6).charValue()));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v5).equals(((java.lang.Object)v7));
    Object v9 = 0;
    Object v10 = new java.io.StringWriter((((java.lang.Integer)v9).intValue()));
    Object v11 = Character.valueOf((char)1);
    Object v12 = ((java.lang.Appendable)v10).append((((java.lang.Character)v11).charValue()));
    Object v13 = true;
    ((org.apache.commons.csv.CSVFormat)v3).print(((java.lang.Object)v8),((java.lang.Appendable)v10),(((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)110);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).getHeaderComments();
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).getTrim();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withTrim((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines();
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withCommentMarker((((java.lang.Character)v3).charValue()));
    Object v5 = ((org.apache.commons.csv.CSVFormat)v4).getRecordSeparator();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)44);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).getQuoteMode();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = org.apache.commons.csv.QuoteMode.ALL;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withQuoteMode(((org.apache.commons.csv.QuoteMode)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v1).isCommentMarkerSet();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.lang.Class)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withSkipHeaderRecord();
    Object v5 = 0;
    Object v6 = new java.io.StringWriter((((java.lang.Integer)v5).intValue()));
    Object v7 = new java.lang.Object[]{null,null};
    ((org.apache.commons.csv.CSVFormat)v3).printRecord(((java.lang.Appendable)v6),((java.lang.Object[])v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withTrim((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withSkipHeaderRecord();
    Object v5 = null;
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withHeader(((java.sql.ResultSet)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withTrim((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withSkipHeaderRecord();
    Object v5 = ((org.apache.commons.csv.CSVFormat)v4).withTrim();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withTrim((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withSkipHeaderRecord();
    Object v5 = ((org.apache.commons.csv.CSVFormat)v4).toString();
    Object v6 = Character.valueOf((char)0);
    Object v7 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v6).charValue()));
    Object v8 = Character.valueOf((char)44);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withCommentMarker(((java.lang.Character)v8));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v4).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getIgnoreSurroundingSpaces();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines();
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withCommentMarker((((java.lang.Character)v3).charValue()));
    Object v5 = "]";
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withRecordSeparator(((java.lang.String)v5));
    Object v7 = true;
    Object v8 = ((org.apache.commons.csv.CSVFormat)v4).withTrailingDelimiter((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.lang.Class)v2));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withSkipHeaderRecord((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = Character.valueOf((char)4);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v3).withQuote(((java.lang.Character)v6));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v7).getQuoteCharacter();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)4)), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = 0;
    Object v5 = new java.io.StringWriter((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    ((org.apache.commons.csv.CSVFormat)v1).print(((java.lang.Object)v3),((java.lang.Appendable)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = 0;
    Object v5 = new java.io.StringWriter((((java.lang.Integer)v4).intValue()));
    Object v6 = new java.lang.Object[]{null};
    ((org.apache.commons.csv.CSVFormat)v3).printRecord(((java.lang.Appendable)v5),((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = false;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withTrailingDelimiter((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = Character.valueOf((char)13);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v4).charValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.lang.Class)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withAllowMissingColumnNames();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)44);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape((((java.lang.Character)v4).charValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)35);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withRecordSeparator((((java.lang.Character)v2).charValue()));
    Object v4 = true;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withSkipHeaderRecord((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(1941555198), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape((((java.lang.Character)v2).charValue()));
    Object v4 = "fuormat";
    Object v5 = "TOKEN";
    Object v6 = new java.io.File(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = ((java.nio.charset.Charset)v7).isRegistered();
    Object v9 = ((org.apache.commons.csv.CSVFormat)v1).print(((java.io.File)v6),((java.nio.charset.Charset)v7));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.lang.Class)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).isNullStringSet();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)2);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(-2095247745), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines();
    Object v3 = false;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withSkipHeaderRecord((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withCommentMarker(((java.lang.Character)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0000> SkipHeaderRecord:false"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withTrim((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = ((org.apache.commons.csv.CSVFormat)v1).withHeaderComments(((java.lang.Object[])v4));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withCommentMarker(((java.lang.Character)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = org.apache.commons.csv.QuoteMode.ALL;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withQuoteMode(((org.apache.commons.csv.QuoteMode)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v1).withSkipHeaderRecord();
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v5).charValue()));
    Object v7 = Character.valueOf((char)1);
    Object v8 = ((org.apache.commons.csv.CSVFormat)v6).withDelimiter((((java.lang.Character)v7).charValue()));
    Object v9 = 0;
    Object v10 = new java.io.StringWriter((((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    ((org.apache.commons.csv.CSVFormat)v4).print(((java.lang.Object)v8),((java.lang.Appendable)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).getRecordSeparator();
    org.junit.Assert.assertNull(v4);
  }
}
