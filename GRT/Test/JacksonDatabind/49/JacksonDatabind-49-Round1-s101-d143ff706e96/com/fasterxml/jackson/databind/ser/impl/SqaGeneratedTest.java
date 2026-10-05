package com.fasterxml.jackson.databind.ser.impl;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = "[anySettr]";
    Object v9 = true;
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeBooleanField(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ", D";
    Object v15 = ": ";
    Object v16 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = ((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v21).withAlwaysAsId((((java.lang.Boolean)v22).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v12),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v21));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = "'";
    Object v11 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v12));
    ((com.fasterxml.jackson.databind.SerializerProvider)v9).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v13));
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ", D";
    Object v17 = ": ";
    Object v18 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v20));
    Object v22 = false;
    Object v23 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.PropertyName)v18),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ", D";
    Object v11 = ": ";
    Object v12 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v14));
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.PropertyName)v12),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v15),(((java.lang.Boolean)v16).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18).withAlwaysAsId((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = "'";
    Object v11 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v12));
    ((com.fasterxml.jackson.databind.SerializerProvider)v9).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v13));
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ", D";
    Object v17 = ": ";
    Object v18 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v20));
    Object v22 = false;
    Object v23 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.PropertyName)v18),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v21),(((java.lang.Boolean)v22).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v9).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v10));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ", D";
    Object v14 = ": ";
    Object v15 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v7).useDefaultPrettyPrinter();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = "Can not instantiate value of type %s from Long integral number (%s); no single-long-arg constructor/factory method";
    Object v11 = new java.lang.Object[]{};
    Object v12 = ((com.fasterxml.jackson.databind.SerializerProvider)v9).mappingException(((java.lang.String)v10),((java.lang.Object[])v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ", D";
    Object v15 = ": ";
    Object v16 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v19),(((java.lang.Boolean)v20).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v20 = "'";
    Object v21 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v22));
    Object v24 = java.lang.ClassLoader.getSystemClassLoader();
    ((com.fasterxml.jackson.core.JsonGenerator)v23).writeObjectId(((java.lang.Object)v24));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = ", D";
    Object v29 = ": ";
    Object v30 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v32));
    Object v34 = false;
    Object v35 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.PropertyName)v30),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = ((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v35).withAlwaysAsId((((java.lang.Boolean)v36).booleanValue()));
    Object v38 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v26),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v35));
    org.junit.Assert.assertEquals((Object)(false), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    Object v5 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v20 = "'";
    Object v21 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v22));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v20 = "'";
    Object v21 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = ((com.fasterxml.jackson.databind.DatabindContext)v25).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v26),((java.lang.Class)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = ", D";
    Object v32 = ": ";
    Object v33 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v31),((java.lang.String)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v35));
    Object v37 = false;
    Object v38 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.PropertyName)v33),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v36),(((java.lang.Boolean)v37).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v25),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v38));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeNull();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v20 = "'";
    Object v21 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = ", D";
    Object v28 = ": ";
    Object v29 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v31));
    Object v33 = false;
    Object v34 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.PropertyName)v29),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v32),(((java.lang.Boolean)v33).booleanValue()));
    Object v35 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v25),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v34));
    org.junit.Assert.assertEquals((Object)(false), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v20 = "'";
    Object v21 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ", D";
    Object v27 = ": ";
    Object v28 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v30));
    Object v32 = false;
    Object v33 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.PropertyName)v28),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v31),(((java.lang.Boolean)v32).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v24),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v33));
    Object v34 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ", D";
    Object v11 = ": ";
    Object v12 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v14));
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.PropertyName)v12),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v17));
    Object v19 = "'";
    Object v20 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v20));
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = ((com.fasterxml.jackson.databind.SerializerProvider)v24).getUnknownTypeSerializer(((java.lang.Class)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = ", D";
    Object v30 = ": ";
    Object v31 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v29),((java.lang.String)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v33));
    Object v35 = false;
    Object v36 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.PropertyName)v31),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v34),(((java.lang.Boolean)v35).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.databind.SerializerProvider)v24),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v36));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    Object v21 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ", D";
    Object v11 = ": ";
    Object v12 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v14));
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.PropertyName)v12),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    Object v20 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ", D";
    Object v11 = ": ";
    Object v12 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v14));
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.PropertyName)v12),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    Object v19 = ((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v17).withSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v17));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = "'";
    Object v11 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v12));
    ((com.fasterxml.jackson.databind.SerializerProvider)v9).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v13));
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ", D";
    Object v17 = ": ";
    Object v18 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v20));
    Object v22 = false;
    Object v23 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.PropertyName)v18),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    Object v25 = ((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v23).withSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v24));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v23));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = "rray";
    Object v11 = new java.lang.Object[]{null,null,null};
    Object v12 = ((com.fasterxml.jackson.databind.SerializerProvider)v9).mappingException(((java.lang.String)v10),((java.lang.Object[])v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ", D";
    Object v15 = ": ";
    Object v16 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v9).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v10));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ", D";
    Object v14 = ": ";
    Object v15 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeNull();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ", D";
    Object v13 = ": ";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v16));
    Object v18 = false;
    Object v19 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v17),(((java.lang.Boolean)v18).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v20 = "'";
    Object v21 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v22));
    Object v24 = ((com.fasterxml.jackson.core.JsonGenerator)v23).getOutputContext();
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = ", D";
    Object v29 = ": ";
    Object v30 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v32));
    Object v34 = false;
    Object v35 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.PropertyName)v30),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = ((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v35).withAlwaysAsId((((java.lang.Boolean)v36).booleanValue()));
    Object v38 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v26),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v35));
    org.junit.Assert.assertEquals((Object)(false), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v9).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v10));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ", D";
    Object v14 = ": ";
    Object v15 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    Object v20 = ((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18).withSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v20 = "'";
    Object v21 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ", D";
    Object v27 = ": ";
    Object v28 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v30));
    Object v32 = false;
    Object v33 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.PropertyName)v28),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v24),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v33));
    org.junit.Assert.assertEquals((Object)(false), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v20 = java.lang.ClassLoader.getSystemClassLoader();
    Object v21 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    ((com.fasterxml.jackson.core.JsonGenerator)v11).writeStartObject();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = "rray";
    Object v15 = new java.lang.Object[]{null,null,null};
    Object v16 = ((com.fasterxml.jackson.databind.SerializerProvider)v13).mappingException(((java.lang.String)v14),((java.lang.Object[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = ", D";
    Object v19 = ": ";
    Object v20 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v22));
    Object v24 = false;
    Object v25 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v26));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeNull();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v20 = "'";
    Object v21 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = ", D";
    Object v28 = ": ";
    Object v29 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v31));
    Object v33 = false;
    Object v34 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.PropertyName)v29),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v32),(((java.lang.Boolean)v33).booleanValue()));
    Object v35 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    Object v36 = ((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v34).withSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v35));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v25),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v34));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.DatabindContext)v9).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.Class)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ", D";
    Object v16 = ": ";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = ", D";
    Object v6 = ": ";
    Object v7 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v9));
    Object v11 = false;
    Object v12 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.PropertyName)v7),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v13).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v14));
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ", D";
    Object v18 = ": ";
    Object v19 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v21));
    Object v23 = false;
    Object v24 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new byte[]{Byte.valueOf((byte)-10),Byte.valueOf((byte)8),Byte.valueOf((byte)0)};
    Object v9 = 1;
    Object v10 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeBinary(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ", D";
    Object v15 = ": ";
    Object v16 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    Object v23 = ((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v21).withSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v22));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v12),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v21));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).flush();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v10).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v11));
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ", D";
    Object v15 = ": ";
    Object v16 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v9).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v10));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ", D";
    Object v14 = ": ";
    Object v15 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = -2L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v7).version();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ", D";
    Object v13 = ": ";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v16));
    Object v18 = false;
    Object v19 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v17),(((java.lang.Boolean)v18).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = " vs";
    Object v9 = "integer";
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStringField(((java.lang.String)v8),((java.lang.String)v9));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ", D";
    Object v15 = ": ";
    Object v16 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v19),(((java.lang.Boolean)v20).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v12),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v20 = "'";
    Object v21 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v22));
    Object v24 = ((com.fasterxml.jackson.core.JsonGenerator)v23).getFeatureMask();
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = ", D";
    Object v29 = ": ";
    Object v30 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v32));
    Object v34 = false;
    Object v35 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.PropertyName)v30),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v26),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v35));
    org.junit.Assert.assertEquals((Object)(false), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = ": ";
    Object v11 = new java.lang.Object[]{};
    Object v12 = ((com.fasterxml.jackson.databind.SerializerProvider)v9).mappingException(((java.lang.String)v10),((java.lang.Object[])v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ", D";
    Object v15 = ": ";
    Object v16 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v19),(((java.lang.Boolean)v20).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v11).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v12));
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ", D";
    Object v16 = ": ";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v20),(((java.lang.Boolean)v21).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v11),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = "UnwrappingBeanSerializer for ";
    Object v9 = 0;
    Object v10 = 1;
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeRawValue(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = "i";
    Object v15 = new java.lang.Object[]{null,null,null};
    Object v16 = ((com.fasterxml.jackson.databind.SerializerProvider)v13).mappingException(((java.lang.String)v14),((java.lang.Object[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = ", D";
    Object v19 = ": ";
    Object v20 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v22));
    Object v24 = false;
    Object v25 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v23),(((java.lang.Boolean)v24).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ", D";
    Object v14 = ": ";
    Object v15 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    Object v22 = ((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20).withSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v11),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = " vs  ";
    Object v11 = new java.lang.Object[]{null,null};
    Object v12 = ((com.fasterxml.jackson.databind.SerializerProvider)v9).mappingException(((java.lang.String)v10),((java.lang.Object[])v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ", D";
    Object v15 = ": ";
    Object v16 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = 0;
    Object v9 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).generateId(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ", D";
    Object v16 = ": ";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = java.lang.ClassLoader.getSystemClassLoader();
    Object v9 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).generateId(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ", D";
    Object v16 = ": ";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v20),(((java.lang.Boolean)v21).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v11).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ", D";
    Object v17 = ": ";
    Object v18 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v20));
    Object v22 = false;
    Object v23 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.PropertyName)v18),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v21),(((java.lang.Boolean)v22).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v14),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).generateId(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v9 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).generateId(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    ((com.fasterxml.jackson.core.JsonGenerator)v11).writeTypeId(((java.lang.Object)v13));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = ", D";
    Object v19 = ": ";
    Object v20 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v22));
    Object v24 = false;
    Object v25 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    Object v27 = ((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v25).withSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v26));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v16),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v25));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = -2L;
    Object v9 = new java.util.Date((((java.lang.Long)v8).longValue()));
    Object v10 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).generateId(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v10));
    Object v12 = "'";
    Object v13 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v17).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v18));
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = ", D";
    Object v22 = ": ";
    Object v23 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v25));
    Object v27 = false;
    Object v28 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.PropertyName)v23),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v11).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v15),((com.fasterxml.jackson.databind.SerializerProvider)v17),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v28));
    Object v30 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).generateId(((java.lang.Object)v29));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v20 = "'";
    Object v21 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = ", D";
    Object v28 = ": ";
    Object v29 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v31));
    Object v33 = false;
    Object v34 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.PropertyName)v29),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v32),(((java.lang.Boolean)v33).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v25),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v34));
    Object v35 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ", D";
    Object v16 = ": ";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v22));
    Object v24 = "'";
    Object v25 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v24));
    Object v26 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v25));
    Object v27 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v26));
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = ", D";
    Object v32 = ": ";
    Object v33 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v31),((java.lang.String)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v35));
    Object v37 = false;
    Object v38 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.PropertyName)v33),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v36),(((java.lang.Boolean)v37).booleanValue()));
    Object v39 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v27),((com.fasterxml.jackson.databind.SerializerProvider)v29),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v38));
    org.junit.Assert.assertEquals((Object)(false), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ", D";
    Object v16 = ": ";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).generateId(((java.lang.Object)v24));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ", D";
    Object v16 = ": ";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    Object v24 = ((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v22).withSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v23));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v22));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.SerializerProvider)v12).getUnknownTypeSerializer(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ", D";
    Object v18 = ": ";
    Object v19 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v21));
    Object v23 = false;
    Object v24 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v24).withAlwaysAsId((((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v12),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v24));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ", D";
    Object v15 = ": ";
    Object v16 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v12),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v24),((com.fasterxml.jackson.databind.AnnotationIntrospector)v25),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v26));
    Object v28 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).generateId(((java.lang.Object)v27));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).generateId(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ", D";
    Object v16 = ": ";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v22));
    Object v24 = "'";
    Object v25 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v24));
    Object v26 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v25));
    Object v27 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v26));
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = ", D";
    Object v32 = ": ";
    Object v33 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v31),((java.lang.String)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v35));
    Object v37 = false;
    Object v38 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.PropertyName)v33),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v36),(((java.lang.Boolean)v37).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v27),((com.fasterxml.jackson.databind.SerializerProvider)v29),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v38));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).generateId(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ", D";
    Object v15 = ": ";
    Object v16 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v12),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ", D";
    Object v16 = ": ";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v22));
    Object v24 = "'";
    Object v25 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v24));
    Object v26 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v25));
    Object v27 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v26));
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = ", D";
    Object v31 = ": ";
    Object v32 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v33));
    Object v35 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v34));
    Object v36 = false;
    Object v37 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.PropertyName)v32),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v27),((com.fasterxml.jackson.databind.SerializerProvider)v28),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v37));
    org.junit.Assert.assertEquals((Object)(false), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = java.lang.ClassLoader.getSystemClassLoader();
    Object v5 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).generateId(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v20 = "'";
    Object v21 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ", D";
    Object v27 = ": ";
    Object v28 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v30));
    Object v32 = false;
    Object v33 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.PropertyName)v28),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    Object v35 = ((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v33).withSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v34));
    Object v36 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v24),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v33));
    org.junit.Assert.assertEquals((Object)(false), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ", D";
    Object v14 = ": ";
    Object v15 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v11),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).generateId(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v10).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v10));
    Object v16 = "'";
    Object v17 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v17));
    Object v19 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = ", D";
    Object v24 = ": ";
    Object v25 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v27));
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.PropertyName)v25),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v15).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v19),((com.fasterxml.jackson.databind.SerializerProvider)v21),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v30));
    Object v32 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).generateId(((java.lang.Object)v31));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).generateId(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    ((com.fasterxml.jackson.core.JsonGenerator)v11).writeEndArray();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ", D";
    Object v16 = ": ";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v20),(((java.lang.Boolean)v21).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ", D";
    Object v16 = ": ";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).generateId(((java.lang.Object)v26));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    Object v9 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).generateId(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ", D";
    Object v15 = ": ";
    Object v16 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v12),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v21));
    Object v23 = "'";
    Object v24 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v24));
    Object v26 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v25));
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = ", D";
    Object v31 = ": ";
    Object v32 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v33));
    Object v35 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v34));
    Object v36 = false;
    Object v37 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.PropertyName)v32),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v35),(((java.lang.Boolean)v36).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v26),((com.fasterxml.jackson.databind.SerializerProvider)v28),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v37));
    Object v38 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ", D";
    Object v11 = ": ";
    Object v12 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v14));
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.PropertyName)v12),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v17));
    Object v19 = "'";
    Object v20 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v20));
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v21));
    Object v23 = "'";
    Object v24 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v23));
    ((com.fasterxml.jackson.core.JsonGenerator)v22).writeTree(((com.fasterxml.jackson.core.TreeNode)v24));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = ", D";
    Object v30 = ": ";
    Object v31 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v29),((java.lang.String)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v33));
    Object v35 = false;
    Object v36 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.PropertyName)v31),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v34),(((java.lang.Boolean)v35).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.databind.SerializerProvider)v27),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v36));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ", D";
    Object v11 = ": ";
    Object v12 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v14));
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.PropertyName)v12),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v17).withAlwaysAsId((((java.lang.Boolean)v18).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v17));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = "<";
    Object v15 = new java.lang.Object[]{null,null,null};
    Object v16 = ((com.fasterxml.jackson.databind.SerializerProvider)v13).mappingException(((java.lang.String)v14),((java.lang.Object[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = ", D";
    Object v19 = ": ";
    Object v20 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v22));
    Object v24 = false;
    Object v25 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v23),(((java.lang.Boolean)v24).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = 0;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v11).setFeatureMask((((java.lang.Integer)v12).intValue()));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ", D";
    Object v18 = ": ";
    Object v19 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v21));
    Object v23 = false;
    Object v24 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v15),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v24));
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ", D";
    Object v16 = ": ";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = false;
    Object v24 = ((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v22).withAlwaysAsId((((java.lang.Boolean)v23).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v22));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ", D";
    Object v15 = ": ";
    Object v16 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v19),(((java.lang.Boolean)v20).booleanValue()));
    ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsField(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v12),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v4 = "'";
    Object v5 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ", D";
    Object v12 = ": ";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v20 = "'";
    Object v21 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v24).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v25));
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = ", D";
    Object v29 = ": ";
    Object v30 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v32));
    Object v34 = false;
    Object v35 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.PropertyName)v30),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = ((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v35).withAlwaysAsId((((java.lang.Boolean)v36).booleanValue()));
    Object v38 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v3).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v24),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v35));
    org.junit.Assert.assertEquals((Object)(false), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2).canUseFor(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v2));
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v11).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = ", D";
    Object v19 = ": ";
    Object v20 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v22));
    Object v24 = false;
    Object v25 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v7).writeAsId(((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v16),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v25));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }
}
