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
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).clearCurrentToken();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).nextToken();
    Object v8 = "Infinit";
    Object v9 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v6).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = "Malfor";
    ((com.fasterxml.jackson.core.JsonParser)v6).setRequestPayloadOnError(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).hasToken(((com.fasterxml.jackson.core.JsonToken)v7));
    org.junit.Assert.assertEquals((Object)(false), v9);
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
    Object v7 = ((com.fasterxml.jackson.core.base.ParserBase)v6).getBigIntegerValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).currentName();
    org.junit.Assert.assertNull(v7);
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
    Object v7 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v8 = ((com.fasterxml.jackson.core.Base64Variant)v7).hashCode();
    Object v9 = 1;
    Object v10 = -35;
    Object v11 = "/";
    Object v12 = ((com.fasterxml.jackson.core.base.ParserBase)v6).reportInvalidBase64Char(((com.fasterxml.jackson.core.Base64Variant)v7),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
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
    Object v7 = "was expecting double-quote to start field name";
    Object v8 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getValueAsString(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)("was expecting double-quote to start field name"), v8);
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
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getCurrentName();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).nextBooleanValue();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
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
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserBase)v6).hasTextCharacters();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = -26;
    Object v8 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).hasTokenId((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v8);
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
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).isExpectedStartObjectToken();
    org.junit.Assert.assertEquals((Object)(false), v7);
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
    Object v7 = 0;
    Object v8 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).hasTokenId((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v8);
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
    Object v7 = ((com.fasterxml.jackson.core.base.ParserBase)v6).getCurrentName();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = 1L;
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).nextLongValue((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserBase)v6).getTokenColumnNr();
    org.junit.Assert.assertEquals((Object)(1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getByteValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = 0;
    Object v8 = "was expecting comma to separate ";
    ((com.fasterxml.jackson.core.base.ParserBase)v6)._throwUnquotedSpace((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    org.junit.Assert.assertNotNull(v9);
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
    Object v7 = java.io.Writer.nullWriter();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).getText(((java.io.Writer)v7));
    org.junit.Assert.assertEquals((Object)(0), v8);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsString();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v11 = 0;
    Object v12 = 4;
    Object v13 = ((com.fasterxml.jackson.core.base.ParserBase)v9)._decodeBase64Escape(((com.fasterxml.jackson.core.Base64Variant)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = "Infinit";
    Object v11 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v11));
    Object v13 = ((com.fasterxml.jackson.core.base.ParserBase)v9).getCurrentName();
    org.junit.Assert.assertNull(v13);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    ((com.fasterxml.jackson.core.base.ParserBase)v9).convertNumberToInt();
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).isExpectedStartObjectToken();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).getBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v10));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserBase)v9).getIntValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserBase)v9).isNaN();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserBase)v9).getNumberValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = "nul";
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsString(((java.lang.String)v10));
    ((com.fasterxml.jackson.core.base.ParserBase)v9).convertNumberToBigInteger();
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getByteValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = 0L;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsLong((((java.lang.Long)v10).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v11);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).nextValue();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).isExpectedStartObjectToken();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getValueAsString();
    org.junit.Assert.assertNull(v7);
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
    Object v7 = ((com.fasterxml.jackson.core.base.ParserBase)v6).getNumberType();
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    ((com.fasterxml.jackson.core.base.ParserBase)v9).convertNumberToBigDecimal();
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsLong();
    org.junit.Assert.assertEquals((Object)(0L), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsString();
    ((com.fasterxml.jackson.core.base.ParserBase)v9).loadMoreGuaranteed();
    Object v11 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.io.JsonEOFException");
    } catch (com.fasterxml.jackson.core.io.JsonEOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    org.junit.Assert.assertNotNull(v14);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v15 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v14).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v14).getDecimalValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = 6;
    Object v11 = 4;
    ((com.fasterxml.jackson.core.base.ParserBase)v9)._checkStdFeatureChanges((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).currentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v10);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v10);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = -15;
    Object v12 = 37;
    Object v13 = ((com.fasterxml.jackson.core.base.ParserBase)v10).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNotNull(v13);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v15 = -9L;
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v14).getValueAsLong((((java.lang.Long)v15).longValue()));
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v14).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v11 = new byte[]{Byte.valueOf((byte)1)};
    Object v12 = ((com.fasterxml.jackson.core.Base64Variant)v10).encode(((byte[])v11));
    Object v13 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v14 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v9).readBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v10),((java.io.OutputStream)v14));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).nextIntValue((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getTextCharacters();
    org.junit.Assert.assertNull(v12);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserBase)v9).getTokenColumnNr();
    org.junit.Assert.assertEquals((Object)(1), v10);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = -15;
    Object v12 = 37;
    Object v13 = ((com.fasterxml.jackson.core.base.ParserBase)v10).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v13).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v14);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = -15;
    Object v12 = 37;
    Object v13 = ((com.fasterxml.jackson.core.base.ParserBase)v10).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = -9;
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v13).setFeatureMask((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).nextFieldName();
    org.junit.Assert.assertNull(v16);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = -15;
    Object v12 = 37;
    Object v13 = ((com.fasterxml.jackson.core.base.ParserBase)v10).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v13).getTextLength();
    org.junit.Assert.assertEquals((Object)(0), v14);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getCodec();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = 44;
    Object v12 = "null";
    ((com.fasterxml.jackson.core.base.ParserBase)v10)._reportTooLongIntegral((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.exc.InputCoercionException");
    } catch (com.fasterxml.jackson.core.exc.InputCoercionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = true;
    Object v12 = 12;
    Object v13 = 1;
    Object v14 = 0;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v10).reset((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v10)._parseIntValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    ((com.fasterxml.jackson.core.base.ParserBase)v10).convertNumberToDouble();
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = java.io.Writer.nullWriter();
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).getText(((java.io.Writer)v10));
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).getObjectId();
    org.junit.Assert.assertNull(v12);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v14).nextBooleanValue();
    Object v16 = new byte[]{};
    Object v17 = "was expecting either valid name character (for unquoted name) or doble-quote (for quoted) to start field name";
    ((com.fasterxml.jackson.core.JsonParser)v14).setRequestPayloadOnError(((byte[])v16),((java.lang.String)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).nextToken();
    Object v11 = Character.valueOf((char)0);
    Object v12 = ((com.fasterxml.jackson.core.base.ParserBase)v9)._handleUnrecognizedCharacterEscape((((java.lang.Character)v11).charValue()));
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v14).getTokenColumnNr();
    org.junit.Assert.assertEquals((Object)(1), v15);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v14).hasTextCharacters();
    org.junit.Assert.assertEquals((Object)(false), v15);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v15 = -9L;
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v14).getValueAsLong((((java.lang.Long)v15).longValue()));
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v14).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = ((com.fasterxml.jackson.core.base.ParserBase)v19).hasTextCharacters();
    org.junit.Assert.assertEquals((Object)(false), v20);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).nextBooleanValue();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v15 = -9L;
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v14).getValueAsLong((((java.lang.Long)v15).longValue()));
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v14).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v21 = 0;
    Object v22 = 0;
    Object v23 = ((com.fasterxml.jackson.core.base.ParserBase)v19)._decodeBase64Escape(((com.fasterxml.jackson.core.Base64Variant)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    ((com.fasterxml.jackson.core.base.ParserBase)v10).convertNumberToInt();
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v14).getCurrentLocation();
    Object v16 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v17 = new byte[]{Byte.valueOf((byte)6)};
    Object v18 = ((com.fasterxml.jackson.core.Base64Variant)v16).encode(((byte[])v17));
    Object v19 = -24;
    Object v20 = 1;
    Object v21 = ((com.fasterxml.jackson.core.base.ParserBase)v14).reportInvalidBase64Char(((com.fasterxml.jackson.core.Base64Variant)v16),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    org.junit.Assert.assertNotNull(v21);
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
    ((com.fasterxml.jackson.core.base.ParserBase)v6).close();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v15 = java.io.Writer.nullWriter();
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v14).getText(((java.io.Writer)v15));
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v15 = 1;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v14).nextIntValue((((java.lang.Integer)v15).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v16);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = -15;
    Object v12 = 37;
    Object v13 = ((com.fasterxml.jackson.core.base.ParserBase)v10).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).getCodec();
    Object v15 = 33;
    ((com.fasterxml.jackson.core.base.ParserBase)v13)._parseNumericValue((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v11);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserBase)v9)._getByteArrayBuilder();
    ((com.fasterxml.jackson.core.base.ParserBase)v9)._closeInput();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserBase)v9).getNumberType();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v15 = -9L;
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v14).getValueAsLong((((java.lang.Long)v15).longValue()));
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v14).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = 1;
    Object v21 = ((com.fasterxml.jackson.core.JsonParser)v19).setFeatureMask((((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v19).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    ((com.fasterxml.jackson.core.base.ParserBase)v14).loadMoreGuaranteed();
    Object v15 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.io.JsonEOFException");
    } catch (com.fasterxml.jackson.core.io.JsonEOFException expected) { }
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = ((com.fasterxml.jackson.core.base.ParserBase)v10).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNotNull(v13);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v15 = -9L;
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v14).getValueAsLong((((java.lang.Long)v15).longValue()));
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v14).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = 0;
    Object v21 = -12;
    ((com.fasterxml.jackson.core.base.ParserBase)v19)._checkStdFeatureChanges((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v12 = ((com.fasterxml.jackson.core.base.ParserBase)v10).getBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = -15;
    Object v12 = 37;
    Object v13 = ((com.fasterxml.jackson.core.base.ParserBase)v10).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.fasterxml.jackson.core.base.ParserBase)v13).convertNumberToLong();
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    ((com.fasterxml.jackson.core.base.ParserBase)v14).convertNumberToLong();
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = -15;
    Object v12 = 37;
    Object v13 = ((com.fasterxml.jackson.core.base.ParserBase)v10).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v13).hasTextCharacters();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = -15;
    Object v12 = 37;
    Object v13 = ((com.fasterxml.jackson.core.base.ParserBase)v10).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v13).getBigIntegerValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v15 = -9L;
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v14).getValueAsLong((((java.lang.Long)v15).longValue()));
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v14).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    ((com.fasterxml.jackson.core.base.ParserBase)v19).convertNumberToDouble();
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v14).getNumberType();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = -15;
    Object v12 = 37;
    Object v13 = ((com.fasterxml.jackson.core.base.ParserBase)v10).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.fasterxml.jackson.core.base.ParserBase)v13).convertNumberToBigInteger();
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = 0;
    Object v11 = "expected padding character '";
    ((com.fasterxml.jackson.core.base.ParserBase)v9)._throwUnquotedSpace((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v14).getCurrentName();
    org.junit.Assert.assertNull(v15);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v10)._getSourceReference();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getShortValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).nextBooleanValue();
    Object v11 = java.io.Writer.nullWriter();
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).getText(((java.io.Writer)v11));
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getTextOffset();
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v15 = new byte[]{Byte.valueOf((byte)-2),Byte.valueOf((byte)1)};
    Object v16 = "PARENT_PROPERTG";
    ((com.fasterxml.jackson.core.JsonParser)v14).setRequestPayloadOnError(((byte[])v15),((java.lang.String)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserBase)v9).getDoubleValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
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
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getTypeId();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new int[]{0,1,-57};
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(((int[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getFeatureMask();
    org.junit.Assert.assertEquals((Object)(1049), v11);
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
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserBase)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = true;
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getValueAsBoolean((((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }
}
