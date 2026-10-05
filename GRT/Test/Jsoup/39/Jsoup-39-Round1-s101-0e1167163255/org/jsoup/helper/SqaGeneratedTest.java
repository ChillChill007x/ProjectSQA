package org.jsoup.helper;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-17),Byte.valueOf((byte)28)};
    Object v1 = java.nio.ByteBuffer.wrap(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-17),Byte.valueOf((byte)28)};
    Object v3 = java.nio.ByteBuffer.wrap(((byte[])v2));
    Object v4 = ((java.nio.ByteBuffer)v1).mismatch(((java.nio.ByteBuffer)v3));
    Object v5 = " )";
    Object v6 = "9tml";
    Object v7 = org.jsoup.parser.Parser.htmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v1),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = 1;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "img";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "figcaptixon";
    Object v4 = "t4";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-17),Byte.valueOf((byte)28)};
    Object v1 = java.nio.ByteBuffer.wrap(((byte[])v0));
    Object v2 = "br";
    Object v3 = "textarea";
    Object v4 = org.jsoup.parser.Parser.htmlParser();
    Object v5 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v1),((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "ta";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "col";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "th";
    Object v4 = "caption";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "href";
    Object v4 = " ";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 4;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 7;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = -6;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "tbidy";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    ((java.io.InputStream)v1).reset();
    Object v2 = null;
    Object v3 = -30;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).getName();
    Object v4 = "";
    Object v5 = "htatps";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "titZle";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "thea";
    Object v4 = "u^";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "Gody";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-17),Byte.valueOf((byte)28)};
    Object v1 = java.nio.ByteBuffer.wrap(((byte[])v0));
    Object v2 = "tr";
    Object v3 = "thea";
    Object v4 = org.jsoup.parser.Parser.htmlParser();
    Object v5 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v1),((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = "tfoot";
    Object v3 = "captio";
    Object v4 = org.jsoup.parser.Parser.htmlParser();
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v1),((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-17),Byte.valueOf((byte)28)};
    Object v1 = java.nio.ByteBuffer.wrap(((byte[])v0));
    Object v2 = ((java.nio.ByteBuffer)v1).mark();
    Object v3 = "d";
    Object v4 = "button";
    Object v5 = org.jsoup.parser.Parser.htmlParser();
    Object v6 = 1;
    Object v7 = ((org.jsoup.parser.Parser)v5).setTrackErrors((((java.lang.Integer)v6).intValue()));
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v1),((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = 1;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v3).intValue()));
    Object v5 = "colgro=up";
    Object v6 = "strong";
    Object v7 = org.jsoup.parser.Parser.htmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "p";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "b`dy";
    Object v4 = "Could not determine a form action URL for submit. Ensure you set a base URI ";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "colgroup";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = "html";
    Object v3 = "?";
    Object v4 = org.jsoup.parser.Parser.htmlParser();
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v1),((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "em";
    Object v4 = "html";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "tml";
    Object v4 = "";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 1;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "td";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = 16;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 0;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "blockquote";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = "body";
    Object v3 = "</";
    Object v4 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "noframe";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "i";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    Object v4 = 1;
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 37;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    Object v4 = -25;
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = -27;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "li'k";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-17),Byte.valueOf((byte)28)};
    Object v1 = java.nio.ByteBuffer.wrap(((byte[])v0));
    Object v2 = "t";
    Object v3 = "cFolgroup";
    Object v4 = org.jsoup.parser.Parser.htmlParser();
    Object v5 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v1),((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    ((java.io.InputStream)v1).reset();
    Object v2 = null;
    Object v3 = -42;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "head(";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = true;
    Object v4 = ((java.io.File)v2).setExecutable((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "textare?";
    Object v6 = "b";
    Object v7 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 0;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "t9d";
    Object v5 = "n";
    Object v6 = org.jsoup.parser.Parser.htmlParser();
    Object v7 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v3),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 1;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "hr";
    Object v5 = "plaintext";
    Object v6 = org.jsoup.parser.Parser.htmlParser();
    Object v7 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v3),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-17),Byte.valueOf((byte)28)};
    Object v1 = java.nio.ByteBuffer.wrap(((byte[])v0));
    Object v2 = "th";
    Object v3 = "bod";
    Object v4 = org.jsoup.parser.Parser.htmlParser();
    Object v5 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v1),((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "selet";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "th";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "Lol";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = ((java.io.File)v2).equals(((java.lang.Object)v3));
    Object v5 = "div";
    Object v6 = "-r";
    Object v7 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).delete();
    Object v4 = "p";
    Object v5 = "htl";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 11;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    Object v4 = "n";
    Object v5 = "lipk";
    Object v6 = org.jsoup.parser.Parser.htmlParser();
    Object v7 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v1),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = "table~";
    Object v3 = "h";
    Object v4 = org.jsoup.parser.Parser.htmlParser();
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v1),((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = ">";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "ol";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "cOommand";
    Object v4 = "body";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 4;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "htm";
    Object v5 = "thead";
    Object v6 = org.jsoup.parser.Parser.htmlParser();
    Object v7 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v3),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "s";
    Object v4 = "p";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "co%";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "b}ody";
    Object v4 = "t:";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = -7;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = -79;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-17),Byte.valueOf((byte)28)};
    Object v1 = java.nio.ByteBuffer.wrap(((byte[])v0));
    Object v2 = ((java.nio.ByteBuffer)v1).asCharBuffer();
    Object v3 = " ";
    Object v4 = "sele+t";
    Object v5 = org.jsoup.parser.Parser.htmlParser();
    Object v6 = 17;
    Object v7 = ((org.jsoup.parser.Parser)v5).setTrackErrors((((java.lang.Integer)v6).intValue()));
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v1),((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = 1;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v3).intValue()));
    Object v5 = "";
    Object v6 = "listi";
    Object v7 = org.jsoup.parser.Parser.htmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "table";
    Object v4 = "td";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "Referer";
    Object v4 = "d";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v3 = ((java.io.InputStream)v1).read(((byte[])v2));
    Object v4 = "tdI";
    Object v5 = "th;ead";
    Object v6 = org.jsoup.parser.Parser.htmlParser();
    Object v7 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v1),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 11;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "t";
    Object v5 = "h2";
    Object v6 = org.jsoup.parser.Parser.htmlParser();
    Object v7 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v3),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = -25;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 11;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.nio.ByteBuffer)v3).getChar();
    Object v5 = "html";
    Object v6 = "tK";
    Object v7 = org.jsoup.parser.Parser.htmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v3),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h4";
    Object v4 = "dl";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "optgrou";
    Object v4 = "style";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "titlZ";
    Object v4 = "foBm";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "input";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = " ";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    Object v4 = -15;
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = 1;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v3).intValue()));
    Object v5 = "t(";
    Object v6 = "htNml";
    Object v7 = org.jsoup.parser.Parser.htmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).getUsableSpace();
    Object v4 = "li";
    Object v5 = "thead";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "</";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "--";
    Object v4 = "applet";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "e";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t";
    Object v4 = "html";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ">";
    Object v4 = "in";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "table^";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 11;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "selet";
    Object v5 = "html";
    Object v6 = org.jsoup.parser.Parser.htmlParser();
    Object v7 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v3),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    ((java.io.InputStream)v1).reset();
    Object v2 = null;
    Object v3 = 22;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 1;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "head";
    Object v5 = "head";
    Object v6 = org.jsoup.parser.Parser.htmlParser();
    Object v7 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v3),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 0;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "body";
    Object v5 = "html";
    Object v6 = org.jsoup.parser.Parser.htmlParser();
    Object v7 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v3),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    ((java.io.InputStream)v1).reset();
    Object v2 = null;
    Object v3 = 22;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v3).intValue()));
    Object v5 = "td";
    Object v6 = "head";
    Object v7 = org.jsoup.parser.Parser.htmlParser();
    Object v8 = "[CDATA[";
    Object v9 = "td";
    Object v10 = ((org.jsoup.parser.Parser)v7).parseInput(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = "pr";
    Object v3 = "h6";
    Object v4 = org.jsoup.parser.Parser.htmlParser();
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v1),((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 0;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "param";
    Object v5 = "ht";
    Object v6 = org.jsoup.parser.Parser.htmlParser();
    Object v7 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v3),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "Array must not containany null objects";
    Object v4 = "br";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "lol";
    Object v4 = "noframes";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "br";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "html";
    Object v4 = "td";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }
}
