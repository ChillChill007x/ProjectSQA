package com.fasterxml.jackson.core;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeObject(((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeStartArray();
    Object v11 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeNull();
    Object v11 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = "Invalid nVumeric value: ";
    Object v12 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v11));
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeString(((com.fasterxml.jackson.core.SerializableString)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -57L;
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeNumber((((java.lang.Long)v11).longValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v12 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v13 = 1;
    Object v14 = 3;
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v11),((byte[])v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v15 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = "";
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeFieldName(((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = "Unrecognized token '";
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeRaw(((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = java.io.Writer.nullWriter();
    ((com.fasterxml.jackson.core.JsonGenerator)v7)._writeSimpleObject(((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v12).flush();
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = "Invalid nVumeric value: ";
    Object v14 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v13));
    ((com.fasterxml.jackson.core.JsonGenerator)v12)._writeSimpleObject(((java.lang.Object)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = " ";
    Object v14 = 2;
    Object v15 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeRawValue(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 1;
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeNumber((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = "Invalid nVumeric value: ";
    Object v14 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v13));
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeFieldName(((com.fasterxml.jackson.core.SerializableString)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeObjectId(((java.lang.Object)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = 32;
    Object v12 = 4;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0.0F;
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeNumber((((java.lang.Float)v14).floatValue()));
    Object v15 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = true;
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeBoolean((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    ((com.fasterxml.jackson.core.JsonGenerator)v7)._writeSimpleObject(((java.lang.Object)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = "write a numb";
    Object v14 = -24;
    Object v15 = 255;
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeRaw(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v14).close();
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = "strin\\g value";
    Object v14 = new byte[]{};
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeBinaryField(((java.lang.String)v13),((byte[])v14));
    Object v15 = null;
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeStartArray();
    Object v16 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = " in a value";
    Object v14 = 1;
    Object v15 = -4;
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeRawValue(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = "AUTO_CLOSE_JSON_COXNTENT";
    Object v12 = 1L;
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeNumberField(((java.lang.String)v11),(((java.lang.Long)v12).longValue()));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).version();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = new double[]{};
    Object v12 = 0;
    Object v13 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeArray(((double[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = new double[]{-25.119117008067295D};
    Object v16 = -64;
    Object v17 = 13;
    ((com.fasterxml.jackson.core.JsonGenerator)v14).writeArray(((double[])v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v14 = 4;
    Object v15 = -9;
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeString(((char[])v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = new byte[]{Byte.valueOf((byte)-88),Byte.valueOf((byte)-11)};
    Object v14 = 25;
    Object v15 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeUTF8String(((byte[])v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v13).getFeatureMask();
    Object v15 = ((com.fasterxml.jackson.core.JsonGenerator)v13).version();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = "";
    Object v14 = 0;
    Object v15 = -31;
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeRaw(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v13).writeEndObject();
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v13).close();
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "Invalid nVumeric value: ";
    Object v15 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v14));
    ((com.fasterxml.jackson.core.JsonGenerator)v13).writeString(((com.fasterxml.jackson.core.SerializableString)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = -50.26665038312493D;
    ((com.fasterxml.jackson.core.JsonGenerator)v14).writeNumber((((java.lang.Double)v15).doubleValue()));
    Object v16 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new char[]{Character.valueOf((char)0),Character.valueOf((char)5),Character.valueOf((char)1)};
    Object v15 = 35;
    Object v16 = 93;
    ((com.fasterxml.jackson.core.JsonGenerator)v13).writeRaw(((char[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = "Invalid nVumeric value: ";
    Object v16 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v15));
    ((com.fasterxml.jackson.core.JsonGenerator)v14).writeObjectRef(((java.lang.Object)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = ")H ";
    ((com.fasterxml.jackson.core.JsonGenerator)v14).writeArrayFieldStart(((java.lang.String)v15));
    Object v16 = null;
    Object v17 = new long[]{0L,-21L,0L};
    Object v18 = 1;
    Object v19 = 28;
    ((com.fasterxml.jackson.core.JsonGenerator)v14).writeArray(((long[])v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.core.JsonGenerator)v14).getHighestEscapedChar();
    org.junit.Assert.assertEquals((Object)(0), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = "Invalid nVumeric value: ";
    Object v16 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v15));
    ((com.fasterxml.jackson.core.JsonGenerator)v14).writeFieldName(((com.fasterxml.jackson.core.SerializableString)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = "Invalid nVumeric value: ";
    Object v9 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v8));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeString(((com.fasterxml.jackson.core.SerializableString)v9));
    Object v10 = null;
    Object v11 = ", by";
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeString(((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.core.JsonGenerator)v14).getFeatureMask();
    Object v16 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    ((com.fasterxml.jackson.core.JsonGenerator)v14).writeEmbeddedObject(((java.lang.Object)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = false;
    Object v16 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v13),((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 49;
    Object v18 = null;
    Object v19 = java.io.Writer.nullWriter();
    Object v20 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v16),(((java.lang.Integer)v17).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v18),((java.io.Writer)v19));
    ((com.fasterxml.jackson.core.JsonGenerator)v20).writeStartObject();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v23 = ((com.fasterxml.jackson.core.JsonGenerator)v20).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v22));
    Object v24 = -36;
    Object v25 = ((com.fasterxml.jackson.core.JsonGenerator)v23).setFeatureMask((((java.lang.Integer)v24).intValue()));
    Object v26 = 5;
    Object v27 = ((com.fasterxml.jackson.core.JsonGenerator)v25).setFeatureMask((((java.lang.Integer)v26).intValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v12).setCurrentValue(((java.lang.Object)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v15 = 49;
    Object v16 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v13).writeRaw(((char[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = Character.valueOf((char)1);
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeRaw((((java.lang.Character)v13).charValue()));
    Object v14 = null;
    Object v15 = "Invalid nVumeric value: ";
    Object v16 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v15));
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeObject(((java.lang.Object)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = null;
    Object v15 = ((com.fasterxml.jackson.core.JsonGenerator)v13).setCodec(((com.fasterxml.jackson.core.ObjectCodec)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v15 = ((com.fasterxml.jackson.core.JsonGenerator)v13).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = false;
    Object v17 = ((com.fasterxml.jackson.core.JsonGenerator)v14).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = 0;
    Object v16 = ((com.fasterxml.jackson.core.JsonGenerator)v14).setHighestNonEscapedChar((((java.lang.Integer)v15).intValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = null;
    Object v15 = ((com.fasterxml.jackson.core.JsonGenerator)v13).setCodec(((com.fasterxml.jackson.core.ObjectCodec)v14));
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeStartObject();
    Object v16 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v15 = ((com.fasterxml.jackson.core.JsonGenerator)v13).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.JsonGenerator)v15).getCodec();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v15 = ((com.fasterxml.jackson.core.JsonGenerator)v13).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v16 = new com.fasterxml.jackson.core.util.BufferRecycler();
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeObject(((java.lang.Object)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v14).writeNull();
    Object v15 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = "Invalid nVumeric value: ";
    Object v14 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v13));
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeString(((com.fasterxml.jackson.core.SerializableString)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setHighestNonEscapedChar((((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setHighestNonEscapedChar((((java.lang.Integer)v13).intValue()));
    Object v15 = "': enable JsonParer.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
    Object v16 = false;
    ((com.fasterxml.jackson.core.JsonGenerator)v14).writeBooleanField(((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    Object v18 = java.io.Writer.nullWriter();
    ((com.fasterxml.jackson.core.JsonGenerator)v14)._writeSimpleObject(((java.lang.Object)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "'";
    ((com.fasterxml.jackson.core.JsonGenerator)v13).writeObjectFieldStart(((java.lang.String)v14));
    Object v15 = null;
    Object v16 = 127.0D;
    ((com.fasterxml.jackson.core.JsonGenerator)v13).writeNumber((((java.lang.Double)v16).doubleValue()));
    Object v17 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = ((com.fasterxml.jackson.core.JsonGenerator)v10).getCurrentValue();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = false;
    Object v17 = ((com.fasterxml.jackson.core.JsonGenerator)v14).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "true";
    Object v19 = 1;
    Object v20 = 127;
    ((com.fasterxml.jackson.core.JsonGenerator)v17).writeRawValue(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v21 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new char[]{Character.valueOf((char)0)};
    Object v15 = 6;
    Object v16 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v13).writeRaw(((char[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v15 = ((com.fasterxml.jackson.core.JsonGenerator)v13).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v16 = Character.valueOf((char)65535);
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeRaw((((java.lang.Character)v16).charValue()));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = false;
    Object v17 = ((com.fasterxml.jackson.core.JsonGenerator)v14).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.fasterxml.jackson.core.JsonGenerator)v17).version();
    Object v19 = ((com.fasterxml.jackson.core.JsonGenerator)v17).getOutputContext();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = ((com.fasterxml.jackson.core.JsonGenerator)v10).getCodec();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setHighestNonEscapedChar((((java.lang.Integer)v13).intValue()));
    Object v15 = "AeUTO_CLOSE_TARGET";
    Object v16 = 16;
    ((com.fasterxml.jackson.core.JsonGenerator)v14).writeNumberField(((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = null;
    Object v15 = ((com.fasterxml.jackson.core.JsonGenerator)v13).setCodec(((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v17 = java.io.InputStream.nullInputStream();
    Object v18 = 1;
    Object v19 = ((com.fasterxml.jackson.core.JsonGenerator)v15).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v16),((java.io.InputStream)v17),(((java.lang.Integer)v18).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = "Invalid nVumeric value: ";
    Object v9 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v8));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject(((java.lang.Object)v9));
    Object v10 = null;
    Object v11 = "Invalid nVumeric value: ";
    Object v12 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v11));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeFieldName(((com.fasterxml.jackson.core.SerializableString)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setHighestNonEscapedChar((((java.lang.Integer)v13).intValue()));
    Object v15 = "expected a valid value (number, String, array, object, 'true's, 'false' or 'null')";
    ((com.fasterxml.jackson.core.JsonGenerator)v14).writeRaw(((java.lang.String)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = -6.4596195F;
    ((com.fasterxml.jackson.core.JsonGenerator)v13).writeNumber((((java.lang.Float)v14).floatValue()));
    Object v15 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = new char[]{Character.valueOf((char)0)};
    Object v12 = 1;
    Object v13 = 2;
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeString(((char[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v12).getCodec();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v15 = ((com.fasterxml.jackson.core.JsonGenerator)v13).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v16 = ((com.fasterxml.jackson.core.JsonGenerator)v15).getCurrentValue();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = null;
    Object v15 = ((com.fasterxml.jackson.core.JsonGenerator)v13).setCodec(((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v15)._verifyOffsets((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = new byte[]{Byte.valueOf((byte)-21)};
    Object v16 = -3;
    Object v17 = -68;
    ((com.fasterxml.jackson.core.JsonGenerator)v14).writeBinary(((byte[])v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v16 = ((com.fasterxml.jackson.core.JsonGenerator)v14).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v15 = ((com.fasterxml.jackson.core.JsonGenerator)v13).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v16 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)2)};
    Object v17 = 0;
    Object v18 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeString(((char[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonGenerator)v13).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "Unexpected end-of-input within/between ";
    Object v15 = new byte[]{Byte.valueOf((byte)12),Byte.valueOf((byte)1),Byte.valueOf((byte)93)};
    ((com.fasterxml.jackson.core.JsonGenerator)v13).writeBinaryField(((java.lang.String)v14),((byte[])v15));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.core.util.BufferRecycler();
    ((com.fasterxml.jackson.core.JsonGenerator)v13).setCurrentValue(((java.lang.Object)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = false;
    Object v17 = ((com.fasterxml.jackson.core.JsonGenerator)v14).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "";
    Object v19 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-1),Byte.valueOf((byte)29)};
    ((com.fasterxml.jackson.core.JsonGenerator)v17).writeBinaryField(((java.lang.String)v18),((byte[])v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v15 = ((com.fasterxml.jackson.core.JsonGenerator)v13).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v16 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v17 = ((com.fasterxml.jackson.core.JsonGenerator)v15).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = 63;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v16 = ((com.fasterxml.jackson.core.JsonGenerator)v14).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ((com.fasterxml.jackson.core.JsonGenerator)v16).version();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = "NaN";
    Object v16 = 0.0F;
    ((com.fasterxml.jackson.core.JsonGenerator)v14).writeNumberField(((java.lang.String)v15),(((java.lang.Float)v16).floatValue()));
    Object v17 = null;
    Object v18 = true;
    ((com.fasterxml.jackson.core.JsonGenerator)v14).writeBoolean((((java.lang.Boolean)v18).booleanValue()));
    Object v19 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = ") in base64 c";
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeNumber(((java.lang.String)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v15 = ((com.fasterxml.jackson.core.JsonGenerator)v13).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v16 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v17 = ((com.fasterxml.jackson.core.JsonGenerator)v15).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v16));
    Object v18 = java.io.InputStream.nullInputStream();
    Object v19 = 10L;
    Object v20 = ((java.io.InputStream)v18).skip((((java.lang.Long)v19).longValue()));
    Object v21 = -16;
    Object v22 = ((com.fasterxml.jackson.core.JsonGenerator)v17).writeBinary(((java.io.InputStream)v18),(((java.lang.Integer)v21).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonGenerator)v13).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "('true', 'fa1se' or 'null')";
    ((com.fasterxml.jackson.core.JsonGenerator)v16).writeRawValue(((java.lang.String)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v16 = ((com.fasterxml.jackson.core.JsonGenerator)v14).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = new char[]{Character.valueOf((char)4),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v18 = 6;
    Object v19 = 1;
    ((com.fasterxml.jackson.core.JsonGenerator)v16).writeRawValue(((char[])v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = new int[]{10};
    Object v16 = 1;
    Object v17 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v14).writeArray(((int[])v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = 63;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v13));
    Object v15 = "I";
    Object v16 = 1004.4275659927764D;
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeNumberField(((java.lang.String)v15),(((java.lang.Double)v16).doubleValue()));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = new long[]{2L,48L};
    Object v12 = 18;
    Object v13 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeArray(((long[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = null;
    Object v15 = ((com.fasterxml.jackson.core.JsonGenerator)v13).setCodec(((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = "strng value";
    Object v17 = 18.404903F;
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeNumberField(((java.lang.String)v16),(((java.lang.Float)v17).floatValue()));
    Object v18 = null;
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeNull();
    Object v19 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v16 = ((com.fasterxml.jackson.core.JsonGenerator)v14).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ((com.fasterxml.jackson.core.JsonGenerator)v16).getCurrentValue();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = 63;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v14 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v15 = false;
    Object v16 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v13),((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 49;
    Object v18 = null;
    Object v19 = java.io.Writer.nullWriter();
    Object v20 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v16),(((java.lang.Integer)v17).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v18),((java.io.Writer)v19));
    ((com.fasterxml.jackson.core.JsonGenerator)v20).writeStartObject();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v23 = ((com.fasterxml.jackson.core.JsonGenerator)v20).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v22));
    Object v24 = 63;
    Object v25 = ((com.fasterxml.jackson.core.JsonGenerator)v23).setFeatureMask((((java.lang.Integer)v24).intValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeEmbeddedObject(((java.lang.Object)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = 63;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v12).getCodec();
    Object v14 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-31)};
    Object v15 = -31;
    Object v16 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeRawUTF8String(((byte[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = 63;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = 63;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v12).isClosed();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setHighestNonEscapedChar((((java.lang.Integer)v13).intValue()));
    Object v15 = new char[]{};
    Object v16 = 0;
    Object v17 = 25;
    ((com.fasterxml.jackson.core.JsonGenerator)v14).writeString(((char[])v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 49;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = -36;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = false;
    Object v17 = ((com.fasterxml.jackson.core.JsonGenerator)v14).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new long[]{-1L,1L};
    Object v19 = 0;
    Object v20 = -21;
    ((com.fasterxml.jackson.core.JsonGenerator)v17).writeArray(((long[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v21 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }
}
