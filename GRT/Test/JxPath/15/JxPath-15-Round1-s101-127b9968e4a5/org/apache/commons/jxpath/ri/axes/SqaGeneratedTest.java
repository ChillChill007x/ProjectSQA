package org.apache.commons.jxpath.ri.axes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.axes.NodeSetContext)v8).getCurrentNodePointer();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getContextNodeList();
    Object v10 = 17;
    Object v11 = ((org.apache.commons.jxpath.ri.axes.UnionContext)v8).setPosition((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.EvalContext)v6).isChildOrderingRequired();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.EvalContext)v6).getRootContext();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.EvalContext)v6).toString();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.axes.NodeSetContext)v8).nextSet();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.EvalContext)v6).next();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.axes.UnionContext)v8).getDocumentOrder();
    org.junit.Assert.assertEquals((Object)(1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = 19;
    Object v10 = ((org.apache.commons.jxpath.ri.axes.UnionContext)v8).setPosition((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.EvalContext)v6).getSingleNodePointer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.EvalContext)v6).getContextNodeList();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = 0;
    Object v8 = ((org.apache.commons.jxpath.ri.EvalContext)v6).setPosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v6).isChildOrderingRequired();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.axes.NodeSetContext)v8).nextNode();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.axes.UnionContext)v8).getDocumentOrder();
    org.junit.Assert.assertEquals((Object)(1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).next();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getJXPathContext();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.axes.NodeSetContext)v8).getCurrentNodePointer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).hasNext();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getRootContext();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).toString();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getSingleNodePointer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.axes.NodeSetContext)v8).nextSet();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getDocumentOrder();
    Object v10 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getContextNodePointer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    ((org.apache.commons.jxpath.ri.EvalContext)v8).reset();
    Object v9 = null;
    Object v10 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getContextNodeList();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getContextNodeList();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    ((org.apache.commons.jxpath.ri.EvalContext)v8).reset();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).nextSet();
    Object v10 = ((org.apache.commons.jxpath.ri.EvalContext)v8).isChildOrderingRequired();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = 0;
    Object v10 = ((org.apache.commons.jxpath.ri.axes.UnionContext)v8).setPosition((((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v10 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.axes.NodeSetContext)v8).nextNode();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getPosition();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    ((org.apache.commons.jxpath.ri.EvalContext)v8).reset();
    Object v9 = null;
    Object v10 = ((org.apache.commons.jxpath.ri.EvalContext)v8).hasNext();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.axes.UnionContext)v8).getDocumentOrder();
    Object v10 = ((org.apache.commons.jxpath.ri.axes.UnionContext)v8).getDocumentOrder();
    org.junit.Assert.assertEquals((Object)(1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getContextNodePointer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.axes.NodeSetContext)v8).getNodeSet();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.EvalContext)v6).hasNext();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v10 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v9));
    Object v11 = ((org.apache.commons.jxpath.ri.EvalContext)v10).isChildOrderingRequired();
    Object v12 = ((org.apache.commons.jxpath.ri.EvalContext)v10).getValue();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v10 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v9));
    Object v11 = ((org.apache.commons.jxpath.ri.EvalContext)v10).getNodeSet();
    Object v12 = ((org.apache.commons.jxpath.ri.EvalContext)v10).next();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v10 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v9));
    Object v11 = ((org.apache.commons.jxpath.ri.axes.UnionContext)v10).getDocumentOrder();
    org.junit.Assert.assertEquals((Object)(1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = -2147483643;
    Object v10 = ((org.apache.commons.jxpath.ri.axes.UnionContext)v8).setPosition((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v10 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v9));
    ((org.apache.commons.jxpath.ri.EvalContext)v10).reset();
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.EvalContext)v10).hasNext();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    ((org.apache.commons.jxpath.ri.EvalContext)v6).reset();
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.EvalContext)v6).getCurrentPosition();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.EvalContext)v6).isChildOrderingRequired();
    Object v8 = ((org.apache.commons.jxpath.ri.EvalContext)v6).toString();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).nextSet();
    Object v10 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getValue();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v10 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v9));
    Object v11 = ((org.apache.commons.jxpath.ri.axes.NodeSetContext)v10).getCurrentNodePointer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    ((org.apache.commons.jxpath.ri.EvalContext)v8).reset();
    Object v9 = null;
    Object v10 = ((org.apache.commons.jxpath.ri.EvalContext)v8).isChildOrderingRequired();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    ((org.apache.commons.jxpath.ri.EvalContext)v8).remove();
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v10 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v9));
    Object v11 = ((org.apache.commons.jxpath.ri.EvalContext)v10).hasNext();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    ((org.apache.commons.jxpath.ri.EvalContext)v6).remove();
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = -39;
    Object v10 = ((org.apache.commons.jxpath.ri.axes.UnionContext)v8).setPosition((((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v10 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v9));
    Object v11 = ((org.apache.commons.jxpath.ri.EvalContext)v10).getContextNodeList();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.EvalContext)v6).getCurrentPosition();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = 14;
    Object v10 = ((org.apache.commons.jxpath.ri.axes.UnionContext)v8).setPosition((((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.axes.NodeSetContext)v8).nextSet();
    Object v10 = ((org.apache.commons.jxpath.ri.axes.NodeSetContext)v8).nextSet();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null};
    Object v10 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null};
    Object v10 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v9));
    Object v11 = ((org.apache.commons.jxpath.ri.EvalContext)v10).getSingleNodePointer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v10 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v9));
    ((org.apache.commons.jxpath.ri.EvalContext)v10).remove();
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.axes.NodeSetContext)v8).nextSet();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getDocumentOrder();
    Object v10 = ((org.apache.commons.jxpath.ri.EvalContext)v8).next();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).isChildOrderingRequired();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null};
    Object v10 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v9));
    Object v11 = ((org.apache.commons.jxpath.ri.EvalContext)v10).getContextNodeList();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).next();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).isChildOrderingRequired();
    Object v10 = ((org.apache.commons.jxpath.ri.EvalContext)v8).isChildOrderingRequired();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.axes.UnionContext)v8).getDocumentOrder();
    Object v10 = ((org.apache.commons.jxpath.ri.axes.UnionContext)v8).getDocumentOrder();
    org.junit.Assert.assertEquals((Object)(1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).toString();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.axes.UnionContext)v8).getDocumentOrder();
    org.junit.Assert.assertEquals((Object)(1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getNodeSet();
    Object v10 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v11 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null};
    Object v10 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v9));
    Object v11 = ((org.apache.commons.jxpath.ri.axes.NodeSetContext)v10).nextSet();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.axes.NodeSetContext)v8).getCurrentNodePointer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getNodeSet();
    Object v10 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v11 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v10));
    Object v12 = ((org.apache.commons.jxpath.ri.EvalContext)v11).getSingleNodePointer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = null;
    ((java.util.Iterator)v8).forEachRemaining(((java.util.function.Consumer)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).toString();
    org.junit.Assert.assertEquals((Object)("Empty expression context"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null};
    Object v10 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v9));
    Object v11 = ((org.apache.commons.jxpath.ri.EvalContext)v10).hasNext();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getNodeSet();
    Object v10 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v11 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v10));
    Object v12 = ((org.apache.commons.jxpath.ri.EvalContext)v11).getRootContext();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null};
    Object v10 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v9));
    Object v11 = ((org.apache.commons.jxpath.ri.axes.NodeSetContext)v10).getCurrentNodePointer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = 0;
    Object v10 = ((org.apache.commons.jxpath.ri.axes.UnionContext)v8).setPosition((((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getNodeSet();
    Object v10 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v11 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v10));
    Object v12 = ((org.apache.commons.jxpath.ri.EvalContext)v11).getNodeSet();
    Object v13 = ((org.apache.commons.jxpath.ri.EvalContext)v11).getSingleNodePointer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getNodeSet();
    Object v10 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v11 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v10));
    Object v12 = ((org.apache.commons.jxpath.ri.EvalContext)v11).next();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).hasNext();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    ((org.apache.commons.jxpath.ri.EvalContext)v8).reset();
    Object v9 = null;
    Object v10 = ((org.apache.commons.jxpath.ri.axes.NodeSetContext)v8).getCurrentNodePointer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getNodeSet();
    Object v10 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v11 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v10));
    Object v12 = ((org.apache.commons.jxpath.ri.axes.NodeSetContext)v11).getCurrentNodePointer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getDocumentOrder();
    Object v10 = ((org.apache.commons.jxpath.ri.EvalContext)v8).isChildOrderingRequired();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    ((org.apache.commons.jxpath.ri.EvalContext)v8).reset();
    Object v9 = null;
    Object v10 = ((org.apache.commons.jxpath.ri.EvalContext)v8).isChildOrderingRequired();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getDocumentOrder();
    Object v10 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getContextNodeList();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = 60;
    Object v10 = ((org.apache.commons.jxpath.ri.axes.UnionContext)v8).setPosition((((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getNodeSet();
    Object v10 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v11 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v10));
    Object v12 = ((org.apache.commons.jxpath.ri.EvalContext)v11).getContextNodeList();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getNodeSet();
    Object v10 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v11 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v10));
    Object v12 = ((org.apache.commons.jxpath.ri.axes.NodeSetContext)v11).nextSet();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = 1;
    Object v10 = ((org.apache.commons.jxpath.ri.axes.UnionContext)v8).setPosition((((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).nextSet();
    Object v10 = ((org.apache.commons.jxpath.ri.EvalContext)v8).toString();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getValue();
    Object v10 = ((org.apache.commons.jxpath.ri.EvalContext)v8).next();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v10 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v9));
    Object v11 = ((org.apache.commons.jxpath.ri.EvalContext)v10).toString();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).nextSet();
    Object v10 = ((org.apache.commons.jxpath.ri.EvalContext)v8).next();
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getNodeSet();
    Object v10 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getRootContext();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v8).getNodeSet();
    Object v10 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v11 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v10));
    Object v12 = ((org.apache.commons.jxpath.ri.axes.NodeSetContext)v11).getNodeSet();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null};
    Object v10 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v9));
    Object v11 = ((org.apache.commons.jxpath.ri.axes.UnionContext)v10).getDocumentOrder();
    org.junit.Assert.assertEquals((Object)(1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    ((org.apache.commons.jxpath.ri.EvalContext)v8).reset();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null,null};
    Object v8 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v6),((org.apache.commons.jxpath.ri.EvalContext[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.EvalContext[]{null,null};
    Object v10 = new org.apache.commons.jxpath.ri.axes.UnionContext(((org.apache.commons.jxpath.ri.EvalContext)v8),((org.apache.commons.jxpath.ri.EvalContext[])v9));
    Object v11 = -10;
    Object v12 = ((org.apache.commons.jxpath.ri.axes.UnionContext)v10).setPosition((((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "lang";
    Object v5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.axes.DescendantContext(((org.apache.commons.jxpath.ri.EvalContext)v0),(((java.lang.Boolean)v1).booleanValue()),((org.apache.commons.jxpath.ri.compiler.NodeTest)v5));
    Object v7 = 0;
    Object v8 = ((org.apache.commons.jxpath.ri.EvalContext)v6).setPosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.jxpath.ri.EvalContext)v6).next();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
