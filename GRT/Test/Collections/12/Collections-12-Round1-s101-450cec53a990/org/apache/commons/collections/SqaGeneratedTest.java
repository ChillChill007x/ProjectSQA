package org.apache.commons.collections;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "List is fixe_d size";
    Object v2 = 1.0F;
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getFloat(((java.lang.String)v1),((java.lang.Float)v2));
    Object v4 = "The buffer is already";
    Object v5 = new org.apache.commons.collections.ArrayStack();
    Object v6 = ((org.apache.commons.collections.ExtendedProperties)v0).getList(((java.lang.String)v4),((java.util.List)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((org.apache.commons.collections.ExtendedProperties)v0).getKeys();
    Object v2 = "getKey() can only be called ";
    ((org.apache.commons.collections.ExtendedProperties)v0).clearProperty(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ArrayStack();
    Object v2 = ((java.util.Hashtable)v0).equals(((java.lang.Object)v1));
    Object v3 = ((java.util.Hashtable)v0).keySet();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Cannot instantiate class: ";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getStringArray(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = "List is fixe_d size";
    Object v3 = 1.0F;
    Object v4 = ((org.apache.commons.collections.ExtendedProperties)v1).getFloat(((java.lang.String)v2),((java.lang.Float)v3));
    Object v5 = "The buffer is already";
    Object v6 = new org.apache.commons.collections.ArrayStack();
    Object v7 = ((org.apache.commons.collections.ExtendedProperties)v1).getList(((java.lang.String)v5),((java.util.List)v6));
    Object v8 = new org.apache.commons.collections.ExtendedProperties();
    Object v9 = ((java.util.Hashtable)v0).put(((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections.ExtendedProperties();
    Object v11 = ((java.util.Hashtable)v0).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).values();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ArrayStack();
    Object v2 = ((java.util.Hashtable)v0).contains(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = 0;
    Object v2 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v1).intValue()));
    Object v3 = "Timeout expired";
    ((org.apache.commons.collections.ExtendedProperties)v0).save(((java.io.OutputStream)v2),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ArrayStack();
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = "Cannot instantiate class: ";
    Object v4 = ((org.apache.commons.collections.ExtendedProperties)v2).getStringArray(((java.lang.String)v3));
    Object v5 = ((java.util.Hashtable)v0).replace(((java.lang.Object)v1),((java.lang.Object)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "getKey() can only be called after next() and before remove()";
    ((org.apache.commons.collections.ExtendedProperties)v0).clearProperty(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "getValue() can only be called after next() and before remove()";
    Object v2 = 1.0D;
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getDouble(((java.lang.String)v1),((java.lang.Double)v2));
    org.junit.Assert.assertEquals((Object)(1.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = ((java.util.Hashtable)v0).containsValue(((java.lang.Object)v1));
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).isInitialized();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Factory must not' be null";
    Object v2 = 10;
    Object v3 = new java.util.Properties((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.collections.ExtendedProperties)v0).getProperties(((java.lang.String)v1),((java.util.Properties)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "]E";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getStringArray(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = 10;
    Object v2 = new java.util.Properties((((java.lang.Integer)v1).intValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = ((java.util.Hashtable)v0).computeIfAbsent(((java.lang.Object)v2),((java.util.function.Function)v3));
    Object v5 = new org.apache.commons.collections.ArrayStack();
    Object v6 = java.util.function.Function.identity();
    Object v7 = ((java.util.Hashtable)v0).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "]";
    Object v2 = -31L;
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getLong(((java.lang.String)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(-31L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "]";
    Object v2 = Short.valueOf((short)-33);
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getShort(((java.lang.String)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-33)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = 10;
    Object v2 = new java.util.Properties((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.util.Hashtable)v0).containsKey(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Iterator remove() can only be called once afte/r next()";
    Object v2 = new org.apache.commons.collections.ArrayStack();
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getList(((java.lang.String)v1),((java.util.List)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Factory must not' be null";
    Object v2 = 10;
    Object v3 = new java.util.Properties((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.collections.ExtendedProperties)v0).getProperties(((java.lang.String)v1),((java.util.Properties)v3));
    Object v5 = "Iterator must not be null";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    ((java.util.Properties)v4).load(((java.io.Reader)v6));
    Object v7 = null;
    Object v8 = org.apache.commons.collections.ExtendedProperties.convertProperties(((java.util.Properties)v4));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = 10;
    Object v2 = new java.util.Properties((((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.collections.ExtendedProperties)v0).putAll(((java.util.Map)v2));
    Object v3 = null;
    Object v4 = "] Map)";
    Object v5 = ((org.apache.commons.collections.ExtendedProperties)v0).getVector(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    ((java.util.Hashtable)v0).clear();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ";->";
    Object v2 = "The size must be greate";
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getString(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = 1;
    Object v6 = ((org.apache.commons.collections.ExtendedProperties)v0).getInteger(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = ((java.util.Hashtable)v0).equals(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Objects of type ";
    Object v2 = new org.apache.commons.collections.ArrayStack();
    Object v3 = ((java.util.List)v2).listIterator();
    Object v4 = ((org.apache.commons.collections.ExtendedProperties)v0).interpolateHelper(((java.lang.String)v1),((java.util.List)v2));
    org.junit.Assert.assertEquals((Object)("Objects of type "), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "";
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = "Objects of type ";
    Object v4 = new org.apache.commons.collections.ArrayStack();
    Object v5 = ((java.util.List)v4).listIterator();
    Object v6 = ((org.apache.commons.collections.ExtendedProperties)v2).interpolateHelper(((java.lang.String)v3),((java.util.List)v4));
    ((org.apache.commons.collections.ExtendedProperties)v0).addProperty(((java.lang.String)v1),((java.lang.Object)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 10;
    Object v1 = new java.util.Properties((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.ArrayStack();
    Object v3 = java.util.function.Function.identity();
    Object v4 = ((java.util.Hashtable)v1).computeIfAbsent(((java.lang.Object)v2),((java.util.function.Function)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "List must not be null";
    Object v2 = false;
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getBoolean(((java.lang.String)v1),((java.lang.Boolean)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Predicte must not be null";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getInteger(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Parameter types must match the arguments";
    ((org.apache.commons.collections.ExtendedProperties)v0).setInclude(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 10;
    Object v1 = new java.util.Properties((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Hashtable)v1).clone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "getKeyL) can only be called after next() and before remove()";
    Object v2 = new org.apache.commons.collections.ArrayStack();
    Object v3 = ((java.util.List)v2).spliterator();
    Object v4 = ((org.apache.commons.collections.ExtendedProperties)v0).interpolateHelper(((java.lang.String)v1),((java.util.List)v2));
    org.junit.Assert.assertEquals((Object)("getKeyL) can only be called after next() and before remove()"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Unable to copy bean values to cloned bean map: ";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getByte(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 10;
    Object v1 = new java.util.Properties((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v2).intValue()));
    Object v4 = "Iteator contains no elements";
    ((java.util.Properties)v1).save(((java.io.OutputStream)v3),((java.lang.String)v4));
    Object v5 = null;
    Object v6 = org.apache.commons.collections.ExtendedProperties.convertProperties(((java.util.Properties)v1));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Predicate must not be null";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getBoolean(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Predicate must not be null";
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = 10;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.collections.ExtendedProperties)v2).putAll(((java.util.Map)v4));
    Object v5 = null;
    Object v6 = "] Map)";
    Object v7 = ((org.apache.commons.collections.ExtendedProperties)v2).getVector(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.collections.ExtendedProperties)v0).getVector(((java.lang.String)v1),((java.util.Vector)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 10;
    Object v1 = new java.util.Properties((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.ExtendedProperties();
    Object v5 = new org.apache.commons.collections.ArrayStack();
    Object v6 = ((java.util.Hashtable)v4).contains(((java.lang.Object)v5));
    Object v7 = ((java.util.Hashtable)v1).remove(((java.lang.Object)v3),((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "ListIteratorWXapper does not support optional operations of ListIterator.";
    Object v2 = false;
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getBoolean(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "setVapue() can only be called after next() and before remove()";
    Object v2 = Byte.valueOf((byte)16);
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getByte(((java.lang.String)v1),((java.lang.Byte)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)16)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Predicat must not be null";
    Object v2 = Short.valueOf((short)-19);
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getShort(((java.lang.String)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-19)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    ((org.apache.commons.collections.ExtendedProperties)v0).combine(((org.apache.commons.collections.ExtendedProperties)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 10;
    Object v1 = new java.util.Properties((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Hashtable)v1).clone();
    Object v3 = new org.apache.commons.collections.ExtendedProperties();
    Object v4 = new org.apache.commons.collections.ExtendedProperties();
    Object v5 = ((java.util.Hashtable)v3).equals(((java.lang.Object)v4));
    Object v6 = 0;
    Object v7 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.collections.ArrayStack();
    Object v9 = ((java.util.Hashtable)v2).replace(((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections.ExtendedProperties();
    Object v11 = ((java.util.Hashtable)v10).isEmpty();
    Object v12 = 10;
    Object v13 = new java.util.Properties((((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.util.Hashtable)v2).replace(((java.lang.Object)v11),((java.lang.Object)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "=";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getDouble(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "=";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getShort(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).clone();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "]";
    ((org.apache.commons.collections.ExtendedProperties)v0).setInclude(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).clone();
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)16),Byte.valueOf((byte)0)};
    Object v3 = 0;
    Object v4 = 31;
    Object v5 = new java.io.ByteArrayInputStream(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "->";
    ((org.apache.commons.collections.ExtendedProperties)v1).load(((java.io.InputStream)v5),((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    ((org.apache.commons.collections.ExtendedProperties)v0).display();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 10;
    Object v1 = new java.util.Properties((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v2).intValue()));
    Object v4 = "Iteator contains no elements";
    ((java.util.Properties)v1).save(((java.io.OutputStream)v3),((java.lang.String)v4));
    Object v5 = null;
    Object v6 = org.apache.commons.collections.ExtendedProperties.convertProperties(((java.util.Properties)v1));
    Object v7 = ") less than zero.";
    Object v8 = true;
    Object v9 = ((org.apache.commons.collections.ExtendedProperties)v6).getBoolean(((java.lang.String)v7),((java.lang.Boolean)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 10;
    Object v1 = new java.util.Properties((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Hashtable)v1).keySet();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = 10;
    Object v1 = new java.util.Properties((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v2).intValue()));
    Object v4 = "Iteator contains no elements";
    ((java.util.Properties)v1).save(((java.io.OutputStream)v3),((java.lang.String)v4));
    Object v5 = null;
    Object v6 = org.apache.commons.collections.ExtendedProperties.convertProperties(((java.util.Properties)v1));
    Object v7 = "Iterator[]";
    Object v8 = ((org.apache.commons.collections.ExtendedProperties)v6).getByte(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Attempted to add null object to buffer";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getShort(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 10;
    Object v1 = new java.util.Properties((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Hashtable)v1).clone();
    Object v3 = 0;
    Object v4 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.Hashtable)v2).contains(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Inv/alid array element: ";
    Object v2 = Byte.valueOf((byte)17);
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getByte(((java.lang.String)v1),(((java.lang.Byte)v2).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)17)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).clone();
    Object v2 = "";
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v1).getDouble(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 10;
    Object v1 = new java.util.Properties((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Hashtable)v1).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "p";
    Object v2 = 24.726526F;
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getFloat(((java.lang.String)v1),(((java.lang.Float)v2).floatValue()));
    Object v4 = "";
    Object v5 = ((org.apache.commons.collections.ExtendedProperties)v0).getFloat(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Predicate must not be null";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getKeys(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).clone();
    Object v2 = "Caused by InterruptedException: ";
    Object v3 = 1.0D;
    Object v4 = ((org.apache.commons.collections.ExtendedProperties)v1).getDouble(((java.lang.String)v2),((java.lang.Double)v3));
    org.junit.Assert.assertEquals((Object)(1.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Iterator remove() cannot be called at this time";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getLong(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    ((org.apache.commons.collections.ExtendedProperties)v0).putAll(((java.util.Map)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "]";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getProperty(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "=";
    Object v2 = 38L;
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getLong(((java.lang.String)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(38L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = 10;
    Object v2 = new java.util.Properties((((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.collections.ExtendedProperties)v0).putAll(((java.util.Map)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 10;
    Object v1 = new java.util.Properties((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = ((java.util.Hashtable)v2).toString();
    Object v4 = 10;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.collections.ExtendedProperties();
    Object v9 = new org.apache.commons.collections.ArrayStack();
    Object v10 = ((java.util.Hashtable)v8).contains(((java.lang.Object)v9));
    Object v11 = ((java.util.Hashtable)v5).remove(((java.lang.Object)v7),((java.lang.Object)v10));
    Object v12 = ((java.util.Hashtable)v1).putIfAbsent(((java.lang.Object)v3),((java.lang.Object)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "]";
    Object v2 = 35;
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getInt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "=";
    Object v5 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)16),Byte.valueOf((byte)0)};
    Object v6 = 0;
    Object v7 = 31;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    ((org.apache.commons.collections.ExtendedProperties)v0).setProperty(((java.lang.String)v4),((java.lang.Object)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 10;
    Object v1 = new java.util.Properties((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Hashtable)v1).entrySet();
    Object v3 = new org.apache.commons.collections.ExtendedProperties();
    Object v4 = new org.apache.commons.collections.ExtendedProperties();
    Object v5 = ((java.util.Hashtable)v3).equals(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.ExtendedProperties();
    Object v7 = ((java.util.Hashtable)v1).remove(((java.lang.Object)v5),((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 10;
    Object v1 = new java.util.Properties((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Hashtable)v1).keySet();
    ((java.util.Hashtable)v1).clear();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "Predicate must not be null";
    Object v1 = "Pred";
    Object v2 = new org.apache.commons.collections.ExtendedProperties(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "";
    Object v2 = 10;
    Object v3 = new java.util.Properties((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.Hashtable)v3).clone();
    Object v5 = 0;
    Object v6 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.util.Hashtable)v4).contains(((java.lang.Object)v6));
    ((org.apache.commons.collections.ExtendedProperties)v0).addProperty(((java.lang.String)v1),((java.lang.Object)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = "]E";
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v1).getStringArray(((java.lang.String)v2));
    Object v4 = new org.apache.commons.collections.ArrayStack();
    Object v5 = new org.apache.commons.collections.ExtendedProperties();
    Object v6 = "Predicate must not be null";
    Object v7 = new org.apache.commons.collections.ExtendedProperties();
    Object v8 = 10;
    Object v9 = new java.util.Properties((((java.lang.Integer)v8).intValue()));
    ((org.apache.commons.collections.ExtendedProperties)v7).putAll(((java.util.Map)v9));
    Object v10 = null;
    Object v11 = "] Map)";
    Object v12 = ((org.apache.commons.collections.ExtendedProperties)v7).getVector(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.collections.ExtendedProperties)v5).getVector(((java.lang.String)v6),((java.util.Vector)v12));
    Object v14 = ((java.util.Hashtable)v0).replace(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 10;
    Object v1 = new java.util.Properties((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = new org.apache.commons.collections.ArrayStack();
    Object v4 = ((java.util.Hashtable)v2).contains(((java.lang.Object)v3));
    Object v5 = ((java.util.Hashtable)v1).contains(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).clone();
    Object v2 = "(";
    Object v3 = "";
    Object v4 = ((org.apache.commons.collections.ExtendedProperties)v1).getString(((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).clone();
    Object v2 = ((java.util.Hashtable)v1).entrySet();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).clone();
    Object v2 = ((java.util.Hashtable)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = 10;
    Object v2 = new java.util.Properties((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.util.Hashtable)v2).entrySet();
    Object v4 = new org.apache.commons.collections.ExtendedProperties();
    Object v5 = new org.apache.commons.collections.ExtendedProperties();
    Object v6 = ((java.util.Hashtable)v4).equals(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.ExtendedProperties();
    Object v8 = ((java.util.Hashtable)v2).remove(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = ((java.util.Hashtable)v0).get(((java.lang.Object)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "' doesn't map to a existing object";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getLong(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).clone();
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v1).getInclude();
    org.junit.Assert.assertEquals((Object)("include"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 10;
    Object v1 = new java.util.Properties((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections.ExtendedProperties.convertProperties(((java.util.Properties)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).clone();
    Object v2 = "No previo";
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v1).getFloat(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 10;
    Object v1 = new java.util.Properties((((java.lang.Integer)v0).intValue()));
    Object v2 = 10;
    Object v3 = new java.util.Properties((((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.ExtendedProperties();
    Object v5 = "List must not be null";
    Object v6 = false;
    Object v7 = ((org.apache.commons.collections.ExtendedProperties)v4).getBoolean(((java.lang.String)v5),((java.lang.Boolean)v6));
    Object v8 = new org.apache.commons.collections.ExtendedProperties();
    Object v9 = "Iterator remove() can only be called once afte/r next()";
    Object v10 = new org.apache.commons.collections.ArrayStack();
    Object v11 = ((org.apache.commons.collections.ExtendedProperties)v8).getList(((java.lang.String)v9),((java.util.List)v10));
    Object v12 = ((java.util.Hashtable)v1).replace(((java.lang.Object)v3),((java.lang.Object)v7),((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).clone();
    Object v2 = "No previous() entry in the iteration";
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v1).getKeys(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ", ";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).testBoolean(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 10;
    Object v1 = new java.util.Properties((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Hashtable)v1).entrySet();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).keySet();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "No element at ndex ";
    Object v1 = ".";
    Object v2 = new org.apache.commons.collections.ExtendedProperties(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).clone();
    Object v2 = "Iterator must not be null";
    Object v3 = 26.754966921982213D;
    Object v4 = ((org.apache.commons.collections.ExtendedProperties)v1).getDouble(((java.lang.String)v2),((java.lang.Double)v3));
    org.junit.Assert.assertEquals((Object)(26.754966921982213D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Iterator reove() can only be called once after next()";
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = "Factory must not' be null";
    Object v4 = 10;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.collections.ExtendedProperties)v2).getProperties(((java.lang.String)v3),((java.util.Properties)v5));
    Object v7 = ((org.apache.commons.collections.ExtendedProperties)v0).getProperties(((java.lang.String)v1),((java.util.Properties)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "getKey() can only be callel after next() and before remove()";
    Object v2 = Byte.valueOf((byte)0);
    Object v3 = ((org.apache.commons.collections.ExtendedProperties)v0).getByte(((java.lang.String)v1),(((java.lang.Byte)v2).byteValue()));
    Object v4 = "The transformer to cal must not be null";
    Object v5 = new org.apache.commons.collections.ExtendedProperties();
    Object v6 = ((java.util.Hashtable)v5).clone();
    Object v7 = "(";
    Object v8 = "";
    Object v9 = ((org.apache.commons.collections.ExtendedProperties)v6).getString(((java.lang.String)v7),((java.lang.String)v8));
    ((org.apache.commons.collections.ExtendedProperties)v0).addProperty(((java.lang.String)v4),((java.lang.Object)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "setValue() can only be called after next() and before rem";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getStringArray(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = ((java.util.Hashtable)v0).clone();
    Object v2 = "Entry does not exist: ";
    Object v3 = Short.valueOf((short)119);
    Object v4 = ((org.apache.commons.collections.ExtendedProperties)v1).getShort(((java.lang.String)v2),(((java.lang.Short)v3).shortValue()));
    Object v5 = "=";
    Object v6 = ((org.apache.commons.collections.ExtendedProperties)v1).getFloat(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)16),Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = 31;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "The map size must be 0 or 1";
    ((org.apache.commons.collections.ExtendedProperties)v0).load(((java.io.InputStream)v4),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "' out o bounds for size '";
    Object v2 = new org.apache.commons.collections.ExtendedProperties();
    Object v3 = 10;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.collections.ExtendedProperties)v2).putAll(((java.util.Map)v4));
    Object v5 = null;
    Object v6 = "] Map)";
    Object v7 = ((org.apache.commons.collections.ExtendedProperties)v2).getVector(((java.lang.String)v6));
    Object v8 = new org.apache.commons.collections.ArrayStack();
    Object v9 = ((java.util.Vector)v7).retainAll(((java.util.Collection)v8));
    Object v10 = ((org.apache.commons.collections.ExtendedProperties)v0).getVector(((java.lang.String)v1),((java.util.Vector)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = new org.apache.commons.collections.ExtendedProperties();
    Object v2 = ((java.util.Hashtable)v1).clone();
    Object v3 = "No previous() entry in the iteration";
    Object v4 = ((org.apache.commons.collections.ExtendedProperties)v2).getKeys(((java.lang.String)v3));
    Object v5 = new org.apache.commons.collections.ExtendedProperties();
    Object v6 = "Cannot instantiate class: ";
    Object v7 = ((org.apache.commons.collections.ExtendedProperties)v5).getStringArray(((java.lang.String)v6));
    Object v8 = ((java.util.Hashtable)v0).putIfAbsent(((java.lang.Object)v4),((java.lang.Object)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Map is empty";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getBoolean(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = " maxSize=";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).subset(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.collections.ExtendedProperties();
    Object v1 = "Unable to instantiate he underlying bean \"";
    Object v2 = ((org.apache.commons.collections.ExtendedProperties)v0).getKeys(((java.lang.String)v1));
    Object v3 = "key";
    Object v4 = Byte.valueOf((byte)0);
    Object v5 = ((org.apache.commons.collections.ExtendedProperties)v0).getByte(((java.lang.String)v3),((java.lang.Byte)v4));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 10;
    Object v1 = new java.util.Properties((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections.ExtendedProperties.convertProperties(((java.util.Properties)v1));
    Object v3 = new org.apache.commons.collections.ExtendedProperties();
    Object v4 = ";->";
    Object v5 = "The size must be greate";
    Object v6 = ((org.apache.commons.collections.ExtendedProperties)v3).getString(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = 1;
    Object v9 = ((org.apache.commons.collections.ExtendedProperties)v3).getInteger(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v10).intValue()));
    Object v12 = ((java.util.Hashtable)v2).getOrDefault(((java.lang.Object)v9),((java.lang.Object)v11));
    org.junit.Assert.assertNotNull(v12);
  }
}
