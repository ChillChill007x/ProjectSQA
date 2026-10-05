package org.apache.commons.collections4.trie;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v3 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v1).get(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = null;
    ((java.util.Map)v0).forEach(((java.util.function.BiConsumer)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v3 = ((java.util.Map)v0).replace(((java.lang.Object)v1),((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v2 = java.util.function.Function.identity();
    Object v3 = java.util.function.Function.identity();
    Object v4 = ((java.util.function.Function)v2).apply(((java.lang.Object)v3));
    Object v5 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = ((java.util.Map)v2).hashCode();
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = null;
    Object v6 = ((java.util.Map)v2).compute(((java.lang.Object)v4),((java.util.function.BiFunction)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    ((org.apache.commons.collections4.trie.UnmodifiableTrie)v1).clear();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v6 = ((java.util.Map)v2).replace(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).putAll(((java.util.Map)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v3 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v6 = ((java.util.Map)v1).putIfAbsent(((java.lang.Object)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = java.util.function.Function.identity();
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v7 = ((java.util.Map)v2).replace(((java.lang.Object)v3),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).get(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = ((java.util.Map)v0).remove(((java.lang.Object)v2),((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.function.Function.identity();
    Object v5 = ((java.util.function.Function)v3).andThen(((java.util.function.Function)v4));
    Object v6 = ((java.util.Map)v1).computeIfAbsent(((java.lang.Object)v2),((java.util.function.Function)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).size();
    Object v4 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).comparator();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).entrySet();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = ((java.util.Map)v2).keySet();
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v7 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v6).entrySet();
    Object v8 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v9 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v8));
    Object v10 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v11 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v10));
    Object v12 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v11));
    Object v13 = ((java.util.Map)v2).replace(((java.lang.Object)v7),((java.lang.Object)v9),((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v1).values();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = java.util.function.Function.identity();
    Object v4 = ((java.util.Map)v0).putIfAbsent(((java.lang.Object)v2),((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v1).entrySet();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v5).values();
    Object v7 = ((java.util.Map)v2).remove(((java.lang.Object)v3),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v2),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v1).keySet();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v1).toString();
    org.junit.Assert.assertEquals((Object)("Trie[0]={\n}\n"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v5).size();
    Object v7 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v5).comparator();
    Object v8 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).get(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).hashCode();
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v7 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v6).isEmpty();
    Object v8 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).get(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v3 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v1),((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = ((java.util.Map)v1).size();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v7 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v6).entrySet();
    Object v8 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v9 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v8));
    Object v10 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v9));
    Object v11 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v10).entrySet();
    Object v12 = ((java.util.Map)v1).replace(((java.lang.Object)v3),((java.lang.Object)v7),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v1).comparator();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).keySet();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).entrySet();
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = ((org.apache.commons.collections4.Get)v4).keySet();
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v7 = ((java.util.Map)v0).putIfAbsent(((java.lang.Object)v3),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).clear();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = ((org.apache.commons.collections4.Get)v4).keySet();
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.Map)v3).computeIfAbsent(((java.lang.Object)v6),((java.util.function.Function)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v7 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v6).isEmpty();
    Object v8 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v3).nextKey(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v2 = ((org.apache.commons.collections4.Get)v1).keySet();
    Object v3 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v4 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v3).keySet();
    Object v5 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v7 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v6).keySet();
    Object v8 = ((java.util.Map)v0).remove(((java.lang.Object)v4),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = ((java.util.SortedMap)v2).headMap(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v1).lastKey();
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).firstKey();
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = ((java.util.Map)v1).hashCode();
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v4).values();
    Object v6 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v7 = ((org.apache.commons.collections4.Get)v6).keySet();
    Object v8 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v9 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v8).keySet();
    Object v10 = ((java.util.Map)v1).replace(((java.lang.Object)v5),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v5).entrySet();
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.Map)v3).computeIfAbsent(((java.lang.Object)v6),((java.util.function.Function)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).values();
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v7 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).get(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v4).entrySet();
    Object v6 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).tailMap(((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v4).keySet();
    Object v6 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v7 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v8 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v7));
    Object v9 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v8));
    Object v10 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v9));
    Object v11 = ((java.util.Map)v2).remove(((java.lang.Object)v5),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v7 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v8 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v7));
    Object v9 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v8));
    Object v10 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v9));
    Object v11 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v10));
    Object v12 = ((java.util.Map)v2).putIfAbsent(((java.lang.Object)v6),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = ((java.util.SortedMap)v2).headMap(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v6 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v7 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v8 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v7));
    Object v9 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v8));
    Object v10 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v9));
    Object v11 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v12 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v11));
    Object v13 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v12).values();
    Object v14 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v10),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v7 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v8 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v7).entrySet();
    Object v9 = ((java.util.Map)v2).putIfAbsent(((java.lang.Object)v5),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).comparator();
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v5).comparator();
    Object v7 = ((java.util.Map)v0).remove(((java.lang.Object)v3),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v4).entrySet();
    Object v6 = java.util.function.Function.identity();
    Object v7 = ((java.util.Map)v2).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    ((java.util.Map)v0).clear();
    Object v1 = null;
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v3 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v6 = ((java.util.Map)v0).replace(((java.lang.Object)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v2 = ((org.apache.commons.collections4.Get)v1).keySet();
    Object v3 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v4 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v3).keySet();
    Object v5 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v7 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v6).toString();
    Object v8 = ((java.util.Map)v0).putIfAbsent(((java.lang.Object)v4),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v7 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v8 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v7));
    Object v9 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v8));
    Object v10 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v9).isEmpty();
    Object v11 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v4).put(((java.lang.Object)v6),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v3 = ((org.apache.commons.collections4.Get)v2).keySet();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v5 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v1).containsKey(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v7 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v8 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v7).entrySet();
    Object v9 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v5).tailMap(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v11 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v10));
    Object v12 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v11).comparator();
    Object v13 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v14 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v13));
    Object v15 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v14));
    Object v16 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v15));
    Object v17 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v16));
    Object v18 = ((java.util.Map)v2).replace(((java.lang.Object)v9),((java.lang.Object)v12),((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = ((java.util.Map)v2).hashCode();
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = ((org.apache.commons.collections4.Get)v4).keySet();
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v7 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v6).keySet();
    Object v8 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v9 = ((java.util.Map)v2).replace(((java.lang.Object)v7),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v6 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v7 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v8 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v7).comparator();
    Object v9 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v10 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v9));
    Object v11 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v10).comparator();
    Object v12 = ((java.util.Map)v4).replace(((java.lang.Object)v5),((java.lang.Object)v8),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v7 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v8 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v7));
    Object v9 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v10 = ((org.apache.commons.collections4.Get)v9).keySet();
    Object v11 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v9));
    Object v12 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v11).keySet();
    Object v13 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v14 = ((java.util.Map)v3).replace(((java.lang.Object)v8),((java.lang.Object)v12),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v7 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).containsKey(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v4).hashCode();
    Object v6 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v7 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v8 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v7).entrySet();
    Object v9 = ((java.util.Map)v2).replace(((java.lang.Object)v5),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).comparator();
    Object v4 = java.util.function.Function.identity();
    Object v5 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v3),((java.util.function.Function)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v5).size();
    Object v7 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v5).comparator();
    Object v8 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v9 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v8));
    Object v10 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v9));
    Object v11 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v10));
    Object v12 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v11));
    Object v13 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v14 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v13));
    Object v15 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v14));
    Object v16 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v15).isEmpty();
    Object v17 = ((java.util.Map)v2).replace(((java.lang.Object)v7),((java.lang.Object)v12),((java.lang.Object)v16));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).keySet();
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v7 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v8 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v7));
    Object v9 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v6).equals(((java.lang.Object)v8));
    Object v10 = ((java.util.Map)v0).putIfAbsent(((java.lang.Object)v3),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v3).isEmpty();
    Object v5 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v6 = ((org.apache.commons.collections4.Get)v5).keySet();
    Object v7 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v8 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v7).keySet();
    Object v9 = ((java.util.Map)v0).putIfAbsent(((java.lang.Object)v4),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v7 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v8 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v7).entrySet();
    Object v9 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v5).tailMap(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v11 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v10));
    Object v12 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v11));
    Object v13 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v12));
    Object v14 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v13));
    Object v15 = ((java.util.Map)v2).remove(((java.lang.Object)v9),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = ((java.util.SortedMap)v2).headMap(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v6 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v5).size();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v6 = ((org.apache.commons.collections4.Get)v5).keySet();
    Object v7 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v8 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v9 = ((java.util.SortedMap)v7).headMap(((java.lang.Object)v8));
    Object v10 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v7));
    Object v11 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v4).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v7 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v8 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v9 = ((org.apache.commons.collections4.Get)v8).keySet();
    Object v10 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v8));
    Object v11 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v12 = ((java.util.SortedMap)v10).headMap(((java.lang.Object)v11));
    Object v13 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v10));
    Object v14 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v7).equals(((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).nextKey(((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = ((java.util.SortedMap)v2).headMap(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v6 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v7 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v5).prefixMap(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).size();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v7 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v8 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).containsValue(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).mapIterator();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = ((org.apache.commons.collections4.Get)v4).keySet();
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v7 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v8 = ((java.util.SortedMap)v6).headMap(((java.lang.Object)v7));
    Object v9 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v10 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v9).size();
    Object v11 = java.util.function.Function.identity();
    Object v12 = ((java.util.Map)v3).remove(((java.lang.Object)v10),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v7 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v8 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v5).equals(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v10 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).put(((java.lang.Object)v8),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v3 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v1).tailMap(((java.lang.Object)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v7 = ((java.util.SortedMap)v2).headMap(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((java.util.Map)v0).size();
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v3 = ((org.apache.commons.collections4.Get)v2).keySet();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v5 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v7 = ((org.apache.commons.collections4.Get)v6).keySet();
    Object v8 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v9 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v5),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v2 = ((org.apache.commons.collections4.Get)v1).keySet();
    Object v3 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = ((org.apache.commons.collections4.Get)v4).keySet();
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v7 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v8 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v3 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v1).tailMap(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v7 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v8 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v7));
    Object v9 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v8));
    Object v10 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v11 = ((java.util.Map)v5).putIfAbsent(((java.lang.Object)v9),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v3).lastKey();
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = ((java.util.SortedMap)v2).headMap(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v6 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v5).comparator();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v2 = ((org.apache.commons.collections4.Get)v1).keySet();
    Object v3 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    ((java.util.Map)v0).putAll(((java.util.Map)v3));
    Object v4 = null;
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v4).entrySet();
    Object v6 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).tailMap(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v8 = ((org.apache.commons.collections4.Get)v7).keySet();
    Object v9 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v7));
    Object v10 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v11 = ((java.util.SortedMap)v9).headMap(((java.lang.Object)v10));
    Object v12 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v9));
    Object v13 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v12).comparator();
    Object v14 = ((java.util.Map)v6).equals(((java.lang.Object)v13));
    Object v15 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v16 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v15));
    Object v17 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v16));
    Object v18 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v19 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v18));
    Object v20 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v19).entrySet();
    Object v21 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v17).tailMap(((java.lang.Object)v20));
    Object v22 = null;
    Object v23 = ((java.util.Map)v6).compute(((java.lang.Object)v21),((java.util.function.BiFunction)v22));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v3 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v1).tailMap(((java.lang.Object)v4));
    Object v6 = java.util.function.Function.identity();
    Object v7 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v8 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v7));
    Object v9 = ((java.util.Map)v5).remove(((java.lang.Object)v6),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = ((org.apache.commons.collections4.Get)v0).keySet();
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v3 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v6 = ((org.apache.commons.collections4.Get)v5).keySet();
    Object v7 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    ((java.util.Map)v4).putAll(((java.util.Map)v7));
    Object v8 = null;
    Object v9 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v10 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v11 = ((org.apache.commons.collections4.Get)v10).keySet();
    Object v12 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v10));
    Object v13 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v12).size();
    Object v14 = ((java.util.Map)v3).remove(((java.lang.Object)v9),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = ((java.util.Map)v2).entrySet();
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v7 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v8 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v7));
    Object v9 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v10 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v9));
    Object v11 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v10).toString();
    Object v12 = ((java.util.Map)v2).replace(((java.lang.Object)v8),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v2 = ((org.apache.commons.collections4.Get)v1).keySet();
    Object v3 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    ((java.util.Map)v0).putAll(((java.util.Map)v3));
    Object v4 = null;
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v6 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v7 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v5).prefixMap(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v4).entrySet();
    Object v6 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v2).tailMap(((java.lang.Object)v5));
    Object v7 = ((java.util.Map)v6).values();
    Object v8 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v9 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v8));
    Object v10 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v9));
    Object v11 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v12 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v11));
    Object v13 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v10).equals(((java.lang.Object)v12));
    Object v14 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v15 = ((org.apache.commons.collections4.Get)v14).keySet();
    Object v16 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v14));
    Object v17 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v18 = ((java.util.SortedMap)v16).headMap(((java.lang.Object)v17));
    Object v19 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v16));
    Object v20 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v19).size();
    Object v21 = ((java.util.Map)v6).putIfAbsent(((java.lang.Object)v13),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v2 = ((org.apache.commons.collections4.Get)v1).keySet();
    Object v3 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v7 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v8 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v7));
    Object v9 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v3).containsValue(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v11 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v10));
    Object v12 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v11).toString();
    Object v13 = ((java.util.Map)v0).replace(((java.lang.Object)v9),((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v5));
    Object v7 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v8 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v7).entrySet();
    Object v9 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v10 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v9));
    Object v11 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v10));
    Object v12 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v11).isEmpty();
    Object v13 = ((java.util.Map)v4).remove(((java.lang.Object)v8),((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v3 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v3));
    Object v5 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v1).tailMap(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v7 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v6));
    Object v8 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v7));
    Object v9 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v10 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v9));
    Object v11 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v10).entrySet();
    Object v12 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v8).tailMap(((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v14 = ((org.apache.commons.collections4.Get)v13).keySet();
    Object v15 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v13));
    Object v16 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v17 = ((java.util.SortedMap)v15).headMap(((java.lang.Object)v16));
    Object v18 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v15));
    Object v19 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v18).size();
    Object v20 = ((java.util.Map)v5).remove(((java.lang.Object)v12),((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v1 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v0));
    Object v2 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v1));
    Object v3 = new org.apache.commons.collections4.trie.UnmodifiableTrie(((org.apache.commons.collections4.Trie)v2));
    Object v4 = new org.apache.commons.collections4.trie.PatriciaTrie();
    Object v5 = ((org.apache.commons.collections4.Get)v4).keySet();
    Object v6 = org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(((org.apache.commons.collections4.Trie)v4));
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((org.apache.commons.collections4.trie.UnmodifiableTrie)v3).subMap(((java.lang.Object)v6),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }
}
