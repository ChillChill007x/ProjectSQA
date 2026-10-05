package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isOptionalArg();
    Object v7 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isOptionalArg();
    Object v9 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v10 = -42.417499036233416D;
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v9 = -42.417499036233416D;
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v8).copyInformationFromForTree(((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isExceptionPossible(((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v8));
    Object v10 = -42.417499036233416D;
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = java.util.Set.of();
    ((com.google.javascript.rhino.Node)v13).setDirectives(((java.util.Set)v14));
    Object v15 = null;
    Object v16 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    ((com.google.javascript.rhino.Node)v5).detachChildren();
    Object v6 = null;
    Object v7 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).skipFinallyNodes(((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v8));
    Object v10 = -42.417499036233416D;
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).skipFinallyNodes(((com.google.javascript.rhino.Node)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "-";
    Object v1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isExceptionPossible(((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isOptionalArg();
    Object v9 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v10 = false;
    Object v11 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = -42.417499036233416D;
    Object v13 = 1;
    Object v14 = 0;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v11).optimizeSubtree(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v5).clonePropsFrom(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isExceptionPossible(((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = -42.417499036233416D;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v5));
    Object v7 = -42.417499036233416D;
    Object v8 = 1;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v5));
    Object v7 = -42.417499036233416D;
    Object v8 = 1;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).skipFinallyNodes(((com.google.javascript.rhino.Node)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "prtotype";
    Object v1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v5).addChildToFront(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).skipFinallyNodes(((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isOptionalArg();
    Object v9 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v10 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isOptionalArg();
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).wasEmptyNode();
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isOptionalArg();
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = -42.417499036233416D;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).isOptionalArg();
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).wasEmptyNode();
    Object v16 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v14));
    Object v17 = -42.417499036233416D;
    Object v18 = 1;
    Object v19 = 0;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).getExceptionHandler(((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).siblings();
    Object v7 = -42.417499036233416D;
    Object v8 = 1;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isExceptionPossible(((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v8));
    Object v10 = false;
    Object v11 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = false;
    Object v13 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = -42.417499036233416D;
    Object v15 = 1;
    Object v16 = 0;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).isOptionalArg();
    Object v19 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v13).optimizeSubtree(((com.google.javascript.rhino.Node)v17));
    Object v20 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v11).optimizeSubtree(((com.google.javascript.rhino.Node)v19));
    Object v21 = -42.417499036233416D;
    Object v22 = 1;
    Object v23 = 0;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = -42.417499036233416D;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).isOptionalArg();
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).wasEmptyNode();
    Object v16 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v14));
    Object v17 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isExceptionPossible(((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 8;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.rhino.Node)v5).putProp((((java.lang.Integer)v6).intValue()),((java.lang.Object)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = false;
    Object v13 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = -42.417499036233416D;
    Object v15 = 1;
    Object v16 = 0;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v13).optimizeSubtree(((com.google.javascript.rhino.Node)v17));
    Object v19 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v11).optimizeSubtree(((com.google.javascript.rhino.Node)v18));
    Object v20 = true;
    Object v21 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = false;
    Object v25 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = -42.417499036233416D;
    Object v27 = 1;
    Object v28 = 0;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v25).optimizeSubtree(((com.google.javascript.rhino.Node)v29));
    Object v31 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v23).optimizeSubtree(((com.google.javascript.rhino.Node)v30));
    Object v32 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v21).optimizeSubtree(((com.google.javascript.rhino.Node)v31));
    Object v33 = ((com.google.javascript.rhino.Node)v19).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v32));
    Object v34 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = -42.417499036233416D;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isExceptionPossible(((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v5));
    Object v7 = -42.417499036233416D;
    Object v8 = 1;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -42.417499036233416D;
    Object v12 = 1;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isOptionalArg();
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v13 = -42.417499036233416D;
    Object v14 = 1;
    Object v15 = 0;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v12).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v16));
    Object v18 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v10));
    Object v12 = false;
    Object v13 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = -42.417499036233416D;
    Object v15 = 1;
    Object v16 = 0;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v13).optimizeSubtree(((com.google.javascript.rhino.Node)v17));
    Object v19 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v8));
    Object v10 = -42.417499036233416D;
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).skipFinallyNodes(((com.google.javascript.rhino.Node)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isNoSideEffectsCall();
    Object v7 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isExceptionPossible(((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isOptionalArg();
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v12));
    Object v14 = -42.417499036233416D;
    Object v15 = 1;
    Object v16 = 0;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).getExceptionHandler(((com.google.javascript.rhino.Node)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = -42.417499036233416D;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "ECMASCRIPT3";
    Object v1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v5));
    Object v7 = -42.417499036233416D;
    Object v8 = 1;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    Object v12 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = -42.417499036233416D;
    Object v14 = 1;
    Object v15 = 0;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v12).optimizeSubtree(((com.google.javascript.rhino.Node)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).toString();
    Object v19 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = -42.417499036233416D;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).isOptionalArg();
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).wasEmptyNode();
    Object v16 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v14));
    Object v17 = false;
    Object v18 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = false;
    Object v22 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v21).booleanValue()));
    Object v23 = -42.417499036233416D;
    Object v24 = 1;
    Object v25 = 0;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.google.javascript.rhino.Node)v26).isOptionalArg();
    Object v28 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v22).optimizeSubtree(((com.google.javascript.rhino.Node)v26));
    Object v29 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v20).optimizeSubtree(((com.google.javascript.rhino.Node)v28));
    Object v30 = ((com.google.javascript.rhino.Node)v29).wasEmptyNode();
    Object v31 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v18).optimizeSubtree(((com.google.javascript.rhino.Node)v29));
    Object v32 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = -42.417499036233416D;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v13));
    Object v15 = 0;
    ((com.google.javascript.rhino.Node)v14).setLineno((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v13 = true;
    Object v14 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -42.417499036233416D;
    Object v22 = 1;
    Object v23 = 0;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v20).optimizeSubtree(((com.google.javascript.rhino.Node)v24));
    Object v26 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v18).optimizeSubtree(((com.google.javascript.rhino.Node)v25));
    Object v27 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v16).optimizeSubtree(((com.google.javascript.rhino.Node)v26));
    Object v28 = 0;
    ((com.google.javascript.rhino.Node)v27).setLineno((((java.lang.Integer)v28).intValue()));
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v14).optimizeSubtree(((com.google.javascript.rhino.Node)v27));
    Object v31 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isExceptionPossible(((com.google.javascript.rhino.Node)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v9 = -42.417499036233416D;
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isLocalResultCall();
    Object v10 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isExceptionPossible(((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = -42.417499036233416D;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v14));
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = -42.417499036233416D;
    Object v21 = 1;
    Object v22 = 0;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v19).optimizeSubtree(((com.google.javascript.rhino.Node)v23));
    Object v25 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v17).optimizeSubtree(((com.google.javascript.rhino.Node)v24));
    Object v26 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isOptionalArg();
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v13 = -42.417499036233416D;
    Object v14 = 1;
    Object v15 = 0;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.rhino.Node)v12).addChildToFront(((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).getExceptionHandler(((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = ";";
    Object v1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v9 = true;
    Object v10 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = -42.417499036233416D;
    Object v12 = 1;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v10).optimizeSubtree(((com.google.javascript.rhino.Node)v14));
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = -42.417499036233416D;
    Object v21 = 1;
    Object v22 = 0;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.google.javascript.rhino.Node)v23).isOptionalArg();
    Object v25 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v19).optimizeSubtree(((com.google.javascript.rhino.Node)v23));
    Object v26 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v17).optimizeSubtree(((com.google.javascript.rhino.Node)v25));
    Object v27 = ((com.google.javascript.rhino.Node)v15).useSourceInfoFrom(((com.google.javascript.rhino.Node)v26));
    Object v28 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isOptionalArg();
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).skipFinallyNodes(((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = -42.417499036233416D;
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v9).optimizeSubtree(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v15));
    Object v17 = 0;
    ((com.google.javascript.rhino.Node)v16).setLineno((((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v16));
    Object v20 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = false;
    Object v11 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = -42.417499036233416D;
    Object v13 = 1;
    Object v14 = 0;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v11).optimizeSubtree(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v9).optimizeSubtree(((com.google.javascript.rhino.Node)v16));
    Object v18 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v17));
    Object v19 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = -42.417499036233416D;
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v9).optimizeSubtree(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v15));
    Object v17 = 0;
    ((com.google.javascript.rhino.Node)v16).setLineno((((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v16));
    Object v20 = -42.417499036233416D;
    Object v21 = 1;
    Object v22 = 0;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.google.javascript.rhino.Node)v23).toStringTree();
    Object v25 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v23));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "ver";
    Object v1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isOptionalArg();
    Object v9 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v10 = 58;
    Object v11 = 24;
    ((com.google.javascript.rhino.Node)v9).putIntProp((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).skipFinallyNodes(((com.google.javascript.rhino.Node)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = -42.417499036233416D;
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v9).optimizeSubtree(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v16));
    Object v18 = true;
    Object v19 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = -42.417499036233416D;
    Object v23 = 1;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v21).optimizeSubtree(((com.google.javascript.rhino.Node)v25));
    Object v27 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v19).optimizeSubtree(((com.google.javascript.rhino.Node)v26));
    Object v28 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v27));
    Object v29 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = -42.417499036233416D;
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v9).optimizeSubtree(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v15));
    Object v17 = 0;
    ((com.google.javascript.rhino.Node)v16).setLineno((((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v16));
    Object v20 = 1;
    ((com.google.javascript.rhino.Node)v19).setCharno((((java.lang.Integer)v20).intValue()));
    Object v21 = null;
    Object v22 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "]";
    Object v1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = -42.417499036233416D;
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v9).optimizeSubtree(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v16));
    Object v18 = true;
    Object v19 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = -42.417499036233416D;
    Object v23 = 1;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v21).optimizeSubtree(((com.google.javascript.rhino.Node)v25));
    Object v27 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v19).optimizeSubtree(((com.google.javascript.rhino.Node)v26));
    Object v28 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v27));
    Object v29 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).skipFinallyNodes(((com.google.javascript.rhino.Node)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isOptionalArg();
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = -42.417499036233416D;
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v9).optimizeSubtree(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v15));
    Object v17 = 0;
    ((com.google.javascript.rhino.Node)v16).setLineno((((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v16));
    Object v20 = java.util.Set.of();
    ((com.google.javascript.rhino.Node)v19).setDirectives(((java.util.Set)v20));
    Object v21 = null;
    Object v22 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).children();
    Object v7 = -42.417499036233416D;
    Object v8 = 1;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = -42.417499036233416D;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    ((com.google.javascript.rhino.Node)v5).setSourceEncodedPosition((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).skipFinallyNodes(((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v10));
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = false;
    Object v15 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = -42.417499036233416D;
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v15).optimizeSubtree(((com.google.javascript.rhino.Node)v19));
    Object v21 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v13).optimizeSubtree(((com.google.javascript.rhino.Node)v20));
    Object v22 = ((com.google.javascript.rhino.Node)v11).clonePropsFrom(((com.google.javascript.rhino.Node)v21));
    Object v23 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isExceptionPossible(((com.google.javascript.rhino.Node)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).skipFinallyNodes(((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isOptionalArg();
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v13 = false;
    ((com.google.javascript.rhino.Node)v12).setVarArgs((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    Object v15 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "arguments";
    Object v1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    Object v14 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = -42.417499036233416D;
    Object v16 = 1;
    Object v17 = 0;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v14).optimizeSubtree(((com.google.javascript.rhino.Node)v18));
    Object v20 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v12).optimizeSubtree(((com.google.javascript.rhino.Node)v19));
    Object v21 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v10).optimizeSubtree(((com.google.javascript.rhino.Node)v20));
    Object v22 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v8).optimizeSubtree(((com.google.javascript.rhino.Node)v21));
    Object v23 = true;
    Object v24 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v23).booleanValue()));
    Object v25 = false;
    Object v26 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v25).booleanValue()));
    Object v27 = -42.417499036233416D;
    Object v28 = 1;
    Object v29 = 0;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v26).optimizeSubtree(((com.google.javascript.rhino.Node)v30));
    Object v32 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v24).optimizeSubtree(((com.google.javascript.rhino.Node)v31));
    Object v33 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v8).optimizeSubtree(((com.google.javascript.rhino.Node)v32));
    Object v34 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v33));
    org.junit.Assert.assertEquals((Object)(true), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = -42.417499036233416D;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).isOptionalArg();
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v13));
    Object v15 = false;
    ((com.google.javascript.rhino.Node)v14).setVarArgs((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v14));
    Object v18 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v17));
    Object v19 = -42.417499036233416D;
    Object v20 = 1;
    Object v21 = 0;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 1;
    Object v24 = ((com.google.javascript.rhino.Node)v22).getIntProp((((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isExceptionPossible(((com.google.javascript.rhino.Node)v22));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isOptionalArg();
    Object v9 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v10 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isExceptionPossible(((com.google.javascript.rhino.Node)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isOptionalArg();
    Object v9 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v10 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = ">=";
    Object v1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).skipFinallyNodes(((com.google.javascript.rhino.Node)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v5));
    Object v7 = -42.417499036233416D;
    Object v8 = 1;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isExceptionPossible(((com.google.javascript.rhino.Node)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = -42.417499036233416D;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).isOptionalArg();
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v13));
    Object v15 = false;
    ((com.google.javascript.rhino.Node)v14).setVarArgs((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v14));
    Object v18 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v17));
    Object v19 = -42.417499036233416D;
    Object v20 = 1;
    Object v21 = 0;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isExceptionPossible(((com.google.javascript.rhino.Node)v22));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = -42.417499036233416D;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).isOptionalArg();
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v13));
    Object v15 = false;
    ((com.google.javascript.rhino.Node)v14).setVarArgs((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v14));
    Object v18 = 0.0D;
    ((com.google.javascript.rhino.Node)v17).setDouble((((java.lang.Double)v18).doubleValue()));
    Object v19 = null;
    Object v20 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isExceptionPossible(((com.google.javascript.rhino.Node)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).getExceptionHandler(((com.google.javascript.rhino.Node)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = -42.417499036233416D;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).isOptionalArg();
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v13));
    Object v15 = false;
    ((com.google.javascript.rhino.Node)v14).setVarArgs((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v14));
    Object v18 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v17));
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = false;
    Object v22 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v21).booleanValue()));
    Object v23 = false;
    Object v24 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v23).booleanValue()));
    Object v25 = -42.417499036233416D;
    Object v26 = 1;
    Object v27 = 0;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v28).isOptionalArg();
    Object v30 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v24).optimizeSubtree(((com.google.javascript.rhino.Node)v28));
    Object v31 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v22).optimizeSubtree(((com.google.javascript.rhino.Node)v30));
    Object v32 = ((com.google.javascript.rhino.Node)v31).wasEmptyNode();
    Object v33 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v20).optimizeSubtree(((com.google.javascript.rhino.Node)v31));
    Object v34 = "";
    ((com.google.javascript.rhino.Node)v33).addSuppression(((java.lang.String)v34));
    Object v35 = null;
    Object v36 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v33));
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = -42.417499036233416D;
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v9).optimizeSubtree(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v16));
    Object v18 = true;
    Object v19 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = -42.417499036233416D;
    Object v23 = 1;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v21).optimizeSubtree(((com.google.javascript.rhino.Node)v25));
    Object v27 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v19).optimizeSubtree(((com.google.javascript.rhino.Node)v26));
    Object v28 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v27));
    Object v29 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isExceptionPossible(((com.google.javascript.rhino.Node)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = -42.417499036233416D;
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).isOptionalArg();
    Object v15 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v9).optimizeSubtree(((com.google.javascript.rhino.Node)v13));
    Object v16 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v15));
    Object v17 = false;
    ((com.google.javascript.rhino.Node)v16).setVarArgs((((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
    Object v19 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v16));
    Object v20 = 0.0D;
    ((com.google.javascript.rhino.Node)v19).setDouble((((java.lang.Double)v20).doubleValue()));
    Object v21 = null;
    Object v22 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v19));
    Object v23 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isPure(((com.google.javascript.rhino.Node)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -42.417499036233416D;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isExceptionPossible(((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v13 = true;
    Object v14 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = -42.417499036233416D;
    Object v18 = 1;
    Object v19 = 0;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v16).optimizeSubtree(((com.google.javascript.rhino.Node)v20));
    Object v22 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v14).optimizeSubtree(((com.google.javascript.rhino.Node)v21));
    Object v23 = 24;
    ((com.google.javascript.rhino.Node)v22).setLength((((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = true;
    Object v26 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v25).booleanValue()));
    Object v27 = true;
    Object v28 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v27).booleanValue()));
    Object v29 = false;
    Object v30 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v29).booleanValue()));
    Object v31 = -42.417499036233416D;
    Object v32 = 1;
    Object v33 = 0;
    Object v34 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v30).optimizeSubtree(((com.google.javascript.rhino.Node)v34));
    Object v36 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v28).optimizeSubtree(((com.google.javascript.rhino.Node)v35));
    Object v37 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v26).optimizeSubtree(((com.google.javascript.rhino.Node)v36));
    Object v38 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isOptionalArg();
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v13 = "";
    ((com.google.javascript.rhino.Node)v12).addSuppression(((java.lang.String)v13));
    Object v14 = null;
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = -42.417499036233416D;
    Object v20 = 1;
    Object v21 = 0;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v18).optimizeSubtree(((com.google.javascript.rhino.Node)v22));
    Object v24 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v16).optimizeSubtree(((com.google.javascript.rhino.Node)v23));
    Object v25 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v24));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -42.417499036233416D;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = false;
    Object v13 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = -42.417499036233416D;
    Object v15 = 1;
    Object v16 = 0;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v13).optimizeSubtree(((com.google.javascript.rhino.Node)v17));
    Object v19 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v11).optimizeSubtree(((com.google.javascript.rhino.Node)v18));
    Object v20 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v9).optimizeSubtree(((com.google.javascript.rhino.Node)v19));
    Object v21 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v20));
    Object v22 = true;
    Object v23 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = false;
    Object v25 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = -42.417499036233416D;
    Object v27 = 1;
    Object v28 = 0;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v25).optimizeSubtree(((com.google.javascript.rhino.Node)v29));
    Object v31 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v23).optimizeSubtree(((com.google.javascript.rhino.Node)v30));
    Object v32 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v7).optimizeSubtree(((com.google.javascript.rhino.Node)v31));
    Object v33 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).areMatchingExits(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -42.417499036233416D;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isOptionalArg();
    Object v11 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v5).optimizeSubtree(((com.google.javascript.rhino.Node)v9));
    Object v12 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v3).optimizeSubtree(((com.google.javascript.rhino.Node)v11));
    Object v13 = ((com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax)v1).isExceptionPossible(((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "OFF";
    Object v1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }
}
