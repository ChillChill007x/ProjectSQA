package com.fasterxml.jackson.core.base;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getTextCharacters();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getShortValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).getCurrentValue();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = 1L;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsLong((((java.lang.Long)v10).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getNumberType();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getParsingContext();
    Object v11 = ")";
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).overrideCurrentName(((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = "b)";
    Object v11 = new java.io.StringReader(((java.lang.String)v10));
    ((com.fasterxml.jackson.core.JsonParser)v9).setCurrentValue(((java.lang.Object)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getEmbeddedObject();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getTokenLocation();
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).nextTextValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsInt();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getBooleanValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getTextLength();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9)._handleEOF();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getDecimalValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.core.base.ParserMinimalBase._getCharDesc((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("(CTRL-CHAR, code 0)"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsString();
    Object v11 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getTextLength();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = 1;
    Object v11 = "";
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9)._reportUnexpectedChar((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getTokenLocation();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = "write a st?ring";
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).overrideCurrentName(((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).version();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = "n";
    Object v11 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v11));
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
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = 16L;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).nextLongValue((((java.lang.Long)v10).longValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = 1;
    Object v11 = "8";
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9)._reportUnexpectedChar((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).version();
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).clearCurrentToken();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getFloatValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v10));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).close();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = "b)";
    Object v14 = new java.io.StringReader(((java.lang.String)v13));
    ((com.fasterxml.jackson.core.JsonParser)v12).setCurrentValue(((java.lang.Object)v14));
    Object v15 = null;
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).isClosed();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v12).version();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 22;
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).hasTokenId((((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = -32;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).nextIntValue((((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getCurrentName();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).nextToken();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v12).getCurrentLocation();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).isExpectedStartObjectToken();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getIntValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = Character.valueOf((char)0);
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12)._handleUnrecognizedCharacterEscape((((java.lang.Character)v13).charValue()));
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
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v12).getShortValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).nextValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 51.7829768498588D;
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getValueAsDouble((((java.lang.Double)v13).doubleValue()));
    Object v15 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).hasToken(((com.fasterxml.jackson.core.JsonToken)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = "}";
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getValueAsString(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)("}"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getValueAsLong();
    org.junit.Assert.assertEquals((Object)(0L), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v12).getText();
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v12).getNumberType();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v12).nextBooleanValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getValueAsString();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 4;
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v12).nextIntValue((((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v12).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v12).getCurrentValue();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getBinaryValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "D";
    Object v1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getTextCharacters();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = -11;
    Object v1 = com.fasterxml.jackson.core.base.ParserMinimalBase._getCharDesc((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("'\ufff5' (code -11)"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 5L;
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getValueAsLong((((java.lang.Long)v13).longValue()));
    Object v15 = "FULL_MaATCH";
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getValueAsString(((java.lang.String)v15));
    org.junit.Assert.assertEquals((Object)("FULL_MaATCH"), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).skipChildren();
    Object v14 = 1;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getValueAsInt((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v12).getNumberType();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "FIELD_NAME";
    Object v1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getValueAsInt();
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getTextCharacters();
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = true;
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getValueAsBoolean((((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = 1.0D;
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getValueAsDouble((((java.lang.Double)v11).doubleValue()));
    Object v13 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
    Object v14 = ((java.lang.Enum)v13).getDeclaringClass();
    Object v15 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).hasToken(((com.fasterxml.jackson.core.JsonToken)v13));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getValueAsLong();
    org.junit.Assert.assertEquals((Object)(0L), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v12).getBigIntegerValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v11 = ((java.lang.Enum)v10).hashCode();
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v11 = ((java.lang.Enum)v10).hashCode();
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v13).isClosed();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v12).getTypeId();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 1L;
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v12).nextLongValue((((java.lang.Long)v13).longValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v11 = ((java.lang.Enum)v10).hashCode();
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).nextTextValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v10).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v11 = ((java.lang.Enum)v10).hashCode();
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).getDoubleValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v11 = ((java.lang.Enum)v10).hashCode();
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v13).getText();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v12).getFloatValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getCodec();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v11 = ((java.lang.Enum)v10).hashCode();
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).skipChildren();
    Object v15 = 1;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).nextIntValue((((java.lang.Integer)v15).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v12).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v12).getObjectId();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).hasToken(((com.fasterxml.jackson.core.JsonToken)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = "n";
    Object v12 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v10).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v11 = ((java.lang.Enum)v10).hashCode();
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v13).getCurrentName();
    Object v15 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v13).getValueAsString();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).hasToken(((com.fasterxml.jackson.core.JsonToken)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v11 = ((java.lang.Enum)v10).hashCode();
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).getNumberValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v12).getCurrentValue();
    Object v14 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v15 = "0";
    Object v16 = 0;
    Object v17 = new com.fasterxml.jackson.core.util.ByteArrayBuilder((((java.lang.Integer)v16).intValue()));
    ((com.fasterxml.jackson.core.Base64Variant)v14).decode(((java.lang.String)v15),((com.fasterxml.jackson.core.util.ByteArrayBuilder)v17));
    Object v18 = null;
    Object v19 = Character.valueOf((char)63);
    Object v20 = 0;
    Object v21 = "No digit following minus";
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12)._reportInvalidBase64(((com.fasterxml.jackson.core.Base64Variant)v14),(((java.lang.Character)v19).charValue()),(((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getTextLength();
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = Character.valueOf((char)1);
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10)._handleUnrecognizedCharacterEscape((((java.lang.Character)v11).charValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getByteValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10)._throwInternal();
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).nextBooleanValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v12).getLastClearedToken();
    Object v14 = 1;
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v12).nextIntValue((((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v11 = ((java.lang.Enum)v10).hashCode();
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v12).booleanValue()));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v13).clearCurrentToken();
    Object v14 = null;
    Object v15 = "') as ch.aracter #";
    Object v16 = "nul";
    Object v17 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v18 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v19 = true;
    Object v20 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v17),((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = 50;
    Object v22 = "b)";
    Object v23 = new java.io.StringReader(((java.lang.String)v22));
    Object v24 = null;
    Object v25 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v26 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v20),(((java.lang.Integer)v21).intValue()),((java.io.Reader)v23),((com.fasterxml.jackson.core.ObjectCodec)v24),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v25));
    Object v27 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v28 = false;
    Object v29 = ((com.fasterxml.jackson.core.JsonParser)v26).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = ((com.fasterxml.jackson.core.JsonParser)v29).getCurrentLocation();
    Object v31 = new com.fasterxml.jackson.core.JsonParseException(((java.lang.String)v16),((com.fasterxml.jackson.core.JsonLocation)v30));
    Object v32 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v13)._constructError(((java.lang.String)v15),((java.lang.Throwable)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getParsingContext();
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v10).nextBooleanValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getTokenLocation();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v11 = ((java.lang.Enum)v10).hashCode();
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = -23L;
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v13).nextLongValue((((java.lang.Long)v14).longValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = 1.0D;
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getValueAsDouble((((java.lang.Double)v11).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v14 = "tru";
    Object v15 = new java.lang.StringBuilder(((java.lang.String)v14));
    Object v16 = 8;
    ((com.fasterxml.jackson.core.Base64Variant)v13).encodeBase64Chunk(((java.lang.StringBuilder)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = Character.valueOf((char)1);
    Object v19 = -17;
    Object v20 = "'";
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12)._reportInvalidBase64(((com.fasterxml.jackson.core.Base64Variant)v13),(((java.lang.Character)v18).charValue()),(((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).skipChildren();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).skipChildren();
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).getValueAsLong();
    org.junit.Assert.assertEquals((Object)(0L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 50;
    Object v5 = "b)";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).hasTextCharacters();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }
}
