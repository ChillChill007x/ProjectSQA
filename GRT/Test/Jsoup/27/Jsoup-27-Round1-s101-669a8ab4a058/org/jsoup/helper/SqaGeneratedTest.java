package org.jsoup.helper;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = 18;
    Object v1 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v0).intValue()));
    Object v2 = 18;
    Object v3 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.nio.ByteBuffer)v1).compareTo(((java.nio.ByteBuffer)v3));
    Object v5 = "li";
    Object v6 = "htm";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v1),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "htm}";
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
    Object v4 = "";
    Object v5 = "";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v3),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "form2";
    Object v4 = "Data map must not be null";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "text";
    Object v4 = "tbody";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "httml";
    Object v4 = "bodyb";
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
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).getParent();
    Object v4 = "thead";
    Object v5 = "tfoot";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "br";
    Object v4 = "a";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "htm";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "UTF-8";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "yh5";
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
    Object v5 = "tKr";
    Object v6 = "colgroup";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = "hed";
    Object v9 = "</";
    Object v10 = ((org.jsoup.parser.Parser)v7).parseInput(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h(2";
    Object v4 = "hidden";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "scr";
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
    Object v5 = "bgsound";
    Object v6 = "co";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = "thead";
    Object v9 = "alue";
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
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h1";
    Object v4 = "type";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "tZ";
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
    Object v5 = "had";
    Object v6 = "htmWl";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.InputStream)v3).read();
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v6 = "noframes";
    Object v7 = "col";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v5),((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = 18;
    Object v1 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v0).intValue()));
    Object v2 = "ol";
    Object v3 = "br";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    Object v5 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v1),((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = 18;
    Object v1 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v0).intValue()));
    Object v2 = "base";
    Object v3 = "input";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    Object v5 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v1),((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
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
  public void test28() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "scri";
    Object v5 = "thead";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v3),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "bas";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "?";
    Object v5 = "table";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v3),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "lnk";
    Object v5 = "t\\";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v3),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Referrer mustvnot be null";
    Object v5 = "tbody";
    Object v6 = org.jsoup.parser.Parser.xmlParser();
    Object v7 = 0;
    Object v8 = ((org.jsoup.parser.Parser)v6).setTrackErrors((((java.lang.Integer)v7).intValue()));
    Object v9 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v3),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = ((java.io.File)v2).setExecutable((((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "body";
    Object v7 = "sourc+e";
    Object v8 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v6),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v5 = ((java.nio.ByteBuffer)v4).asReadOnlyBuffer();
    Object v6 = "noscript";
    Object v7 = "cFolgroup";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
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
  public void test36() throws Throwable {
    Object v0 = "ta.ble";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).isFile();
    Object v4 = "thead";
    Object v5 = "tfoot";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
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
    Object v9 = "select";
    Object v10 = org.jsoup.parser.Parser.xmlParser();
    Object v11 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v6),((java.lang.String)v8),((java.lang.String)v9),((org.jsoup.parser.Parser)v10));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((java.io.InputStream)v3).reset();
    Object v4 = null;
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v6 = "r";
    Object v7 = "h4";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = 2;
    Object v10 = ((org.jsoup.parser.Parser)v8).setTrackErrors((((java.lang.Integer)v9).intValue()));
    Object v11 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v5),((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
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
    Object v6 = "html1";
    Object v7 = "head";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = -11;
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
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v7 = ((java.nio.ByteBuffer)v6).asLongBuffer();
    Object v8 = "table";
    Object v9 = "text/";
    Object v10 = org.jsoup.parser.Parser.xmlParser();
    Object v11 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v6),((java.lang.String)v8),((java.lang.String)v9),((org.jsoup.parser.Parser)v10));
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
    ((java.io.InputStream)v3).reset();
    Object v4 = null;
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v6 = "colgroup";
    Object v7 = "h5";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v5),((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
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
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v7 = "title";
    Object v8 = "\"";
    Object v9 = org.jsoup.parser.Parser.xmlParser();
    Object v10 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v6),((java.lang.String)v7),((java.lang.String)v8),((org.jsoup.parser.Parser)v9));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "tbody~";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.InputStream)v3).read();
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v6 = "style";
    Object v7 = "";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v5),((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "mg";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "tbody";
    Object v4 = "caption";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "tabvle";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((java.io.InputStream)v3).reset();
    Object v4 = null;
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v6 = "table";
    Object v7 = "fnt";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v5),((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).isDirectory();
    Object v4 = "tfoot";
    Object v5 = "html";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = ((java.io.File)v2).listFiles(((java.io.FileFilter)v3));
    Object v5 = "DoctypeName";
    Object v6 = "html9";
    Object v7 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "td";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v7 = "pre";
    Object v8 = "(dt";
    Object v9 = org.jsoup.parser.Parser.xmlParser();
    Object v10 = "ul";
    Object v11 = "gzip";
    Object v12 = ((org.jsoup.parser.Parser)v9).parseInput(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v6),((java.lang.String)v7),((java.lang.String)v8),((org.jsoup.parser.Parser)v9));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "p";
    Object v4 = "htm";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "F";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v7 = "nbr";
    Object v8 = "U";
    Object v9 = org.jsoup.parser.Parser.xmlParser();
    Object v10 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v6),((java.lang.String)v7),((java.lang.String)v8),((org.jsoup.parser.Parser)v9));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "ptml";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "html";
    Object v4 = "ol";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "style";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "html";
    Object v5 = "td";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v3),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "th;ead";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).isHidden();
    Object v4 = "tfoot";
    Object v5 = "dXl";
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "ca:ption";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "menu";
    Object v4 = "th";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "tbodT";
    Object v4 = "t";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "tr";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "htmlY";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((java.io.InputStream)v3).reset();
    Object v4 = null;
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v6 = "tiRtle";
    Object v7 = "b{ody";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = -15;
    Object v10 = ((org.jsoup.parser.Parser)v8).setTrackErrors((((java.lang.Integer)v9).intValue()));
    Object v11 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v5),((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.InputStream)v3).read();
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v6 = "embed";
    Object v7 = "colgrouZp";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v5),((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "theagd";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v5 = "ScriptDataEscapeStart";
    Object v6 = "`tml";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "0body";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "[p";
    Object v4 = "lead";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "dt";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((java.io.InputStream)v3).reset();
    Object v4 = null;
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v6 = "htm";
    Object v7 = "tabl";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v5),((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "tr";
    Object v4 = "link";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.InputStream)v3).read();
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v6 = "";
    Object v7 = "head*";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v5),((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "stronrg";
    Object v4 = "applet";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "be";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v7 = "textTarea";
    Object v8 = "tbody";
    Object v9 = org.jsoup.parser.Parser.xmlParser();
    Object v10 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v6),((java.lang.String)v7),((java.lang.String)v8),((org.jsoup.parser.Parser)v9));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((java.io.InputStream)v3).reset();
    Object v4 = null;
    Object v5 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v6 = "N";
    Object v7 = "t";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v5),((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "noframes";
    Object v4 = "td";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v7 = "dd";
    Object v8 = "hea#";
    Object v9 = org.jsoup.parser.Parser.xmlParser();
    Object v10 = "tfoot";
    Object v11 = "#document";
    Object v12 = ((org.jsoup.parser.Parser)v9).parseInput(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v6),((java.lang.String)v7),((java.lang.String)v8),((org.jsoup.parser.Parser)v9));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "body";
    Object v4 = "hml";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "colgroug";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "html";
    Object v4 = "hea";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = "cript";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v7 = "html";
    Object v8 = "n)frames";
    Object v9 = org.jsoup.parser.Parser.xmlParser();
    Object v10 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v6),((java.lang.String)v7),((java.lang.String)v8),((org.jsoup.parser.Parser)v9));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v5 = "head";
    Object v6 = "basefpnt";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "td";
    Object v4 = "html";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "p";
    Object v4 = "entities-full.properties";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "aption";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v5 = "ht";
    Object v6 = "t";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ":";
    Object v4 = "h5";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v5 = "detais";
    Object v6 = "stron";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v3));
    Object v5 = "<";
    Object v6 = "p";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 7;
    Object v2 = -24;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ":ImmediateParent%s";
    Object v5 = " ";
    Object v6 = org.jsoup.parser.Parser.xmlParser();
    Object v7 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v3),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "tf\\oot";
    Object v1 = "pre";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "height";
    Object v4 = "base";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }
}
