package org.apache.commons.collections4.trie;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v6),((java.lang.Object[])v7));
    Object v9 = 0;
    Object v10 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v5),((java.lang.Object)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).nextEntry(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v6),((java.lang.Object[])v7));
    Object v9 = 0;
    Object v10 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v5),((java.lang.Object)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = -23;
    Object v12 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).getNearestEntryForKey(((java.lang.Object)v10),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v6),((java.lang.Object[])v7));
    Object v9 = 0;
    Object v10 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v5),((java.lang.Object)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = 38;
    Object v12 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).addEntry(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v10),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).entrySet();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections4.trie.AbstractBitwiseTrie)v1).toString();
    org.junit.Assert.assertEquals((Object)("Trie[0]={\n}\n"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    ((java.util.AbstractMap)v1).putAll(((java.util.Map)v2));
    Object v3 = null;
    Object v4 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).firstEntry();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v6),((java.lang.Object[])v7));
    Object v9 = 0;
    Object v10 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v5),((java.lang.Object)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).getEntry(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).select(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = ((java.util.Map)v0).remove(((java.lang.Object)v1),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).firstKey();
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((java.util.AbstractMap)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v6),((java.lang.Object[])v7));
    Object v9 = 0;
    Object v10 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v5),((java.lang.Object)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = new java.lang.Class[]{null,null};
    Object v12 = new java.lang.Object[]{null,null};
    Object v13 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v11),((java.lang.Object[])v12));
    Object v14 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v13));
    Object v15 = new java.lang.Class[]{null,null};
    Object v16 = new java.lang.Object[]{null,null};
    Object v17 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v15),((java.lang.Object[])v16));
    Object v18 = 0;
    Object v19 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v14),((java.lang.Object)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).nextEntryInSubtree(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v10),((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = ((java.util.AbstractMap)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).keySet();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).lastKey();
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    ((java.util.AbstractMap)v1).putAll(((java.util.Map)v2));
    Object v3 = null;
    Object v4 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v5 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).getEntry(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((java.util.AbstractMap)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v1));
    Object v3 = new java.lang.Class[]{null,null};
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v3),((java.lang.Object[])v4));
    Object v6 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v5));
    Object v7 = new java.lang.Class[]{null,null};
    Object v8 = new java.lang.Object[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v7),((java.lang.Object[])v8));
    Object v10 = 0;
    Object v11 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v6),((java.lang.Object)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = -23;
    Object v13 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v2).getNearestEntryForKey(((java.lang.Object)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v15 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v14));
    Object v16 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v15).keySet();
    Object v17 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v13),((java.lang.Object)v16));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections4.trie.AbstractBitwiseTrie)v1).toString();
    Object v3 = new java.lang.Class[]{null,null};
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v3),((java.lang.Object[])v4));
    Object v6 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v5));
    Object v7 = new java.lang.Class[]{null,null};
    Object v8 = new java.lang.Object[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v7),((java.lang.Object[])v8));
    Object v10 = 0;
    Object v11 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v6),((java.lang.Object)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 19;
    Object v13 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).addEntry(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v11),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = null;
    ((java.util.Map)v0).forEach(((java.util.function.BiConsumer)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).previousKey(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = new java.lang.Object[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v0),((java.lang.Object[])v1));
    Object v3 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v2));
    Object v4 = new java.lang.Class[]{null,null};
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v4),((java.lang.Object[])v5));
    Object v7 = 0;
    Object v8 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v3),((java.lang.Object)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new java.lang.Class[]{null,null};
    Object v10 = new java.lang.Object[]{null,null};
    Object v11 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v9),((java.lang.Object[])v10));
    Object v12 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v11));
    Object v13 = new java.lang.Class[]{null,null};
    Object v14 = new java.lang.Object[]{null,null};
    Object v15 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v13),((java.lang.Object[])v14));
    Object v16 = 0;
    Object v17 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v12),((java.lang.Object)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = org.apache.commons.collections4.trie.AbstractPatriciaTrie.isValidUplink(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v8),((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).comparator();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).values();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v6),((java.lang.Object[])v7));
    Object v9 = 0;
    Object v10 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v5),((java.lang.Object)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).removeEntry(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).higherEntry(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).selectKey(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).remove(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).lowerEntry(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((java.util.AbstractMap)v1).hashCode();
    Object v3 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v4 = -8;
    Object v5 = 0;
    Object v6 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).subtree(((java.lang.Object)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    ((java.util.AbstractMap)v1).putAll(((java.util.Map)v2));
    Object v3 = null;
    Object v4 = new java.lang.Class[]{null,null};
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v4),((java.lang.Object[])v5));
    Object v7 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).tailMap(((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).floorEntry(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).firstEntry();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v1),((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((java.util.AbstractMap)v1).size();
    Object v3 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    ((java.util.AbstractMap)v4).putAll(((java.util.Map)v5));
    Object v6 = null;
    Object v7 = new java.lang.Class[]{null,null};
    Object v8 = new java.lang.Object[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v7),((java.lang.Object[])v8));
    Object v10 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v4).tailMap(((java.lang.Object)v9));
    Object v11 = ((java.util.Map)v10).values();
    ((java.util.AbstractMap)v1).putAll(((java.util.Map)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).higherEntry(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v6),((java.lang.Object[])v7));
    Object v9 = 0;
    Object v10 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v5),((java.lang.Object)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).floorEntry(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).floorEntry(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    ((java.util.AbstractMap)v1).putAll(((java.util.Map)v2));
    Object v3 = null;
    Object v4 = new java.lang.Class[]{null,null};
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v4),((java.lang.Object[])v5));
    Object v7 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).tailMap(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v9 = ((java.util.AbstractMap)v7).equals(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v3).entrySet();
    Object v5 = ((java.util.AbstractMap)v1).containsValue(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).keySet();
    Object v3 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).mapIterator();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v6 = ((java.util.Map)v0).replace(((java.lang.Object)v1),((java.lang.Object)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).clear();
    Object v2 = null;
    Object v3 = new java.lang.Class[]{null,null};
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v3),((java.lang.Object[])v4));
    Object v6 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).get(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    ((java.util.AbstractMap)v1).putAll(((java.util.Map)v2));
    Object v3 = null;
    Object v4 = new java.lang.Class[]{null,null};
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v4),((java.lang.Object[])v5));
    Object v7 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).tailMap(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v9 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v8));
    Object v10 = new java.lang.Class[]{null,null};
    Object v11 = new java.lang.Object[]{null,null};
    Object v12 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v10),((java.lang.Object[])v11));
    Object v13 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v12));
    Object v14 = new java.lang.Class[]{null,null};
    Object v15 = new java.lang.Object[]{null,null};
    Object v16 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v14),((java.lang.Object[])v15));
    Object v17 = 0;
    Object v18 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v13),((java.lang.Object)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = -23;
    Object v20 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v9).getNearestEntryForKey(((java.lang.Object)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((java.util.AbstractMap)v7).equals(((java.lang.Object)v20));
    Object v22 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v23 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v22));
    Object v24 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v23).comparator();
    Object v25 = ((java.util.AbstractMap)v7).containsValue(((java.lang.Object)v24));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).ceilingEntry(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v6),((java.lang.Object[])v7));
    Object v9 = 0;
    Object v10 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v5),((java.lang.Object)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).addEntry(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v10),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections4.trie.AbstractBitwiseTrie)v3).toString();
    Object v5 = new java.lang.Class[]{null,null};
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v5),((java.lang.Object[])v6));
    Object v8 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v4),((java.lang.Object)v7));
    Object v9 = new java.lang.Class[]{null,null};
    Object v10 = new java.lang.Object[]{null,null};
    Object v11 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v9),((java.lang.Object[])v10));
    Object v12 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v11));
    Object v13 = new java.lang.Class[]{null,null};
    Object v14 = new java.lang.Object[]{null,null};
    Object v15 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v13),((java.lang.Object[])v14));
    Object v16 = 0;
    Object v17 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v12),((java.lang.Object)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).followRight(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = 0;
    Object v4 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).getNearestEntryForKey(((java.lang.Object)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v6),((java.lang.Object[])v7));
    Object v9 = 0;
    Object v10 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v5),((java.lang.Object)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).lowerEntry(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v6),((java.lang.Object[])v7));
    Object v9 = 0;
    Object v10 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v5),((java.lang.Object)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).followRight(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v2));
    Object v4 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v3).getNearestEntryForKey(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).selectValue(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = ((java.util.Map)v0).hashCode();
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v2));
    Object v4 = ((java.util.AbstractMap)v3).isEmpty();
    Object v5 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v6 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v5));
    Object v7 = ((java.util.AbstractMap)v6).isEmpty();
    Object v8 = ((java.util.Map)v0).putIfAbsent(((java.lang.Object)v4),((java.lang.Object)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    ((java.util.AbstractMap)v1).putAll(((java.util.Map)v2));
    Object v3 = null;
    Object v4 = new java.lang.Class[]{null,null};
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v4),((java.lang.Object[])v5));
    Object v7 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).tailMap(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v9 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v10 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v9));
    Object v11 = ((java.util.AbstractMap)v10).isEmpty();
    Object v12 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v13 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v12));
    Object v14 = ((java.util.Map)v8).remove(((java.lang.Object)v11),((java.lang.Object)v13));
    ((java.util.AbstractMap)v7).putAll(((java.util.Map)v8));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((java.util.AbstractMap)v1).hashCode();
    Object v3 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v6 = 0;
    Object v7 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v4).getNearestEntryForKey(((java.lang.Object)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).previousEntry(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections4.trie.AbstractBitwiseTrie)v3).toString();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v1).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    Object v7 = new java.lang.Class[]{null,null};
    Object v8 = new java.lang.Object[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v7),((java.lang.Object[])v8));
    Object v10 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v9));
    Object v11 = new java.lang.Class[]{null,null};
    Object v12 = new java.lang.Object[]{null,null};
    Object v13 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v11),((java.lang.Object[])v12));
    Object v14 = 0;
    Object v15 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v10),((java.lang.Object)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).previousEntry(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    ((java.util.AbstractMap)v1).putAll(((java.util.Map)v2));
    Object v3 = null;
    Object v4 = new java.lang.Class[]{null,null};
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v4),((java.lang.Object[])v5));
    Object v7 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).tailMap(((java.lang.Object)v6));
    Object v8 = ((java.util.AbstractMap)v7).hashCode();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v3).values();
    Object v5 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).selectKey(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = ((java.util.Map)v0).values();
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).nextKey(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = new java.lang.Class[]{null,null};
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v3),((java.lang.Object[])v4));
    Object v6 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v5));
    Object v7 = new java.lang.Class[]{null,null};
    Object v8 = new java.lang.Object[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v7),((java.lang.Object[])v8));
    Object v10 = 0;
    Object v11 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v6),((java.lang.Object)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.lang.Class[]{null,null};
    Object v13 = new java.lang.Object[]{null,null};
    Object v14 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v12),((java.lang.Object[])v13));
    Object v15 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v14));
    Object v16 = new java.lang.Class[]{null,null};
    Object v17 = new java.lang.Object[]{null,null};
    Object v18 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v16),((java.lang.Object[])v17));
    Object v19 = 0;
    Object v20 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v15),((java.lang.Object)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = org.apache.commons.collections4.trie.AbstractPatriciaTrie.isValidUplink(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v11),((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v20));
    Object v22 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).put(((java.lang.Object)v2),((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v6),((java.lang.Object[])v7));
    Object v9 = 0;
    Object v10 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v5),((java.lang.Object)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).followLeft(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).ceilingEntry(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v2));
    Object v4 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v3).getNearestEntryForKey(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).floorEntry(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = ((java.util.Map)v0).values();
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = new java.lang.Class[]{null,null};
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v3),((java.lang.Object[])v4));
    Object v6 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v5));
    Object v7 = ((java.util.Map)v0).remove(((java.lang.Object)v2),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((java.util.AbstractMap)v1).hashCode();
    Object v3 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).firstEntry();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).getEntry(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = ((java.util.Map)v0).isEmpty();
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = java.util.function.Function.identity();
    Object v7 = ((java.util.Map)v0).replace(((java.lang.Object)v5),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).tailMap(((java.lang.Object)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v2));
    Object v4 = new java.lang.Class[]{null,null};
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v4),((java.lang.Object[])v5));
    Object v7 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v3).tailMap(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).containsKey(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).tailMap(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v7 = ((java.util.AbstractMap)v5).equals(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v6),((java.lang.Object[])v7));
    Object v9 = 0;
    Object v10 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v5),((java.lang.Object)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).select(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).values();
    Object v3 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).lastEntry();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).nextKey(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).tailMap(((java.lang.Object)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v6),((java.lang.Object[])v7));
    Object v9 = new java.lang.Class[]{null,null};
    Object v10 = new java.lang.Object[]{null,null};
    Object v11 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v9),((java.lang.Object[])v10));
    Object v12 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v11));
    Object v13 = new java.lang.Class[]{null,null};
    Object v14 = new java.lang.Object[]{null,null};
    Object v15 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v13),((java.lang.Object[])v14));
    Object v16 = 0;
    Object v17 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v12),((java.lang.Object)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((java.util.Map)v5).replace(((java.lang.Object)v8),((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new java.lang.Class[]{null,null};
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v5),((java.lang.Object[])v6));
    Object v8 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v7));
    Object v9 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).put(((java.lang.Object)v4),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v2));
    Object v4 = new java.lang.Class[]{null,null};
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v4),((java.lang.Object[])v5));
    Object v7 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v6));
    Object v8 = new java.lang.Class[]{null,null};
    Object v9 = new java.lang.Object[]{null,null};
    Object v10 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v8),((java.lang.Object[])v9));
    Object v11 = 0;
    Object v12 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v7),((java.lang.Object)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = -23;
    Object v14 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v3).getNearestEntryForKey(((java.lang.Object)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).get(((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).tailMap(((java.lang.Object)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v6),((java.lang.Object[])v7));
    Object v9 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v8));
    Object v10 = new java.lang.Class[]{null,null};
    Object v11 = new java.lang.Object[]{null,null};
    Object v12 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v10),((java.lang.Object[])v11));
    Object v13 = 0;
    Object v14 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v9),((java.lang.Object)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = new java.lang.Class[]{null,null};
    Object v16 = new java.lang.Object[]{null,null};
    Object v17 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v15),((java.lang.Object[])v16));
    Object v18 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v17));
    Object v19 = new java.lang.Class[]{null,null};
    Object v20 = new java.lang.Object[]{null,null};
    Object v21 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v19),((java.lang.Object[])v20));
    Object v22 = 0;
    Object v23 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v18),((java.lang.Object)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = org.apache.commons.collections4.trie.AbstractPatriciaTrie.isValidUplink(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v14),((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v23));
    Object v25 = new java.lang.Class[]{null,null};
    Object v26 = new java.lang.Object[]{null,null};
    Object v27 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v25),((java.lang.Object[])v26));
    Object v28 = ((java.util.Map)v5).putIfAbsent(((java.lang.Object)v24),((java.lang.Object)v27));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v2));
    Object v4 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v3).getNearestEntryForKey(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new java.lang.Class[]{null,null};
    Object v8 = new java.lang.Object[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v7),((java.lang.Object[])v8));
    Object v10 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v9));
    Object v11 = ((org.apache.commons.collections4.trie.AbstractBitwiseTrie.BasicEntry)v6).setValue(((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).followRight(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v6));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).tailMap(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v7 = new java.lang.Class[]{null,null};
    Object v8 = new java.lang.Object[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v7),((java.lang.Object[])v8));
    Object v10 = ((java.util.Map)v5).remove(((java.lang.Object)v6),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v6),((java.lang.Object[])v7));
    Object v9 = 0;
    Object v10 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v5),((java.lang.Object)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = new java.lang.Class[]{null,null};
    Object v12 = new java.lang.Object[]{null,null};
    Object v13 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v11),((java.lang.Object[])v12));
    Object v14 = ((org.apache.commons.collections4.trie.AbstractBitwiseTrie.BasicEntry)v10).setValue(((java.lang.Object)v13));
    Object v15 = new java.lang.Class[]{null,null};
    Object v16 = new java.lang.Object[]{null,null};
    Object v17 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v15),((java.lang.Object[])v16));
    Object v18 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v17));
    Object v19 = new java.lang.Class[]{null,null};
    Object v20 = new java.lang.Object[]{null,null};
    Object v21 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v19),((java.lang.Object[])v20));
    Object v22 = 0;
    Object v23 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v18),((java.lang.Object)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v25 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v24));
    Object v26 = new java.lang.Class[]{null,null};
    Object v27 = new java.lang.Object[]{null,null};
    Object v28 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v26),((java.lang.Object[])v27));
    Object v29 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v28));
    Object v30 = new java.lang.Class[]{null,null};
    Object v31 = new java.lang.Object[]{null,null};
    Object v32 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v30),((java.lang.Object[])v31));
    Object v33 = 0;
    Object v34 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v29),((java.lang.Object)v32),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v25).followLeft(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v34));
    Object v36 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v35).toString();
    Object v37 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).nextEntryImpl(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v10),((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v23),((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v35));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v2));
    Object v4 = new java.lang.Class[]{null,null};
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v4),((java.lang.Object[])v5));
    Object v7 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v3).tailMap(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).previousKey(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v6),((java.lang.Object[])v7));
    Object v9 = 0;
    Object v10 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v5),((java.lang.Object)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = new java.lang.Class[]{null,null};
    Object v12 = new java.lang.Object[]{null,null};
    Object v13 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v11),((java.lang.Object[])v12));
    Object v14 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v13));
    Object v15 = new java.lang.Class[]{null,null};
    Object v16 = new java.lang.Object[]{null,null};
    Object v17 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v15),((java.lang.Object[])v16));
    Object v18 = 0;
    Object v19 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v14),((java.lang.Object)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = new java.lang.Class[]{null,null};
    Object v21 = new java.lang.Object[]{null,null};
    Object v22 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v20),((java.lang.Object[])v21));
    Object v23 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v22));
    Object v24 = new java.lang.Class[]{null,null};
    Object v25 = new java.lang.Object[]{null,null};
    Object v26 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v24),((java.lang.Object[])v25));
    Object v27 = 0;
    Object v28 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v23),((java.lang.Object)v26),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).nextEntryImpl(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v10),((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v19),((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v3).entrySet();
    Object v5 = ((java.util.SortedMap)v1).headMap(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.collections4.trie.AbstractBitwiseTrie)v1).toString();
    org.junit.Assert.assertEquals((Object)("Trie[0]={\n}\n"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).comparator();
    Object v3 = new java.lang.Class[]{null,null};
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v3),((java.lang.Object[])v4));
    Object v6 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v5));
    Object v7 = new java.lang.Class[]{null,null};
    Object v8 = new java.lang.Object[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v7),((java.lang.Object[])v8));
    Object v10 = 0;
    Object v11 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v6),((java.lang.Object)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = -27;
    Object v14 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).subtree(((java.lang.Object)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections4.trie.AbstractBitwiseTrie)v1).toString();
    Object v3 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v4).keySet();
    Object v6 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v4).mapIterator();
    Object v7 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).selectKey(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).tailMap(((java.lang.Object)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v6),((java.lang.Object[])v7));
    Object v9 = ((java.util.AbstractMap)v5).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).ceilingEntry(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new java.lang.Class[]{null,null};
    Object v2 = new java.lang.Object[]{null,null};
    Object v3 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v1),((java.lang.Object[])v2));
    Object v4 = new java.lang.Class[]{null,null};
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v4),((java.lang.Object[])v5));
    Object v7 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v6));
    Object v8 = ((java.util.Map)v0).putIfAbsent(((java.lang.Object)v3),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = ((java.util.AbstractMap)v1).isEmpty();
    Object v3 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).firstKey();
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = 0;
    Object v7 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).getNearestEntryForKey(((java.lang.Object)v5),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v2));
    Object v4 = new java.lang.Class[]{null,null};
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v4),((java.lang.Object[])v5));
    Object v7 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v6));
    Object v8 = new java.lang.Class[]{null,null};
    Object v9 = new java.lang.Object[]{null,null};
    Object v10 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v8),((java.lang.Object[])v9));
    Object v11 = 0;
    Object v12 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v7),((java.lang.Object)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v3).followLeft(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v12));
    Object v14 = 0;
    Object v15 = 0;
    Object v16 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).subtree(((java.lang.Object)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = 1;
    Object v6 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).getNearestEntryForKey(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new java.lang.Class[]{null,null};
    Object v2 = new java.lang.Object[]{null,null};
    Object v3 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v1),((java.lang.Object[])v2));
    Object v4 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v3));
    Object v5 = ((java.util.Map)v0).remove(((java.lang.Object)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v6),((java.lang.Object[])v7));
    Object v9 = java.util.function.Function.identity();
    Object v10 = new java.lang.Class[]{null,null};
    Object v11 = new java.lang.Object[]{null,null};
    Object v12 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v10),((java.lang.Object[])v11));
    Object v13 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v12));
    Object v14 = new java.lang.Class[]{null,null};
    Object v15 = new java.lang.Object[]{null,null};
    Object v16 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v14),((java.lang.Object[])v15));
    Object v17 = 0;
    Object v18 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v13),((java.lang.Object)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((java.util.Map)v0).replace(((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v18));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).tailMap(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v7 = ((java.util.Map)v6).keySet();
    ((java.util.AbstractMap)v5).putAll(((java.util.Map)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v3).comparator();
    Object v5 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).lowerEntry(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.collections4.functors.TransformerPredicate(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v6),((java.lang.Object[])v7));
    Object v9 = 0;
    Object v10 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry(((java.lang.Object)v5),((java.lang.Object)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).previousKey(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v2));
    Object v4 = new java.lang.Class[]{null,null};
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v4),((java.lang.Object[])v5));
    Object v7 = 1;
    Object v8 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v3).getNearestEntryForKey(((java.lang.Object)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).removeEntry(((org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.bidimap.TreeBidiMap();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie(((java.util.Map)v0));
    Object v2 = new java.lang.Class[]{null,null};
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.InstantiateTransformer(((java.lang.Class[])v2),((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.collections4.trie.AbstractPatriciaTrie)v1).tailMap(((java.lang.Object)v4));
    Object v6 = ((java.util.AbstractMap)v5).isEmpty();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }
}
