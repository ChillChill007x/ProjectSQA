package com.fasterxml.jackson.databind;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v2),((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v4));
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).getSuppressed();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "set";
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v8));
    Object v10 = ((java.lang.Throwable)v9).fillInStackTrace();
    Object v11 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3),((java.lang.Throwable)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).getCause();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "set";
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v8));
    Object v10 = ((java.lang.Throwable)v9).fillInStackTrace();
    Object v11 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3),((java.lang.Throwable)v10));
    Object v12 = ((java.lang.Throwable)v11).getCause();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "y'";
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = -40;
    Object v6 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v11 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v9),((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v11));
    Object v13 = ((java.lang.Throwable)v12).fillInStackTrace();
    Object v14 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0),((com.fasterxml.jackson.core.JsonLocation)v6),((java.lang.Throwable)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v2),((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v4));
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    Object v7 = new java.lang.StackTraceElement[]{null};
    ((java.lang.Throwable)v6).setStackTrace(((java.lang.StackTraceElement[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v2),((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v4));
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v6),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v2),((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v4));
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v6),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonMappingException)v11).getPath();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "st";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "st";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonMappingException)v4)._buildMessage();
    org.junit.Assert.assertEquals((Object)("st\n at [Source: N/A; line: -1, column: -1]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "st";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v7),((java.lang.String)v8));
    ((java.lang.Throwable)v9).printStackTrace();
    Object v10 = null;
    Object v11 = ((java.lang.Throwable)v4).initCause(((java.lang.Throwable)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v2),((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v4));
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v6),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v10));
    Object v12 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v16 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v14),((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v16));
    Object v18 = ((java.lang.Throwable)v17).fillInStackTrace();
    ((java.lang.Throwable)v11).addSuppressed(((java.lang.Throwable)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v2),((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v4));
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v6),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v14));
    ((com.fasterxml.jackson.databind.JsonMappingException)v11).prependPath(((com.fasterxml.jackson.databind.JsonMappingException.Reference)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v2),((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v4));
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    Object v7 = ((com.fasterxml.jackson.databind.JsonMappingException)v6)._buildMessage();
    org.junit.Assert.assertEquals((Object)("Unexpected IOException (of type com.fasterxml.jackson.databind.JsonMappingException): EEE, dd MMM yyyy HH:mm:ss zzz\n at [Source: N/A; line: -1, column: -1]"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "st";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = new java.io.StringWriter();
    Object v6 = new java.io.PrintWriter(((java.io.Writer)v5));
    ((java.lang.Throwable)v4).printStackTrace(((java.io.PrintWriter)v6));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v11 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v10),((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v12));
    Object v14 = ((java.lang.Throwable)v4).initCause(((java.lang.Throwable)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "st";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).getCause();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "st";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = "set";
    Object v9 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v13 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v13));
    Object v15 = ((java.lang.Throwable)v14).fillInStackTrace();
    Object v16 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v7),((java.lang.String)v8),((java.lang.Throwable)v15));
    ((java.lang.Throwable)v4).addSuppressed(((java.lang.Throwable)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).toString();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = 1;
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v4),((java.lang.Object)v6),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "st";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = "st";
    Object v9 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v7),((java.lang.String)v8));
    ((java.lang.Throwable)v4).addSuppressed(((java.lang.Throwable)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new java.io.StringWriter();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "Unexpecthed IOException (of type %s): %s";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new java.io.StringWriter();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "Unexpecthed IOException (of type %s): %s";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v8));
    Object v10 = ((java.lang.Throwable)v9).fillInStackTrace();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v10),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v14));
    Object v16 = 1;
    ((com.fasterxml.jackson.databind.JsonMappingException)v3).prependPath(((java.lang.Object)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new java.io.StringWriter();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "Unexpecthed IOException (of type %s): %s";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    Object v4 = new java.io.StringWriter();
    Object v5 = new java.io.PrintWriter(((java.io.Writer)v4));
    ((java.lang.Throwable)v3).printStackTrace(((java.io.PrintWriter)v5));
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.JsonMappingException)v3).getPath();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v2),((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v4));
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    Object v7 = "string";
    Object v8 = new java.lang.StringBuilder(((java.lang.String)v7));
    Object v9 = "'";
    Object v10 = ((java.lang.StringBuilder)v8).indexOf(((java.lang.String)v9));
    ((com.fasterxml.jackson.databind.JsonMappingException)v6)._appendPathDesc(((java.lang.StringBuilder)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new java.io.StringWriter();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "Unexpecthed IOException (of type %s): %s";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v6));
    ((com.fasterxml.jackson.databind.JsonMappingException)v3).prependPath(((com.fasterxml.jackson.databind.JsonMappingException.Reference)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "st";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonMappingException)v4).getPath();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new java.io.StringWriter();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "Unexpecthed IOException (of type %s): %s";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    Object v4 = new java.io.StringWriter();
    Object v5 = new java.io.PrintWriter(((java.io.Writer)v4));
    ((java.lang.Throwable)v3).printStackTrace(((java.io.PrintWriter)v5));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonMappingException)v4).getLocalizedMessage();
    org.junit.Assert.assertEquals((Object)("EEE, dd MMM yyyy HH:mm:ss zzz\n at [Source: N/A; line: -1, column: -1]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enabl type information?)";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enabl type information?)";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v1),((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = "\\";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((java.lang.Object)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new java.io.StringWriter();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "Unexpecthed IOException (of type %s): %s";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    ((java.lang.Throwable)v3).printStackTrace();
    Object v4 = null;
    Object v5 = ((java.lang.Throwable)v3).getCause();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enabl type information?)";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonMappingException)v3)._buildMessage();
    org.junit.Assert.assertEquals((Object)("no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enabl type information?)"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new java.io.StringWriter();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "Unexpecthed IOException (of type %s): %s";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    Object v4 = ((java.lang.Throwable)v3).fillInStackTrace();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "st";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonMappingException)v4).getMessage();
    org.junit.Assert.assertEquals((Object)("st\n at [Source: N/A; line: -1, column: -1]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new java.io.StringWriter();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "Unexpecthed IOException (of type %s): %s";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v8));
    Object v10 = ((java.lang.Throwable)v9).fillInStackTrace();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v10),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v14));
    Object v16 = ((java.lang.Throwable)v3).initCause(((java.lang.Throwable)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "set";
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v8));
    Object v10 = ((java.lang.Throwable)v9).fillInStackTrace();
    Object v11 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3),((java.lang.Throwable)v10));
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "st";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = new java.io.StringWriter();
    ((java.io.Closeable)v5).close();
    Object v6 = null;
    Object v7 = "Unexpecthed IOException (of type %s): %s";
    Object v8 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v5),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v13 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v13));
    Object v15 = ((java.lang.Throwable)v14).fillInStackTrace();
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v15),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v19));
    Object v21 = ((java.lang.Throwable)v8).initCause(((java.lang.Throwable)v20));
    Object v22 = ((java.lang.Throwable)v21).toString();
    Object v23 = ((java.lang.Throwable)v4).initCause(((java.lang.Throwable)v21));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "st";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = new java.lang.StringBuilder(((java.lang.String)v5));
    ((com.fasterxml.jackson.databind.JsonMappingException)v4)._appendPathDesc(((java.lang.StringBuilder)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    ((com.fasterxml.jackson.core.JsonGenerator)v1).writeEndArray();
    Object v2 = null;
    Object v3 = "@]";
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enabl type information?)";
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v5),((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v1),((java.lang.String)v3),((java.lang.Throwable)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = "N/A";
    Object v2 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1),((java.lang.Throwable)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).toString();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = 1;
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v4),((java.lang.Object)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.JsonMappingException)v8).toString();
    org.junit.Assert.assertEquals((Object)("com.fasterxml.jackson.databind.JsonMappingException: EEE, dd MMM yyyy HH:mm:ss zzz\n at [Source: N/A; line: -1, column: -1] (through reference chain: com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig[1])"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new java.io.StringWriter();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "Unexpecthed IOException (of type %s): %s";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    Object v4 = new java.lang.StackTraceElement[]{null,null};
    ((java.lang.Throwable)v3).setStackTrace(((java.lang.StackTraceElement[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enabl type information?)";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v1),((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new java.io.StringWriter();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "Unexpecthed IOException (of type %s): %s";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    Object v4 = ((java.lang.Throwable)v3).getSuppressed();
    Object v5 = new java.io.ByteArrayOutputStream();
    Object v6 = new java.io.PrintStream(((java.io.OutputStream)v5));
    Object v7 = -42.769276F;
    ((java.io.PrintStream)v6).print((((java.lang.Float)v7).floatValue()));
    Object v8 = null;
    ((java.lang.Throwable)v3).printStackTrace(((java.io.PrintStream)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "G";
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enabl type information?)";
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v3),((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = "\\";
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v5),((java.lang.Object)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1),((java.lang.Throwable)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    ((com.fasterxml.jackson.core.JsonGenerator)v1).writeEndArray();
    Object v2 = null;
    Object v3 = "@]";
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enabl type information?)";
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v5),((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v1),((java.lang.String)v3),((java.lang.Throwable)v7));
    Object v9 = new java.io.StringWriter();
    ((java.io.Closeable)v9).close();
    Object v10 = null;
    Object v11 = "Unexpecthed IOException (of type %s): %s";
    Object v12 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v9),((java.lang.String)v11));
    Object v13 = ((java.lang.Throwable)v12).fillInStackTrace();
    Object v14 = ((java.lang.Throwable)v8).initCause(((java.lang.Throwable)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new java.io.StringWriter();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "Unexpecthed IOException (of type %s): %s";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enabl type information?)";
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v5),((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = "\\";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v7),((java.lang.Object)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.Throwable)v3).initCause(((java.lang.Throwable)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "G";
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enabl type information?)";
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v3),((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = "\\";
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v5),((java.lang.Object)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1),((java.lang.Throwable)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v12));
    Object v14 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v9),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new java.io.StringWriter();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "Unexpecthed IOException (of type %s): %s";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    Object v4 = ((java.lang.Throwable)v3).fillInStackTrace();
    Object v5 = new java.lang.StackTraceElement[]{null,null};
    ((java.lang.Throwable)v4).setStackTrace(((java.lang.StackTraceElement[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v2),((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v4));
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    Object v7 = new java.io.StringWriter();
    ((java.io.Closeable)v7).close();
    Object v8 = null;
    Object v9 = "Unexpecthed IOException (of type %s): %s";
    Object v10 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v7),((java.lang.String)v9));
    Object v11 = ((java.lang.Throwable)v10).fillInStackTrace();
    ((java.lang.Throwable)v6).addSuppressed(((java.lang.Throwable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new java.io.StringWriter();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "Unexpecthed IOException (of type %s): %s";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    ((java.lang.Throwable)v3).printStackTrace();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "G";
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enabl type information?)";
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v3),((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = "\\";
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v5),((java.lang.Object)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v0),((java.lang.String)v1),((java.lang.Throwable)v8));
    Object v10 = ((java.lang.Throwable)v9).getSuppressed();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = "NULL";
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enabl type information?)";
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v3),((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v8));
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v5),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v9));
    Object v11 = ((java.lang.Throwable)v10).toString();
    Object v12 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1),((java.lang.Throwable)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new java.io.StringWriter();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "Unexpecthed IOException (of type %s): %s";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    Object v4 = ((java.lang.Throwable)v3).getCause();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "y'";
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = -40;
    Object v6 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v11 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v9),((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v11));
    Object v13 = ((java.lang.Throwable)v12).fillInStackTrace();
    Object v14 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0),((com.fasterxml.jackson.core.JsonLocation)v6),((java.lang.Throwable)v13));
    Object v15 = "string";
    Object v16 = new java.lang.StringBuilder(((java.lang.String)v15));
    Object v17 = 0;
    Object v18 = 1;
    Object v19 = ((java.lang.StringBuilder)v16).insert((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.databind.JsonMappingException)v14).getPathReference(((java.lang.StringBuilder)v16));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new java.io.StringWriter();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "Unexpecthed IOException (of type %s): %s";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = "G";
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enabl type information?)";
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v7),((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = "\\";
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v9),((java.lang.Object)v10),((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.String)v5),((java.lang.Throwable)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v16));
    Object v18 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v13),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v17));
    ((java.lang.Throwable)v3).addSuppressed(((java.lang.Throwable)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = "N/A";
    Object v2 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1),((java.lang.Throwable)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonMappingException)v7).getPath();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = "strin";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = "NULL";
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enabl type information?)";
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v3),((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v8));
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v5),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v9));
    Object v11 = ((java.lang.Throwable)v10).toString();
    Object v12 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1),((java.lang.Throwable)v10));
    Object v13 = ((com.fasterxml.jackson.databind.JsonMappingException)v12).getPath();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = new java.io.PrintStream(((java.io.OutputStream)v0));
    Object v2 = "P";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = "";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = "string";
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enabl type information?)";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v1),((java.lang.String)v2),((java.lang.Throwable)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = "strin";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1));
    ((java.lang.Throwable)v2).printStackTrace();
    Object v3 = null;
    Object v4 = ((java.lang.Throwable)v2).fillInStackTrace();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = "strin";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = 0;
    ((com.fasterxml.jackson.databind.JsonMappingException)v2).prependPath(((java.lang.Object)v3),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = new java.io.PrintStream(((java.io.OutputStream)v0));
    Object v2 = "P";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v1),((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = new java.lang.StringBuilder(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = 1;
    Object v8 = ((java.lang.StringBuilder)v5).indexOf(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.JsonMappingException)v3)._appendPathDesc(((java.lang.StringBuilder)v5));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = "strin";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = ((java.lang.Throwable)v2).getSuppressed();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "st";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).getSuppressed();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enabl type information?)";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v1),((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = "\\";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((java.lang.Object)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.Throwable)v6).fillInStackTrace();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enabl type information?)";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v1),((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = "\\";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((java.lang.Object)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.Throwable)v6).fillInStackTrace();
    Object v8 = ((java.lang.Throwable)v7).getSuppressed();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = "N/A";
    Object v2 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1),((java.lang.Throwable)v6));
    Object v8 = "string";
    Object v9 = new java.lang.StringBuilder(((java.lang.String)v8));
    Object v10 = 1;
    Object v11 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v7),((java.lang.Object)v9),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new java.io.StringWriter();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "Unexpecthed IOException (of type %s): %s";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    Object v4 = new java.io.StringWriter();
    Object v5 = new java.io.PrintWriter(((java.io.Writer)v4));
    Object v6 = "Can not pass null modmifier";
    ((java.io.PrintWriter)v5).println(((java.lang.String)v6));
    Object v7 = null;
    ((java.lang.Throwable)v3).printStackTrace(((java.io.PrintWriter)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.DeserializationContext)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = "')";
    Object v2 = new java.io.StringWriter();
    Object v3 = "strin";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1),((java.lang.Throwable)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "boolean";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.DeserializationContext)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "boolean";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.DeserializationContext)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).fillInStackTrace();
    Object v6 = ((com.fasterxml.jackson.databind.JsonMappingException)v4).getLocalizedMessage();
    org.junit.Assert.assertEquals((Object)("boolean"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = "";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonMappingException)v3).getPathReference();
    Object v5 = ((com.fasterxml.jackson.databind.JsonMappingException)v3).getPath();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = new java.io.PrintStream(((java.io.OutputStream)v0));
    Object v2 = ":";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = "')";
    Object v2 = new java.io.StringWriter();
    Object v3 = "strin";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1),((java.lang.Throwable)v4));
    Object v6 = "string";
    Object v7 = new java.lang.StringBuilder(((java.lang.String)v6));
    ((com.fasterxml.jackson.databind.JsonMappingException)v5)._appendPathDesc(((java.lang.StringBuilder)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = "strin";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonMappingException)v2).getPath();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new java.io.StringWriter();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "'";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = "strin";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).getStackTrace();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = "strin";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).toString();
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "set";
    Object v8 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v11 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v10),((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v12));
    Object v14 = ((java.lang.Throwable)v13).fillInStackTrace();
    Object v15 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v6),((java.lang.String)v7),((java.lang.Throwable)v14));
    ((java.lang.Throwable)v2).addSuppressed(((java.lang.Throwable)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = "string";
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enabl type information?)";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v1),((java.lang.String)v2),((java.lang.Throwable)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v10));
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v7),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new java.io.StringWriter();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "'";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    Object v4 = ((java.lang.Throwable)v3).getStackTrace();
    Object v5 = ((java.lang.Throwable)v3).fillInStackTrace();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = new java.io.PrintStream(((java.io.OutputStream)v0));
    Object v2 = "P";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v1),((java.lang.String)v2));
    Object v4 = ((java.lang.Throwable)v3).fillInStackTrace();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new java.io.StringWriter();
    ((java.io.Closeable)v0).close();
    Object v1 = null;
    Object v2 = "Unexpecthed IOException (of type %s): %s";
    Object v3 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v2));
    Object v4 = ((java.lang.Throwable)v3).fillInStackTrace();
    Object v5 = new java.lang.StackTraceElement[]{};
    ((java.lang.Throwable)v4).setStackTrace(((java.lang.StackTraceElement[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = ")";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "W";
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = -40;
    Object v6 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.core.JsonLocation)v6).toString();
    Object v8 = new java.io.StringWriter();
    Object v9 = "strin";
    Object v10 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v8),((java.lang.String)v9));
    ((java.lang.Throwable)v10).printStackTrace();
    Object v11 = null;
    Object v12 = ((java.lang.Throwable)v10).fillInStackTrace();
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0),((com.fasterxml.jackson.core.JsonLocation)v6),((java.lang.Throwable)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = "string";
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enabl type information?)";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v1),((java.lang.String)v2),((java.lang.Throwable)v6));
    Object v8 = "string";
    Object v9 = new java.lang.StringBuilder(((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonMappingException)v7).getPathReference(((java.lang.StringBuilder)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = "strin";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1));
    ((java.lang.Throwable)v2).printStackTrace();
    Object v3 = null;
    Object v4 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v5 = ((com.fasterxml.jackson.databind.JsonMappingException)v4).getPath();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "overflow, value can not be repre;sented as 8-bit value";
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = -40;
    Object v6 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new java.io.StringWriter();
    ((java.io.Closeable)v7).close();
    Object v8 = null;
    Object v9 = "Unexpecthed IOException (of type %s): %s";
    Object v10 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v7),((java.lang.String)v9));
    Object v11 = ((java.lang.Throwable)v10).fillInStackTrace();
    Object v12 = new java.io.ByteArrayOutputStream();
    Object v13 = new java.io.PrintStream(((java.io.OutputStream)v12));
    Object v14 = ":";
    Object v15 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v13),((java.lang.String)v14));
    Object v16 = ((java.lang.Throwable)v11).initCause(((java.lang.Throwable)v15));
    Object v17 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v0),((com.fasterxml.jackson.core.JsonLocation)v6),((java.lang.Throwable)v11));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = "strin";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).getCause();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = new java.io.PrintWriter(((java.io.Writer)v0));
    ((java.io.Closeable)v1).close();
    Object v2 = null;
    Object v3 = "nt";
    Object v4 = new java.io.StringWriter();
    ((java.io.Closeable)v4).close();
    Object v5 = null;
    Object v6 = "'";
    Object v7 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v4),((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v1),((java.lang.String)v3),((java.lang.Throwable)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonMappingException)v4).getProcessor();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "boolean";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.DeserializationContext)v2),((java.lang.String)v3));
    Object v5 = new java.io.ByteArrayOutputStream();
    Object v6 = new java.io.PrintStream(((java.io.OutputStream)v5));
    ((java.lang.Throwable)v4).printStackTrace(((java.io.PrintStream)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v0),((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "st";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).getStackTrace();
    Object v6 = ((java.lang.Throwable)v4).getSuppressed();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.DeserializationContext)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonMappingException)v4).toString();
    org.junit.Assert.assertEquals((Object)("com.fasterxml.jackson.databind.JsonMappingException: array"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = "')";
    Object v2 = new java.io.StringWriter();
    Object v3 = "strin";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1),((java.lang.Throwable)v4));
    Object v6 = ((com.fasterxml.jackson.core.JsonProcessingException)v5).getLocation();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = "strin";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v0),((java.lang.String)v1));
    ((java.lang.Throwable)v2).printStackTrace();
    Object v3 = null;
    Object v4 = ((java.lang.Throwable)v2).fillInStackTrace();
    ((java.lang.Throwable)v4).printStackTrace();
    Object v5 = null;
    Object v6 = new java.io.ByteArrayOutputStream();
    Object v7 = new java.io.PrintStream(((java.io.OutputStream)v6));
    Object v8 = "P";
    Object v9 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v7),((java.lang.String)v8));
    ((java.lang.Throwable)v4).addSuppressed(((java.lang.Throwable)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = "";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v1),((java.lang.String)v2));
    Object v4 = new java.io.StringWriter();
    ((java.io.Closeable)v4).close();
    Object v5 = null;
    Object v6 = "'";
    Object v7 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v4),((java.lang.String)v6));
    Object v8 = ((java.lang.Throwable)v7).getStackTrace();
    Object v9 = ((java.lang.Throwable)v7).fillInStackTrace();
    Object v10 = ((java.lang.Throwable)v3).initCause(((java.lang.Throwable)v9));
    org.junit.Assert.assertNotNull(v10);
  }
}
