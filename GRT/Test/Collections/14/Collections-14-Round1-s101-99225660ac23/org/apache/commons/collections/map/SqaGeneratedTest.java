package org.apache.commons.collections.map;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).keySet();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).entrySet();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.map.LinkedMap();
    Object v3 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).convertKey(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)("{}"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).clone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = 1;
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v2).clone();
    Object v4 = new org.apache.commons.collections.map.LinkedMap();
    Object v5 = new org.apache.commons.collections.map.LinkedMap();
    Object v6 = ((java.util.Map)v0).replace(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.LinkedMap();
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.function.Function.identity();
    Object v10 = ((java.util.function.Function)v8).andThen(((java.util.function.Function)v9));
    Object v11 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v7),((java.util.function.Function)v8));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.map.LinkedMap();
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).toString();
    Object v4 = new org.apache.commons.collections.map.LinkedMap();
    Object v5 = ((java.util.Map)v1).remove(((java.lang.Object)v3),((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).keySet();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap(((java.util.Map)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    ((org.apache.commons.collections.map.AbstractHashedMap)v1).clear();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).get(((java.lang.Object)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = 1;
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).keySet();
    Object v4 = 1;
    Object v5 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.collections.map.CaseInsensitiveMap(((java.util.Map)v5));
    Object v7 = ((java.util.Map)v0).putIfAbsent(((java.lang.Object)v3),((java.lang.Object)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = 1;
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v2).clone();
    Object v4 = new org.apache.commons.collections.map.LinkedMap();
    Object v5 = ((java.util.Map)v0).replace(((java.lang.Object)v3),((java.lang.Object)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v3).clone();
    Object v5 = new org.apache.commons.collections.map.LinkedMap();
    Object v6 = ((org.apache.commons.collections.map.AbstractHashedMap)v5).keySet();
    Object v7 = 1;
    Object v8 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.util.Map)v1).replace(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = 1;
    Object v11 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.collections.map.AbstractHashedMap)v11).keySet();
    Object v13 = new org.apache.commons.collections.map.LinkedMap();
    Object v14 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).put(((java.lang.Object)v12),((java.lang.Object)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.map.LinkedMap();
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v6).clone();
    Object v8 = new org.apache.commons.collections.map.LinkedMap();
    Object v9 = new org.apache.commons.collections.map.LinkedMap();
    Object v10 = ((java.util.Map)v4).replace(((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.map.LinkedMap();
    Object v12 = java.util.function.Function.identity();
    Object v13 = java.util.function.Function.identity();
    Object v14 = ((java.util.function.Function)v12).andThen(((java.util.function.Function)v13));
    Object v15 = ((java.util.Map)v4).computeIfAbsent(((java.lang.Object)v11),((java.util.function.Function)v12));
    Object v16 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = new org.apache.commons.collections.map.LinkedMap();
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).containsValue(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).mapIterator();
    Object v2 = new org.apache.commons.collections.map.LinkedMap();
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).toString();
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = new org.apache.commons.collections.map.LinkedMap();
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).containsKey(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = 1;
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).keySet();
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).remove(((java.lang.Object)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = new org.apache.commons.collections.map.LinkedMap();
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).remove(((java.lang.Object)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = java.util.function.Function.identity();
    Object v2 = new org.apache.commons.collections.map.LinkedMap();
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).entrySet();
    Object v4 = ((java.util.Map)v0).replace(((java.lang.Object)v1),((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).mapIterator();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.map.LinkedMap();
    Object v3 = 1;
    Object v4 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.apache.commons.collections.map.LinkedMap();
    Object v6 = ((org.apache.commons.collections.map.AbstractHashedMap)v5).toString();
    Object v7 = new org.apache.commons.collections.map.LinkedMap();
    Object v8 = ((java.util.Map)v4).remove(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).put(((java.lang.Object)v2),((java.lang.Object)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = new org.apache.commons.collections.map.LinkedMap();
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).toString();
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).containsKey(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).size();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = 1;
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).keySet();
    Object v4 = new org.apache.commons.collections.map.LinkedMap();
    Object v5 = new org.apache.commons.collections.map.LinkedMap();
    Object v6 = ((org.apache.commons.collections.map.AbstractHashedMap)v4).containsKey(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).put(((java.lang.Object)v3),((java.lang.Object)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = ((java.util.Map)v0).keySet();
    Object v2 = new org.apache.commons.collections.map.LinkedMap();
    Object v3 = java.util.function.Function.identity();
    Object v4 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v2),((java.util.function.Function)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = 1;
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v1).intValue()));
    ((java.util.Map)v0).putAll(((java.util.Map)v2));
    Object v3 = null;
    Object v4 = new org.apache.commons.collections.map.LinkedMap();
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v6).clone();
    Object v8 = ((java.util.Map)v0).replace(((java.lang.Object)v4),((java.lang.Object)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = 51;
    Object v1 = -50.947697F;
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).mapIterator();
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).size();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).clone();
    Object v3 = new org.apache.commons.collections.map.LinkedMap();
    ((org.apache.commons.collections.map.AbstractHashedMap)v2).putAll(((java.util.Map)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = new org.apache.commons.collections.map.LinkedMap();
    Object v2 = new org.apache.commons.collections.map.LinkedMap();
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).toString();
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).containsKey(((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap(((java.util.Map)v1));
    Object v3 = 1;
    Object v4 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.collections.map.AbstractHashedMap)v2).putAll(((java.util.Map)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap(((java.util.Map)v1));
    Object v3 = 1;
    Object v4 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.collections.map.AbstractHashedMap)v4).keySet();
    Object v6 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).get(((java.lang.Object)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).clone();
    Object v3 = new org.apache.commons.collections.map.LinkedMap();
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v3).toString();
    Object v5 = new org.apache.commons.collections.map.LinkedMap();
    Object v6 = ((java.util.Map)v2).getOrDefault(((java.lang.Object)v4),((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.map.LinkedMap();
    Object v3 = new org.apache.commons.collections.map.LinkedMap();
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v3).mapIterator();
    Object v5 = ((org.apache.commons.collections.map.AbstractHashedMap)v3).size();
    Object v6 = ((java.util.Map)v1).putIfAbsent(((java.lang.Object)v2),((java.lang.Object)v5));
    ((org.apache.commons.collections.map.AbstractHashedMap)v1).clear();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).values();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).toString();
    Object v3 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).clone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = new org.apache.commons.collections.map.LinkedMap();
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).size();
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).containsValue(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).toString();
    Object v3 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).clone();
    Object v4 = new org.apache.commons.collections.map.LinkedMap();
    ((org.apache.commons.collections.map.AbstractHashedMap)v3).putAll(((java.util.Map)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).entrySet();
    Object v3 = 1;
    Object v4 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).convertKey(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)("{}"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).clone();
    Object v3 = 1;
    Object v4 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.collections.map.AbstractHashedMap)v4).entrySet();
    Object v6 = 1;
    Object v7 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v4).convertKey(((java.lang.Object)v7));
    Object v9 = java.util.function.Function.identity();
    Object v10 = ((java.util.Map)v2).getOrDefault(((java.lang.Object)v8),((java.lang.Object)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).toString();
    Object v3 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).clone();
    Object v4 = new org.apache.commons.collections.map.LinkedMap();
    Object v5 = new org.apache.commons.collections.map.LinkedMap();
    Object v6 = ((org.apache.commons.collections.map.AbstractHashedMap)v5).toString();
    Object v7 = ((org.apache.commons.collections.map.AbstractHashedMap)v4).containsKey(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.map.LinkedMap();
    Object v9 = ((org.apache.commons.collections.map.AbstractHashedMap)v8).hashCode();
    Object v10 = 1;
    Object v11 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v11).clone();
    Object v13 = ((java.util.Map)v3).replace(((java.lang.Object)v7),((java.lang.Object)v9),((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v3).clone();
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.collections.map.AbstractHashedMap)v6).keySet();
    Object v8 = ((java.util.Map)v1).replace(((java.lang.Object)v4),((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.map.LinkedMap();
    Object v10 = 1;
    Object v11 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.collections.map.AbstractHashedMap)v11).keySet();
    Object v13 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).put(((java.lang.Object)v9),((java.lang.Object)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap(((java.util.Map)v1));
    Object v3 = new org.apache.commons.collections.map.LinkedMap();
    Object v4 = new org.apache.commons.collections.map.LinkedMap();
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new org.apache.commons.collections.map.CaseInsensitiveMap(((java.util.Map)v6));
    Object v8 = ((java.util.Map)v2).replace(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).clone();
    Object v3 = 1;
    Object v4 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.collections.map.AbstractHashedMap)v4).toString();
    Object v6 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v4).clone();
    Object v7 = ((java.util.Map)v6).hashCode();
    ((org.apache.commons.collections.map.AbstractHashedMap)v2).putAll(((java.util.Map)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = new org.apache.commons.collections.map.LinkedMap();
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).values();
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).get(((java.lang.Object)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = new org.apache.commons.collections.map.LinkedMap();
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).hashCode();
    Object v3 = 1;
    Object v4 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.apache.commons.collections.map.CaseInsensitiveMap(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).remove(((java.lang.Object)v2),((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.map.LinkedMap();
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v6).clone();
    Object v8 = new org.apache.commons.collections.map.LinkedMap();
    Object v9 = new org.apache.commons.collections.map.LinkedMap();
    Object v10 = ((java.util.Map)v4).replace(((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.map.LinkedMap();
    Object v12 = java.util.function.Function.identity();
    Object v13 = java.util.function.Function.identity();
    Object v14 = ((java.util.function.Function)v12).andThen(((java.util.function.Function)v13));
    Object v15 = ((java.util.Map)v4).computeIfAbsent(((java.lang.Object)v11),((java.util.function.Function)v12));
    Object v16 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v15));
    Object v17 = new org.apache.commons.collections.map.LinkedMap();
    Object v18 = ((org.apache.commons.collections.map.AbstractHashedMap)v16).equals(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).toString();
    Object v3 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).clone();
    Object v4 = new org.apache.commons.collections.map.LinkedMap();
    Object v5 = new org.apache.commons.collections.map.LinkedMap();
    Object v6 = ((org.apache.commons.collections.map.AbstractHashedMap)v5).toString();
    Object v7 = ((org.apache.commons.collections.map.AbstractHashedMap)v4).containsKey(((java.lang.Object)v6));
    Object v8 = 1;
    Object v9 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    Object v11 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v10).intValue()));
    Object v12 = new org.apache.commons.collections.map.LinkedMap();
    Object v13 = 1;
    Object v14 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v14).clone();
    Object v16 = new org.apache.commons.collections.map.LinkedMap();
    Object v17 = new org.apache.commons.collections.map.LinkedMap();
    Object v18 = ((java.util.Map)v12).replace(((java.lang.Object)v15),((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new org.apache.commons.collections.map.LinkedMap();
    Object v20 = java.util.function.Function.identity();
    Object v21 = java.util.function.Function.identity();
    Object v22 = ((java.util.function.Function)v20).andThen(((java.util.function.Function)v21));
    Object v23 = ((java.util.Map)v12).computeIfAbsent(((java.lang.Object)v19),((java.util.function.Function)v20));
    Object v24 = ((java.util.Map)v9).getOrDefault(((java.lang.Object)v11),((java.lang.Object)v23));
    Object v25 = new org.apache.commons.collections.map.LinkedMap();
    Object v26 = ((org.apache.commons.collections.map.AbstractHashedMap)v24).equals(((java.lang.Object)v25));
    Object v27 = new org.apache.commons.collections.map.LinkedMap();
    Object v28 = ((org.apache.commons.collections.map.AbstractHashedMap)v27).toString();
    Object v29 = ((java.util.Map)v3).replace(((java.lang.Object)v7),((java.lang.Object)v26),((java.lang.Object)v28));
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).toString();
    Object v3 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).clone();
    ((org.apache.commons.collections.map.AbstractHashedMap)v3).clear();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v3).toString();
    Object v5 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v3).clone();
    Object v6 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).containsKey(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).mapIterator();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).hashCode();
    Object v3 = new org.apache.commons.collections.map.LinkedMap();
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v3).mapIterator();
    Object v5 = ((org.apache.commons.collections.map.AbstractHashedMap)v3).size();
    Object v6 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).convertKey(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("0"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 65;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).clone();
    Object v3 = 1;
    Object v4 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.collections.map.AbstractHashedMap)v6).toString();
    Object v8 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v6).clone();
    Object v9 = ((org.apache.commons.collections.map.AbstractHashedMap)v4).containsKey(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).containsValue(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.map.LinkedMap();
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).values();
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).get(((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).mapIterator();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = ((java.util.Map)v0).values();
    Object v2 = new org.apache.commons.collections.map.LinkedMap();
    Object v3 = new org.apache.commons.collections.map.LinkedMap();
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v3).size();
    Object v5 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).containsValue(((java.lang.Object)v4));
    Object v6 = 1;
    Object v7 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.Map)v0).replace(((java.lang.Object)v5),((java.lang.Object)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).toString();
    Object v3 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).clone();
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v3).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = 1;
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.collections.map.LinkedMap();
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v3).toString();
    Object v5 = new org.apache.commons.collections.map.LinkedMap();
    Object v6 = new org.apache.commons.collections.map.LinkedMap();
    Object v7 = new org.apache.commons.collections.map.LinkedMap();
    Object v8 = ((org.apache.commons.collections.map.AbstractHashedMap)v7).toString();
    Object v9 = ((org.apache.commons.collections.map.AbstractHashedMap)v6).containsKey(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.collections.map.AbstractHashedMap)v5).equals(((java.lang.Object)v9));
    Object v11 = ((java.util.Map)v0).replace(((java.lang.Object)v2),((java.lang.Object)v4),((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = 1;
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).toString();
    Object v4 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v2).clone();
    ((org.apache.commons.collections.map.AbstractHashedMap)v0).putAll(((java.util.Map)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = 65;
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.collections.map.AbstractHashedMap)v0).putAll(((java.util.Map)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v3).entrySet();
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v3).convertKey(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).containsValue(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v3).toString();
    Object v5 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v3).clone();
    Object v6 = 1;
    Object v7 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.collections.map.LinkedMap();
    Object v9 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v7).convertKey(((java.lang.Object)v8));
    Object v10 = ((java.util.Map)v1).remove(((java.lang.Object)v5),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.collections.map.AbstractHashedMap)v12).isEmpty();
    Object v14 = java.util.function.Function.identity();
    Object v15 = 1;
    Object v16 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v16).clone();
    Object v18 = 1;
    Object v19 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v18).intValue()));
    Object v20 = ((org.apache.commons.collections.map.AbstractHashedMap)v19).entrySet();
    Object v21 = 1;
    Object v22 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v19).convertKey(((java.lang.Object)v22));
    Object v24 = java.util.function.Function.identity();
    Object v25 = ((java.util.Map)v17).getOrDefault(((java.lang.Object)v23),((java.lang.Object)v24));
    Object v26 = ((java.util.function.Function)v14).compose(((java.util.function.Function)v25));
    Object v27 = ((java.util.Map)v1).computeIfAbsent(((java.lang.Object)v13),((java.util.function.Function)v14));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).clone();
    Object v3 = 1;
    Object v4 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.apache.commons.collections.map.LinkedMap();
    Object v6 = ((org.apache.commons.collections.map.AbstractHashedMap)v5).toString();
    Object v7 = new org.apache.commons.collections.map.LinkedMap();
    Object v8 = ((java.util.Map)v4).remove(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.map.LinkedMap();
    Object v10 = ((org.apache.commons.collections.map.AbstractHashedMap)v9).hashCode();
    Object v11 = ((java.util.Map)v2).putIfAbsent(((java.lang.Object)v8),((java.lang.Object)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).entrySet();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = new org.apache.commons.collections.map.LinkedMap();
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v3).toString();
    Object v5 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v3).clone();
    Object v6 = ((java.util.Map)v0).replace(((java.lang.Object)v1),((java.lang.Object)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 60;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).clone();
    Object v3 = new org.apache.commons.collections.map.LinkedMap();
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v3).values();
    Object v5 = new org.apache.commons.collections.map.LinkedMap();
    Object v6 = 1;
    Object v7 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.collections.map.AbstractHashedMap)v7).toString();
    Object v9 = ((java.util.Map)v2).replace(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 60;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).entrySet();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 65;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.map.LinkedMap();
    Object v3 = new org.apache.commons.collections.map.LinkedMap();
    Object v4 = new org.apache.commons.collections.map.LinkedMap();
    Object v5 = ((org.apache.commons.collections.map.AbstractHashedMap)v4).toString();
    Object v6 = ((org.apache.commons.collections.map.AbstractHashedMap)v3).containsKey(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).equals(((java.lang.Object)v6));
    Object v8 = 1;
    Object v9 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.collections.map.AbstractHashedMap)v9).toString();
    Object v11 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v9).clone();
    Object v12 = ((org.apache.commons.collections.map.AbstractHashedMap)v11).toString();
    Object v13 = ((java.util.Map)v1).remove(((java.lang.Object)v7),((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).entrySet();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).clone();
    Object v3 = new org.apache.commons.collections.map.LinkedMap();
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v3).keySet();
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).put(((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(2914), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 65;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    ((org.apache.commons.collections.map.AbstractHashedMap)v1).clear();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = 65;
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v1).intValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v2),((java.util.function.Function)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = new org.apache.commons.collections.map.LinkedMap();
    ((org.apache.commons.collections.map.AbstractHashedMap)v0).putAll(((java.util.Map)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 65;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = 65;
    Object v3 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).convertKey(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("{}"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = 65;
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v1).intValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v2),((java.util.function.Function)v3));
    Object v5 = new org.apache.commons.collections.map.LinkedMap();
    Object v6 = new org.apache.commons.collections.map.LinkedMap();
    Object v7 = ((org.apache.commons.collections.map.AbstractHashedMap)v6).toString();
    Object v8 = ((org.apache.commons.collections.map.AbstractHashedMap)v5).containsKey(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.map.LinkedMap();
    Object v10 = new org.apache.commons.collections.map.LinkedMap();
    Object v11 = ((org.apache.commons.collections.map.AbstractHashedMap)v10).size();
    Object v12 = ((org.apache.commons.collections.map.AbstractHashedMap)v9).containsValue(((java.lang.Object)v11));
    Object v13 = ((java.util.Map)v4).putIfAbsent(((java.lang.Object)v8),((java.lang.Object)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = 1;
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).toString();
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).containsKey(((java.lang.Object)v3));
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.collections.map.AbstractHashedMap)v6).toString();
    Object v8 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).remove(((java.lang.Object)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v3).entrySet();
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v3).convertKey(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).get(((java.lang.Object)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).toString();
    Object v3 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).clone();
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v3).values();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 60;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).values();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = 65;
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v1).intValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v2),((java.util.function.Function)v3));
    Object v5 = 60;
    Object v6 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v7).intValue()));
    Object v9 = new org.apache.commons.collections.map.CaseInsensitiveMap(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.AbstractHashedMap)v4).put(((java.lang.Object)v6),((java.lang.Object)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap(((java.util.Map)v1));
    Object v3 = 1;
    Object v4 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.collections.map.AbstractHashedMap)v4).keySet();
    Object v6 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v2).convertKey(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("[]"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 60;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.map.LinkedMap();
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).isEmpty();
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).remove(((java.lang.Object)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 65;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.map.LinkedMap();
    ((org.apache.commons.collections.map.AbstractHashedMap)v1).putAll(((java.util.Map)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 65;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.map.LinkedMap();
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).toString();
    Object v4 = new org.apache.commons.collections.map.LinkedMap();
    Object v5 = new org.apache.commons.collections.map.LinkedMap();
    Object v6 = ((org.apache.commons.collections.map.AbstractHashedMap)v4).containsKey(((java.lang.Object)v5));
    Object v7 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v1).clone();
    Object v3 = 1;
    Object v4 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.collections.map.AbstractHashedMap)v4).toString();
    Object v6 = 1;
    Object v7 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v7).clone();
    Object v9 = 1;
    Object v10 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.collections.map.AbstractHashedMap)v10).entrySet();
    Object v12 = 1;
    Object v13 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v10).convertKey(((java.lang.Object)v13));
    Object v15 = java.util.function.Function.identity();
    Object v16 = ((java.util.Map)v8).getOrDefault(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = ((java.util.Map)v2).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v16));
    org.junit.Assert.assertEquals((Object)("{}"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Map)v1).isEmpty();
    Object v3 = new org.apache.commons.collections.map.LinkedMap();
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v3).toString();
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new org.apache.commons.collections.map.CaseInsensitiveMap(((java.util.Map)v6));
    Object v8 = ((java.util.Map)v1).putIfAbsent(((java.lang.Object)v4),((java.lang.Object)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.LinkedMap();
    Object v1 = 60;
    Object v2 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).equals(((java.lang.Object)v2));
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v0).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.map.CaseInsensitiveMap(((java.util.Map)v3));
    ((org.apache.commons.collections.map.AbstractHashedMap)v1).putAll(((java.util.Map)v4));
    Object v5 = null;
    ((org.apache.commons.collections.map.AbstractHashedMap)v1).clear();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 60;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.map.LinkedMap();
    Object v3 = ((java.util.Map)v2).keySet();
    Object v4 = new org.apache.commons.collections.map.LinkedMap();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v2).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    Object v7 = 1;
    Object v8 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v8).clone();
    Object v10 = new org.apache.commons.collections.map.LinkedMap();
    Object v11 = ((org.apache.commons.collections.map.AbstractHashedMap)v10).values();
    Object v12 = new org.apache.commons.collections.map.LinkedMap();
    Object v13 = 1;
    Object v14 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.collections.map.AbstractHashedMap)v14).toString();
    Object v16 = ((java.util.Map)v9).replace(((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v15));
    Object v17 = ((java.util.Map)v1).remove(((java.lang.Object)v6),((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).values();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 65;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 60;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.map.LinkedMap();
    Object v3 = ((org.apache.commons.collections.map.AbstractHashedMap)v2).values();
    Object v4 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).containsKey(((java.lang.Object)v3));
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.collections.map.AbstractHashedMap)v6).keySet();
    Object v8 = ((org.apache.commons.collections.map.AbstractHashedMap)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 60;
    Object v1 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.collections.map.AbstractHashedMap)v5).entrySet();
    Object v7 = 1;
    Object v8 = new org.apache.commons.collections.map.CaseInsensitiveMap((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.collections.map.CaseInsensitiveMap)v5).convertKey(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.collections.map.AbstractHashedMap)v3).containsValue(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.map.LinkedMap();
    Object v12 = ((java.util.Map)v1).replace(((java.lang.Object)v10),((java.lang.Object)v11));
    org.junit.Assert.assertNull(v12);
  }
}
