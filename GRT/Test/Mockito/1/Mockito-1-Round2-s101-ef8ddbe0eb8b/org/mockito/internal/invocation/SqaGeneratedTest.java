package org.mockito.internal.invocation;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).isEmpty();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).hashCode();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).hashCode();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).toArray();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.invocation.Invocation)v0),((java.util.List)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((org.mockito.internal.invocation.InvocationMatcher)v0).getMethod();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).hashCode();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    ((java.util.List)v2).sort(((java.util.Comparator)v4));
    Object v5 = null;
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).isEmpty();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).toArray();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = ((java.util.List)v2).toArray();
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).isEmpty();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.List.of();
    Object v2 = ((java.util.List)v1).isEmpty();
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v1));
    Object v4 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.invocation.Invocation)v0),((java.util.List)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).isEmpty();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = java.util.List.of();
    Object v5 = ((java.util.List)v4).isEmpty();
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v7 = ((java.util.List)v3).equals(((java.lang.Object)v6));
    Object v8 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((org.mockito.internal.invocation.InvocationMatcher)v0).getMatchers();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).size();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).size();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = java.util.List.of();
    Object v2 = ((java.util.List)v1).hashCode();
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v1));
    Object v4 = ((java.util.List)v0).containsAll(((java.util.Collection)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).iterator();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).iterator();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).iterator();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).hashCode();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).hashCode();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = java.util.List.of();
    Object v6 = ((java.util.List)v5).toArray();
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v8 = ((java.util.List)v7).toArray();
    Object v9 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v7));
    Object v10 = ((java.util.List)v4).indexOf(((java.lang.Object)v9));
    Object v11 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).hashCode();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = java.util.List.of();
    Object v6 = ((java.util.List)v5).toArray();
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v8 = ((java.util.List)v7).toArray();
    Object v9 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v7));
    Object v10 = ((java.util.List)v4).indexOf(((java.lang.Object)v9));
    Object v11 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v12 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).iterator();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = java.util.List.of();
    Object v4 = ((java.util.List)v3).iterator();
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    Object v8 = ((java.util.List)v2).add(((java.lang.Object)v7));
    Object v9 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).toArray();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = ((java.util.List)v2).toArray();
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).iterator();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).isEmpty();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = ((java.util.List)v2).spliterator();
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).size();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = java.util.List.of();
    Object v2 = ((java.util.List)v1).hashCode();
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v1));
    Object v4 = ((java.util.List)v0).containsAll(((java.util.Collection)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).size();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).isEmpty();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = ((java.util.List)v2).spliterator();
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = java.util.List.of();
    Object v2 = ((java.util.List)v1).hashCode();
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v1));
    Object v4 = ((java.util.List)v0).containsAll(((java.util.Collection)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).hashCode();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).iterator();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).size();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = java.util.List.of();
    Object v5 = java.util.List.of();
    Object v6 = ((java.util.List)v5).hashCode();
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v8 = ((java.util.List)v4).containsAll(((java.util.Collection)v7));
    Object v9 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v10 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v9));
    Object v11 = ((java.util.List)v3).addAll(((java.util.Collection)v10));
    Object v12 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).toArray();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = ((java.util.List)v2).toArray();
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).iterator();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = ((java.util.List)v5).isEmpty();
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).isEmpty();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = ((java.util.List)v2).spliterator();
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = ((java.util.List)v5).equals(((java.lang.Object)v7));
    Object v9 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).isEmpty();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = 72;
    Object v4 = new org.mockito.internal.verification.AtLeast((((java.lang.Integer)v3).intValue()));
    Object v5 = java.util.function.Predicate.isEqual(((java.lang.Object)v4));
    Object v6 = ((java.util.Collection)v2).removeIf(((java.util.function.Predicate)v5));
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).hashCode();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = java.util.List.of();
    Object v6 = ((java.util.List)v5).toArray();
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v8 = ((java.util.List)v7).toArray();
    Object v9 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v7));
    Object v10 = ((java.util.List)v4).indexOf(((java.lang.Object)v9));
    Object v11 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v12 = java.util.List.of();
    Object v13 = ((java.util.List)v12).toArray();
    Object v14 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v12));
    Object v15 = ((java.util.List)v14).toArray();
    Object v16 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v14));
    Object v17 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v16));
    Object v18 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v17));
    Object v19 = ((java.util.List)v11).retainAll(((java.util.Collection)v18));
    Object v20 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v11));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).isEmpty();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = ((java.util.List)v2).spliterator();
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).stream();
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.List.of();
    Object v2 = ((java.util.List)v1).size();
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v1));
    Object v4 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.invocation.Invocation)v0),((java.util.List)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).isEmpty();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = ((java.util.List)v2).spliterator();
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).stream();
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v8 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = new java.lang.Object[]{null};
    Object v2 = ((java.util.List)v0).toArray(((java.lang.Object[])v1));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = java.util.List.of();
    Object v2 = ((java.util.List)v1).toArray();
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v1));
    Object v4 = ((java.util.List)v3).toArray();
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v6 = ((java.util.List)v0).contains(((java.lang.Object)v5));
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).isEmpty();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = ((java.util.List)v2).spliterator();
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = ((java.util.List)v5).equals(((java.lang.Object)v7));
    Object v9 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v10 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).hashCode();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).size();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = java.util.List.of();
    Object v5 = java.util.List.of();
    Object v6 = ((java.util.List)v5).hashCode();
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v8 = ((java.util.List)v4).containsAll(((java.util.Collection)v7));
    Object v9 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v10 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v9));
    Object v11 = ((java.util.List)v3).addAll(((java.util.Collection)v10));
    Object v12 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v13 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.List.of();
    Object v2 = ((java.util.List)v1).iterator();
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v1));
    Object v4 = java.util.List.of();
    Object v5 = ((java.util.List)v4).hashCode();
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    Object v8 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v7));
    Object v9 = ((java.util.List)v3).equals(((java.lang.Object)v8));
    Object v10 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.invocation.Invocation)v0),((java.util.List)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = new java.lang.Object[]{null};
    Object v2 = ((java.util.List)v0).toArray(((java.lang.Object[])v1));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = java.util.List.of();
    Object v2 = ((java.util.List)v1).hashCode();
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v1));
    Object v4 = ((java.util.List)v0).containsAll(((java.util.Collection)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = ((java.util.List)v6).isEmpty();
    Object v8 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = java.util.List.of();
    Object v2 = ((java.util.List)v1).hashCode();
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v1));
    Object v4 = ((java.util.List)v0).containsAll(((java.util.Collection)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = null;
    Object v8 = new org.mockito.internal.invocation.realmethod.DefaultRealMethod(((org.mockito.internal.creation.util.MockitoMethodProxy)v7));
    Object v9 = ((java.util.List)v6).indexOf(((java.lang.Object)v8));
    Object v10 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).toArray();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = ((java.util.List)v2).toArray();
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).iterator();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = ((java.util.List)v5).isEmpty();
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v8 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).isEmpty();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).toArray();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = ((java.util.List)v2).toArray();
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = java.util.List.of();
    Object v8 = ((java.util.List)v7).iterator();
    Object v9 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v7));
    Object v10 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v9));
    Object v11 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v10));
    Object v12 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v11));
    Object v13 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v12));
    Object v14 = ((java.util.List)v6).contains(((java.lang.Object)v13));
    Object v15 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).iterator();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = ((java.util.List)v5).isEmpty();
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v8 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v7));
    Object v9 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).isEmpty();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = ((java.util.List)v2).spliterator();
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = ((java.util.List)v5).equals(((java.lang.Object)v7));
    Object v9 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v10 = java.util.List.of();
    Object v11 = new java.lang.Object[]{null};
    Object v12 = ((java.util.List)v10).toArray(((java.lang.Object[])v11));
    Object v13 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v10));
    Object v14 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v13));
    Object v15 = ((java.util.List)v9).contains(((java.lang.Object)v14));
    Object v16 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v9));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).hashCode();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = java.util.List.of();
    Object v6 = ((java.util.List)v5).toArray();
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v8 = ((java.util.List)v7).toArray();
    Object v9 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v7));
    Object v10 = ((java.util.List)v4).indexOf(((java.lang.Object)v9));
    Object v11 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v12 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v11));
    Object v13 = ((java.util.List)v12).listIterator();
    Object v14 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).toArray();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = java.util.List.of();
    Object v2 = ((java.util.List)v1).hashCode();
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v1));
    Object v4 = ((java.util.List)v0).containsAll(((java.util.Collection)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v6 = java.util.List.of();
    Object v7 = ((java.util.List)v6).size();
    Object v8 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    Object v9 = ((java.util.List)v5).remove(((java.lang.Object)v8));
    Object v10 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.Collection)v0).stream();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = new java.lang.Object[]{null};
    Object v2 = ((java.util.List)v0).toArray(((java.lang.Object[])v1));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).toArray();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = ((java.util.List)v2).toArray();
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = java.util.List.of();
    Object v8 = ((java.util.List)v7).iterator();
    Object v9 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v7));
    Object v10 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v9));
    Object v11 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v10));
    Object v12 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v11));
    Object v13 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v12));
    Object v14 = ((java.util.List)v6).contains(((java.lang.Object)v13));
    Object v15 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    Object v16 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = java.util.List.of();
    Object v2 = ((java.util.List)v1).hashCode();
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v1));
    Object v4 = ((java.util.List)v0).containsAll(((java.util.Collection)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = ((java.util.List)v6).isEmpty();
    Object v8 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    Object v9 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).hashCode();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = java.util.List.of();
    Object v6 = ((java.util.List)v5).toArray();
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v8 = ((java.util.List)v7).toArray();
    Object v9 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v7));
    Object v10 = ((java.util.List)v4).indexOf(((java.lang.Object)v9));
    Object v11 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v12 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v11));
    Object v13 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).toArray();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).size();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).size();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).iterator();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = ((java.util.List)v5).listIterator();
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.List.of();
    Object v2 = ((java.util.List)v1).toArray();
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v1));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.invocation.Invocation)v0),((java.util.List)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).toArray();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = ((java.util.List)v2).toArray();
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = ((java.util.List)v6).hashCode();
    Object v8 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).isEmpty();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = new java.lang.Object[]{null};
    Object v2 = ((java.util.List)v0).toArray(((java.lang.Object[])v1));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v4 = java.util.List.of();
    Object v5 = ((java.util.List)v4).isEmpty();
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v7 = ((java.util.List)v3).equals(((java.lang.Object)v6));
    Object v8 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.List.of();
    Object v2 = ((java.util.Collection)v1).stream();
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v1));
    Object v4 = ((java.util.List)v3).size();
    Object v5 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.invocation.Invocation)v0),((java.util.List)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = new java.lang.Object[]{null};
    Object v2 = ((java.util.List)v0).toArray(((java.lang.Object[])v1));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = java.util.List.of();
    Object v2 = ((java.util.List)v1).hashCode();
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v1));
    Object v4 = ((java.util.List)v0).containsAll(((java.util.Collection)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = null;
    Object v8 = new org.mockito.internal.invocation.realmethod.DefaultRealMethod(((org.mockito.internal.creation.util.MockitoMethodProxy)v7));
    Object v9 = ((java.util.List)v6).indexOf(((java.lang.Object)v8));
    Object v10 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    Object v11 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).size();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = java.util.List.of();
    Object v4 = ((java.util.List)v3).hashCode();
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    ((java.util.List)v5).sort(((java.util.Comparator)v7));
    Object v8 = null;
    Object v9 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v10 = ((java.util.List)v2).contains(((java.lang.Object)v9));
    Object v11 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.List.of();
    Object v2 = new java.lang.Object[]{null};
    Object v3 = ((java.util.List)v1).toArray(((java.lang.Object[])v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v1));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    Object v8 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.invocation.Invocation)v0),((java.util.List)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).iterator();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.Collection)v0).stream();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).iterator();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = 72;
    Object v7 = new org.mockito.internal.verification.AtLeast((((java.lang.Integer)v6).intValue()));
    Object v8 = java.util.function.Predicate.isEqual(((java.lang.Object)v7));
    Object v9 = ((java.util.Collection)v5).removeIf(((java.util.function.Predicate)v8));
    Object v10 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.List.of();
    Object v2 = new java.lang.Object[]{null};
    Object v3 = ((java.util.List)v1).toArray(((java.lang.Object[])v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v1));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    Object v8 = ((java.util.List)v7).iterator();
    Object v9 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.invocation.Invocation)v0),((java.util.List)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = new java.lang.Object[]{null};
    Object v2 = ((java.util.List)v0).toArray(((java.lang.Object[])v1));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = new java.lang.Object[]{null};
    Object v2 = ((java.util.List)v0).toArray(((java.lang.Object[])v1));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = ((java.util.Collection)v6).parallelStream();
    Object v8 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).toArray();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = ((java.util.List)v2).toArray();
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = ((java.util.List)v6).hashCode();
    Object v8 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    Object v9 = java.util.List.of();
    Object v10 = ((java.util.List)v9).hashCode();
    Object v11 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v9));
    Object v12 = ((java.util.List)v8).retainAll(((java.util.Collection)v11));
    Object v13 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v8));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).hashCode();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((org.mockito.internal.invocation.InvocationMatcher)v0).toString();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.List.of();
    Object v2 = ((java.util.List)v1).isEmpty();
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v1));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    ((java.util.List)v7).clear();
    Object v8 = null;
    Object v9 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.invocation.Invocation)v0),((java.util.List)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = new java.lang.Object[]{null};
    Object v2 = ((java.util.List)v0).toArray(((java.lang.Object[])v1));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = ((java.util.Collection)v6).parallelStream();
    Object v8 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    Object v9 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = new java.lang.Object[]{null};
    Object v2 = ((java.util.List)v0).toArray(((java.lang.Object[])v1));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v4 = java.util.List.of();
    Object v5 = ((java.util.List)v4).isEmpty();
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v7 = ((java.util.List)v3).equals(((java.lang.Object)v6));
    Object v8 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v9 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = new java.lang.Object[]{null};
    Object v2 = ((java.util.List)v0).toArray(((java.lang.Object[])v1));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = ((java.util.Collection)v6).parallelStream();
    Object v8 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    Object v9 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v8));
    Object v10 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.Collection)v0).stream();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).isEmpty();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).hashCode();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    ((java.util.List)v2).sort(((java.util.Comparator)v4));
    Object v5 = null;
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).iterator();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    Object v8 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).isEmpty();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = ((java.util.List)v2).spliterator();
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).iterator();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = ((java.util.List)v3).toArray();
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).hashCode();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    ((java.util.List)v2).sort(((java.util.Comparator)v4));
    Object v5 = null;
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v7 = ((java.util.List)v6).spliterator();
    Object v8 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.util.List.of();
    Object v1 = ((java.util.List)v0).isEmpty();
    Object v2 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v0));
    Object v3 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v2));
    Object v4 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v3));
    Object v5 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v4));
    Object v6 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v5));
    Object v7 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v6));
    Object v8 = org.mockito.internal.invocation.InvocationMatcher.createFrom(((java.util.List)v7));
    org.junit.Assert.assertNotNull(v8);
  }
}
