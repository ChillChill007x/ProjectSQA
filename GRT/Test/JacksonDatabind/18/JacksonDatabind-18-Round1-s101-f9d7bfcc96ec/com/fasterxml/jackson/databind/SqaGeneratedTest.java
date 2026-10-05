package com.fasterxml.jackson.databind;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((java.util.Collection)v1).stream();
    Object v3 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll(((java.util.Collection)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = ((com.fasterxml.jackson.databind.MappingIterator)v0).hasNextValue();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = ((com.fasterxml.jackson.databind.MappingIterator)v0).nextValue();
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll(((java.util.Collection)v1));
    ((com.fasterxml.jackson.databind.MappingIterator)v0).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = ((com.fasterxml.jackson.databind.MappingIterator)v0).getParser();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    ((com.fasterxml.jackson.databind.MappingIterator)v0).close();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = ((com.fasterxml.jackson.databind.MappingIterator)v0).hasNextValue();
    Object v2 = new java.util.ArrayList();
    Object v3 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v2 = ((com.fasterxml.jackson.databind.MappingIterator)v1).hasNextValue();
    Object v3 = new java.util.ArrayList();
    Object v4 = ((com.fasterxml.jackson.databind.MappingIterator)v1).readAll(((java.util.List)v3));
    Object v5 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v4).replaceAll(((java.util.function.UnaryOperator)v5));
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll(((java.util.List)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).endOfInputException(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = "number";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "number";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType)v33));
    Object v35 = true;
    Object v36 = "number";
    Object v37 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v36));
    Object v38 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = false;
    Object v29 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v30 = ((com.fasterxml.jackson.databind.MappingIterator)v29).hasNextValue();
    Object v31 = new java.util.ArrayList();
    Object v32 = ((com.fasterxml.jackson.databind.MappingIterator)v29).readAll(((java.util.List)v31));
    Object v33 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = false;
    Object v29 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v30 = ((com.fasterxml.jackson.databind.MappingIterator)v29).hasNextValue();
    Object v31 = new java.util.ArrayList();
    Object v32 = ((com.fasterxml.jackson.databind.MappingIterator)v29).readAll(((java.util.List)v31));
    Object v33 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v32));
    Object v34 = new java.util.ArrayList();
    Object v35 = ((com.fasterxml.jackson.databind.MappingIterator)v33).readAll(((java.util.List)v34));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    ((com.fasterxml.jackson.databind.MappingIterator)v0)._resync();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll(((java.util.List)v1));
    ((com.fasterxml.jackson.databind.MappingIterator)v0).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = ((com.fasterxml.jackson.databind.MappingIterator)v0).getCurrentLocation();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll(((java.util.List)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).endOfInputException(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = "number";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "number";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType)v33));
    Object v35 = true;
    Object v36 = "number";
    Object v37 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v36));
    Object v38 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v37));
    Object v39 = ((com.fasterxml.jackson.databind.MappingIterator)v38).readAll();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll();
    Object v2 = 0;
    Object v3 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = "L";
    Object v6 = ">";
    Object v7 = new com.fasterxml.jackson.databind.RuntimeJsonMappingException(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5),((java.lang.Throwable)v7));
    Object v9 = ((java.lang.Throwable)v8).fillInStackTrace();
    Object v10 = ((com.fasterxml.jackson.databind.MappingIterator)v0)._handleIOException(((java.io.IOException)v8));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = false;
    Object v29 = "number";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll(((java.util.List)v1));
    Object v3 = "number";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "number";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll(((java.util.Collection)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v2 = new java.util.ArrayList();
    Object v3 = ((com.fasterxml.jackson.databind.MappingIterator)v1).readAll(((java.util.List)v2));
    Object v4 = ((java.util.Collection)v3).iterator();
    Object v5 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll(((java.util.Collection)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll(((java.util.List)v1));
    Object v3 = ((com.fasterxml.jackson.databind.MappingIterator)v0).hasNextValue();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    ((com.fasterxml.jackson.databind.MappingIterator)v0).close();
    Object v1 = null;
    ((com.fasterxml.jackson.databind.MappingIterator)v0).close();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v2 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v3 = new java.util.ArrayList();
    Object v4 = ((com.fasterxml.jackson.databind.MappingIterator)v2).readAll(((java.util.List)v3));
    Object v5 = ((java.util.Collection)v4).iterator();
    Object v6 = ((com.fasterxml.jackson.databind.MappingIterator)v1).readAll(((java.util.Collection)v4));
    Object v7 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll(((java.util.List)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = ((com.fasterxml.jackson.databind.MappingIterator)v0).hasNextValue();
    Object v2 = new java.util.TreeSet();
    Object v3 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll(((java.util.Collection)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = ((com.fasterxml.jackson.databind.MappingIterator)v0).next();
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).leaseObjectBuffer();
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = false;
    Object v30 = ">";
    Object v31 = new com.fasterxml.jackson.databind.RuntimeJsonMappingException(((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.core.type.ResolvedType)v6).toCanonical();
    Object v8 = 0;
    Object v9 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v10),((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = ((com.fasterxml.jackson.databind.MappingIterator)v0)._throwNoSuchElement();
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v2 = new java.util.ArrayList();
    Object v3 = ((com.fasterxml.jackson.databind.MappingIterator)v1).readAll(((java.util.List)v2));
    Object v4 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll(((java.util.List)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.core.type.ResolvedType)v6).toCanonical();
    Object v8 = 0;
    Object v9 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v10),((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v30));
    ((com.fasterxml.jackson.databind.MappingIterator)v31).close();
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = 0;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "L";
    Object v5 = ">";
    Object v6 = new com.fasterxml.jackson.databind.RuntimeJsonMappingException(((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Throwable)v6));
    Object v8 = ((com.fasterxml.jackson.databind.MappingIterator)v0)._handleMappingException(((com.fasterxml.jackson.databind.JsonMappingException)v7));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.RuntimeJsonMappingException");
    } catch (com.fasterxml.jackson.databind.RuntimeJsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = ((com.fasterxml.jackson.databind.MappingIterator)v0).hasNext();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    ((com.fasterxml.jackson.databind.MappingIterator)v0).close();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.MappingIterator)v0).hasNextValue();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll(((java.util.Collection)v1));
    Object v3 = ((com.fasterxml.jackson.databind.MappingIterator)v0)._throwNoSuchElement();
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).leaseObjectBuffer();
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = false;
    Object v30 = ">";
    Object v31 = new com.fasterxml.jackson.databind.RuntimeJsonMappingException(((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v31));
    Object v33 = ((com.fasterxml.jackson.databind.MappingIterator)v32).next();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.core.type.ResolvedType)v6).toCanonical();
    Object v8 = 0;
    Object v9 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v10),((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v30));
    ((com.fasterxml.jackson.databind.MappingIterator)v31).close();
    Object v32 = null;
    Object v33 = ((com.fasterxml.jackson.databind.MappingIterator)v31).getParserSchema();
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).leaseObjectBuffer();
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = false;
    Object v30 = ">";
    Object v31 = new com.fasterxml.jackson.databind.RuntimeJsonMappingException(((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v31));
    Object v33 = ((com.fasterxml.jackson.databind.MappingIterator)v32).getCurrentLocation();
    ((com.fasterxml.jackson.databind.MappingIterator)v32).close();
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getEmbeddedObject();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = new java.util.ArrayList();
    Object v30 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v2 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v3 = new java.util.ArrayList();
    Object v4 = ((com.fasterxml.jackson.databind.MappingIterator)v2).readAll(((java.util.List)v3));
    Object v5 = ((com.fasterxml.jackson.databind.MappingIterator)v1).readAll(((java.util.List)v4));
    Object v6 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll(((java.util.List)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).leaseObjectBuffer();
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = false;
    Object v30 = ">";
    Object v31 = new com.fasterxml.jackson.databind.RuntimeJsonMappingException(((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v31));
    ((com.fasterxml.jackson.databind.MappingIterator)v32)._resync();
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getEmbeddedObject();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.MappingIterator)v31).hasNextValue();
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getEmbeddedObject();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.MappingIterator)v31).nextValue();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = new java.util.ArrayList();
    Object v30 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v29));
    Object v31 = ((com.fasterxml.jackson.databind.MappingIterator)v30).hasNextValue();
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v2 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v3 = new java.util.ArrayList();
    Object v4 = ((com.fasterxml.jackson.databind.MappingIterator)v2).readAll(((java.util.List)v3));
    Object v5 = ((com.fasterxml.jackson.databind.MappingIterator)v1).readAll(((java.util.List)v4));
    Object v6 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll(((java.util.Collection)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = false;
    Object v29 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v30 = ((com.fasterxml.jackson.databind.MappingIterator)v29).hasNextValue();
    Object v31 = new java.util.ArrayList();
    Object v32 = ((com.fasterxml.jackson.databind.MappingIterator)v29).readAll(((java.util.List)v31));
    Object v33 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v32));
    Object v34 = ((com.fasterxml.jackson.databind.MappingIterator)v33).nextValue();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = false;
    Object v29 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v30 = ((com.fasterxml.jackson.databind.MappingIterator)v29).hasNextValue();
    Object v31 = new java.util.ArrayList();
    Object v32 = ((com.fasterxml.jackson.databind.MappingIterator)v29).readAll(((java.util.List)v31));
    Object v33 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v32));
    ((com.fasterxml.jackson.databind.MappingIterator)v33)._resync();
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).leaseObjectBuffer();
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = false;
    Object v30 = ">";
    Object v31 = new com.fasterxml.jackson.databind.RuntimeJsonMappingException(((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v31));
    ((com.fasterxml.jackson.databind.MappingIterator)v32).close();
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getEmbeddedObject();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v30));
    Object v32 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v33 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v34 = new java.util.ArrayList();
    Object v35 = ((com.fasterxml.jackson.databind.MappingIterator)v33).readAll(((java.util.List)v34));
    Object v36 = ((com.fasterxml.jackson.databind.MappingIterator)v32).readAll(((java.util.List)v35));
    Object v37 = ((com.fasterxml.jackson.databind.MappingIterator)v31).readAll(((java.util.Collection)v36));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getEmbeddedObject();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.MappingIterator)v31).hasNext();
    ((com.fasterxml.jackson.databind.MappingIterator)v31).close();
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v6).containedTypeOrUnknown((((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "number";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "number";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v32 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Object)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getEmbeddedObject();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.MappingIterator)v31).getParserSchema();
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = new java.util.ArrayList();
    Object v30 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v29));
    ((com.fasterxml.jackson.databind.MappingIterator)v30).remove();
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getEmbeddedObject();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.MappingIterator)v31).hasNext();
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = "number";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getEmbeddedObject();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.MappingIterator)v31)._throwNoSuchElement();
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = false;
    Object v29 = "number";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v30));
    ((com.fasterxml.jackson.databind.MappingIterator)v31).close();
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).leaseObjectBuffer();
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = false;
    Object v30 = ">";
    Object v31 = new com.fasterxml.jackson.databind.RuntimeJsonMappingException(((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v31));
    Object v33 = ((com.fasterxml.jackson.databind.MappingIterator)v32).getCurrentLocation();
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v30 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v31 = new java.util.ArrayList();
    Object v32 = ((com.fasterxml.jackson.databind.MappingIterator)v30).readAll(((java.util.List)v31));
    Object v33 = ((java.util.Collection)v32).iterator();
    Object v34 = ((com.fasterxml.jackson.databind.MappingIterator)v29).readAll(((java.util.Collection)v32));
    Object v35 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v6).containedTypeOrUnknown((((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "number";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "number";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v32 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Object)v31));
    ((com.fasterxml.jackson.databind.MappingIterator)v32).close();
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v2 = ((com.fasterxml.jackson.databind.MappingIterator)v1).readAll();
    Object v3 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = new java.lang.StringBuilder();
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v6).getErasedSignature(((java.lang.StringBuilder)v7));
    Object v9 = 0;
    Object v10 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "number";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "number";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = false;
    Object v31 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v32 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v33 = ((com.fasterxml.jackson.databind.MappingIterator)v32).hasNextValue();
    Object v34 = new java.util.ArrayList();
    Object v35 = ((com.fasterxml.jackson.databind.MappingIterator)v32).readAll(((java.util.List)v34));
    Object v36 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v35).replaceAll(((java.util.function.UnaryOperator)v36));
    Object v37 = null;
    Object v38 = ((com.fasterxml.jackson.databind.MappingIterator)v31).readAll(((java.util.List)v35));
    Object v39 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Object)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getEmbeddedObject();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v30));
    ((com.fasterxml.jackson.databind.MappingIterator)v31).close();
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v2 = ((com.fasterxml.jackson.databind.MappingIterator)v1).hasNextValue();
    Object v3 = new java.util.TreeSet();
    Object v4 = ((com.fasterxml.jackson.databind.MappingIterator)v1).readAll(((java.util.Collection)v3));
    Object v5 = ((com.fasterxml.jackson.databind.MappingIterator)v0).readAll(((java.util.Collection)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = "number";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v30));
    ((com.fasterxml.jackson.databind.MappingIterator)v31).close();
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v30 = new java.util.ArrayList();
    Object v31 = ((com.fasterxml.jackson.databind.MappingIterator)v29).readAll(((java.util.List)v30));
    Object v32 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = 0;
    Object v30 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v29).intValue()));
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = new java.util.ArrayList();
    Object v30 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v29));
    Object v31 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v32 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v33 = new java.util.ArrayList();
    Object v34 = ((com.fasterxml.jackson.databind.MappingIterator)v32).readAll(((java.util.List)v33));
    Object v35 = ((java.util.Collection)v34).iterator();
    Object v36 = ((com.fasterxml.jackson.databind.MappingIterator)v31).readAll(((java.util.Collection)v34));
    Object v37 = ((com.fasterxml.jackson.databind.MappingIterator)v30).readAll(((java.util.List)v36));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = new java.util.ArrayList();
    Object v30 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v29));
    ((com.fasterxml.jackson.databind.MappingIterator)v30)._resync();
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = 0;
    Object v30 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v29).intValue()));
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.MappingIterator)v31).hasNextValue();
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = false;
    Object v29 = "number";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v30));
    ((com.fasterxml.jackson.databind.MappingIterator)v31)._resync();
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = false;
    Object v29 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v30 = ((com.fasterxml.jackson.databind.MappingIterator)v29).readAll();
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = new java.util.ArrayList();
    Object v30 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v29));
    Object v31 = ((com.fasterxml.jackson.databind.MappingIterator)v30).nextValue();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v1 = 0;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "L";
    Object v5 = ">";
    Object v6 = new com.fasterxml.jackson.databind.RuntimeJsonMappingException(((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Throwable)v6));
    Object v8 = ((java.lang.Throwable)v7).toString();
    Object v9 = ((com.fasterxml.jackson.databind.MappingIterator)v0)._handleIOException(((java.io.IOException)v7));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = 0;
    Object v30 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v29).intValue()));
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v30));
    Object v32 = "number";
    Object v33 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v32));
    Object v34 = "number";
    Object v35 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v34));
    Object v36 = java.util.EnumSet.of(((java.lang.Enum)v33),((java.lang.Enum)v35));
    Object v37 = ((com.fasterxml.jackson.databind.MappingIterator)v31).readAll(((java.util.Collection)v36));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = 0;
    Object v30 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v29).intValue()));
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.MappingIterator)v31).readAll();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.core.type.ResolvedType)v6).toCanonical();
    Object v8 = 0;
    Object v9 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v10),((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v30));
    ((com.fasterxml.jackson.databind.MappingIterator)v31).close();
    Object v32 = null;
    ((com.fasterxml.jackson.databind.MappingIterator)v31).close();
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v30 = new java.util.ArrayList();
    Object v31 = ((com.fasterxml.jackson.databind.MappingIterator)v29).readAll(((java.util.List)v30));
    Object v32 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v31));
    ((com.fasterxml.jackson.databind.MappingIterator)v32).close();
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).nextFieldName();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = false;
    Object v30 = new java.util.TreeSet();
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = false;
    Object v29 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v30 = ((com.fasterxml.jackson.databind.MappingIterator)v29).readAll();
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.MappingIterator)v31).nextValue();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = false;
    Object v29 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    ((com.fasterxml.jackson.databind.MappingIterator)v29).close();
    Object v30 = null;
    Object v31 = ((com.fasterxml.jackson.databind.MappingIterator)v29).hasNextValue();
    Object v32 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v30 = new java.util.ArrayList();
    Object v31 = ((com.fasterxml.jackson.databind.MappingIterator)v29).readAll(((java.util.List)v30));
    Object v32 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v31));
    Object v33 = ((com.fasterxml.jackson.databind.MappingIterator)v32).getCurrentLocation();
    Object v34 = ((com.fasterxml.jackson.databind.MappingIterator)v32).hasNextValue();
    org.junit.Assert.assertEquals((Object)(true), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = 0;
    Object v30 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v29).intValue()));
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v30));
    Object v32 = new java.util.ArrayList();
    Object v33 = ((com.fasterxml.jackson.databind.MappingIterator)v31).readAll(((java.util.List)v32));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v30 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v31 = new java.util.ArrayList();
    Object v32 = ((com.fasterxml.jackson.databind.MappingIterator)v30).readAll(((java.util.List)v31));
    Object v33 = ((java.util.Collection)v32).iterator();
    Object v34 = ((com.fasterxml.jackson.databind.MappingIterator)v29).readAll(((java.util.Collection)v32));
    Object v35 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v34));
    Object v36 = ((com.fasterxml.jackson.databind.MappingIterator)v35).hasNextValue();
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v30 = new java.util.ArrayList();
    Object v31 = ((com.fasterxml.jackson.databind.MappingIterator)v29).readAll(((java.util.List)v30));
    Object v32 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v31));
    ((com.fasterxml.jackson.databind.MappingIterator)v32).close();
    Object v33 = null;
    Object v34 = ((com.fasterxml.jackson.databind.MappingIterator)v32).nextValue();
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = false;
    Object v29 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    ((com.fasterxml.jackson.databind.MappingIterator)v29).close();
    Object v30 = null;
    Object v31 = ((com.fasterxml.jackson.databind.MappingIterator)v29).hasNextValue();
    Object v32 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v31));
    Object v33 = ((com.fasterxml.jackson.databind.MappingIterator)v32).nextValue();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = 0;
    Object v30 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v29).intValue()));
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.MappingIterator)v31).getCurrentLocation();
    ((com.fasterxml.jackson.databind.MappingIterator)v31).close();
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = false;
    Object v29 = " properties (in JSON Arra)";
    Object v30 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v30 = new java.util.ArrayList();
    Object v31 = ((com.fasterxml.jackson.databind.MappingIterator)v29).readAll(((java.util.List)v30));
    Object v32 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v31));
    Object v33 = new java.util.ArrayList();
    Object v34 = ((com.fasterxml.jackson.databind.MappingIterator)v32).readAll(((java.util.Collection)v33));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = false;
    Object v29 = " properties (in JSON Arra)";
    Object v30 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.MappingIterator)v31).hasNextValue();
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).leaseObjectBuffer();
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = false;
    Object v30 = ">";
    Object v31 = new com.fasterxml.jackson.databind.RuntimeJsonMappingException(((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v31));
    Object v33 = ((com.fasterxml.jackson.databind.MappingIterator)v32).nextValue();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = false;
    Object v29 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    ((com.fasterxml.jackson.databind.MappingIterator)v29).close();
    Object v30 = null;
    Object v31 = ((com.fasterxml.jackson.databind.MappingIterator)v29).hasNextValue();
    Object v32 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v31));
    Object v33 = ((com.fasterxml.jackson.databind.MappingIterator)v32).hasNextValue();
    org.junit.Assert.assertEquals((Object)(true), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v30 = new java.util.ArrayList();
    Object v31 = ((com.fasterxml.jackson.databind.MappingIterator)v29).readAll(((java.util.List)v30));
    Object v32 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v31));
    Object v33 = ((com.fasterxml.jackson.databind.MappingIterator)v32).nextValue();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = false;
    Object v29 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
    Object v30 = ((com.fasterxml.jackson.databind.MappingIterator)v29).readAll();
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v30));
    ((com.fasterxml.jackson.databind.MappingIterator)v31)._resync();
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).nextFieldName();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "number";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = false;
    Object v30 = new java.util.TreeSet();
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Object)v30));
    Object v32 = new java.util.ArrayList();
    Object v33 = ((com.fasterxml.jackson.databind.MappingIterator)v31).readAll(((java.util.Collection)v32));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = false;
    Object v29 = " properties (in JSON Arra)";
    Object v30 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.MappingIterator)v31).readAll();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = 0;
    Object v30 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v29).intValue()));
    Object v31 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.MappingIterator)v31).hasNext();
    ((com.fasterxml.jackson.databind.MappingIterator)v31).close();
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "number";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = true;
    Object v29 = new java.util.ArrayList();
    Object v30 = new com.fasterxml.jackson.databind.MappingIterator(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Object)v29));
    Object v31 = "number";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = "number";
    Object v34 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v33));
    Object v35 = java.util.EnumSet.of(((java.lang.Enum)v32),((java.lang.Enum)v34));
    Object v36 = ((com.fasterxml.jackson.databind.MappingIterator)v30).readAll(((java.util.Collection)v35));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }
}
