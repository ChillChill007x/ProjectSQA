package com.fasterxml.jackson.core.filter;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
    Object v15 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).hasToken(((com.fasterxml.jackson.core.JsonToken)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).isNaN();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).hasTextCharacters();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).nextBooleanValue();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).version();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 6.0D;
    Object v15 = com.fasterxml.jackson.core.io.NumberOutput.toString((((java.lang.Double)v14).doubleValue()));
    Object v16 = new com.fasterxml.jackson.core.util.RequestPayload(((java.lang.CharSequence)v15));
    ((com.fasterxml.jackson.core.JsonParser)v13).setRequestPayloadOnError(((com.fasterxml.jackson.core.util.RequestPayload)v16));
    Object v17 = null;
    Object v18 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).getText();
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).getCurrentName();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).nextFieldName();
    Object v15 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v17));
    Object v19 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v18));
    Object v20 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13)._nextTokenWithBuffering(((com.fasterxml.jackson.core.filter.TokenFilterContext)v19));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = 1;
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).nextIntValue((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 0L;
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v13).nextLongValue((((java.lang.Long)v14).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).getTextCharacters();
    Object v15 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).getLongValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).nextTextValue();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).getValueAsString();
    Object v16 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
    Object v17 = ((java.lang.Enum)v16).hashCode();
    Object v18 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).hasToken(((com.fasterxml.jackson.core.JsonToken)v16));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v17));
    Object v19 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v18));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setCurrentValue(((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = 2;
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).nextIntValue((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(2), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v17));
    Object v19 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v18));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setCurrentValue(((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v22 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v21).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v17));
    Object v19 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v18));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setCurrentValue(((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v22 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v21).getCodec();
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).getText();
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v13).nextBooleanValue();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v17));
    Object v19 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v18));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setCurrentValue(((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v22 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v21).currentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v17));
    Object v19 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v18));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setCurrentValue(((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v22 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)15)};
    Object v23 = "Invalid UTF-8 middle byteZ 0x";
    ((com.fasterxml.jackson.core.JsonParser)v21).setRequestPayloadOnError(((byte[])v22),((java.lang.String)v23));
    Object v24 = null;
    Object v25 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v21).nextValue();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v17));
    Object v19 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v18));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setCurrentValue(((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v22 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v21).isExpectedStartObjectToken();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).skipChildren();
    Object v16 = -3;
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setFeatureMask((((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).skipChildren();
    Object v16 = -3;
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setFeatureMask((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v17).currentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).nextTextValue();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).skipChildren();
    Object v16 = -3;
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setFeatureMask((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v17).nextToken();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).skipChildren();
    Object v16 = -3;
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setFeatureMask((((java.lang.Integer)v16).intValue()));
    Object v18 = 1L;
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v17).nextLongValue((((java.lang.Long)v18).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).requiresCustomCodec();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).readValueAsTree();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v17));
    Object v19 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v18));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setCurrentValue(((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v21).nextFieldName();
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).skipChildren();
    Object v16 = -3;
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setFeatureMask((((java.lang.Integer)v16).intValue()));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v17).close();
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v17));
    Object v19 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v18));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setCurrentValue(((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v21).getCurrentToken();
    Object v23 = ((com.fasterxml.jackson.core.JsonParser)v21).nextTextValue();
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v16).nextTextValue();
    Object v18 = "Decimal point not followed by a digit";
    ((com.fasterxml.jackson.core.JsonParser)v16).setRequestPayloadOnError(((java.lang.String)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v17).nextToken();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v18 = false;
    Object v19 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v19));
    Object v21 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v20));
    Object v22 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v16)._nextTokenWithBuffering(((com.fasterxml.jackson.core.filter.TokenFilterContext)v21));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = java.io.Writer.nullWriter();
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v16).releaseBuffered(((java.io.Writer)v17));
    org.junit.Assert.assertEquals((Object)(-1), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14)._nextToken2();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v17));
    Object v19 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v18));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setCurrentValue(((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v22 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v23 = ((java.lang.Enum)v22).hashCode();
    Object v24 = false;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v21).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v22),(((java.lang.Boolean)v24).booleanValue()));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v17));
    Object v19 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v18));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setCurrentValue(((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v22 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v23 = ((java.lang.Enum)v22).hashCode();
    Object v24 = false;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v21).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v22),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v25).nextValue();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = "";
    Object v16 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v17).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v16 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v15).isExpectedStartObjectToken();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v16 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v15).getCurrentName();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v17));
    Object v19 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v18));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setCurrentValue(((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v22 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v23 = ((java.lang.Enum)v22).hashCode();
    Object v24 = false;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v21).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v22),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v27 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v26));
    Object v28 = new byte[]{Byte.valueOf((byte)-18),Byte.valueOf((byte)1),Byte.valueOf((byte)6)};
    ((java.io.OutputStream)v27).write(((byte[])v28));
    Object v29 = null;
    Object v30 = ((com.fasterxml.jackson.core.JsonParser)v25).readBinaryValue(((java.io.OutputStream)v27));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "Broken surrogate pair: first char x";
    ((com.fasterxml.jackson.core.JsonParser)v17).setRequestPayloadOnError(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v17).skipChildren();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).getShortValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v17));
    Object v19 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v18));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setCurrentValue(((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v21).clearCurrentToken();
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = "'";
    ((com.fasterxml.jackson.core.JsonParser)v16).setRequestPayloadOnError(((java.lang.String)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v17));
    Object v19 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v18));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setCurrentValue(((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v22 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v23 = ((java.lang.Enum)v22).hashCode();
    Object v24 = false;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v21).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v22),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = 1L;
    Object v27 = ((com.fasterxml.jackson.core.JsonParser)v25).nextLongValue((((java.lang.Long)v26).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).skipChildren();
    Object v16 = -3;
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setFeatureMask((((java.lang.Integer)v16).intValue()));
    Object v18 = java.io.Writer.nullWriter();
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v17).releaseBuffered(((java.io.Writer)v18));
    org.junit.Assert.assertEquals((Object)(-1), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "Broken surrogate pair: first char x";
    ((com.fasterxml.jackson.core.JsonParser)v17).setRequestPayloadOnError(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v17).skipChildren();
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v20).clearCurrentToken();
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "Broken surrogate pair: first char x";
    ((com.fasterxml.jackson.core.JsonParser)v17).setRequestPayloadOnError(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v17).skipChildren();
    Object v21 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v22 = false;
    Object v23 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v23));
    Object v25 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v24));
    Object v26 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v20)._nextTokenWithBuffering(((com.fasterxml.jackson.core.filter.TokenFilterContext)v25));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).isClosed();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "Broken surrogate pair: first char x";
    ((com.fasterxml.jackson.core.JsonParser)v17).setRequestPayloadOnError(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v17).skipChildren();
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v20)._nextToken2();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "Broken surrogate pair: first char x";
    ((com.fasterxml.jackson.core.JsonParser)v17).setRequestPayloadOnError(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v17).skipChildren();
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v20).getEmbeddedObject();
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).skipChildren();
    Object v16 = -3;
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setFeatureMask((((java.lang.Integer)v16).intValue()));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v17).clearCurrentToken();
    Object v18 = null;
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v17).close();
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).skipChildren();
    Object v16 = -3;
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setFeatureMask((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v17).nextValue();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v16).getBooleanValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = 288;
    Object v18 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v16).hasTokenId((((java.lang.Integer)v17).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "Broken surrogate pair: first char x";
    ((com.fasterxml.jackson.core.JsonParser)v17).setRequestPayloadOnError(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v17).skipChildren();
    Object v21 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v22 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v23 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v22));
    Object v24 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v20).readBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v21),((java.io.OutputStream)v23));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v16 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v15).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).getLastClearedToken();
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).isNaN();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = 6.0D;
    Object v19 = com.fasterxml.jackson.core.io.NumberOutput.toString((((java.lang.Double)v18).doubleValue()));
    Object v20 = new com.fasterxml.jackson.core.util.RequestPayload(((java.lang.CharSequence)v19));
    ((com.fasterxml.jackson.core.JsonParser)v17).setRequestPayloadOnError(((com.fasterxml.jackson.core.util.RequestPayload)v20));
    Object v21 = null;
    Object v22 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v17).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = 0;
    Object v18 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v16).hasTokenId((((java.lang.Integer)v17).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).getValueAsDouble();
    org.junit.Assert.assertEquals((Object)(0.0D), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = 6.0D;
    Object v16 = com.fasterxml.jackson.core.io.NumberOutput.toString((((java.lang.Double)v15).doubleValue()));
    Object v17 = new com.fasterxml.jackson.core.util.RequestPayload(((java.lang.CharSequence)v16));
    ((com.fasterxml.jackson.core.JsonParser)v14).setRequestPayloadOnError(((com.fasterxml.jackson.core.util.RequestPayload)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "Broken surrogate pair: first char x";
    ((com.fasterxml.jackson.core.JsonParser)v17).setRequestPayloadOnError(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v17).skipChildren();
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v20).getTextCharacters();
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).skipChildren();
    Object v16 = -3;
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setFeatureMask((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v17).getTextLength();
    org.junit.Assert.assertEquals((Object)(0), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).getCurrentValue();
    Object v16 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "Broken surrogate pair: first char x";
    ((com.fasterxml.jackson.core.JsonParser)v17).setRequestPayloadOnError(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v17).skipChildren();
    Object v21 = 21;
    Object v22 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v20).setFeatureMask((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v20)._nextToken2();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getObjectId();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "Broken surrogate pair: first char x";
    ((com.fasterxml.jackson.core.JsonParser)v17).setRequestPayloadOnError(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v17).skipChildren();
    Object v21 = ((com.fasterxml.jackson.core.JsonParser)v20).nextFieldName();
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v16).nextTextValue();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = 0;
    Object v19 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v17).hasTokenId((((java.lang.Integer)v18).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v16 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v15).currentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v16).nextBooleanValue();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v14).nextTextValue();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v16).getBigIntegerValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).getCurrentValue();
    Object v16 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v16).getDoubleValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).skipChildren();
    Object v16 = -3;
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setFeatureMask((((java.lang.Integer)v16).intValue()));
    Object v18 = 22;
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v17).nextIntValue((((java.lang.Integer)v18).intValue()));
    org.junit.Assert.assertEquals((Object)(22), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v17));
    Object v19 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v18));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setCurrentValue(((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v22 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v23 = ((java.lang.Enum)v22).hashCode();
    Object v24 = false;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v21).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v22),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v25).getFloatValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v19 = false;
    Object v20 = ((com.fasterxml.jackson.core.JsonParser)v17).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v22 = false;
    Object v23 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v23));
    Object v25 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v24));
    Object v26 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v17)._nextTokenWithBuffering(((com.fasterxml.jackson.core.filter.TokenFilterContext)v25));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).skipChildren();
    Object v16 = -3;
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setFeatureMask((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v17)._filterContext();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new byte[]{Byte.valueOf((byte)39),Byte.valueOf((byte)-27)};
    Object v19 = "TokenFilter.INCLUDE_ALL";
    ((com.fasterxml.jackson.core.JsonParser)v17).setRequestPayloadOnError(((byte[])v18),((java.lang.String)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).getInputSource();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v17));
    Object v19 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v18));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setCurrentValue(((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v22 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v23 = ((java.lang.Enum)v22).hashCode();
    Object v24 = false;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v21).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v22),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v25).getTextCharacters();
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v17));
    Object v19 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v18));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setCurrentValue(((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v22 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v21).isClosed();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v16 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v15).getCurrentLocation();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v17));
    Object v19 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v18));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setCurrentValue(((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v22 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v21).getBigIntegerValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v18 = ((java.lang.Enum)v17).hashCode();
    Object v19 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v17).currentTokenId();
    Object v19 = 1L;
    Object v20 = ((com.fasterxml.jackson.core.JsonParser)v17).nextLongValue((((java.lang.Long)v19).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).nextBooleanValue();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v16 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v15).skipChildren();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v18 = ((java.lang.Enum)v17).hashCode();
    Object v19 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v19).nextToken();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v16).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v17));
    Object v19 = com.fasterxml.jackson.core.filter.TokenFilterContext.createRootContext(((com.fasterxml.jackson.core.filter.TokenFilter)v18));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).setCurrentValue(((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v22 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v23 = ((java.lang.Enum)v22).hashCode();
    Object v24 = false;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v21).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v22),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v25).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.filter.JsonPointerBasedFilter(((com.fasterxml.jackson.core.JsonPointer)v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14).skipChildren();
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v15).hasTextCharacters();
    Object v17 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v18 = "Invalid input: JSON Pointer expression mst start with '/': \"";
    ((com.fasterxml.jackson.core.JsonParser)v15).setRequestPayloadOnError(((byte[])v17),((java.lang.String)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }
}
