package org.jsoup.helper;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = 9;
    Object v1 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v0).intValue()));
    Object v2 = 9;
    Object v3 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.nio.ByteBuffer)v1).compareTo(((java.nio.ByteBuffer)v3));
    Object v5 = "br";
    Object v6 = "htm";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v1),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "bod}";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "bgsound";
    Object v5 = "";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v3),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "2col";
    Object v4 = "html";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "daleth";
    Object v4 = "base";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "ttitle";
    Object v4 = "Nbtilde";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).getParent();
    Object v4 = "table";
    Object v5 = "td";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "p";
    Object v4 = "img";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "s";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "bod";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "y ";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v5 = "tbodKy";
    Object v6 = "tr";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = "/";
    Object v9 = "boxUl";
    Object v10 = ((org.jsoup.parser.Parser)v7).parseInput(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "a(";
    Object v4 = "font";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "imagpart";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "charset";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v5 = "th";
    Object v6 = "o";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = "table";
    Object v9 = "Sacut";
    Object v10 = ((org.jsoup.parser.Parser)v7).parseInput(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "C";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.InputStream)v3).read();
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h5";
    Object v4 = "em";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "taZle";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v5 = "<";
    Object v6 = "bodWy";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v5 = "div";
    Object v6 = "ul";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = 9;
    Object v1 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v0).intValue()));
    Object v2 = "caption";
    Object v3 = "p";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    Object v5 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v1),((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 9;
    Object v1 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v0).intValue()));
    Object v2 = "comp";
    Object v3 = "command";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    Object v5 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v1),((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "Congruent";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "i";
    Object v5 = "table";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v3),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "comlement";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "?";
    Object v5 = "rdca";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v3),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "d";
    Object v5 = "ns\\p";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v3),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "htmv";
    Object v5 = "";
    Object v6 = org.jsoup.parser.Parser.xmlParser();
    Object v7 = 0;
    Object v8 = ((org.jsoup.parser.Parser)v6).setTrackErrors((((java.lang.Integer)v7).intValue()));
    Object v9 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v3),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = ((java.io.File)v2).setExecutable((((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "laquo";
    Object v7 = "+font";
    Object v8 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v6),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v5 = ((java.nio.ByteBuffer)v4).asReadOnlyBuffer();
    Object v6 = "ldrushar";
    Object v7 = "tFhead";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((java.io.InputStream)v3).reset();
    Object v4 = null;
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "shortparalle.l";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).isFile();
    Object v4 = "td";
    Object v5 = "style";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v7 = ((java.nio.Buffer)v6).isReadOnly();
    Object v8 = "-";
    Object v9 = "tfoot";
    Object v10 = org.jsoup.parser.Parser.xmlParser();
    Object v11 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v6),((java.lang.String)v8),((java.lang.String)v9),((org.jsoup.parser.Parser)v10));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((java.io.InputStream)v3).reset();
    Object v4 = null;
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v6 = "t";
    Object v7 = " ";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = 2;
    Object v10 = ((org.jsoup.parser.Parser)v8).setTrackErrors((((java.lang.Integer)v9).intValue()));
    Object v11 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v5),((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((java.io.InputStream)v3).reset();
    Object v4 = null;
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v6 = "html1";
    Object v7 = "<";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = -11;
    Object v10 = ((org.jsoup.parser.Parser)v8).setTrackErrors((((java.lang.Integer)v9).intValue()));
    Object v11 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v5),((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v7 = ((java.nio.ByteBuffer)v6).asLongBuffer();
    Object v8 = "rAtail";
    Object v9 = "html";
    Object v10 = org.jsoup.parser.Parser.xmlParser();
    Object v11 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v6),((java.lang.String)v8),((java.lang.String)v9),((org.jsoup.parser.Parser)v10));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((java.io.InputStream)v3).reset();
    Object v4 = null;
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v6 = "thead";
    Object v7 = " ";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v5),((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v7 = "KHcy";
    Object v8 = "\"3";
    Object v9 = org.jsoup.parser.Parser.xmlParser();
    Object v10 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v6),((java.lang.String)v7),((java.lang.String)v8),((org.jsoup.parser.Parser)v9));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "z~opf";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v5 = "excl";
    Object v6 = "optio";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "htm";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "style";
    Object v4 = "tfoot";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "svwarhk";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((java.io.InputStream)v3).reset();
    Object v4 = null;
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v6 = "rdquor";
    Object v7 = "setion";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v5),((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).isDirectory();
    Object v4 = "script";
    Object v5 = "title";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = ((java.io.File)v2).listFiles(((java.io.FileFilter)v3));
    Object v5 = "RCDATAEndTagName";
    Object v6 = "html9";
    Object v7 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "lsimg";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v7 = "hr";
    Object v8 = "(applet";
    Object v9 = org.jsoup.parser.Parser.xmlParser();
    Object v10 = "caption";
    Object v11 = "html";
    Object v12 = ((org.jsoup.parser.Parser)v9).parseInput(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v6),((java.lang.String)v7),((java.lang.String)v8),((org.jsoup.parser.Parser)v9));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h2";
    Object v4 = "htm";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "menF";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "d";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v7 = "pn";
    Object v8 = "U";
    Object v9 = org.jsoup.parser.Parser.xmlParser();
    Object v10 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v6),((java.lang.String)v7),((java.lang.String)v8),((org.jsoup.parser.Parser)v9));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "ptml";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "title";
    Object v4 = "caption";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = ">";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "frac38";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "body";
    Object v5 = "ltquest";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v3),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "ta;ble";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).isHidden();
    Object v4 = "td";
    Object v5 = "aXrticle";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "tfoo:t";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "figure";
    Object v4 = "select";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "declTration";
    Object v4 = "t";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "tbody";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "bodyY";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((java.io.InputStream)v3).reset();
    Object v4 = null;
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v6 = "RLessFullEqual";
    Object v7 = "ClockwiseCo{ntourIntegral";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = -15;
    Object v10 = ((org.jsoup.parser.Parser)v8).setTrackErrors((((java.lang.Integer)v9).intValue()));
    Object v11 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v5),((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v5 = "basefont";
    Object v6 = "theaZd";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "tablge";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v5 = "Doctype";
    Object v6 = "`tml";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "Greater0SlantEqual";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "#%sp";
    Object v4 = "l";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "applet";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((java.io.InputStream)v3).reset();
    Object v4 = null;
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v6 = "htm";
    Object v7 = "sop";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v5),((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "table";
    Object v4 = "embed";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v5 = "captio";
    Object v6 = "</*";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "keygern";
    Object v4 = "tr";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "be";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v7 = "TRightTriangleEqual";
    Object v8 = "vartriangleleft";
    Object v9 = org.jsoup.parser.Parser.xmlParser();
    Object v10 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v6),((java.lang.String)v7),((java.lang.String)v8),((org.jsoup.parser.Parser)v9));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((java.io.InputStream)v3).reset();
    Object v4 = null;
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v6 = "trNck";
    Object v7 = "n";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v5),((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "dd";
    Object v4 = "nwArr";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v7 = "colgroup";
    Object v8 = "<#";
    Object v9 = org.jsoup.parser.Parser.xmlParser();
    Object v10 = "noscript";
    Object v11 = "NotSupersetEqual";
    Object v12 = ((org.jsoup.parser.Parser)v9).parseInput(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v6),((java.lang.String)v7),((java.lang.String)v8),((org.jsoup.parser.Parser)v9));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "middot";
    Object v4 = "hml";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "thgad";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "textarea";
    Object v4 = "<";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "sercy";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v7 = "head";
    Object v8 = "di)";
    Object v9 = org.jsoup.parser.Parser.xmlParser();
    Object v10 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v6),((java.lang.String)v7),((java.lang.String)v8),((org.jsoup.parser.Parser)v9));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v5 = "</";
    Object v6 = "tp";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "multimap";
    Object v4 = "html";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h1";
    Object v4 = "ccupssm";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "toot";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v5 = "";
    Object v6 = "t";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "uacute";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "td\\";
    Object v1 = "hgroup";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h:";
    Object v4 = " ";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v5 = "d";
    Object v6 = "A";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }
}
