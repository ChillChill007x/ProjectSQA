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
    Object v2 = Character.valueOf((char)2);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0000> SkipHeaderRecord:false"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.sql.ResultSetMetaData)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withAllowMissingColumnNames();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getHeader();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withQuote((((java.lang.Character)v2).charValue()));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v1).withAllowMissingColumnNames((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getSkipHeaderRecord();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getHeaderComments();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.sql.ResultSetMetaData)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuote(((java.lang.Character)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1941554113), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreSurroundingSpaces();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).isNullStringSet();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0000> CommentStart=<\u0001> SkipHeaderRecord:false"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreSurroundingSpaces();
    Object v3 = false;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreHeaderCase((((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withSkipHeaderRecord();
    Object v5 = Character.valueOf((char)5);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v3).withCommentMarker(((java.lang.Character)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).isQuoteCharacterSet();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreSurroundingSpaces();
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = ((org.apache.commons.csv.CSVFormat)v2).isEscapeCharacterSet();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).isCommentMarkerSet();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)2);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).hashCode();
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).isNullStringSet();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.sql.ResultSetMetaData)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).getHeaderComments();
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).getCommentMarker();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreSurroundingSpaces();
    Object v3 = ((org.apache.commons.csv.CSVFormat)v2).getHeader();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.sql.ResultSetMetaData)v2));
    Object v4 = new java.lang.String[]{};
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withHeader(((java.lang.String[])v4));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v3).isNullStringSet();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getAllowMissingColumnNames();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = new java.lang.Object[]{null,null,null};
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).format(((java.lang.Object[])v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).isCommentMarkerSet();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreSurroundingSpaces();
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getQuoteCharacter();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.sql.ResultSetMetaData)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuote(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)3);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withDelimiter((((java.lang.Character)v6).charValue()));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v5).isEscapeCharacterSet();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)2);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).isCommentMarkerSet();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = java.io.Reader.nullReader();
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).parse(((java.io.Reader)v2));
    Object v4 = java.io.Reader.nullReader();
    Object v5 = ((org.apache.commons.csv.CSVFormat)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withSkipHeaderRecord();
    Object v5 = Character.valueOf((char)5);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v3).withCommentMarker(((java.lang.Character)v5));
    Object v7 = Character.valueOf((char)1);
    Object v8 = ((org.apache.commons.csv.CSVFormat)v6).withQuote(((java.lang.Character)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)2);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).getHeader();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withQuote((((java.lang.Character)v2).charValue()));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v1).withAllowMissingColumnNames((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).print(((java.lang.Appendable)v6));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v5).isCommentMarkerSet();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = java.io.Writer.nullWriter();
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).print(((java.lang.Appendable)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.sql.ResultSetMetaData)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuote(((java.lang.Character)v4));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).getHeader();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreSurroundingSpaces((((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = java.io.Writer.nullWriter();
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withCommentMarker(((java.lang.Character)v5));
    Object v7 = ((org.apache.commons.csv.CSVFormat)v6).toString();
    Object v8 = ((java.lang.Appendable)v2).append(((java.lang.CharSequence)v7));
    Object v9 = ((org.apache.commons.csv.CSVFormat)v1).print(((java.lang.Appendable)v2));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreSurroundingSpaces();
    Object v3 = false;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreHeaderCase((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = Character.valueOf((char)32);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withQuote(((java.lang.Character)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = org.apache.commons.csv.QuoteMode.NONE;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withQuoteMode(((org.apache.commons.csv.QuoteMode)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreSurroundingSpaces();
    Object v3 = false;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreHeaderCase((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.apache.commons.csv.CSVFormat)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(1769779207), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0000> SkipHeaderRecord:false"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withHeaderComments(((java.lang.Object[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreSurroundingSpaces();
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = "format";
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withRecordSeparator(((java.lang.String)v5));
    Object v7 = org.apache.commons.csv.QuoteMode.ALL;
    Object v8 = ((org.apache.commons.csv.CSVFormat)v4).withQuoteMode(((org.apache.commons.csv.QuoteMode)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.sql.ResultSetMetaData)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreHeaderCase();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getEscapeCharacter();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreSurroundingSpaces();
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = "format";
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withRecordSeparator(((java.lang.String)v5));
    Object v7 = org.apache.commons.csv.QuoteMode.ALL;
    Object v8 = ((org.apache.commons.csv.CSVFormat)v4).withQuoteMode(((org.apache.commons.csv.QuoteMode)v7));
    Object v9 = ((org.apache.commons.csv.CSVFormat)v8).getIgnoreHeaderCase();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getIgnoreHeaderCase();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreSurroundingSpaces((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = Character.valueOf((char)31);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withRecordSeparator((((java.lang.Character)v4).charValue()));
    Object v6 = java.io.Reader.nullReader();
    Object v7 = new char[]{Character.valueOf((char)10),Character.valueOf((char)1)};
    Object v8 = ((java.io.Reader)v6).read(((char[])v7));
    Object v9 = ((org.apache.commons.csv.CSVFormat)v3).parse(((java.io.Reader)v6));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreSurroundingSpaces();
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withCommentMarker(((java.lang.Character)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreSurroundingSpaces();
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = "format";
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withRecordSeparator(((java.lang.String)v5));
    Object v7 = org.apache.commons.csv.QuoteMode.ALL;
    Object v8 = ((org.apache.commons.csv.CSVFormat)v4).withQuoteMode(((org.apache.commons.csv.QuoteMode)v7));
    Object v9 = ((org.apache.commons.csv.CSVFormat)v8).getHeader();
    Object v10 = true;
    Object v11 = ((org.apache.commons.csv.CSVFormat)v8).withIgnoreEmptyLines((((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.sql.ResultSetMetaData)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreHeaderCase();
    Object v5 = ((org.apache.commons.csv.CSVFormat)v4).getEscapeCharacter();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)2);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withDelimiter((((java.lang.Character)v6).charValue()));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v7).hashCode();
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).isNullStringSet();
    Object v10 = ((org.apache.commons.csv.CSVFormat)v1).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.sql.ResultSetMetaData)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).toString();
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v3).withQuote(((java.lang.Character)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.sql.ResultSetMetaData)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).getIgnoreEmptyLines();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).getHeader();
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).getHeaderComments();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.sql.ResultSetMetaData)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).toString();
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v3).withQuote(((java.lang.Character)v5));
    Object v7 = new java.lang.Object[]{null,null,null};
    Object v8 = ((org.apache.commons.csv.CSVFormat)v6).format(((java.lang.Object[])v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withQuote((((java.lang.Character)v2).charValue()));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v1).withAllowMissingColumnNames((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = Character.valueOf((char)2);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withEscape(((java.lang.Character)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.sql.ResultSetMetaData)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).toString();
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v3).withQuote(((java.lang.Character)v5));
    Object v7 = ((org.apache.commons.csv.CSVFormat)v6).withIgnoreHeaderCase();
    Object v8 = ((org.apache.commons.csv.CSVFormat)v6).withSkipHeaderRecord();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)2);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = new java.lang.String[]{"Escape=<","CommentStart=<"};
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withHeader(((java.lang.String[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withHeaderComments(((java.lang.Object[])v4));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).getIgnoreEmptyLines();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreSurroundingSpaces();
    Object v3 = false;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreHeaderCase((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.apache.commons.csv.CSVFormat)v4).getHeaderComments();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withSkipHeaderRecord();
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).isQuoteCharacterSet();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).isCommentMarkerSet();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)2);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = new java.lang.String[]{"Escape=<","CommentStart=<"};
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withHeader(((java.lang.String[])v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withEscape(((java.lang.Character)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.sql.ResultSetMetaData)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).toString();
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v3).withQuote(((java.lang.Character)v5));
    Object v7 = Character.valueOf((char)1);
    Object v8 = ((org.apache.commons.csv.CSVFormat)v6).withEscape(((java.lang.Character)v7));
    Object v9 = false;
    Object v10 = ((org.apache.commons.csv.CSVFormat)v6).withIgnoreHeaderCase((((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.sql.ResultSetMetaData)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).toString();
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v3).withQuote(((java.lang.Character)v5));
    Object v7 = ((org.apache.commons.csv.CSVFormat)v6).withIgnoreHeaderCase();
    Object v8 = ((org.apache.commons.csv.CSVFormat)v6).withSkipHeaderRecord();
    Object v9 = java.io.Reader.nullReader();
    Object v10 = ((org.apache.commons.csv.CSVFormat)v8).parse(((java.io.Reader)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "]";
    Object v1 = org.apache.commons.csv.CSVFormat.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)2);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = new java.lang.String[]{"Escape=<","CommentStart=<"};
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withHeader(((java.lang.String[])v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withEscape(((java.lang.Character)v6));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v7).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0002> Escape=<\u0000> SkipHeaderRecord:false Header:[Escape=<, CommentStart=<]"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.sql.ResultSetMetaData)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).toString();
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v3).withQuote(((java.lang.Character)v5));
    Object v7 = Character.valueOf((char)0);
    Object v8 = ((org.apache.commons.csv.CSVFormat)v6).withCommentMarker(((java.lang.Character)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.sql.ResultSetMetaData)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).toString();
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v3).withQuote(((java.lang.Character)v5));
    Object v7 = Character.valueOf((char)1);
    Object v8 = ((org.apache.commons.csv.CSVFormat)v6).withEscape(((java.lang.Character)v7));
    Object v9 = false;
    Object v10 = ((org.apache.commons.csv.CSVFormat)v6).withIgnoreHeaderCase((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.apache.commons.csv.CSVFormat)v10).getQuoteMode();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces();
    Object v5 = Character.valueOf((char)13);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withDelimiter((((java.lang.Character)v5).charValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).isQuoteCharacterSet();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.sql.ResultSetMetaData)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(1941554113), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreSurroundingSpaces();
    Object v3 = false;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreHeaderCase((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = Character.valueOf((char)32);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withQuote(((java.lang.Character)v5));
    Object v7 = java.io.Writer.nullWriter();
    Object v8 = ((org.apache.commons.csv.CSVFormat)v6).print(((java.lang.Appendable)v7));
    Object v9 = ((org.apache.commons.csv.CSVFormat)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(-223685657), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getDelimiter();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreSurroundingSpaces();
    Object v3 = false;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreHeaderCase((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = Character.valueOf((char)32);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withQuote(((java.lang.Character)v5));
    Object v7 = ((org.apache.commons.csv.CSVFormat)v6).isQuoteCharacterSet();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withRecordSeparator((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreSurroundingSpaces();
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withHeader(((java.sql.ResultSetMetaData)v5));
    Object v7 = Character.valueOf((char)1);
    Object v8 = ((org.apache.commons.csv.CSVFormat)v6).withQuote(((java.lang.Character)v7));
    Object v9 = ((org.apache.commons.csv.CSVFormat)v2).equals(((java.lang.Object)v8));
    Object v10 = Character.valueOf((char)2);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v2).withQuote((((java.lang.Character)v10).charValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = true;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withSkipHeaderRecord((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape((((java.lang.Character)v2).charValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).isQuoteCharacterSet();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)2);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = new java.lang.String[]{"Escape=<","CommentStart=<"};
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withHeader(((java.lang.String[])v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withEscape(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withQuote(((java.lang.Character)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withHeaderComments(((java.lang.Object[])v4));
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).print(((java.lang.Appendable)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).withSkipHeaderRecord();
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).isQuoteCharacterSet();
    Object v6 = ((org.apache.commons.csv.CSVFormat)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withQuote((((java.lang.Character)v2).charValue()));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v1).withAllowMissingColumnNames((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withHeader(((java.sql.ResultSetMetaData)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreSurroundingSpaces();
    Object v3 = ((org.apache.commons.csv.CSVFormat)v2).getQuoteCharacter();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)2);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = new java.lang.String[]{"Escape=<","CommentStart=<"};
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withHeader(((java.lang.String[])v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withEscape(((java.lang.Character)v6));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v7).getHeaderComments();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withDelimiter((((java.lang.Character)v2).charValue()));
    Object v4 = true;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withSkipHeaderRecord((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuote(((java.lang.Character)v6));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v5).withAllowMissingColumnNames();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getNullString();
    org.junit.Assert.assertNull(v2);
  }
}
