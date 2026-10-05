package org.apache.commons.collections.keyvalue;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.collections.FastTreeMap();
    Object v1 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.FastTreeMap();
    Object v3 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v2));
    Object v4 = org.apache.commons.collections.functors.ChainedTransformer.getInstance(((org.apache.commons.collections.Transformer)v1),((org.apache.commons.collections.Transformer)v3));
    Object v5 = new org.apache.commons.collections.FastTreeMap();
    Object v6 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v5));
    Object v7 = new org.apache.commons.collections.FastTreeMap();
    Object v8 = new org.apache.commons.collections.FastTreeMap();
    Object v9 = new org.apache.commons.collections.FastTreeMap();
    Object v10 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.FastTreeMap();
    Object v12 = ((org.apache.commons.collections.keyvalue.MultiKey)v10).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).size();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.collections.FastTreeMap();
    Object v1 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.FastTreeMap();
    Object v3 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v2));
    Object v4 = org.apache.commons.collections.functors.ChainedTransformer.getInstance(((org.apache.commons.collections.Transformer)v1),((org.apache.commons.collections.Transformer)v3));
    Object v5 = new java.lang.Object[]{};
    Object v6 = true;
    Object v7 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.collections.keyvalue.MultiKey)v7).size();
    Object v9 = new org.apache.commons.collections.FastTreeMap();
    Object v10 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v4),((java.lang.Object)v8),((java.lang.Object)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).toString();
    org.junit.Assert.assertEquals((Object)("MultiKey[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).toString();
    Object v4 = new java.lang.Object[]{};
    Object v5 = true;
    Object v6 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.collections.keyvalue.MultiKey)v6).toString();
    Object v8 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).size();
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = false;
    Object v6 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.lang.Object[]{};
    Object v8 = true;
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.collections.keyvalue.MultiKey)v9).toString();
    Object v11 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v3),((java.lang.Object)v6),((java.lang.Object)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).toString();
    Object v4 = new org.apache.commons.collections.FastTreeMap();
    Object v5 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.collections.FastTreeMap();
    Object v1 = new java.lang.Object[]{null,null,null};
    Object v2 = false;
    Object v3 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.collections.keyvalue.MultiKey)v3).toString();
    Object v5 = new org.apache.commons.collections.FastTreeMap();
    Object v6 = ((org.apache.commons.collections.keyvalue.MultiKey)v3).equals(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v0),((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).getKeys();
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = false;
    Object v6 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).size();
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = false;
    Object v6 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.lang.Object[]{};
    Object v8 = true;
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.collections.keyvalue.MultiKey)v9).toString();
    Object v11 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v3),((java.lang.Object)v6),((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.collections.keyvalue.MultiKey)v11).getKeys();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = false;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections.keyvalue.MultiKey)v5).hashCode();
    Object v7 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new org.apache.commons.collections.FastTreeMap();
    Object v4 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).size();
    org.junit.Assert.assertEquals((Object)(2), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = false;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections.keyvalue.MultiKey)v5).toString();
    Object v7 = new org.apache.commons.collections.FastTreeMap();
    Object v8 = ((org.apache.commons.collections.keyvalue.MultiKey)v5).equals(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.FastTreeMap();
    Object v10 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v9));
    Object v11 = new java.lang.Object[]{null,null,null};
    Object v12 = false;
    Object v13 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v8),((java.lang.Object)v10),((java.lang.Object)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new org.apache.commons.collections.FastTreeMap();
    Object v4 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.FastTreeMap();
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = true;
    Object v8 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.collections.keyvalue.MultiKey)v8).size();
    Object v10 = new java.lang.Object[]{};
    Object v11 = true;
    Object v12 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.apache.commons.collections.keyvalue.MultiKey)v12).getKeys();
    Object v14 = new java.lang.Object[]{null,null,null};
    Object v15 = false;
    Object v16 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((org.apache.commons.collections.keyvalue.MultiKey)v12).equals(((java.lang.Object)v16));
    Object v18 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v9),((java.lang.Object)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new java.lang.Object[]{};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -46;
    Object v4 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).getKey((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).toString();
    Object v4 = new org.apache.commons.collections.FastTreeMap();
    Object v5 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v4));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = false;
    Object v8 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.collections.keyvalue.MultiKey)v8).hashCode();
    Object v10 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v5),((java.lang.Object)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.collections.FastTreeMap();
    Object v1 = new org.apache.commons.collections.FastTreeMap();
    Object v2 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v1));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = false;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.lang.Object[]{};
    Object v7 = true;
    Object v8 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.collections.keyvalue.MultiKey)v8).toString();
    Object v10 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v0),((java.lang.Object)v2),((java.lang.Object)v5),((java.lang.Object)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = false;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections.keyvalue.MultiKey)v5).hashCode();
    Object v7 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.FastTreeMap();
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v7),((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = new java.lang.Object[]{null,null};
    Object v3 = true;
    Object v4 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.apache.commons.collections.keyvalue.MultiKey)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).getKeys();
    Object v4 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).getKeys();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).toString();
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = true;
    Object v6 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.collections.keyvalue.MultiKey)v6).getKeys();
    Object v8 = ((org.apache.commons.collections.keyvalue.MultiKey)v6).getKeys();
    Object v9 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = false;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.lang.Object[]{null};
    Object v7 = true;
    Object v8 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.lang.Object[]{null,null,null};
    Object v10 = false;
    Object v11 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.Object[]{null};
    Object v13 = true;
    Object v14 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v5),((java.lang.Object)v8),((java.lang.Object)v11),((java.lang.Object)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.collections.FastTreeMap();
    Object v1 = new java.lang.Object[]{null,null,null};
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v1));
    Object v3 = new java.lang.Object[]{null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.lang.Object[]{null,null,null};
    Object v7 = true;
    Object v8 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v5),((java.lang.Object)v8));
    Object v10 = new java.lang.Object[]{null,null};
    Object v11 = true;
    Object v12 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v0),((java.lang.Object)v2),((java.lang.Object)v9),((java.lang.Object)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = ((org.apache.commons.collections.keyvalue.MultiKey)v1).getKeys();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.collections.FastTreeMap();
    Object v1 = new java.lang.Object[]{null,null,null};
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v1));
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.FastTreeMap();
    Object v8 = new java.lang.Object[]{null,null,null};
    Object v9 = false;
    Object v10 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.apache.commons.collections.keyvalue.MultiKey)v10).toString();
    Object v12 = new org.apache.commons.collections.FastTreeMap();
    Object v13 = ((org.apache.commons.collections.keyvalue.MultiKey)v10).equals(((java.lang.Object)v12));
    Object v14 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v7),((java.lang.Object)v13));
    Object v15 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v0),((java.lang.Object)v6),((java.lang.Object)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections.keyvalue.MultiKey)v5).size();
    Object v7 = new java.lang.Object[]{};
    Object v8 = true;
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.collections.keyvalue.MultiKey)v9).toString();
    Object v11 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v6),((java.lang.Object)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.lang.Object[]{};
    Object v7 = true;
    Object v8 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.collections.keyvalue.MultiKey)v8).toString();
    Object v10 = new java.lang.Object[]{null};
    Object v11 = true;
    Object v12 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new org.apache.commons.collections.FastTreeMap();
    Object v14 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v5),((java.lang.Object)v9),((java.lang.Object)v12),((java.lang.Object)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.collections.FastTreeMap();
    Object v1 = new java.lang.Object[]{null,null,null};
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v1));
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.FastTreeMap();
    Object v8 = new java.lang.Object[]{null,null,null};
    Object v9 = false;
    Object v10 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.apache.commons.collections.keyvalue.MultiKey)v10).toString();
    Object v12 = new org.apache.commons.collections.FastTreeMap();
    Object v13 = ((org.apache.commons.collections.keyvalue.MultiKey)v10).equals(((java.lang.Object)v12));
    Object v14 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v7),((java.lang.Object)v13));
    Object v15 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v0),((java.lang.Object)v6),((java.lang.Object)v14));
    Object v16 = new java.lang.Object[]{null,null};
    Object v17 = true;
    Object v18 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new java.lang.Object[]{null,null};
    Object v20 = false;
    Object v21 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((org.apache.commons.collections.keyvalue.MultiKey)v21).hashCode();
    Object v23 = new org.apache.commons.collections.FastTreeMap();
    Object v24 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v23));
    Object v25 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v15),((java.lang.Object)v18),((java.lang.Object)v22),((java.lang.Object)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = false;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.lang.Object[]{null};
    Object v7 = true;
    Object v8 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.lang.Object[]{null,null,null};
    Object v10 = false;
    Object v11 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.Object[]{null};
    Object v13 = true;
    Object v14 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v5),((java.lang.Object)v8),((java.lang.Object)v11),((java.lang.Object)v14));
    Object v16 = 1;
    Object v17 = ((org.apache.commons.collections.keyvalue.MultiKey)v15).getKey((((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).toString();
    org.junit.Assert.assertEquals((Object)("MultiKey[null, null]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).toString();
    Object v4 = new java.lang.Object[]{};
    Object v5 = true;
    Object v6 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.lang.Object[]{};
    Object v8 = true;
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.collections.keyvalue.MultiKey)v6).equals(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).getKeys();
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = true;
    Object v6 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = false;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections.keyvalue.MultiKey)v5).hashCode();
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = true;
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.collections.keyvalue.MultiKey)v9).size();
    Object v11 = new org.apache.commons.collections.FastTreeMap();
    Object v12 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v11));
    Object v13 = new java.lang.Object[]{null,null};
    Object v14 = false;
    Object v15 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((org.apache.commons.collections.keyvalue.MultiKey)v15).toString();
    Object v17 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v6),((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = false;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections.keyvalue.MultiKey)v5).toString();
    Object v7 = new org.apache.commons.collections.FastTreeMap();
    Object v8 = ((org.apache.commons.collections.keyvalue.MultiKey)v5).equals(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v5));
    Object v7 = new java.lang.Object[]{null,null,null};
    Object v8 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v7));
    Object v9 = ((org.apache.commons.collections.keyvalue.MultiKey)v6).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections.keyvalue.MultiKey)v5).size();
    Object v7 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).toString();
    Object v4 = new org.apache.commons.collections.FastTreeMap();
    Object v5 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new org.apache.commons.collections.FastTreeMap();
    Object v4 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.lang.Object[]{};
    Object v7 = true;
    Object v8 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.lang.Object[]{};
    Object v10 = true;
    Object v11 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.apache.commons.collections.keyvalue.MultiKey)v11).toString();
    Object v13 = new java.lang.Object[]{null};
    Object v14 = true;
    Object v15 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new org.apache.commons.collections.FastTreeMap();
    Object v17 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v5),((java.lang.Object)v8),((java.lang.Object)v12),((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.lang.Object[]{};
    Object v7 = true;
    Object v8 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.collections.keyvalue.MultiKey)v8).toString();
    Object v10 = new java.lang.Object[]{null};
    Object v11 = true;
    Object v12 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new org.apache.commons.collections.FastTreeMap();
    Object v14 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v5),((java.lang.Object)v9),((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = new org.apache.commons.collections.FastTreeMap();
    Object v16 = ((org.apache.commons.collections.keyvalue.MultiKey)v14).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.collections.FastTreeMap();
    Object v1 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v0));
    Object v2 = new java.lang.Object[]{null,null};
    Object v3 = true;
    Object v4 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new java.lang.Object[]{};
    Object v6 = true;
    Object v7 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.collections.keyvalue.MultiKey)v7).toString();
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v1),((java.lang.Object)v4),((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.collections.FastTreeMap();
    Object v1 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v0));
    Object v2 = new java.lang.Object[]{null,null};
    Object v3 = true;
    Object v4 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new java.lang.Object[]{};
    Object v6 = true;
    Object v7 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.collections.keyvalue.MultiKey)v7).toString();
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v1),((java.lang.Object)v4),((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections.FastTreeMap();
    Object v11 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v10));
    Object v12 = ((org.apache.commons.collections.keyvalue.MultiKey)v9).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.lang.Object[]{null,null,null};
    Object v7 = true;
    Object v8 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v5),((java.lang.Object)v8));
    Object v10 = new java.lang.Object[]{null,null,null};
    Object v11 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v10));
    Object v12 = ((org.apache.commons.collections.keyvalue.MultiKey)v9).equals(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = new java.lang.Object[]{null,null};
    Object v3 = true;
    Object v4 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.apache.commons.collections.keyvalue.MultiKey)v1).equals(((java.lang.Object)v4));
    Object v6 = new java.lang.Object[]{null,null,null};
    Object v7 = true;
    Object v8 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v5),((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).getKeys();
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = true;
    Object v6 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.lang.Object[]{};
    Object v8 = true;
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.collections.keyvalue.MultiKey)v9).size();
    Object v11 = new java.lang.Object[]{};
    Object v12 = true;
    Object v13 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.collections.keyvalue.MultiKey)v13).toString();
    Object v15 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v6),((java.lang.Object)v10),((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3));
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = true;
    Object v7 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.collections.keyvalue.MultiKey)v4).equals(((java.lang.Object)v7));
    Object v9 = new java.lang.Object[]{null,null,null};
    Object v10 = true;
    Object v11 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v8),((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).size();
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = false;
    Object v6 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.lang.Object[]{};
    Object v8 = true;
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.collections.keyvalue.MultiKey)v9).toString();
    Object v11 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v3),((java.lang.Object)v6),((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.collections.keyvalue.MultiKey)v11).toString();
    Object v13 = new java.lang.Object[]{null,null};
    Object v14 = true;
    Object v15 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((org.apache.commons.collections.keyvalue.MultiKey)v11).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.collections.FastTreeMap();
    Object v1 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v0));
    Object v2 = new java.lang.Object[]{null,null};
    Object v3 = true;
    Object v4 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new java.lang.Object[]{};
    Object v6 = true;
    Object v7 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.collections.keyvalue.MultiKey)v7).toString();
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v1),((java.lang.Object)v4),((java.lang.Object)v8));
    Object v10 = new java.lang.Object[]{null};
    Object v11 = true;
    Object v12 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new java.lang.Object[]{null,null};
    Object v14 = false;
    Object v15 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((org.apache.commons.collections.keyvalue.MultiKey)v15).hashCode();
    Object v17 = new java.lang.Object[]{null,null,null};
    Object v18 = false;
    Object v19 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((org.apache.commons.collections.keyvalue.MultiKey)v19).toString();
    Object v21 = new org.apache.commons.collections.FastTreeMap();
    Object v22 = ((org.apache.commons.collections.keyvalue.MultiKey)v19).equals(((java.lang.Object)v21));
    Object v23 = new java.lang.Object[]{null};
    Object v24 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v23));
    Object v25 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v9),((java.lang.Object)v12),((java.lang.Object)v16),((java.lang.Object)v22),((java.lang.Object)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).getKeys();
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = false;
    Object v6 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = ((org.apache.commons.collections.keyvalue.MultiKey)v1).toString();
    org.junit.Assert.assertEquals((Object)("MultiKey[null, null, null]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -24;
    Object v4 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).getKey((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).toString();
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = true;
    Object v6 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = false;
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.collections.keyvalue.MultiKey)v9).hashCode();
    Object v11 = ((org.apache.commons.collections.keyvalue.MultiKey)v6).equals(((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).toString();
    Object v4 = new java.lang.Object[]{null};
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v4));
    Object v6 = new java.lang.Object[]{null};
    Object v7 = true;
    Object v8 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).toString();
    Object v4 = new java.lang.Object[]{null};
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v4));
    Object v6 = new java.lang.Object[]{null};
    Object v7 = true;
    Object v8 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v8));
    Object v10 = new java.lang.Object[]{null,null};
    Object v11 = true;
    Object v12 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.apache.commons.collections.keyvalue.MultiKey)v9).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new org.apache.commons.collections.FastTreeMap();
    Object v4 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v3));
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = true;
    Object v7 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.lang.Object[]{};
    Object v9 = true;
    Object v10 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.apache.commons.collections.keyvalue.MultiKey)v10).toString();
    Object v12 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v4),((java.lang.Object)v7),((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).toString();
    Object v4 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null};
    Object v4 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = new java.lang.Object[]{null};
    Object v3 = false;
    Object v4 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.apache.commons.collections.keyvalue.MultiKey)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).toString();
    Object v4 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).size();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{};
    Object v4 = false;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections.keyvalue.MultiKey)v5).toString();
    Object v7 = ((org.apache.commons.collections.keyvalue.MultiKey)v5).hashCode();
    Object v8 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.lang.Object[]{null,null,null};
    Object v7 = false;
    Object v8 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.lang.Object[]{null};
    Object v10 = true;
    Object v11 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.Object[]{null,null,null};
    Object v13 = false;
    Object v14 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new java.lang.Object[]{null};
    Object v16 = true;
    Object v17 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v5),((java.lang.Object)v8),((java.lang.Object)v11),((java.lang.Object)v14),((java.lang.Object)v17));
    Object v19 = 1;
    Object v20 = ((org.apache.commons.collections.keyvalue.MultiKey)v18).getKey((((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.collections.FastTreeMap();
    Object v1 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v0));
    Object v2 = new java.lang.Object[]{null};
    Object v3 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v2));
    Object v4 = new java.lang.Object[]{null};
    Object v5 = false;
    Object v6 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.collections.keyvalue.MultiKey)v3).equals(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v1),((java.lang.Object)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = false;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.collections.FastTreeMap();
    Object v7 = ((org.apache.commons.collections.keyvalue.MultiKey)v5).equals(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).toString();
    Object v4 = new java.lang.Object[]{};
    Object v5 = true;
    Object v6 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.lang.Object[]{null,null,null};
    Object v8 = false;
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.collections.keyvalue.MultiKey)v9).toString();
    Object v11 = new org.apache.commons.collections.FastTreeMap();
    Object v12 = ((org.apache.commons.collections.keyvalue.MultiKey)v9).equals(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.collections.keyvalue.MultiKey)v6).equals(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null};
    Object v4 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.collections.FastTreeMap();
    Object v1 = new java.lang.Object[]{null,null,null};
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v1));
    Object v3 = new java.lang.Object[]{null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.lang.Object[]{null,null,null};
    Object v7 = true;
    Object v8 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v5),((java.lang.Object)v8));
    Object v10 = new java.lang.Object[]{null,null};
    Object v11 = true;
    Object v12 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v0),((java.lang.Object)v2),((java.lang.Object)v9),((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.collections.keyvalue.MultiKey)v13).getKeys();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).hashCode();
    Object v4 = new java.lang.Object[]{null};
    Object v5 = true;
    Object v6 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new org.apache.commons.collections.FastTreeMap();
    Object v8 = new java.lang.Object[]{null,null,null};
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v8));
    Object v10 = new java.lang.Object[]{null};
    Object v11 = true;
    Object v12 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new java.lang.Object[]{null,null,null};
    Object v14 = true;
    Object v15 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v12),((java.lang.Object)v15));
    Object v17 = new java.lang.Object[]{null,null};
    Object v18 = true;
    Object v19 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v7),((java.lang.Object)v9),((java.lang.Object)v16),((java.lang.Object)v19));
    Object v21 = ((org.apache.commons.collections.keyvalue.MultiKey)v20).getKeys();
    Object v22 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v3),((java.lang.Object)v6),((java.lang.Object)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{};
    Object v4 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new org.apache.commons.collections.FastTreeMap();
    Object v4 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{};
    Object v4 = false;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections.keyvalue.MultiKey)v5).toString();
    Object v7 = ((org.apache.commons.collections.keyvalue.MultiKey)v5).hashCode();
    Object v8 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).size();
    Object v4 = new java.lang.Object[]{null};
    Object v5 = true;
    Object v6 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.lang.Object[]{null};
    Object v8 = true;
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new java.lang.Object[]{null,null,null};
    Object v11 = false;
    Object v12 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new java.lang.Object[]{null};
    Object v14 = true;
    Object v15 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new java.lang.Object[]{null,null,null};
    Object v17 = false;
    Object v18 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new java.lang.Object[]{null};
    Object v20 = true;
    Object v21 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v9),((java.lang.Object)v12),((java.lang.Object)v15),((java.lang.Object)v18),((java.lang.Object)v21));
    Object v23 = 1;
    Object v24 = ((org.apache.commons.collections.keyvalue.MultiKey)v22).getKey((((java.lang.Integer)v23).intValue()));
    Object v25 = ((org.apache.commons.collections.keyvalue.MultiKey)v6).equals(((java.lang.Object)v24));
    Object v26 = new java.lang.Object[]{null};
    Object v27 = false;
    Object v28 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new java.lang.Object[]{null,null,null};
    Object v30 = false;
    Object v31 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new org.apache.commons.collections.FastTreeMap();
    Object v33 = ((org.apache.commons.collections.keyvalue.MultiKey)v31).equals(((java.lang.Object)v32));
    Object v34 = ((org.apache.commons.collections.keyvalue.MultiKey)v28).equals(((java.lang.Object)v33));
    Object v35 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v3),((java.lang.Object)v25),((java.lang.Object)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = new java.lang.Object[]{null,null,null};
    Object v3 = true;
    Object v4 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.apache.commons.collections.keyvalue.MultiKey)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{};
    Object v4 = false;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections.keyvalue.MultiKey)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = ((org.apache.commons.collections.keyvalue.MultiKey)v1).getKeys();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.collections.FastTreeMap();
    Object v1 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v0));
    Object v2 = new java.lang.Object[]{null};
    Object v3 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v2));
    Object v4 = new java.lang.Object[]{null};
    Object v5 = false;
    Object v6 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.collections.keyvalue.MultiKey)v3).equals(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v1),((java.lang.Object)v7));
    Object v9 = new java.lang.Object[]{};
    Object v10 = false;
    Object v11 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.Object[]{null};
    Object v13 = false;
    Object v14 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new java.lang.Object[]{null,null,null};
    Object v16 = false;
    Object v17 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new org.apache.commons.collections.FastTreeMap();
    Object v19 = ((org.apache.commons.collections.keyvalue.MultiKey)v17).equals(((java.lang.Object)v18));
    Object v20 = ((org.apache.commons.collections.keyvalue.MultiKey)v14).equals(((java.lang.Object)v19));
    Object v21 = new java.lang.Object[]{null};
    Object v22 = false;
    Object v23 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.Object[]{};
    Object v25 = false;
    Object v26 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((org.apache.commons.collections.keyvalue.MultiKey)v26).toString();
    Object v28 = ((org.apache.commons.collections.keyvalue.MultiKey)v26).hashCode();
    Object v29 = ((org.apache.commons.collections.keyvalue.MultiKey)v23).equals(((java.lang.Object)v28));
    Object v30 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v8),((java.lang.Object)v11),((java.lang.Object)v20),((java.lang.Object)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = new org.apache.commons.collections.FastTreeMap();
    Object v3 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v2));
    Object v4 = new org.apache.commons.collections.FastTreeMap();
    Object v5 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v4));
    Object v6 = org.apache.commons.collections.functors.ChainedTransformer.getInstance(((org.apache.commons.collections.Transformer)v3),((org.apache.commons.collections.Transformer)v5));
    Object v7 = ((org.apache.commons.collections.keyvalue.MultiKey)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.lang.Object[]{};
    Object v7 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v6));
    Object v8 = ((org.apache.commons.collections.keyvalue.MultiKey)v5).equals(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections.keyvalue.MultiKey)v5).size();
    Object v7 = new java.lang.Object[]{};
    Object v8 = true;
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.collections.keyvalue.MultiKey)v9).toString();
    Object v11 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v6),((java.lang.Object)v10));
    Object v12 = new java.lang.Object[]{null,null,null};
    Object v13 = false;
    Object v14 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new java.lang.Object[]{null,null,null};
    Object v16 = false;
    Object v17 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((org.apache.commons.collections.keyvalue.MultiKey)v17).toString();
    Object v19 = new org.apache.commons.collections.FastTreeMap();
    Object v20 = ((org.apache.commons.collections.keyvalue.MultiKey)v17).equals(((java.lang.Object)v19));
    Object v21 = new org.apache.commons.collections.FastTreeMap();
    Object v22 = org.apache.commons.collections.TransformerUtils.mapTransformer(((java.util.Map)v21));
    Object v23 = new java.lang.Object[]{null,null,null};
    Object v24 = false;
    Object v25 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v14),((java.lang.Object)v20),((java.lang.Object)v22),((java.lang.Object)v25));
    Object v27 = ((org.apache.commons.collections.keyvalue.MultiKey)v11).equals(((java.lang.Object)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = new java.lang.Object[]{null};
    Object v3 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v2));
    Object v4 = ((org.apache.commons.collections.keyvalue.MultiKey)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections.keyvalue.MultiKey)v5).size();
    Object v7 = new java.lang.Object[]{};
    Object v8 = true;
    Object v9 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.collections.keyvalue.MultiKey)v9).toString();
    Object v11 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v6),((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.collections.keyvalue.MultiKey)v11).getKeys();
    Object v13 = new java.lang.Object[]{null};
    Object v14 = true;
    Object v15 = new org.apache.commons.collections.keyvalue.MultiKey(((java.lang.Object[])v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((org.apache.commons.collections.keyvalue.MultiKey)v11).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }
}
