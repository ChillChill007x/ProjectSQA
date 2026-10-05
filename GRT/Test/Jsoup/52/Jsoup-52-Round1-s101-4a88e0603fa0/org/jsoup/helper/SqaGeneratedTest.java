package org.jsoup.helper;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "t";
    Object v1 = "noframes";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).getAbsolutePath();
    Object v4 = org.jsoup.helper.DataUtil.readFileToByteBuffer(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "t";
    Object v1 = "noframes";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = true;
    Object v4 = ((java.io.File)v2).setWritable((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.helper.DataUtil.readFileToByteBuffer(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "tfoo";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
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
  public void test4() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "body";
    Object v2 = "script";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "t";
    Object v1 = "noframes";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.jsoup.helper.DataUtil.readFileToByteBuffer(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0));
    Object v2 = "tfoot";
    Object v3 = "caYption";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    Object v5 = "2";
    Object v6 = "tbody";
    Object v7 = ((org.jsoup.parser.Parser)v4).parseInput(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v1),((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "publicId";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.jsoup.helper.DataUtil.emptyByteBuffer();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "fo6m";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0));
    Object v2 = "tmoot";
    Object v3 = "tgr";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    Object v5 = "!";
    Object v6 = "taile";
    Object v7 = ((org.jsoup.parser.Parser)v4).parseInput(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v1),((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = -26;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = java.io.OutputStream.nullOutputStream();
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "t";
    Object v1 = "noframes";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "tab+e";
    Object v4 = "a";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "t";
    Object v1 = "noframes";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t";
    Object v4 = "noframes";
    Object v5 = new java.io.File(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.io.File)v2).renameTo(((java.io.File)v5));
    Object v7 = org.jsoup.helper.DataUtil.readFileToByteBuffer(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -29;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "thead";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "h6";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 0;
    ((java.io.OutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v2));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "t";
    Object v1 = "noframes";
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
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)5)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = "q";
    Object v4 = "|tml";
    Object v5 = org.jsoup.parser.Parser.xmlParser();
    Object v6 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = org.jsoup.helper.DataUtil.emptyByteBuffer();
    Object v1 = "<";
    Object v2 = "bv";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
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
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 1;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.nio.ByteBuffer)v2).array();
    Object v4 = "d";
    Object v5 = "h";
    Object v6 = org.jsoup.parser.Parser.xmlParser();
    Object v7 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v2),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "U ";
    Object v2 = "tr";
    Object v3 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "p";
    Object v4 = "bgs8und";
    Object v5 = org.jsoup.parser.Parser.xmlParser();
    Object v6 = "title";
    Object v7 = "n";
    Object v8 = ((org.jsoup.parser.Parser)v5).parseInput(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v2),((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -37;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = 34;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = 11;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v2).intValue()));
    Object v4 = "tite";
    Object v5 = "devic";
    Object v6 = org.jsoup.parser.Parser.xmlParser();
    Object v7 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v3),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new byte[]{Byte.valueOf((byte)-50),Byte.valueOf((byte)0),Byte.valueOf((byte)13)};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = ")";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
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
  public void test38() throws Throwable {
    Object v0 = "tr";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
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
  public void test41() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "UTF-";
    Object v4 = "\"i";
    Object v5 = org.jsoup.parser.Parser.xmlParser();
    Object v6 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v2),((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -23;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "! ";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
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
  public void test45() throws Throwable {
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
  public void test46() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0));
    Object v2 = "thtml";
    Object v3 = "hr";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    Object v5 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v1),((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "table";
    Object v2 = "cl";
    Object v3 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
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
  public void test49() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 17;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "textarea";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)69),Byte.valueOf((byte)1)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.io.OutputStream.nullOutputStream();
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = org.jsoup.helper.DataUtil.emptyByteBuffer();
    Object v1 = "n";
    Object v2 = "U";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "t";
    Object v1 = "noframes";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "html";
    Object v4 = "colgroup";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = 11;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v2).intValue()));
    Object v4 = "lnk";
    Object v5 = "selectI";
    Object v6 = org.jsoup.parser.Parser.xmlParser();
    Object v7 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v3),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = 0;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
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
  public void test57() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "link";
    Object v2 = "caption";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "thead";
    Object v4 = "^=";
    Object v5 = org.jsoup.parser.Parser.xmlParser();
    Object v6 = 13;
    Object v7 = ((org.jsoup.parser.Parser)v5).setTrackErrors((((java.lang.Integer)v6).intValue()));
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v2),((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = 1;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.nio.ByteBuffer)v2).clear();
    Object v4 = "br";
    Object v5 = "br";
    Object v6 = org.jsoup.parser.Parser.xmlParser();
    Object v7 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v2),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = java.io.OutputStream.nullOutputStream();
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "lV";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = "html";
    Object v3 = "bgsound";
    Object v4 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "th";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "co";
    Object v2 = "tbody";
    Object v3 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = 1;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
    Object v5 = "htm";
    Object v6 = "</";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v4),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "t";
    Object v1 = "noframes";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "body";
    Object v4 = "h6";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)-2)};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = 31;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 10;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = 71;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "table";
    Object v4 = "col";
    Object v5 = org.jsoup.parser.Parser.xmlParser();
    Object v6 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v2),((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "t";
    Object v1 = "noframes";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = true;
    Object v4 = ((java.io.File)v2).setExecutable((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.helper.DataUtil.readFileToByteBuffer(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "summary";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = 11;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.nio.Buffer)v3).isReadOnly();
    Object v5 = "";
    Object v6 = "hea";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = 65512;
    Object v9 = ((org.jsoup.parser.Parser)v7).setTrackErrors((((java.lang.Integer)v8).intValue()));
    Object v10 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v3),((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = 11;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Mozilla/5.0 (jsoup)";
    Object v5 = "";
    Object v6 = org.jsoup.parser.Parser.xmlParser();
    Object v7 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v3),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "^=";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -20;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = 0;
    Object v4 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -39;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "t";
    Object v1 = "noframes";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    ((java.io.File)v2).deleteOnExit();
    Object v3 = null;
    Object v4 = org.jsoup.helper.DataUtil.readFileToByteBuffer(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = 11;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v2).intValue()));
    Object v4 = "caption";
    Object v5 = ">";
    Object v6 = org.jsoup.parser.Parser.xmlParser();
    Object v7 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v3),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -65;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 10;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "sc4ipt";
    Object v4 = "tyle";
    Object v5 = org.jsoup.parser.Parser.xmlParser();
    Object v6 = -9;
    Object v7 = ((org.jsoup.parser.Parser)v5).setTrackErrors((((java.lang.Integer)v6).intValue()));
    Object v8 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v2),((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "caption";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new byte[]{Byte.valueOf((byte)-85),Byte.valueOf((byte)56),Byte.valueOf((byte)16)};
    ((java.io.OutputStream)v1).write(((byte[])v2));
    Object v3 = null;
    org.jsoup.helper.DataUtil.crossStreams(((java.io.InputStream)v0),((java.io.OutputStream)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 11;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 16;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "t";
    Object v1 = "noframes";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "colgroup";
    Object v4 = ":no";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -77;
    Object v2 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "Request mEust not be null";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "t";
    Object v1 = "noframes";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "wbr";
    Object v4 = ":";
    Object v5 = org.jsoup.helper.DataUtil.load(((java.io.File)v2),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "titl_e";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = 11;
    Object v3 = org.jsoup.helper.DataUtil.readToByteBuffer(((java.io.InputStream)v0),(((java.lang.Integer)v2).intValue()));
    Object v4 = "cite";
    Object v5 = "";
    Object v6 = org.jsoup.parser.Parser.xmlParser();
    Object v7 = 0;
    Object v8 = ((org.jsoup.parser.Parser)v6).setTrackErrors((((java.lang.Integer)v7).intValue()));
    Object v9 = org.jsoup.helper.DataUtil.parseByteData(((java.nio.ByteBuffer)v3),((java.lang.String)v4),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "col";
    Object v1 = org.jsoup.helper.DataUtil.getCharsetFromContentType(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "        ";
    Object v2 = "listing";
    Object v3 = org.jsoup.helper.DataUtil.load(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }
}
