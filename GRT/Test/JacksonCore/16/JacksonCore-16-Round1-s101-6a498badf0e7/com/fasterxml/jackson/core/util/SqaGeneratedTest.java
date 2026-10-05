package com.fasterxml.jackson.core.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getLastClearedToken();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).nextTextValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v14),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = 9;
    Object v19 = java.io.Reader.nullReader();
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v22 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = true;
    Object v26 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v17),(((java.lang.Integer)v18).intValue()),((java.io.Reader)v19),((com.fasterxml.jackson.core.ObjectCodec)v20),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v21),((char[])v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v26));
    Object v28 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.core.JsonParser)v27));
    Object v29 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v28).isExpectedStartObjectToken();
    Object v30 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v31 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v32 = java.util.List.of(((java.lang.Object)v30),((java.lang.Object)v31));
    ((com.fasterxml.jackson.core.util.JsonParserSequence)v28).addFlattenedActiveParsers(((java.util.List)v32));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v14),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = 9;
    Object v19 = java.io.Reader.nullReader();
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v22 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = true;
    Object v26 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v17),(((java.lang.Integer)v18).intValue()),((java.io.Reader)v19),((com.fasterxml.jackson.core.ObjectCodec)v20),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v21),((char[])v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v26));
    Object v28 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.core.JsonParser)v27));
    Object v29 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v30 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v31 = java.util.List.of(((java.lang.Object)v29),((java.lang.Object)v30));
    ((com.fasterxml.jackson.core.util.JsonParserSequence)v28).addFlattenedActiveParsers(((java.util.List)v31));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = 1.0D;
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getValueAsDouble((((java.lang.Double)v14).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v14),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = 9;
    Object v19 = java.io.Reader.nullReader();
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v22 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = true;
    Object v26 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v17),(((java.lang.Integer)v18).intValue()),((java.io.Reader)v19),((com.fasterxml.jackson.core.ObjectCodec)v20),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v21),((char[])v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v26));
    Object v28 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.core.JsonParser)v27));
    Object v29 = ((com.fasterxml.jackson.core.util.JsonParserSequence)v28).nextToken();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).skipChildren();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).skipChildren();
    Object v15 = "write a nu<mber";
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).getValueAsString(((java.lang.String)v15));
    org.junit.Assert.assertEquals((Object)("write a nu<mber"), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = ")";
    Object v17 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v13).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getTextOffset();
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getCurrentLocation();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v14),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = 9;
    Object v19 = java.io.Reader.nullReader();
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v22 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = true;
    Object v26 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v17),(((java.lang.Integer)v18).intValue()),((java.io.Reader)v19),((com.fasterxml.jackson.core.ObjectCodec)v20),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v21),((char[])v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v26));
    Object v28 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.core.JsonParser)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 69L;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v16).nextLongValue((((java.lang.Long)v17).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v14),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = 9;
    Object v19 = java.io.Reader.nullReader();
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v22 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = true;
    Object v26 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v17),(((java.lang.Integer)v18).intValue()),((java.io.Reader)v19),((com.fasterxml.jackson.core.ObjectCodec)v20),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v21),((char[])v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v26));
    Object v28 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.core.JsonParser)v27));
    ((com.fasterxml.jackson.core.util.JsonParserSequence)v28).close();
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = 1;
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v13).nextIntValue((((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).nextBooleanValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getParsingContext();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = true;
    Object v16 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v13),((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 9;
    Object v18 = java.io.Reader.nullReader();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v21 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = true;
    Object v25 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v16),(((java.lang.Integer)v17).intValue()),((java.io.Reader)v18),((com.fasterxml.jackson.core.ObjectCodec)v19),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v20),((char[])v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v25));
    Object v27 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.core.JsonParser)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).getText();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = new byte[]{Byte.valueOf((byte)44)};
    Object v15 = "Broken surrogate pair: first char 0x";
    ((com.fasterxml.jackson.core.JsonParser)v13).setRequestPayloadOnError(((byte[])v14),((java.lang.String)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v17 = new byte[]{Byte.valueOf((byte)20),Byte.valueOf((byte)34)};
    Object v18 = "': was expecting ";
    ((com.fasterxml.jackson.core.JsonParser)v16).setRequestPayloadOnError(((byte[])v17),((java.lang.String)v18));
    Object v19 = null;
    Object v20 = ((com.fasterxml.jackson.core.JsonParser)v16).getFormatFeatures();
    org.junit.Assert.assertEquals((Object)(0), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v17 = 0L;
    Object v18 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).getValueAsLong((((java.lang.Long)v17).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = true;
    Object v16 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v13),((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 9;
    Object v18 = java.io.Reader.nullReader();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v21 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = true;
    Object v25 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v16),(((java.lang.Integer)v17).intValue()),((java.io.Reader)v18),((com.fasterxml.jackson.core.ObjectCodec)v19),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v20),((char[])v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v25));
    Object v27 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.core.JsonParser)v26));
    Object v28 = ((com.fasterxml.jackson.core.util.JsonParserSequence)v27).switchToNext();
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getValueAsBoolean();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = true;
    Object v16 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v13),((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 9;
    Object v18 = java.io.Reader.nullReader();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v21 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = true;
    Object v25 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v16),(((java.lang.Integer)v17).intValue()),((java.io.Reader)v18),((com.fasterxml.jackson.core.ObjectCodec)v19),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v20),((char[])v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v25));
    Object v27 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.core.JsonParser)v26));
    Object v28 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v29 = true;
    Object v30 = ((com.fasterxml.jackson.core.JsonParser)v27).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = ((com.fasterxml.jackson.core.util.JsonParserSequence)v27).switchToNext();
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = "true";
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getValueAsString(((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getCurrentName();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).nextValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = java.io.Writer.nullWriter();
    Object v15 = "Une)pected character (";
    ((java.io.Writer)v14).write(((java.lang.String)v15));
    Object v16 = null;
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getText(((java.io.Writer)v14));
    org.junit.Assert.assertEquals((Object)(0), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getValueAsLong();
    org.junit.Assert.assertEquals((Object)(0L), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v16).nextFieldName();
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
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = true;
    Object v16 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v13),((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 9;
    Object v18 = java.io.Reader.nullReader();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v21 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = true;
    Object v25 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v16),(((java.lang.Integer)v17).intValue()),((java.io.Reader)v18),((com.fasterxml.jackson.core.ObjectCodec)v19),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v20),((char[])v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v25));
    Object v27 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.core.JsonParser)v26));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v27).clearCurrentToken();
    Object v28 = null;
    Object v29 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v30 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v31 = java.util.List.of(((java.lang.Object)v29),((java.lang.Object)v30));
    ((com.fasterxml.jackson.core.util.JsonParserSequence)v27).addFlattenedActiveParsers(((java.util.List)v31));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).hasToken(((com.fasterxml.jackson.core.JsonToken)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v14),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = 9;
    Object v19 = java.io.Reader.nullReader();
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v22 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = true;
    Object v26 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v17),(((java.lang.Integer)v18).intValue()),((java.io.Reader)v19),((com.fasterxml.jackson.core.ObjectCodec)v20),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v21),((char[])v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v26));
    Object v28 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v27).skipChildren();
    Object v29 = "write a nu<mber";
    Object v30 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v28).getValueAsString(((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.core.util.RequestPayload(((java.lang.CharSequence)v30));
    ((com.fasterxml.jackson.core.JsonParser)v13).setRequestPayloadOnError(((com.fasterxml.jackson.core.util.RequestPayload)v31));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = java.io.OutputStream.nullOutputStream();
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v13).readBinaryValue(((java.io.OutputStream)v14));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).getBinaryValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = " entrieB";
    ((com.fasterxml.jackson.core.JsonParser)v16).setRequestPayloadOnError(((java.lang.String)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = true;
    Object v16 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v13),((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 9;
    Object v18 = java.io.Reader.nullReader();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v21 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = true;
    Object v25 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v16),(((java.lang.Integer)v17).intValue()),((java.io.Reader)v18),((com.fasterxml.jackson.core.ObjectCodec)v19),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v20),((char[])v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v25));
    Object v27 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.core.JsonParser)v26));
    Object v28 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v27).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).hasToken(((com.fasterxml.jackson.core.JsonToken)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = 25;
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).hasTokenId((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v17 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)-35)};
    Object v18 = ((com.fasterxml.jackson.core.Base64Variant)v16).encode(((byte[])v17));
    Object v19 = java.io.OutputStream.nullOutputStream();
    Object v20 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).readBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v16),((java.io.OutputStream)v19));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).clearCurrentToken();
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 0;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v16).nextIntValue((((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).isClosed();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = true;
    Object v16 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v13),((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 9;
    Object v18 = java.io.Reader.nullReader();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v21 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = true;
    Object v25 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v16),(((java.lang.Integer)v17).intValue()),((java.io.Reader)v18),((com.fasterxml.jackson.core.ObjectCodec)v19),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v20),((char[])v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v25));
    Object v27 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.core.JsonParser)v26));
    ((com.fasterxml.jackson.core.util.JsonParserSequence)v27).close();
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v16).nextFieldName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).skipChildren();
    Object v15 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).hasToken(((com.fasterxml.jackson.core.JsonToken)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).getValueAsLong();
    org.junit.Assert.assertEquals((Object)(0L), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = true;
    Object v16 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v13),((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 9;
    Object v18 = java.io.Reader.nullReader();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v21 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = true;
    Object v25 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v16),(((java.lang.Integer)v17).intValue()),((java.io.Reader)v18),((com.fasterxml.jackson.core.ObjectCodec)v19),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v20),((char[])v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v25));
    Object v27 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.core.JsonParser)v26));
    Object v28 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v29 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v27).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v28));
    Object v30 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v31 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v32 = java.util.List.of(((java.lang.Object)v30),((java.lang.Object)v31));
    ((com.fasterxml.jackson.core.util.JsonParserSequence)v27).addFlattenedActiveParsers(((java.util.List)v32));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v14),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = 9;
    Object v19 = java.io.Reader.nullReader();
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v22 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = true;
    Object v26 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v17),(((java.lang.Integer)v18).intValue()),((java.io.Reader)v19),((com.fasterxml.jackson.core.ObjectCodec)v20),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v21),((char[])v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v26));
    Object v28 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.core.JsonParser)v27));
    Object v29 = ((com.fasterxml.jackson.core.util.JsonParserSequence)v28).switchToNext();
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = -23.206238036575563D;
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getValueAsDouble((((java.lang.Double)v14).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-23.206238036575563D), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).getByteValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 1;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v16).nextIntValue((((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v16).getValueAsString();
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v16).getFormatFeatures();
    org.junit.Assert.assertEquals((Object)(0), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getText();
    Object v15 = java.io.Writer.nullWriter();
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getText(((java.io.Writer)v15));
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v17 = "name";
    ((com.fasterxml.jackson.core.JsonParser)v16).setRequestPayloadOnError(((java.lang.String)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "write a boolean valuS";
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).overrideCurrentName(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).getBigIntegerValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getCodec();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).skipChildren();
    Object v15 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v16 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v17 = true;
    Object v18 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v15),((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = 9;
    Object v20 = java.io.Reader.nullReader();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v23 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = true;
    Object v27 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v18),(((java.lang.Integer)v19).intValue()),((java.io.Reader)v20),((com.fasterxml.jackson.core.ObjectCodec)v21),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v22),((char[])v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v27));
    Object v29 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v30 = false;
    Object v31 = ((com.fasterxml.jackson.core.JsonParser)v28).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.core.JsonParser)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v17 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v18 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).getBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v17));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).getValueAsBoolean();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = java.io.Writer.nullWriter();
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getText(((java.io.Writer)v14));
    Object v16 = "Broken surrogate pair: irst char 0x";
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).overrideCurrentName(((java.lang.String)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).readValueAsTree();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).getCurrentLocation();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).skipChildren();
    Object v15 = "write a string";
    ((com.fasterxml.jackson.core.JsonParser)v14).setRequestPayloadOnError(((java.lang.String)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).currentTokenId();
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v13).nextBooleanValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ")";
    Object v15 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.core.SerializableString)v15).getValue();
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v13).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = "UTF16]_LE";
    ((com.fasterxml.jackson.core.JsonParser)v13).overrideCurrentName(((java.lang.String)v14));
    Object v15 = null;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).readValueAsTree();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v18 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).getCurrentValue();
    Object v18 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).getShortValue();
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
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).nextValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).skipChildren();
    Object v15 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v16 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v17 = true;
    Object v18 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v15),((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = 9;
    Object v20 = java.io.Reader.nullReader();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v23 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = true;
    Object v27 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v18),(((java.lang.Integer)v19).intValue()),((java.io.Reader)v20),((com.fasterxml.jackson.core.ObjectCodec)v21),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v22),((char[])v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v27));
    Object v29 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v30 = false;
    Object v31 = ((com.fasterxml.jackson.core.JsonParser)v28).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.core.JsonParser)v31));
    Object v33 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v32).getTextCharacters();
    Object v34 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v32).getTextLength();
    org.junit.Assert.assertEquals((Object)(0), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getCurrentToken();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).hasToken(((com.fasterxml.jackson.core.JsonToken)v14));
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getInputSource();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).skipChildren();
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v14).getCurrentLocation();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).currentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getTextOffset();
    org.junit.Assert.assertEquals((Object)(0), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = 0.0D;
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getValueAsDouble((((java.lang.Double)v14).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ")";
    Object v15 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v14));
    Object v16 = 1;
    Object v17 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.core.SerializableString)v15).putQuotedUTF8(((java.nio.ByteBuffer)v17));
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v13).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    ((com.fasterxml.jackson.core.JsonParser)v13).clearCurrentToken();
    Object v14 = null;
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v13).getBinaryValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v18 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v19 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v18).isClosed();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).skipChildren();
    Object v15 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v16 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v17 = true;
    Object v18 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v15),((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = 9;
    Object v20 = java.io.Reader.nullReader();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v23 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = true;
    Object v27 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v18),(((java.lang.Integer)v19).intValue()),((java.io.Reader)v20),((com.fasterxml.jackson.core.ObjectCodec)v21),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v22),((char[])v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v27));
    Object v29 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v30 = false;
    Object v31 = ((com.fasterxml.jackson.core.JsonParser)v28).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.core.JsonParser)v31));
    Object v33 = ((com.fasterxml.jackson.core.util.JsonParserSequence)v32).nextToken();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v16).nextBooleanValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).skipChildren();
    Object v15 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v16 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v17 = true;
    Object v18 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v15),((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = 9;
    Object v20 = java.io.Reader.nullReader();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v23 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = true;
    Object v27 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v18),(((java.lang.Integer)v19).intValue()),((java.io.Reader)v20),((com.fasterxml.jackson.core.ObjectCodec)v21),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v22),((char[])v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v27));
    Object v29 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v30 = false;
    Object v31 = ((com.fasterxml.jackson.core.JsonParser)v28).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.core.JsonParser)v31));
    Object v33 = -69;
    Object v34 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v32).setFeatureMask((((java.lang.Integer)v33).intValue()));
    ((com.fasterxml.jackson.core.util.JsonParserSequence)v32).close();
    Object v35 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v18 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v17));
    Object v19 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v18).currentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).getTokenLocation();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v14),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = 9;
    Object v19 = java.io.Reader.nullReader();
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v22 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = true;
    Object v26 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v17),(((java.lang.Integer)v18).intValue()),((java.io.Reader)v19),((com.fasterxml.jackson.core.ObjectCodec)v20),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v21),((char[])v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v26));
    Object v28 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v27).hasCurrentToken();
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).setCurrentValue(((java.lang.Object)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).skipChildren();
    Object v15 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v16 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v17 = true;
    Object v18 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v15),((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = 9;
    Object v20 = java.io.Reader.nullReader();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v23 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = true;
    Object v27 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v18),(((java.lang.Integer)v19).intValue()),((java.io.Reader)v20),((com.fasterxml.jackson.core.ObjectCodec)v21),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v22),((char[])v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v27));
    Object v29 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v30 = false;
    Object v31 = ((com.fasterxml.jackson.core.JsonParser)v28).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.core.JsonParser)v31));
    Object v33 = ((com.fasterxml.jackson.core.util.JsonParserSequence)v32).switchToNext();
    org.junit.Assert.assertEquals((Object)(true), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = java.io.OutputStream.nullOutputStream();
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v13).releaseBuffered(((java.io.OutputStream)v14));
    org.junit.Assert.assertEquals((Object)(-1), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).getTypeId();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).skipChildren();
    Object v15 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v16 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v17 = true;
    Object v18 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v15),((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = 9;
    Object v20 = java.io.Reader.nullReader();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v23 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = true;
    Object v27 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v18),(((java.lang.Integer)v19).intValue()),((java.io.Reader)v20),((com.fasterxml.jackson.core.ObjectCodec)v21),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v22),((char[])v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v27));
    Object v29 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.core.JsonParser)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v18 = false;
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v16).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v17),(((java.lang.Boolean)v18).booleanValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v18 = false;
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v16).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v19).getTokenLocation();
    Object v21 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v19).getText();
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v16).nextBooleanValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v17 = java.io.Writer.nullWriter();
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v16).releaseBuffered(((java.io.Writer)v17));
    org.junit.Assert.assertEquals((Object)(-1), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v13).skipChildren();
    Object v15 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v16 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v17 = true;
    Object v18 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v15),((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = 9;
    Object v20 = java.io.Reader.nullReader();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v23 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = true;
    Object v27 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v18),(((java.lang.Integer)v19).intValue()),((java.io.Reader)v20),((com.fasterxml.jackson.core.ObjectCodec)v21),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v22),((char[])v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v27));
    Object v29 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v30 = false;
    Object v31 = ((com.fasterxml.jackson.core.JsonParser)v28).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.core.JsonParser)v31));
    ((com.fasterxml.jackson.core.util.JsonParserSequence)v32).close();
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v16).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 9;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v8 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((java.io.Reader)v5),((com.fasterxml.jackson.core.ObjectCodec)v6),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v7),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = java.io.OutputStream.nullOutputStream();
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v16).releaseBuffered(((java.io.OutputStream)v17));
    org.junit.Assert.assertEquals((Object)(-1), v18);
  }
}
