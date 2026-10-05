package com.fasterxml.jackson.databind.type;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = ")";
    Object v6 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parseTypes(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "JsonNode not of type ObjeuctNode (but ";
    Object v6 = ")";
    Object v7 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).findClass(((java.lang.String)v5),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v22));
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8).constructType(((java.lang.reflect.Type)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "";
    Object v6 = ")";
    Object v7 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).findClass(((java.lang.String)v5),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = ")";
    Object v11 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parseType(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "";
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parse(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "]";
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parse(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = ")";
    Object v6 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parseType(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "string";
    Object v6 = ")";
    Object v7 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).findClass(((java.lang.String)v5),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = "number";
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parse(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = ")";
    Object v6 = ")";
    Object v7 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).findClass(((java.lang.String)v5),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = ")";
    Object v6 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v5));
    Object v7 = ((java.util.Enumeration)v6).asIterator();
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parseType(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "not a valid representation";
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parse(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = ")";
    Object v11 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v10));
    Object v12 = ((java.util.StringTokenizer)v11).countTokens();
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parseTypes(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = ")";
    Object v6 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v5));
    Object v7 = ((java.util.StringTokenizer)v6).countTokens();
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parseType(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = ")";
    Object v11 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).parseType(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = 12;
    Object v16 = -29;
    Object v17 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "+00:00S";
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parse(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = "'";
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).parse(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "NULL";
    Object v6 = ")";
    Object v7 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v6));
    Object v8 = "ites";
    Object v9 = ((java.util.StringTokenizer)v7).nextToken(((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).findClass(((java.lang.String)v5),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = ")";
    Object v6 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v5));
    Object v7 = "AnnotationIntrospector returned Converter definition of type ";
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeParser)v4)._problem(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = "string";
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parse(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "\" (class ";
    Object v6 = ")";
    Object v7 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).findClass(((java.lang.String)v5),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = "]";
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).parse(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = "Can not handle managed/back reference '";
    Object v11 = ")";
    Object v12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).findClass(((java.lang.String)v10),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "'";
    Object v6 = ")";
    Object v7 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).findClass(((java.lang.String)v5),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = 12;
    Object v16 = -29;
    Object v17 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = ")";
    Object v21 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeParser)v19).parseType(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = ")";
    Object v6 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v6).hasMoreTokens();
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parseType(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8).constructCollectionLikeType(((java.lang.Class)v11),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = "array";
    Object v11 = ")";
    Object v12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).findClass(((java.lang.String)v10),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "Missing referencedType";
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parse(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8).constructReferenceType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "null";
    Object v6 = ")";
    Object v7 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).findClass(((java.lang.String)v5),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = ")";
    Object v11 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).parseTypes(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "Can not construct SimpleType for a Collection (class: ";
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parse(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "F9AIL_ON_NULL_CREATOR_PROPERTIES";
    Object v6 = ")";
    Object v7 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).findClass(((java.lang.String)v5),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = ")";
    Object v11 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v10));
    Object v12 = "[RawValue of type %s]";
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeParser)v4)._problem(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v11),((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = "': class ";
    Object v11 = ")";
    Object v12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).findClass(((java.lang.String)v10),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = ")";
    Object v11 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parseTypes(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8).constructReferenceType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v18 = 12;
    Object v19 = -29;
    Object v20 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v20));
    ((com.fasterxml.jackson.databind.type.TypeFactory)v21).clearCache();
    Object v22 = null;
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeParser)v17).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v21));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = 12;
    Object v16 = -29;
    Object v17 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = 12;
    Object v21 = -29;
    Object v22 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v22));
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeParser)v19).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8).constructCollectionLikeType(((java.lang.Class)v11),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v17 = "Can not use FormatSchema of type ";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v18));
    Object v20 = ((com.fasterxml.jackson.databind.type.TypeParser)v16).findClass(((java.lang.String)v17),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = 12;
    Object v16 = -29;
    Object v17 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = 12;
    Object v21 = -29;
    Object v22 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v22));
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeParser)v19).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = ")";
    Object v26 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v25));
    Object v27 = ((com.fasterxml.jackson.databind.type.TypeParser)v24).parseTypes(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "Can not deserialize a POJO (of type %s) from non-Array rpresentation (token: %s): type/property designed to be serialized as JSON Array";
    Object v6 = ")";
    Object v7 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).findClass(((java.lang.String)v5),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = " (from class ";
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parse(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = ")";
    Object v16 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeParser)v14).parseType(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = 12;
    Object v16 = -29;
    Object v17 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = 12;
    Object v21 = -29;
    Object v22 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v22));
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeParser)v19).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = ")";
    Object v26 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v25));
    Object v27 = ((java.util.StringTokenizer)v26).hasMoreElements();
    Object v28 = ((com.fasterxml.jackson.databind.type.TypeParser)v24).parseType(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = 12;
    Object v16 = -29;
    Object v17 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = 12;
    Object v21 = -29;
    Object v22 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v22));
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeParser)v19).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = "java.lang";
    Object v26 = ")";
    Object v27 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v26));
    Object v28 = ((java.util.StringTokenizer)v27).hasMoreElements();
    Object v29 = ((com.fasterxml.jackson.databind.type.TypeParser)v24).findClass(((java.lang.String)v25),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = 12;
    Object v16 = -29;
    Object v17 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = "Do not know how to construct standard type serializer for inclusin type: ";
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeParser)v19).parse(((java.lang.String)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8).constructCollectionLikeType(((java.lang.Class)v11),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v17 = 12;
    Object v18 = -29;
    Object v19 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v19));
    ((com.fasterxml.jackson.databind.type.TypeFactory)v20).clearCache();
    Object v21 = null;
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeParser)v16).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = "u";
    Object v11 = ")";
    Object v12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).findClass(((java.lang.String)v10),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = " ";
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parse(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).findTypeParameters(((java.lang.Class)v6),((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = 12;
    Object v16 = -29;
    Object v17 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeParser)v14).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = ")";
    Object v21 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeParser)v14).parseType(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8).constructReferenceType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v18 = 12;
    Object v19 = -29;
    Object v20 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v20));
    ((com.fasterxml.jackson.databind.type.TypeFactory)v21).clearCache();
    Object v22 = null;
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeParser)v17).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v21));
    Object v24 = ")";
    Object v25 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v24));
    Object v26 = ")";
    ((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v25).pushBack(((java.lang.String)v26));
    Object v27 = null;
    Object v28 = ((com.fasterxml.jackson.databind.type.TypeParser)v23).parseTypes(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v25));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8).constructCollectionLikeType(((java.lang.Class)v11),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v17 = 12;
    Object v18 = -29;
    Object v19 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v19));
    ((com.fasterxml.jackson.databind.type.TypeFactory)v20).clearCache();
    Object v21 = null;
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeParser)v16).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v23 = 12;
    Object v24 = -29;
    Object v25 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v25));
    Object v27 = ((com.fasterxml.jackson.databind.type.TypeParser)v22).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v26));
    Object v28 = ", probled: ";
    Object v29 = ((com.fasterxml.jackson.databind.type.TypeParser)v22).parse(((java.lang.String)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8).constructReferenceType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v18));
    Object v20 = ((com.fasterxml.jackson.databind.type.TypeParser)v17).parseType(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = "";
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).parse(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = ")";
    Object v6 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v5));
    Object v7 = ",@ contains ";
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeParser)v4)._problem(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8).constructCollectionLikeType(((java.lang.Class)v11),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v17 = 12;
    Object v18 = -29;
    Object v19 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v19));
    ((com.fasterxml.jackson.databind.type.TypeFactory)v20).clearCache();
    Object v21 = null;
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeParser)v16).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v23 = ") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'";
    Object v24 = ")";
    Object v25 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v24));
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeParser)v22).findClass(((java.lang.String)v23),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v25));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = 12;
    Object v16 = -29;
    Object v17 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = "_";
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeParser)v19).parse(((java.lang.String)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "-";
    Object v6 = ")";
    Object v7 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).findClass(((java.lang.String)v5),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8).constructReferenceType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v18 = 12;
    Object v19 = -29;
    Object v20 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v20));
    ((com.fasterxml.jackson.databind.type.TypeFactory)v21).clearCache();
    Object v22 = null;
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeParser)v17).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v21));
    Object v24 = 12;
    Object v25 = -29;
    Object v26 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v26));
    Object v28 = ((com.fasterxml.jackson.databind.type.TypeParser)v23).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8).constructCollectionLikeType(((java.lang.Class)v11),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v17 = "true";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v18));
    Object v20 = ((com.fasterxml.jackson.databind.type.TypeParser)v16).findClass(((java.lang.String)v17),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8).constructCollectionLikeType(((java.lang.Class)v11),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v17 = ")";
    Object v18 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeParser)v16).parseType(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8).constructReferenceType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v18 = 12;
    Object v19 = -29;
    Object v20 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v20));
    ((com.fasterxml.jackson.databind.type.TypeFactory)v21).clearCache();
    Object v22 = null;
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeParser)v17).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v21));
    Object v24 = ")";
    Object v25 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v24));
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeParser)v23).parseType(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v25));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).findTypeParameters(((java.lang.Class)v6),((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v12 = 12;
    Object v13 = -29;
    Object v14 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeParser)v11).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).findTypeParameters(((java.lang.Class)v6),((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v12 = ")";
    Object v13 = ")";
    Object v14 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeParser)v11).findClass(((java.lang.String)v12),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8).constructCollectionLikeType(((java.lang.Class)v11),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v17 = "]";
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeParser)v16).parse(((java.lang.String)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = 12;
    Object v16 = -29;
    Object v17 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = 12;
    Object v21 = -29;
    Object v22 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v22));
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeParser)v19).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = ")";
    Object v26 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v25));
    Object v27 = ((com.fasterxml.jackson.databind.type.TypeParser)v24).parseType(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = ")";
    Object v11 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v10));
    Object v12 = ((java.util.Enumeration)v11).asIterator();
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parseType(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).findTypeParameters(((java.lang.Class)v6),((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v12 = ")";
    Object v13 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v11).parseTypes(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).findTypeParameters(((java.lang.Class)v6),((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v12 = 12;
    Object v13 = -29;
    Object v14 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeParser)v11).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = "]";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v18));
    Object v20 = ((com.fasterxml.jackson.databind.type.TypeParser)v16).findClass(((java.lang.String)v17),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = ")";
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parse(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = ")";
    Object v6 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v6).getRemainingInput();
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parseTypes(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = "lass ";
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).parse(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "'";
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parse(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = "Can not refine serialization key type %s into %s; types not related";
    Object v11 = ")";
    Object v12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).findClass(((java.lang.String)v10),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = 12;
    Object v16 = -29;
    Object v17 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = 12;
    Object v21 = -29;
    Object v22 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v22));
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeParser)v19).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = "]";
    Object v26 = ")";
    Object v27 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.type.TypeParser)v24).findClass(((java.lang.String)v25),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8).constructReferenceType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v18 = "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s";
    Object v19 = ")";
    Object v20 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeParser)v17).findClass(((java.lang.String)v18),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "Root name '%s' does not match expected ('%s') for tybe %s";
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).parse(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = 12;
    Object v16 = -29;
    Object v17 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = 12;
    Object v21 = -29;
    Object v22 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v22));
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeParser)v19).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = "y ";
    Object v26 = ")";
    Object v27 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.type.TypeParser)v24).findClass(((java.lang.String)v25),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v11));
    Object v13 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType[])v13));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).findTypeParameters(((java.lang.Class)v6),((java.lang.Class)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = "#";
    Object v11 = ")";
    Object v12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).findClass(((java.lang.String)v10),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "items";
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeParser)v14).parse(((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "no int/Int-argument constructor/factory method to deserialize from Number value (%s)";
    Object v16 = ")";
    Object v17 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeParser)v14).findClass(((java.lang.String)v15),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = 12;
    Object v16 = -29;
    Object v17 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeParser)v14).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = ")";
    Object v21 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeParser)v14).parseTypes(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).findTypeParameters(((java.lang.Class)v6),((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v12 = 12;
    Object v13 = -29;
    Object v14 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeParser)v11).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")";
    Object v18 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeParser)v16).parseType(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "#";
    Object v16 = ")";
    Object v17 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeParser)v14).findClass(((java.lang.String)v15),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = 12;
    Object v16 = -29;
    Object v17 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeParser)v14).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = ")";
    Object v21 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v20));
    Object v22 = ": value instantiaor (";
    Object v23 = ((java.util.StringTokenizer)v21).nextToken(((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeParser)v14).parseTypes(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v11));
    Object v13 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType[])v13));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).findTypeParameters(((java.lang.Class)v6),((java.lang.Class)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v17 = 12;
    Object v18 = -29;
    Object v19 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v19));
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeParser)v16).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = "Invalid array-delegate-creator definition for ";
    Object v11 = ")";
    Object v12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v11));
    Object v13 = ((java.util.StringTokenizer)v12).countTokens();
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).findClass(((java.lang.String)v10),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8).constructCollectionLikeType(((java.lang.Class)v11),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v17 = "strig";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v18));
    Object v20 = "Internal error: class %s not inc";
    ((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v19).pushBack(((java.lang.String)v20));
    Object v21 = null;
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeParser)v16).findClass(((java.lang.String)v17),((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = ")";
    Object v16 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeParser)v14).parseTypes(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).findTypeParameters(((java.lang.Class)v6),((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v12 = 12;
    Object v13 = -29;
    Object v14 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeParser)v11).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")";
    Object v18 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer(((java.lang.String)v17));
    Object v19 = "array";
    ((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v18).pushBack(((java.lang.String)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeParser)v16).parseTypes(((com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = 12;
    Object v16 = -29;
    Object v17 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = "";
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeParser)v19).parse(((java.lang.String)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeParser)v4).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeParser)v9).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "Can not locate clss '";
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeParser)v14).parse(((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
