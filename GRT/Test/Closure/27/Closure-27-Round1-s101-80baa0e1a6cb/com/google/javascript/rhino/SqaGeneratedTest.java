package com.google.javascript.rhino;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.thisNode();
    Object v1 = ((com.google.javascript.rhino.Node)v0).toString();
    Object v2 = com.google.javascript.rhino.IR.thisNode();
    Object v3 = com.google.javascript.rhino.IR.propdef(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.thisNode();
    Object v1 = new com.google.javascript.rhino.Node[]{null,null,null};
    Object v2 = com.google.javascript.rhino.IR.switchNode(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.thisNode();
    Object v1 = com.google.javascript.rhino.IR.thisNode();
    Object v2 = com.google.javascript.rhino.IR.var(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{null};
    Object v1 = com.google.javascript.rhino.IR.arraylit(((com.google.javascript.rhino.Node[])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{null,null};
    Object v1 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "V";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "V";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.rhino.IR.newNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "V";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getJSDocInfo();
    Object v3 = "V";
    Object v4 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.newNode(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node[])v5));
    Object v7 = "V";
    Object v8 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v7));
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = com.google.javascript.rhino.IR.newNode(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node[])v9));
    Object v11 = ((com.google.javascript.rhino.Node)v6).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v10));
    Object v12 = "V";
    Object v13 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v12));
    Object v14 = com.google.javascript.rhino.IR.forIn(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "V";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.rhino.IR.newNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.newNode(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "V";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
    Object v2 = "V";
    Object v3 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v2));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.newNode(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node[])v4));
    Object v6 = com.google.javascript.rhino.IR.getelem(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{null};
    Object v1 = com.google.javascript.rhino.IR.paramList(((com.google.javascript.rhino.Node[])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "V";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.rhino.IR.newNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    Object v4 = "V";
    Object v5 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.newNode(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node[])v6));
    Object v8 = "V";
    Object v9 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isVarArgs();
    Object v11 = com.google.javascript.rhino.IR.forIn(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.paramList();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "V";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.rhino.IR.newNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    Object v4 = com.google.javascript.rhino.IR.paramList();
    Object v5 = ((com.google.javascript.rhino.Node)v4).getStaticSourceFile();
    Object v6 = com.google.javascript.rhino.IR.getelem(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.thisNode();
    Object v1 = "V";
    Object v2 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v1));
    Object v3 = "V";
    Object v4 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.newNode(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node[])v5));
    Object v7 = ((com.google.javascript.rhino.Node)v2).clonePropsFrom(((com.google.javascript.rhino.Node)v6));
    Object v8 = com.google.javascript.rhino.IR.paramList();
    Object v9 = "V";
    Object v10 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v9));
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = com.google.javascript.rhino.IR.newNode(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node[])v11));
    Object v13 = com.google.javascript.rhino.IR.forNode(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.thisNode();
    Object v1 = "V";
    Object v2 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v1));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.newNode(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node[])v3));
    Object v5 = com.google.javascript.rhino.IR.var(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = new com.google.javascript.rhino.Node[]{};
    Object v2 = com.google.javascript.rhino.IR.call(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.paramList();
    Object v1 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v0).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v1));
    Object v2 = null;
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).toString();
    Object v6 = com.google.javascript.rhino.IR.var(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{null,null,null};
    Object v1 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{null,null};
    Object v1 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v0));
    Object v2 = com.google.javascript.rhino.IR.block(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.arraylit(((com.google.javascript.rhino.Node[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "V";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.rhino.IR.newNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = com.google.javascript.rhino.IR.comma(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.arraylit(((com.google.javascript.rhino.Node[])v0));
    Object v2 = new com.google.javascript.rhino.Node[]{null,null,null};
    Object v3 = com.google.javascript.rhino.IR.call(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v0));
    Object v2 = com.google.javascript.rhino.IR.paramList();
    Object v3 = com.google.javascript.rhino.IR.trueNode();
    Object v4 = new com.google.javascript.rhino.JSDocInfo();
    Object v5 = new com.google.javascript.rhino.JSDocInfo();
    Object v6 = com.google.javascript.rhino.IR.paramList();
    Object v7 = "V";
    Object v8 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v7));
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = com.google.javascript.rhino.IR.newNode(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node[])v9));
    Object v11 = java.util.List.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v10));
    Object v12 = com.google.javascript.rhino.IR.paramList(((java.util.List)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.rhino.IR.trueNode();
    Object v2 = com.google.javascript.rhino.IR.trueNode();
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.call(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node[])v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).wasEmptyNode();
    Object v6 = com.google.javascript.rhino.IR.function(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = new com.google.javascript.rhino.Node[]{};
    Object v2 = com.google.javascript.rhino.IR.call(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node[])v1));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.arraylit(((com.google.javascript.rhino.Node[])v3));
    Object v5 = com.google.javascript.rhino.IR.catchNode(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.rhino.IR.trueNode();
    Object v2 = com.google.javascript.rhino.IR.paramList();
    Object v3 = com.google.javascript.rhino.IR.tryCatchFinally(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.arraylit(((com.google.javascript.rhino.Node[])v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.rhino.IR.arraylit(((com.google.javascript.rhino.Node[])v2));
    Object v4 = ((com.google.javascript.rhino.Node)v1).srcrefTree(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.rhino.IR.trueNode();
    Object v6 = com.google.javascript.rhino.IR.var(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = new com.google.javascript.rhino.Node[]{null};
    Object v2 = com.google.javascript.rhino.IR.call(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    ((com.google.javascript.rhino.Node)v0).detachChildren();
    Object v1 = null;
    Object v2 = com.google.javascript.rhino.IR.empty();
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = com.google.javascript.rhino.IR.paramList();
    Object v5 = "prototype";
    Object v6 = "_";
    Object v7 = java.io.InputStream.nullInputStream();
    Object v8 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v5),((java.lang.String)v6),((java.io.InputStream)v7));
    ((com.google.javascript.rhino.Node)v4).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v8));
    Object v9 = null;
    Object v10 = com.google.javascript.rhino.IR.forNode(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.rhino.IR.voidNode(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.rhino.IR.empty();
    Object v2 = com.google.javascript.rhino.IR.var(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = new com.google.javascript.rhino.Node[]{null,null};
    Object v2 = com.google.javascript.rhino.IR.switchNode(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node[])v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.paramList();
    Object v1 = new com.google.javascript.rhino.Node[]{};
    Object v2 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v1));
    Object v3 = com.google.javascript.rhino.IR.paramList();
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = com.google.javascript.rhino.IR.forNode(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{null,null,null};
    Object v1 = com.google.javascript.rhino.IR.paramList(((com.google.javascript.rhino.Node[])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "{0Q} error(s), {1} warning(s), {2,number,#.#}% typed";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{null,null};
    Object v1 = com.google.javascript.rhino.IR.arraylit(((com.google.javascript.rhino.Node[])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = new com.google.javascript.rhino.Node[]{null};
    Object v2 = com.google.javascript.rhino.IR.switchNode(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{null,null,null};
    Object v1 = com.google.javascript.rhino.IR.block(((com.google.javascript.rhino.Node[])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = ")";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "V";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.rhino.IR.newNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.call(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node[])v5));
    Object v7 = com.google.javascript.rhino.IR.assign(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.paramList(((com.google.javascript.rhino.Node[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.rhino.IR.empty();
    Object v2 = 0;
    ((com.google.javascript.rhino.Node)v1).setLineno((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.rhino.IR.and(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = ")";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
    Object v2 = ")";
    Object v3 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v2));
    Object v4 = com.google.javascript.rhino.IR.propdef(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = ((com.google.javascript.rhino.Node)v0).getLength();
    Object v2 = "V";
    Object v3 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v2));
    Object v4 = com.google.javascript.rhino.IR.comma(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{null};
    Object v1 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = new com.google.javascript.rhino.Node[]{null,null};
    Object v2 = com.google.javascript.rhino.IR.call(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.thisNode();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.continueNode();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = ((com.google.javascript.rhino.Node)v0).getDirectives();
    Object v2 = com.google.javascript.rhino.IR.trueNode();
    Object v3 = com.google.javascript.rhino.IR.tryFinally(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.arraylit(((com.google.javascript.rhino.Node[])v0));
    Object v2 = "V";
    Object v3 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v3).cloneTree();
    Object v5 = com.google.javascript.rhino.IR.getprop(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.arraylit(((com.google.javascript.rhino.Node[])v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.rhino.IR.arraylit(((com.google.javascript.rhino.Node[])v2));
    Object v4 = ")";
    Object v5 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getSourceOffset();
    Object v7 = com.google.javascript.rhino.IR.forIn(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = com.google.javascript.rhino.IR.number((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = ((com.google.javascript.rhino.Node)v0).getSourceFileName();
    Object v2 = com.google.javascript.rhino.IR.regexp(((com.google.javascript.rhino.Node)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = new com.google.javascript.rhino.Node[]{};
    Object v2 = com.google.javascript.rhino.IR.call(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node[])v1));
    Object v3 = com.google.javascript.rhino.IR.empty();
    Object v4 = "{0Q} error(s), {1} warning(s), {2,number,#.#}% typed";
    Object v5 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v3).checkTreeEquals(((com.google.javascript.rhino.Node)v5));
    Object v7 = com.google.javascript.rhino.IR.var(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "(";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "{0Q} error(s), {1} warning(s), {2,number,#.#}% typed";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{null,null};
    Object v3 = com.google.javascript.rhino.IR.newNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.arraylit(((com.google.javascript.rhino.Node[])v0));
    Object v2 = ")";
    Object v3 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v2));
    Object v4 = "{0Q} error(s), {1} warning(s), {2,number,#.#}% typed";
    Object v5 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v4));
    Object v6 = com.google.javascript.rhino.IR.forIn(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.returnNode();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.rhino.IR.trueNode();
    Object v2 = com.google.javascript.rhino.IR.voidNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.rhino.IR.tryFinally(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.falseNode();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.rhino.IR.returnNode();
    Object v2 = com.google.javascript.rhino.IR.label(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "(";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
    Object v2 = "{0Q} error(s), {1} warning(s), {2,number,#.#}% typed";
    Object v3 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v2));
    Object v4 = "{0Q} error(s), {1} warning(s), {2,number,#.#}% typed";
    Object v5 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v4));
    Object v6 = com.google.javascript.rhino.IR.ifNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = ")";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).toStringTree();
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v3));
    Object v5 = com.google.javascript.rhino.IR.trueNode();
    Object v6 = com.google.javascript.rhino.IR.voidNode(((com.google.javascript.rhino.Node)v5));
    Object v7 = com.google.javascript.rhino.IR.forIn(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.rhino.IR.falseNode();
    Object v2 = com.google.javascript.rhino.IR.propdef(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v0));
    Object v2 = com.google.javascript.rhino.IR.paramList();
    Object v3 = com.google.javascript.rhino.IR.trueNode();
    Object v4 = new com.google.javascript.rhino.JSDocInfo();
    Object v5 = new com.google.javascript.rhino.JSDocInfo();
    Object v6 = com.google.javascript.rhino.IR.paramList();
    Object v7 = "V";
    Object v8 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v7));
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = com.google.javascript.rhino.IR.newNode(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node[])v9));
    Object v11 = java.util.List.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v10));
    Object v12 = ((java.util.Collection)v11).parallelStream();
    Object v13 = com.google.javascript.rhino.IR.paramList(((java.util.List)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.arraylit(((com.google.javascript.rhino.Node[])v0));
    Object v2 = "{0Q} error(s), {1} warning(s), {2,number,#.#}% typed";
    Object v3 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v2));
    Object v4 = com.google.javascript.rhino.IR.sheq(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v0));
    Object v2 = "(";
    Object v3 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v2));
    Object v4 = com.google.javascript.rhino.IR.tryCatch(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.returnNode();
    Object v1 = com.google.javascript.rhino.IR.not(((com.google.javascript.rhino.Node)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{null};
    Object v1 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = new com.google.javascript.rhino.Node[]{};
    Object v2 = com.google.javascript.rhino.IR.arraylit(((com.google.javascript.rhino.Node[])v1));
    Object v3 = com.google.javascript.rhino.IR.doNode(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.arraylit(((com.google.javascript.rhino.Node[])v0));
    Object v2 = com.google.javascript.rhino.IR.trueNode();
    Object v3 = com.google.javascript.rhino.IR.caseNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = new com.google.javascript.rhino.Node[]{};
    Object v2 = com.google.javascript.rhino.IR.call(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node[])v1));
    Object v3 = com.google.javascript.rhino.IR.defaultCase(((com.google.javascript.rhino.Node)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.breakNode();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.breakNode();
    Object v1 = com.google.javascript.rhino.IR.falseNode();
    Object v2 = com.google.javascript.rhino.IR.trueNode();
    Object v3 = com.google.javascript.rhino.IR.ifNode(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.paramList(((com.google.javascript.rhino.Node[])v0));
    Object v2 = 1;
    ((com.google.javascript.rhino.Node)v1).setLength((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.rhino.IR.pos(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "(";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
    Object v2 = com.google.javascript.rhino.IR.breakNode();
    Object v3 = com.google.javascript.rhino.IR.continueNode();
    Object v4 = false;
    ((com.google.javascript.rhino.Node)v3).setOptionalArg((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.forIn(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = new com.google.javascript.rhino.Node[]{};
    Object v2 = com.google.javascript.rhino.IR.call(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node[])v1));
    Object v3 = com.google.javascript.rhino.IR.var(((com.google.javascript.rhino.Node)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.rhino.IR.voidNode(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.rhino.IR.falseNode();
    Object v3 = ((com.google.javascript.rhino.Node)v2).isNoSideEffectsCall();
    Object v4 = com.google.javascript.rhino.IR.tryCatch(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.continueNode();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = com.google.javascript.rhino.IR.caseNode(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.arraylit(((com.google.javascript.rhino.Node[])v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).toStringTree();
    Object v3 = com.google.javascript.rhino.IR.empty();
    Object v4 = com.google.javascript.rhino.IR.var(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.arraylit(((com.google.javascript.rhino.Node[])v0));
    Object v2 = com.google.javascript.rhino.IR.regexp(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "{0Q} error(s), {1} warning(s), {2,number,#.#}% typed";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{null};
    Object v3 = com.google.javascript.rhino.IR.newNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.breakNode();
    Object v1 = com.google.javascript.rhino.IR.trueNode();
    Object v2 = "(";
    Object v3 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v2));
    Object v4 = com.google.javascript.rhino.IR.forIn(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.breakNode();
    Object v1 = com.google.javascript.rhino.IR.defaultCase(((com.google.javascript.rhino.Node)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.falseNode();
    Object v1 = com.google.javascript.rhino.IR.returnNode();
    Object v2 = com.google.javascript.rhino.IR.paramList();
    Object v3 = 1;
    Object v4 = ((com.google.javascript.rhino.Node)v2).getIntProp((((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.rhino.IR.trueNode();
    Object v6 = com.google.javascript.rhino.IR.forNode(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.returnNode();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = ((com.google.javascript.rhino.Node)v1).cloneNode();
    Object v3 = com.google.javascript.rhino.IR.comma(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.arraylit(((com.google.javascript.rhino.Node[])v0));
    Object v2 = com.google.javascript.rhino.IR.pos(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.block(((com.google.javascript.rhino.Node[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.paramList(((com.google.javascript.rhino.Node[])v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.rhino.IR.block(((com.google.javascript.rhino.Node[])v2));
    Object v4 = com.google.javascript.rhino.IR.add(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.rhino.Node[]{};
    Object v1 = com.google.javascript.rhino.IR.arraylit(((com.google.javascript.rhino.Node[])v0));
    Object v2 = com.google.javascript.rhino.IR.voidNode(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "{0Q} error(s), {1} warning(s), {2,number,#.#}% typed";
    Object v1 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.rhino.IR.block(((com.google.javascript.rhino.Node[])v2));
    Object v4 = com.google.javascript.rhino.IR.doNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.stringKey(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.Node[]{null,null};
    Object v1 = com.google.javascript.rhino.IR.block(((com.google.javascript.rhino.Node[])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.falseNode();
    Object v1 = com.google.javascript.rhino.IR.throwNode(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertNotNull(v1);
  }
}
