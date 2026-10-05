package org.apache.commons.jxpath.ri.model.dom;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = "T";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = "T";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).compareTo(((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).isNode();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = "T";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11));
    Object v13 = "T";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13));
    Object v15 = "'";
    Object v16 = "'";
    Object v17 = "name";
    Object v18 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v14),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).isNode();
    Object v21 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v20));
    Object v22 = "substring-before";
    Object v23 = "'";
    Object v24 = "'";
    Object v25 = "name";
    Object v26 = new java.util.Locale(((java.lang.String)v23),((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = java.text.DecimalFormatSymbols.getInstance(((java.util.Locale)v26));
    ((org.apache.commons.jxpath.JXPathContext)v21).setDecimalFormatSymbols(((java.lang.String)v22),((java.text.DecimalFormatSymbols)v27));
    Object v28 = null;
    Object v29 = "T";
    Object v30 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v29));
    Object v31 = 0;
    Object v32 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).createChild(((org.apache.commons.jxpath.JXPathContext)v21),((org.apache.commons.jxpath.ri.QName)v30),(((java.lang.Integer)v31).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = "T";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11));
    Object v13 = "T";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13));
    Object v15 = "'";
    Object v16 = "'";
    Object v17 = "name";
    Object v18 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v14),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).isNode();
    Object v21 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v20));
    Object v22 = "~";
    Object v23 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v21),((java.lang.String)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getDefaultNamespaceURI();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getLocale();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getNode();
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getLanguage();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = "[";
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).namespacePointer(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ", operation is not allowed for t<is type of node";
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getNamespaceURI(((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).isLeaf();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = "xm<l";
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getNamespaceURI(((java.lang.String)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = "[";
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).namespacePointer(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getLocale();
    Object v14 = "F";
    Object v15 = new org.apache.commons.jxpath.JXPathInvalidAccessException(((java.lang.String)v14));
    ((org.apache.commons.jxpath.ri.model.NodePointer)v12).handle(((java.lang.Throwable)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = "T";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12));
    Object v14 = "T";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14));
    Object v16 = "'";
    Object v17 = "'";
    Object v18 = "name";
    Object v19 = new java.util.Locale(((java.lang.String)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v19));
    Object v21 = null;
    Object v22 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v20),((org.w3c.dom.Node)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getRootNode();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getParent();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).setValue(((java.lang.Object)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).clone();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getRootNode();
    Object v15 = org.apache.commons.jxpath.ri.model.NodePointer.verify(((org.apache.commons.jxpath.ri.model.NodePointer)v13));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = "[";
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).namespacePointer(((java.lang.String)v11));
    Object v13 = "T";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.QName)v14).hashCode();
    Object v16 = "F";
    Object v17 = new org.apache.commons.jxpath.JXPathInvalidAccessException(((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v12),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = "F";
    Object v14 = new org.apache.commons.jxpath.JXPathInvalidAccessException(((java.lang.String)v13));
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).setValue(((java.lang.Object)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = false;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v11).setAttribute((((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getNamespaceResolver();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getLocale();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = "]";
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).isLanguage(((java.lang.String)v12));
    Object v14 = "No value for xpath: ";
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).isLanguage(((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = "F";
    Object v15 = new org.apache.commons.jxpath.JXPathInvalidAccessException(((java.lang.String)v14));
    Object v16 = "T";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16));
    Object v18 = "T";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18));
    Object v20 = "'";
    Object v21 = "'";
    Object v22 = "name";
    Object v23 = new java.util.Locale(((java.lang.String)v20),((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v17),((java.lang.Object)v19),((java.util.Locale)v23));
    Object v25 = null;
    Object v26 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v24),((org.w3c.dom.Node)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v26).getValuePointer();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v13).handle(((java.lang.Throwable)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "T";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = "'";
    Object v7 = "'";
    Object v8 = "name";
    Object v9 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.Object)v5),((java.util.Locale)v9));
    Object v11 = null;
    Object v12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.w3c.dom.Node)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getValuePointer();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).clone();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getLocale();
    Object v16 = ((org.apache.commons.jxpath.ri.QName)v1).equals(((java.lang.Object)v15));
    Object v17 = "T";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17));
    Object v19 = "T";
    Object v20 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v19));
    Object v21 = "'";
    Object v22 = "'";
    Object v23 = "name";
    Object v24 = new java.util.Locale(((java.lang.String)v21),((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v18),((java.lang.Object)v20),((java.util.Locale)v24));
    Object v26 = null;
    Object v27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v25),((org.w3c.dom.Node)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.model.NodePointer)v27).getValuePointer();
    Object v29 = ((org.apache.commons.jxpath.ri.model.NodePointer)v28).clone();
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v29).getLocale();
    Object v31 = "'";
    Object v32 = "'";
    Object v33 = "name";
    Object v34 = new java.util.Locale(((java.lang.String)v31),((java.lang.String)v32),((java.lang.String)v33));
    Object v35 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v30),((java.util.Locale)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = "nll()";
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).isLanguage(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = "T";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12));
    Object v14 = "T";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14));
    Object v16 = "'";
    Object v17 = "'";
    Object v18 = "name";
    Object v19 = new java.util.Locale(((java.lang.String)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).isNode();
    Object v22 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v21));
    Object v23 = "@";
    Object v24 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v22),((java.lang.String)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getDefaultNamespaceURI();
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).isLeaf();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getBaseValue();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getNode();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = "F";
    Object v14 = new org.apache.commons.jxpath.JXPathInvalidAccessException(((java.lang.String)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).compareTo(((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = "T";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12));
    Object v14 = "T";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14));
    Object v16 = "'";
    Object v17 = "'";
    Object v18 = "name";
    Object v19 = new java.util.Locale(((java.lang.String)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).isNode();
    Object v22 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v21));
    Object v23 = "T";
    Object v24 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v23));
    Object v25 = -17;
    Object v26 = "T";
    Object v27 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).createChild(((org.apache.commons.jxpath.JXPathContext)v22),((org.apache.commons.jxpath.ri.QName)v24),(((java.lang.Integer)v25).intValue()),((java.lang.Object)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = "T";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13));
    Object v15 = "T";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15));
    Object v17 = "'";
    Object v18 = "'";
    Object v19 = "name";
    Object v20 = new java.util.Locale(((java.lang.String)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v16),((java.util.Locale)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).isNode();
    Object v23 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v22));
    Object v24 = "T";
    Object v25 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).createChild(((org.apache.commons.jxpath.JXPathContext)v23),((org.apache.commons.jxpath.ri.QName)v25),(((java.lang.Integer)v26).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getBaseValue();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getRootNode();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).remove();
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "T";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = "'";
    Object v7 = "'";
    Object v8 = "name";
    Object v9 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.Object)v5),((java.util.Locale)v9));
    Object v11 = null;
    Object v12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.w3c.dom.Node)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getValuePointer();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).clone();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getLocale();
    Object v16 = ((org.apache.commons.jxpath.ri.QName)v1).equals(((java.lang.Object)v15));
    Object v17 = "T";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17));
    Object v19 = "T";
    Object v20 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v19));
    Object v21 = "'";
    Object v22 = "'";
    Object v23 = "name";
    Object v24 = new java.util.Locale(((java.lang.String)v21),((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v18),((java.lang.Object)v20),((java.util.Locale)v24));
    Object v26 = null;
    Object v27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v25),((org.w3c.dom.Node)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.model.NodePointer)v27).getValuePointer();
    Object v29 = ((org.apache.commons.jxpath.ri.model.NodePointer)v28).clone();
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v29).getLocale();
    Object v31 = "'";
    Object v32 = "'";
    Object v33 = "name";
    Object v34 = new java.util.Locale(((java.lang.String)v31),((java.lang.String)v32),((java.lang.String)v33));
    Object v35 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v30),((java.util.Locale)v34));
    Object v36 = ((org.apache.commons.jxpath.ri.model.NodePointer)v35).isNode();
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = "";
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getNamespaceURI(((java.lang.String)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).remove();
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getImmediateValuePointer();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getRootNode();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getParent();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isRoot();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getParent();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getImmediateValuePointer();
    Object v15 = org.apache.commons.jxpath.ri.model.NodePointer.verify(((org.apache.commons.jxpath.ri.model.NodePointer)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = "T";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isAttribute();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).getValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = "T";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12));
    Object v14 = "T";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14));
    Object v16 = "'";
    Object v17 = "'";
    Object v18 = "name";
    Object v19 = new java.util.Locale(((java.lang.String)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).isNode();
    Object v22 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v21));
    Object v23 = "T";
    Object v24 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).createAttribute(((org.apache.commons.jxpath.JXPathContext)v22),((org.apache.commons.jxpath.ri.QName)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = "T";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12));
    Object v14 = "T";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14));
    Object v16 = "T";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16));
    Object v18 = "'";
    Object v19 = "'";
    Object v20 = "name";
    Object v21 = new java.util.Locale(((java.lang.String)v18),((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v15),((java.lang.Object)v17),((java.util.Locale)v21));
    Object v23 = null;
    Object v24 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v22),((org.w3c.dom.Node)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).getValuePointer();
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).clone();
    Object v27 = "nll()";
    Object v28 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v26).isLanguage(((java.lang.String)v27));
    Object v29 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v11),((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = "T";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13));
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).setValue(((java.lang.Object)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getNamespaceResolver();
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).isLeaf();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = " to ";
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).getNamespaceURI(((java.lang.String)v13));
    Object v15 = "";
    Object v16 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).getNamespaceURI(((java.lang.String)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = "[";
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).namespacePointer(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getRootNode();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getRootNode();
    Object v15 = org.apache.commons.jxpath.ri.model.NodePointer.verify(((org.apache.commons.jxpath.ri.model.NodePointer)v13));
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).clone();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = "T";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12));
    Object v14 = "T";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14));
    Object v16 = "'";
    Object v17 = "'";
    Object v18 = "name";
    Object v19 = new java.util.Locale(((java.lang.String)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).isNode();
    Object v22 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.jxpath.JXPathContext)v22).getLocale();
    Object v24 = "T";
    Object v25 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v24));
    Object v26 = 2;
    Object v27 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).createChild(((org.apache.commons.jxpath.JXPathContext)v22),((org.apache.commons.jxpath.ri.QName)v25),(((java.lang.Integer)v26).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    Object v15 = "T";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15));
    Object v17 = "T";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17));
    Object v19 = "'";
    Object v20 = "'";
    Object v21 = "name";
    Object v22 = new java.util.Locale(((java.lang.String)v19),((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).isNode();
    Object v25 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v24));
    Object v26 = "http://www.w3.org/XML/1998/namespace";
    Object v27 = "$";
    Object v28 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getPointerByKey(((org.apache.commons.jxpath.JXPathContext)v25),((java.lang.String)v26),((java.lang.String)v27));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getValuePointer();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).isLeaf();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = "[";
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).namespacePointer(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).isContainer();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = "v";
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).getNamespaceURI(((java.lang.String)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).isLeaf();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = -40;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v10).setIndex((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).remove();
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = false;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v11).setAttribute((((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = "Argument className was null.";
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getNamespaceURI(((java.lang.String)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.findEnclosingAttribute(((org.w3c.dom.Node)v0),((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = "adjustment of ";
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).namespacePointer(((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    Object v15 = "T";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15));
    Object v17 = "T";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17));
    Object v19 = "'";
    Object v20 = "'";
    Object v21 = "name";
    Object v22 = new java.util.Locale(((java.lang.String)v19),((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v22));
    Object v24 = null;
    Object v25 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v23),((org.w3c.dom.Node)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).getValuePointer();
    Object v27 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v26).getNamespaceResolver();
    Object v28 = "V";
    Object v29 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v27).getNamespaceURI(((java.lang.String)v28));
    ((org.apache.commons.jxpath.ri.model.NodePointer)v14).setNamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v27));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = "";
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).namespacePointer(((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = "T";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13));
    Object v15 = "T";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15));
    Object v17 = "'";
    Object v18 = "'";
    Object v19 = "name";
    Object v20 = new java.util.Locale(((java.lang.String)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v16),((java.util.Locale)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).isNode();
    Object v23 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v22));
    Object v24 = "T";
    Object v25 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).createAttribute(((org.apache.commons.jxpath.JXPathContext)v23),((org.apache.commons.jxpath.ri.QName)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getImmediateValuePointer();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getLocale();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getImmediateValuePointer();
    Object v15 = "F";
    Object v16 = new org.apache.commons.jxpath.JXPathInvalidAccessException(((java.lang.String)v15));
    Object v17 = ((java.lang.Throwable)v16).fillInStackTrace();
    Object v18 = "T";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18));
    Object v20 = "T";
    Object v21 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20));
    Object v22 = "'";
    Object v23 = "'";
    Object v24 = "name";
    Object v25 = new java.util.Locale(((java.lang.String)v22),((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v19),((java.lang.Object)v21),((java.util.Locale)v25));
    Object v27 = null;
    Object v28 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v26),((org.w3c.dom.Node)v27));
    Object v29 = ((org.apache.commons.jxpath.ri.model.NodePointer)v28).getValuePointer();
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v29).getRootNode();
    Object v31 = ((org.apache.commons.jxpath.ri.model.NodePointer)v29).getParent();
    Object v32 = ((org.apache.commons.jxpath.ri.model.NodePointer)v31).getImmediateValuePointer();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v14).handle(((java.lang.Throwable)v16),((org.apache.commons.jxpath.ri.model.NodePointer)v32));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getBaseValue();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).isNode();
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix(((org.w3c.dom.Node)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = "F";
    Object v13 = new org.apache.commons.jxpath.JXPathInvalidAccessException(((java.lang.String)v12));
    ((org.apache.commons.jxpath.ri.model.NodePointer)v11).handle(((java.lang.Throwable)v13));
    Object v14 = null;
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValuePointer();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).getLanguage();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getDefaultNamespaceURI();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = "T";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = "T";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11));
    Object v13 = "T";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13));
    Object v15 = "'";
    Object v16 = "'";
    Object v17 = "name";
    Object v18 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v14),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).isNode();
    Object v21 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v20));
    Object v22 = "";
    Object v23 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v21),((java.lang.String)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getValuePointer();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.verify(((org.apache.commons.jxpath.ri.model.NodePointer)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isNode();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getValuePointer();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).getRootNode();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getImmediateNode();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = "T";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).attributeIterator(((org.apache.commons.jxpath.ri.QName)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getLength();
    org.junit.Assert.assertEquals((Object)(1), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getRootNode();
    Object v16 = "T";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16));
    Object v18 = "T";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18));
    Object v20 = "'";
    Object v21 = "'";
    Object v22 = "name";
    Object v23 = new java.util.Locale(((java.lang.String)v20),((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v17),((java.lang.Object)v19),((java.util.Locale)v23));
    Object v25 = null;
    Object v26 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v24),((org.w3c.dom.Node)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v26).getValuePointer();
    Object v28 = ((org.apache.commons.jxpath.ri.model.NodePointer)v27).clone();
    Object v29 = ((org.apache.commons.jxpath.ri.model.NodePointer)v28).getBaseValue();
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v28).isNode();
    Object v31 = "'";
    Object v32 = "'";
    Object v33 = "name";
    Object v34 = new java.util.Locale(((java.lang.String)v31),((java.lang.String)v32),((java.lang.String)v33));
    Object v35 = ((java.util.Locale)v34).getDisplayVariant();
    Object v36 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v15),((java.lang.Object)v30),((java.util.Locale)v34));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    Object v15 = "'";
    Object v16 = "'";
    Object v17 = "name";
    Object v18 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).compareTo(((java.lang.Object)v18));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = "[";
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).namespacePointer(((java.lang.String)v11));
    Object v13 = org.apache.commons.jxpath.ri.model.NodePointer.verify(((org.apache.commons.jxpath.ri.model.NodePointer)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = "[";
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).namespacePointer(((java.lang.String)v11));
    Object v13 = org.apache.commons.jxpath.ri.model.NodePointer.verify(((org.apache.commons.jxpath.ri.model.NodePointer)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getRootNode();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = null;
    Object v1 = "T";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v1));
    Object v3 = "T";
    Object v4 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3));
    Object v5 = "'";
    Object v6 = "'";
    Object v7 = "name";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v4),((java.util.Locale)v8));
    Object v10 = null;
    Object v11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.w3c.dom.Node)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValuePointer();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getLocale();
    Object v15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.jxpath.ri.QName)v1).hashCode();
    Object v3 = "T";
    Object v4 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3));
    Object v5 = "T";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = "'";
    Object v8 = "'";
    Object v9 = "name";
    Object v10 = new java.util.Locale(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v4),((java.lang.Object)v6),((java.util.Locale)v10));
    Object v12 = null;
    Object v13 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v11),((org.w3c.dom.Node)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getRootNode();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getParent();
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNode();
    Object v19 = "T";
    Object v20 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v19));
    Object v21 = "T";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v21));
    Object v23 = "'";
    Object v24 = "'";
    Object v25 = "name";
    Object v26 = new java.util.Locale(((java.lang.String)v23),((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v20),((java.lang.Object)v22),((java.util.Locale)v26));
    Object v28 = null;
    Object v29 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v27),((org.w3c.dom.Node)v28));
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v29).getLocale();
    Object v31 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v18),((java.util.Locale)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "T";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "'";
    Object v6 = "name";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v3),((java.util.Locale)v7));
    Object v9 = null;
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.w3c.dom.Node)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getValuePointer();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.verify(((org.apache.commons.jxpath.ri.model.NodePointer)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).toString();
    org.junit.Assert.assertEquals((Object)("/"), v17);
  }
}
