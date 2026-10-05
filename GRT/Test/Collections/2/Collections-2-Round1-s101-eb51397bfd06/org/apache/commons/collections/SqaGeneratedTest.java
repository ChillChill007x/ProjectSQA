package org.apache.commons.collections;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "List is fixe_d size";
    Object v2 = 1.0D;
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getDouble(((java.lang.String)v1),((java.lang.Double)v2));
    Object v4 = "The buffer is already";
    Object v5 = ((org.apache.commons.collections.ExtendedProperties)v0).getKeys(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Couldn't get the node: index (";
    Object v2 = 28.486213111771473D;
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getDouble(((java.lang.String)v1),((java.lang.Double)v2));
    org.junit.Assert.assertEquals((Object)(28.486213111771473D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ",";
    ((org.apache.commons.collections.ExtendedProperties)v0).save(((java.io.OutputStream)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "getValue() can only be called after next() and before remove()";
    Object v2 = Short.valueOf((short)0);
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getShort(((java.lang.String)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = "List is fixe_d size";
    Object v3 = 1.0D;
    Object v4 = ((org.apache.commons.collections.ExtendedProperties)v1).getDouble(((java.lang.String)v2),((java.lang.Double)v3));
    Object v5 = "The buffer is already";
    Object v6 = ((org.apache.commons.collections.ExtendedProperties)v1).getKeys(((java.lang.String)v5));
    Object v7 = new org.apache.commons.collections.ExtendedProperties();
    Object v8 = ((java.util.Hashtable)v0).remove(((java.lang.Object)v6),((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.util.Hashtable)v0).contains(((java.lang.Object)v1));
    Object v3 = ((java.util.Hashtable)v0).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = "getValue() can only be called after next() and before remove()";
    Object v3 = Short.valueOf((short)0);
    Object v4 = ((org.apache.commons.collections.ExtendedProperties)v1).getShort(((java.lang.String)v2),((java.lang.Short)v3));
    Object v5 = ((java.util.Hashtable)v0).containsKey(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "(this Map)";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).subset(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "M?pIterator[";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getProperty(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "true";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getInt(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).values();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = "getValue() can only be called after next() and before remove()";
    Object v4 = Short.valueOf((short)0);
    Object v5 = ((org.apache.commons.collections.ExtendedProperties)v2).getShort(((java.lang.String)v3),((java.lang.Short)v4));
    Object v6 = ((java.util.Hashtable)v1).containsKey(((java.lang.Object)v5));
    Object v7 = ((java.util.Hashtable)v0).get(((java.lang.Object)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Predicate must not be null";
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.ExtendedProperties)v0).getProperties(((java.lang.String)v1),((java.util.Properties)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((org.apache.commons.collections.ExtendedProperties)v0).getInclude();
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    ((org.apache.commons.collections.ExtendedProperties)v0).combine(((org.apache.commons.collections.ExtendedProperties)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ",";
    Object v2 = -21;
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getInteger(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "BooleanComparato";
    Object v5 = new org.apache.commons.collections.ExtendedProperties();
    ((org.apache.commons.collections.ExtendedProperties)v0).addProperty(((java.lang.String)v4),((java.lang.Object)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = ((java.util.Hashtable)v0).containsValue(((java.lang.Object)v1));
    Object v3 = "Iterator contains no elements";
    Object v4 = new org.apache.commons.collections.ExtendedProperties();
    Object v5 = ((java.util.Hashtable)v4).values();
    Object v6 = new java.util.Vector(((java.util.Collection)v5));
    Object v7 = ((org.apache.commons.collections.ExtendedProperties)v0).getVector(((java.lang.String)v3),((java.util.Vector)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = ((java.util.Hashtable)v2).values();
    Object v4 = ((java.util.Hashtable)v0).remove(((java.lang.Object)v1),((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections.ExtendedProperties();
    Object v6 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v5));
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.Hashtable)v0).computeIfAbsent(((java.lang.Object)v6),((java.util.function.Function)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Iterator getKey() can only be called after next() and before emove()";
    Object v2 = 1L;
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getLong(((java.lang.String)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(1L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    ((org.apache.commons.collections.ExtendedProperties)v0).combine(((org.apache.commons.collections.ExtendedProperties)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = "setValue() can only be called after next() and before remove()";
    ((org.apache.commons.collections.ExtendedProperties)v0).save(((java.io.OutputStream)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "add() is not supported on CompositeCollection without a CollectionMutator strategy";
    ((org.apache.commons.collections.ExtendedProperties)v0).clearProperty(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "getKey() can only be called after next() and before remove()";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getDouble(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = ((java.util.Hashtable)v2).values();
    Object v4 = ((java.util.Hashtable)v0).remove(((java.lang.Object)v1),((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections.ExtendedProperties();
    Object v6 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v5));
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.Hashtable)v0).computeIfAbsent(((java.lang.Object)v6),((java.util.function.Function)v7));
    Object v9 = new org.apache.commons.collections.ExtendedProperties();
    Object v10 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v9));
    Object v11 = ((java.util.Hashtable)v8).contains(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Iterator remove() can only be called once afte/r next()";
    Object v2 = 0;
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getInteger(((java.lang.String)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.util.Hashtable)v0).remove(((java.lang.Object)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = " header";
    Object v2 = Byte.valueOf((byte)-17);
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getByte(((java.lang.String)v1),((java.lang.Byte)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)-17)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "]";
    Object v2 = Byte.valueOf((byte)1);
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getByte(((java.lang.String)v1),((java.lang.Byte)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "getValue() can only be called after next() and before remove()";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getStringArray(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "i=";
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = ((java.util.Hashtable)v2).values();
    Object v4 = new java.util.Vector(((java.util.Collection)v3));
    ((org.apache.commons.collections.ExtendedProperties)v0).addProperty(((java.lang.String)v1),((java.lang.Object)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = ((java.util.Hashtable)v0).getOrDefault(((java.lang.Object)v1),((java.lang.Object)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "=";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getProperties(((java.lang.String)v1));
    Object v3 = "setValue() can only be called after next() and before remove()";
    Object v4 = ((org.apache.commons.collections.ExtendedProperties)v0).testBoolean(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "? was null";
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = "Predicate must not be null";
    Object v4 = new org.apache.commons.collections.ExtendedProperties();
    Object v5 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.ExtendedProperties)v2).getProperties(((java.lang.String)v3),((java.util.Properties)v5));
    ((org.apache.commons.collections.ExtendedProperties)v0).setProperty(((java.lang.String)v1),((java.lang.Object)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Predicate must not be null";
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.ExtendedProperties)v0).getProperties(((java.lang.String)v1),((java.util.Properties)v3));
    Object v5 = ((java.util.Hashtable)v4).keySet();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "()this Map)";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getDouble(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "The collection must not e null";
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = ((java.util.Hashtable)v2).values();
    Object v4 = new java.util.Vector(((java.util.Collection)v3));
    Object v5 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v4).replaceAll(((java.util.function.UnaryOperator)v5));
    Object v6 = null;
    Object v7 = ((org.apache.commons.collections.ExtendedProperties)v0).getList(((java.lang.String)v1),((java.util.List)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "It-rator[]";
    Object v2 = 0.0F;
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getFloat(((java.lang.String)v1),((java.lang.Float)v2));
    org.junit.Assert.assertEquals((Object)(0.0F), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).entrySet();
    Object v2 = "r";
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getByte(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = " was null";
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = ((java.util.Hashtable)v2).values();
    Object v4 = new java.util.Vector(((java.util.Collection)v3));
    Object v5 = ((org.apache.commons.collections.ExtendedProperties)v0).getList(((java.lang.String)v1),((java.util.List)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v0));
    Object v2 = ((java.util.Hashtable)v1).clone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "getKeyL) can only be called after next() and before remove()";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getStringArray(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).entrySet();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = "getKeyL) can only be called after next() and before remove()";
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v1).getStringArray(((java.lang.String)v2));
    Object v4 = ((java.util.Hashtable)v0).contains(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = new org.apache.commons.collections.ExtendedProperties();
    Object v4 = ((java.util.Hashtable)v1).getOrDefault(((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections.ExtendedProperties();
    Object v6 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v5));
    Object v7 = ((java.util.Hashtable)v0).remove(((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.ExtendedProperties();
    Object v9 = "Couldn't get the node: index (";
    Object v10 = 28.486213111771473D;
    Object v11 = ((org.apache.commons.collections.ExtendedProperties)v8).getDouble(((java.lang.String)v9),((java.lang.Double)v10));
    Object v12 = new org.apache.commons.collections.ExtendedProperties();
    Object v13 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v12));
    Object v14 = ((java.util.Hashtable)v13).clone();
    Object v15 = ((java.util.Hashtable)v0).getOrDefault(((java.lang.Object)v11),((java.lang.Object)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "(this Map)";
    Object v2 = "=";
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getString(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("="), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).clone();
    ((org.apache.commons.collections.ExtendedProperties)v0).display();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "getKey() can only bOe called after next() and before remove()";
    Object v2 = 1;
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getInt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Enumeration must not be null";
    Object v5 = false;
    Object v6 = ((org.apache.commons.collections.ExtendedProperties)v0).getBoolean(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v1));
    ((java.util.Hashtable)v0).putAll(((java.util.Map)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "List must not be null";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getBoolean(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).entrySet();
    Object v2 = "setValue() can only be called after next() and before remove()";
    Object v3 = new org.apache.commons.collections.ExtendedProperties();
    Object v4 = ((java.util.Hashtable)v3).values();
    Object v5 = new java.util.Vector(((java.util.Collection)v4));
    Object v6 = ((org.apache.commons.collections.ExtendedProperties)v0).getVector(((java.lang.String)v2),((java.util.Vector)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = ((java.util.Hashtable)v2).values();
    Object v4 = ((java.util.Hashtable)v0).remove(((java.lang.Object)v1),((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections.ExtendedProperties();
    Object v6 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v5));
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.Hashtable)v0).computeIfAbsent(((java.lang.Object)v6),((java.util.function.Function)v7));
    Object v9 = java.io.OutputStream.nullOutputStream();
    Object v10 = new org.apache.commons.collections.ExtendedProperties();
    Object v11 = java.io.OutputStream.nullOutputStream();
    Object v12 = ((java.util.Hashtable)v10).contains(((java.lang.Object)v11));
    Object v13 = ((java.util.Hashtable)v10).hashCode();
    Object v14 = ((java.util.Hashtable)v8).replace(((java.lang.Object)v9),((java.lang.Object)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = ((java.util.Hashtable)v0).getOrDefault(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = "2]";
    Object v5 = ((org.apache.commons.collections.ExtendedProperties)v3).getByte(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Collection must lot be null";
    Object v2 = true;
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getBoolean(((java.lang.String)v1),((java.lang.Boolean)v2));
    Object v4 = new org.apache.commons.collections.ExtendedProperties();
    ((org.apache.commons.collections.ExtendedProperties)v0).combine(((org.apache.commons.collections.ExtendedProperties)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "musta call next() or previous() before a call to set()";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getDouble(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    ((org.apache.commons.collections.ExtendedProperties)v0).display();
    Object v1 = null;
    Object v2 = "{};";
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getLong(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = "It-rator[]";
    Object v3 = 0.0F;
    Object v4 = ((org.apache.commons.collections.ExtendedProperties)v1).getFloat(((java.lang.String)v2),((java.lang.Float)v3));
    Object v5 = ((java.util.Hashtable)v0).containsKey(((java.lang.Object)v4));
    Object v6 = java.util.function.UnaryOperator.identity();
    Object v7 = new org.apache.commons.collections.ExtendedProperties();
    Object v8 = ((java.util.Hashtable)v0).putIfAbsent(((java.lang.Object)v6),((java.lang.Object)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    ((org.apache.commons.collections.ExtendedProperties)v0).display();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v2 = new java.io.ByteArrayInputStream(((byte[])v1));
    Object v3 = ") > %oIndex(";
    ((org.apache.commons.collections.ExtendedProperties)v0).load(((java.io.InputStream)v2),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v2 = new java.io.ByteArrayInputStream(((byte[])v1));
    Object v3 = new org.apache.commons.collections.ExtendedProperties();
    Object v4 = new org.apache.commons.collections.ExtendedProperties();
    Object v5 = new org.apache.commons.collections.ExtendedProperties();
    Object v6 = new org.apache.commons.collections.ExtendedProperties();
    Object v7 = ((java.util.Hashtable)v4).getOrDefault(((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.ExtendedProperties();
    Object v9 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v8));
    Object v10 = ((java.util.Hashtable)v3).remove(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.ExtendedProperties();
    Object v12 = "Couldn't get the node: index (";
    Object v13 = 28.486213111771473D;
    Object v14 = ((org.apache.commons.collections.ExtendedProperties)v11).getDouble(((java.lang.String)v12),((java.lang.Double)v13));
    Object v15 = new org.apache.commons.collections.ExtendedProperties();
    Object v16 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v15));
    Object v17 = ((java.util.Hashtable)v16).clone();
    Object v18 = ((java.util.Hashtable)v3).getOrDefault(((java.lang.Object)v14),((java.lang.Object)v17));
    Object v19 = ((java.util.Hashtable)v0).remove(((java.lang.Object)v2),((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = ((java.util.Hashtable)v0).getOrDefault(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v5 = new java.io.ByteArrayInputStream(((byte[])v4));
    Object v6 = ((java.util.Hashtable)v3).containsKey(((java.lang.Object)v5));
    Object v7 = "infinite loop in property interpoltion of ";
    Object v8 = 49;
    Object v9 = ((org.apache.commons.collections.ExtendedProperties)v3).getInteger(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertEquals((Object)(49), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "re7ove() not supported for BeanMap";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getInteger(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "setValue() can";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getBoolean(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v1));
    ((java.util.Map)v2).clear();
    Object v3 = null;
    ((java.util.Hashtable)v0).putAll(((java.util.Map)v2));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "MapIterator[";
    Object v2 = Short.valueOf((short)-24);
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getShort(((java.lang.String)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-24)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Iterator getKey() can only be called after next() and before remove()";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getInteger(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = "Predicate must not be null";
    Object v3 = new org.apache.commons.collections.ExtendedProperties();
    Object v4 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.ExtendedProperties)v1).getProperties(((java.lang.String)v2),((java.util.Properties)v4));
    Object v6 = new org.apache.commons.collections.ExtendedProperties();
    Object v7 = "MapIterator[";
    Object v8 = Short.valueOf((short)-24);
    Object v9 = ((org.apache.commons.collections.ExtendedProperties)v6).getShort(((java.lang.String)v7),((java.lang.Short)v8));
    Object v10 = ((java.util.Hashtable)v0).put(((java.lang.Object)v5),((java.lang.Object)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = " header";
    Object v4 = Byte.valueOf((byte)-17);
    Object v5 = ((org.apache.commons.collections.ExtendedProperties)v2).getByte(((java.lang.String)v3),((java.lang.Byte)v4));
    Object v6 = ((java.util.Hashtable)v1).get(((java.lang.Object)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    ((java.util.Hashtable)v0).clear();
    Object v1 = null;
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getInclude();
    org.junit.Assert.assertEquals((Object)("include"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = "Iterator getKey() can only be called after next() and before emove()";
    Object v3 = 1L;
    Object v4 = ((org.apache.commons.collections.ExtendedProperties)v1).getLong(((java.lang.String)v2),((java.lang.Long)v3));
    Object v5 = ((java.util.Hashtable)v0).containsValue(((java.lang.Object)v4));
    Object v6 = ((java.util.Hashtable)v0).keySet();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = new org.apache.commons.collections.ExtendedProperties();
    Object v4 = ((java.util.Hashtable)v1).getOrDefault(((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections.ExtendedProperties();
    Object v6 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v5));
    Object v7 = ((java.util.Hashtable)v0).remove(((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.ExtendedProperties();
    Object v9 = "Couldn't get the node: index (";
    Object v10 = 28.486213111771473D;
    Object v11 = ((org.apache.commons.collections.ExtendedProperties)v8).getDouble(((java.lang.String)v9),((java.lang.Double)v10));
    Object v12 = new org.apache.commons.collections.ExtendedProperties();
    Object v13 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v12));
    Object v14 = ((java.util.Hashtable)v13).clone();
    Object v15 = ((java.util.Hashtable)v0).getOrDefault(((java.lang.Object)v11),((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.ExtendedProperties();
    Object v17 = "It-rator[]";
    Object v18 = 0.0F;
    Object v19 = ((org.apache.commons.collections.ExtendedProperties)v16).getFloat(((java.lang.String)v17),((java.lang.Float)v18));
    Object v20 = new org.apache.commons.collections.ExtendedProperties();
    Object v21 = "getValue() can only be called after next() and before remove()";
    Object v22 = ((org.apache.commons.collections.ExtendedProperties)v20).getStringArray(((java.lang.String)v21));
    Object v23 = new org.apache.commons.collections.ExtendedProperties();
    Object v24 = "Iterator getKey() can only be called after next() and before emove()";
    Object v25 = 1L;
    Object v26 = ((org.apache.commons.collections.ExtendedProperties)v23).getLong(((java.lang.String)v24),((java.lang.Long)v25));
    Object v27 = ((java.util.Hashtable)v15).replace(((java.lang.Object)v19),((java.lang.Object)v22),((java.lang.Object)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v0));
    Object v2 = ((java.util.Hashtable)v1).clone();
    Object v3 = ((java.util.Hashtable)v2).values();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ",";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getShort(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    ((java.util.Hashtable)v0).clear();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Predicate must not be null";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getProperty(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Iterator must not be null";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).subset(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = ((java.util.Hashtable)v0).getOrDefault(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = ((java.util.Hashtable)v3).keySet();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v2 = new java.io.ByteArrayInputStream(((byte[])v1));
    Object v3 = "remove() is not upported";
    ((org.apache.commons.collections.ExtendedProperties)v0).load(((java.io.InputStream)v2),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "ListItuerator must not be null";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getDouble(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((org.apache.commons.collections.ExtendedProperties)v0).getInclude();
    org.junit.Assert.assertEquals((Object)("include"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v1).getInclude();
    Object v3 = ((java.util.Hashtable)v0).remove(((java.lang.Object)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = ((java.util.Hashtable)v0).getOrDefault(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = ((java.util.Hashtable)v3).values();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v0));
    Object v2 = ((java.util.Hashtable)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "(this Map)";
    ((org.apache.commons.collections.ExtendedProperties)v0).clearProperty(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Predicate must not be null";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getByte(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "List ";
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = new org.apache.commons.collections.ExtendedProperties();
    Object v4 = "List is fixe_d size";
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.collections.ExtendedProperties)v3).getDouble(((java.lang.String)v4),((java.lang.Double)v5));
    Object v7 = "The buffer is already";
    Object v8 = ((org.apache.commons.collections.ExtendedProperties)v3).getKeys(((java.lang.String)v7));
    Object v9 = new org.apache.commons.collections.ExtendedProperties();
    Object v10 = ((java.util.Hashtable)v2).remove(((java.lang.Object)v8),((java.lang.Object)v9));
    ((org.apache.commons.collections.ExtendedProperties)v0).addProperty(((java.lang.String)v1),((java.lang.Object)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "=";
    Object v1 = "Predicate must not be null";
    Object v2 = new org.apache.commons.collections.ExtendedProperties(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "InstantiateFactory: The constructor must exist an be public ";
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = "The collection must not e null";
    Object v4 = new org.apache.commons.collections.ExtendedProperties();
    Object v5 = ((java.util.Hashtable)v4).values();
    Object v6 = new java.util.Vector(((java.util.Collection)v5));
    Object v7 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v6).replaceAll(((java.util.function.UnaryOperator)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.collections.ExtendedProperties)v2).getList(((java.lang.String)v3),((java.util.List)v6));
    Object v10 = ((org.apache.commons.collections.ExtendedProperties)v0).getVector(((java.lang.String)v1),((java.util.Vector)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v0));
    Object v2 = ((java.util.Hashtable)v1).clone();
    Object v3 = new org.apache.commons.collections.ExtendedProperties();
    Object v4 = "]";
    Object v5 = Byte.valueOf((byte)1);
    Object v6 = ((org.apache.commons.collections.ExtendedProperties)v3).getByte(((java.lang.String)v4),((java.lang.Byte)v5));
    Object v7 = ((java.util.Hashtable)v2).contains(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.ExtendedProperties();
    Object v9 = "It-rator[]";
    Object v10 = 0.0F;
    Object v11 = ((org.apache.commons.collections.ExtendedProperties)v8).getFloat(((java.lang.String)v9),((java.lang.Float)v10));
    Object v12 = new org.apache.commons.collections.ExtendedProperties();
    Object v13 = "]";
    Object v14 = Byte.valueOf((byte)1);
    Object v15 = ((org.apache.commons.collections.ExtendedProperties)v12).getByte(((java.lang.String)v13),((java.lang.Byte)v14));
    Object v16 = ((java.util.Hashtable)v2).remove(((java.lang.Object)v11),((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v1));
    Object v3 = ((java.util.Hashtable)v0).containsValue(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.ExtendedProperties();
    Object v5 = ((java.util.Hashtable)v4).values();
    Object v6 = new org.apache.commons.collections.ExtendedProperties();
    Object v7 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v6));
    Object v8 = ((java.util.Hashtable)v0).replace(((java.lang.Object)v5),((java.lang.Object)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    ((org.apache.commons.collections.ExtendedProperties)v0).combine(((org.apache.commons.collections.ExtendedProperties)v1));
    Object v2 = null;
    Object v3 = "=";
    Object v4 = ((org.apache.commons.collections.ExtendedProperties)v0).getByte(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = new org.apache.commons.collections.ExtendedProperties();
    Object v4 = ((java.util.Hashtable)v1).getOrDefault(((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections.ExtendedProperties();
    Object v6 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v5));
    Object v7 = ((java.util.Hashtable)v0).remove(((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.ExtendedProperties();
    Object v9 = "Couldn't get the node: index (";
    Object v10 = 28.486213111771473D;
    Object v11 = ((org.apache.commons.collections.ExtendedProperties)v8).getDouble(((java.lang.String)v9),((java.lang.Double)v10));
    Object v12 = new org.apache.commons.collections.ExtendedProperties();
    Object v13 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v12));
    Object v14 = ((java.util.Hashtable)v13).clone();
    Object v15 = ((java.util.Hashtable)v0).getOrDefault(((java.lang.Object)v11),((java.lang.Object)v14));
    Object v16 = ((java.util.Hashtable)v15).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = ((java.util.Hashtable)v0).getOrDefault(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = "valueType";
    Object v5 = new org.apache.commons.collections.ExtendedProperties();
    Object v6 = "Predicate must not be null";
    Object v7 = new org.apache.commons.collections.ExtendedProperties();
    Object v8 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.ExtendedProperties)v5).getProperties(((java.lang.String)v6),((java.util.Properties)v8));
    Object v10 = ((org.apache.commons.collections.ExtendedProperties)v3).getProperties(((java.lang.String)v4),((java.util.Properties)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Iterator[]";
    Object v2 = 1;
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getInteger(((java.lang.String)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Caused by InterruptedException: ";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getFloat(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = "getKeyL) can only be called after next() and before remove()";
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v1).getStringArray(((java.lang.String)v2));
    Object v4 = new org.apache.commons.collections.ExtendedProperties();
    Object v5 = "]";
    Object v6 = Byte.valueOf((byte)1);
    Object v7 = ((org.apache.commons.collections.ExtendedProperties)v4).getByte(((java.lang.String)v5),((java.lang.Byte)v6));
    Object v8 = new org.apache.commons.collections.ExtendedProperties();
    Object v9 = ((java.util.Hashtable)v8).values();
    Object v10 = ((java.util.Hashtable)v0).replace(((java.lang.Object)v3),((java.lang.Object)v7),((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = new org.apache.commons.collections.ExtendedProperties();
    Object v4 = ((java.util.Hashtable)v1).getOrDefault(((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections.ExtendedProperties();
    Object v6 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v5));
    Object v7 = ((java.util.Hashtable)v0).remove(((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.ExtendedProperties();
    Object v9 = "Couldn't get the node: index (";
    Object v10 = 28.486213111771473D;
    Object v11 = ((org.apache.commons.collections.ExtendedProperties)v8).getDouble(((java.lang.String)v9),((java.lang.Double)v10));
    Object v12 = new org.apache.commons.collections.ExtendedProperties();
    Object v13 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v12));
    Object v14 = ((java.util.Hashtable)v13).clone();
    Object v15 = ((java.util.Hashtable)v0).getOrDefault(((java.lang.Object)v11),((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.ExtendedProperties();
    Object v17 = new org.apache.commons.collections.ExtendedProperties();
    Object v18 = new org.apache.commons.collections.ExtendedProperties();
    Object v19 = ((java.util.Hashtable)v16).getOrDefault(((java.lang.Object)v17),((java.lang.Object)v18));
    Object v20 = ((java.util.Hashtable)v19).keySet();
    Object v21 = ((java.util.Hashtable)v15).containsKey(((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = org.apache.commons.collections.MapUtils.toProperties(((java.util.Map)v2));
    Object v4 = ((java.util.Hashtable)v0).putIfAbsent(((java.lang.Object)v1),((java.lang.Object)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "remove() can only be called once after next()";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getKeys(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).keySet();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).hashCode();
    ((java.util.Hashtable)v0).clear();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }
}
