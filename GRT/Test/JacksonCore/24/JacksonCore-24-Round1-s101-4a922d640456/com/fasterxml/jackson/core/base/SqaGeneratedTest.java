package com.fasterxml.jackson.core.base;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getValueAsBoolean((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getDoubleValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = 0;
    Object v8 = "START_ARRAY";
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).reportUnexpectedNumberChar((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6)._reportInvalidEOF(((java.lang.String)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.io.JsonEOFException");
    } catch (com.fasterxml.jackson.core.io.JsonEOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getNumberValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getBooleanValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getCurrentName();
    Object v8 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getCurrentName();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).nextFieldName();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getCodec();
    Object v9 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v9));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getShortValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v8));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = 35;
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).nextIntValue((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(35), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getLastClearedToken();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getCodec();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "true";
    Object v1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = "'/";
    Object v9 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v10 = 82;
    Object v11 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7)._decodeBase64(((java.lang.String)v8),((com.fasterxml.jackson.core.util.ByteArrayBuilder)v11),((com.fasterxml.jackson.core.Base64Variant)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).clearCurrentToken();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getValueAsInt();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = 6L;
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getValueAsLong((((java.lang.Long)v8).longValue()));
    org.junit.Assert.assertEquals((Object)(6L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getCurrentLocation();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).currentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getByteValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getText();
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v10).getDecimalValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = 0L;
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getValueAsLong((((java.lang.Long)v8).longValue()));
    Object v10 = 0L;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getValueAsLong((((java.lang.Long)v10).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10)._reportInvalidEOFInValue(((com.fasterxml.jackson.core.JsonToken)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.io.JsonEOFException");
    } catch (com.fasterxml.jackson.core.io.JsonEOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getCurrentValue();
    Object v12 = -24;
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getValueAsInt((((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertEquals((Object)(-24), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsInt();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getCurrentTokenId();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).getNonBlockingInputFeeder();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).nextTextValue();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).isClosed();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).version();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ") now eSceeds maximum, ";
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).reportOverflowLong(((java.lang.String)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.exc.InputCoercionException");
    } catch (com.fasterxml.jackson.core.exc.InputCoercionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getBigIntegerValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getText();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getCurrentValue();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getCurrentTokenId();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).getNonBlockingInputFeeder();
    Object v10 = 15L;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).nextLongValue((((java.lang.Long)v10).longValue()));
    org.junit.Assert.assertEquals((Object)(15L), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).currentName();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).getNumberType();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getCurrentTokenId();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).getNonBlockingInputFeeder();
    Object v10 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).hasToken(((com.fasterxml.jackson.core.JsonToken)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getTextCharacters();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getLastClearedToken();
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v10).getFloatValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getCurrentValue();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsString();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 1L;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v10).nextLongValue((((java.lang.Long)v11).longValue()));
    Object v13 = 6;
    Object v14 = new java.io.StringWriter((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v10).getText(((java.io.Writer)v14));
    org.junit.Assert.assertEquals((Object)(0), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getTextCharacters();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).nextBooleanValue();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getParsingContext();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getValueAsBoolean((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).nextValue();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getCurrentTokenId();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).getNonBlockingInputFeeder();
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).currentName();
    Object v11 = 17;
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).hasTokenId((((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getCurrentLocation();
    Object v11 = "ALLOW_MISSING_VALUES";
    ((com.fasterxml.jackson.core.JsonParser)v9).setRequestPayloadOnError(((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getCurrentValue();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getTokenLocation();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).hasTokenId((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "q";
    Object v1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getCurrentTokenId();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).getNonBlockingInputFeeder();
    Object v10 = "";
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9)._longNumberDesc(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = 5;
    Object v9 = -9;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).overrideFormatFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).skipChildren();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getNumberType();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = 5;
    Object v9 = -9;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).overrideFormatFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getValueAsBoolean((((java.lang.Boolean)v11).booleanValue()));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10)._handleEOF();
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = 6;
    Object v9 = new java.io.StringWriter((((java.lang.Integer)v8).intValue()));
    Object v10 = "*ull";
    ((java.io.Writer)v9).write(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v7).getText(((java.io.Writer)v9));
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = 5;
    Object v9 = -9;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).overrideFormatFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getTokenLocation();
    Object v12 = "Unexpepted byte 0x";
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10)._longIntegerDesc(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)("Unexpepted byte 0x"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsLong();
    org.junit.Assert.assertEquals((Object)(0L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "was expecting double-quote to start field name";
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9)._hasTextualNull(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = 5;
    Object v9 = -9;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).overrideFormatFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getFloatValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getCurrentTokenId();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).getNonBlockingInputFeeder();
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsLong();
    org.junit.Assert.assertEquals((Object)(0L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getCurrentTokenId();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).getNonBlockingInputFeeder();
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = -11L;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v10).nextLongValue((((java.lang.Long)v11).longValue()));
    org.junit.Assert.assertEquals((Object)(-11L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getLongValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = 5;
    Object v9 = -9;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).overrideFormatFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getIntValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = 1;
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).hasTokenId((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getObjectId();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getText();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).nextToken();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = 5;
    Object v9 = -9;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).overrideFormatFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v12 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v13 = false;
    Object v14 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v11),((java.lang.Object)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 25;
    Object v16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v17 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v14),(((java.lang.Integer)v15).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v16));
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).skipChildren();
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v18).getCurrentTokenId();
    Object v20 = ((com.fasterxml.jackson.core.JsonParser)v18).getNonBlockingInputFeeder();
    ((com.fasterxml.jackson.core.JsonParser)v10).setCurrentValue(((java.lang.Object)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = 5;
    Object v9 = -9;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).overrideFormatFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).currentName();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getCurrentTokenId();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).getNonBlockingInputFeeder();
    Object v10 = 6;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsInt((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getTextLength();
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v10));
    Object v12 = new byte[]{Byte.valueOf((byte)-24)};
    Object v13 = "truZ";
    ((com.fasterxml.jackson.core.JsonParser)v11).setRequestPayloadOnError(((byte[])v12),((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v10));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).isExpectedStartObjectToken();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.core.base.ParserMinimalBase._getCharDesc((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("(CTRL-CHAR, code 1)"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v10).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getValueAsString();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v10));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).nextValue();
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).getLastClearedToken();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsBoolean((((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).nextFieldName();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "u";
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9)._longNumberDesc(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)("u"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ", second 0x";
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getValueAsString(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(", second 0x"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 1;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v10).nextIntValue((((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v10),((java.lang.Object)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 25;
    Object v15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v16 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v13),(((java.lang.Integer)v14).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v15));
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v16).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v19).nextValue();
    Object v21 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).hasToken(((com.fasterxml.jackson.core.JsonToken)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getBigIntegerValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getCurrentTokenId();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).getNonBlockingInputFeeder();
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getParsingContext();
    Object v11 = "";
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).overrideCurrentName(((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v10));
    Object v12 = new byte[]{Byte.valueOf((byte)1)};
    Object v13 = "was expecting comma to separate ";
    ((com.fasterxml.jackson.core.JsonParser)v11).setRequestPayloadOnError(((byte[])v12),((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getCurrentTokenId();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).getNonBlockingInputFeeder();
    Object v10 = 255;
    Object v11 = "Q";
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9)._reportUnexpectedChar((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = 5;
    Object v9 = -9;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).overrideFormatFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 23;
    Object v12 = "flse";
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).reportUnexpectedNumberChar((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).skipChildren();
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "null";
    Object v12 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v10).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }
}
