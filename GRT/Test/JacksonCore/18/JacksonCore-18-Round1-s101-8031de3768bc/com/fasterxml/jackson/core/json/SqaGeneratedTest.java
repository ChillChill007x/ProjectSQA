package com.fasterxml.jackson.core.json;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = "'";
    Object v9 = " does not support schema of type '";
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStringField(((java.lang.String)v8),((java.lang.String)v9));
    Object v10 = null;
    Object v11 = new double[]{0.0D};
    Object v12 = -27;
    Object v13 = -22;
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeArray(((double[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = Character.valueOf((char)0);
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v7).writeRaw((((java.lang.Character)v8).charValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = "|";
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeNullField(((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = "write 4aw value";
    Object v9 = 1;
    Object v10 = -51;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v7).writeRaw(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v7).close();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = "Infinit-";
    Object v9 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.SerializableString)v9).putQuotedUTF8(((java.nio.ByteBuffer)v11));
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v7).writeFieldName(((com.fasterxml.jackson.core.SerializableString)v9));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = -3.7561312F;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v7).writeNumber((((java.lang.Float)v8).floatValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 57;
    Object v9 = 6;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "Ininity";
    Object v12 = false;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v7)._writePPFieldName(((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "was expecting comma to separate ";
    Object v12 = false;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10)._writePPFieldName(((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "write a number";
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10).writeNumber(((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v11).intValue()));
    ((com.fasterxml.jackson.core.base.GeneratorBase)v10).setCurrentValue(((java.lang.Object)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-45)};
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeBinary(((byte[])v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 3;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).setFeatureMask((((java.lang.Integer)v8).intValue()));
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v7).writeStartArray();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v12 = 14;
    Object v13 = 0;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10).writeRaw(((char[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 2;
    Object v12 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v10).setHighestNonEscapedChar((((java.lang.Integer)v11).intValue()));
    Object v13 = 0L;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10).writeNumber((((java.lang.Long)v13).longValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = "was expecting either valid name character (for unquoted name) or double-quote (for quo8ted) to start field name";
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v7)._verifyValueWrite(((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10)._releaseBuffers();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "Infinit-";
    Object v12 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v11));
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10).writeRaw(((com.fasterxml.jackson.core.SerializableString)v12));
    Object v13 = null;
    Object v14 = false;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10).writeBoolean((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "Infinit-";
    Object v12 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v11));
    Object v13 = false;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10)._writePPFieldName(((com.fasterxml.jackson.core.SerializableString)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "c";
    Object v12 = 0.0F;
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeNumberField(((java.lang.String)v11),(((java.lang.Float)v12).floatValue()));
    Object v13 = null;
    Object v14 = ": was expecting closng ''' for name";
    Object v15 = false;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10)._writeFieldName(((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = Character.valueOf((char)0);
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v14).writeRaw((((java.lang.Character)v15).charValue()));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "/Z";
    Object v12 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setPrettyPrinter(((com.fasterxml.jackson.core.PrettyPrinter)v12));
    Object v14 = ((com.fasterxml.jackson.core.base.GeneratorBase)v10).useDefaultPrettyPrinter();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v17).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v19 = new byte[]{Byte.valueOf((byte)85),Byte.valueOf((byte)31),Byte.valueOf((byte)1)};
    Object v20 = 0;
    Object v21 = 48;
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new byte[]{Byte.valueOf((byte)85),Byte.valueOf((byte)31)};
    Object v24 = 9;
    Object v25 = ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v17)._writeBinary(((com.fasterxml.jackson.core.Base64Variant)v18),((java.io.InputStream)v22),((byte[])v23),(((java.lang.Integer)v24).intValue()));
    org.junit.Assert.assertEquals((Object)(7), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = "Infinit-";
    Object v16 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v15));
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v14).writeFieldName(((com.fasterxml.jackson.core.SerializableString)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10).writeBoolean((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = "N";
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10).writeString(((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = ((com.fasterxml.jackson.core.base.GeneratorBase)v17).useDefaultPrettyPrinter();
    Object v19 = -28L;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v17).writeNumber((((java.lang.Long)v19).longValue()));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "{";
    Object v12 = 64;
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeNumberField(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v15 = new byte[]{};
    Object v16 = 33;
    Object v17 = 57;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10)._writeBinary(((com.fasterxml.jackson.core.Base64Variant)v14),((byte[])v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new char[]{Character.valueOf((char)1),Character.valueOf((char)3)};
    Object v12 = 0;
    Object v13 = -32;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10).writeString(((char[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "/Z";
    Object v12 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setPrettyPrinter(((com.fasterxml.jackson.core.PrettyPrinter)v12));
    Object v14 = ((com.fasterxml.jackson.core.base.GeneratorBase)v10).useDefaultPrettyPrinter();
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v14)._flushBuffer();
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10).writeBoolean((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = "";
    ((com.fasterxml.jackson.core.JsonGenerator)v17).writeNumber(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = 0;
    Object v21 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v17).setHighestNonEscapedChar((((java.lang.Integer)v20).intValue()));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new byte[]{Byte.valueOf((byte)85),Byte.valueOf((byte)31),Byte.valueOf((byte)1)};
    Object v12 = 0;
    Object v13 = 48;
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = -2;
    Object v16 = ((com.fasterxml.jackson.core.JsonGenerator)v10).writeBinary(((java.io.InputStream)v14),(((java.lang.Integer)v15).intValue()));
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10).writeEndArray();
    Object v17 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = Short.valueOf((short)0);
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10).writeNumber((((java.lang.Short)v11).shortValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = " bytes (out of ";
    Object v12 = "u) ";
    ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v10).writeStringField(((java.lang.String)v11),((java.lang.String)v12));
    Object v13 = null;
    Object v14 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10)._verifyValueWrite(((java.lang.String)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "namp";
    Object v12 = "";
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeStringField(((java.lang.String)v11),((java.lang.String)v12));
    Object v13 = null;
    Object v14 = new int[]{};
    Object v15 = 26;
    Object v16 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeArray(((int[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "/Z";
    Object v12 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setPrettyPrinter(((com.fasterxml.jackson.core.PrettyPrinter)v12));
    Object v14 = ((com.fasterxml.jackson.core.base.GeneratorBase)v10).useDefaultPrettyPrinter();
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v14).writeEndObject();
    Object v15 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v16 = new byte[]{};
    Object v17 = ((com.fasterxml.jackson.core.Base64Variant)v15).encode(((byte[])v16));
    Object v18 = new byte[]{Byte.valueOf((byte)85),Byte.valueOf((byte)31),Byte.valueOf((byte)1)};
    Object v19 = 0;
    Object v20 = 48;
    Object v21 = new java.io.ByteArrayInputStream(((byte[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = new byte[]{Byte.valueOf((byte)85),Byte.valueOf((byte)31),Byte.valueOf((byte)1)};
    Object v23 = ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v14)._writeBinary(((com.fasterxml.jackson.core.Base64Variant)v15),((java.io.InputStream)v21),((byte[])v22));
    org.junit.Assert.assertEquals((Object)(3), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "/Z";
    Object v12 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setPrettyPrinter(((com.fasterxml.jackson.core.PrettyPrinter)v12));
    Object v14 = ((com.fasterxml.jackson.core.base.GeneratorBase)v10).useDefaultPrettyPrinter();
    ((com.fasterxml.jackson.core.JsonGenerator)v14).writeNull();
    Object v15 = null;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).getHighestEscapedChar();
    org.junit.Assert.assertEquals((Object)(127), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = ")";
    ((com.fasterxml.jackson.core.base.GeneratorBase)v17).writeRawValue(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v21 = new byte[]{Byte.valueOf((byte)85),Byte.valueOf((byte)31),Byte.valueOf((byte)1)};
    Object v22 = 0;
    Object v23 = 48;
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 0;
    Object v26 = ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v17).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v20),((java.io.InputStream)v24),(((java.lang.Integer)v25).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new byte[]{Byte.valueOf((byte)85),Byte.valueOf((byte)31),Byte.valueOf((byte)1)};
    Object v12 = 0;
    Object v13 = 48;
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new byte[]{};
    Object v16 = new com.fasterxml.jackson.core.format.InputAccessor.Std(((java.io.InputStream)v14),((byte[])v15));
    ((com.fasterxml.jackson.core.base.GeneratorBase)v10).writeObject(((java.lang.Object)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "/Z";
    Object v12 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setPrettyPrinter(((com.fasterxml.jackson.core.PrettyPrinter)v12));
    Object v14 = ((com.fasterxml.jackson.core.base.GeneratorBase)v10).useDefaultPrettyPrinter();
    Object v15 = "Infinit-";
    Object v16 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v15));
    Object v17 = false;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v14)._writeFieldName(((com.fasterxml.jackson.core.SerializableString)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "Infinit-";
    Object v12 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v11));
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10).writeFieldName(((com.fasterxml.jackson.core.SerializableString)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = "Unexpected problem: chain of filtered context bro";
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v17).writeRaw(((java.lang.String)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = "";
    ((com.fasterxml.jackson.core.JsonGenerator)v17).writeNumber(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = 0;
    Object v21 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v17).setHighestNonEscapedChar((((java.lang.Integer)v20).intValue()));
    Object v22 = "FIELD*NAME";
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v21).writeFieldName(((java.lang.String)v22));
    Object v23 = null;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v21).writeStartArray();
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v7).writeEndObject();
    Object v8 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 2;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).setHighestNonEscapedChar((((java.lang.Integer)v15).intValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v17).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v18));
    Object v20 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v21 = new byte[]{Byte.valueOf((byte)-42),Byte.valueOf((byte)34)};
    Object v22 = 1;
    Object v23 = -14;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v19).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v20),((byte[])v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = 30L;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v19).writeNumber((((java.lang.Long)v25).longValue()));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = "'";
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v16).writeFieldName(((java.lang.String)v17));
    Object v18 = null;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v16).flush();
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new double[]{13.182740924873205D};
    Object v16 = 1;
    Object v17 = -7;
    ((com.fasterxml.jackson.core.JsonGenerator)v14).writeArray(((double[])v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v17).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v18));
    Object v20 = "Infinit-";
    Object v21 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v20));
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v19).writeFieldName(((com.fasterxml.jackson.core.SerializableString)v21));
    Object v22 = null;
    Object v23 = "'";
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v19).writeFieldName(((java.lang.String)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).flush();
    Object v8 = null;
    Object v9 = new long[]{-21L};
    Object v10 = 1;
    Object v11 = 1;
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeArray(((long[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v19 = ((com.fasterxml.jackson.core.base.GeneratorBase)v17).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "/Z";
    Object v12 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setPrettyPrinter(((com.fasterxml.jackson.core.PrettyPrinter)v12));
    Object v14 = ((com.fasterxml.jackson.core.base.GeneratorBase)v10).useDefaultPrettyPrinter();
    Object v15 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v16 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v17 = true;
    Object v18 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v15),((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = -30;
    Object v20 = null;
    Object v21 = java.io.Writer.nullWriter();
    Object v22 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v18),(((java.lang.Integer)v19).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v20),((java.io.Writer)v21));
    ((com.fasterxml.jackson.core.JsonGenerator)v14).writeTypeId(((java.lang.Object)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.core.base.GeneratorBase)v10).useDefaultPrettyPrinter();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = "";
    ((com.fasterxml.jackson.core.JsonGenerator)v17).writeNumber(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = 0;
    Object v21 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v17).setHighestNonEscapedChar((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v23 = new byte[]{Byte.valueOf((byte)-14),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v24 = 0;
    Object v25 = 9;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v21).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v22),((byte[])v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.core.base.GeneratorBase)v10).useDefaultPrettyPrinter();
    Object v12 = -54.581138942050956D;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v11).writeNumber((((java.lang.Double)v12).doubleValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.core.base.GeneratorBase)v10).useDefaultPrettyPrinter();
    Object v12 = new int[]{0,249};
    Object v13 = 1;
    Object v14 = 12;
    ((com.fasterxml.jackson.core.JsonGenerator)v11).writeArray(((int[])v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = new char[]{Character.valueOf((char)1)};
    Object v18 = 84;
    Object v19 = 0;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v16).writeRaw(((char[])v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "/Z";
    Object v12 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setPrettyPrinter(((com.fasterxml.jackson.core.PrettyPrinter)v12));
    Object v14 = ((com.fasterxml.jackson.core.base.GeneratorBase)v10).useDefaultPrettyPrinter();
    Object v15 = 1;
    Object v16 = ((com.fasterxml.jackson.core.base.GeneratorBase)v14).setFeatureMask((((java.lang.Integer)v15).intValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "/Z";
    Object v12 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setPrettyPrinter(((com.fasterxml.jackson.core.PrettyPrinter)v12));
    Object v14 = ((com.fasterxml.jackson.core.base.GeneratorBase)v10).useDefaultPrettyPrinter();
    Object v15 = "wlrite a binary value";
    Object v16 = -23;
    Object v17 = 0;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v14).writeRaw(((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 2;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).setHighestNonEscapedChar((((java.lang.Integer)v15).intValue()));
    Object v17 = 0;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v16).writeNumber((((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v17).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v18));
    Object v20 = "wri";
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v19)._verifyPrettyValueWrite(((java.lang.String)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v12 = new byte[]{Byte.valueOf((byte)85),Byte.valueOf((byte)31),Byte.valueOf((byte)1)};
    Object v13 = 0;
    Object v14 = 48;
    Object v15 = new java.io.ByteArrayInputStream(((byte[])v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((java.io.InputStream)v15).reset();
    Object v16 = null;
    Object v17 = new byte[]{Byte.valueOf((byte)85),Byte.valueOf((byte)31)};
    Object v18 = ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10)._writeBinary(((com.fasterxml.jackson.core.Base64Variant)v11),((java.io.InputStream)v15),((byte[])v17));
    org.junit.Assert.assertEquals((Object)(2), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 2;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).setHighestNonEscapedChar((((java.lang.Integer)v15).intValue()));
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v16).writeNull();
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 2;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).setHighestNonEscapedChar((((java.lang.Integer)v15).intValue()));
    Object v17 = new byte[]{Byte.valueOf((byte)-18)};
    Object v18 = 12;
    Object v19 = 0;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v16).writeUTF8String(((byte[])v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = Short.valueOf((short)1);
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v17).writeNumber((((java.lang.Short)v18).shortValue()));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.core.base.GeneratorBase)v10).useDefaultPrettyPrinter();
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v11).writeStartObject();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "Infinit-";
    Object v12 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v11));
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10).writeString(((com.fasterxml.jackson.core.SerializableString)v12));
    Object v13 = null;
    Object v14 = new char[]{};
    Object v15 = 1;
    Object v16 = -6;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10).writeRaw(((char[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "/Z";
    Object v12 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setPrettyPrinter(((com.fasterxml.jackson.core.PrettyPrinter)v12));
    Object v14 = ((com.fasterxml.jackson.core.base.GeneratorBase)v10).useDefaultPrettyPrinter();
    Object v15 = 1;
    Object v16 = ((com.fasterxml.jackson.core.base.GeneratorBase)v14).setFeatureMask((((java.lang.Integer)v15).intValue()));
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v16).writeStartObject();
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = " in V comment";
    Object v19 = 11;
    ((com.fasterxml.jackson.core.JsonGenerator)v17).writeNumberField(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = "";
    ((com.fasterxml.jackson.core.JsonGenerator)v17).writeNumber(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = 0;
    Object v21 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v17).setHighestNonEscapedChar((((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.fasterxml.jackson.core.JsonGenerator)v21).canWriteBinaryNatively();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 2;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).setHighestNonEscapedChar((((java.lang.Integer)v15).intValue()));
    Object v17 = "Infinit-";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v16).writeString(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v19 = new byte[]{Byte.valueOf((byte)85),Byte.valueOf((byte)31),Byte.valueOf((byte)1)};
    Object v20 = 0;
    Object v21 = 48;
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new byte[]{Byte.valueOf((byte)85),Byte.valueOf((byte)31)};
    Object v24 = ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v17)._writeBinary(((com.fasterxml.jackson.core.Base64Variant)v18),((java.io.InputStream)v22),((byte[])v23));
    org.junit.Assert.assertEquals((Object)(2), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = 0;
    Object v18 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v17).intValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v16).writeStartObject(((java.lang.Object)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "4";
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10).writeString(((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.core.base.GeneratorBase)v10).useDefaultPrettyPrinter();
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v11).flush();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 2;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).setHighestNonEscapedChar((((java.lang.Integer)v15).intValue()));
    Object v17 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v18 = 0;
    Object v19 = 43;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v16).writeString(((char[])v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v17).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v18));
    Object v20 = "Infinit-";
    Object v21 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.core.JsonGenerator)v19).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v21));
    Object v23 = new double[]{0.0D};
    Object v24 = 31;
    Object v25 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v19).writeArray(((double[])v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = "";
    ((com.fasterxml.jackson.core.JsonGenerator)v17).writeNumber(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = 0;
    Object v21 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v17).setHighestNonEscapedChar((((java.lang.Integer)v20).intValue()));
    Object v22 = new byte[]{};
    Object v23 = 23;
    Object v24 = 12;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v21).writeRawUTF8String(((byte[])v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.core.base.GeneratorBase)v10).useDefaultPrettyPrinter();
    Object v12 = "Failed rehash(): old count=";
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v11)._verifyValueWrite(((java.lang.String)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v17).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v18));
    Object v20 = "write a binary value";
    Object v21 = false;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v19)._writeFieldName(((java.lang.String)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10).writeEndArray();
    Object v11 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v17).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v18));
    Object v20 = "Infinit-";
    Object v21 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v20));
    ((com.fasterxml.jackson.core.base.GeneratorBase)v19).writeObject(((java.lang.Object)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "-Infinit";
    Object v12 = -17.519567F;
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeNumberField(((java.lang.String)v11),(((java.lang.Float)v12).floatValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = "was expecting a colon to separate field name and value";
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v17)._verifyValueWrite(((java.lang.String)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "N/A";
    Object v12 = 18.218072656943114D;
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeNumberField(((java.lang.String)v11),(((java.lang.Double)v12).doubleValue()));
    Object v13 = null;
    Object v14 = new char[]{};
    Object v15 = 1;
    Object v16 = -42;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v10).writeString(((char[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v17).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v18));
    Object v20 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
    Object v21 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)1)};
    ((com.fasterxml.jackson.core.JsonGenerator)v19).writeBinaryField(((java.lang.String)v20),((byte[])v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -5;
    Object v12 = 10;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "";
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeArrayFieldStart(((java.lang.String)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "/Z";
    Object v12 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setPrettyPrinter(((com.fasterxml.jackson.core.PrettyPrinter)v12));
    Object v14 = ((com.fasterxml.jackson.core.base.GeneratorBase)v10).useDefaultPrettyPrinter();
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v14).flush();
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "/Z";
    Object v12 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).setPrettyPrinter(((com.fasterxml.jackson.core.PrettyPrinter)v12));
    Object v14 = ((com.fasterxml.jackson.core.base.GeneratorBase)v10).useDefaultPrettyPrinter();
    Object v15 = 6.0F;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v14).writeNumber((((java.lang.Float)v15).floatValue()));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.core.base.GeneratorBase)v10).useDefaultPrettyPrinter();
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v11).overrideFormatFeatures((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v9 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)2)};
    Object v10 = 0;
    Object v11 = 14;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v7)._writeBinary(((com.fasterxml.jackson.core.Base64Variant)v8),((byte[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.core.base.GeneratorBase)v10).useDefaultPrettyPrinter();
    Object v12 = 0L;
    ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v11).writeNumber((((java.lang.Long)v12).longValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -30;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = 19;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).overrideStdFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v18 = ": ";
    ((com.fasterxml.jackson.core.JsonGenerator)v17).writeNullField(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v21 = new byte[]{Byte.valueOf((byte)85),Byte.valueOf((byte)31),Byte.valueOf((byte)1)};
    Object v22 = 0;
    Object v23 = 48;
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = new byte[]{};
    Object v26 = 0;
    Object v27 = ((com.fasterxml.jackson.core.json.WriterBasedJsonGenerator)v17)._writeBinary(((com.fasterxml.jackson.core.Base64Variant)v20),((java.io.InputStream)v24),((byte[])v25),(((java.lang.Integer)v26).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v27);
  }
}
