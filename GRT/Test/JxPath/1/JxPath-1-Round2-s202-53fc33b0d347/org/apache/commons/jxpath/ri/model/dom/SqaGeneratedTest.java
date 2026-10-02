package org.apache.commons.jxpath.ri.model.dom;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).isContainer();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getLocale();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "p";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v1));
    Object v3 = "p";
    Object v4 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3));
    Object v5 = java.util.Locale.Category.FORMAT;
    Object v6 = java.util.Locale.getDefault(((java.util.Locale.Category)v5));
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v4),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isContainer();
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = "count";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v0).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getValuePointer();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = "p";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = "p";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10));
    Object v12 = java.util.Locale.Category.FORMAT;
    Object v13 = java.util.Locale.getDefault(((java.util.Locale.Category)v12));
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v11),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).clone();
    Object v16 = "p";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16));
    Object v18 = "p";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18));
    Object v20 = java.util.Locale.Category.FORMAT;
    Object v21 = java.util.Locale.getDefault(((java.util.Locale.Category)v20));
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v17),((java.lang.Object)v19),((java.util.Locale)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getValuePointer();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNode();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getParent();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getImmediateNode();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNode();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = "p";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = "p";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10));
    Object v12 = java.util.Locale.Category.FORMAT;
    Object v13 = java.util.Locale.getDefault(((java.util.Locale.Category)v12));
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v11),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).clone();
    Object v16 = "p";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16));
    Object v18 = "p";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18));
    Object v20 = java.util.Locale.Category.FORMAT;
    Object v21 = java.util.Locale.getDefault(((java.util.Locale.Category)v20));
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v17),((java.lang.Object)v19),((java.util.Locale)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getValuePointer();
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).isNode();
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = "p";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).compareTo(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "p";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = java.util.Locale.Category.FORMAT;
    Object v7 = java.util.Locale.getDefault(((java.util.Locale.Category)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).isRoot();
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v9),((java.util.Locale)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "+";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).getDefaultNamespaceURI();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "p";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isContainer();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = "p";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14));
    Object v16 = -33;
    Object v17 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).createChild(((org.apache.commons.jxpath.JXPathContext)v13),((org.apache.commons.jxpath.ri.QName)v15),(((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).getNamespaceURI(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = "p";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = "p";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10));
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getIndex();
    org.junit.Assert.assertEquals((Object)(-2147483648), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "i";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).getNamespaceURI(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "p";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = "p";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13));
    Object v15 = "p";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15));
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v12),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v16));
    Object v18 = "p";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18));
    Object v20 = "p";
    Object v21 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20));
    Object v22 = java.util.Locale.Category.FORMAT;
    Object v23 = java.util.Locale.getDefault(((java.util.Locale.Category)v22));
    Object v24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v19),((java.lang.Object)v21),((java.util.Locale)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).clone();
    Object v26 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v25));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).getName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "p";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = "p";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13));
    Object v15 = "p";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15));
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v12),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).equals(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "p";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = "p";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13));
    Object v15 = "p";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15));
    Object v17 = java.util.Locale.Category.FORMAT;
    Object v18 = java.util.Locale.getDefault(((java.util.Locale.Category)v17));
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v16),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).getNamespaceURI(((java.lang.String)v5));
    Object v7 = "/.o";
    Object v8 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).getNamespaceURI(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).asPath();
    org.junit.Assert.assertEquals((Object)("id('')"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "p";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isContainer();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = "p";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14));
    Object v16 = "p";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16));
    Object v18 = java.util.Locale.Category.FORMAT;
    Object v19 = java.util.Locale.getDefault(((java.util.Locale.Category)v18));
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v15),((java.lang.Object)v17),((java.util.Locale)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getNodeValue();
    Object v23 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).createAttribute(((org.apache.commons.jxpath.JXPathContext)v13),((org.apache.commons.jxpath.ri.QName)v22));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = "p";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = "p";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10));
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getRootNode();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = "p";
    Object v10 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v9));
    Object v11 = java.util.Locale.Category.FORMAT;
    Object v12 = java.util.Locale.getDefault(((java.util.Locale.Category)v11));
    Object v13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.Object)v10),((java.util.Locale)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(((org.w3c.dom.Node)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).remove();
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = "p";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = "p";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10));
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getValuePointer();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).remove();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "p";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getNode();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).setValue(((java.lang.Object)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getLength();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).toString();
    org.junit.Assert.assertEquals((Object)("id('')/namespace:: "), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getImmediateValuePointer();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "p";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getImmediateNode();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getNode();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).setValue(((java.lang.Object)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isNode();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = "p";
    Object v10 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v9));
    Object v11 = java.util.Locale.Category.FORMAT;
    Object v12 = java.util.Locale.getDefault(((java.util.Locale.Category)v11));
    Object v13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.Object)v10),((java.util.Locale)v12));
    Object v14 = null;
    Object v15 = java.util.Locale.Category.FORMAT;
    Object v16 = java.util.Locale.getDefault(((java.util.Locale.Category)v15));
    Object v17 = "";
    Object v18 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v14),((java.util.Locale)v16),((java.lang.String)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v18).hashCode();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).compareTo(((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getImmediateValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNamespaceResolver();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = "p";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = "p";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10));
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getNamespaceResolver();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = "p";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = "p";
    Object v10 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v9));
    Object v11 = java.util.Locale.Category.FORMAT;
    Object v12 = java.util.Locale.getDefault(((java.util.Locale.Category)v11));
    Object v13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.Object)v10),((java.util.Locale)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).isContainer();
    Object v15 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v14));
    Object v16 = "p";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16));
    Object v18 = "p";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18));
    Object v20 = java.util.Locale.Category.FORMAT;
    Object v21 = java.util.Locale.getDefault(((java.util.Locale.Category)v20));
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v17),((java.lang.Object)v19),((java.util.Locale)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getImmediateNode();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getNode();
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).createPath(((org.apache.commons.jxpath.JXPathContext)v15),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).isRoot();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = "p";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = "p";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10));
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getValuePointer();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).isNode();
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isAttribute();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "p";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isContainer();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = "Cannot invoke ";
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v13),((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).isLeaf();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).setValue(((java.lang.Object)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = "p";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = "p";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10));
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getValuePointer();
    Object v14 = java.util.Locale.Category.FORMAT;
    Object v15 = java.util.Locale.getDefault(((java.util.Locale.Category)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).compareTo(((java.lang.Object)v15));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).asPath();
    Object v6 = "p";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6));
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).setValue(((java.lang.Object)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).getDefaultNamespaceURI();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.String)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "p";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isContainer();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = "p";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14));
    Object v16 = "p";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.QName)v15).equals(((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).createAttribute(((org.apache.commons.jxpath.JXPathContext)v13),((org.apache.commons.jxpath.ri.QName)v15));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).isLanguage(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = null;
    Object v6 = java.util.Locale.Category.FORMAT;
    Object v7 = java.util.Locale.getDefault(((java.util.Locale.Category)v6));
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v5),((java.util.Locale)v7),((java.lang.String)v8));
    Object v10 = " ";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getImmediateValuePointer();
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "p";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = java.util.Locale.Category.FORMAT;
    Object v7 = java.util.Locale.getDefault(((java.util.Locale.Category)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).isRoot();
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v9),((java.util.Locale)v11));
    Object v13 = "p";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13));
    Object v15 = "p";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15));
    Object v17 = java.util.Locale.Category.FORMAT;
    Object v18 = java.util.Locale.getDefault(((java.util.Locale.Category)v17));
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v16),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).isRoot();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).compareTo(((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "p";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isContainer();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = "p";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14));
    Object v16 = -32;
    Object v17 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).createChild(((org.apache.commons.jxpath.JXPathContext)v13),((org.apache.commons.jxpath.ri.QName)v15),(((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "p";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = "p";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10));
    Object v12 = java.util.Locale.Category.FORMAT;
    Object v13 = java.util.Locale.getDefault(((java.util.Locale.Category)v12));
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v11),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).isContainer();
    Object v16 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v15));
    Object v17 = "*";
    Object v18 = "contins";
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getPointerByKey(((org.apache.commons.jxpath.JXPathContext)v16),((java.lang.String)v17),((java.lang.String)v18));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).asPath();
    Object v6 = "p";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6));
    Object v8 = "p";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).isContainer();
    Object v14 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.jxpath.JXPathContext)v14).getKeyManager();
    Object v16 = "S";
    Object v17 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v14),((java.lang.String)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "p";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getValuePointer();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v15 = "p";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15));
    Object v17 = "p";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17));
    Object v19 = java.util.Locale.Category.FORMAT;
    Object v20 = java.util.Locale.getDefault(((java.util.Locale.Category)v19));
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    Object v23 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v14),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).isLanguage(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = null;
    Object v6 = java.util.Locale.Category.FORMAT;
    Object v7 = java.util.Locale.getDefault(((java.util.Locale.Category)v6));
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v5),((java.util.Locale)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).isLanguage(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.String)v7));
    Object v9 = false;
    Object v10 = null;
    Object v11 = java.util.Locale.Category.FORMAT;
    Object v12 = java.util.Locale.getDefault(((java.util.Locale.Category)v11));
    Object v13 = "";
    Object v14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v10),((java.util.Locale)v12),((java.lang.String)v13));
    Object v15 = " ";
    Object v16 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v14).namespacePointer(((java.lang.String)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).isLeaf();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = "p";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6));
    Object v8 = "p";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v14 = "p";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14));
    Object v16 = "p";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16));
    Object v18 = java.util.Locale.Category.FORMAT;
    Object v19 = java.util.Locale.getDefault(((java.util.Locale.Category)v18));
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v15),((java.lang.Object)v17),((java.util.Locale)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getNodeValue();
    Object v23 = "p";
    Object v24 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v23));
    Object v25 = java.util.Locale.Category.FORMAT;
    Object v26 = java.util.Locale.getDefault(((java.util.Locale.Category)v25));
    Object v27 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v22),((java.lang.Object)v24),((java.util.Locale)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.model.NodePointer)v27).clone();
    Object v29 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v27));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getImmediateValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getValuePointer();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "p";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = java.util.Locale.Category.FORMAT;
    Object v7 = java.util.Locale.getDefault(((java.util.Locale.Category)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).isRoot();
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v9),((java.util.Locale)v11));
    Object v13 = "p";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13));
    Object v15 = "p";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15));
    Object v17 = java.util.Locale.Category.FORMAT;
    Object v18 = java.util.Locale.getDefault(((java.util.Locale.Category)v17));
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v16),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getNodeValue();
    Object v22 = "p";
    Object v23 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v22));
    Object v24 = java.util.Locale.Category.FORMAT;
    Object v25 = java.util.Locale.getDefault(((java.util.Locale.Category)v24));
    Object v26 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v21),((java.lang.Object)v23),((java.util.Locale)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).compareTo(((java.lang.Object)v26));
    org.junit.Assert.assertEquals((Object)(0), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = "p";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = "p";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10));
    Object v12 = java.util.Locale.Category.FORMAT;
    Object v13 = java.util.Locale.getDefault(((java.util.Locale.Category)v12));
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v11),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).clone();
    Object v16 = "p";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16));
    Object v18 = "p";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18));
    Object v20 = java.util.Locale.Category.FORMAT;
    Object v21 = java.util.Locale.getDefault(((java.util.Locale.Category)v20));
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v17),((java.lang.Object)v19),((java.util.Locale)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getValuePointer();
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).getLength();
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).getLocale();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).hashCode();
    Object v6 = null;
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = "";
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v6),((java.util.Locale)v8),((java.lang.String)v9));
    Object v11 = " ";
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).namespacePointer(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getValuePointer();
    Object v14 = null;
    Object v15 = java.util.Locale.Category.FORMAT;
    Object v16 = java.util.Locale.getDefault(((java.util.Locale.Category)v15));
    Object v17 = "";
    Object v18 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v14),((java.util.Locale)v16),((java.lang.String)v17));
    Object v19 = " ";
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v18).namespacePointer(((java.lang.String)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getImmediateValuePointer();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    org.junit.Assert.assertEquals((Object)(0), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getLocale();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).isLeaf();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getRootNode();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "<";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).isLanguage(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "p";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isContainer();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = "u";
    Object v15 = "p";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.servlet.KeywordVariables(((java.lang.String)v14),((java.lang.Object)v16));
    ((org.apache.commons.jxpath.JXPathContext)v13).setVariables(((org.apache.commons.jxpath.Variables)v17));
    Object v18 = null;
    Object v19 = "p";
    Object v20 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v19));
    Object v21 = null;
    Object v22 = java.util.Locale.Category.FORMAT;
    Object v23 = java.util.Locale.getDefault(((java.util.Locale.Category)v22));
    Object v24 = "";
    Object v25 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v21),((java.util.Locale)v23),((java.lang.String)v24));
    Object v26 = " ";
    Object v27 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v25).namespacePointer(((java.lang.String)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.model.NodePointer)v27).getImmediateValuePointer();
    Object v29 = ((org.apache.commons.jxpath.ri.model.NodePointer)v28).getValuePointer();
    Object v30 = ((org.apache.commons.jxpath.ri.QName)v20).equals(((java.lang.Object)v29));
    Object v31 = 0;
    Object v32 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).createChild(((org.apache.commons.jxpath.JXPathContext)v13),((org.apache.commons.jxpath.ri.QName)v20),(((java.lang.Integer)v31).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getImmediateValuePointer();
    Object v8 = "p";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = "p";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10));
    Object v12 = java.util.Locale.Category.FORMAT;
    Object v13 = java.util.Locale.getDefault(((java.util.Locale.Category)v12));
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v11),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).isContainer();
    Object v16 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).createPath(((org.apache.commons.jxpath.JXPathContext)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = "p";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = "p";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10));
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getRootNode();
    Object v14 = null;
    Object v15 = java.util.Locale.Category.FORMAT;
    Object v16 = java.util.Locale.getDefault(((java.util.Locale.Category)v15));
    Object v17 = "";
    Object v18 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v14),((java.util.Locale)v16),((java.lang.String)v17));
    Object v19 = "p";
    Object v20 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v19));
    Object v21 = "p";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v21));
    Object v23 = java.util.Locale.Category.FORMAT;
    Object v24 = java.util.Locale.getDefault(((java.util.Locale.Category)v23));
    Object v25 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v20),((java.lang.Object)v22),((java.util.Locale)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).clone();
    Object v27 = "p";
    Object v28 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v27));
    Object v29 = "p";
    Object v30 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v29));
    Object v31 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v26),((org.apache.commons.jxpath.ri.QName)v28),((java.lang.Object)v30));
    Object v32 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v18).equals(((java.lang.Object)v31));
    Object v33 = java.util.Locale.Category.FORMAT;
    Object v34 = java.util.Locale.getDefault(((java.util.Locale.Category)v33));
    Object v35 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v32),((java.util.Locale)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "p";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "p";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = java.util.Locale.Category.FORMAT;
    Object v7 = java.util.Locale.getDefault(((java.util.Locale.Category)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).isRoot();
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v9),((java.util.Locale)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).isNode();
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).isActual();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getImmediateValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getValuePointer();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v8).printPointerChain();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getImmediateValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getValuePointer();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).isRoot();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.String)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getImmediateValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getValuePointer();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getLength();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getNamespaceResolver();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "p";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isContainer();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = "\"lo/al-name\"";
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v13),((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getImmediateValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getValuePointer();
    Object v9 = "p";
    Object v10 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v9));
    Object v11 = "p";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11));
    Object v13 = "p";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13));
    Object v15 = java.util.Locale.Category.FORMAT;
    Object v16 = java.util.Locale.getDefault(((java.util.Locale.Category)v15));
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v14),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).isAttribute();
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.apache.commons.jxpath.ri.QName)v10),((java.lang.Object)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getLength();
    Object v8 = false;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v6).setAttribute((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "p";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).setValue(((java.lang.Object)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getImmediateValuePointer();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = "p";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).compareTo(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getImmediateValuePointer();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getNode();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "*";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).isLanguage(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).isCollection();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).isCollection();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getLocale();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).isAttribute();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getImmediateValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getValuePointer();
    Object v9 = "p";
    Object v10 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v9));
    Object v11 = "p";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11));
    Object v13 = "p";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13));
    Object v15 = java.util.Locale.Category.FORMAT;
    Object v16 = java.util.Locale.getDefault(((java.util.Locale.Category)v15));
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v14),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).isAttribute();
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.apache.commons.jxpath.ri.QName)v10),((java.lang.Object)v19));
    Object v21 = null;
    Object v22 = java.util.Locale.Category.FORMAT;
    Object v23 = java.util.Locale.getDefault(((java.util.Locale.Category)v22));
    Object v24 = "";
    Object v25 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v21),((java.util.Locale)v23),((java.lang.String)v24));
    Object v26 = null;
    Object v27 = java.util.Locale.Category.FORMAT;
    Object v28 = java.util.Locale.getDefault(((java.util.Locale.Category)v27));
    Object v29 = "";
    Object v30 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v26),((java.util.Locale)v28),((java.lang.String)v29));
    Object v31 = "";
    Object v32 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v30).isLanguage(((java.lang.String)v31));
    Object v33 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v25).equals(((java.lang.Object)v32));
    Object v34 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).compareTo(((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "p";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isContainer();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = "p";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14));
    Object v16 = -9;
    Object v17 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).createChild(((org.apache.commons.jxpath.JXPathContext)v13),((org.apache.commons.jxpath.ri.QName)v15),(((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "p";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isContainer();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = "p";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.QName)v15).toString();
    Object v17 = -19;
    Object v18 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).createChild(((org.apache.commons.jxpath.JXPathContext)v13),((org.apache.commons.jxpath.ri.QName)v15),(((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = null;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = "";
    Object v4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v6),((java.lang.String)v7));
    Object v9 = true;
    Object v10 = null;
    Object v11 = java.util.Locale.Category.FORMAT;
    Object v12 = java.util.Locale.getDefault(((java.util.Locale.Category)v11));
    Object v13 = "";
    Object v14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v10),((java.util.Locale)v12),((java.lang.String)v13));
    Object v15 = " ";
    Object v16 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v14).namespacePointer(((java.lang.String)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getImmediateValuePointer();
    Object v18 = "p";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).attributeIterator(((org.apache.commons.jxpath.ri.QName)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    org.junit.Assert.assertNotNull(v21);
  }
}
