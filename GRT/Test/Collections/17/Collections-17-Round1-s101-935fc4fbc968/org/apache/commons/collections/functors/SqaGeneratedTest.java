package org.apache.commons.collections.functors;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    Object v4 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v5 = ((org.apache.commons.collections.functors.EqualPredicate)v3).evaluate(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.collections.functors.EqualPredicate)v2).getValue();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    Object v4 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v5 = new java.util.TreeMap(((java.util.Comparator)v4));
    Object v6 = ((org.apache.commons.collections.functors.EqualPredicate)v3).evaluate(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v5 = new java.util.TreeMap(((java.util.Comparator)v4));
    Object v6 = ((org.apache.commons.collections.functors.Equator)v2).equate(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v5 = new java.util.TreeMap(((java.util.Comparator)v4));
    Object v6 = ((org.apache.commons.collections.functors.Equator)v2).equate(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    Object v8 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v9 = ((org.apache.commons.collections.functors.EqualPredicate)v7).evaluate(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    Object v4 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v5 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v6 = ((org.apache.commons.collections.functors.Equator)v4).hash(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v3),((org.apache.commons.collections.functors.Equator)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = ((org.apache.commons.collections.functors.EqualPredicate)v1).evaluate(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v5 = ((org.apache.commons.collections.functors.EqualPredicate)v1).evaluate(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v5 = new java.util.TreeMap(((java.util.Comparator)v4));
    Object v6 = ((org.apache.commons.collections.functors.Equator)v2).equate(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    Object v8 = ((org.apache.commons.collections.functors.EqualPredicate)v7).getValue();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v5),((org.apache.commons.collections.functors.Equator)v6));
    Object v8 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2));
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v1).evaluate(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2));
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v1).evaluate(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v6 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4),((org.apache.commons.collections.functors.Equator)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v4 = new java.util.TreeMap(((java.util.Comparator)v3));
    Object v5 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v6 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4),((org.apache.commons.collections.functors.Equator)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v3 = ((org.apache.commons.collections.functors.EqualPredicate)v1).evaluate(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    Object v4 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v5 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v6 = ((org.apache.commons.collections.functors.Equator)v4).hash(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v3),((org.apache.commons.collections.functors.Equator)v4));
    Object v8 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = ((org.apache.commons.collections.functors.EqualPredicate)v1).evaluate(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v7 = new java.util.TreeMap(((java.util.Comparator)v6));
    Object v8 = ((org.apache.commons.collections.functors.EqualPredicate)v5).evaluate(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v5 = new java.util.TreeMap(((java.util.Comparator)v4));
    Object v6 = ((org.apache.commons.collections.functors.Equator)v2).equate(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    Object v8 = ((org.apache.commons.collections.functors.EqualPredicate)v7).getValue();
    Object v9 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v10 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v8),((org.apache.commons.collections.functors.Equator)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v5),((org.apache.commons.collections.functors.Equator)v6));
    Object v8 = ((org.apache.commons.collections.functors.EqualPredicate)v4).evaluate(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v5 = new java.util.TreeMap(((java.util.Comparator)v4));
    Object v6 = ((org.apache.commons.collections.functors.Equator)v2).equate(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    Object v8 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v9 = new java.util.TreeMap(((java.util.Comparator)v8));
    Object v10 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v11 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v9),((org.apache.commons.collections.functors.Equator)v10));
    Object v12 = ((org.apache.commons.collections.functors.EqualPredicate)v7).evaluate(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v4 = new java.util.TreeMap(((java.util.Comparator)v3));
    Object v5 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v6 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4),((org.apache.commons.collections.functors.Equator)v5));
    Object v7 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v9 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v10 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v8),((org.apache.commons.collections.functors.Equator)v9));
    Object v11 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v12 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v10),((org.apache.commons.collections.functors.Equator)v11));
    Object v13 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v6 = new java.util.TreeMap(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.functors.Equator)v2).equate(((java.lang.Object)v4),((java.lang.Object)v7));
    Object v9 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = ((org.apache.commons.collections.functors.EqualPredicate)v2).getValue();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    Object v4 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v5 = new java.util.TreeMap(((java.util.Comparator)v4));
    Object v6 = ((org.apache.commons.collections.functors.EqualPredicate)v3).evaluate(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v8 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v9 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v7),((org.apache.commons.collections.functors.Equator)v8));
    Object v10 = ((org.apache.commons.collections.functors.EqualPredicate)v9).getValue();
    Object v11 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v6),((org.apache.commons.collections.functors.Equator)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v5),((org.apache.commons.collections.functors.Equator)v6));
    Object v8 = ((org.apache.commons.collections.functors.EqualPredicate)v4).evaluate(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    Object v4 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v5 = new java.util.TreeMap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections.functors.EqualPredicate)v3).evaluate(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v3),((org.apache.commons.collections.functors.Equator)v4));
    Object v6 = ((org.apache.commons.collections.functors.EqualPredicate)v5).getValue();
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v5),((org.apache.commons.collections.functors.Equator)v6));
    Object v8 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v9 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v7),((org.apache.commons.collections.functors.Equator)v8));
    Object v10 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.collections.functors.EqualPredicate)v4).evaluate(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2));
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v1).evaluate(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.collections.functors.EqualPredicate)v3).evaluate(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v8 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v6),((org.apache.commons.collections.functors.Equator)v7));
    Object v9 = ((org.apache.commons.collections.functors.EqualPredicate)v1).evaluate(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v6 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4),((org.apache.commons.collections.functors.Equator)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v5 = ((org.apache.commons.collections.functors.EqualPredicate)v3).evaluate(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v6 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v7 = new java.util.TreeMap(((java.util.Comparator)v6));
    Object v8 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v9 = ((org.apache.commons.collections.functors.Equator)v5).equate(((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4),((org.apache.commons.collections.functors.Equator)v5));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v5 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v6 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4),((org.apache.commons.collections.functors.Equator)v5));
    Object v7 = ((org.apache.commons.collections.functors.EqualPredicate)v3).evaluate(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v9 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.collections.functors.EqualPredicate)v3).evaluate(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v7 = new java.util.TreeMap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v10 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v8),((org.apache.commons.collections.functors.Equator)v9));
    Object v11 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v12 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v10),((org.apache.commons.collections.functors.Equator)v11));
    Object v13 = ((org.apache.commons.collections.functors.EqualPredicate)v5).evaluate(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v6 = ((org.apache.commons.collections.functors.EqualPredicate)v4).evaluate(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v9 = new java.util.TreeMap(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v12 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v10),((org.apache.commons.collections.functors.Equator)v11));
    Object v13 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v14 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v12),((org.apache.commons.collections.functors.Equator)v13));
    Object v15 = ((org.apache.commons.collections.functors.EqualPredicate)v7).evaluate(((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections.functors.EqualPredicate)v1).evaluate(((java.lang.Object)v15));
    Object v17 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v18 = new java.util.TreeMap(((java.util.Comparator)v17));
    Object v19 = ((org.apache.commons.collections.functors.EqualPredicate)v1).evaluate(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v5),((org.apache.commons.collections.functors.Equator)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v3),((org.apache.commons.collections.functors.Equator)v4));
    Object v6 = ((org.apache.commons.collections.functors.EqualPredicate)v5).getValue();
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v6));
    Object v8 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v9 = new java.util.TreeMap(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.collections.functors.EqualPredicate)v7).evaluate(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    Object v4 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v5 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v6 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4),((org.apache.commons.collections.functors.Equator)v5));
    Object v7 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v8 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v6),((org.apache.commons.collections.functors.Equator)v7));
    Object v9 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v10 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v8),((org.apache.commons.collections.functors.Equator)v9));
    Object v11 = ((org.apache.commons.collections.functors.EqualPredicate)v3).evaluate(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v13 = new java.util.TreeMap(((java.util.Comparator)v12));
    Object v14 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v15 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v16 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v17 = new java.util.TreeMap(((java.util.Comparator)v16));
    Object v18 = ((org.apache.commons.collections.functors.Equator)v14).equate(((java.lang.Object)v15),((java.lang.Object)v17));
    Object v19 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v13),((org.apache.commons.collections.functors.Equator)v14));
    Object v20 = ((org.apache.commons.collections.functors.EqualPredicate)v19).getValue();
    Object v21 = ((org.apache.commons.collections.functors.EqualPredicate)v3).evaluate(((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v3),((org.apache.commons.collections.functors.Equator)v4));
    Object v6 = ((org.apache.commons.collections.functors.EqualPredicate)v5).getValue();
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v6));
    Object v8 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    Object v4 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v5 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.functors.EqualPredicate)v5).evaluate(((java.lang.Object)v7));
    Object v9 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.collections.functors.EqualPredicate)v3).evaluate(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v12 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v13 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v11),((org.apache.commons.collections.functors.Equator)v12));
    Object v14 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.collections.functors.EqualPredicate)v3).evaluate(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    Object v4 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v5 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v6 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v4),((org.apache.commons.collections.functors.Equator)v5));
    Object v7 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v8 = new java.util.TreeMap(((java.util.Comparator)v7));
    Object v9 = ((org.apache.commons.collections.functors.EqualPredicate)v6).evaluate(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.collections.functors.EqualPredicate)v3).evaluate(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v4 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v3),((org.apache.commons.collections.functors.Equator)v4));
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v5),((org.apache.commons.collections.functors.Equator)v6));
    Object v8 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v5 = new java.util.TreeMap(((java.util.Comparator)v4));
    Object v6 = ((org.apache.commons.collections.functors.Equator)v2).equate(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    Object v8 = ((org.apache.commons.collections.functors.EqualPredicate)v7).getValue();
    Object v9 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v10 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v8),((org.apache.commons.collections.functors.Equator)v9));
    Object v11 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v12 = ((org.apache.commons.collections.functors.EqualPredicate)v10).evaluate(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0));
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = ((org.apache.commons.collections.functors.EqualPredicate)v1).evaluate(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v5),((org.apache.commons.collections.functors.Equator)v6));
    Object v8 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v9 = new java.util.TreeMap(((java.util.Comparator)v8));
    Object v10 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v11 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v12 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v13 = new java.util.TreeMap(((java.util.Comparator)v12));
    Object v14 = ((org.apache.commons.collections.functors.Equator)v10).equate(((java.lang.Object)v11),((java.lang.Object)v13));
    Object v15 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v9),((org.apache.commons.collections.functors.Equator)v10));
    Object v16 = ((org.apache.commons.collections.functors.EqualPredicate)v15).getValue();
    Object v17 = ((org.apache.commons.collections.functors.EqualPredicate)v7).evaluate(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2));
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v1).evaluate(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v5),((org.apache.commons.collections.functors.Equator)v6));
    Object v8 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v9 = new java.util.TreeMap(((java.util.Comparator)v8));
    Object v10 = ((org.apache.commons.collections.functors.EqualPredicate)v7).evaluate(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v5),((org.apache.commons.collections.functors.Equator)v6));
    Object v8 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v9 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v7),((org.apache.commons.collections.functors.Equator)v8));
    Object v10 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.collections.functors.EqualPredicate)v4).evaluate(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v13 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v11),((org.apache.commons.collections.functors.Equator)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v6 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4),((org.apache.commons.collections.functors.Equator)v5));
    Object v7 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v8 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v9 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v7),((org.apache.commons.collections.functors.Equator)v8));
    Object v10 = ((org.apache.commons.collections.functors.EqualPredicate)v9).getValue();
    Object v11 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v6),((org.apache.commons.collections.functors.Equator)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v3).getValue();
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0));
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.functors.Equator)v5).hash(((java.lang.Object)v7));
    Object v9 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4),((org.apache.commons.collections.functors.Equator)v5));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v5),((org.apache.commons.collections.functors.Equator)v6));
    Object v8 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v9 = new java.util.TreeMap(((java.util.Comparator)v8));
    Object v10 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v11 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v12 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v13 = new java.util.TreeMap(((java.util.Comparator)v12));
    Object v14 = ((org.apache.commons.collections.functors.Equator)v10).equate(((java.lang.Object)v11),((java.lang.Object)v13));
    Object v15 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v9),((org.apache.commons.collections.functors.Equator)v10));
    Object v16 = ((org.apache.commons.collections.functors.EqualPredicate)v15).getValue();
    Object v17 = ((org.apache.commons.collections.functors.EqualPredicate)v7).evaluate(((java.lang.Object)v16));
    Object v18 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = ((org.apache.commons.collections.functors.EqualPredicate)v4).getValue();
    Object v6 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v7 = new java.util.TreeMap(((java.util.Comparator)v6));
    Object v8 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v9 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v10 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v11 = new java.util.TreeMap(((java.util.Comparator)v10));
    Object v12 = ((org.apache.commons.collections.functors.Equator)v8).equate(((java.lang.Object)v9),((java.lang.Object)v11));
    Object v13 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v7),((org.apache.commons.collections.functors.Equator)v8));
    Object v14 = ((org.apache.commons.collections.functors.EqualPredicate)v13).getValue();
    Object v15 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v16 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v14),((org.apache.commons.collections.functors.Equator)v15));
    Object v17 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v18 = ((org.apache.commons.collections.functors.EqualPredicate)v16).evaluate(((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.collections.functors.Equator)v5).hash(((java.lang.Object)v18));
    Object v20 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v5));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v6 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4),((org.apache.commons.collections.functors.Equator)v5));
    Object v7 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v8 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v9 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v7),((org.apache.commons.collections.functors.Equator)v8));
    Object v10 = ((org.apache.commons.collections.functors.EqualPredicate)v9).getValue();
    Object v11 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v6),((org.apache.commons.collections.functors.Equator)v10));
    Object v12 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v13 = ((org.apache.commons.collections.functors.EqualPredicate)v11).evaluate(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2));
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v1).evaluate(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v5),((org.apache.commons.collections.functors.Equator)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0));
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v5 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v3),((org.apache.commons.collections.functors.Equator)v4));
    Object v6 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v7 = ((org.apache.commons.collections.functors.EqualPredicate)v5).evaluate(((java.lang.Object)v6));
    Object v8 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v10 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v8),((org.apache.commons.collections.functors.Equator)v9));
    Object v11 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v12 = new java.util.TreeMap(((java.util.Comparator)v11));
    Object v13 = ((org.apache.commons.collections.functors.EqualPredicate)v10).evaluate(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v13));
    Object v15 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v16 = new java.util.TreeMap(((java.util.Comparator)v15));
    Object v17 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v18 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v19 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v20 = new java.util.TreeMap(((java.util.Comparator)v19));
    Object v21 = ((org.apache.commons.collections.functors.Equator)v17).equate(((java.lang.Object)v18),((java.lang.Object)v20));
    Object v22 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v16),((org.apache.commons.collections.functors.Equator)v17));
    Object v23 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v6 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4),((org.apache.commons.collections.functors.Equator)v5));
    Object v7 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0));
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v4 = new java.util.TreeMap(((java.util.Comparator)v3));
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v5),((org.apache.commons.collections.functors.Equator)v6));
    Object v8 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v4 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v3),((org.apache.commons.collections.functors.Equator)v4));
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v5),((org.apache.commons.collections.functors.Equator)v6));
    Object v8 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v8));
    Object v10 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v3),((org.apache.commons.collections.functors.Equator)v4));
    Object v6 = ((org.apache.commons.collections.functors.EqualPredicate)v5).getValue();
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v6));
    Object v8 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v10 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v9));
    Object v11 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.collections.functors.EqualPredicate)v8).evaluate(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2));
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v1).evaluate(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v6 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4),((org.apache.commons.collections.functors.Equator)v5));
    Object v7 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v8 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v10 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.collections.functors.EqualPredicate)v8).evaluate(((java.lang.Object)v10));
    Object v12 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.collections.functors.EqualPredicate)v6).evaluate(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2));
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v1).evaluate(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v5),((org.apache.commons.collections.functors.Equator)v6));
    Object v8 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v5),((org.apache.commons.collections.functors.Equator)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v8 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v6),((org.apache.commons.collections.functors.Equator)v7));
    Object v9 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v10 = ((org.apache.commons.collections.functors.EqualPredicate)v8).evaluate(((java.lang.Object)v9));
    Object v11 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v13 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v11),((org.apache.commons.collections.functors.Equator)v12));
    Object v14 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v15 = new java.util.TreeMap(((java.util.Comparator)v14));
    Object v16 = ((org.apache.commons.collections.functors.EqualPredicate)v13).evaluate(((java.lang.Object)v15));
    Object v17 = ((org.apache.commons.collections.functors.EqualPredicate)v5).evaluate(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v6 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v4),((org.apache.commons.collections.functors.Equator)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.functors.Equator)v5).hash(((java.lang.Object)v7));
    Object v9 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4),((org.apache.commons.collections.functors.Equator)v5));
    Object v10 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v11 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v9),((org.apache.commons.collections.functors.Equator)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v8 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v6),((org.apache.commons.collections.functors.Equator)v7));
    Object v9 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v10 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v8),((org.apache.commons.collections.functors.Equator)v9));
    Object v11 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.collections.functors.EqualPredicate)v5).evaluate(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v6 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v7 = new java.util.TreeMap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.collections.functors.Equator)v5).hash(((java.lang.Object)v8));
    Object v10 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4),((org.apache.commons.collections.functors.Equator)v5));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0));
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1));
    Object v3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v5 = new java.util.TreeMap(((java.util.Comparator)v4));
    Object v6 = ((org.apache.commons.collections.functors.Equator)v2).equate(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    Object v8 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v9 = new java.util.TreeMap(((java.util.Comparator)v8));
    Object v10 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v11 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v9),((org.apache.commons.collections.functors.Equator)v10));
    Object v12 = ((org.apache.commons.collections.functors.EqualPredicate)v7).evaluate(((java.lang.Object)v11));
    Object v13 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    Object v5 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v6 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v4),((org.apache.commons.collections.functors.Equator)v5));
    Object v7 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v8 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v9 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v7),((org.apache.commons.collections.functors.Equator)v8));
    Object v10 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v11 = ((org.apache.commons.collections.functors.EqualPredicate)v9).evaluate(((java.lang.Object)v10));
    Object v12 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v14 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v12),((org.apache.commons.collections.functors.Equator)v13));
    Object v15 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v16 = new java.util.TreeMap(((java.util.Comparator)v15));
    Object v17 = ((org.apache.commons.collections.functors.EqualPredicate)v14).evaluate(((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.collections.functors.EqualPredicate)v6).evaluate(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v3).getValue();
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v4));
    Object v6 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v7 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v8 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v6),((org.apache.commons.collections.functors.Equator)v7));
    Object v9 = ((org.apache.commons.collections.functors.EqualPredicate)v8).getValue();
    Object v10 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v5),((org.apache.commons.collections.functors.Equator)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v5 = new java.util.TreeMap(((java.util.Comparator)v4));
    Object v6 = ((org.apache.commons.collections.functors.Equator)v2).equate(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    Object v8 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v9 = new java.util.TreeMap(((java.util.Comparator)v8));
    Object v10 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v11 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v9),((org.apache.commons.collections.functors.Equator)v10));
    Object v12 = ((org.apache.commons.collections.functors.EqualPredicate)v7).evaluate(((java.lang.Object)v11));
    Object v13 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v12));
    Object v14 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v15 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v16 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v14),((org.apache.commons.collections.functors.Equator)v15));
    Object v17 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v16));
    Object v18 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v19 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v20 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v18),((org.apache.commons.collections.functors.Equator)v19));
    Object v21 = ((org.apache.commons.collections.functors.EqualPredicate)v17).evaluate(((java.lang.Object)v20));
    Object v22 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v23 = new org.apache.commons.collections.functors.EqualPredicate(((java.lang.Object)v22));
    Object v24 = ((org.apache.commons.collections.functors.EqualPredicate)v17).evaluate(((java.lang.Object)v23));
    Object v25 = ((org.apache.commons.collections.functors.EqualPredicate)v13).evaluate(((java.lang.Object)v24));
    Object v26 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v27 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v26));
    Object v28 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v27));
    Object v29 = ((org.apache.commons.collections.functors.EqualPredicate)v13).evaluate(((java.lang.Object)v28));
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0));
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v7 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v8 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v6),((org.apache.commons.collections.functors.Equator)v7));
    Object v9 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v10 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v11 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v9),((org.apache.commons.collections.functors.Equator)v10));
    Object v12 = ((org.apache.commons.collections.functors.EqualPredicate)v11).getValue();
    Object v13 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v8),((org.apache.commons.collections.functors.Equator)v12));
    Object v14 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v13));
    Object v15 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v16 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v15));
    Object v17 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.collections.functors.EqualPredicate)v14).evaluate(((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.collections.functors.EqualPredicate)v2).evaluate(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v2 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1),((org.apache.commons.collections.functors.Equator)v2));
    Object v4 = ((org.apache.commons.collections.functors.EqualPredicate)v3).getValue();
    Object v5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0),((org.apache.commons.collections.functors.Equator)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.collections.trie.CharacterKeyAnalyzer();
    Object v1 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v0));
    Object v2 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.functors.DefaultEquator();
    Object v4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(((java.lang.Object)v2),((org.apache.commons.collections.functors.Equator)v3));
    org.junit.Assert.assertNotNull(v4);
  }
}
