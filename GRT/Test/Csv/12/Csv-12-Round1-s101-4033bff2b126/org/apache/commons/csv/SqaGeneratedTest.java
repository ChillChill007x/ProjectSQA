package org.apache.commons.csv;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getQuoteMode();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withEscape(((java.lang.Character)v6));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v3).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).isNullStringSet();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withIgnoreEmptyLines((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v5).getRecordSeparator();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withEscape(((java.lang.Character)v6));
    Object v8 = org.apache.commons.csv.QuoteMode.ALL;
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withQuoteMode(((org.apache.commons.csv.QuoteMode)v8));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v3).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = java.io.Reader.nullReader();
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).parse(((java.io.Reader)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).isEscapeCharacterSet();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(1875194129), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).isEscapeCharacterSet();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = java.io.Reader.nullReader();
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).parse(((java.io.Reader)v6));
    Object v8 = Character.valueOf((char)1);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v5).withCommentMarker((((java.lang.Character)v8).charValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v7).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0001> Escape=<\u0000> NullString=<) invalid par> SkipHeaderRecord:false"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).isCommentMarkerSet();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withAllowMissingColumnNames((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = Character.valueOf((char)1);
    Object v9 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v8).charValue()));
    Object v10 = Character.valueOf((char)0);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withEscape(((java.lang.Character)v10));
    Object v12 = ((org.apache.commons.csv.CSVFormat)v11).isNullStringSet();
    Object v13 = ((org.apache.commons.csv.CSVFormat)v5).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v7).getHeader();
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).isQuoteCharacterSet();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).getHeader();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = Character.valueOf((char)2);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape(((java.lang.Character)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape((((java.lang.Character)v8).charValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = Character.valueOf((char)2);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape(((java.lang.Character)v8));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v9).isCommentMarkerSet();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).isEscapeCharacterSet();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = new java.lang.String[]{};
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withHeader(((java.lang.String[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).toString();
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).isNullStringSet();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "r)ader";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withRecordSeparator(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuote(((java.lang.Character)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = true;
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withSkipHeaderRecord((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v7).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0001> Escape=<\u0000> NullString=<) invalid par> SkipHeaderRecord:false"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v7).getHeader();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"The comment start marker character cannot be a line break","The quoteChar character and the delimiter cannot be the same ('"};
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withHeader(((java.lang.String[])v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withEscape((((java.lang.Character)v6).charValue()));
    Object v8 = Character.valueOf((char)1);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v5).withEscape(((java.lang.Character)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = new java.lang.Object[]{null,null,null};
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).format(((java.lang.Object[])v6));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(1464881274), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = Character.valueOf((char)2);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape(((java.lang.Character)v8));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v9).getHeader();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape((((java.lang.Character)v8).charValue()));
    Object v10 = Character.valueOf((char)1);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withDelimiter((((java.lang.Character)v10).charValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape((((java.lang.Character)v8).charValue()));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v9).hashCode();
    org.junit.Assert.assertEquals((Object)(597682224), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).getAllowMissingColumnNames();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = Character.valueOf((char)2);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape(((java.lang.Character)v8));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v9).getCommentMarker();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuote((((java.lang.Character)v6).charValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withDelimiter((((java.lang.Character)v8).charValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withAllowMissingColumnNames((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.lang.Object[]{null,null};
    Object v9 = ((org.apache.commons.csv.CSVFormat)v5).format(((java.lang.Object[])v8));
    org.junit.Assert.assertEquals((Object)("EORECORD\u0001EORECORD"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withRecordSeparator((((java.lang.Character)v8).charValue()));
    Object v10 = org.apache.commons.csv.QuoteMode.ALL;
    Object v11 = ((java.lang.Enum)v10).getDeclaringClass();
    Object v12 = ((org.apache.commons.csv.CSVFormat)v7).withQuoteMode(((org.apache.commons.csv.QuoteMode)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "r)ader";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withRecordSeparator(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0001> Escape=<\u0000> RecordSeparator=<r)ader> SkipHeaderRecord:false"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withDelimiter((((java.lang.Character)v6).charValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape((((java.lang.Character)v8).charValue()));
    Object v10 = Character.valueOf((char)1);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withDelimiter((((java.lang.Character)v10).charValue()));
    Object v12 = Character.valueOf((char)0);
    Object v13 = ((org.apache.commons.csv.CSVFormat)v11).withQuote(((java.lang.Character)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"The comment start marker character cannot be a line break","The quoteChar character and the delimiter cannot be the same ('"};
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withHeader(((java.lang.String[])v8));
    Object v10 = true;
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withSkipHeaderRecord((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.apache.commons.csv.CSVFormat)v9).isNullStringSet();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"The comment start marker character cannot be a line break","The quoteChar character and the delimiter cannot be the same ('"};
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withHeader(((java.lang.String[])v8));
    Object v10 = Character.valueOf((char)1);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withCommentMarker(((java.lang.Character)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape((((java.lang.Character)v8).charValue()));
    Object v10 = Character.valueOf((char)1);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withDelimiter((((java.lang.Character)v10).charValue()));
    Object v12 = ((org.apache.commons.csv.CSVFormat)v11).getHeader();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = new java.lang.String[]{};
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withHeader(((java.lang.String[])v6));
    Object v8 = new java.io.StringWriter();
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).print(((java.lang.Appendable)v8));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(1464881275), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "r)ader";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withRecordSeparator(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withSkipHeaderRecord((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v5).isQuoteCharacterSet();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuote((((java.lang.Character)v6).charValue()));
    Object v8 = false;
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withSkipHeaderRecord((((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withSkipHeaderRecord((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v5).withQuote(((java.lang.Character)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withSkipHeaderRecord((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v5).withQuote(((java.lang.Character)v8));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v9).isNullStringSet();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuote((((java.lang.Character)v6).charValue()));
    Object v8 = false;
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withSkipHeaderRecord((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = Character.valueOf((char)31);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withCommentMarker(((java.lang.Character)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withSkipHeaderRecord((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v5).withQuote(((java.lang.Character)v8));
    Object v10 = Character.valueOf((char)10);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withQuote((((java.lang.Character)v10).charValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuote((((java.lang.Character)v6).charValue()));
    Object v8 = false;
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withSkipHeaderRecord((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = Character.valueOf((char)31);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withCommentMarker(((java.lang.Character)v10));
    Object v12 = ((org.apache.commons.csv.CSVFormat)v11).isQuoteCharacterSet();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).isQuoteCharacterSet();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withSkipHeaderRecord((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v5).withQuote(((java.lang.Character)v8));
    Object v10 = new java.io.StringWriter();
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).print(((java.lang.Appendable)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = ((org.apache.commons.csv.CSVFormat)v9).withCommentMarker(((java.lang.Character)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape((((java.lang.Character)v8).charValue()));
    Object v10 = Character.valueOf((char)1);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withDelimiter((((java.lang.Character)v10).charValue()));
    Object v12 = Character.valueOf((char)0);
    Object v13 = ((org.apache.commons.csv.CSVFormat)v11).withQuote(((java.lang.Character)v12));
    Object v14 = true;
    Object v15 = ((org.apache.commons.csv.CSVFormat)v13).withIgnoreSurroundingSpaces((((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withSkipHeaderRecord((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v5).withQuote(((java.lang.Character)v8));
    Object v10 = Character.valueOf((char)0);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withRecordSeparator((((java.lang.Character)v10).charValue()));
    Object v12 = ((org.apache.commons.csv.CSVFormat)v9).getQuoteCharacter();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0001> Escape=<\u0000> SkipHeaderRecord:false"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuote((((java.lang.Character)v6).charValue()));
    Object v8 = false;
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withSkipHeaderRecord((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = Character.valueOf((char)31);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withCommentMarker(((java.lang.Character)v10));
    Object v12 = ((org.apache.commons.csv.CSVFormat)v11).isCommentMarkerSet();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = Character.valueOf((char)3);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = Character.valueOf((char)3);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(213631639), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.lang.Object[]{};
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).format(((java.lang.Object[])v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape((((java.lang.Character)v8).charValue()));
    Object v10 = Character.valueOf((char)1);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withDelimiter((((java.lang.Character)v10).charValue()));
    Object v12 = Character.valueOf((char)0);
    Object v13 = ((org.apache.commons.csv.CSVFormat)v11).withQuote(((java.lang.Character)v12));
    Object v14 = ((org.apache.commons.csv.CSVFormat)v13).getAllowMissingColumnNames();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuote((((java.lang.Character)v6).charValue()));
    Object v8 = false;
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withSkipHeaderRecord((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = Character.valueOf((char)31);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withCommentMarker(((java.lang.Character)v10));
    Object v12 = ((org.apache.commons.csv.CSVFormat)v11).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0001> Escape=<\u0000> QuoteChar=<\u0000> CommentStart=<\u001f> NullString=<EORECORD> SkipHeaderRecord:false"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape((((java.lang.Character)v8).charValue()));
    Object v10 = Character.valueOf((char)1);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withDelimiter((((java.lang.Character)v10).charValue()));
    Object v12 = Character.valueOf((char)0);
    Object v13 = ((org.apache.commons.csv.CSVFormat)v11).withQuote(((java.lang.Character)v12));
    Object v14 = ((org.apache.commons.csv.CSVFormat)v13).getHeader();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withRecordSeparator((((java.lang.Character)v6).charValue()));
    Object v8 = Character.valueOf((char)1);
    Object v9 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v8).charValue()));
    Object v10 = Character.valueOf((char)0);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withEscape(((java.lang.Character)v10));
    Object v12 = "EORECORD";
    Object v13 = ((org.apache.commons.csv.CSVFormat)v11).withNullString(((java.lang.String)v12));
    Object v14 = Character.valueOf((char)0);
    Object v15 = ((org.apache.commons.csv.CSVFormat)v13).withQuote((((java.lang.Character)v14).charValue()));
    Object v16 = false;
    Object v17 = ((org.apache.commons.csv.CSVFormat)v15).withSkipHeaderRecord((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((org.apache.commons.csv.CSVFormat)v5).equals(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = Character.valueOf((char)3);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines((((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuote((((java.lang.Character)v6).charValue()));
    Object v8 = false;
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withSkipHeaderRecord((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = Character.valueOf((char)31);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withCommentMarker(((java.lang.Character)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = ((org.apache.commons.csv.CSVFormat)v11).withDelimiter((((java.lang.Character)v12).charValue()));
    Object v14 = ((org.apache.commons.csv.CSVFormat)v11).isNullStringSet();
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = Character.valueOf((char)3);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = "QuoteChar=<";
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withRecordSeparator(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v1).getCommentMarker();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).getSkipHeaderRecord();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = Character.valueOf((char)3);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = Character.valueOf((char)3);
    Object v5 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v4).charValue()));
    Object v6 = true;
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withIgnoreEmptyLines((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v3).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = Character.valueOf((char)3);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = Character.valueOf((char)3);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).getCommentMarker();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = Character.valueOf((char)3);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = new java.lang.Object[]{};
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).format(((java.lang.Object[])v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuote((((java.lang.Character)v6).charValue()));
    Object v8 = false;
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withSkipHeaderRecord((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v9).isQuoteCharacterSet();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = new java.io.StringWriter();
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).print(((java.lang.Appendable)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = Character.valueOf((char)2);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuote((((java.lang.Character)v6).charValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuote((((java.lang.Character)v6).charValue()));
    Object v8 = false;
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withSkipHeaderRecord((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v9).getSkipHeaderRecord();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = new java.lang.String[]{};
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withHeader(((java.lang.String[])v6));
    Object v8 = true;
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withSkipHeaderRecord((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v7).isCommentMarkerSet();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = Character.valueOf((char)3);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).isNullStringSet();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = Character.valueOf((char)3);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).getHeader();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v7).getCommentMarker();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuote((((java.lang.Character)v6).charValue()));
    Object v8 = false;
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withSkipHeaderRecord((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = Character.valueOf((char)31);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withCommentMarker(((java.lang.Character)v10));
    Object v12 = new java.lang.String[]{};
    Object v13 = ((org.apache.commons.csv.CSVFormat)v11).withHeader(((java.lang.String[])v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "EORECORD";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuote((((java.lang.Character)v6).charValue()));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v7).isQuoteCharacterSet();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = ") invalid par";
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withNullString(((java.lang.String)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape((((java.lang.Character)v8).charValue()));
    Object v10 = Character.valueOf((char)1);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withDelimiter((((java.lang.Character)v10).charValue()));
    Object v12 = Character.valueOf((char)0);
    Object v13 = ((org.apache.commons.csv.CSVFormat)v11).withEscape(((java.lang.Character)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = "r)ader";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withRecordSeparator(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(-1124771986), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = Character.valueOf((char)3);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).isNullStringSet();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = Character.valueOf((char)3);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = "\u2028";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withEscape(((java.lang.Character)v2));
    Object v4 = org.apache.commons.csv.QuoteMode.ALL;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteMode(((org.apache.commons.csv.QuoteMode)v4));
    Object v6 = Character.valueOf((char)2);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuote((((java.lang.Character)v6).charValue()));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v7).isQuoteCharacterSet();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = Character.valueOf((char)3);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = "\u2028";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withNullString(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).getDelimiter();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)3)), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = Character.valueOf((char)3);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0003> CommentStart=<\u0000> SkipHeaderRecord:false"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = Character.valueOf((char)3);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).isQuoteCharacterSet();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = Character.valueOf((char)3);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = Character.valueOf((char)9);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = Character.valueOf((char)3);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentMarker(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).getHeader();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = Character.valueOf((char)3);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).hashCode();
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(213452893), v5);
  }
}
