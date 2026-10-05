package com.fasterxml.jackson.core.json;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).isExpectedStartArrayToken();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v1).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES;
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v1).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).getByteValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v0)._decodeEscaped();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = -9;
    Object v10 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._parseNumber((((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v10 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._decodeBase64(((com.fasterxml.jackson.core.Base64Variant)v9));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v8).hasTextCharacters();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8).getTextCharacters();
    Object v10 = -55;
    Object v11 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8).nextIntValue((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertEquals((Object)(-55), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).readValueAsTree();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = java.io.Writer.nullWriter();
    Object v10 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8).releaseBuffered(((java.io.Writer)v9));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._handleApos();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8).getValueAsString();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._parseAposName();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v8).getParsingContext();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = "Illegal unquoted character (";
    ((com.fasterxml.jackson.core.base.ParserBase)v8).overrideCurrentName(((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v9));
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._finishString2();
    Object v11 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._decodeEscaped();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v8).getCurrentName();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).getShortValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).getSchema();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).getValueAsBoolean((((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8).loadMore();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._releaseBuffers();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).clearCurrentToken();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v8)._getByteArrayBuilder();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = 2L;
    Object v10 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8).nextLongValue((((java.lang.Long)v9).longValue()));
    org.junit.Assert.assertEquals((Object)(2L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8).getTextCharacters();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = "";
    Object v3 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v1).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = "";
    Object v10 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v8).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = ((com.fasterxml.jackson.core.base.ParserBase)v9).getCurrentLocation();
    Object v11 = "";
    Object v12 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v9).getValueAsString(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(""), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).nextValue();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).getTokenColumnNr();
    org.junit.Assert.assertEquals((Object)(1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v9)._finishString();
    Object v10 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v9).nextToken();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = "write number";
    Object v10 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8).getValueAsString(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)("write number"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = ((com.fasterxml.jackson.core.base.ParserBase)v9).getBigIntegerValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).getBooleanValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).nextValue();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v9)._closeInput();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = -81;
    Object v11 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v9).nextIntValue((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v9)._handleOddValue((((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).hasTextCharacters();
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).getValueAsInt((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = "'B as character #";
    ((com.fasterxml.jackson.core.base.ParserBase)v8).overrideCurrentName(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getTextLength();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).getEmbeddedObject();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = 0L;
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).getValueAsLong((((java.lang.Long)v9).longValue()));
    Object v11 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._handleApos();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = ((com.fasterxml.jackson.core.base.ParserBase)v9).getNumberType();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = 1;
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).getValueAsInt((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).nextValue();
    Object v11 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v9).nextBooleanValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._finishString();
    Object v9 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = "";
    Object v10 = "tru";
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._reportInvalidToken(((java.lang.String)v9),((java.lang.String)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = 51.35382373798969D;
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).getValueAsDouble((((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertEquals((Object)(51.35382373798969D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = 3;
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._handleInvalidNumberStart((((java.lang.Integer)v9).intValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8).getTextLength();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).isExpectedStartArrayToken();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).getDecimalValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = true;
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).getValueAsBoolean((((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8).nextTextValue();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = 1;
    Object v10 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._handleOddValue((((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v8).getDecimalValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v8).getCurrentLocation();
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).clearCurrentToken();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = ((com.fasterxml.jackson.core.base.ParserBase)v9).getDecimalValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v9));
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._closeInput();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = "BIG1DECIMAL";
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v9)._reportInvalidToken(((java.lang.String)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v9).nextToken();
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v9)._finishString2();
    Object v11 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = " /O 0x";
    ((com.fasterxml.jackson.core.base.ParserBase)v8).overrideCurrentName(((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).nextValue();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = 14L;
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).getValueAsLong((((java.lang.Long)v9).longValue()));
    org.junit.Assert.assertEquals((Object)(14L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = -2L;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsLong((((java.lang.Long)v10).longValue()));
    org.junit.Assert.assertEquals((Object)(-2L), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = true;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsBoolean((((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = "write nu{ber";
    Object v10 = 32;
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._matchToken(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).hasTextCharacters();
    Object v10 = -18;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).getValueAsInt((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertEquals((Object)(-18), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = true;
    Object v5 = ((com.fasterxml.jackson.core.JsonParser)v1).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v2),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ")";
    Object v10 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8).getNextChar(((java.lang.String)v9));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = "";
    Object v11 = 1;
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v9)._matchToken(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = 1;
    Object v10 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._handleOddName((((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).getTextCharacters();
    Object v10 = -34.49506474051292D;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).getValueAsDouble((((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-34.49506474051292D), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = 0L;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsLong((((java.lang.Long)v10).longValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserBase)v9).getIntValue();
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
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v10 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8).getBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v9));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v11 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v9)._decodeBase64(((com.fasterxml.jackson.core.Base64Variant)v10));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8).nextBooleanValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8).getText();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v8).getNumberValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v9).getTextOffset();
    Object v11 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v9).getTextCharacters();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v1).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v9).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonParser)v1).getTypeId();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = "";
    Object v11 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v11));
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v1).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v2),(((java.lang.Boolean)v3).booleanValue()));
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
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).nextToken();
    Object v10 = ((com.fasterxml.jackson.core.base.ParserBase)v8).getLongValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0));
    Object v2 = 57;
    Object v3 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v1).readBinaryValue(((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v10 = 57;
    Object v11 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v10).intValue()));
    Object v12 = new byte[]{Byte.valueOf((byte)38),Byte.valueOf((byte)45),Byte.valueOf((byte)1)};
    Object v13 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._readBinary(((com.fasterxml.jackson.core.Base64Variant)v9),((java.io.OutputStream)v11),((byte[])v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).nextValue();
    Object v11 = 1L;
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsLong((((java.lang.Long)v11).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = 4.930904155713467D;
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).getValueAsDouble((((java.lang.Double)v9).doubleValue()));
    Object v11 = -9L;
    Object v12 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8).nextLongValue((((java.lang.Long)v11).longValue()));
    org.junit.Assert.assertEquals((Object)(-9L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = 1;
    Object v10 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._parseName((((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._closeInput();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).skipChildren();
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v9)._parseNumber((((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = " byt";
    Object v10 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8).getValueAsString(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(" byt"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = ") in base64 content";
    ((com.fasterxml.jackson.core.base.ParserBase)v8).overrideCurrentName(((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    Object v9 = 1;
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._handleInvalidNumberStart((((java.lang.Integer)v9).intValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).clearCurrentToken();
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v11 = 57;
    Object v12 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v11).intValue()));
    Object v13 = new byte[]{Byte.valueOf((byte)16)};
    Object v14 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v8)._readBinary(((com.fasterxml.jackson.core.Base64Variant)v10),((java.io.OutputStream)v12),((byte[])v13));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }
}
