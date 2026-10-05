package com.fasterxml.jackson.databind.ser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v3 = null;
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isUnwrappingSerializer();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "type mustbe provided";
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v5 = ")";
    Object v6 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v7 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v6).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).isUnwrappingSerializer();
    Object v11 = 18L;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v10),(((java.lang.Long)v11).longValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v5),((com.fasterxml.jackson.core.JsonLocation)v14));
    Object v16 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = "X)";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v16),((java.lang.Object)v17),((java.lang.String)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = ")";
    Object v7 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v7).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v10 = null;
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).isUnwrappingSerializer();
    Object v12 = 18L;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v11),(((java.lang.Long)v12).longValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v6),((com.fasterxml.jackson.core.JsonLocation)v15));
    Object v17 = true;
    Object v18 = "integer";
    Object v19 = 37;
    Object v20 = "not a valid representation, problem: %s";
    Object v21 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v17).booleanValue()),((java.lang.String)v18),((java.lang.Integer)v19),((java.lang.String)v20));
    Object v22 = 24;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v16),((java.lang.Object)v21),(((java.lang.Integer)v22).intValue()));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = false;
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = true;
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v2),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = ")";
    Object v4 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isUnwrappingSerializer();
    Object v9 = 18L;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v3),((com.fasterxml.jackson.core.JsonLocation)v12));
    Object v14 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = "Illdgal index ";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v13),((java.lang.Object)v15),((java.lang.String)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = ")";
    Object v4 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isUnwrappingSerializer();
    Object v9 = 18L;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v3),((com.fasterxml.jackson.core.JsonLocation)v12));
    Object v14 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = -14;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v13),((java.lang.Object)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = ")";
    Object v4 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isUnwrappingSerializer();
    Object v9 = 18L;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v3),((com.fasterxml.jackson.core.JsonLocation)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v13),((java.lang.Object)v14),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).getDelegatee();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = ")";
    Object v4 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isUnwrappingSerializer();
    Object v9 = 18L;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v3),((com.fasterxml.jackson.core.JsonLocation)v12));
    Object v14 = ((java.lang.Throwable)v13).fillInStackTrace();
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = 1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v13),((java.lang.Object)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = ")";
    Object v4 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isUnwrappingSerializer();
    Object v9 = 18L;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v3),((com.fasterxml.jackson.core.JsonLocation)v12));
    Object v14 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v13),((java.lang.Object)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = ")";
    Object v4 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isUnwrappingSerializer();
    Object v9 = 18L;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v3),((com.fasterxml.jackson.core.JsonLocation)v12));
    Object v14 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = "strin";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v13),((java.lang.Object)v15),((java.lang.String)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).usesObjectId();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = ")";
    Object v4 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isUnwrappingSerializer();
    Object v9 = 18L;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v3),((com.fasterxml.jackson.core.JsonLocation)v12));
    Object v14 = new java.lang.Object[]{null,null,null};
    Object v15 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v14));
    Object v16 = "any";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v13),((java.lang.Object)v15),((java.lang.String)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.core.JsonFactory();
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v4));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v2).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v3));
    ((com.fasterxml.jackson.databind.ser.std.JsonValueSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = ((java.lang.reflect.Type)v3).getTypeName();
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.reflect.Type)v3),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = ")";
    Object v3 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v3).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).isUnwrappingSerializer();
    Object v8 = 18L;
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v7),(((java.lang.Long)v8).longValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v2),((com.fasterxml.jackson.core.JsonLocation)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v14 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v13).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v16 = null;
    Object v17 = ((com.fasterxml.jackson.databind.JsonSerializer)v13).isUnwrappingSerializer();
    Object v18 = 1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v12),((java.lang.Object)v17),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = ")";
    Object v4 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isUnwrappingSerializer();
    Object v9 = 18L;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v3),((com.fasterxml.jackson.core.JsonLocation)v12));
    Object v14 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v13));
    Object v15 = 0;
    Object v16 = new java.text.ParsePosition((((java.lang.Integer)v15).intValue()));
    Object v17 = 30;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v14),((java.lang.Object)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).withFilterId(((java.lang.Object)v2));
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v3).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).replaceDelegatee(((com.fasterxml.jackson.databind.JsonSerializer)v3));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v7 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v11 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = null;
    Object v17 = "G";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.Class)v16),((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = true;
    Object v21 = "integer";
    Object v22 = 37;
    Object v23 = "not a valid representation, problem: %s";
    Object v24 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v20).booleanValue()),((java.lang.String)v21),((java.lang.Integer)v22),((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.PropertyName)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v19),((com.fasterxml.jackson.databind.PropertyMetadata)v24));
    Object v26 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v6),((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = false;
    Object v30 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v28),(((java.lang.Boolean)v29).booleanValue()));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v3));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.reflect.Type)v6),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v4 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.core.JsonFactory();
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v4));
    Object v5 = null;
    Object v6 = ")";
    Object v7 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v7).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v10 = null;
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).isUnwrappingSerializer();
    Object v12 = 18L;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v11),(((java.lang.Long)v12).longValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v6),((com.fasterxml.jackson.core.JsonLocation)v15));
    Object v17 = true;
    Object v18 = "integer";
    Object v19 = 37;
    Object v20 = "not a valid representation, problem: %s";
    Object v21 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v17).booleanValue()),((java.lang.String)v18),((java.lang.Integer)v19),((java.lang.String)v20));
    Object v22 = 1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v16),((java.lang.Object)v21),(((java.lang.Integer)v22).intValue()));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = "items";
    Object v2 = "cNass";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = true;
    Object v11 = "integer";
    Object v12 = 37;
    Object v13 = "not a valid representation, problem: %s";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v9),((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v1));
    Object v3 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = ")";
    Object v8 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v9 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v8).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.JsonSerializer)v8).isUnwrappingSerializer();
    Object v13 = 18L;
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v12),(((java.lang.Long)v13).longValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v7),((com.fasterxml.jackson.core.JsonLocation)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = -19;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Throwable)v17),((java.lang.Object)v18),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = false;
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).getUnknownTypeSerializer(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v11),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v4 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v7 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = null;
    Object v13 = "G";
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v12),((java.lang.String)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = true;
    Object v17 = "integer";
    Object v18 = 37;
    Object v19 = "not a valid representation, problem: %s";
    Object v20 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v16).booleanValue()),((java.lang.String)v17),((java.lang.Integer)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v4),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.PropertyName)v7),((com.fasterxml.jackson.databind.util.Annotations)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((com.fasterxml.jackson.databind.PropertyMetadata)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ser.std.JsonValueSerializer)v0).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v2),((com.fasterxml.jackson.databind.BeanProperty)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).getDelegatee();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v6 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v5).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).withFilterId(((java.lang.Object)v11));
    Object v13 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v14 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20));
    Object v22 = null;
    Object v23 = "G";
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v21),((java.lang.Class)v22),((java.lang.String)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = true;
    Object v27 = "integer";
    Object v28 = 37;
    Object v29 = "not a valid representation, problem: %s";
    Object v30 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v26).booleanValue()),((java.lang.String)v27),((java.lang.Integer)v28),((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),((com.fasterxml.jackson.databind.PropertyMetadata)v30));
    Object v32 = ((com.fasterxml.jackson.databind.SerializerProvider)v4).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v12),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v33));
    Object v35 = false;
    Object v36 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.reflect.Type)v34),(((java.lang.Boolean)v35).booleanValue()));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isUnwrappingSerializer();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = "items";
    Object v2 = "cNass";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).withFilterId(((java.lang.Object)v8));
    Object v10 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v11 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v14 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v18 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = null;
    Object v20 = "G";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v18),((java.lang.Class)v19),((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = true;
    Object v24 = "integer";
    Object v25 = 37;
    Object v26 = "not a valid representation, problem: %s";
    Object v27 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v23).booleanValue()),((java.lang.String)v24),((java.lang.Integer)v25),((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.util.Annotations)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v22),((com.fasterxml.jackson.databind.PropertyMetadata)v27));
    Object v29 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v9),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = true;
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.JsonValueSerializer)v0).isNaturalTypeWithStdHandling(((java.lang.Class)v2),((com.fasterxml.jackson.databind.JsonSerializer)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = ")";
    Object v4 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isUnwrappingSerializer();
    Object v9 = 18L;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v3),((com.fasterxml.jackson.core.JsonLocation)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v15 = ((com.fasterxml.jackson.databind.JsonSerializer)v14).usesObjectId();
    Object v16 = 1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v13),((java.lang.Object)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).properties();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.JsonValueSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.core.JsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v6));
    ((com.fasterxml.jackson.databind.SerializerProvider)v4).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v7));
    Object v8 = null;
    Object v9 = ")";
    Object v10 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v11 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v10).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.JsonSerializer)v10).isUnwrappingSerializer();
    Object v15 = 18L;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v14),(((java.lang.Long)v15).longValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v9),((com.fasterxml.jackson.core.JsonLocation)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = 1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Throwable)v19),((java.lang.Object)v20),(((java.lang.Integer)v21).intValue()));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v3).handledType();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = ")";
    Object v9 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v10 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v9).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v12 = null;
    Object v13 = ((com.fasterxml.jackson.databind.JsonSerializer)v9).isUnwrappingSerializer();
    Object v14 = 18L;
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v13),(((java.lang.Long)v14).longValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v8),((com.fasterxml.jackson.core.JsonLocation)v17));
    ((java.lang.Throwable)v18).printStackTrace();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = ((com.fasterxml.jackson.databind.JsonSerializer)v20).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v22),((java.lang.Object)v23));
    Object v25 = ": ";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v18),((java.lang.Object)v24),((java.lang.String)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = ")";
    Object v4 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isUnwrappingSerializer();
    Object v9 = 18L;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v3),((com.fasterxml.jackson.core.JsonLocation)v12));
    Object v14 = ")";
    Object v15 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = ((com.fasterxml.jackson.databind.JsonSerializer)v15).isUnwrappingSerializer();
    Object v20 = 18L;
    Object v21 = 1;
    Object v22 = 1;
    Object v23 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v19),(((java.lang.Long)v20).longValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v14),((com.fasterxml.jackson.core.JsonLocation)v23));
    Object v25 = "items";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v13),((java.lang.Object)v24),((java.lang.String)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v3).handledType();
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.reflect.Type)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).withFilterId(((java.lang.Object)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v7).handledType();
    Object v9 = true;
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.reflect.Type)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.SerializerProvider)v12).getUnknownTypeSerializer(((java.lang.Class)v14));
    Object v16 = ")";
    Object v17 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v18 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v17).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.databind.JsonSerializer)v17).isUnwrappingSerializer();
    Object v22 = 18L;
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v21),(((java.lang.Long)v22).longValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v16),((com.fasterxml.jackson.core.JsonLocation)v25));
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v28 = "R";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v12),((java.lang.Throwable)v26),((java.lang.Object)v27),((java.lang.String)v28));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = "items";
    Object v2 = "cNass";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = ")";
    Object v13 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v14 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v13).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v16 = null;
    Object v17 = ((com.fasterxml.jackson.databind.JsonSerializer)v13).isUnwrappingSerializer();
    Object v18 = 18L;
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v17),(((java.lang.Long)v18).longValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v12),((com.fasterxml.jackson.core.JsonLocation)v21));
    Object v23 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v25 = -35;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.Throwable)v23),((java.lang.Object)v24),(((java.lang.Integer)v25).intValue()));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v11 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v9),((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v2 = "items";
    Object v3 = "cNass";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).replaceDelegatee(((com.fasterxml.jackson.databind.JsonSerializer)v5));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).isUnwrappingSerializer();
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).withFilterId(((java.lang.Object)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).handledType();
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.JsonValueSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).handledType();
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.reflect.Type)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v8).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v9));
    Object v10 = null;
    Object v11 = ")";
    Object v12 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v13 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v12).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v15 = null;
    Object v16 = ((com.fasterxml.jackson.databind.JsonSerializer)v12).isUnwrappingSerializer();
    Object v17 = 18L;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v16),(((java.lang.Long)v17).longValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v11),((com.fasterxml.jackson.core.JsonLocation)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = 1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.Throwable)v21),((java.lang.Object)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v4 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = null;
    Object v14 = "G";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v13),((java.lang.String)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = true;
    Object v18 = "integer";
    Object v19 = 37;
    Object v20 = "not a valid representation, problem: %s";
    Object v21 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v17).booleanValue()),((java.lang.String)v18),((java.lang.Integer)v19),((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16),((com.fasterxml.jackson.databind.PropertyMetadata)v21));
    Object v23 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v3),((com.fasterxml.jackson.databind.BeanProperty)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = false;
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.reflect.Type)v25),(((java.lang.Boolean)v26).booleanValue()));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).withFilterId(((java.lang.Object)v6));
    Object v8 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v9 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v12 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = null;
    Object v18 = "G";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((java.lang.Class)v17),((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = true;
    Object v22 = "integer";
    Object v23 = 37;
    Object v24 = "not a valid representation, problem: %s";
    Object v25 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v21).booleanValue()),((java.lang.String)v22),((java.lang.Integer)v23),((java.lang.String)v24));
    Object v26 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20),((com.fasterxml.jackson.databind.PropertyMetadata)v25));
    Object v27 = ((com.fasterxml.jackson.databind.SerializerProvider)v4).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v7),((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.type.TypeFactory)v29));
    Object v31 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Object)v30));
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = ")";
    Object v4 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isUnwrappingSerializer();
    Object v9 = 18L;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v3),((com.fasterxml.jackson.core.JsonLocation)v12));
    Object v14 = ((java.lang.Throwable)v13).fillInStackTrace();
    Object v15 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15));
    Object v17 = "";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v13),((java.lang.Object)v16),((java.lang.String)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v2 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v1).handledType();
    Object v3 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.JsonValueSerializer)v0).isNaturalTypeWithStdHandling(((java.lang.Class)v2),((com.fasterxml.jackson.databind.JsonSerializer)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = ")";
    Object v6 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v7 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v6).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).isUnwrappingSerializer();
    Object v11 = 18L;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v10),(((java.lang.Long)v11).longValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v5),((com.fasterxml.jackson.core.JsonLocation)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = "BOOLEAN";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Throwable)v15),((java.lang.Object)v16),((java.lang.String)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = ")";
    Object v6 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v7 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v6).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).isUnwrappingSerializer();
    Object v11 = 18L;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v10),(((java.lang.Long)v11).longValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v5),((com.fasterxml.jackson.core.JsonLocation)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = ")";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Throwable)v15),((java.lang.Object)v16),((java.lang.String)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = null;
    Object v11 = "G";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v9),((java.lang.Class)v10),((java.lang.String)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = true;
    Object v15 = "integer";
    Object v16 = 37;
    Object v17 = "not a valid representation, problem: %s";
    Object v18 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v14).booleanValue()),((java.lang.String)v15),((java.lang.Integer)v16),((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v13),((com.fasterxml.jackson.databind.PropertyMetadata)v18));
    Object v20 = ((com.fasterxml.jackson.databind.BeanProperty)v19).getMember();
    Object v21 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v22 = false;
    Object v23 = ((com.fasterxml.jackson.databind.ser.std.JsonValueSerializer)v0).withResolved(((com.fasterxml.jackson.databind.BeanProperty)v19),((com.fasterxml.jackson.databind.JsonSerializer)v21),(((java.lang.Boolean)v22).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = ")";
    Object v4 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isUnwrappingSerializer();
    Object v9 = 18L;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v3),((com.fasterxml.jackson.core.JsonLocation)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = "]";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v13),((java.lang.Object)v14),((java.lang.String)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = null;
    Object v11 = "G";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v9),((java.lang.Class)v10),((java.lang.String)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = true;
    Object v15 = "integer";
    Object v16 = 37;
    Object v17 = "not a valid representation, problem: %s";
    Object v18 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v14).booleanValue()),((java.lang.String)v15),((java.lang.Integer)v16),((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v13),((com.fasterxml.jackson.databind.PropertyMetadata)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v21 = "items";
    Object v22 = "cNass";
    Object v23 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.JsonSerializer)v20).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v23));
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.JsonValueSerializer)v0).withResolved(((com.fasterxml.jackson.databind.BeanProperty)v19),((com.fasterxml.jackson.databind.JsonSerializer)v24),(((java.lang.Boolean)v25).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = ")";
    Object v4 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isUnwrappingSerializer();
    Object v9 = 18L;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v3),((com.fasterxml.jackson.core.JsonLocation)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v15 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JsonSerializer)v14).isEmpty(((java.lang.Object)v16));
    Object v18 = "Failed to instantiate class ";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v13),((java.lang.Object)v17),((java.lang.String)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).handledType();
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = ")";
    Object v10 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v11 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v10).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.JsonSerializer)v10).isUnwrappingSerializer();
    Object v15 = 18L;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v14),(((java.lang.Long)v15).longValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v9),((com.fasterxml.jackson.core.JsonLocation)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v20).handledType();
    Object v22 = -3;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.Throwable)v19),((java.lang.Object)v21),(((java.lang.Integer)v22).intValue()));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = ")";
    Object v8 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v9 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v8).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.JsonSerializer)v8).isUnwrappingSerializer();
    Object v13 = 18L;
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v12),(((java.lang.Long)v13).longValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v7),((com.fasterxml.jackson.core.JsonLocation)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = ": ";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Throwable)v17),((java.lang.Object)v18),((java.lang.String)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = ")";
    Object v3 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v3).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).isUnwrappingSerializer();
    Object v8 = 18L;
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v7),(((java.lang.Long)v8).longValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v2),((com.fasterxml.jackson.core.JsonLocation)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v14 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v13).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.databind.JsonSerializer)v13).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v17),((java.lang.Object)v18));
    Object v20 = "H";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v12),((java.lang.Object)v19),((java.lang.String)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = ")";
    Object v3 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v3).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).isUnwrappingSerializer();
    Object v8 = 18L;
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v7),(((java.lang.Long)v8).longValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v2),((com.fasterxml.jackson.core.JsonLocation)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v13).handledType();
    Object v15 = 31;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v12),((java.lang.Object)v14),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v3).handledType();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v8).handledType();
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = true;
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).withFilterId(((java.lang.Object)v4));
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v5));
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).properties();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = "Can not support implicit polymorhic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = null;
    Object v11 = "G";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v9),((java.lang.Class)v10),((java.lang.String)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = true;
    Object v15 = "integer";
    Object v16 = 37;
    Object v17 = "not a valid representation, problem: %s";
    Object v18 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v14).booleanValue()),((java.lang.String)v15),((java.lang.Integer)v16),((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v13),((com.fasterxml.jackson.databind.PropertyMetadata)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v20).handledType();
    Object v22 = ((com.fasterxml.jackson.databind.BeanProperty)v19).getAnnotation(((java.lang.Class)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v24 = "items";
    Object v25 = "cNass";
    Object v26 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = ((com.fasterxml.jackson.databind.JsonSerializer)v23).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v26));
    Object v28 = true;
    Object v29 = ((com.fasterxml.jackson.databind.ser.std.JsonValueSerializer)v0).withResolved(((com.fasterxml.jackson.databind.BeanProperty)v19),((com.fasterxml.jackson.databind.JsonSerializer)v27),(((java.lang.Boolean)v28).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = ")";
    Object v4 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isUnwrappingSerializer();
    Object v9 = 18L;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v3),((com.fasterxml.jackson.core.JsonLocation)v12));
    Object v14 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v15 = 17;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v13),((java.lang.Object)v14),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).isUnwrappingSerializer();
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Object)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).withFilterId(((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = "items";
    Object v2 = "cNass";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = ")";
    Object v8 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v9 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v8).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.JsonSerializer)v8).isUnwrappingSerializer();
    Object v13 = 18L;
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v12),(((java.lang.Long)v13).longValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v7),((com.fasterxml.jackson.core.JsonLocation)v16));
    Object v18 = 43;
    Object v19 = 78;
    Object v20 = -51;
    Object v21 = new java.util.Date((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 7;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Throwable)v17),((java.lang.Object)v21),(((java.lang.Integer)v22).intValue()));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v3).handledType();
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.reflect.Type)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = ")";
    Object v10 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v11 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v10).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.JsonSerializer)v10).isUnwrappingSerializer();
    Object v15 = 18L;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v14),(((java.lang.Long)v15).longValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v9),((com.fasterxml.jackson.core.JsonLocation)v18));
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = "-";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.Throwable)v19),((java.lang.Object)v20),((java.lang.String)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = "items";
    Object v2 = "cNass";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).handledType();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = "items";
    Object v2 = "cNass";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = ")";
    Object v10 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v11 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v10).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.JsonSerializer)v10).isUnwrappingSerializer();
    Object v15 = 18L;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v14),(((java.lang.Long)v15).longValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v9),((com.fasterxml.jackson.core.JsonLocation)v18));
    Object v20 = 0;
    Object v21 = new java.text.ParsePosition((((java.lang.Integer)v20).intValue()));
    Object v22 = 10;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.Throwable)v19),((java.lang.Object)v21),(((java.lang.Integer)v22).intValue()));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = ")";
    Object v6 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v7 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v6).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).isUnwrappingSerializer();
    Object v11 = 18L;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v10),(((java.lang.Long)v11).longValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v5),((com.fasterxml.jackson.core.JsonLocation)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v20 = ((com.fasterxml.jackson.databind.JsonSerializer)v19).isUnwrappingSerializer();
    Object v21 = ((com.fasterxml.jackson.databind.JsonSerializer)v16).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v18),((java.lang.Object)v20));
    Object v22 = 48;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Throwable)v15),((java.lang.Object)v21),(((java.lang.Integer)v22).intValue()));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1).expectNullFormat(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v6 = "items";
    Object v7 = "cNass";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v9).handledType();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.JsonValueSerializer)v0)._acceptJsonFormatVisitorForEnum(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v4),((java.lang.Class)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).isUnwrappingSerializer();
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Object)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).withFilterId(((java.lang.Object)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = ")";
    Object v13 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v14 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v13).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v16 = null;
    Object v17 = ((com.fasterxml.jackson.databind.JsonSerializer)v13).isUnwrappingSerializer();
    Object v18 = 18L;
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v17),(((java.lang.Long)v18).longValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v12),((com.fasterxml.jackson.core.JsonLocation)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.type.TypeFactory)v25));
    Object v27 = "aray";
    Object v28 = false;
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v26),((java.lang.String)v27),(((java.lang.Boolean)v28).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = -29;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v9).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.Throwable)v22),((java.lang.Object)v30),(((java.lang.Integer)v31).intValue()));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = ")";
    Object v4 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isUnwrappingSerializer();
    Object v9 = 18L;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v3),((com.fasterxml.jackson.core.JsonLocation)v12));
    Object v14 = ")";
    Object v15 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = ((com.fasterxml.jackson.databind.JsonSerializer)v15).isUnwrappingSerializer();
    Object v20 = 18L;
    Object v21 = 1;
    Object v22 = 1;
    Object v23 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v19),(((java.lang.Long)v20).longValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v14),((com.fasterxml.jackson.core.JsonLocation)v23));
    ((java.lang.Throwable)v13).addSuppressed(((java.lang.Throwable)v24));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v27 = "USE_JAVA_";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v13),((java.lang.Object)v26),((java.lang.String)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = "items";
    Object v2 = "cNass";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = ")";
    Object v8 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v9 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v8).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.JsonSerializer)v8).isUnwrappingSerializer();
    Object v13 = 18L;
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v12),(((java.lang.Long)v13).longValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v7),((com.fasterxml.jackson.core.JsonLocation)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v19 = 21;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Throwable)v17),((java.lang.Object)v18),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v3 = null;
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).properties();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).handledType();
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.JsonValueSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = ")";
    Object v7 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v7).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v10 = null;
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).isUnwrappingSerializer();
    Object v12 = 18L;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v11),(((java.lang.Long)v12).longValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v6),((com.fasterxml.jackson.core.JsonLocation)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v18 = 7;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v16),((java.lang.Object)v17),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
