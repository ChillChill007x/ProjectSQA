package com.fasterxml.jackson.core.json;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v24 = ((java.lang.Enum)v23).hashCode();
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v25).booleanValue()));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v24 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v22)._decodeBase64(((com.fasterxml.jackson.core.Base64Variant)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = 0;
    Object v25 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v23).getValueAsInt((((java.lang.Integer)v24).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = 61;
    Object v24 = ((com.fasterxml.jackson.core.base.ParserBase)v22).setFeatureMask((((java.lang.Integer)v23).intValue()));
    ((com.fasterxml.jackson.core.base.ParserBase)v22).close();
    Object v25 = null;
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
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v23).getValueAsBoolean((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v27 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v23)._decodeBase64(((com.fasterxml.jackson.core.Base64Variant)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).isExpectedStartObjectToken();
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = 0.0D;
    Object v25 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v23).getValueAsDouble((((java.lang.Double)v24).doubleValue()));
    Object v26 = 5;
    Object v27 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v23)._handleOddName((((java.lang.Integer)v26).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = ((com.fasterxml.jackson.core.base.ParserBase)v23).getTokenColumnNr();
    org.junit.Assert.assertEquals((Object)(1), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = 1;
    Object v24 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).hasTokenId((((java.lang.Integer)v23).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = ") as characterz#";
    Object v25 = 14;
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v23)._matchToken(((java.lang.String)v24),(((java.lang.Integer)v25).intValue()));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = -14;
    Object v25 = ((com.fasterxml.jackson.core.base.ParserBase)v23).setFeatureMask((((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.fasterxml.jackson.core.base.ParserBase)v23).hasTextCharacters();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v23)._closeInput();
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = ((com.fasterxml.jackson.core.JsonParser)v23).getByteValue();
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
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v23).nextTextValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = -35L;
    Object v25 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v23).getValueAsLong((((java.lang.Long)v24).longValue()));
    org.junit.Assert.assertEquals((Object)(-35L), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v23)._parseNegNumber();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = ((com.fasterxml.jackson.core.base.ParserBase)v23).getCurrentLocation();
    Object v25 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v23).getTextLength();
    org.junit.Assert.assertEquals((Object)(0), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = "Curret token (";
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v23).overrideCurrentName(((java.lang.String)v24));
    Object v25 = null;
    Object v26 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v23).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = "was expecting comma to separate ";
    Object v24 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v22).getValueAsString(((java.lang.String)v23));
    org.junit.Assert.assertEquals((Object)("was expecting comma to separate "), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v24 = ((java.lang.Enum)v23).hashCode();
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
    Object v28 = ((java.lang.Enum)v27).getDeclaringClass();
    Object v29 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v26).hasToken(((com.fasterxml.jackson.core.JsonToken)v27));
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = ((com.fasterxml.jackson.core.base.ParserBase)v23)._getByteArrayBuilder();
    Object v25 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v23)._handleApos();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).getValueAsInt();
    org.junit.Assert.assertEquals((Object)(0), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).getValueAsInt();
    Object v24 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v22)._parseName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = -60;
    Object v28 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v26)._parsePosNumber((((java.lang.Integer)v27).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v26).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = " of 4-char base64 unit: can only used between units";
    ((com.fasterxml.jackson.core.base.ParserBase)v26).overrideCurrentName(((java.lang.String)v27));
    Object v28 = null;
    Object v29 = ((com.fasterxml.jackson.core.base.ParserBase)v26).getDoubleValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v26).getValueAsString();
    Object v28 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v26).nextValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v26).getTextCharacters();
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v23).getTextCharacters();
    Object v25 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v23).nextValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v23).loadMore();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v28 = new com.fasterxml.jackson.core.util.ByteArrayBuilder();
    Object v29 = new byte[]{};
    Object v30 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v26)._readBinary(((com.fasterxml.jackson.core.Base64Variant)v27),((java.io.OutputStream)v28),((byte[])v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = 3;
    Object v24 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v22)._parsePosNumber((((java.lang.Integer)v23).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.base.ParserBase)v26).getParsingContext();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v23).getValueAsBoolean((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v23).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v26)._parseAposName();
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
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v23)._skipString();
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v26)._handleApos();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = "Non-standard token 'NaN': enaSle JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
    Object v28 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v26).getValueAsString(((java.lang.String)v27));
    org.junit.Assert.assertEquals((Object)("Non-standard token 'NaN': enaSle JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = -12;
    Object v28 = ((com.fasterxml.jackson.core.JsonParser)v26).setFeatureMask((((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.fasterxml.jackson.core.JsonParser)v26).getValueAsBoolean();
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v26).getValueAsLong();
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v26).clearCurrentToken();
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v23)._finishString();
    Object v24 = null;
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
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.base.ParserBase)v26).getNumberValue();
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
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.JsonParser)v26).readValueAsTree();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = ((com.fasterxml.jackson.core.base.ParserBase)v23)._getByteArrayBuilder();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v26).nextToken();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 34;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).setFeatureMask((((java.lang.Integer)v27).intValue()));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 34;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).setFeatureMask((((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v28).getTextLength();
    Object v30 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v28).getValueAsInt();
    org.junit.Assert.assertEquals((Object)(0), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 34;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).setFeatureMask((((java.lang.Integer)v27).intValue()));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v28).clearCurrentToken();
    Object v29 = null;
    Object v30 = ((com.fasterxml.jackson.core.base.ParserBase)v28).getTokenColumnNr();
    org.junit.Assert.assertEquals((Object)(1), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    ((com.fasterxml.jackson.core.base.ParserBase)v26).close();
    Object v27 = null;
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
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v26)._skipCR();
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = "g";
    Object v28 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v26).getNextChar(((java.lang.String)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v26).getTextLength();
    org.junit.Assert.assertEquals((Object)(0), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 0;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v26).hasTokenId((((java.lang.Integer)v27).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.base.ParserBase)v26).getLongValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
    Object v28 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v26)._getText2(((com.fasterxml.jackson.core.JsonToken)v27));
    org.junit.Assert.assertEquals((Object)("null"), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 34;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).setFeatureMask((((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v28).getTextOffset();
    Object v30 = ((com.fasterxml.jackson.core.base.ParserBase)v28).getNumberValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = "Numeric value (";
    Object v25 = "null";
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v23)._reportInvalidToken(((java.lang.String)v24),((java.lang.String)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v27));
    Object v29 = ((com.fasterxml.jackson.core.base.ParserBase)v28).hasTextCharacters();
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 34;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).setFeatureMask((((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.fasterxml.jackson.core.base.ParserBase)v28).getDecimalValue();
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
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 34;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).setFeatureMask((((java.lang.Integer)v27).intValue()));
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v28)._finishString();
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 34;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).setFeatureMask((((java.lang.Integer)v27).intValue()));
    Object v29 = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
    Object v30 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v28).hasToken(((com.fasterxml.jackson.core.JsonToken)v29));
    org.junit.Assert.assertEquals((Object)(false), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v26).skipChildren();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 34;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).setFeatureMask((((java.lang.Integer)v27).intValue()));
    Object v29 = 1;
    Object v30 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v28).nextIntValue((((java.lang.Integer)v29).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 34;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).setFeatureMask((((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v28).getValueAsInt();
    Object v30 = ((com.fasterxml.jackson.core.base.ParserBase)v28).getIntValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.JsonParser)v26).getBooleanValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v27));
    Object v29 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v30 = ((com.fasterxml.jackson.core.base.ParserBase)v28).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v29));
    Object v31 = "Non-standard token '";
    Object v32 = "write a strin(";
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v28)._reportInvalidToken(((java.lang.String)v31),((java.lang.String)v32));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v26).isExpectedStartObjectToken();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 34;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).setFeatureMask((((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.fasterxml.jackson.core.JsonParser)v28).getTokenLocation();
    Object v30 = 18;
    Object v31 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v28).hasTokenId((((java.lang.Integer)v30).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.base.ParserBase)v26)._getByteArrayBuilder();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v26).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.base.ParserBase)v26).getCurrentName();
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 1;
    Object v28 = ((com.fasterxml.jackson.core.JsonParser)v26).setFeatureMask((((java.lang.Integer)v27).intValue()));
    Object v29 = false;
    Object v30 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v26).getValueAsBoolean((((java.lang.Boolean)v29).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v26).skipChildren();
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v27).getTokenLocation();
    Object v29 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v27).getText();
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v26).skipChildren();
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v27)._skipCR();
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v27));
    Object v29 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v28).nextBooleanValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -17;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)0)};
    Object v19 = -26;
    Object v20 = 1;
    Object v21 = true;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v26).skipChildren();
    Object v28 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v27).getValueAsLong();
    org.junit.Assert.assertEquals((Object)(0L), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v27));
    Object v29 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v28)._decodeEscaped();
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
    Object v4 = -17;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)0)};
    Object v19 = -26;
    Object v20 = 1;
    Object v21 = true;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserBase)v22).getDecimalValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v27));
    Object v29 = "null";
    ((com.fasterxml.jackson.core.base.ParserBase)v28).overrideCurrentName(((java.lang.String)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v27));
    Object v29 = ((com.fasterxml.jackson.core.base.ParserBase)v28).getIntValue();
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
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v26)._closeInput();
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.core.JsonParser)v26).getCurrentValue();
    Object v28 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v26).isExpectedStartObjectToken();
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v27));
    Object v29 = ((com.fasterxml.jackson.core.base.ParserBase)v28).getLongValue();
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
    Object v4 = -17;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)0)};
    Object v19 = -26;
    Object v20 = 1;
    Object v21 = true;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v22)._finishString();
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 34;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).setFeatureMask((((java.lang.Integer)v27).intValue()));
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v28)._releaseBuffers();
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 34;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).setFeatureMask((((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v28).getValueAsLong();
    Object v30 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v28).getTextCharacters();
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v27));
    Object v29 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v28).nextToken();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 34;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).setFeatureMask((((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v28).getValueAsLong();
    org.junit.Assert.assertEquals((Object)(0L), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 34;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).setFeatureMask((((java.lang.Integer)v27).intValue()));
    Object v29 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v30 = ((com.fasterxml.jackson.core.base.ParserBase)v28).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v26).clearCurrentToken();
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -17;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)0)};
    Object v19 = -26;
    Object v20 = 1;
    Object v21 = true;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).nextValue();
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
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v27));
    Object v29 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v28)._parseNegNumber();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = -31L;
    Object v28 = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v26).nextLongValue((((java.lang.Long)v27).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v12 = 17;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 21;
    Object v20 = -17;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v15),((com.fasterxml.jackson.core.ObjectCodec)v16),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v17),((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).skipChildren();
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v23).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 34;
    Object v28 = ((com.fasterxml.jackson.core.base.ParserBase)v26).setFeatureMask((((java.lang.Integer)v27).intValue()));
    ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser)v28)._skipString();
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
