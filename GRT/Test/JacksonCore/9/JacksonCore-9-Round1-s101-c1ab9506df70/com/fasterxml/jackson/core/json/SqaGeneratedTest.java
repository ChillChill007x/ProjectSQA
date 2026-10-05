package com.fasterxml.jackson.core.json;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v13).getValueAsLong();
    org.junit.Assert.assertEquals((Object)(0L), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).getBinaryValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    ((com.fasterxml.jackson.core.base.ParserBase)v13).close();
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v13).getCurrentName();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v13).getDoubleValue();
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
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).getBooleanValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v13).getValueAsBoolean((((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v13).getText();
    Object v15 = ((com.fasterxml.jackson.core.base.ParserBase)v13).getLongValue();
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
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).getByteValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v13).getBigIntegerValue();
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
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v13).getNumberType();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v13).getNumberValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "  ";
    ((com.fasterxml.jackson.core.base.ParserBase)v13).overrideCurrentName(((java.lang.String)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v13).getDecimalValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v13).getIntValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).loadMore();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = -9;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._parseName((((java.lang.Integer)v16).intValue()));
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
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._finishString();
    Object v16 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._decodeEscaped();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 32;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._decodeCharForError((((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertEquals((Object)(32), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v13)._getByteArrayBuilder();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 5;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).parseMediumName((((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserBase)v13).getLongValue();
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
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getTextCharacters();
    Object v17 = -58;
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._handleOddName((((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 1;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v13).hasTokenId((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = -20;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).setFeatureMask((((java.lang.Integer)v16).intValue()));
    Object v18 = -21;
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._handleOddName((((java.lang.Integer)v18).intValue()));
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
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 3;
    Object v17 = 16;
    Object v18 = 0;
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).parseLongName((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getValueAsString();
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).nextTextValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).nextFieldName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 0.0D;
    Object v15 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v13).getValueAsDouble((((java.lang.Double)v14).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getInputSource();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).hasToken(((com.fasterxml.jackson.core.JsonToken)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 5;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getValueAsInt((((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertEquals((Object)(5), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).slowParseName();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = -64;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v15).setFeatureMask((((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v19 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v20 = true;
    Object v21 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v18),((java.lang.Object)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = -2;
    Object v23 = "NaN";
    Object v24 = new java.io.StringReader(((java.lang.String)v23));
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v27 = new char[]{};
    Object v28 = -13;
    Object v29 = 1;
    Object v30 = false;
    Object v31 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v21),(((java.lang.Integer)v22).intValue()),((java.io.Reader)v24),((com.fasterxml.jackson.core.ObjectCodec)v25),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v26),((char[])v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = ((com.fasterxml.jackson.core.base.ParserBase)v31)._getByteArrayBuilder();
    Object v33 = ((com.fasterxml.jackson.core.JsonParser)v15).readBinaryValue(((java.io.OutputStream)v32));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new int[]{16};
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(((int[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getNumberValue();
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
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = 0;
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17).parseMediumName((((java.lang.Integer)v18).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = -35L;
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17).nextLongValue((((java.lang.Long)v18).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 56;
    Object v17 = 0;
    Object v18 = 11;
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).parseLongName((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).hasToken(((com.fasterxml.jackson.core.JsonToken)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v17 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v18 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v19 = true;
    Object v20 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v17),((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -2;
    Object v22 = "NaN";
    Object v23 = new java.io.StringReader(((java.lang.String)v22));
    Object v24 = null;
    Object v25 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v26 = new char[]{};
    Object v27 = -13;
    Object v28 = 1;
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v20),(((java.lang.Integer)v21).intValue()),((java.io.Reader)v23),((com.fasterxml.jackson.core.ObjectCodec)v24),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v25),((char[])v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = ((com.fasterxml.jackson.core.base.ParserBase)v30)._getByteArrayBuilder();
    Object v32 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)-128),Byte.valueOf((byte)1)};
    Object v33 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._readBinary(((com.fasterxml.jackson.core.Base64Variant)v16),((java.io.OutputStream)v31),((byte[])v32));
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
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = 1;
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17).nextIntValue((((java.lang.Integer)v18).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v19 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v20 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v21 = true;
    Object v22 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v19),((java.lang.Object)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = -2;
    Object v24 = "NaN";
    Object v25 = new java.io.StringReader(((java.lang.String)v24));
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v28 = new char[]{};
    Object v29 = -13;
    Object v30 = 1;
    Object v31 = false;
    Object v32 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v22),(((java.lang.Integer)v23).intValue()),((java.io.Reader)v25),((com.fasterxml.jackson.core.ObjectCodec)v26),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v27),((char[])v28),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = ((com.fasterxml.jackson.core.base.ParserBase)v32)._getByteArrayBuilder();
    Object v34 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17).readBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v18),((java.io.OutputStream)v33));
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
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v13).getShortValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v13).isExpectedStartObjectToken();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = -18;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._parsePosNumber((((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = -57L;
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17).nextLongValue((((java.lang.Long)v18).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17).getText();
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17)._skipString();
    Object v19 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v17 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v18 = true;
    Object v19 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v16),((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = -2;
    Object v21 = "NaN";
    Object v22 = new java.io.StringReader(((java.lang.String)v21));
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v25 = new char[]{};
    Object v26 = -13;
    Object v27 = 1;
    Object v28 = false;
    Object v29 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v19),(((java.lang.Integer)v20).intValue()),((java.io.Reader)v22),((com.fasterxml.jackson.core.ObjectCodec)v23),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v24),((char[])v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = ((com.fasterxml.jackson.core.base.ParserBase)v29)._getByteArrayBuilder();
    Object v31 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).releaseBuffered(((java.io.OutputStream)v30));
    org.junit.Assert.assertEquals((Object)(0), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).getValueAsInt();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = ((com.fasterxml.jackson.core.base.ParserBase)v17).isClosed();
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = -15;
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17)._handleInvalidNumberStart((((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v17).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v17).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v18));
    Object v20 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19)._finishAndReturnString();
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
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17)._handleApos();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(((int[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v13).close();
    Object v14 = null;
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v13).clearCurrentToken();
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v17).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v18));
    Object v20 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v19).getValueAsLong();
    Object v21 = 29;
    Object v22 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19)._parsePosNumber((((java.lang.Integer)v21).intValue()));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17)._finishAndReturnString();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = 0L;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).getValueAsLong((((java.lang.Long)v18).longValue()));
    Object v20 = -15;
    Object v21 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17)._decodeCharForError((((java.lang.Integer)v20).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v17 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v18 = true;
    Object v19 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v16),((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = 4;
    Object v21 = new byte[]{};
    Object v22 = -38;
    Object v23 = 48;
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v27 = new byte[]{};
    Object v28 = 8;
    Object v29 = 1;
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v19),(((java.lang.Integer)v20).intValue()),((java.io.InputStream)v24),((com.fasterxml.jackson.core.ObjectCodec)v25),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v26),((byte[])v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = -18;
    Object v33 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v31)._parsePosNumber((((java.lang.Integer)v32).intValue()));
    Object v34 = ((java.lang.Enum)v33).getDeclaringClass();
    Object v35 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._getText2(((com.fasterxml.jackson.core.JsonToken)v33));
    org.junit.Assert.assertEquals((Object)(""), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getTextLength();
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v17).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v18));
    Object v20 = 0;
    Object v21 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19)._parsePosNumber((((java.lang.Integer)v20).intValue()));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v17).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v18));
    Object v20 = "tre";
    Object v21 = "7";
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19)._reportInvalidToken(((java.lang.String)v20),((java.lang.String)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = 51;
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17)._parsePosNumber((((java.lang.Integer)v18).intValue()));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = 3;
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17)._handleOddName((((java.lang.Integer)v18).intValue()));
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
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17)._decodeBase64(((com.fasterxml.jackson.core.Base64Variant)v18));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
    Object v19 = "#";
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17)._reportInvalidToken(((java.lang.String)v18),((java.lang.String)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v15).getBooleanValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = 1;
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17).getValueAsInt((((java.lang.Integer)v18).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v17).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v18));
    Object v20 = -1;
    Object v21 = 1;
    Object v22 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19).parseMediumName2((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = ((com.fasterxml.jackson.core.base.ParserBase)v17)._getByteArrayBuilder();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 19;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._handleUnexpectedValue((((java.lang.Integer)v16).intValue()));
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
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v17).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v18));
    Object v20 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v19).nextValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = ") as c";
    Object v19 = 0;
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17)._matchToken(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -2;
    Object v5 = "NaN";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v9 = new char[]{};
    Object v10 = -13;
    Object v11 = 1;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v6),((com.fasterxml.jackson.core.ObjectCodec)v7),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v8),((char[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v13).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17)._decodeEscaped();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).getValueAsLong();
    org.junit.Assert.assertEquals((Object)(0L), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v17).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v18));
    Object v20 = 28;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19)._handleInvalidNumberStart((((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
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
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17)._parseAposName();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).getValueAsBoolean((((java.lang.Boolean)v18).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v17).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v18));
    Object v20 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v21 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v22 = true;
    Object v23 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v20),((java.lang.Object)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = 4;
    Object v25 = new byte[]{};
    Object v26 = -38;
    Object v27 = 48;
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = null;
    Object v30 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v31 = new byte[]{};
    Object v32 = 8;
    Object v33 = 1;
    Object v34 = true;
    Object v35 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v23),(((java.lang.Integer)v24).intValue()),((java.io.InputStream)v28),((com.fasterxml.jackson.core.ObjectCodec)v29),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v30),((byte[])v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v37 = ((com.fasterxml.jackson.core.base.ParserBase)v35).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v36));
    Object v38 = ((com.fasterxml.jackson.core.base.ParserBase)v37)._getByteArrayBuilder();
    Object v39 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19).releaseBuffered(((java.io.OutputStream)v38));
    org.junit.Assert.assertEquals((Object)(0), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17)._finishString();
    Object v18 = null;
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
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17).getCurrentLocation();
    Object v19 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v20 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17)._decodeBase64(((com.fasterxml.jackson.core.Base64Variant)v19));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v17).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v18));
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19)._closeInput();
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = "write  number";
    Object v19 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v18));
    Object v20 = new byte[]{};
    Object v21 = 1;
    Object v22 = ((com.fasterxml.jackson.core.SerializableString)v19).appendUnquotedUTF8(((byte[])v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ": expected close marker for ";
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getValueAsString(((java.lang.String)v16));
    org.junit.Assert.assertEquals((Object)(": expected close marker for "), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = -5L;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).getValueAsLong((((java.lang.Long)v18).longValue()));
    org.junit.Assert.assertEquals((Object)(-5L), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = 0L;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).getValueAsLong((((java.lang.Long)v18).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v17).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v18));
    Object v20 = ((com.fasterxml.jackson.core.base.ParserBase)v19).getFloatValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).clearCurrentToken();
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = 0;
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17)._handleUnexpectedValue((((java.lang.Integer)v18).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ") as character#";
    ((com.fasterxml.jackson.core.base.ParserBase)v15).overrideCurrentName(((java.lang.String)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v17).nextToken();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = 1;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v17).setFeatureMask((((java.lang.Integer)v18).intValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 4;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{};
    Object v12 = 8;
    Object v13 = 1;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v16));
    Object v18 = 1;
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v17).setFeatureMask((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19)._parseNegNumber();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }
}
