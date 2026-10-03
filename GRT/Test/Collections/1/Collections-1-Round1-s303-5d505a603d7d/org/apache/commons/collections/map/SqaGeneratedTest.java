package org.apache.commons.collections.map;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).keySet();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = ((java.util.Map)v2).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).keySet();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v3).entrySet();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    ((org.apache.commons.collections.map.Flat3Map)v3).clear();
    Object v4 = null;
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v3).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).entrySet();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = 1;
    Object v5 = 11.897582F;
    Object v6 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v4).intValue()),(((java.lang.Float)v5).floatValue()));
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).entrySet();
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v3).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = 1;
    Object v7 = 11.897582F;
    Object v8 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = ((java.util.Map)v2).remove(((java.lang.Object)v5),((java.lang.Object)v8));
    Object v10 = 1;
    Object v11 = 11.897582F;
    Object v12 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = 1;
    Object v14 = 11.897582F;
    Object v15 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v13).intValue()),(((java.lang.Float)v14).floatValue()));
    Object v16 = ((java.util.Map)v2).replace(((java.lang.Object)v12),((java.lang.Object)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = 1;
    Object v5 = 11.897582F;
    Object v6 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v4).intValue()),(((java.lang.Float)v5).floatValue()));
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).keySet();
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v3).containsValue(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = 1;
    Object v5 = 11.897582F;
    Object v6 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v4).intValue()),(((java.lang.Float)v5).floatValue()));
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = 1;
    Object v9 = 11.897582F;
    Object v10 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v10));
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).entrySet();
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v7).equals(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v3).containsKey(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).entrySet();
    Object v8 = 1;
    Object v9 = 11.897582F;
    Object v10 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v10));
    ((org.apache.commons.collections.map.Flat3Map)v11).clear();
    Object v12 = null;
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v11).isEmpty();
    Object v14 = ((java.util.Map)v2).remove(((java.lang.Object)v7),((java.lang.Object)v13));
    Object v15 = 1;
    Object v16 = 11.897582F;
    Object v17 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v15).intValue()),(((java.lang.Float)v16).floatValue()));
    Object v18 = 1;
    Object v19 = 11.897582F;
    Object v20 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v18).intValue()),(((java.lang.Float)v19).floatValue()));
    Object v21 = 1;
    Object v22 = 11.897582F;
    Object v23 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v21).intValue()),(((java.lang.Float)v22).floatValue()));
    Object v24 = ((java.util.Map)v2).replace(((java.lang.Object)v17),((java.lang.Object)v20),((java.lang.Object)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = 1;
    Object v5 = 11.897582F;
    Object v6 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v4).intValue()),(((java.lang.Float)v5).floatValue()));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v3).remove(((java.lang.Object)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).mapIterator();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = 1;
    Object v7 = 11.897582F;
    Object v8 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    ((org.apache.commons.collections.map.Flat3Map)v9).clear();
    Object v10 = null;
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v9).isEmpty();
    Object v12 = ((java.util.Map)v2).putIfAbsent(((java.lang.Object)v5),((java.lang.Object)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = ((java.util.Map)v2).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v6));
    Object v8 = 1;
    Object v9 = 11.897582F;
    Object v10 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = 1;
    Object v12 = 11.897582F;
    Object v13 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v11).intValue()),(((java.lang.Float)v12).floatValue()));
    Object v14 = ((java.util.Map)v7).getOrDefault(((java.lang.Object)v10),((java.lang.Object)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).keySet();
    Object v8 = 1;
    Object v9 = 11.897582F;
    Object v10 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = 1;
    Object v12 = 11.897582F;
    Object v13 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v11).intValue()),(((java.lang.Float)v12).floatValue()));
    Object v14 = ((java.util.Map)v2).replace(((java.lang.Object)v7),((java.lang.Object)v10),((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = 1;
    Object v5 = 11.897582F;
    Object v6 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v4).intValue()),(((java.lang.Float)v5).floatValue()));
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).keySet();
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v3).containsKey(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = 1;
    Object v7 = 11.897582F;
    Object v8 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = ((java.util.Map)v2).putIfAbsent(((java.lang.Object)v5),((java.lang.Object)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).toString();
    Object v8 = 1;
    Object v9 = 11.897582F;
    Object v10 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v10));
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).mapIterator();
    Object v13 = 1;
    Object v14 = 11.897582F;
    Object v15 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v13).intValue()),(((java.lang.Float)v14).floatValue()));
    Object v16 = ((java.util.Map)v2).replace(((java.lang.Object)v7),((java.lang.Object)v12),((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    ((org.apache.commons.collections.map.Flat3Map)v3).clear();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = 1;
    Object v5 = 11.897582F;
    Object v6 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v4).intValue()),(((java.lang.Float)v5).floatValue()));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v3).containsValue(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.function.Function.identity();
    Object v5 = ((java.util.Map)v2).computeIfAbsent(((java.lang.Object)v3),((java.util.function.Function)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = 1;
    Object v6 = 11.897582F;
    Object v7 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v4).remove(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v4).mapIterator();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = 1;
    Object v6 = 11.897582F;
    Object v7 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).mapIterator();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v4).get(((java.lang.Object)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).values();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = 1;
    Object v6 = 11.897582F;
    Object v7 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v4).get(((java.lang.Object)v7));
    ((org.apache.commons.collections.map.Flat3Map)v4).clear();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = 1;
    Object v8 = 11.897582F;
    Object v9 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v7).intValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).keySet();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v6).containsValue(((java.lang.Object)v11));
    Object v13 = 1;
    Object v14 = 11.897582F;
    Object v15 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v13).intValue()),(((java.lang.Float)v14).floatValue()));
    Object v16 = 1;
    Object v17 = 11.897582F;
    Object v18 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v16).intValue()),(((java.lang.Float)v17).floatValue()));
    Object v19 = 1;
    Object v20 = 11.897582F;
    Object v21 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v19).intValue()),(((java.lang.Float)v20).floatValue()));
    Object v22 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v21));
    Object v23 = ((org.apache.commons.collections.map.Flat3Map)v22).keySet();
    Object v24 = 1;
    Object v25 = 11.897582F;
    Object v26 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v24).intValue()),(((java.lang.Float)v25).floatValue()));
    Object v27 = 1;
    Object v28 = 11.897582F;
    Object v29 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v27).intValue()),(((java.lang.Float)v28).floatValue()));
    Object v30 = ((java.util.Map)v18).replace(((java.lang.Object)v23),((java.lang.Object)v26),((java.lang.Object)v29));
    Object v31 = ((java.util.Map)v2).replace(((java.lang.Object)v12),((java.lang.Object)v15),((java.lang.Object)v30));
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).size();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = 1;
    Object v6 = 11.897582F;
    Object v7 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).clone();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).size();
    Object v11 = 1;
    Object v12 = 11.897582F;
    Object v13 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v11).intValue()),(((java.lang.Float)v12).floatValue()));
    Object v14 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v13));
    Object v15 = 1;
    Object v16 = 11.897582F;
    Object v17 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v15).intValue()),(((java.lang.Float)v16).floatValue()));
    Object v18 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v17));
    Object v19 = 1;
    Object v20 = 11.897582F;
    Object v21 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v19).intValue()),(((java.lang.Float)v20).floatValue()));
    Object v22 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v21));
    Object v23 = ((org.apache.commons.collections.map.Flat3Map)v22).entrySet();
    Object v24 = ((org.apache.commons.collections.map.Flat3Map)v18).equals(((java.lang.Object)v23));
    Object v25 = ((org.apache.commons.collections.map.Flat3Map)v14).containsKey(((java.lang.Object)v24));
    Object v26 = ((org.apache.commons.collections.map.Flat3Map)v4).put(((java.lang.Object)v10),((java.lang.Object)v25));
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = ((java.util.Map)v2).isEmpty();
    Object v4 = 1;
    Object v5 = 11.897582F;
    Object v6 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v4).intValue()),(((java.lang.Float)v5).floatValue()));
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).entrySet();
    Object v9 = 1;
    Object v10 = 11.897582F;
    Object v11 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v9).intValue()),(((java.lang.Float)v10).floatValue()));
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    ((org.apache.commons.collections.map.Flat3Map)v12).clear();
    Object v13 = null;
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v12).isEmpty();
    Object v15 = ((java.util.Map)v2).replace(((java.lang.Object)v8),((java.lang.Object)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).keySet();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = ((java.util.Map)v2).get(((java.lang.Object)v3));
    Object v5 = 1;
    Object v6 = 11.897582F;
    Object v7 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).clone();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).size();
    Object v11 = 1;
    Object v12 = 11.897582F;
    Object v13 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v11).intValue()),(((java.lang.Float)v12).floatValue()));
    Object v14 = java.util.function.Function.identity();
    Object v15 = java.util.function.Function.identity();
    Object v16 = ((java.util.Map)v13).computeIfAbsent(((java.lang.Object)v14),((java.util.function.Function)v15));
    Object v17 = ((java.util.Map)v2).replace(((java.lang.Object)v10),((java.lang.Object)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).isEmpty();
    Object v8 = 1;
    Object v9 = 11.897582F;
    Object v10 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v10));
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).clone();
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).keySet();
    Object v14 = ((java.util.Map)v2).remove(((java.lang.Object)v7),((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).keySet();
    Object v8 = 1;
    Object v9 = 11.897582F;
    Object v10 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = ((java.util.Map)v2).remove(((java.lang.Object)v7),((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = 1;
    Object v6 = 11.897582F;
    Object v7 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    ((org.apache.commons.collections.map.Flat3Map)v4).putAll(((java.util.Map)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = 1;
    Object v7 = 11.897582F;
    Object v8 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = 1;
    Object v11 = 11.897582F;
    Object v12 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v12));
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).entrySet();
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v9).equals(((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v5).remove(((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = 11.897582F;
    Object v19 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v17).intValue()),(((java.lang.Float)v18).floatValue()));
    Object v20 = 1;
    Object v21 = 11.897582F;
    Object v22 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v20).intValue()),(((java.lang.Float)v21).floatValue()));
    Object v23 = java.util.function.Function.identity();
    Object v24 = ((java.util.Map)v19).computeIfAbsent(((java.lang.Object)v22),((java.util.function.Function)v23));
    Object v25 = 1;
    Object v26 = 11.897582F;
    Object v27 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v25).intValue()),(((java.lang.Float)v26).floatValue()));
    Object v28 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v27));
    Object v29 = 1;
    Object v30 = 11.897582F;
    Object v31 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v29).intValue()),(((java.lang.Float)v30).floatValue()));
    Object v32 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v31));
    Object v33 = ((org.apache.commons.collections.map.Flat3Map)v32).entrySet();
    Object v34 = ((org.apache.commons.collections.map.Flat3Map)v28).equals(((java.lang.Object)v33));
    Object v35 = ((org.apache.commons.collections.map.Flat3Map)v5).put(((java.lang.Object)v24),((java.lang.Object)v34));
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).size();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = 1;
    Object v7 = 11.897582F;
    Object v8 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = 1;
    Object v11 = 11.897582F;
    Object v12 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v12));
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).keySet();
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v9).containsKey(((java.lang.Object)v14));
    Object v16 = ((java.util.Map)v2).putIfAbsent(((java.lang.Object)v5),((java.lang.Object)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).mapIterator();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = 1;
    Object v7 = 11.897582F;
    Object v8 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).clone();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v5).get(((java.lang.Object)v11));
    Object v13 = 1;
    Object v14 = 11.897582F;
    Object v15 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v13).intValue()),(((java.lang.Float)v14).floatValue()));
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v5).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = ((java.util.Map)v2).keySet();
    Object v4 = 1;
    Object v5 = 11.897582F;
    Object v6 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v4).intValue()),(((java.lang.Float)v5).floatValue()));
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).clone();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).toString();
    Object v11 = 1;
    Object v12 = 11.897582F;
    Object v13 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v11).intValue()),(((java.lang.Float)v12).floatValue()));
    Object v14 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v13));
    Object v15 = 1;
    Object v16 = 11.897582F;
    Object v17 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v15).intValue()),(((java.lang.Float)v16).floatValue()));
    Object v18 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v17));
    Object v19 = ((org.apache.commons.collections.map.Flat3Map)v18).keySet();
    Object v20 = ((org.apache.commons.collections.map.Flat3Map)v14).containsKey(((java.lang.Object)v19));
    Object v21 = ((java.util.Map)v2).putIfAbsent(((java.lang.Object)v10),((java.lang.Object)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).mapIterator();
    Object v8 = 1;
    Object v9 = 11.897582F;
    Object v10 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v10));
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).clone();
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).clone();
    Object v14 = 1;
    Object v15 = 11.897582F;
    Object v16 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v14).intValue()),(((java.lang.Float)v15).floatValue()));
    Object v17 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v16));
    Object v18 = ((org.apache.commons.collections.map.Flat3Map)v17).clone();
    Object v19 = ((org.apache.commons.collections.map.Flat3Map)v18).clone();
    Object v20 = ((org.apache.commons.collections.map.Flat3Map)v13).get(((java.lang.Object)v19));
    Object v21 = 1;
    Object v22 = 11.897582F;
    Object v23 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v21).intValue()),(((java.lang.Float)v22).floatValue()));
    Object v24 = ((org.apache.commons.collections.map.Flat3Map)v13).equals(((java.lang.Object)v23));
    Object v25 = ((java.util.Map)v2).getOrDefault(((java.lang.Object)v7),((java.lang.Object)v24));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).toString();
    Object v6 = 1;
    Object v7 = 11.897582F;
    Object v8 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).hashCode();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v4).containsKey(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).entrySet();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = 1;
    Object v7 = 11.897582F;
    Object v8 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = 1;
    Object v10 = 11.897582F;
    Object v11 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v9).intValue()),(((java.lang.Float)v10).floatValue()));
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).keySet();
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v5).put(((java.lang.Object)v8),((java.lang.Object)v13));
    Object v15 = 1;
    Object v16 = 11.897582F;
    Object v17 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v15).intValue()),(((java.lang.Float)v16).floatValue()));
    Object v18 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v17));
    Object v19 = ((org.apache.commons.collections.map.Flat3Map)v18).clone();
    Object v20 = ((org.apache.commons.collections.map.Flat3Map)v19).clone();
    ((org.apache.commons.collections.map.Flat3Map)v5).putAll(((java.util.Map)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = ((java.util.Map)v2).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v6));
    Object v8 = 1;
    Object v9 = 11.897582F;
    Object v10 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v10));
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).clone();
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).clone();
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).toString();
    Object v15 = 1;
    Object v16 = 11.897582F;
    Object v17 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v15).intValue()),(((java.lang.Float)v16).floatValue()));
    Object v18 = java.util.function.Function.identity();
    Object v19 = java.util.function.Function.identity();
    Object v20 = ((java.util.Map)v17).computeIfAbsent(((java.lang.Object)v18),((java.util.function.Function)v19));
    Object v21 = ((java.util.Map)v7).computeIfAbsent(((java.lang.Object)v14),((java.util.function.Function)v20));
    org.junit.Assert.assertEquals((Object)("{}"), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).hashCode();
    Object v8 = java.util.function.Function.identity();
    Object v9 = ((java.util.Map)v2).computeIfAbsent(((java.lang.Object)v7),((java.util.function.Function)v8));
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = 1;
    Object v6 = 11.897582F;
    Object v7 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v4).remove(((java.lang.Object)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = 1;
    Object v6 = 11.897582F;
    Object v7 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).isEmpty();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v4).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = 1;
    Object v7 = 11.897582F;
    Object v8 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).clone();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).hashCode();
    Object v13 = 1;
    Object v14 = 11.897582F;
    Object v15 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v13).intValue()),(((java.lang.Float)v14).floatValue()));
    Object v16 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v15));
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v16).clone();
    Object v18 = ((org.apache.commons.collections.map.Flat3Map)v17).clone();
    Object v19 = ((org.apache.commons.collections.map.Flat3Map)v18).isEmpty();
    Object v20 = ((java.util.Map)v5).replace(((java.lang.Object)v12),((java.lang.Object)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = 1;
    Object v8 = 11.897582F;
    Object v9 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v7).intValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = 1;
    Object v11 = 11.897582F;
    Object v12 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v12));
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).isEmpty();
    Object v15 = 1;
    Object v16 = 11.897582F;
    Object v17 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v15).intValue()),(((java.lang.Float)v16).floatValue()));
    Object v18 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v17));
    Object v19 = ((org.apache.commons.collections.map.Flat3Map)v18).clone();
    Object v20 = ((org.apache.commons.collections.map.Flat3Map)v19).keySet();
    Object v21 = ((java.util.Map)v9).remove(((java.lang.Object)v14),((java.lang.Object)v20));
    Object v22 = ((org.apache.commons.collections.map.Flat3Map)v6).containsValue(((java.lang.Object)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = 1;
    Object v6 = 11.897582F;
    Object v7 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = 1;
    Object v9 = 11.897582F;
    Object v10 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v10));
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).hashCode();
    Object v13 = java.util.function.Function.identity();
    Object v14 = ((java.util.Map)v7).computeIfAbsent(((java.lang.Object)v12),((java.util.function.Function)v13));
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v4).containsKey(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).toString();
    Object v9 = 1;
    Object v10 = 11.897582F;
    Object v11 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v9).intValue()),(((java.lang.Float)v10).floatValue()));
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).clone();
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).values();
    Object v15 = ((java.util.Map)v2).getOrDefault(((java.lang.Object)v8),((java.lang.Object)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    ((org.apache.commons.collections.map.Flat3Map)v4).clear();
    Object v5 = null;
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = 1;
    Object v7 = 11.897582F;
    Object v8 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).entrySet();
    Object v11 = 1;
    Object v12 = 11.897582F;
    Object v13 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v11).intValue()),(((java.lang.Float)v12).floatValue()));
    Object v14 = 1;
    Object v15 = 11.897582F;
    Object v16 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v14).intValue()),(((java.lang.Float)v15).floatValue()));
    Object v17 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v16));
    Object v18 = ((org.apache.commons.collections.map.Flat3Map)v17).clone();
    Object v19 = ((org.apache.commons.collections.map.Flat3Map)v18).toString();
    Object v20 = 1;
    Object v21 = 11.897582F;
    Object v22 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v20).intValue()),(((java.lang.Float)v21).floatValue()));
    Object v23 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v22));
    Object v24 = ((org.apache.commons.collections.map.Flat3Map)v23).clone();
    Object v25 = ((org.apache.commons.collections.map.Flat3Map)v24).values();
    Object v26 = ((java.util.Map)v13).getOrDefault(((java.lang.Object)v19),((java.lang.Object)v25));
    Object v27 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v10),((java.lang.Object)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).mapIterator();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v5).keySet();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = 1;
    Object v7 = 11.897582F;
    Object v8 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = 1;
    Object v11 = 11.897582F;
    Object v12 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v12));
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).keySet();
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v9).containsKey(((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v5).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = 1;
    Object v8 = 11.897582F;
    Object v9 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v7).intValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).clone();
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v6).get(((java.lang.Object)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).values();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = 1;
    Object v8 = 11.897582F;
    Object v9 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v7).intValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).isEmpty();
    Object v12 = 1;
    Object v13 = 11.897582F;
    Object v14 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v12).intValue()),(((java.lang.Float)v13).floatValue()));
    Object v15 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v14));
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v15).clone();
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v16).mapIterator();
    Object v18 = ((org.apache.commons.collections.map.Flat3Map)v6).put(((java.lang.Object)v11),((java.lang.Object)v17));
    Object v19 = 1;
    Object v20 = 11.897582F;
    Object v21 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v19).intValue()),(((java.lang.Float)v20).floatValue()));
    Object v22 = ((org.apache.commons.collections.map.Flat3Map)v6).containsKey(((java.lang.Object)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).clone();
    Object v10 = 1;
    Object v11 = 11.897582F;
    Object v12 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v12));
    Object v14 = 1;
    Object v15 = 11.897582F;
    Object v16 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v14).intValue()),(((java.lang.Float)v15).floatValue()));
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v13).containsValue(((java.lang.Object)v16));
    Object v18 = ((java.util.Map)v2).replace(((java.lang.Object)v9),((java.lang.Object)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = 1;
    Object v8 = 11.897582F;
    Object v9 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v7).intValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = 1;
    Object v11 = 11.897582F;
    Object v12 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v12));
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).hashCode();
    Object v15 = java.util.function.Function.identity();
    Object v16 = ((java.util.Map)v9).computeIfAbsent(((java.lang.Object)v14),((java.util.function.Function)v15));
    Object v17 = 1;
    Object v18 = 11.897582F;
    Object v19 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v17).intValue()),(((java.lang.Float)v18).floatValue()));
    Object v20 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v19));
    Object v21 = ((org.apache.commons.collections.map.Flat3Map)v20).clone();
    Object v22 = ((org.apache.commons.collections.map.Flat3Map)v21).mapIterator();
    Object v23 = ((org.apache.commons.collections.map.Flat3Map)v6).put(((java.lang.Object)v16),((java.lang.Object)v22));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = 1;
    Object v8 = 11.897582F;
    Object v9 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v7).intValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).clone();
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).hashCode();
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v6).get(((java.lang.Object)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).toString();
    Object v8 = 1;
    Object v9 = 11.897582F;
    Object v10 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v10));
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).clone();
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).clone();
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).toString();
    Object v15 = 1;
    Object v16 = 11.897582F;
    Object v17 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v15).intValue()),(((java.lang.Float)v16).floatValue()));
    Object v18 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v17));
    Object v19 = ((org.apache.commons.collections.map.Flat3Map)v18).clone();
    Object v20 = ((org.apache.commons.collections.map.Flat3Map)v19).clone();
    Object v21 = 1;
    Object v22 = 11.897582F;
    Object v23 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v21).intValue()),(((java.lang.Float)v22).floatValue()));
    Object v24 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v23));
    Object v25 = ((org.apache.commons.collections.map.Flat3Map)v24).clone();
    Object v26 = ((org.apache.commons.collections.map.Flat3Map)v25).clone();
    Object v27 = ((org.apache.commons.collections.map.Flat3Map)v20).get(((java.lang.Object)v26));
    Object v28 = 1;
    Object v29 = 11.897582F;
    Object v30 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v28).intValue()),(((java.lang.Float)v29).floatValue()));
    Object v31 = ((org.apache.commons.collections.map.Flat3Map)v20).equals(((java.lang.Object)v30));
    Object v32 = ((java.util.Map)v2).replace(((java.lang.Object)v7),((java.lang.Object)v14),((java.lang.Object)v31));
    org.junit.Assert.assertEquals((Object)(false), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).hashCode();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    ((org.apache.commons.collections.map.Flat3Map)v5).clear();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = 1;
    Object v8 = 11.897582F;
    Object v9 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v7).intValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v6).get(((java.lang.Object)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).size();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = 1;
    Object v8 = 11.897582F;
    Object v9 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v7).intValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).clone();
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).clone();
    Object v14 = 1;
    Object v15 = 11.897582F;
    Object v16 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v14).intValue()),(((java.lang.Float)v15).floatValue()));
    Object v17 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v16));
    Object v18 = ((org.apache.commons.collections.map.Flat3Map)v17).isEmpty();
    Object v19 = 1;
    Object v20 = 11.897582F;
    Object v21 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v19).intValue()),(((java.lang.Float)v20).floatValue()));
    Object v22 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v21));
    Object v23 = ((org.apache.commons.collections.map.Flat3Map)v22).clone();
    Object v24 = ((org.apache.commons.collections.map.Flat3Map)v23).mapIterator();
    Object v25 = ((org.apache.commons.collections.map.Flat3Map)v13).put(((java.lang.Object)v18),((java.lang.Object)v24));
    Object v26 = 1;
    Object v27 = 11.897582F;
    Object v28 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v26).intValue()),(((java.lang.Float)v27).floatValue()));
    Object v29 = ((org.apache.commons.collections.map.Flat3Map)v13).containsKey(((java.lang.Object)v28));
    Object v30 = ((org.apache.commons.collections.map.Flat3Map)v6).get(((java.lang.Object)v29));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = 1;
    Object v7 = 11.897582F;
    Object v8 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).hashCode();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v5).containsKey(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).entrySet();
    Object v6 = 1;
    Object v7 = 11.897582F;
    Object v8 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).clone();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = 1;
    Object v13 = 11.897582F;
    Object v14 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v12).intValue()),(((java.lang.Float)v13).floatValue()));
    Object v15 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v14));
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v15).clone();
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v16).clone();
    Object v18 = ((org.apache.commons.collections.map.Flat3Map)v17).toString();
    Object v19 = ((org.apache.commons.collections.map.Flat3Map)v4).put(((java.lang.Object)v11),((java.lang.Object)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = 1;
    Object v8 = 11.897582F;
    Object v9 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v7).intValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).mapIterator();
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v6).containsKey(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).hashCode();
    Object v8 = 1;
    Object v9 = 11.897582F;
    Object v10 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = java.util.function.Function.identity();
    Object v12 = java.util.function.Function.identity();
    Object v13 = ((java.util.Map)v10).computeIfAbsent(((java.lang.Object)v11),((java.util.function.Function)v12));
    Object v14 = 1;
    Object v15 = 11.897582F;
    Object v16 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v14).intValue()),(((java.lang.Float)v15).floatValue()));
    Object v17 = java.util.function.Function.identity();
    Object v18 = java.util.function.Function.identity();
    Object v19 = ((java.util.Map)v16).computeIfAbsent(((java.lang.Object)v17),((java.util.function.Function)v18));
    Object v20 = ((java.util.function.Function)v13).compose(((java.util.function.Function)v19));
    Object v21 = ((java.util.Map)v2).computeIfAbsent(((java.lang.Object)v7),((java.util.function.Function)v13));
    org.junit.Assert.assertEquals((Object)(0), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = 1;
    Object v7 = 11.897582F;
    Object v8 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = 1;
    Object v10 = 11.897582F;
    Object v11 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v9).intValue()),(((java.lang.Float)v10).floatValue()));
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).clone();
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).clone();
    Object v15 = 1;
    Object v16 = 11.897582F;
    Object v17 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v15).intValue()),(((java.lang.Float)v16).floatValue()));
    Object v18 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v17));
    Object v19 = ((org.apache.commons.collections.map.Flat3Map)v18).hashCode();
    Object v20 = ((org.apache.commons.collections.map.Flat3Map)v14).containsKey(((java.lang.Object)v19));
    Object v21 = ((java.util.Map)v2).replace(((java.lang.Object)v5),((java.lang.Object)v8),((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).entrySet();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = 1;
    Object v6 = 11.897582F;
    Object v7 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = 1;
    Object v9 = 11.897582F;
    Object v10 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v10));
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).mapIterator();
    Object v13 = 1;
    Object v14 = 11.897582F;
    Object v15 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v13).intValue()),(((java.lang.Float)v14).floatValue()));
    Object v16 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v15));
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v16).clone();
    Object v18 = ((org.apache.commons.collections.map.Flat3Map)v17).clone();
    Object v19 = 1;
    Object v20 = 11.897582F;
    Object v21 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v19).intValue()),(((java.lang.Float)v20).floatValue()));
    Object v22 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v21));
    Object v23 = ((org.apache.commons.collections.map.Flat3Map)v22).clone();
    Object v24 = ((org.apache.commons.collections.map.Flat3Map)v23).clone();
    Object v25 = ((org.apache.commons.collections.map.Flat3Map)v18).get(((java.lang.Object)v24));
    Object v26 = 1;
    Object v27 = 11.897582F;
    Object v28 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v26).intValue()),(((java.lang.Float)v27).floatValue()));
    Object v29 = ((org.apache.commons.collections.map.Flat3Map)v18).equals(((java.lang.Object)v28));
    Object v30 = ((java.util.Map)v7).getOrDefault(((java.lang.Object)v12),((java.lang.Object)v29));
    Object v31 = ((org.apache.commons.collections.map.Flat3Map)v4).equals(((java.lang.Object)v30));
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = 1;
    Object v7 = 11.897582F;
    Object v8 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = 1;
    Object v10 = 11.897582F;
    Object v11 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v9).intValue()),(((java.lang.Float)v10).floatValue()));
    Object v12 = 1;
    Object v13 = 11.897582F;
    Object v14 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v12).intValue()),(((java.lang.Float)v13).floatValue()));
    Object v15 = java.util.function.Function.identity();
    Object v16 = ((java.util.Map)v11).computeIfAbsent(((java.lang.Object)v14),((java.util.function.Function)v15));
    Object v17 = ((java.util.Map)v5).remove(((java.lang.Object)v8),((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.collections.map.Flat3Map)v5).keySet();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = 1;
    Object v8 = 11.897582F;
    Object v9 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v7).intValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = 1;
    Object v11 = 11.897582F;
    Object v12 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v12));
    ((org.apache.commons.collections.map.Flat3Map)v13).clear();
    Object v14 = null;
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v13).isEmpty();
    Object v16 = ((java.util.Map)v9).get(((java.lang.Object)v15));
    ((org.apache.commons.collections.map.Flat3Map)v6).putAll(((java.util.Map)v9));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    ((org.apache.commons.collections.map.Flat3Map)v0).clear();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = ((org.apache.commons.collections.map.Flat3Map)v0).mapIterator();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).values();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = ((org.apache.commons.collections.map.Flat3Map)v0).clone();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v4).get(((java.lang.Object)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = ((org.apache.commons.collections.map.Flat3Map)v0).clone();
    Object v2 = 1;
    Object v3 = 11.897582F;
    Object v4 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v2).intValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = 1;
    Object v8 = 11.897582F;
    Object v9 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v7).intValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = 1;
    Object v11 = 11.897582F;
    Object v12 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v12));
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).hashCode();
    Object v15 = java.util.function.Function.identity();
    Object v16 = ((java.util.Map)v9).computeIfAbsent(((java.lang.Object)v14),((java.util.function.Function)v15));
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v6).containsKey(((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.collections.map.Flat3Map)v1).get(((java.lang.Object)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = ((java.util.Map)v2).values();
    Object v4 = 1;
    Object v5 = 11.897582F;
    Object v6 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v4).intValue()),(((java.lang.Float)v5).floatValue()));
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).clone();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).clone();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).values();
    Object v12 = 1;
    Object v13 = 11.897582F;
    Object v14 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v12).intValue()),(((java.lang.Float)v13).floatValue()));
    Object v15 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v14));
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v15).isEmpty();
    Object v17 = ((java.util.Map)v2).remove(((java.lang.Object)v11),((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = ((org.apache.commons.collections.map.Flat3Map)v0).clone();
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).mapIterator();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = ((org.apache.commons.collections.map.Flat3Map)v0).clone();
    Object v2 = 1;
    Object v3 = 11.897582F;
    Object v4 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v2).intValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).hashCode();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v8).hashCode();
    Object v11 = 1;
    Object v12 = 11.897582F;
    Object v13 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v11).intValue()),(((java.lang.Float)v12).floatValue()));
    Object v14 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v13));
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v14).clone();
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v15).clone();
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v16).entrySet();
    Object v18 = 1;
    Object v19 = 11.897582F;
    Object v20 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v18).intValue()),(((java.lang.Float)v19).floatValue()));
    Object v21 = ((java.util.Map)v1).replace(((java.lang.Object)v10),((java.lang.Object)v17),((java.lang.Object)v20));
    Object v22 = ((org.apache.commons.collections.map.Flat3Map)v1).values();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 11.897582F;
    Object v2 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1;
    Object v4 = 11.897582F;
    Object v5 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = 1;
    Object v7 = 11.897582F;
    Object v8 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).hashCode();
    Object v11 = java.util.function.Function.identity();
    Object v12 = ((java.util.Map)v5).computeIfAbsent(((java.lang.Object)v10),((java.util.function.Function)v11));
    Object v13 = null;
    Object v14 = ((java.util.Map)v2).compute(((java.lang.Object)v12),((java.util.function.BiFunction)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = 1;
    Object v2 = 11.897582F;
    Object v3 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).entrySet();
    Object v8 = 1;
    Object v9 = 11.897582F;
    Object v10 = new org.apache.commons.collections.FastHashMap((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = java.util.function.Function.identity();
    Object v12 = java.util.function.Function.identity();
    Object v13 = ((java.util.Map)v10).computeIfAbsent(((java.lang.Object)v11),((java.util.function.Function)v12));
    Object v14 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v7),((java.util.function.Function)v13));
    org.junit.Assert.assertNotNull(v14);
  }
}
