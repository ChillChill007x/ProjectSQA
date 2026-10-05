package com.fasterxml.jackson.databind;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = ", ";
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.String)v4));
    Object v6 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = ", ";
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.String)v8));
    Object v10 = ((java.lang.Throwable)v9).fillInStackTrace();
    Object v11 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = ((com.fasterxml.jackson.databind.JsonMappingException)v3)._buildMessage();
    org.junit.Assert.assertEquals((Object)(", "), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = 1;
    ((com.fasterxml.jackson.databind.JsonMappingException)v3).prependPath(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = ", ";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.Throwable)v6).fillInStackTrace();
    Object v8 = ((com.fasterxml.jackson.databind.JsonMappingException)v7)._buildMessage();
    Object v9 = new java.lang.StringBuilder(((java.lang.CharSequence)v8));
    ((com.fasterxml.jackson.databind.JsonMappingException)v3)._appendPathDesc(((java.lang.StringBuilder)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v6));
    Object v8 = ((java.lang.Throwable)v7).getSuppressed();
    Object v9 = ((java.lang.Throwable)v7).getSuppressed();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "WRITE_ENUMS_USING_INDEX";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "WRITE_ENUMS_USING_INDEX";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = ", ";
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.String)v6));
    ((java.lang.Throwable)v4).addSuppressed(((java.lang.Throwable)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "WRITE_ENUMS_USING_INDEX";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = ", ";
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.String)v6));
    Object v8 = ((java.lang.Throwable)v7).fillInStackTrace();
    Object v9 = ((com.fasterxml.jackson.databind.JsonMappingException)v8)._buildMessage();
    Object v10 = new java.lang.StringBuilder(((java.lang.CharSequence)v9));
    ((com.fasterxml.jackson.databind.JsonMappingException)v4)._appendPathDesc(((java.lang.StringBuilder)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "se";
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = -19L;
    Object v8 = 0L;
    Object v9 = 0;
    Object v10 = 0;
    Object v11 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v6),(((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.JsonLocation)v11).hashCode();
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3),((com.fasterxml.jackson.core.JsonLocation)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonMappingException)v7).getPath();
    Object v9 = ((com.fasterxml.jackson.databind.JsonMappingException)v7).getPath();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = ((java.lang.Throwable)v3).getCause();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "WRITE_ENUMS_USING_INDEX";
    Object v8 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v6),((java.lang.String)v7));
    ((java.lang.Throwable)v3).addSuppressed(((java.lang.Throwable)v8));
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.databind.JsonMappingException)v3)._buildMessage();
    org.junit.Assert.assertEquals((Object)(", "), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "se";
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = -19L;
    Object v8 = 0L;
    Object v9 = 0;
    Object v10 = 0;
    Object v11 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v6),(((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.JsonLocation)v11).hashCode();
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3),((com.fasterxml.jackson.core.JsonLocation)v11));
    Object v14 = new java.lang.StackTraceElement[]{};
    ((java.lang.Throwable)v13).setStackTrace(((java.lang.StackTraceElement[])v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = ((com.fasterxml.jackson.databind.JsonMappingException)v3).getPath();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.JsonMappingException.Reference)v6).getDescription();
    ((com.fasterxml.jackson.databind.JsonMappingException)v3).prependPath(((com.fasterxml.jackson.databind.JsonMappingException.Reference)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "WRITE_ENUMS_USING_INDEX";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = ", problem";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = new java.io.PrintWriter(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    ((java.lang.Throwable)v4).printStackTrace(((java.io.PrintWriter)v7));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = 0;
    Object v11 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v4),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = 0;
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = -19L;
    Object v5 = 0L;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "se";
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = 0;
    Object v15 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = -19L;
    Object v17 = 0L;
    Object v18 = 0;
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v15),(((java.lang.Long)v16).longValue()),(((java.lang.Long)v17).longValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.fasterxml.jackson.core.JsonLocation)v20).hashCode();
    Object v22 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v11),((java.lang.String)v12),((com.fasterxml.jackson.core.JsonLocation)v20));
    Object v23 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0),((com.fasterxml.jackson.core.JsonLocation)v8),((java.lang.Throwable)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = ", ";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.Throwable)v6).fillInStackTrace();
    Object v8 = ((com.fasterxml.jackson.databind.JsonMappingException)v7)._buildMessage();
    Object v9 = new java.lang.StringBuilder(((java.lang.CharSequence)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = ", ";
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.String)v11));
    Object v13 = ((java.lang.Throwable)v12).fillInStackTrace();
    Object v14 = ((com.fasterxml.jackson.databind.JsonMappingException)v13)._buildMessage();
    Object v15 = ((java.lang.StringBuilder)v9).append(((java.lang.Object)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JsonMappingException)v3).getPathReference(((java.lang.StringBuilder)v9));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = ", problem";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintWriter(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = "array";
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = 0;
    Object v7 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = -19L;
    Object v9 = 0L;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v7),(((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "se";
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = 0;
    Object v19 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = -19L;
    Object v21 = 0L;
    Object v22 = 0;
    Object v23 = 0;
    Object v24 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v19),(((java.lang.Long)v20).longValue()),(((java.lang.Long)v21).longValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.fasterxml.jackson.core.JsonLocation)v24).hashCode();
    Object v26 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v15),((java.lang.String)v16),((com.fasterxml.jackson.core.JsonLocation)v24));
    Object v27 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v4),((com.fasterxml.jackson.core.JsonLocation)v12),((java.lang.Throwable)v26));
    Object v28 = ", problem";
    Object v29 = java.nio.charset.Charset.defaultCharset();
    Object v30 = new java.io.PrintWriter(((java.lang.String)v28),((java.nio.charset.Charset)v29));
    ((java.lang.Throwable)v27).printStackTrace(((java.io.PrintWriter)v30));
    Object v31 = null;
    Object v32 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3),((java.lang.Throwable)v27));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = ((java.lang.Throwable)v3).fillInStackTrace();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = ((java.lang.Throwable)v3).fillInStackTrace();
    Object v5 = ", problem";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = new java.io.PrintWriter(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    ((java.lang.Throwable)v4).printStackTrace(((java.io.PrintWriter)v7));
    Object v8 = null;
    Object v9 = new java.lang.StackTraceElement[]{null};
    ((java.lang.Throwable)v4).setStackTrace(((java.lang.StackTraceElement[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "WRITE_ENUMS_USING_INDEX";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).getCause();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "WRITE_ENUMS_USING_INDEX";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = ", problem";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = new java.io.PrintWriter(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    ((java.lang.Throwable)v4).printStackTrace(((java.io.PrintWriter)v7));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = 0;
    Object v11 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v4),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = ", ";
    Object v15 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v13),((java.lang.String)v14));
    Object v16 = ((java.lang.Throwable)v15).fillInStackTrace();
    Object v17 = ((com.fasterxml.jackson.databind.JsonMappingException)v16)._buildMessage();
    Object v18 = new java.lang.StringBuilder(((java.lang.CharSequence)v17));
    Object v19 = ((com.fasterxml.jackson.databind.JsonMappingException)v12).getPathReference(((java.lang.StringBuilder)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = ", problem";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintWriter(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    ((java.io.Closeable)v2).close();
    Object v3 = null;
    Object v4 = "Mismatching names (";
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = ", ";
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.String)v6));
    Object v8 = ((java.lang.Throwable)v7).fillInStackTrace();
    Object v9 = ((java.lang.Throwable)v8).fillInStackTrace();
    Object v10 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v4),((java.lang.Throwable)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.DeserializationContext)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = ", ";
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.String)v4));
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    Object v7 = ((com.fasterxml.jackson.databind.JsonMappingException)v6)._buildMessage();
    Object v8 = new java.lang.StringBuilder(((java.lang.CharSequence)v7));
    ((com.fasterxml.jackson.databind.JsonMappingException)v2)._appendPathDesc(((java.lang.StringBuilder)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonMappingException)v2).getPath();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    ((com.fasterxml.jackson.databind.JsonMappingException)v2).prependPath(((java.lang.Object)v3),((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = ((java.lang.Throwable)v3).getStackTrace();
    Object v5 = ((java.lang.Throwable)v3).getSuppressed();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = ((java.lang.Throwable)v3).fillInStackTrace();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = ", ";
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.String)v6));
    Object v8 = ((java.lang.Throwable)v7).fillInStackTrace();
    Object v9 = ((java.lang.Throwable)v8).fillInStackTrace();
    ((java.lang.Throwable)v4).addSuppressed(((java.lang.Throwable)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = ", problem";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintWriter(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = "overflow, value cannot be represented as 8-bit value";
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = ", ";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.Throwable)v6).fillInStackTrace();
    Object v8 = ((java.lang.Throwable)v7).fillInStackTrace();
    Object v9 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3),((java.lang.Throwable)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "o";
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = ", ";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).fillInStackTrace();
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1),((java.lang.Throwable)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "WRITE_ENUMS_USING_INDEX";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = ", problem";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = new java.io.PrintWriter(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    ((java.lang.Throwable)v4).printStackTrace(((java.io.PrintWriter)v7));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = 0;
    Object v11 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v4),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v11));
    Object v13 = ((com.fasterxml.jackson.core.JsonProcessingException)v12).getOriginalMessage();
    org.junit.Assert.assertEquals((Object)("WRITE_ENUMS_USING_INDEX"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = ", problem";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintWriter(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = "overflow, value cannot be represented as 8-bit value";
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = ", ";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.Throwable)v6).fillInStackTrace();
    Object v8 = ((java.lang.Throwable)v7).fillInStackTrace();
    Object v9 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3),((java.lang.Throwable)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = ", ";
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.String)v11));
    Object v13 = ((java.lang.Throwable)v12).fillInStackTrace();
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = 0;
    Object v16 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v13),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v16));
    Object v18 = ((java.lang.Throwable)v17).getSuppressed();
    Object v19 = ((java.lang.Throwable)v9).initCause(((java.lang.Throwable)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = ((java.lang.Throwable)v3).fillInStackTrace();
    Object v5 = ", problem";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = new java.io.PrintWriter(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    ((java.lang.Throwable)v4).printStackTrace(((java.io.PrintWriter)v7));
    Object v8 = null;
    Object v9 = new java.lang.StackTraceElement[]{null,null};
    ((java.lang.Throwable)v4).setStackTrace(((java.lang.StackTraceElement[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = ", problem";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintWriter(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = "overflow, value cannot be represented as 8-bit value";
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = ", ";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.Throwable)v6).fillInStackTrace();
    Object v8 = ((java.lang.Throwable)v7).fillInStackTrace();
    Object v9 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3),((java.lang.Throwable)v8));
    Object v10 = new java.lang.StackTraceElement[]{null};
    ((java.lang.Throwable)v9).setStackTrace(((java.lang.StackTraceElement[])v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.DeserializationContext)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = ", ";
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.String)v6));
    Object v8 = ((java.lang.Throwable)v7).fillInStackTrace();
    Object v9 = ((java.lang.Throwable)v8).fillInStackTrace();
    ((java.lang.Throwable)v4).addSuppressed(((java.lang.Throwable)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((java.io.Closeable)v2).close();
    Object v3 = null;
    Object v4 = ")4";
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = 0;
    Object v7 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = -19L;
    Object v9 = 0L;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v7),(((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v4),((com.fasterxml.jackson.core.JsonLocation)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "] (";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).getCause();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "] (";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = "";
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.String)v8));
    ((java.lang.Throwable)v9).printStackTrace();
    Object v10 = null;
    Object v11 = ((java.lang.Throwable)v4).initCause(((java.lang.Throwable)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "(";
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = ", ";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.Throwable)v6).fillInStackTrace();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = 0;
    Object v10 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v7),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v10));
    Object v12 = ((java.lang.Throwable)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.DeserializationContext)v2),((java.lang.String)v3),((java.lang.Throwable)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "Trying to resolve a forwar.d reference with id [";
    Object v1 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "Trying to resolve a forwar.d reference with id [";
    Object v1 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getSuppressed();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "] (";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.core.JsonProcessingException)v4).getOriginalMessage();
    Object v6 = ((com.fasterxml.jackson.databind.JsonMappingException)v4).getPathReference();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = ((java.lang.Throwable)v3).fillInStackTrace();
    Object v5 = ((java.lang.Throwable)v4).getSuppressed();
    Object v6 = new java.io.ByteArrayOutputStream();
    Object v7 = new java.io.PrintStream(((java.io.OutputStream)v6));
    Object v8 = -5.25916F;
    ((java.io.PrintStream)v7).print((((java.lang.Float)v8).floatValue()));
    Object v9 = null;
    ((java.lang.Throwable)v4).printStackTrace(((java.io.PrintStream)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "Trying to resolve a forwar.d reference with id [";
    Object v1 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonMappingException)v1).getLocalizedMessage();
    org.junit.Assert.assertEquals((Object)("Trying to resolve a forwar.d reference with id ["), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "WRITE_ENUMS_USING_INDEX";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonMappingException)v4).getProcessor();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "] (";
    Object v7 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v5),((java.lang.String)v6));
    Object v8 = ", problem";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintWriter(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    ((java.lang.Throwable)v7).printStackTrace(((java.io.PrintWriter)v10));
    Object v11 = null;
    ((java.lang.Throwable)v2).addSuppressed(((java.lang.Throwable)v7));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "o";
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = ", ";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).fillInStackTrace();
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1),((java.lang.Throwable)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonMappingException)v7).toString();
    org.junit.Assert.assertEquals((Object)("com.fasterxml.jackson.databind.JsonMappingException: o"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = ((java.lang.Throwable)v3).fillInStackTrace();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = ", ";
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.String)v6));
    Object v8 = ((java.lang.Throwable)v7).fillInStackTrace();
    Object v9 = ((java.lang.Throwable)v8).fillInStackTrace();
    Object v10 = 1;
    Object v11 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v4),((java.lang.Object)v9),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = 0;
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = -19L;
    Object v5 = 0L;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "se";
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = 0;
    Object v15 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = -19L;
    Object v17 = 0L;
    Object v18 = 0;
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v15),(((java.lang.Long)v16).longValue()),(((java.lang.Long)v17).longValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.fasterxml.jackson.core.JsonLocation)v20).hashCode();
    Object v22 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v11),((java.lang.String)v12),((com.fasterxml.jackson.core.JsonLocation)v20));
    Object v23 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0),((com.fasterxml.jackson.core.JsonLocation)v8),((java.lang.Throwable)v22));
    ((java.lang.Throwable)v23).printStackTrace();
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = "?";
    Object v2 = "Trying to resolve a forwar.d reference with id [";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v2));
    Object v4 = ((java.lang.Throwable)v3).toString();
    Object v5 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1),((java.lang.Throwable)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = ((java.lang.Throwable)v3).fillInStackTrace();
    Object v5 = ((java.lang.Throwable)v4).getCause();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = "stSring";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = "stSring";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonMappingException)v2).getPath();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v6));
    Object v8 = "Trying to resolve a forwar.d reference with id [";
    Object v9 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v8));
    Object v10 = ((java.lang.Throwable)v7).initCause(((java.lang.Throwable)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "o";
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = ", ";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).fillInStackTrace();
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1),((java.lang.Throwable)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonMappingException)v7)._buildMessage();
    org.junit.Assert.assertEquals((Object)("o"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 22;
    Object v3 = 16.256163F;
    Object v4 = new java.util.HashMap((((java.lang.Integer)v2).intValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = "";
    Object v9 = new java.io.ByteArrayOutputStream();
    Object v10 = "stSring";
    Object v11 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v9),((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v7),((java.lang.String)v8),((java.lang.Throwable)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "Trying to resolve a forwar.d reference with id [";
    Object v1 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v2),(((java.lang.Integer)v3).intValue()));
    ((com.fasterxml.jackson.databind.JsonMappingException)v1).prependPath(((com.fasterxml.jackson.databind.JsonMappingException.Reference)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v6));
    Object v8 = "Trying to resolve a forwar.d reference with id [";
    Object v9 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v8));
    Object v10 = ((java.lang.Throwable)v7).initCause(((java.lang.Throwable)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = ", ";
    Object v13 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.String)v12));
    ((java.lang.Throwable)v10).addSuppressed(((java.lang.Throwable)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = ", ";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.Throwable)v10).fillInStackTrace();
    Object v12 = ((com.fasterxml.jackson.databind.JsonMappingException)v11)._buildMessage();
    Object v13 = new java.lang.StringBuilder(((java.lang.CharSequence)v12));
    ((com.fasterxml.jackson.databind.JsonMappingException)v7)._appendPathDesc(((java.lang.StringBuilder)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "Trying to resolve a forwar.d reference with id [";
    Object v1 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonMappingException)v1)._buildMessage();
    org.junit.Assert.assertEquals((Object)("Trying to resolve a forwar.d reference with id ["), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "Trying to resolve a forwar.d reference with id [";
    Object v1 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).fillInStackTrace();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "Trying to resolve a forwar.d reference with id [";
    Object v1 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).fillInStackTrace();
    Object v3 = ((com.fasterxml.jackson.databind.JsonMappingException)v2)._buildMessage();
    org.junit.Assert.assertEquals((Object)("Trying to resolve a forwar.d reference with id ["), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v6));
    Object v8 = "Trying to resolve a forwar.d reference with id [";
    Object v9 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v8));
    Object v10 = ((java.lang.Throwable)v9).fillInStackTrace();
    ((java.lang.Throwable)v7).addSuppressed(((java.lang.Throwable)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = "stSring";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = ", ";
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.String)v4));
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "WRITE_ENUMS_USING_INDEX";
    Object v11 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v9),((java.lang.String)v10));
    ((java.lang.Throwable)v6).addSuppressed(((java.lang.Throwable)v11));
    Object v12 = null;
    Object v13 = ((com.fasterxml.jackson.databind.JsonMappingException)v6)._buildMessage();
    Object v14 = 0;
    Object v15 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v2),((java.lang.Object)v13),(((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = "stSring";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1));
    Object v3 = new java.lang.StackTraceElement[]{};
    ((java.lang.Throwable)v2).setStackTrace(((java.lang.StackTraceElement[])v3));
    Object v4 = null;
    Object v5 = "Trying to resolve a forwar.d reference with id [";
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v5));
    Object v7 = ((java.lang.Throwable)v6).fillInStackTrace();
    ((java.lang.Throwable)v2).addSuppressed(((java.lang.Throwable)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "iems";
    Object v4 = "Trying to resolve a forwar.d reference with id [";
    Object v5 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.DeserializationContext)v2),((java.lang.String)v3),((java.lang.Throwable)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "Trying to resolve a forwar.d reference with id [";
    Object v1 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).fillInStackTrace();
    Object v3 = ", problem";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new java.io.PrintWriter(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    ((java.lang.Throwable)v2).printStackTrace(((java.io.PrintWriter)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "o";
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = ", ";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).fillInStackTrace();
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1),((java.lang.Throwable)v6));
    Object v8 = ((java.lang.Throwable)v7).getStackTrace();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = ", ";
    Object v11 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v9),((java.lang.String)v10));
    Object v12 = ((java.lang.Throwable)v11).fillInStackTrace();
    Object v13 = ((java.lang.Throwable)v7).initCause(((java.lang.Throwable)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "WRITE_ENUMS_USING_INDEX";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).getStackTrace();
    Object v6 = ((com.fasterxml.jackson.databind.JsonMappingException)v4).toString();
    org.junit.Assert.assertEquals((Object)("com.fasterxml.jackson.databind.JsonMappingException: WRITE_ENUMS_USING_INDEX"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "Trying to resolve a forwar.d reference with id [";
    Object v1 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0));
    Object v2 = new java.lang.StackTraceElement[]{null,null,null};
    ((java.lang.Throwable)v1).setStackTrace(((java.lang.StackTraceElement[])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = "stSring";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1));
    ((java.lang.Throwable)v2).printStackTrace();
    Object v3 = null;
    Object v4 = ((com.fasterxml.jackson.databind.JsonMappingException)v2).getPath();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "WRITE_ENUMS_USING_INDEX";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = new java.io.ByteArrayOutputStream();
    Object v6 = new java.io.PrintStream(((java.io.OutputStream)v5));
    Object v7 = "strin:";
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v4),((java.lang.Object)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "] (";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).getCause();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "Trying to resolve a forwar.d reference with id [";
    Object v1 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).fillInStackTrace();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = "o";
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = ", ";
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.String)v6));
    Object v8 = ((java.lang.Throwable)v7).fillInStackTrace();
    Object v9 = ((java.lang.Throwable)v8).fillInStackTrace();
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.String)v4),((java.lang.Throwable)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v2),((java.lang.Object)v10),((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v6));
    ((com.fasterxml.jackson.core.JsonProcessingException)v7).clearLocation();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = 0;
    Object v5 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v2),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = ((java.lang.Throwable)v3).fillInStackTrace();
    Object v5 = ((java.lang.Throwable)v4).fillInStackTrace();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.DeserializationContext)v2),((java.lang.String)v3));
    ((com.fasterxml.jackson.core.JsonProcessingException)v4).clearLocation();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = ((java.lang.Throwable)v3).fillInStackTrace();
    Object v5 = ((com.fasterxml.jackson.databind.JsonMappingException)v4).getPath();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = "?";
    Object v2 = "Trying to resolve a forwar.d reference with id [";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v2));
    Object v4 = ((java.lang.Throwable)v3).toString();
    Object v5 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1),((java.lang.Throwable)v3));
    Object v6 = new java.lang.StackTraceElement[]{};
    ((java.lang.Throwable)v5).setStackTrace(((java.lang.StackTraceElement[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "WRITE_ENUMS_USING_INDEX";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonMappingException)v4).getProcessor();
    Object v6 = ":]";
    Object v7 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "Trying to resolve a forwar.d reference with id [";
    Object v1 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).fillInStackTrace();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = ", ";
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.String)v4));
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = ", ";
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.String)v8));
    Object v10 = ((java.lang.Throwable)v9).fillInStackTrace();
    Object v11 = ((com.fasterxml.jackson.databind.JsonMappingException)v10)._buildMessage();
    Object v12 = new java.lang.StringBuilder(((java.lang.CharSequence)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = ", ";
    Object v15 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v13),((java.lang.String)v14));
    Object v16 = ((java.lang.Throwable)v15).fillInStackTrace();
    Object v17 = ((com.fasterxml.jackson.databind.JsonMappingException)v16)._buildMessage();
    Object v18 = ((java.lang.StringBuilder)v12).append(((java.lang.Object)v17));
    Object v19 = ((com.fasterxml.jackson.databind.JsonMappingException)v6).getPathReference(((java.lang.StringBuilder)v12));
    ((com.fasterxml.jackson.databind.JsonMappingException)v2)._appendPathDesc(((java.lang.StringBuilder)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = "?";
    Object v2 = "Trying to resolve a forwar.d reference with id [";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v2));
    Object v4 = ((java.lang.Throwable)v3).toString();
    Object v5 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1),((java.lang.Throwable)v3));
    Object v6 = ((com.fasterxml.jackson.databind.JsonMappingException)v5).getPath();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = "?";
    Object v2 = "Trying to resolve a forwar.d reference with id [";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v2));
    Object v4 = ((java.lang.Throwable)v3).toString();
    Object v5 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1),((java.lang.Throwable)v3));
    Object v6 = ((java.lang.Throwable)v5).getSuppressed();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = "?";
    Object v2 = "Trying to resolve a forwar.d reference with id [";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v2));
    Object v4 = ((java.lang.Throwable)v3).toString();
    Object v5 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1),((java.lang.Throwable)v3));
    Object v6 = ((java.lang.Throwable)v5).toString();
    Object v7 = ((java.lang.Throwable)v5).fillInStackTrace();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "Trying to resolve a forwar.d reference with id [";
    Object v1 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).fillInStackTrace();
    Object v3 = ((com.fasterxml.jackson.core.JsonProcessingException)v2).getLocation();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v6));
    ((java.lang.Throwable)v7).printStackTrace();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "U";
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = 0;
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = -19L;
    Object v5 = 0L;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0),((com.fasterxml.jackson.core.JsonLocation)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "Trying to resolve a forwar.d reference with id [";
    Object v1 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).fillInStackTrace();
    Object v3 = ((java.lang.Throwable)v2).getSuppressed();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "DeserializationProblemHandler.hpndleMissingInstantiator() for type %s returned value of type %s";
    Object v1 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 22;
    Object v3 = 16.256163F;
    Object v4 = new java.util.HashMap((((java.lang.Integer)v2).intValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ")";
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "DeserializationProblemHandler.hpndleMissingInstantiator() for type %s returned value of type %s";
    Object v1 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = ", ";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).fillInStackTrace();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = ", ";
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.String)v7));
    Object v9 = ((java.lang.Throwable)v8).fillInStackTrace();
    Object v10 = ((com.fasterxml.jackson.databind.JsonMappingException)v9)._buildMessage();
    Object v11 = new java.lang.StringBuilder(((java.lang.CharSequence)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = ", ";
    Object v14 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v12),((java.lang.String)v13));
    Object v15 = ((java.lang.Throwable)v14).fillInStackTrace();
    Object v16 = ((com.fasterxml.jackson.databind.JsonMappingException)v15)._buildMessage();
    Object v17 = ((java.lang.StringBuilder)v11).append(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.JsonMappingException)v5).getPathReference(((java.lang.StringBuilder)v11));
    Object v19 = 1;
    Object v20 = true;
    Object v21 = ((java.lang.StringBuilder)v18).insert((((java.lang.Integer)v19).intValue()),(((java.lang.Boolean)v20).booleanValue()));
    ((com.fasterxml.jackson.databind.JsonMappingException)v1)._appendPathDesc(((java.lang.StringBuilder)v18));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "Trying to resolve a forwar.d reference with id [";
    Object v1 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).toString();
    Object v3 = ((java.lang.Throwable)v1).getSuppressed();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 22;
    Object v6 = 16.256163F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v4),((java.util.Map)v7));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v11 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
    Object v12 = "integer";
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v10),((com.fasterxml.jackson.core.JsonToken)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.DeserializationContext)v2),((java.lang.String)v14));
    org.junit.Assert.assertNotNull(v15);
  }
}
