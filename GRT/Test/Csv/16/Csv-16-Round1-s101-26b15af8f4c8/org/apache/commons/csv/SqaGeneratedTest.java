package org.apache.commons.csv;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = 14L;
    Object v4 = 0L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).isClosed();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = 14L;
    Object v4 = 0L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).nextRecord();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = 14L;
    Object v4 = 0L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).getRecords();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = 14L;
    Object v4 = 0L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = ((java.lang.Iterable)v5).spliterator();
    Object v7 = ((org.apache.commons.csv.CSVParser)v5).iterator();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = 14L;
    Object v4 = 0L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    ((org.apache.commons.csv.CSVParser)v5).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = 14L;
    Object v4 = 0L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).getFirstEndOfLine();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = 14L;
    Object v4 = 0L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).getHeaderMap();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = 14L;
    Object v4 = 0L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).iterator();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = 14L;
    Object v4 = 0L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).getHeaderMap();
    Object v7 = ((org.apache.commons.csv.CSVParser)v5).isClosed();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.io.StringWriter();
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).print(((java.lang.Appendable)v3));
    Object v5 = 7L;
    Object v6 = 1L;
    Object v7 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v5).longValue()),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.io.StringWriter();
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).print(((java.lang.Appendable)v3));
    Object v5 = 7L;
    Object v6 = 1L;
    Object v7 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v5).longValue()),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.csv.CSVParser)v7).getHeaderMap();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.io.StringWriter();
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).print(((java.lang.Appendable)v3));
    Object v5 = 7L;
    Object v6 = 1L;
    Object v7 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v5).longValue()),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.csv.CSVParser)v7).nextRecord();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = 14L;
    Object v4 = 0L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).getRecords();
    Object v7 = ((java.lang.Iterable)v6).iterator();
    Object v8 = ((java.lang.Iterable)v6).spliterator();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.io.StringWriter();
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).print(((java.lang.Appendable)v3));
    Object v5 = 7L;
    Object v6 = 1L;
    Object v7 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v5).longValue()),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.csv.CSVParser)v7).getFirstEndOfLine();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "format";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "format";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getRecords();
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).getRecords();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "format";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "format";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getRecords();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = ((java.io.Reader)v0).read();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withAllowMissingColumnNames((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = org.apache.commons.csv.CSVParser.parse(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = " [";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = ((org.apache.commons.csv.CSVFormat)v2).print(((java.io.File)v4),((java.nio.charset.Charset)v5));
    Object v7 = org.apache.commons.csv.CSVParser.parse(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getRecords();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = " [";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = ((org.apache.commons.csv.CSVFormat)v2).print(((java.io.File)v4),((java.nio.charset.Charset)v5));
    Object v7 = org.apache.commons.csv.CSVParser.parse(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v8 = ((org.apache.commons.csv.CSVParser)v7).getHeaderMap();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getCurrentLineNumber();
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = -30L;
    Object v4 = 16L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = -30L;
    Object v4 = 16L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).getRecords();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = -30L;
    Object v4 = 16L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).getHeaderMap();
    ((org.apache.commons.csv.CSVParser)v5).close();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "\r\n";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = false;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreHeaderCase((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = 0L;
    Object v2 = ((java.io.Reader)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = Character.valueOf((char)3);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withQuote((((java.lang.Character)v5).charValue()));
    Object v7 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = " [";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = ((java.nio.charset.Charset)v2).newDecoder();
    Object v4 = Character.valueOf((char)0);
    Object v5 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).withTrim();
    Object v7 = org.apache.commons.csv.CSVParser.parse(((java.io.File)v1),((java.nio.charset.Charset)v2),((org.apache.commons.csv.CSVFormat)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.io.StringWriter();
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).print(((java.lang.Appendable)v3));
    Object v5 = 7L;
    Object v6 = 1L;
    Object v7 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v5).longValue()),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.csv.CSVParser)v7).getRecordNumber();
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = -30L;
    Object v4 = 16L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    ((org.apache.commons.csv.CSVParser)v5).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = org.apache.commons.csv.CSVParser.parse(((java.io.InputStream)v0),((java.nio.charset.Charset)v1),((org.apache.commons.csv.CSVFormat)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = org.apache.commons.csv.CSVParser.parse(((java.io.InputStream)v0),((java.nio.charset.Charset)v1),((org.apache.commons.csv.CSVFormat)v3));
    Object v5 = ((org.apache.commons.csv.CSVParser)v4).getHeaderMap();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "format";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).iterator();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = -30L;
    Object v4 = 16L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).getCurrentLineNumber();
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.io.StringWriter();
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).print(((java.lang.Appendable)v3));
    Object v5 = 7L;
    Object v6 = 1L;
    Object v7 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v5).longValue()),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.csv.CSVParser)v7).getRecords();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "format";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v4 = null;
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = 14L;
    Object v4 = 0L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).getRecords();
    Object v7 = ((java.lang.Iterable)v6).spliterator();
    Object v8 = null;
    ((java.lang.Iterable)v6).forEach(((java.util.function.Consumer)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = -30L;
    Object v4 = 16L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    ((org.apache.commons.csv.CSVParser)v5).close();
    Object v6 = null;
    ((org.apache.commons.csv.CSVParser)v5).close();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "format";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getRecords();
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).getRecords();
    Object v6 = null;
    ((java.lang.Iterable)v5).forEach(((java.util.function.Consumer)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "The escape character cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = ((java.io.Reader)v0).read();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withAllowMissingColumnNames((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = org.apache.commons.csv.CSVParser.parse(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v3));
    Object v7 = ((org.apache.commons.csv.CSVParser)v6).nextRecord();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = 14L;
    Object v4 = 0L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).getRecords();
    Object v7 = ((java.lang.Iterable)v6).spliterator();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = -30L;
    Object v4 = 16L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    ((org.apache.commons.csv.CSVParser)v5).close();
    Object v6 = null;
    Object v7 = ((org.apache.commons.csv.CSVParser)v5).getRecords();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "\r\n";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = false;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreHeaderCase((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).nextRecord();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "\r\n";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = false;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreHeaderCase((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).getHeaderMap();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = -30L;
    Object v4 = 16L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).getRecordNumber();
    org.junit.Assert.assertEquals((Object)(15L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = " [";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = org.apache.commons.csv.CSVParser.parse(((java.io.File)v1),((java.nio.charset.Charset)v2),((org.apache.commons.csv.CSVFormat)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "The escape character cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getRecords();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "The escape character cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "The escape character cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = -30L;
    Object v4 = 16L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).getHeaderMap();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = -39L;
    Object v4 = 1L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "The escape character cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = -30L;
    Object v4 = 16L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = ((java.lang.Iterable)v5).spliterator();
    ((org.apache.commons.csv.CSVParser)v5).close();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = org.apache.commons.csv.CSVParser.parse(((java.io.InputStream)v0),((java.nio.charset.Charset)v1),((org.apache.commons.csv.CSVFormat)v3));
    ((org.apache.commons.csv.CSVParser)v4).close();
    Object v5 = null;
    Object v6 = ((org.apache.commons.csv.CSVParser)v4).getHeaderMap();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = 0L;
    Object v2 = ((java.io.Reader)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = Character.valueOf((char)3);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withQuote((((java.lang.Character)v5).charValue()));
    Object v7 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v4));
    Object v8 = ((org.apache.commons.csv.CSVParser)v7).getHeaderMap();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "format";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
    Object v6 = null;
    ((java.lang.Iterable)v5).forEach(((java.util.function.Consumer)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "The escape character cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).isClosed();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.io.StringWriter();
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).print(((java.lang.Appendable)v3));
    Object v5 = 7L;
    Object v6 = 1L;
    Object v7 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v5).longValue()),(((java.lang.Long)v6).longValue()));
    ((org.apache.commons.csv.CSVParser)v7).close();
    Object v8 = null;
    Object v9 = ((org.apache.commons.csv.CSVParser)v7).getRecords();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v4 = null;
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withAllowMissingColumnNames((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0L;
    Object v6 = 2L;
    Object v7 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v5).longValue()),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = -30L;
    Object v4 = 16L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).nextRecord();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = -39L;
    Object v4 = 1L;
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    ((org.apache.commons.csv.CSVParser)v5).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.io.StringWriter();
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).print(((java.lang.Appendable)v3));
    Object v5 = 7L;
    Object v6 = 1L;
    Object v7 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v5).longValue()),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.csv.CSVParser)v7).isClosed();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "The comment starXt marker character cannot be a line break";
    Object v1 = new java.lang.String[]{"format"};
    Object v2 = java.nio.file.Path.of(((java.lang.String)v0),((java.lang.String[])v1));
    Object v3 = "The comment starXt marker character cannot be a line break";
    Object v4 = new java.lang.String[]{"format"};
    Object v5 = java.nio.file.Path.of(((java.lang.String)v3),((java.lang.String[])v4));
    Object v6 = ((java.nio.file.Path)v2).resolveSibling(((java.nio.file.Path)v5));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = Character.valueOf((char)0);
    Object v9 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v8).charValue()));
    Object v10 = org.apache.commons.csv.CSVParser.parse(((java.nio.file.Path)v2),((java.nio.charset.Charset)v7),((org.apache.commons.csv.CSVFormat)v9));
      org.junit.Assert.fail("Expected java.nio.file.NoSuchFileException");
    } catch (java.nio.file.NoSuchFileException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = " [";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = ((java.nio.charset.Charset)v2).newDecoder();
    Object v4 = Character.valueOf((char)0);
    Object v5 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).withTrim();
    Object v7 = org.apache.commons.csv.CSVParser.parse(((java.io.File)v1),((java.nio.charset.Charset)v2),((org.apache.commons.csv.CSVFormat)v5));
    ((org.apache.commons.csv.CSVParser)v7).close();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = 0L;
    Object v2 = ((java.io.Reader)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = Character.valueOf((char)3);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withQuote((((java.lang.Character)v5).charValue()));
    Object v7 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v4));
    Object v8 = ((org.apache.commons.csv.CSVParser)v7).nextRecord();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = 0L;
    Object v2 = ((java.io.Reader)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = Character.valueOf((char)3);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withQuote((((java.lang.Character)v5).charValue()));
    Object v7 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v4));
    Object v8 = ((java.lang.Iterable)v7).spliterator();
    Object v9 = ((org.apache.commons.csv.CSVParser)v7).getHeaderMap();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = 0L;
    Object v2 = ((java.io.Reader)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = Character.valueOf((char)3);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withQuote((((java.lang.Character)v5).charValue()));
    Object v7 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v4));
    Object v8 = ((org.apache.commons.csv.CSVParser)v7).getRecords();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "The escape character cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getRecords();
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withAllowMissingColumnNames((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0L;
    Object v6 = 2L;
    Object v7 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v5).longValue()),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.csv.CSVParser)v7).getHeaderMap();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = 0L;
    Object v2 = ((java.io.Reader)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = Character.valueOf((char)3);
    Object v6 = ((org.apache.commons.csv.CSVFormat)v4).withQuote((((java.lang.Character)v5).charValue()));
    Object v7 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v4));
    Object v8 = ((org.apache.commons.csv.CSVParser)v7).getRecords();
    Object v9 = ((org.apache.commons.csv.CSVParser)v7).getHeaderMap();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = " [";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = ((org.apache.commons.csv.CSVFormat)v2).print(((java.io.File)v4),((java.nio.charset.Charset)v5));
    Object v7 = org.apache.commons.csv.CSVParser.parse(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v8 = ((org.apache.commons.csv.CSVParser)v7).getCurrentLineNumber();
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = org.apache.commons.csv.CSVParser.parse(((java.io.InputStream)v0),((java.nio.charset.Charset)v1),((org.apache.commons.csv.CSVFormat)v3));
    Object v5 = ((org.apache.commons.csv.CSVParser)v4).getHeaderMap();
    Object v6 = ((org.apache.commons.csv.CSVParser)v4).nextRecord();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "\r\n";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = false;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreHeaderCase((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).getRecords();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = "inputSjtream";
    Object v3 = ((java.nio.charset.Charset)v1).encode(((java.lang.String)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v4).charValue()));
    Object v6 = org.apache.commons.csv.CSVParser.parse(((java.io.InputStream)v0),((java.nio.charset.Charset)v1),((org.apache.commons.csv.CSVFormat)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "\r\n";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = false;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreHeaderCase((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v5).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = ((java.io.Reader)v0).read();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withAllowMissingColumnNames((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = org.apache.commons.csv.CSVParser.parse(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v3));
    Object v7 = ((org.apache.commons.csv.CSVParser)v6).getRecords();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "The escape character cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 1L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = Character.valueOf((char)0);
    Object v5 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).withSkipHeaderRecord();
    Object v7 = org.apache.commons.csv.CSVParser.parse(((java.io.InputStream)v0),((java.nio.charset.Charset)v3),((org.apache.commons.csv.CSVFormat)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "NullString=<";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getRecords();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "NullString=<";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = " [";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = org.apache.commons.csv.CSVParser.parse(((java.io.File)v1),((java.nio.charset.Charset)v2),((org.apache.commons.csv.CSVFormat)v4));
    ((org.apache.commons.csv.CSVParser)v5).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withAllowMissingColumnNames((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0L;
    Object v6 = 2L;
    Object v7 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2),(((java.lang.Long)v5).longValue()),(((java.lang.Long)v6).longValue()));
    ((org.apache.commons.csv.CSVParser)v7).close();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = "inputSjtream";
    Object v3 = ((java.nio.charset.Charset)v1).encode(((java.lang.String)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v4).charValue()));
    Object v6 = org.apache.commons.csv.CSVParser.parse(((java.io.InputStream)v0),((java.nio.charset.Charset)v1),((org.apache.commons.csv.CSVFormat)v5));
    Object v7 = ((org.apache.commons.csv.CSVParser)v6).nextRecord();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "The escape character cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getRecords();
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = " [";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = ((org.apache.commons.csv.CSVFormat)v2).print(((java.io.File)v4),((java.nio.charset.Charset)v5));
    Object v7 = org.apache.commons.csv.CSVParser.parse(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v7).close();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "format";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "\r\n";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = false;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreHeaderCase((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).getHeaderMap();
    Object v7 = ((org.apache.commons.csv.CSVParser)v5).getHeaderMap();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = ((java.io.Reader)v0).read();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = false;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withAllowMissingColumnNames((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = org.apache.commons.csv.CSVParser.parse(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v3));
    ((org.apache.commons.csv.CSVParser)v6).close();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "NullString=<";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v4 = null;
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).getRecords();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
    org.junit.Assert.assertNull(v4);
  }
}
