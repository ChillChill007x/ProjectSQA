package com.fasterxml.jackson.databind.type;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = "#";
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).hasUnbound(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = ((java.lang.Class)v3).getEnumConstants();
    Object v5 = "BOOLEAN";
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = 0;
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).getBoundType((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = "BOOLEAN";
    Object v5 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v4));
    Object v6 = java.util.EnumSet.of(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = "BOOLEAN";
    Object v7 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingMethod();
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = "STRING";
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).findBoundType(((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).getBoundName((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingMethod();
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v6).getTypeParameters();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = ((java.lang.Class)v3).getSuperclass();
    Object v5 = "BOOLEAN";
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v8));
    Object v10 = "BOOLEAN";
    Object v11 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingMethod();
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = -29;
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeBindings)v6).getBoundType((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingMethod();
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = -35;
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeBindings)v6).getBoundName((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingMethod();
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = "Internal error: should never end up through this ode path";
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeBindings)v6).findBoundType(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = "Internal error: mismatched accessors, property:;";
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).withUnboundVariable(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingMethod();
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = "BOOLEAN";
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeBindings)v6).equals(((java.lang.Object)v11));
    Object v13 = "K";
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeBindings)v6).withUnboundVariable(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingMethod();
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v6).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingMethod();
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = "BOOLEAN";
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeBindings)v6).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = "BOOLEAN";
    Object v5 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v4));
    Object v6 = java.util.EnumSet.of(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeBindings)v9).getTypeParameters();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = "BOOLEAN";
    Object v5 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v4));
    Object v6 = java.util.EnumSet.of(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingMethod();
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = "Can not find a de;serializer for non-concrete Map type ";
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeBindings)v6).hasUnbound(((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeBindings)v6).toString();
    org.junit.Assert.assertEquals((Object)("<>"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).toString();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).readResolve();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ":|";
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).findBoundType(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).getTypeParameters();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = "BOOLEAN";
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).asKey(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).toString();
    org.junit.Assert.assertEquals((Object)("<>"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).readResolve();
    Object v2 = " wi";
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeBindings)v1).hasUnbound(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).getTypeParameters();
    Object v2 = 0;
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).getBoundType((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = " (need to add/enable type information?))";
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).findBoundType(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = "BOOLEAN";
    Object v5 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v4));
    Object v6 = java.util.EnumSet.of(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).getGenericSignature();
    Object v10 = "BOOLEAN";
    Object v11 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).getTypeParameters();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingMethod();
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = 0;
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeBindings)v6).getBoundName((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = "BOOLEAN";
    Object v5 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v4));
    Object v6 = java.util.EnumSet.of(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).hasGenericTypes();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).readResolve();
    Object v2 = "[ouble";
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeBindings)v1).findBoundType(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).readResolve();
    Object v2 = -25;
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeBindings)v1).getBoundType((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = "BOOLEAN";
    Object v5 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v4));
    Object v6 = java.util.EnumSet.of(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).isAbstract();
    Object v10 = "BOOLEAN";
    Object v11 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).isPrimitive();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingMethod();
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v6).typeParameterArray();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = ":|";
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeBindings)v1).findBoundType(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeBindings)v1).getTypeParameters();
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).typeParameterArray();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = "BOOLEAN";
    Object v5 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v4));
    Object v6 = java.util.EnumSet.of(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v7));
    Object v9 = "BOOLEAN";
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = "BOOLEAN";
    Object v5 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v4));
    Object v6 = java.util.EnumSet.of(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v6));
    Object v8 = ((java.lang.Class)v3).getDeclaredAnnotation(((java.lang.Class)v7));
    Object v9 = "BOOLEAN";
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).readResolve();
    Object v2 = "BOOLEAN";
    Object v3 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBindings)v1).asKey(((java.lang.Class)v5));
    Object v7 = new java.util.ArrayList();
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeBindings)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).readResolve();
    Object v2 = "BOOLEAN";
    Object v3 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeBindings)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = 0;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).getBoundType((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = "array";
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).hasUnbound(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = ")";
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).withUnboundVariable(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = "stLring";
    Object v5 = ((java.lang.Class)v3).getResource(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new java.util.ArrayList();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((java.util.List)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new java.util.ArrayList();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((java.util.List)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = ")";
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).withUnboundVariable(((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeBindings)v7).getBoundName((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingMethod();
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = "BOOLEAN";
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeBindings)v6).equals(((java.lang.Object)v11));
    Object v13 = "K";
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeBindings)v6).withUnboundVariable(((java.lang.String)v13));
    Object v15 = "NULL";
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeBindings)v14).hasUnbound(((java.lang.String)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new java.util.ArrayList();
    Object v5 = 0;
    Object v6 = ((java.util.List)v4).listIterator((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((java.util.List)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).readResolve();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = ((java.lang.Class)v3).toGenericString();
    Object v5 = "BOOLEAN";
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v8));
    Object v10 = "BOOLEAN";
    Object v11 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = ")";
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).withUnboundVariable(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeBindings)v8).readResolve();
    Object v10 = "BOOLEAN";
    Object v11 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeBindings)v9).equals(((java.lang.Object)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeBindings)v7).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = 81;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).getBoundType((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = "Invalid Object Id definiion for ";
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).withUnboundVariable(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = "Invalid Object Id definiion for ";
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).withUnboundVariable(((java.lang.String)v1));
    Object v3 = -13;
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeBindings)v2).getBoundType((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).readResolve();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v1).getTypeParameters();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = "[field ";
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).withUnboundVariable(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = "Invalid Object Id definiion for ";
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).withUnboundVariable(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeBindings)v2).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new java.util.ArrayList();
    Object v5 = 0;
    Object v6 = ((java.util.List)v4).listIterator((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((java.util.List)v4));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeBindings)v7).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).getTypeParameters();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).toString();
    org.junit.Assert.assertEquals((Object)("<>"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = "[field ";
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).withUnboundVariable(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeBindings)v2).getTypeParameters();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = "BOOLEAN";
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).asKey(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).readResolve();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = 1;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).getBoundType((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = "Invalid Object Id definiion for ";
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).withUnboundVariable(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeBindings)v2).getBoundType((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = " can not use @JsonCreator for constructors";
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).withUnboundVariable(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = "]";
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).hasUnbound(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).readResolve();
    Object v2 = "Should never call 'set' on setterless property";
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeBindings)v1).findBoundType(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).readResolve();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v1).readResolve();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = " can not use @JsonCreator for constructors";
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).withUnboundVariable(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeBindings)v7).hasUnbound(((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeBindings)v10).readResolve();
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeBindings)v7).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = "[field ";
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).withUnboundVariable(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeBindings)v2).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = "Invalid Object Id definiion for ";
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).withUnboundVariable(((java.lang.String)v1));
    Object v3 = "]";
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeBindings)v2).withUnboundVariable(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new java.util.ArrayList();
    Object v5 = 0;
    Object v6 = ((java.util.List)v4).listIterator((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((java.util.List)v4));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeBindings)v7).size();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).readResolve();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v1).readResolve();
    Object v3 = "boolean";
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeBindings)v2).hasUnbound(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = "BOOLEAN";
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).asKey(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).readResolve();
    Object v7 = "string";
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeBindings)v6).withUnboundVariable(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = "[field ";
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).withUnboundVariable(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeBindings)v3).toString();
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeBindings)v3).isEmpty();
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBindings)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = "BOOLEAN";
    Object v7 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new java.util.ArrayList();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v9),((java.util.List)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeBindings)v11).equals(((java.lang.Object)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = ((java.lang.Class)v3).toString();
    Object v5 = "BOOLEAN";
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = "BOOLEAN";
    Object v12 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeBindings)v10).asKey(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeBindings)v10).readResolve();
    Object v17 = "string";
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeBindings)v16).withUnboundVariable(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v9).equals(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = "BOOLEAN";
    Object v5 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v4));
    Object v6 = java.util.EnumSet.of(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).isThrowable();
    Object v10 = "BOOLEAN";
    Object v11 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeBindings)v15).typeParameterArray();
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v14).equals(((java.lang.Object)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = "Internal error: mismatched accessors, property:;";
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).withUnboundVariable(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeBindings)v7).readResolve();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = ((java.lang.Class)v3).isSynthetic();
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = "Invalid Object Id definiion for ";
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeBindings)v6).withUnboundVariable(((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new java.util.ArrayList();
    Object v5 = 0;
    Object v6 = ((java.util.List)v4).listIterator((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((java.util.List)v4));
    Object v8 = -87;
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeBindings)v7).getBoundName((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = "Invalid Object Id definiion for ";
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).withUnboundVariable(((java.lang.String)v1));
    Object v3 = -27;
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeBindings)v2).getBoundType((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).readResolve();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v1).readResolve();
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeBindings)v2).getBoundName((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).readResolve();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v1).readResolve();
    Object v3 = "";
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeBindings)v2).findBoundType(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = "[field ";
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBindings)v4).withUnboundVariable(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v6).getTypeParameters();
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((java.util.List)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = "BOOLEAN";
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v1 = "Invalid Object Id definiion for ";
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBindings)v0).withUnboundVariable(((java.lang.String)v1));
    Object v3 = "]";
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeBindings)v2).withUnboundVariable(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = "Invalid Object Id definiion for ";
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).withUnboundVariable(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeBindings)v4).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = ")";
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).withUnboundVariable(((java.lang.String)v6));
    Object v8 = "]";
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeBindings)v7).findBoundType(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new java.util.ArrayList();
    Object v5 = 0;
    Object v6 = ((java.util.List)v4).listIterator((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((java.util.List)v4));
    Object v8 = "Attempted to unwrap single value array forhsingle '";
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeBindings)v7).hasUnbound(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = ((java.lang.Class)v3).getGenericSuperclass();
    Object v5 = "BOOLEAN";
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).isContainerType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "BOOLEAN";
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = "BOOLEAN";
    Object v7 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType[])v10));
    Object v12 = "Internal error: mismatched accessors, property:;";
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeBindings)v11).withUnboundVariable(((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeBindings)v13).readResolve();
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }
}
