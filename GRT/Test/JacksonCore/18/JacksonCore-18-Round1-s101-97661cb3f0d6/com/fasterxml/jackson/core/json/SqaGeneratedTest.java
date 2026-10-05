package com.fasterxml.jackson.core.json;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0L;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v0).writeNumber((((java.lang.Long)v1).longValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "fals!";
    Object v10 = 0.0F;
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumberField(((java.lang.String)v9),(((java.lang.Float)v10).floatValue()));
    Object v11 = null;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v8).writeEndObject();
    Object v12 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = -2;
    Object v15 = 1;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13)._outputSurrogates((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = -19.363423881640287D;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13).writeNumber((((java.lang.Double)v14).doubleValue()));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = new int[]{};
    Object v10 = 1;
    Object v11 = 1;
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeArray(((int[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = new double[]{};
    Object v10 = 28;
    Object v11 = -14;
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeArray(((double[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13).writeEndArray();
    Object v14 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "write a number";
    Object v15 = ") ut of range of long (";
    ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).writeStringField(((java.lang.String)v14),((java.lang.String)v15));
    Object v16 = null;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13).writeEndArray();
    Object v17 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new char[]{};
    Object v15 = 1;
    Object v16 = -20;
    ((com.fasterxml.jackson.core.base.GeneratorBase)v13).writeRawValue(((char[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13).writeStartArray();
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 6;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13).writeNumber((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = Short.valueOf((short)1);
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13).writeNumber((((java.lang.Short)v16).shortValue()));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13).flush();
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "";
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13).writeString(((java.lang.String)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "write a ";
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13).writeNumber(((java.lang.String)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13).writeBoolean((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v17 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.core.JsonGenerator)v16).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v17),(((java.lang.Boolean)v19).booleanValue()));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v17 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.core.JsonGenerator)v16).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v17),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v22 = new byte[]{Byte.valueOf((byte)0)};
    Object v23 = new java.io.ByteArrayInputStream(((byte[])v22));
    Object v24 = -50;
    Object v25 = ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v20).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v21),((java.io.InputStream)v23),(((java.lang.Integer)v24).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "expected padding character '";
    Object v15 = -13;
    ((com.fasterxml.jackson.core.JsonGenerator)v13).writeNumberField(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = "Spill-over slots in symbol table with ";
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13).writeString(((java.lang.String)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v17 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.core.JsonGenerator)v16).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v17),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = "Unexected character (";
    Object v22 = 20;
    Object v23 = 1;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v20).writeRaw(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = ", expecting field namt";
    Object v26 = 1;
    Object v27 = 1;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v20).writeRaw(((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = java.io.OutputStream.nullOutputStream();
    Object v18 = ((java.io.InputStream)v16).transferTo(((java.io.OutputStream)v17));
    Object v19 = 7;
    Object v20 = ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v14),((java.io.InputStream)v16),(((java.lang.Integer)v19).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v17 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v18 = new byte[]{Byte.valueOf((byte)0)};
    Object v19 = new java.io.ByteArrayInputStream(((byte[])v18));
    Object v20 = -35;
    Object v21 = ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v16).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v17),((java.io.InputStream)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ")";
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v16)._writePPFieldName(((java.lang.String)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v17 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.core.JsonGenerator)v16).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v17),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    ((com.fasterxml.jackson.core.base.GeneratorBase)v20).writeObject(((java.lang.Object)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "";
    Object v15 = false;
    ((com.fasterxml.jackson.core.JsonGenerator)v13).writeBooleanField(((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v17 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.core.JsonGenerator)v16).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v17),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = "Broken surrogate pair: \"first char 0x";
    Object v22 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v21));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v20).writeString(((com.fasterxml.jackson.core.SerializableString)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Broken surrogate pair: \"first char 0x";
    Object v15 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v14));
    Object v16 = new char[]{Character.valueOf((char)1)};
    Object v17 = 3;
    Object v18 = ((com.fasterxml.jackson.core.SerializableString)v15).appendQuoted(((char[])v16),(((java.lang.Integer)v17).intValue()));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13)._writePPFieldName(((com.fasterxml.jackson.core.SerializableString)v15));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Broken surrogate pair: \"first char 0x";
    Object v15 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v14));
    Object v16 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-12)};
    Object v17 = 0;
    Object v18 = 2;
    Object v19 = java.nio.ByteBuffer.wrap(((byte[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.core.SerializableString)v15).putQuotedUTF8(((java.nio.ByteBuffer)v19));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13).writeRaw(((com.fasterxml.jackson.core.SerializableString)v15));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v17 = "JSN";
    ((com.fasterxml.jackson.core.JsonGenerator)v16).writeArrayFieldStart(((java.lang.String)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v17 = new char[]{Character.valueOf((char)0)};
    Object v18 = 1;
    Object v19 = 62;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v16).writeString(((char[])v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = ((com.fasterxml.jackson.core.base.GeneratorBase)v13).setFeatureMask((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    ((com.fasterxml.jackson.core.base.GeneratorBase)v13).writeObject(((java.lang.Object)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = ((com.fasterxml.jackson.core.base.GeneratorBase)v13).setFeatureMask((((java.lang.Integer)v14).intValue()));
    Object v16 = 1;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v15).writeNumber((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13).writeStartObject();
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = ((com.fasterxml.jackson.core.base.GeneratorBase)v13).setFeatureMask((((java.lang.Integer)v14).intValue()));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v15).writeStartObject();
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = ((com.fasterxml.jackson.core.base.GeneratorBase)v13).setFeatureMask((((java.lang.Integer)v14).intValue()));
    Object v16 = 1.0D;
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeNumber((((java.lang.Double)v16).doubleValue()));
    Object v17 = null;
    Object v18 = new byte[]{};
    Object v19 = 0;
    Object v20 = 19;
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeBinary(((byte[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v10 = new byte[]{};
    Object v11 = 17;
    Object v12 = 57;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v8).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v9),((byte[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
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
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v17 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.core.JsonGenerator)v16).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v17),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new byte[]{Byte.valueOf((byte)10),Byte.valueOf((byte)0)};
    Object v22 = 5;
    Object v23 = 0;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v20).writeUTF8String(((byte[])v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.core.base.GeneratorBase)v13).getFeatureMask();
    org.junit.Assert.assertEquals((Object)(16), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v17 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.core.JsonGenerator)v16).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v17),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = "Broken surrogate pair: \"first char 0x";
    Object v22 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v21));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v20).writeRaw(((com.fasterxml.jackson.core.SerializableString)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v17 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v18 = false;
    Object v19 = ((com.fasterxml.jackson.core.JsonGenerator)v16).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v17),(((java.lang.Boolean)v18).booleanValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13).close();
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)42)};
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13)._writeBinary(((com.fasterxml.jackson.core.Base64Variant)v14),((java.io.InputStream)v16),((byte[])v17));
    org.junit.Assert.assertEquals((Object)(1), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = ", copyCount=";
    Object v17 = 1.0F;
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeNumberField(((java.lang.String)v16),(((java.lang.Float)v17).floatValue()));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v15).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = ((com.fasterxml.jackson.core.base.GeneratorBase)v13).setFeatureMask((((java.lang.Integer)v14).intValue()));
    Object v16 = "M";
    Object v17 = 32;
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeNumberField(((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v20 = new byte[]{Byte.valueOf((byte)-40),Byte.valueOf((byte)0)};
    Object v21 = 3;
    Object v22 = -18;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v15)._writeBinary(((com.fasterxml.jackson.core.Base64Variant)v19),((byte[])v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = ((com.fasterxml.jackson.core.base.GeneratorBase)v13).setFeatureMask((((java.lang.Integer)v14).intValue()));
    Object v16 = "Internal error on SymbolTable.rehash(): had ";
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v15).writeNumber(((java.lang.String)v16));
    Object v17 = null;
    Object v18 = 0.0F;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v15).writeNumber((((java.lang.Float)v18).floatValue()));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v13).writeStartArray();
    Object v14 = null;
    Object v15 = new long[]{30L,0L};
    Object v16 = -25;
    Object v17 = 2;
    ((com.fasterxml.jackson.core.JsonGenerator)v13).writeArray(((long[])v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v16 = new long[]{-23L,1L};
    Object v17 = 44;
    Object v18 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeArray(((long[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v17 = -3;
    Object v18 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeBinary(((byte[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v21 = new byte[]{Byte.valueOf((byte)0)};
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v21));
    Object v23 = new byte[]{};
    Object v24 = 1;
    Object v25 = ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v15)._writeBinary(((com.fasterxml.jackson.core.Base64Variant)v20),((java.io.InputStream)v22),((byte[])v23),(((java.lang.Integer)v24).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v15).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v16));
    Object v18 = new char[]{Character.valueOf((char)1)};
    Object v19 = 1;
    Object v20 = 9;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v17).writeString(((char[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13)._releaseBuffers();
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v15).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v16));
    Object v18 = "lull";
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v17).writeNumber(((java.lang.String)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v16 = "";
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v15).writeFieldName(((java.lang.String)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = "'";
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v15)._verifyValueWrite(((java.lang.String)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = ((com.fasterxml.jackson.core.base.GeneratorBase)v13).setFeatureMask((((java.lang.Integer)v14).intValue()));
    Object v16 = "null";
    Object v17 = 1;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v15)._verifyPrettyValueWrite(((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new int[]{};
    Object v15 = -9;
    Object v16 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v13).writeArray(((int[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "Generator of type ";
    Object v10 = 1;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v8)._verifyPrettyValueWrite(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v16 = "D";
    Object v17 = 1L;
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeNumberField(((java.lang.String)v16),(((java.lang.Long)v17).longValue()));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = Character.valueOf((char)1);
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13).writeRaw((((java.lang.Character)v14).charValue()));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v13).canWriteTypeId();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v16 = ") in numeric value";
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v15).writeRaw(((java.lang.String)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v16)._flushBuffer();
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = ((com.fasterxml.jackson.core.base.GeneratorBase)v13).setFeatureMask((((java.lang.Integer)v14).intValue()));
    Object v16 = new byte[]{Byte.valueOf((byte)9)};
    Object v17 = 0;
    Object v18 = -12;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v15).writeUTF8String(((byte[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v16));
    ((com.fasterxml.jackson.core.JsonGenerator)v15).copyCurrentEvent(((com.fasterxml.jackson.core.JsonParser)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v17 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.core.JsonGenerator)v16).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v17),(((java.lang.Boolean)v19).booleanValue()));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v20).writeStartArray();
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = new int[]{};
    Object v17 = 1;
    Object v18 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeArray(((int[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = ((com.fasterxml.jackson.core.base.GeneratorBase)v15).useDefaultPrettyPrinter();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "'";
    Object v15 = true;
    ((com.fasterxml.jackson.core.JsonGenerator)v13).writeBooleanField(((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    Object v17 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v18 = 0;
    Object v19 = 1;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13).writeRaw(((char[])v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v15).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v16));
    Object v18 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v19 = new byte[]{};
    Object v20 = 42;
    Object v21 = -27;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v17)._writeBinary(((com.fasterxml.jackson.core.Base64Variant)v18),((byte[])v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v16 = "'";
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v15).writeFieldName(((java.lang.String)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = new long[]{-19L,8L,-30L};
    Object v17 = -15;
    Object v18 = -34;
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeArray(((long[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = 9;
    Object v17 = -4;
    Object v18 = ((com.fasterxml.jackson.core.base.GeneratorBase)v15).overrideStdFeatures((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = new byte[]{};
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeBinary(((byte[])v16));
    Object v17 = null;
    Object v18 = "";
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v15)._verifyValueWrite(((java.lang.String)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13)._writeBinary(((com.fasterxml.jackson.core.Base64Variant)v14),((java.io.InputStream)v16),((byte[])v17));
    org.junit.Assert.assertEquals((Object)(1), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Broken surrogate pair: \"first char 0x";
    Object v15 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v14));
    Object v16 = java.io.OutputStream.nullOutputStream();
    Object v17 = ((com.fasterxml.jackson.core.SerializableString)v15).writeQuotedUTF8(((java.io.OutputStream)v16));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13).writeFieldName(((com.fasterxml.jackson.core.SerializableString)v15));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = 9;
    Object v17 = -4;
    Object v18 = ((com.fasterxml.jackson.core.base.GeneratorBase)v15).overrideStdFeatures((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = "expected a hex-digit for character escape sequencn";
    Object v20 = 0;
    Object v21 = 2;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v18).writeRaw(((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = "";
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v15)._writePPFieldName(((java.lang.String)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v15).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v16));
    Object v18 = "Broken surrogate pair: \"first char 0x";
    Object v19 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v18));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v15).writeString(((com.fasterxml.jackson.core.SerializableString)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v17 = "Broken surrogate pair: \"first char 0x";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v16).writeRawValue(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v19 = null;
    Object v20 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v21 = -26;
    Object v22 = 0;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v16).writeRaw(((char[])v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = 9;
    Object v17 = -4;
    Object v18 = ((com.fasterxml.jackson.core.base.GeneratorBase)v15).overrideStdFeatures((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = "Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]";
    Object v20 = 2;
    Object v21 = -1;
    ((com.fasterxml.jackson.core.base.GeneratorBase)v18).writeRawValue(((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = 4;
    Object v17 = 42;
    Object v18 = ((com.fasterxml.jackson.core.JsonGenerator)v15).overrideFormatFeatures((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "";
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v8)._verifyValueWrite(((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v17 = "Broken surrogate pair: \"first char 0x";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v16).writeString(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = ((com.fasterxml.jackson.core.base.GeneratorBase)v13).setFeatureMask((((java.lang.Integer)v14).intValue()));
    Object v16 = 2;
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v15).setHighestNonEscapedChar((((java.lang.Integer)v16).intValue()));
    Object v18 = "was expecting double-^uote to start field name";
    Object v19 = "Exponent indicator not followed by a digit";
    ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v15).writeStringField(((java.lang.String)v18),((java.lang.String)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = Short.valueOf((short)-20);
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v15).writeNumber((((java.lang.Short)v16).shortValue()));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = 9;
    Object v17 = -4;
    Object v18 = ((com.fasterxml.jackson.core.base.GeneratorBase)v15).overrideStdFeatures((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = "Broken surrogate pair: \"first char 0x";
    Object v20 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v19));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v18).writeRawValue(((com.fasterxml.jackson.core.SerializableString)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v17 = "Broken surrogate pair: \"first char 0x";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v17 = "Broken surrogate pair: \"first char 0x";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = "Broken surrogate pair: \"first char 0x";
    Object v21 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v19).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v21));
    Object v23 = -42;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v19).writeNumber((((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = new int[]{};
    Object v17 = 1;
    Object v18 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeArray(((int[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = ((com.fasterxml.jackson.core.base.GeneratorBase)v15).useDefaultPrettyPrinter();
    Object v21 = Character.valueOf((char)6);
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v20).writeRaw((((java.lang.Character)v21).charValue()));
    Object v22 = null;
    Object v23 = 66.34437F;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v20).writeNumber((((java.lang.Float)v23).floatValue()));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = ((com.fasterxml.jackson.core.base.GeneratorBase)v13).setFeatureMask((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v17 = new java.lang.StringBuilder();
    Object v18 = 1;
    Object v19 = 1;
    ((com.fasterxml.jackson.core.Base64Variant)v16).encodeBase64Partial(((java.lang.StringBuilder)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = new byte[]{Byte.valueOf((byte)14)};
    Object v22 = 17;
    Object v23 = -7;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v15).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v16),((byte[])v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v15)._releaseBuffers();
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v16 = "Broken surrogate pair: \"first char 0x";
    Object v17 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v16));
    Object v18 = new byte[]{};
    Object v19 = 1;
    Object v20 = ((com.fasterxml.jackson.core.SerializableString)v17).appendUnquotedUTF8(((byte[])v18),(((java.lang.Integer)v19).intValue()));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v15)._writePPFieldName(((com.fasterxml.jackson.core.SerializableString)v17));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 4;
    Object v15 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).setHighestNonEscapedChar((((java.lang.Integer)v14).intValue()));
    Object v16 = 9;
    Object v17 = -4;
    Object v18 = ((com.fasterxml.jackson.core.base.GeneratorBase)v15).overrideStdFeatures((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v18).writeEndObject();
    Object v19 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v13).writeEndObject();
    Object v14 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v17 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.core.JsonGenerator)v16).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v17),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v22 = new byte[]{Byte.valueOf((byte)-1)};
    Object v23 = true;
    Object v24 = ((com.fasterxml.jackson.core.Base64Variant)v21).encode(((byte[])v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new byte[]{Byte.valueOf((byte)0)};
    Object v26 = new java.io.ByteArrayInputStream(((byte[])v25));
    Object v27 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)41),Byte.valueOf((byte)38)};
    Object v28 = ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v20)._writeBinary(((com.fasterxml.jackson.core.Base64Variant)v21),((java.io.InputStream)v26),((byte[])v27));
    org.junit.Assert.assertEquals((Object)(1), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v17 = "Broken surrogate pair: \"first char 0x";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = Character.valueOf((char)1);
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v19).writeRaw((((java.lang.Character)v20).charValue()));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.io.IOContext)v3).allocReadIOBuffer();
    Object v5 = 0;
    Object v6 = null;
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7));
    Object v9 = "expected padding charyacter '";
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumber(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 50;
    Object v12 = 25;
    Object v13 = ((com.fasterxml.jackson.core.base.GeneratorBase)v8).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v13).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v17 = "Broken surrogate pair: \"first char 0x";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = "Unexpected end-of-input";
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v19).writeNumber(((java.lang.String)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }
}
