package org.jsoup.helper;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "F";
    Object v2 = "xmp";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "rowspan";
    Object v2 = "body";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{};
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 12;
    Object v6 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.jsoup.helper.DataUtil.emptyByteBuffer();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "ismap";
    Object v2 = "col";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "th";
    Object v2 = "col";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "c}lgroup";
    Object v2 = "img";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = false;
    Object v5 = true;
    Object v6 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.parser.Parser)v3).settings(((org.jsoup.parser.ParseSettings)v6));
    Object v8 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 1;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)-5)};
    ((java.io.OutputStream)v2).write(((byte[])v3));
    Object v4 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v2));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new java.io.ByteArrayOutputStream();
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "\"";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 37;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "html";
    Object v2 = "html";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "t";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 76;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = 0;
    ((java.io.OutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v3));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-13),Byte.valueOf((byte)1)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new byte[]{Byte.valueOf((byte)-13),Byte.valueOf((byte)1)};
    ((java.io.OutputStream)v3).write(((byte[])v4));
    Object v5 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v3));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "th";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 5;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "td";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 15;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "[";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "html";
    Object v2 = "basefont";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "caption";
    Object v2 = "";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 27;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -2;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -67L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = "noframes/";
    Object v4 = "th";
    Object v5 = org.jsoup.parser.Parser.xmlParser();
    Object v6 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -54;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "th";
    Object v2 = "ScriptD";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = 1;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "strike";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = "";
    Object v3 = "d";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    Object v5 = 0;
    Object v6 = ((org.jsoup.parser.Parser)v4).setTrackErrors((((java.lang.Integer)v5).intValue()));
    Object v7 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = 18;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "fraeset";
    Object v2 = "'";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "img";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "as";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "tr";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = new java.io.File(((java.lang.String)v2));
    Object v4 = ((java.io.File)v1).compareTo(((java.io.File)v3));
    Object v5 = "body";
    Object v6 = "tr";
    Object v7 = org.jsoup.helper.DataUtil.load(((java.io.File)v1),((java.lang.String)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "pa+ram";
    Object v2 = "html";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "[^Za-zA-Z0-9_:.]";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = 7;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "sourc]";
    Object v2 = "tablu";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "[able";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -34;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = 1;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "br";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "head";
    Object v2 = "body";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "u";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 13;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = ")";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = new byte[]{Byte.valueOf((byte)1)};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "";
    Object v2 = "b`dy";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "\\sD";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -17;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "UTF-";
    Object v2 = "\"";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -9;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "td";
    Object v2 = "httpsw";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "";
    Object v2 = "tbody";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "thead";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "bvase";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "#";
    Object v2 = "bg";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = 12;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -30;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 19;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "tr";
    Object v2 = "tfoo";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = false;
    Object v5 = true;
    Object v6 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.parser.Parser)v3).settings(((org.jsoup.parser.ParseSettings)v6));
    Object v8 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "spaF";
    Object v2 = "#foot";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)-20)};
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "G";
    Object v6 = "head";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -28;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "dt";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 65;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "br";
    Object v2 = "sV";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "basefont";
    Object v2 = "name";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "";
    Object v2 = "Must supply a valid";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "td";
    Object v2 = "bI";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "colgrou";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = -14;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "bfgsound";
    Object v2 = "h1";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = new java.io.ByteArrayOutputStream();
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "bNr";
    Object v2 = "tfoot";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ":first-child";
    Object v2 = "br";
    Object v3 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "d";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "tr";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "ul";
    Object v3 = "h_ead";
    Object v4 = org.jsoup.helper.DataUtil.load(((java.io.File)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -8L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = -28;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "html";
    Object v2 = "^\\+";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)-48)};
    Object v3 = 0;
    Object v4 = 0;
    ((java.io.OutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "V";
    Object v2 = "";
    Object v3 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "tr";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = new java.io.File(((java.lang.String)v2));
    Object v4 = ((java.io.File)v1).renameTo(((java.io.File)v3));
    Object v5 = "body";
    Object v6 = "t";
    Object v7 = org.jsoup.helper.DataUtil.load(((java.io.File)v1),((java.lang.String)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "heac";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "Too many redirects occurred trying to load URL %s";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "up";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "htt{ps";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)-2)};
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "SYSTEM";
    Object v6 = "tr";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = false;
    Object v9 = true;
    Object v10 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.jsoup.parser.Parser)v7).settings(((org.jsoup.parser.ParseSettings)v10));
    Object v12 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "";
    Object v2 = "option";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseInputStream(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = 0;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "f";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "U";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }
}
