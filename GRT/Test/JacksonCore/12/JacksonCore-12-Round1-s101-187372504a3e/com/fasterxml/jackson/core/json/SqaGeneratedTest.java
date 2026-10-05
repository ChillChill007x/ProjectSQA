package com.fasterxml.jackson.core.json;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15)._getByteArrayBuilder();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = -1;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).hasTokenId((((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).nextTextValue();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getIntValue();
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
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getValueAsString();
    Object v17 = 22;
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._loadToHaveAtLeast((((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._decodeEscaped();
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
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v17 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v18 = true;
    Object v19 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v16),((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = -16;
    Object v21 = new byte[]{};
    Object v22 = -38;
    Object v23 = 48;
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v27 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v28 = 0;
    Object v29 = 0;
    Object v30 = false;
    Object v31 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v19),(((java.lang.Integer)v20).intValue()),((java.io.InputStream)v24),((com.fasterxml.jackson.core.ObjectCodec)v25),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v26),((byte[])v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = ((com.fasterxml.jackson.core.base.ParserBase)v31)._getByteArrayBuilder();
    Object v33 = ((com.fasterxml.jackson.core.JsonParser)v15).readBinaryValue(((java.io.OutputStream)v32));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._finishString();
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = -30;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserBase)v15).setFeatureMask((((java.lang.Integer)v16).intValue()));
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._releaseBuffers();
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getValueAsString();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v15).getCurrentValue();
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getTextLength();
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).nextBooleanValue();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "alse";
    Object v17 = "Internal error on Symb";
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._reportInvalidToken(((java.lang.String)v16),((java.lang.String)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 3;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._handleOddName((((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getText();
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).nextFieldName();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).clearCurrentToken();
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getText();
    Object v17 = -4.290613189711397D;
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsDouble((((java.lang.Double)v17).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-4.290613189711397D), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).nextValue();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).hasTextCharacters();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 39;
    Object v17 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._parseName((((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).isExpectedStartObjectToken();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = "write a Hstring";
    Object v21 = 1;
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19)._matchToken(((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v22 = null;
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
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.JsonParser)v19).readValueAs(((java.lang.Class)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = ((com.fasterxml.jackson.core.base.ParserBase)v19).getDoubleValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v21 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v22 = true;
    Object v23 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v20),((java.lang.Object)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = -16;
    Object v25 = new byte[]{};
    Object v26 = -38;
    Object v27 = 48;
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = null;
    Object v30 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v31 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v32 = 0;
    Object v33 = 0;
    Object v34 = false;
    Object v35 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v23),(((java.lang.Integer)v24).intValue()),((java.io.InputStream)v28),((com.fasterxml.jackson.core.ObjectCodec)v29),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v30),((byte[])v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = ((com.fasterxml.jackson.core.base.ParserBase)v35)._getByteArrayBuilder();
    Object v37 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19).releaseBuffered(((java.io.OutputStream)v36));
    org.junit.Assert.assertEquals((Object)(0), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19).nextBooleanValue();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserBase)v15).getDecimalValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.JsonParser)v22).getSchema();
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserBase)v22)._getByteArrayBuilder();
    Object v24 = 0L;
    Object v25 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v22).nextLongValue((((java.lang.Long)v24).longValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v22).nextFieldName();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19).getValueAsString();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19)._handleApos();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 0.8807735288911642D;
    Object v17 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsDouble((((java.lang.Double)v16).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.8807735288911642D), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).nextValue();
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
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19).nextTextValue();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v22).getCurrentLocation();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
    Object v24 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).hasToken(((com.fasterxml.jackson.core.JsonToken)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).getCurrentLocation();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = false;
    Object v24 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).getValueAsBoolean((((java.lang.Boolean)v23).booleanValue()));
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v22).getValueAsBoolean((((java.lang.Boolean)v25).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v22)._skipCR();
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v25).nextToken();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v25)._releaseBuffers();
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19)._finishAndReturnString();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v25).getValueAsBoolean((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
    Object v29 = -42;
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v25)._matchToken(((java.lang.String)v28),(((java.lang.Integer)v29).intValue()));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = -29;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19)._handleInvalidNumberStart((((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = 0;
    Object v27 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v25).getValueAsInt((((java.lang.Integer)v26).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.fasterxml.jackson.core.JsonParser)v25).getByteValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = 0;
    Object v21 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19).parseMediumName((((java.lang.Integer)v20).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = -35;
    Object v24 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v22).nextIntValue((((java.lang.Integer)v23).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 56;
    Object v17 = 0;
    Object v18 = 11;
    Object v19 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15).parseLongName((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = 2L;
    Object v21 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v19).getValueAsLong((((java.lang.Long)v20).longValue()));
    org.junit.Assert.assertEquals((Object)(2L), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v24 = ((com.fasterxml.jackson.core.base.ParserBase)v22).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v22).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v24 = ((com.fasterxml.jackson.core.base.ParserBase)v22).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v23));
    Object v25 = ((com.fasterxml.jackson.core.base.ParserBase)v24).getTokenColumnNr();
    org.junit.Assert.assertEquals((Object)(1), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = ((com.fasterxml.jackson.core.base.ParserBase)v19).getNumberValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v22)._finishAndReturnString();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v24 = ((com.fasterxml.jackson.core.base.ParserBase)v22).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v23));
    Object v25 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v24).getTextOffset();
    Object v26 = ((com.fasterxml.jackson.core.base.ParserBase)v24).getDoubleValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v24 = ((com.fasterxml.jackson.core.base.ParserBase)v22).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v23));
    Object v25 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v24).getValueAsInt();
    Object v26 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v24).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v22).getTokenLocation();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19)._decodeEscaped();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v24 = ((com.fasterxml.jackson.core.base.ParserBase)v22).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v23));
    Object v25 = ((com.fasterxml.jackson.core.base.ParserBase)v24).getCurrentName();
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v17 = new byte[]{};
    Object v18 = false;
    Object v19 = ((com.fasterxml.jackson.core.Base64Variant)v16).encode(((byte[])v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._decodeBase64(((com.fasterxml.jackson.core.Base64Variant)v16));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = "STRICT_DUPLICATE_DETECTION";
    Object v27 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v25).getValueAsString(((java.lang.String)v26));
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v25)._closeInput();
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v24 = ((com.fasterxml.jackson.core.base.ParserBase)v22).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v23));
    Object v25 = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
    Object v26 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v24).hasToken(((com.fasterxml.jackson.core.JsonToken)v25));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v22).slowParseName();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v25).getTextCharacters();
    Object v27 = 32;
    Object v28 = 0;
    Object v29 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v25).parseMediumName2((((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = 1;
    Object v27 = false;
    Object v28 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v25)._handleInvalidNumberStart((((java.lang.Integer)v26).intValue()),(((java.lang.Boolean)v27).booleanValue()));
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
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsLong();
    Object v17 = -18;
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v15)._reportInvalidChar((((java.lang.Integer)v17).intValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v25)._parseAposName();
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v25).clearCurrentToken();
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v28 = ((java.lang.Enum)v27).getDeclaringClass();
    Object v29 = ((com.fasterxml.jackson.core.base.ParserBase)v25).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v27));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v25).getValueAsLong();
    org.junit.Assert.assertEquals((Object)(0L), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v25).clearCurrentToken();
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v28 = ((java.lang.Enum)v27).getDeclaringClass();
    Object v29 = ((com.fasterxml.jackson.core.base.ParserBase)v25).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v27));
    Object v30 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v31 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v29)._decodeBase64(((com.fasterxml.jackson.core.Base64Variant)v30));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = 0;
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19)._reportInvalidChar((((java.lang.Integer)v20).intValue()));
    Object v21 = null;
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
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v25)._skipString();
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = "true";
    Object v21 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v21));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v24 = ((com.fasterxml.jackson.core.base.ParserBase)v22).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v23));
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v24).getShortValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v25).getTextLength();
    org.junit.Assert.assertEquals((Object)(0), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = "flse";
    ((com.fasterxml.jackson.core.base.ParserBase)v25).overrideCurrentName(((java.lang.String)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.ParserBase)v22).getCurrentLocation();
    Object v24 = ((com.fasterxml.jackson.core.base.ParserBase)v22).hasTextCharacters();
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v25).clearCurrentToken();
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v28 = ((java.lang.Enum)v27).getDeclaringClass();
    Object v29 = ((com.fasterxml.jackson.core.base.ParserBase)v25).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v27));
    Object v30 = 7.514880124612269D;
    Object v31 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v29).getValueAsDouble((((java.lang.Double)v30).doubleValue()));
    org.junit.Assert.assertEquals((Object)(7.514880124612269D), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = ((com.fasterxml.jackson.core.base.ParserBase)v19).getTokenColumnNr();
    org.junit.Assert.assertEquals((Object)(1), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v25).clearCurrentToken();
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v28 = ((java.lang.Enum)v27).getDeclaringClass();
    Object v29 = ((com.fasterxml.jackson.core.base.ParserBase)v25).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v27));
    Object v30 = 0;
    Object v31 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v29).hasTokenId((((java.lang.Integer)v30).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = 9;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v22)._handleInvalidNumberStart((((java.lang.Integer)v23).intValue()),(((java.lang.Boolean)v24).booleanValue()));
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
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v24 = ((com.fasterxml.jackson.core.base.ParserBase)v22).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v23));
    Object v25 = ((com.fasterxml.jackson.core.base.ParserBase)v24).getIntValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v24 = ((com.fasterxml.jackson.core.base.ParserBase)v22).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v23));
    Object v25 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v24).getTokenLocation();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v24 = ((com.fasterxml.jackson.core.base.ParserBase)v22).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v23));
    Object v25 = -16;
    Object v26 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v24)._parseName((((java.lang.Integer)v25).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = 32;
    Object v21 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19).getValueAsInt((((java.lang.Integer)v20).intValue()));
    Object v22 = 0;
    Object v23 = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v19)._handleOddName((((java.lang.Integer)v22).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.fasterxml.jackson.core.base.ParserBase)v25)._getByteArrayBuilder();
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v24 = ((com.fasterxml.jackson.core.base.ParserBase)v22).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v23));
    Object v25 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v24).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v25).clearCurrentToken();
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v28 = ((java.lang.Enum)v27).getDeclaringClass();
    Object v29 = ((com.fasterxml.jackson.core.base.ParserBase)v25).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v27));
    ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser)v29)._releaseBuffers();
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = ((com.fasterxml.jackson.core.base.ParserBase)v19).getNumberType();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v22).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v23),(((java.lang.Boolean)v24).booleanValue()));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v25).clearCurrentToken();
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v28 = ((java.lang.Enum)v27).getDeclaringClass();
    Object v29 = ((com.fasterxml.jackson.core.base.ParserBase)v25).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v27));
    Object v30 = ((com.fasterxml.jackson.core.base.ParserBase)v29).getLongValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v24 = ((com.fasterxml.jackson.core.base.ParserBase)v22).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v23));
    Object v25 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v24).getTextOffset();
    Object v26 = " bltes";
    ((com.fasterxml.jackson.core.base.ParserBase)v24).overrideCurrentName(((java.lang.String)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -16;
    Object v5 = new byte[]{};
    Object v6 = -38;
    Object v7 = 48;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
    Object v11 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.InputStream)v8),((com.fasterxml.jackson.core.ObjectCodec)v9),((com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)v10),((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v15).getValueAsInt();
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserBase)v15).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonParser)v19).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.JsonParser)v22).isClosed();
    Object v24 = ((com.fasterxml.jackson.core.JsonParser)v22).requiresCustomCodec();
    org.junit.Assert.assertEquals((Object)(false), v24);
  }
}
