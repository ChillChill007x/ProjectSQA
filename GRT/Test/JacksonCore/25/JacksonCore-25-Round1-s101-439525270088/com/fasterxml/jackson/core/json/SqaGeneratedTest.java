package com.fasterxml.jackson.core.json;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserBase)v6).getLongValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 0;
    Object v15 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v13)._handleOddValue((((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).getBooleanValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserBase)v6).getNumberValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v15 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v13).getBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v14));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = 0;
    Object v17 = true;
    Object v18 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15)._handleInvalidNumberStart((((java.lang.Integer)v16).intValue()),(((java.lang.Boolean)v17).booleanValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v13).nextBooleanValue();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getCurrentValue();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 1;
    Object v15 = 16;
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v13).overrideStdFeatures((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v13)._finishString2();
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).nextValue();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15)._loadMoreGuaranteed();
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15).finishToken();
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getDoubleValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allw";
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsString(((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsLong();
    org.junit.Assert.assertEquals((Object)(0L), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getTokenColumnNr();
    org.junit.Assert.assertEquals((Object)(1), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).getShortValue();
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
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = 33;
    Object v17 = 26;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v15).overrideFormatFeatures((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = 0;
    Object v17 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15).nextIntValue((((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = 0.0D;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsDouble((((java.lang.Double)v16).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15).getTextLength();
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v13).hasToken(((com.fasterxml.jackson.core.JsonToken)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v13).nextBooleanValue();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15)._finishString();
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = "Expecte space separating root-level values";
    Object v17 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
    Object v18 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15).getNextChar(((java.lang.String)v16),((com.fasterxml.jackson.core.JsonToken)v17));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
    Object v17 = ((java.lang.Enum)v16).getDeclaringClass();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).hasToken(((com.fasterxml.jackson.core.JsonToken)v16));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15)._finishString2();
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15)._skipString();
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    ((com.fasterxml.jackson.core.base.ParserBase)v15).close();
    Object v16 = null;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getCurrentName();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsBoolean((((java.lang.Boolean)v16).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v6 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).nextToken();
    Object v8 = 3L;
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getValueAsLong((((java.lang.Long)v8).longValue()));
    org.junit.Assert.assertEquals((Object)(3L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = "was expecting comma to separate ";
    Object v19 = 1;
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15)._matchToken(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15).finishToken();
    Object v16 = null;
    Object v17 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15).getTextCharacters();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = false;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsBoolean((((java.lang.Boolean)v16).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
    Object v17 = ((java.lang.Enum)v16).hashCode();
    Object v18 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15)._getText2(((com.fasterxml.jackson.core.JsonToken)v16));
    org.junit.Assert.assertEquals((Object)(""), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = -4L;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsLong((((java.lang.Long)v16).longValue()));
    org.junit.Assert.assertEquals((Object)(-4L), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).nextValue();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = "Leading zeroes not allowed";
    Object v17 = "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15)._reportInvalidToken(((java.lang.String)v16),((java.lang.String)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 1L;
    Object v15 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v13).nextLongValue((((java.lang.Long)v14).longValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = java.io.Writer.nullWriter();
    ((java.io.Writer)v16).close();
    Object v17 = null;
    Object v18 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15).getText(((java.io.Writer)v16));
    org.junit.Assert.assertEquals((Object)(0), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v17 = true;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v15).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getBigIntegerValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v15).currentName();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15).getValueAsString();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v16).getText();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v16).isExpectedStartObjectToken();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v16).getBigIntegerValue();
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
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).overrideFormatFeatures((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = "Numeric value (%s) out of range of int (%d - %s)";
    ((com.fasterxml.jackson.core.base.ParserBase)v16).overrideCurrentName(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v16).getValueAsString();
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v16).getValueAsLong();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserBase)v16).getIntValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v16).skipChildren();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = new byte[]{};
    Object v17 = "";
    ((com.fasterxml.jackson.core.JsonParser)v15).setRequestPayloadOnError(((byte[])v16),((java.lang.String)v17));
    Object v18 = null;
    Object v19 = "expected a value";
    Object v20 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15).getValueAsString(((java.lang.String)v19));
    org.junit.Assert.assertEquals((Object)("expected a value"), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v16).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v16).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v17)._parseName();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = -21L;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsLong((((java.lang.Long)v16).longValue()));
    Object v18 = 6;
    Object v19 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15)._handleOddName((((java.lang.Integer)v18).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = "Internal error: TypeReference constructed without actual type information";
    Object v17 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
    Object v18 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15).getNextChar(((java.lang.String)v16),((com.fasterxml.jackson.core.JsonToken)v17));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v17 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v18 = true;
    Object v19 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v16),((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = -7;
    Object v21 = "b)";
    Object v22 = new java.io.StringReader(((java.lang.String)v21));
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v25 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v26 = 2;
    Object v27 = 5;
    Object v28 = false;
    Object v29 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v19),(((java.lang.Integer)v20).intValue()),((java.io.Reader)v22),((com.fasterxml.jackson.core.ObjectCodec)v23),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v24),((char[])v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v31 = ((com.fasterxml.jackson.core.base.ParserBase)v29).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v30));
    Object v32 = new byte[]{};
    Object v33 = "";
    ((com.fasterxml.jackson.core.JsonParser)v31).setRequestPayloadOnError(((byte[])v32),((java.lang.String)v33));
    Object v34 = null;
    Object v35 = "expected a value";
    Object v36 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v31).getValueAsString(((java.lang.String)v35));
    Object v37 = new com.fasterxml.jackson.core.util.RequestPayload(((java.lang.CharSequence)v36));
    ((com.fasterxml.jackson.core.JsonParser)v15).setRequestPayloadOnError(((com.fasterxml.jackson.core.util.RequestPayload)v37));
    Object v38 = null;
    Object v39 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getBigIntegerValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = 1;
    Object v18 = 26;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v16).overrideStdFeatures((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15)._loadMore();
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v16).skipChildren();
    Object v18 = "Failed to decode VALUE_STRING as bse64 (";
    ((com.fasterxml.jackson.core.JsonParser)v17).setRequestPayloadOnError(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = 83;
    Object v21 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).getValueAsInt((((java.lang.Integer)v20).intValue()));
    org.junit.Assert.assertEquals((Object)(83), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v16).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v17).nextFieldName();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v16).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserBase)v17).isNaN();
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = 1;
    Object v18 = 26;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v16).overrideStdFeatures((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ")";
    ((com.fasterxml.jackson.core.base.ParserBase)v19).overrideCurrentName(((java.lang.String)v20));
    Object v21 = null;
    Object v22 = "'";
    Object v23 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v19).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v23));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v16).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v17).getValueAsString();
    Object v19 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v17)._parseAposName();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v16).skipChildren();
    Object v18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v17).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v18));
    Object v20 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v17).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v16)._closeInput();
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = 1;
    Object v18 = 26;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v16).overrideStdFeatures((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = 1L;
    Object v21 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v19).getValueAsLong((((java.lang.Long)v20).longValue()));
    Object v22 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v19)._loadMore();
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v17 = java.io.OutputStream.nullOutputStream();
    Object v18 = new byte[]{Byte.valueOf((byte)-20)};
    Object v19 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15)._readBinary(((com.fasterxml.jackson.core.Base64Variant)v16),((java.io.OutputStream)v17),((byte[])v18));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v16).skipChildren();
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v17)._closeInput();
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = 1;
    Object v18 = 26;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v16).overrideStdFeatures((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v19).getText();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v16).isNaN();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v16).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserBase)v17).getNumberType();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v16).getValueAsInt();
    org.junit.Assert.assertEquals((Object)(0), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v16)._parseName();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = 1;
    Object v18 = 26;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v16).overrideStdFeatures((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = true;
    Object v21 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v19).getValueAsBoolean((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v19).getText();
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v16).skipChildren();
    Object v18 = "Decimal pont not followed by a digit";
    ((com.fasterxml.jackson.core.base.ParserBase)v17).overrideCurrentName(((java.lang.String)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).hasTextCharacters();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15).finishToken();
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v16).nextValue();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = 1;
    Object v18 = ((com.fasterxml.jackson.core.base.ParserBase)v16).setFeatureMask((((java.lang.Integer)v17).intValue()));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = 1;
    Object v18 = ((com.fasterxml.jackson.core.base.ParserBase)v16).setFeatureMask((((java.lang.Integer)v17).intValue()));
    Object v19 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v20 = ((com.fasterxml.jackson.core.JsonParser)v18).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v19));
    Object v21 = ((com.fasterxml.jackson.core.JsonParser)v18).getBooleanValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    ((com.fasterxml.jackson.core.JsonParser)v16).clearCurrentToken();
    Object v17 = null;
    Object v18 = "('true', 'false' or 'null')";
    ((com.fasterxml.jackson.core.JsonParser)v16).setRequestPayloadOnError(((java.lang.String)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = 1;
    Object v18 = ((com.fasterxml.jackson.core.base.ParserBase)v16).setFeatureMask((((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v18).getText();
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v16).getNumberType();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v16).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).getValueAsInt();
    org.junit.Assert.assertEquals((Object)(0), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
    Object v17 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15)._getText2(((com.fasterxml.jackson.core.JsonToken)v16));
    org.junit.Assert.assertEquals((Object)("["), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = 1;
    Object v18 = 26;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v16).overrideStdFeatures((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = java.io.Writer.nullWriter();
    Object v21 = ")";
    ((java.io.Writer)v20).write(((java.lang.String)v21));
    Object v22 = null;
    Object v23 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v19).releaseBuffered(((java.io.Writer)v20));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = "string value";
    Object v18 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
    Object v19 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v16).getNextChar(((java.lang.String)v17),((com.fasterxml.jackson.core.JsonToken)v18));
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
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v16)._finishString();
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v16).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v17).currentName();
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = 1;
    Object v18 = ((com.fasterxml.jackson.core.base.ParserBase)v16).setFeatureMask((((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v18).nextFieldName();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = 1;
    Object v18 = 26;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v16).overrideStdFeatures((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = 192.0D;
    Object v21 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v19).getValueAsDouble((((java.lang.Double)v20).doubleValue()));
    org.junit.Assert.assertEquals((Object)(192.0D), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = 1;
    Object v18 = ((com.fasterxml.jackson.core.base.ParserBase)v16).setFeatureMask((((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v18).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = 1;
    Object v18 = ((com.fasterxml.jackson.core.base.ParserBase)v16).setFeatureMask((((java.lang.Integer)v17).intValue()));
    Object v19 = 32L;
    Object v20 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v18).nextLongValue((((java.lang.Long)v19).longValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v16)._parseNegNumber();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).skipChildren();
    Object v17 = 1;
    Object v18 = ((com.fasterxml.jackson.core.base.ParserBase)v16).setFeatureMask((((java.lang.Integer)v17).intValue()));
    Object v19 = "char[C";
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v18).overrideCurrentName(((java.lang.String)v19));
    Object v20 = null;
    Object v21 = 0;
    Object v22 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v18).getValueAsInt((((java.lang.Integer)v21).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -7;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{Character.valueOf((char)98),Character.valueOf((char)41)};
    Object v10 = 2;
    Object v11 = 5;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v17 = true;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v15).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = "g";
    Object v20 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v15).getValueAsString(((java.lang.String)v19));
    org.junit.Assert.assertEquals((Object)("g"), v20);
  }
}
