package com.fasterxml.jackson.core.json.async;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v6)._startAposString();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v6)._finishFloatFraction();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v6)._startNegativeNumber();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = "[";
    Object v8 = 16;
    Object v9 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v10 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v9),((java.lang.Object)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 29;
    Object v14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v15 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v12),(((java.lang.Integer)v13).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v14));
    Object v16 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v15)._startAposString();
    Object v17 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v6)._finishKeywordTokenWithEOF(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),((com.fasterxml.jackson.core.JsonToken)v16));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).nextBooleanValue();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = 1;
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).nextIntValue((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = 2;
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).nextIntValue((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(2), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase)v6).getValueAsString();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).hasCurrentToken();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).nextFieldName();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase)v6).hasTextCharacters();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v8 = new com.fasterxml.jackson.core.io.SegmentedStringWriter(((com.fasterxml.jackson.core.util.BufferRecycler)v7));
    Object v9 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase)v6).getText(((java.io.Writer)v8));
    Object v10 = "FLUSH_PASSED_TO_STREAM";
    Object v11 = 1;
    Object v12 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v13 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v12),((java.lang.Object)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 29;
    Object v17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v18 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v15),(((java.lang.Integer)v16).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v18)._startAposString();
    Object v20 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v6)._finishKeywordToken(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((com.fasterxml.jackson.core.JsonToken)v19));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v6)._finishNumberLeadingZeroes();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).nextFieldName();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = 41;
    Object v8 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v6)._startPositiveNumber((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v6)._startString();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = -42;
    Object v8 = 34;
    Object v9 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v6)._finishNonStdToken((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v6).needMoreInput();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = "name";
    ((com.fasterxml.jackson.core.JsonParser)v6).setRequestPayloadOnError(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getValueAsLong();
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v8 = -14;
    Object v9 = 50;
    Object v10 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v6)._startFloat(((char[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v6)._finishFieldWithEscape();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getTypeId();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v11)._startString();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v9)._startFalseToken();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).getValueAsLong();
    org.junit.Assert.assertEquals((Object)(0L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v11).getValueAsBoolean();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v9)._startTrueToken();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase)v11).getEmbeddedObject();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getText();
    Object v8 = ((com.fasterxml.jackson.core.base.ParserBase)v6).getTokenColumnNr();
    org.junit.Assert.assertEquals((Object)(1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = ((com.fasterxml.jackson.core.base.ParserBase)v12).getLongValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = 1L;
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getValueAsLong((((java.lang.Long)v13).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = new char[]{Character.valueOf((char)4)};
    Object v14 = -29;
    Object v15 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v12)._finishNumberIntegralPart(((char[])v13),(((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v9).nextToken();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = new char[]{Character.valueOf((char)63)};
    Object v14 = 0;
    Object v15 = 0;
    Object v16 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v12)._startFloat(((char[])v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getTextCharacters();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v12).getBigIntegerValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v11)._startAposString();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 4;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).nextIntValue((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserBase)v9)._getByteArrayBuilder();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v13 = new com.fasterxml.jackson.core.io.SegmentedStringWriter(((com.fasterxml.jackson.core.util.BufferRecycler)v12));
    Object v14 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase)v11).getText(((java.io.Writer)v13));
    org.junit.Assert.assertEquals((Object)(0), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserBase)v11).getLongValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = ((com.fasterxml.jackson.core.base.ParserBase)v12).getCurrentName();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v14 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v15 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v14),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = 29;
    Object v19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v20 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v17),(((java.lang.Integer)v18).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v19));
    Object v21 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v22 = false;
    Object v23 = ((com.fasterxml.jackson.core.JsonParser)v20).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = 4;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v23).nextIntValue((((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.fasterxml.jackson.core.base.ParserBase)v23)._getByteArrayBuilder();
    Object v27 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase)v12).readBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v13),((java.io.OutputStream)v26));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = false;
    Object v14 = 0;
    Object v15 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v12)._startUnexpectedValue((((java.lang.Boolean)v13).booleanValue()),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v6)._startTrueToken();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = ((com.fasterxml.jackson.core.base.ParserBase)v12).getTokenLineNr();
    org.junit.Assert.assertEquals((Object)(1), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = 16;
    Object v13 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v11)._finishNumberMinus((((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsBoolean((((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = -26.03923832022797D;
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getValueAsDouble((((java.lang.Double)v13).doubleValue()));
    Object v15 = "): ";
    Object v16 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase)v12).getValueAsString(((java.lang.String)v15));
    org.junit.Assert.assertEquals((Object)("): "), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = ((com.fasterxml.jackson.core.base.ParserBase)v12).isNaN();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v12)._finishTokenWithEOF();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.io.JsonEOFException");
    } catch (com.fasterxml.jackson.core.io.JsonEOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = 0L;
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getValueAsLong((((java.lang.Long)v13).longValue()));
    Object v15 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase)v12).hasTextCharacters();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsString();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).nextValue();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase)v11).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v9)._decodeEscaped();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase)v9).getTokenLocation();
    Object v11 = "write a string";
    Object v12 = 1;
    Object v13 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v14 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v15 = true;
    Object v16 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v13),((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 29;
    Object v18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v19 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v16),(((java.lang.Integer)v17).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v18));
    Object v20 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v19)._startTrueToken();
    Object v21 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v9)._finishKeywordTokenWithEOF(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),((com.fasterxml.jackson.core.JsonToken)v20));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v12).nextBooleanValue();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v10));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v12).getByteValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase)v9).getTextLength();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).nextValue();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase)v11).getTextCharacters();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = "";
    Object v14 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v12).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "";
    Object v11 = 0;
    Object v12 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v13 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v12),((java.lang.Object)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 29;
    Object v17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v18 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v15),(((java.lang.Integer)v16).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v18)._finishFieldWithEscape();
    Object v20 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v9)._finishKeywordToken(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((com.fasterxml.jackson.core.JsonToken)v19));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v11 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v10),((java.lang.Object)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 29;
    Object v15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v16 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v13),(((java.lang.Integer)v14).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v15));
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v18 = false;
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v16).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = 24;
    Object v21 = ((com.fasterxml.jackson.core.base.ParserBase)v19).setFeatureMask((((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v21).skipChildren();
    Object v23 = ((com.fasterxml.jackson.core.base.ParserBase)v22).isNaN();
    ((com.fasterxml.jackson.core.base.ParserBase)v9).setCurrentValue(((java.lang.Object)v23));
    Object v24 = null;
    Object v25 = new byte[]{Byte.valueOf((byte)38),Byte.valueOf((byte)1)};
    Object v26 = 21;
    Object v27 = 1;
    ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v9).feedInput(((byte[])v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v28 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsInt();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).nextValue();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).isExpectedStartObjectToken();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v12)._finishNumberLeadingZeroes();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v13 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v12),((java.lang.Object)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 29;
    Object v17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v18 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v15),(((java.lang.Integer)v16).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v17));
    Object v19 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v20 = false;
    Object v21 = ((com.fasterxml.jackson.core.JsonParser)v18).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = 24;
    Object v23 = ((com.fasterxml.jackson.core.base.ParserBase)v21).setFeatureMask((((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v23).skipChildren();
    Object v25 = -26.03923832022797D;
    Object v26 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v24).getValueAsDouble((((java.lang.Double)v25).doubleValue()));
    Object v27 = "): ";
    Object v28 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase)v24).getValueAsString(((java.lang.String)v27));
    Object v29 = new com.fasterxml.jackson.core.util.RequestPayload(((java.lang.CharSequence)v28));
    ((com.fasterxml.jackson.core.JsonParser)v11).setRequestPayloadOnError(((com.fasterxml.jackson.core.util.RequestPayload)v29));
    Object v30 = null;
    Object v31 = "a";
    ((com.fasterxml.jackson.core.base.ParserBase)v11).overrideCurrentName(((java.lang.String)v31));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v14 = ((com.fasterxml.jackson.core.Base64Variant)v13).hashCode();
    Object v15 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase)v12).getBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v13));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v11)._finishNumberLeadingNegZeroes();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = -13;
    Object v14 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v12)._startPositiveNumber((((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = 1L;
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getValueAsLong((((java.lang.Long)v13).longValue()));
    Object v15 = -10.585071832950971D;
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getValueAsDouble((((java.lang.Double)v15).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-10.585071832950971D), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = 1.0D;
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getValueAsDouble((((java.lang.Double)v13).doubleValue()));
    Object v15 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v12)._startNegativeNumber();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = 44L;
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getValueAsLong((((java.lang.Long)v13).longValue()));
    Object v15 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).currentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = ((com.fasterxml.jackson.core.base.ParserBase)v12).getDecimalValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = 0L;
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getValueAsLong((((java.lang.Long)v13).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).nextFieldName();
    Object v11 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v12 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v11),((java.lang.Object)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 29;
    Object v16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v17 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v14),(((java.lang.Integer)v15).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v16));
    Object v18 = 41;
    Object v19 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v17)._startPositiveNumber((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).hasToken(((com.fasterxml.jackson.core.JsonToken)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).clearCurrentToken();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "}";
    Object v11 = -4;
    Object v12 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v13 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v12),((java.lang.Object)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 29;
    Object v17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v18 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v15),(((java.lang.Integer)v16).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v17));
    Object v19 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v20 = false;
    Object v21 = ((com.fasterxml.jackson.core.JsonParser)v18).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = 24;
    Object v23 = ((com.fasterxml.jackson.core.base.ParserBase)v21).setFeatureMask((((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v23)._finishNumberLeadingNegZeroes();
    Object v25 = ((java.lang.Enum)v24).getDeclaringClass();
    Object v26 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v9)._finishKeywordTokenWithEOF(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((com.fasterxml.jackson.core.JsonToken)v24));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v11).getTokenLocation();
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v11).getBooleanValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new byte[]{Byte.valueOf((byte)-25)};
    Object v11 = 0;
    Object v12 = 4;
    ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v9).feedInput(((byte[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = 2;
    Object v15 = 34;
    Object v16 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v9)._finishNonStdToken((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new byte[]{Byte.valueOf((byte)1)};
    Object v11 = "'";
    ((com.fasterxml.jackson.core.JsonParser)v9).setRequestPayloadOnError(((byte[])v10),((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v11 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v10),((java.lang.Object)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 29;
    Object v15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v16 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v13),(((java.lang.Integer)v14).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v15));
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v18 = false;
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v16).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = 24;
    Object v21 = ((com.fasterxml.jackson.core.base.ParserBase)v19).setFeatureMask((((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v21).skipChildren();
    Object v23 = new char[]{Character.valueOf((char)4)};
    Object v24 = -29;
    Object v25 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v22)._finishNumberIntegralPart(((char[])v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v9).hasToken(((com.fasterxml.jackson.core.JsonToken)v25));
    Object v27 = ((com.fasterxml.jackson.core.JsonParser)v9).getObjectId();
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v12)._finishErrorToken();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getBooleanValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new byte[]{Byte.valueOf((byte)20)};
    Object v11 = "was expecting double-quote to start fkield name";
    ((com.fasterxml.jackson.core.JsonParser)v9).setRequestPayloadOnError(((byte[])v10),((java.lang.String)v11));
    Object v12 = null;
    ((com.fasterxml.jackson.core.base.ParserBase)v9).close();
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getShortValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v11)._finishFieldWithEscape();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v11 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v10),((java.lang.Object)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 29;
    Object v15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v16 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v13),(((java.lang.Integer)v14).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v15));
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v18 = false;
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v16).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = 24;
    Object v21 = ((com.fasterxml.jackson.core.base.ParserBase)v19).setFeatureMask((((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v21).skipChildren();
    Object v23 = -26.03923832022797D;
    Object v24 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).getValueAsDouble((((java.lang.Double)v23).doubleValue()));
    Object v25 = "): ";
    Object v26 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase)v22).getValueAsString(((java.lang.String)v25));
    Object v27 = new com.fasterxml.jackson.core.util.RequestPayload(((java.lang.CharSequence)v26));
    ((com.fasterxml.jackson.core.JsonParser)v9).setRequestPayloadOnError(((com.fasterxml.jackson.core.util.RequestPayload)v27));
    Object v28 = null;
    Object v29 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v9).needMoreInput();
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v11).currentToken();
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = "Infinity";
    ((com.fasterxml.jackson.core.JsonParser)v11).setRequestPayloadOnError(((byte[])v13),((java.lang.String)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v12).getNonBlockingInputFeeder();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v12).getNonBlockingInputFeeder();
    Object v14 = 0;
    Object v15 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v13)._startPositiveNumber((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v8 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v9 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v8),((java.lang.Object)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 29;
    Object v13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v14 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v11),(((java.lang.Integer)v12).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v16 = false;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = 4;
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v17).nextIntValue((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.core.base.ParserBase)v17)._getByteArrayBuilder();
    Object v21 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase)v6).readBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v7),((java.io.OutputStream)v20));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = -1L;
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).nextLongValue((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v11 = ((java.lang.Enum)v10).getDeclaringClass();
    Object v12 = ((com.fasterxml.jackson.core.base.ParserBase)v9).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v1 = com.fasterxml.jackson.core.util.BufferRecyclers.getBufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 24;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserBase)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).skipChildren();
    Object v13 = ((com.fasterxml.jackson.core.json.async.NonBlockingJsonParser)v12).getNonBlockingInputFeeder();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v13).getCurrentLocation();
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).getDecimalValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }
}
