package org.jsoup.helper;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "select";
    Object v1 = "figure";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).getTotalSpace();
    Object v4 = org.jsoup.helper.DataUtil.readFileToByteBuffer(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "noscript";
    Object v2 = "td";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "Ch";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "#koot";
    Object v2 = "tr";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "select";
    Object v1 = "figure";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "html";
    Object v4 = "option";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = 0;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "select";
    Object v1 = "figure";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.jsoup.helper.DataUtil.readFileToByteBuffer(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "ht";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "p";
    Object v2 = "html";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)1)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = -35;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "\"";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "br";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "\"";
    Object v2 = "math";
    Object v3 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Object v4 = "n";
    Object v5 = org.jsoup.parser.Parser.htmlParser();
    Object v6 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "tbody";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.jsoup.helper.DataUtil.emptyByteBuffer();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -11L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = "im";
    Object v4 = "Text";
    Object v5 = org.jsoup.parser.Parser.htmlParser();
    Object v6 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-29)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = "body";
    Object v4 = "noframes";
    Object v5 = org.jsoup.parser.Parser.htmlParser();
    Object v6 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "select";
    Object v1 = "figure";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).getCanonicalPath();
    Object v4 = org.jsoup.helper.DataUtil.readFileToByteBuffer(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-21)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = "q";
    Object v4 = "Data k|y value pairs must not be null";
    Object v5 = org.jsoup.parser.Parser.htmlParser();
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "ody";
    Object v2 = "hv";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = 11;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = -1;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 1;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "select";
    Object v1 = "figure";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).length();
    Object v4 = org.jsoup.helper.DataUtil.readFileToByteBuffer(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "table";
    Object v2 = "tr";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "table";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "select";
    Object v1 = "figure";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "head";
    Object v4 = "stront";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "tfHoot";
    Object v2 = "tbody";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "";
    Object v2 = "noframes";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "textar}ea";
    Object v2 = "[able";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = 1;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "select";
    Object v1 = "figure";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "aliSgn";
    Object v4 = "head";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new byte[]{Byte.valueOf((byte)-38),Byte.valueOf((byte)0),Byte.valueOf((byte)13)};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = ")";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new byte[]{Byte.valueOf((byte)1)};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "li";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)9)};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "UTF-";
    Object v2 = "\"";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -23;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "tr!";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new byte[]{Byte.valueOf((byte)61),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = 32;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "thtml";
    Object v2 = "h6";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "noscript";
    Object v2 = "blckquote";
    Object v3 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "thead";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new byte[]{};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 17;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)69),Byte.valueOf((byte)1)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.io.OutputStream.nullOutputStream();
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "n";
    Object v2 = "U";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "lass";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "lnk";
    Object v2 = "teIxtarea";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = 0;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 74;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = -40;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "input";
    Object v2 = "th";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "tfoot";
    Object v2 = "^=";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = "formD";
    Object v5 = "caption";
    Object v6 = ((org.jsoup.parser.Parser)v3).parseInput(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "select";
    Object v1 = "figure";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).mkdir();
    Object v4 = org.jsoup.helper.DataUtil.readFileToByteBuffer(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "tZd";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "7";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "pa";
    Object v2 = "#";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "htmZl";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "V";
    Object v2 = "address";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = "href";
    Object v5 = "href";
    Object v6 = new org.jsoup.nodes.Element(((java.lang.String)v5));
    Object v7 = "tfoot";
    Object v8 = ((org.jsoup.parser.Parser)v3).parseFragmentInput(((java.lang.String)v4),((org.jsoup.nodes.Element)v6),((java.lang.String)v7));
    Object v9 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = " ";
    Object v2 = "th+";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "actio";
    Object v2 = "bdN";
    Object v3 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "font";
    Object v2 = "uth";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "dd";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ":matchesOwn(%s)";
    Object v2 = "body";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = "body";
    Object v5 = new java.io.StringReader(((java.lang.String)v4));
    Object v6 = "<";
    Object v7 = ((org.jsoup.parser.Parser)v3).parseInput(((java.io.Reader)v5),((java.lang.String)v6));
    Object v8 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 4;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -35;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "area";
    Object v2 = "meta";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "col";
    Object v2 = "";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "select";
    Object v1 = "figure";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = true;
    Object v4 = ((java.io.File)v2).setExecutable((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.helper.DataUtil.readFileToByteBuffer(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "section";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = "html";
    Object v4 = "h2";
    Object v5 = org.jsoup.parser.Parser.htmlParser();
    Object v6 = "body";
    Object v7 = new java.io.StringReader(((java.lang.String)v6));
    Object v8 = "dl";
    Object v9 = ((org.jsoup.parser.Parser)v5).parseInput(((java.io.Reader)v7),((java.lang.String)v8));
    Object v10 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "select";
    Object v1 = "figure";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).canRead();
    Object v4 = org.jsoup.helper.DataUtil.readFileToByteBuffer(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = ":nth-lst-child(";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = java.io.OutputStream.nullOutputStream();
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "";
    Object v2 = "";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "!=";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -1;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "=";
    Object v2 = "";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)2)};
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = 11;
    ((java.io.OutputStream)v5).write((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 53;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)-51),Byte.valueOf((byte)17),Byte.valueOf((byte)2)};
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "t8";
    Object v6 = "p";
    Object v7 = org.jsoup.parser.Parser.htmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "title";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "select";
    Object v1 = "figure";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "tbody9";
    Object v4 = "html";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -8;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "select";
    Object v1 = "figure";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "rame";
    Object v4 = "tbody#";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "colgro";
    Object v2 = "bsasefont";
    Object v3 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "a";
    Object v2 = "[%s*=%s]>";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "select";
    Object v1 = "figure";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).mkdirs();
    Object v4 = org.jsoup.helper.DataUtil.readFileToByteBuffer(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }
}
