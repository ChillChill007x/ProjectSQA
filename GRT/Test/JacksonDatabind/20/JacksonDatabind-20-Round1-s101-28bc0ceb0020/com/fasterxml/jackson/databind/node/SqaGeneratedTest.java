package com.fasterxml.jackson.databind.node;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = 0;
    Object v8 = ((com.fasterxml.jackson.databind.JsonNode)v6).path((((java.lang.Integer)v7).intValue()));
    Object v9 = "se";
    Object v10 = ((com.fasterxml.jackson.databind.JsonNode)v6).findValues(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = "";
    Object v8 = "Attempted to unwrap single value";
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).size();
    org.junit.Assert.assertEquals((Object)(1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ")";
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((byte[])v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ")";
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((byte[])v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonNode)v9).isArray();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "]";
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.util.TreeMap();
    Object v8 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v6),((java.util.Map)v7));
    Object v9 = "'";
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v8).put(((java.lang.String)v9),((java.lang.Integer)v10));
    Object v12 = 0;
    Object v13 = ((com.fasterxml.jackson.databind.JsonNode)v11).path((((java.lang.Integer)v12).intValue()));
    Object v14 = "se";
    Object v15 = ((com.fasterxml.jackson.databind.JsonNode)v11).findValues(((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).findParents(((java.lang.String)v4),((java.util.List)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ")";
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((byte[])v8));
    Object v10 = "}ype ";
    Object v11 = true;
    Object v12 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new java.util.TreeMap();
    Object v14 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v12),((java.util.Map)v13));
    Object v15 = "]";
    Object v16 = true;
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new java.util.TreeMap();
    Object v19 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v17),((java.util.Map)v18));
    Object v20 = "'";
    Object v21 = 1;
    Object v22 = ((com.fasterxml.jackson.databind.node.ObjectNode)v19).put(((java.lang.String)v20),((java.lang.Integer)v21));
    Object v23 = 0;
    Object v24 = ((com.fasterxml.jackson.databind.JsonNode)v22).path((((java.lang.Integer)v23).intValue()));
    Object v25 = "se";
    Object v26 = ((com.fasterxml.jackson.databind.JsonNode)v22).findValues(((java.lang.String)v25));
    Object v27 = ((com.fasterxml.jackson.databind.node.ObjectNode)v14).findParents(((java.lang.String)v15),((java.util.List)v26));
    Object v28 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).findValuesAsText(((java.lang.String)v10),((java.util.List)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = new java.lang.String[]{"h","str}ng"};
    Object v8 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).retain(((java.lang.String[])v7));
    Object v9 = "Can not instantiatje abstract type ";
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v9),((java.lang.Boolean)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "; expected Cla!ss<Converter>";
    Object v5 = ((com.fasterxml.jackson.databind.JsonNode)v3).asText(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ")";
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((byte[])v8));
    Object v10 = "array";
    Object v11 = 0.0D;
    Object v12 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v10),((java.lang.Double)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ")";
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((byte[])v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonNode)v9).textValue();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonNode)v6).doubleValue();
    org.junit.Assert.assertEquals((Object)(0.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = new java.lang.String[]{"h","str}ng"};
    Object v8 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).retain(((java.lang.String[])v7));
    Object v9 = "Can not instantiatje abstract type ";
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonNode)v11).isPojo();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonNode)v6).isTextual();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "=)";
    Object v5 = ((com.fasterxml.jackson.databind.JsonNode)v3).findValues(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ")";
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((byte[])v8));
    Object v10 = "##irrelevant";
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).findValue(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ")";
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((byte[])v8));
    Object v10 = "array";
    Object v11 = 0.0D;
    Object v12 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v10),((java.lang.Double)v11));
    Object v13 = "]";
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new java.util.TreeMap();
    Object v17 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v15),((java.util.Map)v16));
    Object v18 = "'";
    Object v19 = 1;
    Object v20 = ((com.fasterxml.jackson.databind.node.ObjectNode)v17).put(((java.lang.String)v18),((java.lang.Integer)v19));
    Object v21 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v21));
    Object v23 = ((com.fasterxml.jackson.core.TreeNode)v20).traverse(((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = ((com.fasterxml.jackson.databind.node.ObjectNode)v12).set(((java.lang.String)v13),((com.fasterxml.jackson.databind.JsonNode)v20));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = new java.lang.String[]{"h","str}ng"};
    Object v8 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).retain(((java.lang.String[])v7));
    Object v9 = "Can not instantiatje abstract type ";
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonNode)v11).isFloatingPointNumber();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ")";
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((byte[])v8));
    Object v10 = "array";
    Object v11 = 0.0D;
    Object v12 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v10),((java.lang.Double)v11));
    Object v13 = "]";
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new java.util.TreeMap();
    Object v17 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v15),((java.util.Map)v16));
    Object v18 = "'";
    Object v19 = 1;
    Object v20 = ((com.fasterxml.jackson.databind.node.ObjectNode)v17).put(((java.lang.String)v18),((java.lang.Integer)v19));
    Object v21 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v21));
    Object v23 = ((com.fasterxml.jackson.core.TreeNode)v20).traverse(((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = ((com.fasterxml.jackson.databind.node.ObjectNode)v12).set(((java.lang.String)v13),((com.fasterxml.jackson.databind.JsonNode)v20));
    Object v25 = ((com.fasterxml.jackson.databind.JsonNode)v24).isValueNode();
    Object v26 = new java.util.TreeMap();
    Object v27 = ((com.fasterxml.jackson.databind.node.ObjectNode)v24).setAll(((java.util.Map)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = new java.lang.String[]{"h","str}ng"};
    Object v8 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).retain(((java.lang.String[])v7));
    Object v9 = "Can not instantiatje abstract type ";
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v9),((java.lang.Boolean)v10));
    Object v12 = "]";
    Object v13 = true;
    Object v14 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new java.util.TreeMap();
    Object v16 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v14),((java.util.Map)v15));
    Object v17 = "'";
    Object v18 = 1;
    Object v19 = ((com.fasterxml.jackson.databind.node.ObjectNode)v16).put(((java.lang.String)v17),((java.lang.Integer)v18));
    Object v20 = ")";
    Object v21 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v22 = ((com.fasterxml.jackson.databind.node.ObjectNode)v19).put(((java.lang.String)v20),((byte[])v21));
    Object v23 = ((com.fasterxml.jackson.databind.node.ObjectNode)v11).set(((java.lang.String)v12),((com.fasterxml.jackson.databind.JsonNode)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ")";
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((byte[])v8));
    Object v10 = "array";
    Object v11 = 0.0D;
    Object v12 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v10),((java.lang.Double)v11));
    Object v13 = "]";
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new java.util.TreeMap();
    Object v17 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v15),((java.util.Map)v16));
    Object v18 = "'";
    Object v19 = 1;
    Object v20 = ((com.fasterxml.jackson.databind.node.ObjectNode)v17).put(((java.lang.String)v18),((java.lang.Integer)v19));
    Object v21 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v21));
    Object v23 = ((com.fasterxml.jackson.core.TreeNode)v20).traverse(((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = ((com.fasterxml.jackson.databind.node.ObjectNode)v12).set(((java.lang.String)v13),((com.fasterxml.jackson.databind.JsonNode)v20));
    Object v25 = ((com.fasterxml.jackson.databind.node.ObjectNode)v24).removeAll();
    Object v26 = "s";
    Object v27 = -39L;
    Object v28 = ((com.fasterxml.jackson.databind.node.ObjectNode)v24).put(((java.lang.String)v26),((java.lang.Long)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ")";
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((byte[])v8));
    Object v10 = "array";
    Object v11 = 0.0D;
    Object v12 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v10),((java.lang.Double)v11));
    Object v13 = "]";
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new java.util.TreeMap();
    Object v17 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v15),((java.util.Map)v16));
    Object v18 = "'";
    Object v19 = 1;
    Object v20 = ((com.fasterxml.jackson.databind.node.ObjectNode)v17).put(((java.lang.String)v18),((java.lang.Integer)v19));
    Object v21 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v21));
    Object v23 = ((com.fasterxml.jackson.core.TreeNode)v20).traverse(((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = ((com.fasterxml.jackson.databind.node.ObjectNode)v12).set(((java.lang.String)v13),((com.fasterxml.jackson.databind.JsonNode)v20));
    Object v25 = ((com.fasterxml.jackson.databind.node.ObjectNode)v24).removeAll();
    Object v26 = "s";
    Object v27 = -39L;
    Object v28 = ((com.fasterxml.jackson.databind.node.ObjectNode)v24).put(((java.lang.String)v26),((java.lang.Long)v27));
    Object v29 = null;
    ((java.lang.Iterable)v28).forEach(((java.util.function.Consumer)v29));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = new java.lang.String[]{"h","str}ng"};
    Object v8 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).retain(((java.lang.String[])v7));
    Object v9 = "Can not instantiatje abstract type ";
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v9),((java.lang.Boolean)v10));
    Object v12 = ")4";
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.databind.node.ObjectNode)v11).put(((java.lang.String)v12),((java.lang.Boolean)v13));
    Object v15 = ")";
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.databind.node.ObjectNode)v11).put(((java.lang.String)v15),((java.lang.Boolean)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = " vs";
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new java.util.TreeMap();
    Object v11 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v9),((java.util.Map)v10));
    Object v12 = "=)";
    Object v13 = ((com.fasterxml.jackson.databind.JsonNode)v11).findValues(((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).findParents(((java.lang.String)v7),((java.util.List)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ";)";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "striVng";
    Object v5 = ((com.fasterxml.jackson.databind.JsonNode)v3).at(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = new java.lang.String[]{"h","str}ng"};
    Object v8 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).retain(((java.lang.String[])v7));
    Object v9 = "Can not instantiatje abstract type ";
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v9),((java.lang.Boolean)v10));
    Object v12 = ")4";
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.databind.node.ObjectNode)v11).put(((java.lang.String)v12),((java.lang.Boolean)v13));
    Object v15 = ")";
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.databind.node.ObjectNode)v11).put(((java.lang.String)v15),((java.lang.Boolean)v16));
    Object v18 = ((com.fasterxml.jackson.databind.JsonNode)v17).isObject();
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonNode)v6).isNumber();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ";)";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 2;
    Object v11 = ((com.fasterxml.jackson.databind.JsonNode)v9).has((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ";)";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = "Class ";
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).findParent(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).deepCopy();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = new java.lang.String[]{"h","str}ng"};
    Object v8 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).retain(((java.lang.String[])v7));
    Object v9 = "Can not instantiatje abstract type ";
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v9),((java.lang.Boolean)v10));
    Object v12 = "]";
    Object v13 = true;
    Object v14 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new java.util.TreeMap();
    Object v16 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v14),((java.util.Map)v15));
    Object v17 = "'";
    Object v18 = 1;
    Object v19 = ((com.fasterxml.jackson.databind.node.ObjectNode)v16).put(((java.lang.String)v17),((java.lang.Integer)v18));
    Object v20 = ")";
    Object v21 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v22 = ((com.fasterxml.jackson.databind.node.ObjectNode)v19).put(((java.lang.String)v20),((byte[])v21));
    Object v23 = ((com.fasterxml.jackson.databind.node.ObjectNode)v11).set(((java.lang.String)v12),((com.fasterxml.jackson.databind.JsonNode)v22));
    Object v24 = "Attempted to unwrap single value array for single 'Boolean' value but there was more than a single value in the array";
    Object v25 = ((com.fasterxml.jackson.databind.node.BaseJsonNode)v23).findPath(((java.lang.String)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "]";
    Object v5 = ((com.fasterxml.jackson.databind.JsonNode)v3).findValuesAsText(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ")";
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((byte[])v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.ContainerNode)v9).asText();
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ")";
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((byte[])v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonNode)v9).asText();
    Object v11 = ((com.fasterxml.jackson.databind.JsonNode)v9).isNull();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ";)";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.JsonNode)v9).isMissingNode();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonNode)v6).canConvertToLong();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ")";
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((byte[])v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonNode)v9).isMissingNode();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ")";
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((byte[])v8));
    Object v10 = "array";
    Object v11 = 0.0D;
    Object v12 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v10),((java.lang.Double)v11));
    Object v13 = "]";
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new java.util.TreeMap();
    Object v17 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v15),((java.util.Map)v16));
    Object v18 = "'";
    Object v19 = 1;
    Object v20 = ((com.fasterxml.jackson.databind.node.ObjectNode)v17).put(((java.lang.String)v18),((java.lang.Integer)v19));
    Object v21 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v21));
    Object v23 = ((com.fasterxml.jackson.core.TreeNode)v20).traverse(((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = ((com.fasterxml.jackson.databind.node.ObjectNode)v12).set(((java.lang.String)v13),((com.fasterxml.jackson.databind.JsonNode)v20));
    Object v25 = ((com.fasterxml.jackson.databind.node.ObjectNode)v24).deepCopy();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ";)";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = "Class ";
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).findParent(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).deepCopy();
    Object v13 = ((com.fasterxml.jackson.databind.JsonNode)v12).textValue();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonNode)v6).isContainerNode();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ";)";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = "Class ";
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).findParent(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).deepCopy();
    Object v13 = "9'";
    Object v14 = ((com.fasterxml.jackson.databind.JsonNode)v12).hasNonNull(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonNode)v6).isObject();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = Byte.valueOf((byte)1);
    Object v8 = ((com.fasterxml.jackson.databind.node.ContainerNode)v6).numberNode(((java.lang.Byte)v7));
    Object v9 = "Can not instantiate value of type ";
    Object v10 = -15.815547712564848D;
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v9),((java.lang.Double)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonNode)v6).isPojo();
    Object v8 = ((com.fasterxml.jackson.databind.JsonNode)v6).isBoolean();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonNode)v6).isNumber();
    Object v8 = ((com.fasterxml.jackson.databind.JsonNode)v6).isBoolean();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = 0;
    Object v8 = ((com.fasterxml.jackson.databind.JsonNode)v6).hasNonNull((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ";)";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = "Class ";
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).findParent(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).deepCopy();
    Object v13 = "false";
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new java.util.TreeMap();
    Object v17 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v15),((java.util.Map)v16));
    Object v18 = "=)";
    Object v19 = ((com.fasterxml.jackson.databind.JsonNode)v17).findValues(((java.lang.String)v18));
    Object v20 = "boolean";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20));
    Object v22 = ((java.util.List)v19).remove(((java.lang.Object)v21));
    Object v23 = ((com.fasterxml.jackson.databind.node.ObjectNode)v12).findValuesAsText(((java.lang.String)v13),((java.util.List)v19));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "]";
    Object v5 = ((com.fasterxml.jackson.databind.JsonNode)v3).findValues(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonNode)v6).floatValue();
    org.junit.Assert.assertEquals((Object)(0.0F), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ";)";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = "'";
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).withArray(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ";)";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).path((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = new java.lang.String[]{"h","str}ng"};
    Object v8 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).retain(((java.lang.String[])v7));
    Object v9 = "Can not instantiatje abstract type ";
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v9),((java.lang.Boolean)v10));
    Object v12 = "]";
    Object v13 = true;
    Object v14 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new java.util.TreeMap();
    Object v16 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v14),((java.util.Map)v15));
    Object v17 = "'";
    Object v18 = 1;
    Object v19 = ((com.fasterxml.jackson.databind.node.ObjectNode)v16).put(((java.lang.String)v17),((java.lang.Integer)v18));
    Object v20 = ")";
    Object v21 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v22 = ((com.fasterxml.jackson.databind.node.ObjectNode)v19).put(((java.lang.String)v20),((byte[])v21));
    Object v23 = ((com.fasterxml.jackson.databind.node.ObjectNode)v11).set(((java.lang.String)v12),((com.fasterxml.jackson.databind.JsonNode)v22));
    Object v24 = ")";
    Object v25 = 0;
    Object v26 = ((com.fasterxml.jackson.databind.node.ObjectNode)v23).put(((java.lang.String)v24),(((java.lang.Integer)v25).intValue()));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ")";
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((byte[])v8));
    Object v10 = "array";
    Object v11 = 0.0D;
    Object v12 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v10),((java.lang.Double)v11));
    Object v13 = new byte[]{Byte.valueOf((byte)14),Byte.valueOf((byte)-26)};
    Object v14 = ((com.fasterxml.jackson.databind.node.ContainerNode)v12).binaryNode(((byte[])v13));
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v18));
    ((com.fasterxml.jackson.databind.node.ObjectNode)v12).serialize(((com.fasterxml.jackson.core.JsonGenerator)v17),((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = new java.lang.String[]{"h","str}ng"};
    Object v8 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).retain(((java.lang.String[])v7));
    Object v9 = "Can not instantiatje abstract type ";
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.node.ObjectNode)v11).toString();
    org.junit.Assert.assertEquals((Object)("{\"Can not instantiatje abstract type \":false}"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = " is not assignable to ";
    Object v8 = 13;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((java.lang.Integer)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = ", ";
    Object v8 = ((com.fasterxml.jackson.databind.JsonNode)v6).asText(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = ")";
    Object v8 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).path(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = "";
    Object v8 = 0L;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Long)v8).longValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ";)";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = ((com.fasterxml.jackson.databind.node.ContainerNode)v9).numberNode(((java.lang.Integer)v10));
    Object v12 = ")";
    Object v13 = 33.82097F;
    Object v14 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v12),((java.lang.Float)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = "";
    Object v8 = Short.valueOf((short)1);
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((java.lang.Short)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = "";
    Object v8 = Short.valueOf((short)1);
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((java.lang.Short)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonNode)v9).isNumber();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = " is not assignable to ";
    Object v8 = 13;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((java.lang.Integer)v8));
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.JsonNode)v9).hasNonNull((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.util.TreeMap();
    Object v8 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v6),((java.util.Map)v7));
    Object v9 = "'";
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v8).put(((java.lang.String)v9),((java.lang.Integer)v10));
    Object v12 = new java.lang.String[]{"h","str}ng"};
    Object v13 = ((com.fasterxml.jackson.databind.node.ObjectNode)v11).retain(((java.lang.String[])v12));
    Object v14 = "Can not instantiatje abstract type ";
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.databind.node.ObjectNode)v11).put(((java.lang.String)v14),((java.lang.Boolean)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JsonNode)v16).asText();
    Object v18 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((com.fasterxml.jackson.databind.JsonNode)v16));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonNode)v6).isNull();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ";)";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = ((com.fasterxml.jackson.databind.node.ContainerNode)v9).numberNode(((java.lang.Integer)v10));
    Object v12 = ")";
    Object v13 = 33.82097F;
    Object v14 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v12),((java.lang.Float)v13));
    Object v15 = "]";
    Object v16 = false;
    Object v17 = ((com.fasterxml.jackson.databind.node.ObjectNode)v14).put(((java.lang.String)v15),((java.lang.Boolean)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = "Failed to narrow key type";
    Object v8 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).findValue(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ";)";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = "Class ";
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).findParent(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).deepCopy();
    Object v13 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = 0.0F;
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeNumber((((java.lang.Float)v16).floatValue()));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.node.ObjectNode)v12).serialize(((com.fasterxml.jackson.core.JsonGenerator)v15),((com.fasterxml.jackson.databind.SerializerProvider)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ")";
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((byte[])v8));
    Object v10 = ")H";
    Object v11 = 10.8673645202471D;
    Object v12 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v10),(((java.lang.Double)v11).doubleValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ";)";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = ((com.fasterxml.jackson.databind.node.ContainerNode)v9).numberNode(((java.lang.Integer)v10));
    Object v12 = ")";
    Object v13 = 33.82097F;
    Object v14 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v12),((java.lang.Float)v13));
    Object v15 = "sting";
    Object v16 = -37.17755F;
    Object v17 = ((com.fasterxml.jackson.databind.node.ObjectNode)v14).put(((java.lang.String)v15),((java.lang.Float)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "Illegal key-type annotation: type ";
    Object v5 = -13L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "Illegal key-type annotation: type ";
    Object v5 = -13L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = 2;
    Object v8 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).get((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = "";
    Object v8 = Short.valueOf((short)1);
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((java.lang.Short)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = ((com.fasterxml.jackson.databind.JsonNode)v9).equals(((java.lang.Object)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonNode)v9).isTextual();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = " is not assignable to ";
    Object v8 = 13;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((java.lang.Integer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonNode)v9).asDouble();
    org.junit.Assert.assertEquals((Object)(0.0D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = 0L;
    Object v8 = ((com.fasterxml.jackson.databind.node.ContainerNode)v6).numberNode((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = "";
    Object v8 = 0L;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Long)v8).longValue()));
    Object v10 = "";
    Object v11 = true;
    Object v12 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "Illegal key-type annotation: type ";
    Object v5 = -13L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = "";
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((java.lang.Boolean)v8));
    Object v10 = "";
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).with(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ")";
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((byte[])v8));
    Object v10 = "array";
    Object v11 = 0.0D;
    Object v12 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v10),((java.lang.Double)v11));
    Object v13 = ")";
    Object v14 = ((com.fasterxml.jackson.databind.JsonNode)v12).findParents(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ")";
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((byte[])v8));
    Object v10 = " (fromT class ";
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).findParent(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonNode)v6).isBoolean();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "Illegal key-type annotation: type ";
    Object v5 = -13L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = -12;
    Object v8 = ((com.fasterxml.jackson.databind.JsonNode)v6).has((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "Illegal key-type annotation: type ";
    Object v5 = -13L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = "] that wasn't previously seen as unresolved.";
    Object v8 = ((com.fasterxml.jackson.databind.JsonNode)v6).hasNonNull(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ";)";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = ((com.fasterxml.jackson.databind.node.ContainerNode)v9).numberNode(((java.lang.Integer)v10));
    Object v12 = ")";
    Object v13 = 33.82097F;
    Object v14 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v12),((java.lang.Float)v13));
    Object v15 = "4";
    Object v16 = ((com.fasterxml.jackson.databind.node.ObjectNode)v14).remove(((java.lang.String)v15));
    Object v17 = true;
    Object v18 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new java.util.TreeMap();
    Object v20 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v18),((java.util.Map)v19));
    Object v21 = "'";
    Object v22 = 1;
    Object v23 = ((com.fasterxml.jackson.databind.node.ObjectNode)v20).put(((java.lang.String)v21),((java.lang.Integer)v22));
    Object v24 = ";)";
    Object v25 = 0;
    Object v26 = ((com.fasterxml.jackson.databind.node.ObjectNode)v23).put(((java.lang.String)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = 0;
    Object v28 = ((com.fasterxml.jackson.databind.node.ContainerNode)v26).numberNode(((java.lang.Integer)v27));
    Object v29 = ")";
    Object v30 = 33.82097F;
    Object v31 = ((com.fasterxml.jackson.databind.node.ObjectNode)v26).put(((java.lang.String)v29),((java.lang.Float)v30));
    Object v32 = "]";
    Object v33 = false;
    Object v34 = ((com.fasterxml.jackson.databind.node.ObjectNode)v31).put(((java.lang.String)v32),((java.lang.Boolean)v33));
    Object v35 = ((com.fasterxml.jackson.databind.node.ObjectNode)v34).elements();
    Object v36 = ((com.fasterxml.jackson.databind.node.ObjectNode)v14).putAll(((com.fasterxml.jackson.databind.node.ObjectNode)v34));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "Illegal key-type annotation: type ";
    Object v5 = -13L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = "d)";
    Object v8 = Short.valueOf((short)16);
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((java.lang.Short)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "Illegal key-type annotation: type ";
    Object v5 = -13L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = "d)";
    Object v8 = Short.valueOf((short)16);
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((java.lang.Short)v8));
    Object v10 = "";
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).withArray(((java.lang.String)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.TreeMap();
    Object v15 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v13),((java.util.Map)v14));
    Object v16 = "Illegal key-type annotation: type ";
    Object v17 = -13L;
    Object v18 = ((com.fasterxml.jackson.databind.node.ObjectNode)v15).put(((java.lang.String)v16),((java.lang.Long)v17));
    Object v19 = -12;
    Object v20 = ((com.fasterxml.jackson.databind.JsonNode)v18).has((((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).equals(((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ";)";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = ((com.fasterxml.jackson.databind.node.ContainerNode)v9).numberNode(((java.lang.Integer)v10));
    Object v12 = ")";
    Object v13 = 33.82097F;
    Object v14 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v12),((java.lang.Float)v13));
    Object v15 = "sting";
    Object v16 = -37.17755F;
    Object v17 = ((com.fasterxml.jackson.databind.node.ObjectNode)v14).put(((java.lang.String)v15),((java.lang.Float)v16));
    Object v18 = ((com.fasterxml.jackson.databind.JsonNode)v17).isBinary();
    Object v19 = ((com.fasterxml.jackson.databind.JsonNode)v17).isBinary();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = new java.lang.String[]{"h","str}ng"};
    Object v8 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).retain(((java.lang.String[])v7));
    Object v9 = "Can not instantiatje abstract type ";
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v9),((java.lang.Boolean)v10));
    Object v12 = "]";
    Object v13 = true;
    Object v14 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new java.util.TreeMap();
    Object v16 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v14),((java.util.Map)v15));
    Object v17 = "'";
    Object v18 = 1;
    Object v19 = ((com.fasterxml.jackson.databind.node.ObjectNode)v16).put(((java.lang.String)v17),((java.lang.Integer)v18));
    Object v20 = ")";
    Object v21 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v22 = ((com.fasterxml.jackson.databind.node.ObjectNode)v19).put(((java.lang.String)v20),((byte[])v21));
    Object v23 = ((com.fasterxml.jackson.databind.node.ObjectNode)v11).set(((java.lang.String)v12),((com.fasterxml.jackson.databind.JsonNode)v22));
    Object v24 = 19L;
    Object v25 = ((com.fasterxml.jackson.databind.node.ContainerNode)v23).numberNode((((java.lang.Long)v24).longValue()));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ";)";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = ((com.fasterxml.jackson.databind.node.ContainerNode)v9).numberNode(((java.lang.Integer)v10));
    Object v12 = ")";
    Object v13 = 33.82097F;
    Object v14 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v12),((java.lang.Float)v13));
    Object v15 = "]";
    Object v16 = false;
    Object v17 = ((com.fasterxml.jackson.databind.node.ObjectNode)v14).put(((java.lang.String)v15),((java.lang.Boolean)v16));
    Object v18 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.node.ObjectNode)v17).serialize(((com.fasterxml.jackson.core.JsonGenerator)v20),((com.fasterxml.jackson.databind.SerializerProvider)v21));
    Object v22 = null;
    Object v23 = "fale";
    Object v24 = 0;
    Object v25 = ((com.fasterxml.jackson.databind.node.ObjectNode)v17).put(((java.lang.String)v23),(((java.lang.Integer)v24).intValue()));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ";)";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = ((com.fasterxml.jackson.databind.node.ContainerNode)v9).numberNode(((java.lang.Integer)v10));
    Object v12 = ")";
    Object v13 = 33.82097F;
    Object v14 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v12),((java.lang.Float)v13));
    Object v15 = "]";
    Object v16 = false;
    Object v17 = ((com.fasterxml.jackson.databind.node.ObjectNode)v14).put(((java.lang.String)v15),((java.lang.Boolean)v16));
    Object v18 = "str8ing";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.TreeMap();
    Object v22 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v20),((java.util.Map)v21));
    Object v23 = "=)";
    Object v24 = ((com.fasterxml.jackson.databind.JsonNode)v22).findValues(((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.node.ObjectNode)v17).findValuesAsText(((java.lang.String)v18),((java.util.List)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ")";
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((byte[])v8));
    Object v10 = ")H";
    Object v11 = 10.8673645202471D;
    Object v12 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v10),(((java.lang.Double)v11).doubleValue()));
    Object v13 = "item'";
    Object v14 = ((com.fasterxml.jackson.databind.JsonNode)v12).hasNonNull(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ";)";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = ((com.fasterxml.jackson.databind.node.ContainerNode)v9).numberNode(((java.lang.Integer)v10));
    Object v12 = ")";
    Object v13 = 33.82097F;
    Object v14 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v12),((java.lang.Float)v13));
    Object v15 = ((com.fasterxml.jackson.databind.node.ObjectNode)v14).toString();
    org.junit.Assert.assertEquals((Object)("{\"'\":1,\")\":33.82097,\";)\":0}"), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = " is not assignable to ";
    Object v8 = 13;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((java.lang.Integer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).size();
    Object v11 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((com.fasterxml.jackson.databind.DatabindContext)v14).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.Class)v17));
    ((com.fasterxml.jackson.databind.node.ObjectNode)v9).serialize(((com.fasterxml.jackson.core.JsonGenerator)v13),((com.fasterxml.jackson.databind.SerializerProvider)v14));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "Illegal key-type annotation: type ";
    Object v5 = -13L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = "d)";
    Object v8 = Short.valueOf((short)16);
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((java.lang.Short)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonNode)v9).isValueNode();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = 0L;
    Object v8 = ((com.fasterxml.jackson.databind.node.ContainerNode)v6).numberNode((((java.lang.Long)v7).longValue()));
    Object v9 = ((com.fasterxml.jackson.databind.JsonNode)v8).isDouble();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "Can not deserialize Proxy class ";
    Object v5 = ((com.fasterxml.jackson.databind.JsonNode)v3).findValues(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = ((com.fasterxml.jackson.databind.JsonNode)v3).findValuesAsText(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "'";
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ";)";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = ((com.fasterxml.jackson.databind.node.ContainerNode)v9).numberNode(((java.lang.Integer)v10));
    Object v12 = ")";
    Object v13 = 33.82097F;
    Object v14 = ((com.fasterxml.jackson.databind.node.ObjectNode)v9).put(((java.lang.String)v12),((java.lang.Float)v13));
    Object v15 = "]";
    Object v16 = false;
    Object v17 = ((com.fasterxml.jackson.databind.node.ObjectNode)v14).put(((java.lang.String)v15),((java.lang.Boolean)v16));
    Object v18 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.node.ObjectNode)v17).serialize(((com.fasterxml.jackson.core.JsonGenerator)v20),((com.fasterxml.jackson.databind.SerializerProvider)v21));
    Object v22 = null;
    Object v23 = "fale";
    Object v24 = 0;
    Object v25 = ((com.fasterxml.jackson.databind.node.ObjectNode)v17).put(((java.lang.String)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = "5";
    Object v27 = ((com.fasterxml.jackson.databind.JsonNode)v25).hasNonNull(((java.lang.String)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "item";
    Object v5 = 0L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = ")";
    Object v8 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).path(((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.core.TreeNode)v8).numberType();
    Object v10 = ((com.fasterxml.jackson.databind.JsonNode)v8).isContainerNode();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.TreeMap();
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v2));
    Object v4 = "Illegal key-type annotation: type ";
    Object v5 = -13L;
    Object v6 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).put(((java.lang.String)v4),((java.lang.Long)v5));
    Object v7 = "array";
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.node.ObjectNode)v6).put(((java.lang.String)v7),((java.lang.Integer)v8));
    org.junit.Assert.assertNotNull(v9);
  }
}
