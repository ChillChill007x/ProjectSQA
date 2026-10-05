package com.fasterxml.jackson.core.json;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "Unexpected problem: chain of filtered context broken5";
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = true;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeObjectField(((java.lang.String)v3),((java.lang.Object)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "false";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeFieldName(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ") to output";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)-3),Byte.valueOf((byte)0),Byte.valueOf((byte)79)};
    Object v4 = -45;
    Object v5 = 0;
    Object v6 = new java.io.ByteArrayInputStream(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeTypeId(((java.lang.Object)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeEndArray();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ": ";
    Object v4 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = -28;
    Object v7 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.fasterxml.jackson.core.SerializableString)v4).writeUnquotedUTF8(((java.io.OutputStream)v7));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRaw(((com.fasterxml.jackson.core.SerializableString)v4));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = Character.valueOf((char)1);
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRaw((((java.lang.Character)v3).charValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v4 = ((com.fasterxml.jackson.core.Base64Variant)v3).hashCode();
    Object v5 = new byte[]{};
    Object v6 = 1;
    Object v7 = 1;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v3),((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -30.194139207088632D;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v3),((java.lang.Object)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 31;
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v9 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v8),((java.lang.Object)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new byte[]{Byte.valueOf((byte)-3),Byte.valueOf((byte)0),Byte.valueOf((byte)79)};
    Object v13 = -45;
    Object v14 = 0;
    Object v15 = new java.io.ByteArrayInputStream(((byte[])v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new byte[]{Byte.valueOf((byte)7),Byte.valueOf((byte)-7)};
    Object v17 = 9;
    Object v18 = 60;
    Object v19 = true;
    Object v20 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v11),((java.io.InputStream)v15),((byte[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v23 = new char[]{};
    Object v24 = -18;
    Object v25 = 1;
    Object v26 = true;
    Object v27 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v6),(((java.lang.Integer)v7).intValue()),((java.io.Reader)v20),((com.fasterxml.jackson.core.ObjectCodec)v21),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v22),((char[])v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Boolean)v26).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).copyCurrentStructure(((com.fasterxml.jackson.core.JsonParser)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 0.0D;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = Character.valueOf((char)5);
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRaw((((java.lang.Character)v3).charValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v4 = -8;
    Object v5 = -18;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRaw(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "IGNORE_UNGDEFINED";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 32L;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber((((java.lang.Long)v3).longValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = "true";
    Object v16 = "write a number";
    ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).writeStringField(((java.lang.String)v15),((java.lang.String)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeBoolean((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v4 = -16;
    Object v5 = 2;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRaw(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "'";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 11.422705F;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber((((java.lang.Float)v3).floatValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v3),((java.lang.Object)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 31;
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v9 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v8),((java.lang.Object)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new byte[]{Byte.valueOf((byte)-3),Byte.valueOf((byte)0),Byte.valueOf((byte)79)};
    Object v13 = -45;
    Object v14 = 0;
    Object v15 = new java.io.ByteArrayInputStream(((byte[])v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new byte[]{Byte.valueOf((byte)7),Byte.valueOf((byte)-7)};
    Object v17 = 9;
    Object v18 = 60;
    Object v19 = true;
    Object v20 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v11),((java.io.InputStream)v15),((byte[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v23 = new char[]{};
    Object v24 = -18;
    Object v25 = 1;
    Object v26 = true;
    Object v27 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v6),(((java.lang.Integer)v7).intValue()),((java.io.Reader)v20),((com.fasterxml.jackson.core.ObjectCodec)v21),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v22),((char[])v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Boolean)v26).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).copyCurrentEvent(((com.fasterxml.jackson.core.JsonParser)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "'";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRaw(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v4 = false;
    Object v5 = ((com.fasterxml.jackson.core.JsonGenerator)v2).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ")";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeObjectFieldStart(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ", second 0x";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRaw(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = 3;
    Object v16 = ((com.fasterxml.jackson.core.base.GeneratorBase)v14).setFeatureMask((((java.lang.Integer)v15).intValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v2).canOmitFields();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v2).getSchema();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)-48)};
    Object v4 = 1;
    Object v5 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRawUTF8String(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ": ";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = 3;
    Object v16 = ((com.fasterxml.jackson.core.base.GeneratorBase)v14).setFeatureMask((((java.lang.Integer)v15).intValue()));
    ((com.fasterxml.jackson.core.base.GeneratorBase)v16).flush();
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v3),((java.lang.Object)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 31;
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v9 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v8),((java.lang.Object)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new byte[]{Byte.valueOf((byte)-3),Byte.valueOf((byte)0),Byte.valueOf((byte)79)};
    Object v13 = -45;
    Object v14 = 0;
    Object v15 = new java.io.ByteArrayInputStream(((byte[])v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new byte[]{Byte.valueOf((byte)7),Byte.valueOf((byte)-7)};
    Object v17 = 9;
    Object v18 = 60;
    Object v19 = true;
    Object v20 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v11),((java.io.InputStream)v15),((byte[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v23 = new char[]{};
    Object v24 = -18;
    Object v25 = 1;
    Object v26 = true;
    Object v27 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v6),(((java.lang.Integer)v7).intValue()),((java.io.Reader)v20),((com.fasterxml.jackson.core.ObjectCodec)v21),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v22),((char[])v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = ((com.fasterxml.jackson.core.JsonParser)v27).getValueAsString();
    ((com.fasterxml.jackson.core.JsonGenerator)v2).copyCurrentEvent(((com.fasterxml.jackson.core.JsonParser)v27));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)255)};
    Object v4 = 37;
    Object v5 = 3;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeString(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNull();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{};
    Object v4 = 6;
    Object v5 = 1;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeUTF8String(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -2;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ": ";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = "nuli";
    ((com.fasterxml.jackson.core.base.GeneratorBase)v19).writeRawValue(((java.lang.String)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "No ObjectCodec defined";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeFieldName(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = 55;
    Object v16 = 0;
    Object v17 = ((com.fasterxml.jackson.core.base.GeneratorBase)v14).overrideStdFeatures((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = 55;
    Object v16 = 0;
    Object v17 = ((com.fasterxml.jackson.core.base.GeneratorBase)v14).overrideStdFeatures((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v17).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = 3;
    Object v16 = ((com.fasterxml.jackson.core.base.GeneratorBase)v14).setFeatureMask((((java.lang.Integer)v15).intValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v16).writeStartObject();
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ": ";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = 0;
    Object v21 = ((com.fasterxml.jackson.core.base.GeneratorBase)v19).setFeatureMask((((java.lang.Integer)v20).intValue()));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeStartArray();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ((com.fasterxml.jackson.core.base.GeneratorBase)v16).useDefaultPrettyPrinter();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "Current token (";
    Object v4 = 2;
    Object v5 = 37;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRaw(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ", expecting field name";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeObjectFieldStart(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v2).getOutputTarget();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = 55;
    Object v16 = 0;
    Object v17 = ((com.fasterxml.jackson.core.base.GeneratorBase)v14).overrideStdFeatures((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v17).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v18));
    Object v20 = -25;
    Object v21 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v19).setHighestNonEscapedChar((((java.lang.Integer)v20).intValue()));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new char[]{};
    Object v4 = 4;
    Object v5 = 4;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeString(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "P: ";
    Object v4 = -11;
    Object v5 = -19;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRaw(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -1.0D;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{};
    Object v4 = 1;
    Object v5 = 1;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeUTF8String(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ": ";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = 0;
    Object v21 = ((com.fasterxml.jackson.core.base.GeneratorBase)v19).setFeatureMask((((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.fasterxml.jackson.core.base.GeneratorBase)v21).getCurrentValue();
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeFieldName(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ((com.fasterxml.jackson.core.base.GeneratorBase)v16).useDefaultPrettyPrinter();
    Object v18 = new byte[]{Byte.valueOf((byte)3)};
    Object v19 = 2;
    Object v20 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v17).writeUTF8String(((byte[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 0.0F;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber((((java.lang.Float)v3).floatValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ": ";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = 0;
    Object v21 = ((com.fasterxml.jackson.core.base.GeneratorBase)v19).setFeatureMask((((java.lang.Integer)v20).intValue()));
    Object v22 = "";
    Object v23 = "/pom.properties";
    ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v21).writeStringField(((java.lang.String)v22),((java.lang.String)v23));
    Object v24 = null;
    Object v25 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v21).version();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = false;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeBoolean((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ((com.fasterxml.jackson.core.base.GeneratorBase)v16).useDefaultPrettyPrinter();
    Object v18 = new byte[]{Byte.valueOf((byte)-3),Byte.valueOf((byte)0),Byte.valueOf((byte)79)};
    Object v19 = -45;
    Object v20 = 0;
    Object v21 = new java.io.ByteArrayInputStream(((byte[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 69;
    Object v23 = ((com.fasterxml.jackson.core.JsonGenerator)v17).writeBinary(((java.io.InputStream)v21),(((java.lang.Integer)v22).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = null;
    Object v18 = true;
    Object v19 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v17),(((java.lang.Boolean)v18).booleanValue()));
    ((com.fasterxml.jackson.core.base.GeneratorBase)v16).writeObject(((java.lang.Object)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeEndObject();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v3),((java.lang.Object)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 31;
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v9 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v8),((java.lang.Object)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new byte[]{Byte.valueOf((byte)-3),Byte.valueOf((byte)0),Byte.valueOf((byte)79)};
    Object v13 = -45;
    Object v14 = 0;
    Object v15 = new java.io.ByteArrayInputStream(((byte[])v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new byte[]{Byte.valueOf((byte)7),Byte.valueOf((byte)-7)};
    Object v17 = 9;
    Object v18 = 60;
    Object v19 = true;
    Object v20 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v11),((java.io.InputStream)v15),((byte[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
    Object v23 = new char[]{};
    Object v24 = -18;
    Object v25 = 1;
    Object v26 = true;
    Object v27 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(((com.fasterxml.jackson.core.io.IOContext)v6),(((java.lang.Integer)v7).intValue()),((java.io.Reader)v20),((com.fasterxml.jackson.core.ObjectCodec)v21),((com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer)v22),((char[])v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = 0;
    Object v29 = ((com.fasterxml.jackson.core.JsonParser)v27).hasTokenId((((java.lang.Integer)v28).intValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).copyCurrentStructure(((com.fasterxml.jackson.core.JsonParser)v27));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ": ";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = 0;
    Object v21 = ((com.fasterxml.jackson.core.base.GeneratorBase)v19).setFeatureMask((((java.lang.Integer)v20).intValue()));
    ((com.fasterxml.jackson.core.base.GeneratorBase)v21).flush();
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "NaN";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRaw(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = 55;
    Object v16 = 0;
    Object v17 = ((com.fasterxml.jackson.core.base.GeneratorBase)v14).overrideStdFeatures((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v17).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v18));
    Object v20 = -25;
    Object v21 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v19).setHighestNonEscapedChar((((java.lang.Integer)v20).intValue()));
    Object v22 = "was expecting either '*' or '/' for a comment";
    ((com.fasterxml.jackson.core.JsonGenerator)v21).writeFieldName(((java.lang.String)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 5L;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber((((java.lang.Long)v3).longValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v2).canWriteBinaryNatively();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ": ";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.core.base.GeneratorBase)v19).setCodec(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = 1;
    Object v23 = 6;
    ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v19)._checkStdFeatureChanges((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "Invalid custom escape definitions; custom escape not found for characterQ code 0x";
    Object v4 = null;
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v4),(((java.lang.Boolean)v5).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeObjectField(((java.lang.String)v3),((java.lang.Object)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ": ";
    Object v4 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v3));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeObjectRef(((java.lang.Object)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v4 = new byte[]{};
    Object v5 = 43;
    Object v6 = 17;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v3),((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = 3;
    Object v16 = ((com.fasterxml.jackson.core.base.GeneratorBase)v14).setFeatureMask((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v18 = ((java.lang.Enum)v17).hashCode();
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v17));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = Short.valueOf((short)1);
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber((((java.lang.Short)v3).shortValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = " in a comment";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRaw(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ": ";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.core.JsonGenerator)v19).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "write a binary vaue";
    Object v4 = 45.55498713467616D;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumberField(((java.lang.String)v3),(((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = 55;
    Object v16 = 0;
    Object v17 = ((com.fasterxml.jackson.core.base.GeneratorBase)v14).overrideStdFeatures((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v17).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v18));
    Object v20 = ((com.fasterxml.jackson.core.base.GeneratorBase)v19).getOutputContext();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ": ";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = 0;
    Object v21 = ((com.fasterxml.jackson.core.base.GeneratorBase)v19).setFeatureMask((((java.lang.Integer)v20).intValue()));
    Object v22 = "NaN";
    ((com.fasterxml.jackson.core.JsonGenerator)v21).writeNumber(((java.lang.String)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ": ";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.core.JsonGenerator)v19).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v24 = new byte[]{Byte.valueOf((byte)-3),Byte.valueOf((byte)0),Byte.valueOf((byte)79)};
    Object v25 = -45;
    Object v26 = 0;
    Object v27 = new java.io.ByteArrayInputStream(((byte[])v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = -1;
    Object v29 = ((com.fasterxml.jackson.core.base.GeneratorBase)v22).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v23),((java.io.InputStream)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = ": ";
    Object v31 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v30));
    Object v32 = ((com.fasterxml.jackson.core.SerializableString)v31).asQuotedUTF8();
    Object v33 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v22).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v31));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = 3;
    Object v16 = ((com.fasterxml.jackson.core.base.GeneratorBase)v14).setFeatureMask((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.fasterxml.jackson.core.base.GeneratorBase)v16).useDefaultPrettyPrinter();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ": ";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.core.JsonGenerator)v19).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v24 = new byte[]{Byte.valueOf((byte)-3),Byte.valueOf((byte)0),Byte.valueOf((byte)79)};
    Object v25 = -45;
    Object v26 = 0;
    Object v27 = new java.io.ByteArrayInputStream(((byte[])v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = -1;
    Object v29 = ((com.fasterxml.jackson.core.base.GeneratorBase)v22).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v23),((java.io.InputStream)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = ": ";
    Object v31 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v30));
    Object v32 = ((com.fasterxml.jackson.core.SerializableString)v31).asQuotedUTF8();
    Object v33 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v22).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v31));
    Object v34 = new byte[]{};
    Object v35 = 21;
    Object v36 = 1;
    ((com.fasterxml.jackson.core.JsonGenerator)v33).writeUTF8String(((byte[])v34),(((java.lang.Integer)v35).intValue()),(((java.lang.Integer)v36).intValue()));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v4 = ((com.fasterxml.jackson.core.Base64Variant)v3).hashCode();
    Object v5 = new byte[]{Byte.valueOf((byte)0)};
    Object v6 = 4;
    Object v7 = 34;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v3),((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = 3;
    Object v16 = ((com.fasterxml.jackson.core.base.GeneratorBase)v14).setFeatureMask((((java.lang.Integer)v15).intValue()));
    Object v17 = 28;
    Object v18 = 1;
    Object v19 = ((com.fasterxml.jackson.core.base.GeneratorBase)v16).overrideStdFeatures((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ((com.fasterxml.jackson.core.base.GeneratorBase)v16).useDefaultPrettyPrinter();
    Object v18 = null;
    Object v19 = true;
    Object v20 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    ((com.fasterxml.jackson.core.base.GeneratorBase)v17).writeObject(((java.lang.Object)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeStartObject();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)1)};
    Object v4 = 2;
    Object v5 = -50;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRawUTF8String(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = 3;
    Object v16 = ((com.fasterxml.jackson.core.base.GeneratorBase)v14).setFeatureMask((((java.lang.Integer)v15).intValue()));
    Object v17 = 28;
    Object v18 = 1;
    Object v19 = ((com.fasterxml.jackson.core.base.GeneratorBase)v16).overrideStdFeatures((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = 2.0F;
    ((com.fasterxml.jackson.core.JsonGenerator)v19).writeNumber((((java.lang.Float)v20).floatValue()));
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v23 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v19).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = 3;
    Object v16 = ((com.fasterxml.jackson.core.base.GeneratorBase)v14).setFeatureMask((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.fasterxml.jackson.core.base.GeneratorBase)v16).useDefaultPrettyPrinter();
    Object v18 = false;
    ((com.fasterxml.jackson.core.JsonGenerator)v17).writeBoolean((((java.lang.Boolean)v18).booleanValue()));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = 3;
    Object v16 = ((com.fasterxml.jackson.core.base.GeneratorBase)v14).setFeatureMask((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.fasterxml.jackson.core.base.GeneratorBase)v16).useDefaultPrettyPrinter();
    Object v18 = "";
    Object v19 = "'";
    ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v17).writeStringField(((java.lang.String)v18),((java.lang.String)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "read(buf,";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNullField(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ": ";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.core.JsonGenerator)v19).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = "true";
    ((com.fasterxml.jackson.core.JsonGenerator)v22).writeNumber(((java.lang.String)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ": ";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.core.JsonGenerator)v19).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v24 = new byte[]{Byte.valueOf((byte)-3),Byte.valueOf((byte)0),Byte.valueOf((byte)79)};
    Object v25 = -45;
    Object v26 = 0;
    Object v27 = new java.io.ByteArrayInputStream(((byte[])v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = -1;
    Object v29 = ((com.fasterxml.jackson.core.base.GeneratorBase)v22).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v23),((java.io.InputStream)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = ": ";
    Object v31 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v30));
    Object v32 = ((com.fasterxml.jackson.core.SerializableString)v31).asQuotedUTF8();
    Object v33 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v22).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v31));
    Object v34 = 0.0F;
    ((com.fasterxml.jackson.core.JsonGenerator)v33).writeNumber((((java.lang.Float)v34).floatValue()));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ": ";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.core.JsonGenerator)v19).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = "";
    ((com.fasterxml.jackson.core.JsonGenerator)v22).writeOmittedField(((java.lang.String)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ": ";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.core.JsonGenerator)v19).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = "'";
    Object v24 = 22.804284277877635D;
    ((com.fasterxml.jackson.core.JsonGenerator)v22).writeNumberField(((java.lang.String)v23),(((java.lang.Double)v24).doubleValue()));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ": ";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.core.JsonGenerator)v19).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.core.base.GeneratorBase)v22).getCodec();
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ": ";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.core.JsonGenerator)v19).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v24 = new byte[]{Byte.valueOf((byte)-3),Byte.valueOf((byte)0),Byte.valueOf((byte)79)};
    Object v25 = -45;
    Object v26 = 0;
    Object v27 = new java.io.ByteArrayInputStream(((byte[])v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = -1;
    Object v29 = ((com.fasterxml.jackson.core.base.GeneratorBase)v22).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v23),((java.io.InputStream)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = ": ";
    Object v31 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v30));
    Object v32 = ((com.fasterxml.jackson.core.SerializableString)v31).asQuotedUTF8();
    Object v33 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v22).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v31));
    Object v34 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
    Object v35 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v33).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = 2;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).setHighestNonEscapedChar((((java.lang.Integer)v15).intValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 125;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v11 = -28;
    Object v12 = new com.fasterxml.jackson.core.util.ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.core.io.UTF8Writer(((com.fasterxml.jackson.core.io.IOContext)v9),((java.io.OutputStream)v12));
    Object v14 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v16 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v14).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    Object v17 = ": ";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v16).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v18));
    Object v20 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.core.JsonGenerator)v19).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v24 = new byte[]{Byte.valueOf((byte)-3),Byte.valueOf((byte)0),Byte.valueOf((byte)79)};
    Object v25 = -45;
    Object v26 = 0;
    Object v27 = new java.io.ByteArrayInputStream(((byte[])v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = -1;
    Object v29 = ((com.fasterxml.jackson.core.base.GeneratorBase)v22).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v23),((java.io.InputStream)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = ": ";
    Object v31 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v30));
    Object v32 = ((com.fasterxml.jackson.core.SerializableString)v31).asQuotedUTF8();
    Object v33 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v22).setRootValueSeparator(((com.fasterxml.jackson.core.SerializableString)v31));
    Object v34 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
    Object v35 = ((com.fasterxml.jackson.core.json.JsonGeneratorImpl)v33).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v34));
    Object v36 = ((com.fasterxml.jackson.core.JsonGenerator)v35).getCodec();
    ((com.fasterxml.jackson.core.JsonGenerator)v35).writeStartArray();
    Object v37 = null;
    org.junit.Assert.assertNull(v37);
  }
}
