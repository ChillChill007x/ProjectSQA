package org.apache.commons.collections4.map;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).previousKey(((java.lang.Object)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = ((java.util.Map)v0).remove(((java.lang.Object)v1),((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).firstKey();
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = ((java.util.Map)v1).remove(((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = java.util.function.Function.identity();
    Object v6 = java.util.function.Function.identity();
    Object v7 = ((java.util.function.Function)v5).compose(((java.util.function.Function)v6));
    Object v8 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).nextKey(((java.lang.Object)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = java.util.function.Function.identity();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v1),((java.lang.Object)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).lastKey();
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v0).size();
    Object v2 = 0;
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.function.Function.identity();
    Object v5 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).put((((java.lang.Integer)v2).intValue()),((java.lang.Object)v3),((java.lang.Object)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = java.util.function.Function.identity();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).putIfAbsent(((java.lang.Object)v1),((java.lang.Object)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = java.util.function.Function.identity();
    Object v4 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = ((java.util.Map)v0).putIfAbsent(((java.lang.Object)v4),((java.lang.Object)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    ((org.apache.commons.collections4.map.ListOrderedMap)v0).putAll(((java.util.Map)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = 0;
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    ((org.apache.commons.collections4.map.ListOrderedMap)v0).putAll((((java.lang.Integer)v1).intValue()),((java.util.Map)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = java.util.function.Function.identity();
    Object v4 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).nextKey(((java.lang.Object)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = ((java.util.Map)v1).remove(((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = ((java.util.Map)v0).remove(((java.lang.Object)v4),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = 22;
    Object v2 = java.util.function.Function.identity();
    Object v3 = java.util.function.Function.identity();
    Object v4 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).put((((java.lang.Integer)v1).intValue()),((java.lang.Object)v2),((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = ((java.util.Map)v1).remove(((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v0).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = java.util.function.Function.identity();
    Object v2 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).previousKey(((java.lang.Object)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = java.util.function.Function.identity();
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v6 = ((java.util.Map)v3).remove(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = java.util.function.Function.identity();
    Object v8 = java.util.function.Function.identity();
    Object v9 = ((java.util.function.Function)v7).compose(((java.util.function.Function)v8));
    Object v10 = ((java.util.Map)v2).computeIfAbsent(((java.lang.Object)v6),((java.util.function.Function)v7));
    Object v11 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v0).size();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = java.util.function.Function.identity();
    Object v2 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).nextKey(((java.lang.Object)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v1).size();
    Object v3 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).indexOf(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = ((java.util.Map)v2).remove(((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v7 = java.util.function.Function.identity();
    Object v8 = java.util.function.Function.identity();
    Object v9 = ((java.util.Map)v6).getOrDefault(((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = ((java.util.Map)v1).remove(((java.lang.Object)v5),((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v0).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v1).size();
    Object v3 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).remove(((java.lang.Object)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = java.util.function.Function.identity();
    Object v4 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v0).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v1).size();
    Object v3 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v0).containsKey(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v1).size();
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = java.util.function.Function.identity();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v3).getOrDefault(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v2),((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v1).size();
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = java.util.function.Function.identity();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v3).getOrDefault(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v2),((java.util.function.Function)v6));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v1).size();
    Object v3 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).previousKey(((java.lang.Object)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v0).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = -22;
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    ((org.apache.commons.collections4.map.ListOrderedMap)v0).putAll((((java.lang.Integer)v1).intValue()),((java.util.Map)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = -7;
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    ((org.apache.commons.collections4.map.ListOrderedMap)v0).putAll((((java.lang.Integer)v1).intValue()),((java.util.Map)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v2).size();
    Object v4 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v1).containsKey(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v6 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v5).isEmpty();
    Object v7 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v8 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v9 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v10 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v11 = ((java.util.Map)v8).remove(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = java.util.function.Function.identity();
    Object v13 = java.util.function.Function.identity();
    Object v14 = ((java.util.function.Function)v12).compose(((java.util.function.Function)v13));
    Object v15 = ((java.util.Map)v7).computeIfAbsent(((java.lang.Object)v11),((java.util.function.Function)v12));
    Object v16 = ((java.util.Map)v0).replace(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v2).size();
    Object v4 = ((org.apache.commons.collections4.map.ListOrderedMap)v1).indexOf(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v6 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v5).size();
    Object v7 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).put(((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).toString();
    org.junit.Assert.assertEquals((Object)("{-1=0}"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = ((java.util.Map)v1).remove(((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v0).get(((java.lang.Object)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = 1;
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = java.util.function.Function.identity();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v3).getOrDefault(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v2).equals(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v9 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v8).isEmpty();
    Object v10 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).put((((java.lang.Integer)v1).intValue()),((java.lang.Object)v7),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).keyList();
    Object v2 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).values();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v0).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = ((java.util.Map)v2).remove(((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.function.Function)v6).compose(((java.util.function.Function)v7));
    Object v9 = ((java.util.Map)v1).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v6));
    Object v10 = ((java.util.Map)v0).get(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v12 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v11).hashCode();
    Object v13 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v14 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v13).isEmpty();
    Object v15 = ((java.util.Map)v0).remove(((java.lang.Object)v12),((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = ((org.apache.commons.collections4.map.ListOrderedMap)v1).keyList();
    Object v3 = ((org.apache.commons.collections4.map.ListOrderedMap)v1).values();
    Object v4 = ((java.util.Map)v0).containsKey(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v6 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v5).isEmpty();
    Object v7 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v8 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v7).isEmpty();
    Object v9 = ((java.util.Map)v0).replace(((java.lang.Object)v6),((java.lang.Object)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = 0;
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v6 = ((java.util.Map)v3).remove(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v2).equals(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).setValue((((java.lang.Integer)v1).intValue()),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = ((java.util.Map)v2).remove(((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.function.Function)v6).compose(((java.util.function.Function)v7));
    Object v9 = ((java.util.Map)v1).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v6));
    Object v10 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v0).containsValue(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v1).isEmpty();
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v3).hashCode();
    Object v5 = ((java.util.Map)v0).putIfAbsent(((java.lang.Object)v2),((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).lastKey();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v1).isEmpty();
    Object v3 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).remove(((java.lang.Object)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).keySet();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = ((org.apache.commons.collections4.map.ListOrderedMap)v1).keySet();
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v3).hashCode();
    Object v5 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v6 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v7 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v6).size();
    Object v8 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v5).containsKey(((java.lang.Object)v7));
    Object v9 = ((java.util.Map)v0).replace(((java.lang.Object)v2),((java.lang.Object)v4),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v0).hashCode();
    Object v2 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v0).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = 0;
    Object v2 = java.util.function.Function.identity();
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = ((org.apache.commons.collections4.map.ListOrderedMap)v3).keySet();
    Object v5 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).put((((java.lang.Integer)v1).intValue()),((java.lang.Object)v2),((java.lang.Object)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v2).size();
    Object v4 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v1).containsKey(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v10 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v9).hashCode();
    Object v11 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v9).isEmpty();
    Object v12 = ((java.util.function.Function)v8).apply(((java.lang.Object)v11));
    Object v13 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v8));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    ((org.apache.commons.collections4.map.ListOrderedMap)v0).putAll(((java.util.Map)v1));
    Object v2 = null;
    Object v3 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).firstKey();
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = -10;
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v2).isEmpty();
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v6 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v7 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v8 = ((java.util.Map)v5).remove(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.function.Function.identity();
    Object v12 = ((java.util.Map)v9).getOrDefault(((java.lang.Object)v10),((java.lang.Object)v11));
    Object v13 = ((java.util.Map)v4).remove(((java.lang.Object)v8),((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).put((((java.lang.Integer)v1).intValue()),((java.lang.Object)v3),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = ((org.apache.commons.collections4.map.ListOrderedMap)v1).keySet();
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v3).size();
    Object v5 = ((java.util.Map)v0).replace(((java.lang.Object)v2),((java.lang.Object)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    ((org.apache.commons.collections4.map.ListOrderedMap)v0).clear();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = java.util.function.Function.identity();
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v3).size();
    Object v5 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = ((java.util.Map)v2).getOrDefault(((java.lang.Object)v4),((java.lang.Object)v8));
    Object v10 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = ((org.apache.commons.collections4.map.ListOrderedMap)v2).keySet();
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v4).hashCode();
    Object v6 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v7 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v8 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v7).size();
    Object v9 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v6).containsKey(((java.lang.Object)v8));
    Object v10 = ((java.util.Map)v1).replace(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v12 = ((org.apache.commons.collections4.map.ListOrderedMap)v11).toString();
    Object v13 = ((java.util.Map)v0).putIfAbsent(((java.lang.Object)v10),((java.lang.Object)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v2).size();
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v6 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v7 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v8 = ((java.util.Map)v5).remove(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = java.util.function.Function.identity();
    Object v10 = java.util.function.Function.identity();
    Object v11 = ((java.util.function.Function)v9).compose(((java.util.function.Function)v10));
    Object v12 = ((java.util.Map)v4).computeIfAbsent(((java.lang.Object)v8),((java.util.function.Function)v9));
    Object v13 = ((org.apache.commons.collections4.map.ListOrderedMap)v1).put(((java.lang.Object)v3),((java.lang.Object)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).valueList();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v2));
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v3));
    ((org.apache.commons.collections4.map.ListOrderedMap)v1).putAll(((java.util.Map)v4));
    Object v5 = null;
    Object v6 = 18;
    Object v7 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v8 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v7));
    Object v9 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v10 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v9));
    Object v11 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v10));
    Object v12 = ((org.apache.commons.collections4.map.ListOrderedMap)v1).put((((java.lang.Integer)v6).intValue()),((java.lang.Object)v8),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v3).hashCode();
    Object v5 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v2).containsKey(((java.lang.Object)v4));
    Object v6 = 1;
    Object v7 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v8 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v7).isEmpty();
    Object v9 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v10 = ((org.apache.commons.collections4.map.ListOrderedMap)v9).toString();
    Object v11 = ((org.apache.commons.collections4.map.ListOrderedMap)v2).put((((java.lang.Integer)v6).intValue()),((java.lang.Object)v8),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v2).hashCode();
    Object v4 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v2).isEmpty();
    Object v5 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v3).size();
    Object v5 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v6 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v5).hashCode();
    Object v7 = ((java.util.Map)v2).putIfAbsent(((java.lang.Object)v4),((java.lang.Object)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v1).size();
    Object v3 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v0).equals(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = ((org.apache.commons.collections4.map.ListOrderedMap)v4).toString();
    Object v6 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v0).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections4.map.ListOrderedMap)v1).nextKey(((java.lang.Object)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v6 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v5).hashCode();
    Object v7 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v5).isEmpty();
    Object v8 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v4).equals(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v10 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v9).hashCode();
    Object v11 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v9).isEmpty();
    Object v12 = ((java.util.Map)v2).replace(((java.lang.Object)v8),((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v14 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v13).isEmpty();
    Object v15 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v16 = java.util.function.Function.identity();
    Object v17 = java.util.function.Function.identity();
    Object v18 = ((java.util.Map)v15).getOrDefault(((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = ((java.util.Map)v2).computeIfAbsent(((java.lang.Object)v14),((java.util.function.Function)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections4.map.ListOrderedMap)v2).entrySet();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections4.map.ListOrderedMap)v1).firstKey();
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections4.map.ListOrderedMap)v2).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = ((org.apache.commons.collections4.map.ListOrderedMap)v3).toString();
    Object v5 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v6 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v5).size();
    Object v7 = ((java.util.Map)v2).remove(((java.lang.Object)v4),((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = ((org.apache.commons.collections4.map.ListOrderedMap)v2).toString();
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v4).size();
    Object v6 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v7 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v6));
    Object v8 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v9 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v8).hashCode();
    Object v10 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v8).isEmpty();
    Object v11 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v7).equals(((java.lang.Object)v10));
    Object v12 = ((java.util.Map)v1).replace(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v4).isEmpty();
    Object v6 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v2).containsKey(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v8 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v9 = java.util.function.Function.identity();
    Object v10 = java.util.function.Function.identity();
    Object v11 = ((java.util.Map)v8).getOrDefault(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v7).equals(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.collections4.map.ListOrderedMap)v2).previousKey(((java.lang.Object)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v2));
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v4).hashCode();
    Object v6 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v8 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v7));
    Object v9 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v10 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v9));
    Object v11 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v12 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v11).hashCode();
    Object v13 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v11).isEmpty();
    Object v14 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v10).equals(((java.lang.Object)v13));
    Object v15 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v16 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v15).size();
    Object v17 = ((java.util.Map)v1).replace(((java.lang.Object)v8),((java.lang.Object)v14),((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v2).isEmpty();
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v4).hashCode();
    Object v6 = ((org.apache.commons.collections4.map.ListOrderedMap)v2).previousKey(((java.lang.Object)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = java.util.function.Function.identity();
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v4));
    Object v6 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v5));
    Object v7 = ((java.util.Map)v2).remove(((java.lang.Object)v3),((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = ((org.apache.commons.collections4.map.ListOrderedMap)v1).keySet();
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = java.util.function.Function.identity();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v3).getOrDefault(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v2),((java.util.function.Function)v6));
    Object v8 = 0;
    Object v9 = ((org.apache.commons.collections4.map.ListOrderedMap)v0).getValue((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v3).isEmpty();
    Object v5 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v6 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v5));
    Object v7 = ((java.util.Map)v1).replace(((java.lang.Object)v4),((java.lang.Object)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = 1;
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v4));
    Object v6 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v5));
    ((org.apache.commons.collections4.map.ListOrderedMap)v2).putAll((((java.lang.Integer)v3).intValue()),((java.util.Map)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = ((java.util.Map)v2).size();
    Object v4 = java.util.function.Function.identity();
    Object v5 = null;
    Object v6 = ((java.util.Map)v2).computeIfPresent(((java.lang.Object)v4),((java.util.function.BiFunction)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = 0;
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v2));
    ((org.apache.commons.collections4.map.ListOrderedMap)v0).putAll((((java.lang.Integer)v1).intValue()),((java.util.Map)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v3));
    ((org.apache.commons.collections4.map.ListOrderedMap)v1).putAll((((java.lang.Integer)v2).intValue()),((java.util.Map)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = ((org.apache.commons.collections4.map.ListOrderedMap)v2).valueList();
    Object v4 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v1).get(((java.lang.Object)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = ((org.apache.commons.collections4.map.ListOrderedMap)v2).valueList();
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v4));
    Object v6 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v5));
    Object v7 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v8 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v7));
    Object v9 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v10 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v9).hashCode();
    Object v11 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v9).isEmpty();
    Object v12 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v8).equals(((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v14 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v13).hashCode();
    Object v15 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v13).isEmpty();
    Object v16 = ((java.util.Map)v6).replace(((java.lang.Object)v12),((java.lang.Object)v15));
    Object v17 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v18 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v17).isEmpty();
    Object v19 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v20 = java.util.function.Function.identity();
    Object v21 = java.util.function.Function.identity();
    Object v22 = ((java.util.Map)v19).getOrDefault(((java.lang.Object)v20),((java.lang.Object)v21));
    Object v23 = ((java.util.Map)v6).computeIfAbsent(((java.lang.Object)v18),((java.util.function.Function)v22));
    Object v24 = ((java.util.Map)v1).replace(((java.lang.Object)v3),((java.lang.Object)v23));
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = ((java.util.Map)v2).entrySet();
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v6 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v7 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v8 = ((java.util.Map)v5).remove(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v4).equals(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v11 = ((org.apache.commons.collections4.map.ListOrderedMap)v10).toString();
    Object v12 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v13 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v14 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v15 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v16 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v17 = ((java.util.Map)v14).remove(((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = java.util.function.Function.identity();
    Object v19 = java.util.function.Function.identity();
    Object v20 = ((java.util.function.Function)v18).compose(((java.util.function.Function)v19));
    Object v21 = ((java.util.Map)v13).computeIfAbsent(((java.lang.Object)v17),((java.util.function.Function)v18));
    Object v22 = ((java.util.Map)v12).get(((java.lang.Object)v21));
    Object v23 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v24 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v23).hashCode();
    Object v25 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v26 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v25).isEmpty();
    Object v27 = ((java.util.Map)v12).remove(((java.lang.Object)v24),((java.lang.Object)v26));
    Object v28 = ((java.util.Map)v2).replace(((java.lang.Object)v9),((java.lang.Object)v11),((java.lang.Object)v27));
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v2).hashCode();
    Object v4 = 1;
    Object v5 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v6 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v5).hashCode();
    Object v7 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v8 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v9 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v10 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v9).size();
    Object v11 = ((org.apache.commons.collections4.map.ListOrderedMap)v8).indexOf(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v13 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v12).size();
    Object v14 = ((org.apache.commons.collections4.map.ListOrderedMap)v7).put(((java.lang.Object)v11),((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.collections4.map.ListOrderedMap)v7).toString();
    Object v16 = ((org.apache.commons.collections4.map.ListOrderedMap)v2).put((((java.lang.Integer)v4).intValue()),((java.lang.Object)v6),((java.lang.Object)v15));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v2 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v1));
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v2));
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = java.util.function.Function.identity();
    Object v6 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v7 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v8 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v7).size();
    Object v9 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.function.Function.identity();
    Object v12 = ((java.util.Map)v9).getOrDefault(((java.lang.Object)v10),((java.lang.Object)v11));
    Object v13 = ((java.util.Map)v6).getOrDefault(((java.lang.Object)v8),((java.lang.Object)v12));
    Object v14 = ((java.util.Map)v4).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v13));
    Object v15 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v3),((java.util.function.Function)v14));
    ((org.apache.commons.collections4.map.ListOrderedMap)v0).clear();
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = ((org.apache.commons.collections4.map.ListOrderedMap)v2).keySet();
    Object v4 = ((org.apache.commons.collections4.map.ListOrderedMap)v1).nextKey(((java.lang.Object)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v4).size();
    Object v6 = ((org.apache.commons.collections4.map.ListOrderedMap)v3).indexOf(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v8 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v9 = ((org.apache.commons.collections4.map.ListOrderedMap)v8).keySet();
    Object v10 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v11 = java.util.function.Function.identity();
    Object v12 = java.util.function.Function.identity();
    Object v13 = ((java.util.Map)v10).getOrDefault(((java.lang.Object)v11),((java.lang.Object)v12));
    Object v14 = ((java.util.Map)v7).computeIfAbsent(((java.lang.Object)v9),((java.util.function.Function)v13));
    Object v15 = 0;
    Object v16 = ((org.apache.commons.collections4.map.ListOrderedMap)v7).getValue((((java.lang.Integer)v15).intValue()));
    Object v17 = ((java.util.Map)v2).replace(((java.lang.Object)v6),((java.lang.Object)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = ((org.apache.commons.collections4.map.ListOrderedMap)v2).valueList();
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = ((org.apache.commons.collections4.map.ListOrderedMap)v4).keyList();
    Object v6 = ((org.apache.commons.collections4.map.ListOrderedMap)v4).values();
    Object v7 = ((java.util.Map)v1).replace(((java.lang.Object)v3),((java.lang.Object)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = java.util.function.Function.identity();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v3).getOrDefault(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v2).equals(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v9 = ((org.apache.commons.collections4.map.ListOrderedMap)v8).keySet();
    Object v10 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v11 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v10).hashCode();
    Object v12 = ((java.util.Map)v1).replace(((java.lang.Object)v7),((java.lang.Object)v9),((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections4.map.ListOrderedMap)v2).firstKey();
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections4.map.ListOrderedMap)v2).asList();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = java.util.function.Function.identity();
    Object v5 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v6 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v7 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v6).size();
    Object v8 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v9 = java.util.function.Function.identity();
    Object v10 = java.util.function.Function.identity();
    Object v11 = ((java.util.Map)v8).getOrDefault(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v7),((java.lang.Object)v11));
    Object v13 = ((java.util.Map)v3).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v12));
    Object v14 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v15 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v14).hashCode();
    Object v16 = ((java.util.Map)v2).getOrDefault(((java.lang.Object)v13),((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = ((org.apache.commons.collections4.map.ListOrderedMap)v3).keyList();
    Object v5 = ((org.apache.commons.collections4.map.ListOrderedMap)v3).values();
    Object v6 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v7 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v6));
    Object v8 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v7));
    Object v9 = ((java.util.Map)v2).remove(((java.lang.Object)v5),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v1));
    Object v3 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v4 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v3).isEmpty();
    Object v5 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v2));
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections4.map.ListOrderedMap)v4).toString();
    Object v6 = ((org.apache.commons.collections4.map.ListOrderedMap)v1).previousKey(((java.lang.Object)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v1 = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v3 = ((org.apache.commons.collections4.map.ListOrderedMap)v2).toString();
    Object v4 = new org.apache.commons.collections4.map.ListOrderedMap();
    Object v5 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v4).hashCode();
    Object v6 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v4).isEmpty();
    Object v7 = null;
    Object v8 = ((java.util.Map)v1).merge(((java.lang.Object)v3),((java.lang.Object)v6),((java.util.function.BiFunction)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
