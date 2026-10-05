package org.apache.commons.collections4.keyvalue;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "setValue() can only be called after next() and before r8move()";
    Object v1 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v0));
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v3));
    Object v5 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v6 = "setValue() can only be called after next() and before r8move()";
    Object v7 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v6));
    Object v8 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.collections4.keyvalue.MultiKey)v8).toString();
    Object v10 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v11 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v10));
    Object v12 = ((org.apache.commons.collections4.keyvalue.MultiKey)v8).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v0));
    Object v2 = "setValue() can only be called after next() and before r8move()";
    Object v3 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v2));
    Object v4 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v1),((java.lang.Object)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v3));
    Object v5 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = 10;
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).getKey((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new java.lang.Object[]{null};
    Object v2 = true;
    Object v3 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = true;
    Object v6 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.collections4.keyvalue.MultiKey)v3).equals(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v9 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v8));
    Object v10 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v11 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v0),((java.lang.Object)v7),((java.lang.Object)v9),((java.lang.Object)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = "setValue() can only be called after next() and before r8move()";
    Object v3 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).readResolve();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "setValue() can only be called after next() and before r8move()";
    Object v1 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v0));
    Object v2 = "setValue() can only be called after next() and before r8move()";
    Object v3 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v2));
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v4));
    Object v6 = "setValue() can only be called after next() and before r8move()";
    Object v7 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v6));
    Object v8 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v1),((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections4.keyvalue.MultiKey)v4).readResolve();
    Object v6 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v0));
    Object v2 = "setValue() can only be called after next() and before r8move()";
    Object v3 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v2));
    Object v4 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v1),((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v6 = ((org.apache.commons.collections4.keyvalue.MultiKey)v4).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v6));
    Object v8 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v5),((java.lang.Object)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v6));
    Object v8 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v5),((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v10 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v9));
    Object v11 = ((org.apache.commons.collections4.keyvalue.MultiKey)v8).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).size();
    org.junit.Assert.assertEquals((Object)(2), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).toString();
    org.junit.Assert.assertEquals((Object)("MultiKey[null, null]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "setValue() can only be called after next() and before r8move()";
    Object v1 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v0));
    Object v2 = new java.lang.Object[]{null,null,null};
    Object v3 = false;
    Object v4 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "setValue() can only be called after next() and before r8move()";
    Object v6 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v5));
    Object v7 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v1),((java.lang.Object)v4),((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).readResolve();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v3));
    Object v5 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).readResolve();
    Object v3 = new java.lang.Object[]{null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v7 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v6));
    Object v8 = ((org.apache.commons.collections4.keyvalue.MultiKey)v5).equals(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new java.lang.Object[]{null};
    Object v2 = true;
    Object v3 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = true;
    Object v6 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.collections4.keyvalue.MultiKey)v3).equals(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v9 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v8));
    Object v10 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v11 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v0),((java.lang.Object)v7),((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = 24;
    Object v13 = ((org.apache.commons.collections4.keyvalue.MultiKey)v11).getKey((((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).getKeys();
    Object v4 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).getKeys();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v3 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v2));
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = false;
    Object v6 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v1),((java.lang.Object)v3),((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "setValue() can only be called after next() and before r8move()";
    Object v1 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v0));
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v3));
    Object v5 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v6 = "setValue() can only be called after next() and before r8move()";
    Object v7 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v6));
    Object v8 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v7));
    Object v9 = new java.lang.Object[]{null,null,null};
    Object v10 = true;
    Object v11 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.apache.commons.collections4.keyvalue.MultiKey)v8).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new java.lang.Object[]{null};
    Object v2 = true;
    Object v3 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = true;
    Object v6 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.collections4.keyvalue.MultiKey)v3).equals(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v9 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v8));
    Object v10 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v11 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v0),((java.lang.Object)v7),((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = new java.lang.Object[]{null};
    Object v13 = true;
    Object v14 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v16 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v15));
    Object v17 = ((org.apache.commons.collections4.keyvalue.MultiKey)v14).equals(((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.collections4.keyvalue.MultiKey)v11).equals(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections4.keyvalue.MultiKey)v5).hashCode();
    Object v7 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.lang.Object[]{null,null,null};
    Object v7 = true;
    Object v8 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.lang.Object[]{null};
    Object v10 = false;
    Object v11 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v13 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v12));
    Object v14 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v5),((java.lang.Object)v8),((java.lang.Object)v11),((java.lang.Object)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections4.keyvalue.MultiKey)v5).hashCode();
    Object v7 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v6));
    Object v8 = new java.lang.Object[]{null,null};
    Object v9 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v8));
    Object v10 = ((org.apache.commons.collections4.keyvalue.MultiKey)v9).readResolve();
    Object v11 = new java.lang.Object[]{null,null};
    Object v12 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v11));
    Object v13 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v7),((java.lang.Object)v10),((java.lang.Object)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).readResolve();
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).toString();
    org.junit.Assert.assertEquals((Object)("MultiKey[null, null]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).readResolve();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).size();
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).toString();
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v4));
    Object v6 = "setValue() can only be called after next() and before r8move()";
    Object v7 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.collections4.keyvalue.MultiKey)v5).equals(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).readResolve();
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).getKeys();
    Object v4 = new java.lang.Object[]{null};
    Object v5 = false;
    Object v6 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.collections4.keyvalue.MultiKey)v6).readResolve();
    Object v8 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v3 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v2));
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = false;
    Object v6 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v1),((java.lang.Object)v3),((java.lang.Object)v6));
    Object v8 = new java.lang.Object[]{null,null};
    Object v9 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v8));
    Object v10 = ((org.apache.commons.collections4.keyvalue.MultiKey)v9).readResolve();
    Object v11 = new java.lang.Object[]{null,null,null};
    Object v12 = false;
    Object v13 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "setValue() can only be called after next() and before r8move()";
    Object v15 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v14));
    Object v16 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v7),((java.lang.Object)v10),((java.lang.Object)v13),((java.lang.Object)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).getKeys();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).readResolve();
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3));
    Object v5 = "setValue() can only be called after next() and before r8move()";
    Object v6 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.collections4.keyvalue.MultiKey)v4).equals(((java.lang.Object)v6));
    Object v8 = new java.lang.Object[]{null};
    Object v9 = true;
    Object v10 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.apache.commons.collections4.keyvalue.MultiKey)v10).size();
    Object v12 = new java.lang.Object[]{null,null,null};
    Object v13 = false;
    Object v14 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v7),((java.lang.Object)v11),((java.lang.Object)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).getKeys();
    Object v4 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).getKeys();
    Object v5 = new java.lang.Object[]{null,null,null};
    Object v6 = false;
    Object v7 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v4),((java.lang.Object)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).toString();
    Object v4 = "setValue() can only be called after next() and before r8move()";
    Object v5 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = "setValue() can only be called after next() and before r8move()";
    Object v3 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "setValue() can only be called after next() and before r8move()";
    Object v1 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v0));
    Object v2 = new java.lang.Object[]{null,null,null};
    Object v3 = true;
    Object v4 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v5));
    Object v7 = ((org.apache.commons.collections4.keyvalue.MultiKey)v6).readResolve();
    Object v8 = ((org.apache.commons.collections4.keyvalue.MultiKey)v4).equals(((java.lang.Object)v7));
    Object v9 = new java.lang.Object[]{null};
    Object v10 = true;
    Object v11 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v13 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v12));
    Object v14 = ((org.apache.commons.collections4.keyvalue.MultiKey)v11).equals(((java.lang.Object)v13));
    Object v15 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v1),((java.lang.Object)v8),((java.lang.Object)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).getKeys();
    Object v4 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).getKeys();
    Object v5 = new java.lang.Object[]{null,null,null};
    Object v6 = false;
    Object v7 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v4),((java.lang.Object)v7));
    Object v9 = "setValue() can only be called after next() and before r8move()";
    Object v10 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v9));
    Object v11 = ((org.apache.commons.collections4.keyvalue.MultiKey)v8).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).getKeys();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).toString();
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = true;
    Object v6 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).getKeys();
    Object v4 = new java.lang.Object[]{null};
    Object v5 = true;
    Object v6 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v8 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v7));
    Object v9 = ((org.apache.commons.collections4.keyvalue.MultiKey)v6).equals(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{};
    Object v4 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections4.keyvalue.MultiKey)v5).hashCode();
    Object v7 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v6));
    Object v8 = new java.lang.Object[]{null,null};
    Object v9 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v8));
    Object v10 = ((org.apache.commons.collections4.keyvalue.MultiKey)v9).readResolve();
    Object v11 = new java.lang.Object[]{null,null};
    Object v12 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v11));
    Object v13 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v7),((java.lang.Object)v10),((java.lang.Object)v12));
    Object v14 = new java.lang.Object[]{null};
    Object v15 = true;
    Object v16 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((org.apache.commons.collections4.keyvalue.MultiKey)v16).size();
    Object v18 = ((org.apache.commons.collections4.keyvalue.MultiKey)v13).equals(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "setValue() can only be called after next() and before r8move()";
    Object v4 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = new java.lang.Object[]{null};
    Object v3 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v2));
    Object v4 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).getKeys();
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v4));
    Object v6 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).toString();
    org.junit.Assert.assertEquals((Object)("MultiKey[null, null, null]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).getKeys();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).readResolve();
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v4));
    Object v6 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v7 = ((org.apache.commons.collections4.keyvalue.MultiKey)v5).equals(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections4.keyvalue.MultiKey)v3).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).readResolve();
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = false;
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = new java.lang.Object[]{null,null,null};
    Object v3 = false;
    Object v4 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.apache.commons.collections4.keyvalue.MultiKey)v4).getKeys();
    Object v6 = ((org.apache.commons.collections4.keyvalue.MultiKey)v4).getKeys();
    Object v7 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).readResolve();
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections4.keyvalue.MultiKey)v4).readResolve();
    Object v6 = ((org.apache.commons.collections4.keyvalue.MultiKey)v5).getKeys();
    Object v7 = new java.lang.Object[]{null};
    Object v8 = false;
    Object v9 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.collections4.keyvalue.MultiKey)v9).readResolve();
    Object v11 = ((org.apache.commons.collections4.keyvalue.MultiKey)v5).equals(((java.lang.Object)v10));
    Object v12 = "setValue() can only be called after next() and before r8move()";
    Object v13 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v12));
    Object v14 = new java.lang.Object[]{null,null};
    Object v15 = false;
    Object v16 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new java.lang.Object[]{null,null,null};
    Object v18 = false;
    Object v19 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((org.apache.commons.collections4.keyvalue.MultiKey)v19).getKeys();
    Object v21 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v11),((java.lang.Object)v13),((java.lang.Object)v16),((java.lang.Object)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = new java.lang.Object[]{null,null,null};
    Object v3 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v2));
    Object v4 = ((org.apache.commons.collections4.keyvalue.MultiKey)v3).getKeys();
    Object v5 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null};
    Object v4 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = false;
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections4.keyvalue.MultiKey)v5).getKeys();
    Object v7 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).toString();
    Object v4 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).size();
    org.junit.Assert.assertEquals((Object)(2), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = new java.lang.Object[]{null,null};
    Object v3 = true;
    Object v4 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new java.lang.Object[]{null,null,null};
    Object v6 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v5));
    Object v7 = ((org.apache.commons.collections4.keyvalue.MultiKey)v4).equals(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).readResolve();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 0;
    Object v4 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).getKey((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{};
    Object v4 = false;
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.lang.Object[]{null,null,null};
    Object v7 = false;
    Object v8 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.collections4.keyvalue.MultiKey)v8).getKeys();
    Object v10 = "setValue() can only be called after next() and before r8move()";
    Object v11 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v10));
    Object v12 = new java.lang.Object[]{};
    Object v13 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v12));
    Object v14 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v5),((java.lang.Object)v9),((java.lang.Object)v11),((java.lang.Object)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).toString();
    org.junit.Assert.assertEquals((Object)("MultiKey[null, null, null]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).toString();
    Object v4 = new java.lang.Object[]{null};
    Object v5 = true;
    Object v6 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.collections4.keyvalue.MultiKey)v6).size();
    Object v8 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).hashCode();
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v4));
    Object v6 = ((org.apache.commons.collections4.keyvalue.MultiKey)v5).readResolve();
    Object v7 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v3),((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).readResolve();
    Object v4 = ((org.apache.commons.collections4.keyvalue.MultiKey)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = false;
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections4.keyvalue.MultiKey)v5).getKeys();
    Object v7 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v6));
    Object v8 = new java.lang.Object[]{null,null,null};
    Object v9 = true;
    Object v10 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.apache.commons.collections4.keyvalue.MultiKey)v10).hashCode();
    Object v12 = new java.lang.Object[]{null};
    Object v13 = false;
    Object v14 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((org.apache.commons.collections4.keyvalue.MultiKey)v14).readResolve();
    Object v16 = ((org.apache.commons.collections4.keyvalue.MultiKey)v15).hashCode();
    Object v17 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v7),((java.lang.Object)v11),((java.lang.Object)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).getKeys();
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.lang.Object[]{null};
    Object v7 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v6));
    Object v8 = ((org.apache.commons.collections4.keyvalue.MultiKey)v5).equals(((java.lang.Object)v7));
    Object v9 = new java.lang.Object[]{null};
    Object v10 = true;
    Object v11 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.Object[]{null,null,null};
    Object v13 = true;
    Object v14 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((org.apache.commons.collections4.keyvalue.MultiKey)v11).equals(((java.lang.Object)v14));
    Object v16 = new java.lang.Object[]{null,null,null};
    Object v17 = true;
    Object v18 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new java.lang.Object[]{null};
    Object v20 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v19));
    Object v21 = ((org.apache.commons.collections4.keyvalue.MultiKey)v18).equals(((java.lang.Object)v20));
    Object v22 = "setValue() can only be called after next() and before r8move()";
    Object v23 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v22));
    Object v24 = new java.lang.Object[]{null,null,null};
    Object v25 = true;
    Object v26 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new java.lang.Object[]{null,null};
    Object v28 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v27));
    Object v29 = ((org.apache.commons.collections4.keyvalue.MultiKey)v28).readResolve();
    Object v30 = ((org.apache.commons.collections4.keyvalue.MultiKey)v26).equals(((java.lang.Object)v29));
    Object v31 = new java.lang.Object[]{null};
    Object v32 = true;
    Object v33 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v35 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v34));
    Object v36 = ((org.apache.commons.collections4.keyvalue.MultiKey)v33).equals(((java.lang.Object)v35));
    Object v37 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v23),((java.lang.Object)v30),((java.lang.Object)v36));
    Object v38 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v8),((java.lang.Object)v15),((java.lang.Object)v21),((java.lang.Object)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).getKeys();
    Object v4 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).getKeys();
    Object v5 = "setValue() can only be called after next() and before r8move()";
    Object v6 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v5));
    Object v7 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v4),((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).readResolve();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = 0;
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).getKey((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v6));
    Object v8 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v5),((java.lang.Object)v7));
    Object v9 = new java.lang.Object[]{};
    Object v10 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v9));
    Object v11 = ((org.apache.commons.collections4.keyvalue.MultiKey)v8).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v3 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v2));
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = false;
    Object v6 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v1),((java.lang.Object)v3),((java.lang.Object)v6));
    Object v8 = new java.lang.Object[]{null,null,null};
    Object v9 = false;
    Object v10 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new java.lang.Object[]{};
    Object v12 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v11));
    Object v13 = new java.lang.Object[]{null,null,null};
    Object v14 = true;
    Object v15 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((org.apache.commons.collections4.keyvalue.MultiKey)v15).hashCode();
    Object v17 = new java.lang.Object[]{null,null};
    Object v18 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v17));
    Object v19 = ((org.apache.commons.collections4.keyvalue.MultiKey)v18).readResolve();
    Object v20 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v16),((java.lang.Object)v19));
    Object v21 = new java.lang.Object[]{null,null};
    Object v22 = false;
    Object v23 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((org.apache.commons.collections4.keyvalue.MultiKey)v23).toString();
    Object v25 = ((org.apache.commons.collections4.keyvalue.MultiKey)v23).size();
    Object v26 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v7),((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v20),((java.lang.Object)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "setValue() can only be called after next() and before r8move()";
    Object v1 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v0));
    Object v2 = new java.lang.Object[]{null,null,null};
    Object v3 = true;
    Object v4 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v5));
    Object v7 = ((org.apache.commons.collections4.keyvalue.MultiKey)v6).readResolve();
    Object v8 = ((org.apache.commons.collections4.keyvalue.MultiKey)v4).equals(((java.lang.Object)v7));
    Object v9 = new java.lang.Object[]{null};
    Object v10 = true;
    Object v11 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v13 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v12));
    Object v14 = ((org.apache.commons.collections4.keyvalue.MultiKey)v11).equals(((java.lang.Object)v13));
    Object v15 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v1),((java.lang.Object)v8),((java.lang.Object)v14));
    Object v16 = new java.lang.Object[]{null};
    Object v17 = true;
    Object v18 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v20 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v19));
    Object v21 = ((org.apache.commons.collections4.keyvalue.MultiKey)v18).equals(((java.lang.Object)v20));
    Object v22 = ((org.apache.commons.collections4.keyvalue.MultiKey)v15).equals(((java.lang.Object)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).readResolve();
    Object v4 = ((org.apache.commons.collections4.keyvalue.MultiKey)v3).toString();
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = true;
    Object v7 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.collections4.keyvalue.MultiKey)v3).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 1;
    Object v4 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).getKey((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0));
    Object v2 = "setValue() can only be called after next() and before r8move()";
    Object v3 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.collections4.keyvalue.MultiKey)v1).equals(((java.lang.Object)v3));
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = false;
    Object v7 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.collections4.keyvalue.MultiKey)v7).toString();
    Object v9 = ((org.apache.commons.collections4.keyvalue.MultiKey)v7).size();
    Object v10 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v4),((java.lang.Object)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).readResolve();
    Object v4 = new java.lang.Object[]{null};
    Object v5 = true;
    Object v6 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.lang.Object[]{null,null,null};
    Object v8 = true;
    Object v9 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new java.lang.Object[]{null,null};
    Object v11 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v10));
    Object v12 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v6),((java.lang.Object)v9),((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.collections4.keyvalue.MultiKey)v3).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = true;
    Object v5 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections4.keyvalue.MultiKey)v5).toString();
    Object v7 = "setValue() can only be called after next() and before r8move()";
    Object v8 = org.apache.commons.collections4.TransformerUtils.invokerTransformer(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.collections4.keyvalue.MultiKey)v5).equals(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).readResolve();
    Object v4 = ((org.apache.commons.collections4.keyvalue.MultiKey)v3).getKeys();
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v5));
    Object v7 = ((org.apache.commons.collections4.keyvalue.MultiKey)v6).readResolve();
    Object v8 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v9 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v8));
    Object v10 = ((org.apache.commons.collections4.keyvalue.MultiKey)v7).equals(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.collections4.keyvalue.MultiKey)v3).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).size();
    org.junit.Assert.assertEquals((Object)(2), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).readResolve();
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v4));
    Object v6 = ((org.apache.commons.collections4.keyvalue.MultiKey)v3).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = true;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections4.keyvalue.MultiKey)v4).readResolve();
    Object v6 = ((org.apache.commons.collections4.keyvalue.MultiKey)v5).toString();
    Object v7 = new java.lang.Object[]{};
    Object v8 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v7));
    Object v9 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v2),((java.lang.Object)v6),((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).readResolve();
    Object v4 = ((org.apache.commons.collections4.keyvalue.MultiKey)v3).readResolve();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).readResolve();
    Object v4 = ((org.apache.commons.collections4.keyvalue.MultiKey)v3).getKeys();
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v5));
    Object v7 = ((org.apache.commons.collections4.keyvalue.MultiKey)v6).readResolve();
    Object v8 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v9 = org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(((java.util.SortedMap)v8));
    Object v10 = ((org.apache.commons.collections4.keyvalue.MultiKey)v7).equals(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.collections4.keyvalue.MultiKey)v3).equals(((java.lang.Object)v10));
    Object v12 = new java.lang.Object[]{null,null};
    Object v13 = false;
    Object v14 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((org.apache.commons.collections4.keyvalue.MultiKey)v14).size();
    Object v16 = new java.lang.Object[]{null,null};
    Object v17 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v16));
    Object v18 = ((org.apache.commons.collections4.keyvalue.MultiKey)v17).readResolve();
    Object v19 = new java.lang.Object[]{null,null};
    Object v20 = false;
    Object v21 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((org.apache.commons.collections4.keyvalue.MultiKey)v18).equals(((java.lang.Object)v21));
    Object v23 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object)v11),((java.lang.Object)v15),((java.lang.Object)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = false;
    Object v2 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.lang.Object[]{null};
    Object v4 = new org.apache.commons.collections4.keyvalue.MultiKey(((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections4.keyvalue.MultiKey)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }
}
