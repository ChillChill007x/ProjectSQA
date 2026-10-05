package com.fasterxml.jackson.databind.node;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.POJONode)v1).asText();
    org.junit.Assert.assertEquals((Object)("{\"type\":\"any\"}"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = ((com.fasterxml.jackson.databind.JsonNode)v0).deepCopy();
    Object v2 = "Trying to resolve a forwar.d reference with id [";
    Object v3 = ((com.fasterxml.jackson.databind.JsonNode)v0).findValuesAsText(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v2));
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.node.POJONode)v1).serialize(((com.fasterxml.jackson.core.JsonGenerator)v5),((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = ((com.fasterxml.jackson.databind.JsonNode)v0).isValueNode();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ": class expetts ";
    Object v3 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v4 = ((com.fasterxml.jackson.databind.JsonNode)v3).deepCopy();
    Object v5 = "Trying to resolve a forwar.d reference with id [";
    Object v6 = ((com.fasterxml.jackson.databind.JsonNode)v3).findValuesAsText(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).findParents(((java.lang.String)v2),((java.util.List)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = ((com.fasterxml.jackson.databind.JsonNode)v0).isNumber();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v3 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v2));
    Object v4 = ((com.fasterxml.jackson.databind.node.POJONode)v1)._pojoEquals(((com.fasterxml.jackson.databind.node.POJONode)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v3 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v2));
    Object v4 = 68.06005542391816D;
    Object v5 = ((com.fasterxml.jackson.databind.node.POJONode)v3).asDouble((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.fasterxml.jackson.databind.node.POJONode)v1)._pojoEquals(((com.fasterxml.jackson.databind.node.POJONode)v3));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.POJONode)v1).toString();
    org.junit.Assert.assertEquals((Object)("{\"type\":\"any\"}"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = 70.2035405934218D;
    Object v3 = ((com.fasterxml.jackson.databind.node.POJONode)v1).asDouble((((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertEquals((Object)(70.2035405934218D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = ((com.fasterxml.jackson.databind.JsonNode)v0).isBinary();
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v0).isBinary();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = "; actual type: ";
    Object v3 = ((com.fasterxml.jackson.databind.node.POJONode)v1).asText(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("{\"type\":\"any\"}"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((java.lang.Iterable)v1).spliterator();
    Object v3 = "]";
    Object v4 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v5 = ((com.fasterxml.jackson.databind.JsonNode)v4).deepCopy();
    Object v6 = "Trying to resolve a forwar.d reference with id [";
    Object v7 = ((com.fasterxml.jackson.databind.JsonNode)v4).findValuesAsText(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).findParents(((java.lang.String)v3),((java.util.List)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = "string";
    Object v3 = ((com.fasterxml.jackson.databind.node.POJONode)v1).asText(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v5 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v4));
    Object v6 = ((com.fasterxml.jackson.databind.node.POJONode)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = 1L;
    Object v3 = ((com.fasterxml.jackson.databind.node.POJONode)v1).asLong((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v1).isBoolean();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = "DEFAULT_VIEW_NCLUSION";
    Object v3 = ((com.fasterxml.jackson.databind.JsonNode)v1).findValues(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = ((com.fasterxml.jackson.databind.node.POJONode)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.POJONode)v1).binaryValue();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = 22;
    Object v3 = ((com.fasterxml.jackson.databind.node.POJONode)v1).asInt((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(22), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = ((com.fasterxml.jackson.databind.JsonNode)v0).asDouble();
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = "UNKNOWwN";
    Object v3 = ((com.fasterxml.jackson.databind.JsonNode)v1).findValues(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v5 = ((com.fasterxml.jackson.databind.JsonNode)v4).isBinary();
    Object v6 = ((com.fasterxml.jackson.databind.JsonNode)v4).isBinary();
    Object v7 = ((com.fasterxml.jackson.databind.node.POJONode)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = "X)";
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v0).findValuesAsText(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = ((com.fasterxml.jackson.databind.JsonNode)v0).isNumber();
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v0).isFloatingPointNumber();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = ((com.fasterxml.jackson.databind.node.POJONode)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = false;
    Object v3 = ((com.fasterxml.jackson.databind.node.POJONode)v1).asBoolean((((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = "iems";
    Object v3 = ((com.fasterxml.jackson.databind.node.POJONode)v1).asText(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("{\"type\":\"any\"}"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = "(raw value '%`')";
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v0).findValuesAsText(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = ((com.fasterxml.jackson.core.TreeNode)v0).traverse(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonNode)v0).isPojo();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v1).isValueNode();
    Object v3 = 22.110474407465553D;
    Object v4 = ((com.fasterxml.jackson.databind.node.POJONode)v1).asDouble((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(22.110474407465553D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = "could not detQrmine property type";
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v0).findValues(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v1).isContainerNode();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = "AUTO_JETECT_IS_GETTERS";
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v0).findParents(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v1).isValueNode();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = ((com.fasterxml.jackson.databind.JsonNode)v2).isPojo();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = ": ";
    Object v4 = ((com.fasterxml.jackson.databind.JsonNode)v2).findValues(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = ((com.fasterxml.jackson.databind.node.POJONode)v2).toString();
    org.junit.Assert.assertEquals((Object)("{\"type\":\"any\"}"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = java.util.Comparator.naturalOrder();
    Object v4 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v5 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v4));
    Object v6 = ((com.fasterxml.jackson.databind.node.ValueNode)v5).deepCopy();
    Object v7 = 0;
    Object v8 = ((com.fasterxml.jackson.databind.JsonNode)v6).hasNonNull((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.JsonNode)v2).equals(((java.util.Comparator)v3),((com.fasterxml.jackson.databind.JsonNode)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = ((com.fasterxml.jackson.databind.JsonNode)v2).isNull();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = ")";
    Object v2 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v3 = "X)";
    Object v4 = ((com.fasterxml.jackson.databind.JsonNode)v2).findValuesAsText(((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonNode)v0).findParents(((java.lang.String)v1),((java.util.List)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonNode)v0).isNumber();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = ((com.fasterxml.jackson.databind.JsonNode)v0).isArray();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = "set";
    Object v4 = ((com.fasterxml.jackson.databind.node.POJONode)v2).asText(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("{\"type\":\"any\"}"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = java.util.Comparator.naturalOrder();
    Object v2 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v3 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v2));
    Object v4 = ((com.fasterxml.jackson.databind.node.ValueNode)v3).deepCopy();
    Object v5 = ((com.fasterxml.jackson.databind.JsonNode)v0).equals(((java.util.Comparator)v1),((com.fasterxml.jackson.databind.JsonNode)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v2 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.node.NodeCursor.ArrayCursor(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.databind.node.NodeCursor)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.NodeCursor.RootCursor(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.databind.node.NodeCursor)v4));
    Object v6 = false;
    Object v7 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.databind.JsonNode)v0).at(((com.fasterxml.jackson.core.JsonPointer)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = ((com.fasterxml.jackson.databind.JsonNode)v0).isTextual();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = ((com.fasterxml.jackson.databind.JsonNode)v0).isBoolean();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = "array";
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v0).withArray(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonNode)v0).booleanValue();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v1).canConvertToInt();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = ((com.fasterxml.jackson.databind.JsonNode)v2).floatValue();
    org.junit.Assert.assertEquals((Object)(0.0F), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = ((com.fasterxml.jackson.databind.JsonNode)v2).isNumber();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = " ";
    Object v4 = ((com.fasterxml.jackson.databind.node.ValueNode)v2).findValue(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = ((com.fasterxml.jackson.databind.node.POJONode)v2).binaryValue();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v2 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.node.NodeCursor.ArrayCursor(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.databind.node.NodeCursor)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.NodeCursor.RootCursor(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.databind.node.NodeCursor)v4));
    Object v6 = false;
    Object v7 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.databind.JsonNode)v0).at(((com.fasterxml.jackson.core.JsonPointer)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonNode)v8).toString();
    Object v10 = ((com.fasterxml.jackson.databind.JsonNode)v8).longValue();
    org.junit.Assert.assertEquals((Object)(0L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = "U7E_BASE_TYPE_AS_DEFAULT_IMPL";
    Object v2 = ((com.fasterxml.jackson.databind.node.BaseJsonNode)v0).findPath(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.node.POJONode)v2).asBoolean((((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v2 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.node.NodeCursor.ArrayCursor(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.databind.node.NodeCursor)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.NodeCursor.RootCursor(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.databind.node.NodeCursor)v4));
    Object v6 = false;
    Object v7 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.databind.JsonNode)v0).at(((com.fasterxml.jackson.core.JsonPointer)v7));
    Object v9 = "";
    Object v10 = ((com.fasterxml.jackson.databind.node.BaseJsonNode)v0).findPath(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.databind.node.POJONode)v2).asInt((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = ((com.fasterxml.jackson.databind.JsonNode)v0).isNull();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = "'";
    Object v4 = ((com.fasterxml.jackson.databind.node.ValueNode)v2).get(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = ((com.fasterxml.jackson.databind.JsonNode)v0).isPojo();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = ((com.fasterxml.jackson.databind.node.POJONode)v2).asText();
    org.junit.Assert.assertEquals((Object)("{\"type\":\"any\"}"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = "U7E_BASE_TYPE_AS_DEFAULT_IMPL";
    Object v2 = ((com.fasterxml.jackson.databind.node.BaseJsonNode)v0).findPath(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonNode)v2).isPojo();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v4 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v3));
    Object v5 = ((com.fasterxml.jackson.databind.node.POJONode)v2)._pojoEquals(((com.fasterxml.jackson.databind.node.POJONode)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = -15;
    Object v3 = ((com.fasterxml.jackson.databind.node.POJONode)v1).asInt((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-15), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v2 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.node.NodeCursor.ArrayCursor(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.databind.node.NodeCursor)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.NodeCursor.RootCursor(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.databind.node.NodeCursor)v4));
    Object v6 = false;
    Object v7 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.databind.JsonNode)v0).at(((com.fasterxml.jackson.core.JsonPointer)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonNode)v8).isValueNode();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v1).isValueNode();
    Object v3 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = ((com.fasterxml.jackson.databind.JsonNode)v2).isContainerNode();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.node.POJONode)v2).serialize(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v1).isValueNode();
    Object v3 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v2));
    Object v4 = "";
    Object v5 = ((com.fasterxml.jackson.databind.JsonNode)v3).findValuesAsText(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = ((com.fasterxml.jackson.databind.JsonNode)v0).isBinary();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v2 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.node.NodeCursor.ArrayCursor(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.databind.node.NodeCursor)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.NodeCursor.RootCursor(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.databind.node.NodeCursor)v4));
    Object v6 = false;
    Object v7 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.databind.JsonNode)v0).at(((com.fasterxml.jackson.core.JsonPointer)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonNode)v8).longValue();
    org.junit.Assert.assertEquals((Object)(0L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = ((com.fasterxml.jackson.databind.JsonNode)v2).isContainerNode();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = ((com.fasterxml.jackson.databind.JsonNode)v0).elements();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = ((com.fasterxml.jackson.databind.JsonNode)v0).decimalValue();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = ((com.fasterxml.jackson.core.TreeNode)v0).traverse();
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v0).elements();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = ((com.fasterxml.jackson.databind.JsonNode)v0).isDouble();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = "";
    Object v4 = ((com.fasterxml.jackson.databind.node.POJONode)v2).asText(((java.lang.String)v3));
    Object v5 = -12L;
    Object v6 = ((com.fasterxml.jackson.databind.node.POJONode)v2).asLong((((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertEquals((Object)(-12L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.POJONode)v1).getPojo();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = ((com.fasterxml.jackson.databind.JsonNode)v2).shortValue();
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v1).isValueNode();
    Object v3 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v2));
    Object v4 = "";
    Object v5 = ((com.fasterxml.jackson.databind.JsonNode)v3).findValuesAsText(((java.lang.String)v4));
    Object v6 = ((java.lang.Iterable)v5).spliterator();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = ((com.fasterxml.jackson.databind.JsonNode)v0).isValueNode();
    Object v2 = "UNKNOWN";
    Object v3 = ((com.fasterxml.jackson.databind.JsonNode)v0).findParents(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = ((com.fasterxml.jackson.databind.JsonNode)v0).asBoolean();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = 0.0D;
    Object v4 = ((com.fasterxml.jackson.databind.node.POJONode)v2).asDouble((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v1).isValueNode();
    Object v3 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonNode)v3).isNumber();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v1).isValueNode();
    Object v3 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v2));
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = java.util.Comparator.naturalOrder();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v13),((com.fasterxml.jackson.databind.BeanProperty)v14));
    ((com.fasterxml.jackson.databind.node.ValueNode)v3).serializeWithType(((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = "nul";
    Object v4 = ((com.fasterxml.jackson.databind.node.BaseJsonNode)v2).findPath(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v6 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.ValueNode)v6).deepCopy();
    Object v8 = ((com.fasterxml.jackson.databind.JsonNode)v7).floatValue();
    Object v9 = ((com.fasterxml.jackson.databind.node.POJONode)v2).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = "[anySette\"r]";
    Object v4 = ((com.fasterxml.jackson.databind.node.BaseJsonNode)v2).findPath(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = false;
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.node.POJONode)v2).serialize(((com.fasterxml.jackson.core.JsonGenerator)v8),((com.fasterxml.jackson.databind.SerializerProvider)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = ((com.fasterxml.jackson.databind.JsonNode)v2).isMissingNode();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = ((com.fasterxml.jackson.databind.JsonNode)v2).intValue();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v1).isValueNode();
    Object v3 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v2));
    Object v4 = ((com.fasterxml.jackson.databind.node.POJONode)v3).hashCode();
    Object v5 = ((com.fasterxml.jackson.databind.node.POJONode)v3).asToken();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v1).isValueNode();
    Object v3 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v2));
    Object v4 = 26;
    Object v5 = ((com.fasterxml.jackson.databind.JsonNode)v3).get((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.JsonNode)v3).numberValue();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v1).isValueNode();
    Object v3 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v2));
    Object v4 = ((com.fasterxml.jackson.databind.node.POJONode)v3).toString();
    org.junit.Assert.assertEquals((Object)("true"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = "U7E_BASE_TYPE_AS_DEFAULT_IMPL";
    Object v2 = ((com.fasterxml.jackson.databind.node.BaseJsonNode)v0).findPath(((java.lang.String)v1));
    Object v3 = "null";
    Object v4 = ((com.fasterxml.jackson.databind.node.ValueNode)v2).findValue(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = 1;
    Object v4 = ((com.fasterxml.jackson.databind.node.ValueNode)v2).get((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.POJONode)v1).getPojo();
    Object v3 = ((com.fasterxml.jackson.databind.JsonNode)v2).asLong();
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = ((java.lang.Iterable)v2).spliterator();
    Object v4 = "N";
    Object v5 = ((com.fasterxml.jackson.databind.node.POJONode)v2).asText(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("{\"type\":\"any\"}"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v1).isValueNode();
    Object v3 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonNode)v3).isObject();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.node.ValueNode)v1).deepCopy();
    Object v3 = ((com.fasterxml.jackson.databind.JsonNode)v2).isValueNode();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v2 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.node.NodeCursor.ArrayCursor(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.databind.node.NodeCursor)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.NodeCursor.RootCursor(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.databind.node.NodeCursor)v4));
    Object v6 = false;
    Object v7 = com.fasterxml.jackson.core.JsonPointer.forPath(((com.fasterxml.jackson.core.JsonStreamContext)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.databind.JsonNode)v0).at(((com.fasterxml.jackson.core.JsonPointer)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonNode)v8).isBoolean();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v1 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonNode)v1).isValueNode();
    Object v3 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v2));
    Object v4 = "Unresolved forward reference but no identity info.";
    Object v5 = ((com.fasterxml.jackson.databind.JsonNode)v3).findParents(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }
}
