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
    Object v1 = 0;
    Object v2 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v0)._decodeCharForError((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).nextTextValue();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getCurrentLocation();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getDoubleValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._closeInput();
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._decodeEscaped();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = "$";
    Object v18 = 99;
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._matchToken(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getTextOffset();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getDoubleValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._skipString();
    Object v16 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._skipCR();
    Object v18 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    ((com.fasterxml.jackson.core.base.ParserBase)v15).close();
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v15).getEmbeddedObject();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getIntValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = -13;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._handleUnexpectedValue((((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 1;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt((((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getCurrentName();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = -32;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._parseName((((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "'N";
    Object v17 = "Value \"";
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._reportInvalidToken(((java.lang.String)v16),((java.lang.String)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 93.0D;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsDouble((((java.lang.Double)v16).doubleValue()));
    org.junit.Assert.assertEquals((Object)(93.0D), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 1;
    Object v17 = false;
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._handleInvalidNumberStart((((java.lang.Integer)v16).intValue()),(((java.lang.Boolean)v17).booleanValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).slowParseName();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = false;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsBoolean((((java.lang.Boolean)v16).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "was expecting either valid name character (for unquoted name) or ";
    ((com.fasterxml.jackson.core.base.ParserBase)v15).overrideCurrentName(((java.lang.String)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v17 = true;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v15).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = 0;
    Object v20 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._decodeCharForError((((java.lang.Integer)v19).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 101;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._handleOddName((((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).getShortValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 3;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._loadToHaveAtLeast((((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "false";
    ((com.fasterxml.jackson.core.base.ParserBase)v15).overrideCurrentName(((java.lang.String)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v17 = false;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v15).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v16),(((java.lang.Boolean)v17).booleanValue()));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v17 = false;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v15).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v18).getValueAsInt();
    org.junit.Assert.assertEquals((Object)(0), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v17 = java.io.OutputStream.nullOutputStream();
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).readBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v16),((java.io.OutputStream)v17));
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
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v17 = false;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v15).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = 40.113248356063735D;
    Object v20 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v18).getValueAsDouble((((java.lang.Double)v19).doubleValue()));
    Object v21 = 0;
    Object v22 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v18).nextIntValue((((java.lang.Integer)v21).intValue()));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getDecimalValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v17 = false;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v15).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = "false";
    ((com.fasterxml.jackson.core.base.ParserBase)v18).overrideCurrentName(((java.lang.String)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v17 = false;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v15).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v18).getIntValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 0;
    Object v17 = false;
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._handleInvalidNumberStart((((java.lang.Integer)v16).intValue()),(((java.lang.Boolean)v17).booleanValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "D";
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).overrideCurrentName(((java.lang.String)v16));
    Object v17 = null;
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).clearCurrentToken();
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).nextBooleanValue();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "'";
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getValueAsString(((java.lang.String)v16));
    org.junit.Assert.assertEquals((Object)("'"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new int[]{0,76};
    Object v17 = 1;
    Object v18 = 28;
    Object v19 = 0;
    Object v20 = 0;
    Object v21 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).parseEscapedName(((int[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v17 = false;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v15).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ": ";
    Object v20 = "/";
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v18)._reportInvalidToken(((java.lang.String)v19),((java.lang.String)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new int[]{-13};
    Object v1 = 97;
    Object v2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(((int[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "RfOT";
    Object v17 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v17));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getTextCharacters();
    Object v17 = 0;
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._handleUnexpectedValue((((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 11;
    Object v17 = 57;
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._reportInvalidOther((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v17 = false;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v15).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = 0.0D;
    Object v20 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v18).getValueAsDouble((((java.lang.Double)v19).doubleValue()));
    Object v21 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v22 = java.io.OutputStream.nullOutputStream();
    Object v23 = new byte[]{Byte.valueOf((byte)-6)};
    Object v24 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v18)._readBinary(((com.fasterxml.jackson.core.Base64Variant)v21),((java.io.OutputStream)v22),((byte[])v23));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 55244;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._loadToHaveAtLeast((((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v1).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).nextToken();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getNumberType();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = 20;
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt((((java.lang.Integer)v17).intValue()));
    org.junit.Assert.assertEquals((Object)(20), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._handleApos();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 26;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).nextIntValue((((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).nextValue();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = -121L;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsLong((((java.lang.Long)v16).longValue()));
    Object v18 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v18));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getCurrentLocation();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getValueAsString();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 0;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._parseNumber((((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 0;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt((((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v15).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._skipCR();
    Object v16 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getBigIntegerValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15)._getByteArrayBuilder();
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._finishString();
    Object v17 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v15).isExpectedStartArrayToken();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getFloatValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).isExpectedStartArrayToken();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v17 = false;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v15).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = java.io.OutputStream.nullOutputStream();
    Object v20 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v18).releaseBuffered(((java.io.OutputStream)v19));
    org.junit.Assert.assertEquals((Object)(0), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = -24.903948042689645D;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsDouble((((java.lang.Double)v16).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-24.903948042689645D), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v17 = false;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v15).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v18).getText();
    Object v20 = "";
    Object v21 = 0;
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v18)._matchToken(((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getTextLength();
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES;
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v1).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getTextOffset();
    Object v17 = "write umber";
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getValueAsString(((java.lang.String)v17));
    org.junit.Assert.assertEquals((Object)("write umber"), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).getValueAsInt();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v17 = false;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v15).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v20 = ((com.fasterxml.jackson.core.JsonParser)v18).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v19));
    Object v21 = ((com.fasterxml.jackson.core.base.ParserBase)v18).getNumberType();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = -12;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._parseNumber((((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v1).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new int[]{1,57};
    Object v1 = 0;
    Object v2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(((int[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getTextCharacters();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getNumberType();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).requiresCustomCodec();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 2.0D;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsDouble((((java.lang.Double)v16).doubleValue()));
    org.junit.Assert.assertEquals((Object)(2.0D), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 1;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v15).setFeatureMask((((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 1;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v15).setFeatureMask((((java.lang.Integer)v16).intValue()));
    Object v18 = 1L;
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17).nextLongValue((((java.lang.Long)v18).longValue()));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v15).getObjectId();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).readValueAsTree();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getCurrentLocation();
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).nextToken();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 1;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v15).setFeatureMask((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).skipChildren();
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17).slowParseName();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 1;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v15).setFeatureMask((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.core.base.ParserBase)v17).getTokenColumnNr();
    org.junit.Assert.assertEquals((Object)(1), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "De";
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getValueAsString(((java.lang.String)v16));
    Object v18 = 4;
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._reportInvalidChar((((java.lang.Integer)v18).intValue()));
    Object v19 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 1;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v15).setFeatureMask((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17).getTextCharacters();
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsBoolean((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new int[]{40,15};
    Object v19 = -14;
    Object v20 = 255;
    Object v21 = 1;
    Object v22 = -36;
    Object v23 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).parseEscapedName(((int[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 1;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v15).setFeatureMask((((java.lang.Integer)v16).intValue()));
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17)._finishString();
    Object v18 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 1;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v15).setFeatureMask((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.core.base.ParserBase)v17).getDecimalValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v17 = false;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v15).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v18).getTypeId();
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).clearCurrentToken();
    Object v16 = null;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v17 = false;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v15).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v18).getValueAsString();
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v18)._closeInput();
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -21;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 48;
    Object v13 = 6;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 1L;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsLong((((java.lang.Long)v16).longValue()));
    Object v18 = ((com.fasterxml.jackson.core.base.ParserBase)v15).isClosed();
    org.junit.Assert.assertEquals((Object)(false), v18);
  }
}
