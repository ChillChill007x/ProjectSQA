package org.apache.commons.csv;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = new org.apache.commons.csv.Token();
    Object v15 = ((org.apache.commons.csv.Lexer)v13).nextToken(((org.apache.commons.csv.Token)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 1;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isCommentStart((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = new java.lang.StringBuilder();
    ((org.apache.commons.csv.Lexer)v13).trimTrailingSpaces(((java.lang.StringBuilder)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 0;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isWhitespace((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 1;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isEscape((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 6;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isEscape((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -24;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isDelimiter((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 12;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isWhitespace((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 3;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isCommentStart((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -6;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 3;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 0;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isEndOfFile((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = ((org.apache.commons.csv.Lexer)v13).readEscape();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -23;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isEndOfFile((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 20;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 47;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isStartOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 0;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 1;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isDelimiter((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 30;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 13;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isCommentStart((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 0;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).readEndOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = ((org.apache.commons.csv.Lexer)v13).getLineNumber();
    org.junit.Assert.assertEquals((Object)(0L), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 40;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isDelimiter((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 35;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -21;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isCommentStart((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 7;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isEscape((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 12;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isStartOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 34;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).readEndOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 1;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).readEndOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 21;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isWhitespace((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -30;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).readEndOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 4;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isCommentStart((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 0;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isDelimiter((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -19;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isWhitespace((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 0;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isEscape((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 14;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 1;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isEndOfFile((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 1;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isWhitespace((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -3;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isStartOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 0;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isStartOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -11;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isEndOfFile((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 43;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 7;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = Character.valueOf((char)1);
    Object v15 = Character.valueOf((char)122);
    Object v16 = org.apache.commons.csv.Quote.MINIMAL;
    Object v17 = Character.valueOf((char)0);
    Object v18 = Character.valueOf((char)0);
    Object v19 = false;
    Object v20 = false;
    Object v21 = "]";
    Object v22 = "QuouteChar=<";
    Object v23 = new java.lang.String[]{"NOE","EORECORD"};
    Object v24 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v14).charValue()),((java.lang.Character)v15),((org.apache.commons.csv.Quote)v16),((java.lang.Character)v17),((java.lang.Character)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()),((java.lang.String)v21),((java.lang.String)v22),((java.lang.String[])v23));
    Object v25 = java.io.Reader.nullReader();
    Object v26 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v25));
    Object v27 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v24),((org.apache.commons.csv.ExtendedBufferedReader)v26));
    Object v28 = new org.apache.commons.csv.Token();
    Object v29 = ((org.apache.commons.csv.Lexer)v27).nextToken(((org.apache.commons.csv.Token)v28));
    Object v30 = ((org.apache.commons.csv.Lexer)v13).nextToken(((org.apache.commons.csv.Token)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 16;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isStartOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 9;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 1;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 0;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isCommentStart((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -43;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).readEndOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -2;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = new java.lang.StringBuilder();
    Object v15 = 41;
    Object v16 = ((java.lang.StringBuilder)v14).appendCodePoint((((java.lang.Integer)v15).intValue()));
    ((org.apache.commons.csv.Lexer)v13).trimTrailingSpaces(((java.lang.StringBuilder)v14));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -16;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isWhitespace((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -28;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isCommentStart((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 26;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isDelimiter((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 60;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isWhitespace((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 1;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isStartOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 57;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isEndOfFile((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -32;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isDelimiter((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 2;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isCommentStart((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -25;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isDelimiter((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -1;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isStartOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 3;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).readEndOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -20;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isStartOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 48;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isStartOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 69;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).readEndOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 18;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isWhitespace((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 15;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isEndOfFile((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = new org.apache.commons.csv.Token();
    Object v15 = ((org.apache.commons.csv.Token)v14).toString();
    Object v16 = ((org.apache.commons.csv.Lexer)v13).nextToken(((org.apache.commons.csv.Token)v14));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -21;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isWhitespace((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = Character.valueOf((char)1);
    Object v15 = Character.valueOf((char)122);
    Object v16 = org.apache.commons.csv.Quote.MINIMAL;
    Object v17 = Character.valueOf((char)0);
    Object v18 = Character.valueOf((char)0);
    Object v19 = false;
    Object v20 = false;
    Object v21 = "]";
    Object v22 = "QuouteChar=<";
    Object v23 = new java.lang.String[]{"NOE","EORECORD"};
    Object v24 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v14).charValue()),((java.lang.Character)v15),((org.apache.commons.csv.Quote)v16),((java.lang.Character)v17),((java.lang.Character)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()),((java.lang.String)v21),((java.lang.String)v22),((java.lang.String[])v23));
    Object v25 = java.io.Reader.nullReader();
    Object v26 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v25));
    Object v27 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v24),((org.apache.commons.csv.ExtendedBufferedReader)v26));
    Object v28 = new org.apache.commons.csv.Token();
    Object v29 = ((org.apache.commons.csv.Token)v28).toString();
    Object v30 = ((org.apache.commons.csv.Lexer)v27).nextToken(((org.apache.commons.csv.Token)v28));
    Object v31 = ((org.apache.commons.csv.Token)v30).toString();
    Object v32 = ((org.apache.commons.csv.Lexer)v13).nextToken(((org.apache.commons.csv.Token)v30));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -22;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = new java.lang.StringBuilder();
    Object v15 = 0L;
    Object v16 = ((java.lang.StringBuilder)v14).append((((java.lang.Long)v15).longValue()));
    ((org.apache.commons.csv.Lexer)v13).trimTrailingSpaces(((java.lang.StringBuilder)v14));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -46;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isWhitespace((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -4;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isEndOfFile((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -35;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -1;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isCommentStart((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -45;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isWhitespace((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 90;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isWhitespace((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -29;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isEndOfFile((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 36;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isCommentStart((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 39;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isEscape((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -38;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isEndOfFile((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 5;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -29;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 65;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isDelimiter((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 41;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isStartOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -35;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isEscape((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -18;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).readEndOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -10;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isStartOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 4;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isStartOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -25;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).readEndOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -25;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 25;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 25;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isEscape((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = -34;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 13;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isEscape((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 9;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isWhitespace((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 28;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isWhitespace((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 50;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isStartOfLine((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = Character.valueOf((char)122);
    Object v2 = org.apache.commons.csv.Quote.MINIMAL;
    Object v3 = Character.valueOf((char)0);
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = false;
    Object v7 = "]";
    Object v8 = "QuouteChar=<";
    Object v9 = new java.lang.String[]{"NOE","EORECORD"};
    Object v10 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v0).charValue()),((java.lang.Character)v1),((org.apache.commons.csv.Quote)v2),((java.lang.Character)v3),((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v11));
    Object v13 = new org.apache.commons.csv.CSVLexer(((org.apache.commons.csv.CSVFormat)v10),((org.apache.commons.csv.ExtendedBufferedReader)v12));
    Object v14 = 63;
    Object v15 = ((org.apache.commons.csv.Lexer)v13).isQuoteChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }
}
