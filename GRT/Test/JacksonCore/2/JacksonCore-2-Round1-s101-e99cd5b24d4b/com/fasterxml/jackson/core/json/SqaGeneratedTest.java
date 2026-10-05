package com.fasterxml.jackson.core.json;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).getBooleanValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).getByteValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).getFeatureMask();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.core.base.ParserBase)v0).getDoubleValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new int[]{1,8,-63};
    Object v1 = 4;
    Object v2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(((int[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v0)._reportInvalidChar((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.core.base.ParserBase)v0).getDecimalValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).isExpectedStartArrayToken();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getValueAsString();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._skipString();
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getTextOffset();
    Object v17 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._getText2(((com.fasterxml.jackson.core.JsonToken)v17));
    org.junit.Assert.assertEquals((Object)("["), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = false;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsBoolean((((java.lang.Boolean)v18).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v1).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = java.io.OutputStream.nullOutputStream();
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).releaseBuffered(((java.io.OutputStream)v16));
    org.junit.Assert.assertEquals((Object)(0), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._decodeBase64(((com.fasterxml.jackson.core.Base64Variant)v16));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new int[]{32,0,-20};
    Object v17 = 1;
    Object v18 = -2;
    Object v19 = 0;
    Object v20 = -7;
    Object v21 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).parseEscapedName(((int[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).clearCurrentToken();
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getIntValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).nextValue();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ")";
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getValueAsString(((java.lang.String)v16));
    org.junit.Assert.assertEquals((Object)(")"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = java.io.OutputStream.nullOutputStream();
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).releaseBuffered(((java.io.OutputStream)v16));
    Object v18 = 29;
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._parseNumber((((java.lang.Integer)v18).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
    Object v17 = ((java.lang.Enum)v16).hashCode();
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._getText2(((com.fasterxml.jackson.core.JsonToken)v16));
    org.junit.Assert.assertEquals((Object)("{"), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._finishString();
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 32;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._handleOddName((((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getTokenColumnNr();
    org.junit.Assert.assertEquals((Object)(1), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).slowParseName();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getCurrentLocation();
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._decodeEscaped();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 1.0D;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsDouble((((java.lang.Double)v16).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getText();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v15).getShortValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).version();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = -3;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._decodeCharForError((((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getNumberType();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getNumberValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getDecimalValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._handleApos();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).getShortValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getDoubleValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 2;
    Object v17 = true;
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._handleInvalidNumberStart((((java.lang.Integer)v16).intValue()),(((java.lang.Boolean)v17).booleanValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v1).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new int[]{0,-28,2};
    Object v1 = -25;
    Object v2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(((int[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).canReadObjectId();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).clearCurrentToken();
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v18 = java.io.OutputStream.nullOutputStream();
    Object v19 = new byte[]{Byte.valueOf((byte)-11),Byte.valueOf((byte)56),Byte.valueOf((byte)16)};
    Object v20 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._readBinary(((com.fasterxml.jackson.core.Base64Variant)v17),((java.io.OutputStream)v18),((byte[])v19));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).nextToken();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 25L;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsLong((((java.lang.Long)v16).longValue()));
    org.junit.Assert.assertEquals((Object)(25L), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).loadMore();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "), [buf[";
    Object v17 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v17));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).getValueAsLong();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v17 = java.io.OutputStream.nullOutputStream();
    Object v18 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._readBinary(((com.fasterxml.jackson.core.Base64Variant)v16),((java.io.OutputStream)v17),((byte[])v18));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = false;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsBoolean((((java.lang.Boolean)v16).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._skipCR();
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).getObjectId();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new int[]{-28};
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(((int[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 45;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._parseFieldName((((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 0;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).nextIntValue((((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15)._getByteArrayBuilder();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 30;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._loadToHaveAtLeast((((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).getValueAsInt();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "6";
    ((com.fasterxml.jackson.core.base.ParserBase)v15).overrideCurrentName(((java.lang.String)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getCurrentLocation();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._parseAposName();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._closeInput();
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v15).getBooleanValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v17 = java.io.OutputStream.nullOutputStream();
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).readBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v16),((java.io.OutputStream)v17));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 227L;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsLong((((java.lang.Long)v16).longValue()));
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getValueAsString();
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new int[]{-4};
    Object v17 = 20;
    Object v18 = -19;
    Object v19 = 1;
    Object v20 = 7;
    Object v21 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).parseEscapedName(((int[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isClosed();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = java.io.Writer.nullWriter();
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v1).releaseBuffered(((java.io.Writer)v2));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getCurrentName();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = -8L;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).nextLongValue((((java.lang.Long)v16).longValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isClosed();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).skipChildren();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v3 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v2),((java.lang.Object)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 36;
    Object v7 = new byte[]{};
    Object v8 = -38;
    Object v9 = 10;
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v13 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v14 = 48;
    Object v15 = 1;
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v5),(((java.lang.Integer)v6).intValue()),((java.io.InputStream)v10),((com.fasterxml.jackson.core.ObjectCodec)v11),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v12),((byte[])v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.fasterxml.jackson.core.base.ParserBase)v17)._getByteArrayBuilder();
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v1).readBinaryValue(((java.io.OutputStream)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isClosed();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).skipChildren();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v18).nextValue();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "'";
    ((com.fasterxml.jackson.core.base.ParserBase)v15).overrideCurrentName(((java.lang.String)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isClosed();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).skipChildren();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v18).skipChildren();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isClosed();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).skipChildren();
    Object v19 = "was expecting either '*' or '/' for a comment";
    ((com.fasterxml.jackson.core.base.ParserBase)v18).overrideCurrentName(((java.lang.String)v19));
    Object v20 = null;
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v18)._skipCR();
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isClosed();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).skipChildren();
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v18).getText();
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._getText2(((com.fasterxml.jackson.core.JsonToken)v16));
    org.junit.Assert.assertEquals((Object)(""), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isClosed();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).skipChildren();
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v18)._finishString();
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isClosed();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).skipChildren();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v18).skipChildren();
    Object v20 = ((com.fasterxml.jackson.core.base.ParserBase)v19).getTokenLineNr();
    org.junit.Assert.assertEquals((Object)(1), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).readValueAsTree();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isClosed();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v17).readValueAsTree();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isClosed();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).skipChildren();
    Object v19 = ")";
    Object v20 = " of 4-char base64 uit: padding only legal as 3rd or 4th character";
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v18)._reportInvalidToken(((java.lang.String)v19),((java.lang.String)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = false;
    Object v5 = ((com.fasterxml.jackson.core.JsonParser)v1).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v2),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isClosed();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).skipChildren();
    Object v19 = "), [buf[";
    Object v20 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v18).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v20));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v17 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v18 = true;
    Object v19 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v16),((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = 36;
    Object v21 = new byte[]{};
    Object v22 = -38;
    Object v23 = 10;
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v27 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v28 = 48;
    Object v29 = 1;
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v19),(((java.lang.Integer)v20).intValue()),((java.io.InputStream)v24),((com.fasterxml.jackson.core.ObjectCodec)v25),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v26),((byte[])v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = ((com.fasterxml.jackson.core.base.ParserBase)v31)._getByteArrayBuilder();
    Object v33 = new byte[]{Byte.valueOf((byte)11),Byte.valueOf((byte)0)};
    ((java.io.OutputStream)v32).write(((byte[])v33));
    Object v34 = null;
    Object v35 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).releaseBuffered(((java.io.OutputStream)v32));
    org.junit.Assert.assertEquals((Object)(0), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isClosed();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).skipChildren();
    Object v19 = 1L;
    Object v20 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v18).getValueAsLong((((java.lang.Long)v19).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isClosed();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).skipChildren();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v18).hasTextCharacters();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "De";
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getValueAsString(((java.lang.String)v16));
    Object v18 = "; should be ";
    Object v19 = "' ";
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._reportInvalidToken(((java.lang.String)v18),((java.lang.String)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isClosed();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).skipChildren();
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v18).slowParseName();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isClosed();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).skipChildren();
    Object v19 = 0;
    Object v20 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v18).parseLongName((((java.lang.Integer)v19).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 13;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).nextIntValue((((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isClosed();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).skipChildren();
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17)._parseAposName();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isClosed();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).skipChildren();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v18).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v17 = false;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v15).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = 2;
    Object v20 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._handleOddName((((java.lang.Integer)v19).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isClosed();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).skipChildren();
    Object v19 = "tre";
    ((com.fasterxml.jackson.core.base.ParserBase)v18).overrideCurrentName(((java.lang.String)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isClosed();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17).getValueAsString();
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17)._finishString();
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 36;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 10;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)35)};
    Object v12 = 48;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsBoolean((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = 18.98784835311763D;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsDouble((((java.lang.Double)v18).doubleValue()));
    org.junit.Assert.assertEquals((Object)(18.98784835311763D), v19);
  }
}
