package org.apache.commons.jxpath.ri.model.dom;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getParent();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getNamespaceResolver();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getLocale();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "namespace-uri";
    Object v1 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "4'";
    Object v4 = "] ";
    Object v5 = "org.apa";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "xmlnT";
    Object v8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v6),((java.lang.String)v7));
    Object v9 = "4'";
    Object v10 = "] ";
    Object v11 = "org.apa";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((java.util.Locale)v12).getDisplayVariant();
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v8),((java.util.Locale)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValue();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).getName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = "local-name";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = "namespace-uri";
    Object v11 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).createAttribute(((org.apache.commons.jxpath.JXPathContext)v9),((org.apache.commons.jxpath.ri.QName)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).getLength();
    org.junit.Assert.assertEquals((Object)(1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getLocale();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "namespace-uri";
    Object v1 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "namespace-uri";
    Object v4 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "-";
    Object v7 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.String)v6));
    Object v8 = "4'";
    Object v9 = "] ";
    Object v10 = "org.apa";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v7),((java.util.Locale)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.JXPathContext)v9).getLocale();
    Object v11 = "3";
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).isLeaf();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getRootNode();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getNodeValue();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).getDefaultNamespaceURI();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = "4'";
    Object v21 = "] ";
    Object v22 = "org.apa";
    Object v23 = new java.util.Locale(((java.lang.String)v20),((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "xmlnT";
    Object v25 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v23),((java.lang.String)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).getNamespaceResolver();
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).getLocale();
    Object v28 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).equals(((java.lang.Object)v27));
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).isActual();
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = null;
    Object v10 = "4'";
    Object v11 = "] ";
    Object v12 = "org.apa";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v9),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v14).getLength();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v5),((org.apache.commons.jxpath.ri.QName)v8),((java.lang.Object)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = "namespace-uri";
    Object v22 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v23 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "-";
    Object v25 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v23),((java.lang.String)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v20).equals(((java.lang.Object)v25));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = "";
    Object v22 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v20).getNamespaceURI(((java.lang.String)v21));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getNamespaceResolver();
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = "/";
    Object v22 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v20).isLanguage(((java.lang.String)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getLength();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getIndex();
    org.junit.Assert.assertEquals((Object)(-2147483648), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).isNode();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isContainer();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = "namespace-uri";
    Object v21 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v22));
    Object v24 = "namespace-uri";
    Object v25 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v26 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.QName)v26).hashCode();
    Object v28 = -6;
    Object v29 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).createChild(((org.apache.commons.jxpath.JXPathContext)v23),((org.apache.commons.jxpath.ri.QName)v26),(((java.lang.Integer)v28).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).getName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = "namespace-uri";
    Object v21 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v22));
    Object v24 = ((org.apache.commons.jxpath.JXPathContext)v23).getVariables();
    Object v25 = "namespace-uri";
    Object v26 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v27 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).createAttribute(((org.apache.commons.jxpath.JXPathContext)v23),((org.apache.commons.jxpath.ri.QName)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = false;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getValuePointer();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v18));
    Object v20 = "namespace-uri";
    Object v21 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = "4'";
    Object v24 = "] ";
    Object v25 = "org.apa";
    Object v26 = new java.util.Locale(((java.lang.String)v23),((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v5),((org.apache.commons.jxpath.ri.QName)v22),((java.lang.Object)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = "namespace-uri";
    Object v21 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v22));
    Object v24 = "\",\"";
    Object v25 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v23),((java.lang.String)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).asPath();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).toString();
    org.junit.Assert.assertEquals((Object)("id(xmlnT)"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getParent();
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getNamespaceResolver();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getImmediateParentPointer();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = "namespace-uri";
    Object v21 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).equals(((java.lang.Object)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = null;
    Object v10 = "4'";
    Object v11 = "] ";
    Object v12 = "org.apa";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v9),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v14).getLength();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v5),((org.apache.commons.jxpath.ri.QName)v8),((java.lang.Object)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getImmediateValuePointer();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getImmediateValuePointer();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isAttribute();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).remove();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = null;
    Object v10 = "4'";
    Object v11 = "] ";
    Object v12 = "org.apa";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v9),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v14).getLength();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v5),((org.apache.commons.jxpath.ri.QName)v8),((java.lang.Object)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getImmediateValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).isRoot();
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).isCollection();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getImmediateValuePointer();
    Object v21 = "namespace-uri";
    Object v22 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v23 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v23));
    Object v25 = "";
    Object v26 = new java.text.DecimalFormatSymbols();
    ((org.apache.commons.jxpath.JXPathContext)v24).setDecimalFormatSymbols(((java.lang.String)v25),((java.text.DecimalFormatSymbols)v26));
    Object v27 = null;
    Object v28 = "namespace-uri";
    Object v29 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v30 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = ((org.apache.commons.jxpath.ri.QName)v30).toString();
    Object v32 = -67;
    Object v33 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v20).createChild(((org.apache.commons.jxpath.JXPathContext)v24),((org.apache.commons.jxpath.ri.QName)v30),(((java.lang.Integer)v32).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = "v";
    Object v22 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v20).isLanguage(((java.lang.String)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = null;
    Object v10 = "4'";
    Object v11 = "] ";
    Object v12 = "org.apa";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v9),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v14).getLength();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v5),((org.apache.commons.jxpath.ri.QName)v8),((java.lang.Object)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getRootNode();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = "  ";
    Object v22 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v20).getNamespaceURI(((java.lang.String)v21));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v7 = "namespace-uri";
    Object v8 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "4'";
    Object v11 = "] ";
    Object v12 = "org.apa";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "xmlnT";
    Object v15 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v13),((java.lang.String)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).getValuePointer();
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v6),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = "namespace-uri";
    Object v22 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v23 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v21),((java.lang.String)v22));
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v20).setValue(((java.lang.Object)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getParent();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = "namespace-uri";
    Object v21 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v22));
    Object v24 = "\":\"";
    ((org.apache.commons.jxpath.JXPathContext)v23).registerDefaultNamespace(((java.lang.String)v24));
    Object v25 = null;
    Object v26 = "namespace-uri";
    Object v27 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v28 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).createAttribute(((org.apache.commons.jxpath.JXPathContext)v23),((org.apache.commons.jxpath.ri.QName)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v20).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = null;
    Object v7 = "4'";
    Object v8 = "] ";
    Object v9 = "org.apa";
    Object v10 = new java.util.Locale(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v6),((java.util.Locale)v10));
    Object v12 = "namespace-uri";
    Object v13 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "-";
    Object v16 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.String)v15));
    Object v17 = true;
    Object v18 = "4'";
    Object v19 = "] ";
    Object v20 = "org.apa";
    Object v21 = new java.util.Locale(((java.lang.String)v18),((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = "xmlnT";
    Object v23 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v21),((java.lang.String)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v16),(((java.lang.Boolean)v17).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValuePointer();
    Object v26 = "namespace-uri";
    Object v27 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v28 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v25).equals(((java.lang.Object)v28));
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).compareTo(((java.lang.Object)v29));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v20).remove();
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = "round";
    Object v21 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).getNamespaceURI(((java.lang.String)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).isLeaf();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = "4'";
    Object v22 = "] ";
    Object v23 = "org.apa";
    Object v24 = new java.util.Locale(((java.lang.String)v21),((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = "xmlnT";
    Object v26 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v24),((java.lang.String)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v26).getValuePointer();
    Object v28 = "namespace-uri";
    Object v29 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v30 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = "4'";
    Object v32 = "] ";
    Object v33 = "org.apa";
    Object v34 = new java.util.Locale(((java.lang.String)v31),((java.lang.String)v32),((java.lang.String)v33));
    Object v35 = "xmlnT";
    Object v36 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v34),((java.lang.String)v35));
    Object v37 = ((org.apache.commons.jxpath.ri.model.NodePointer)v36).getValuePointer();
    Object v38 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v27),((org.apache.commons.jxpath.ri.QName)v30),((java.lang.Object)v37));
    Object v39 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v20).equals(((java.lang.Object)v38));
    org.junit.Assert.assertEquals((Object)(false), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getImmediateValuePointer();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getNodeValue();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v20).printPointerChain();
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = "namespace-uri";
    Object v8 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).createPath(((org.apache.commons.jxpath.JXPathContext)v10));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = "4'";
    Object v21 = "] ";
    Object v22 = "org.apa";
    Object v23 = new java.util.Locale(((java.lang.String)v20),((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "xmlnT";
    Object v25 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v23),((java.lang.String)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).clone();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).setValue(((java.lang.Object)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).getDefaultNamespaceURI();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v7 = "namespace-uri";
    Object v8 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "4'";
    Object v11 = "] ";
    Object v12 = "org.apa";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "xmlnT";
    Object v15 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v13),((java.lang.String)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).getValuePointer();
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v6),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getValuePointer();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getImmediateValuePointer();
    Object v21 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v20).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "namespace-uri";
    Object v9 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v10 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).createPath(((org.apache.commons.jxpath.JXPathContext)v11));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = null;
    Object v8 = "4'";
    Object v9 = "] ";
    Object v10 = "org.apa";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v7),((java.util.Locale)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).getLength();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).compareTo(((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = "4'";
    Object v21 = "] ";
    Object v22 = "org.apa";
    Object v23 = new java.util.Locale(((java.lang.String)v20),((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "xmlnT";
    Object v25 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v23),((java.lang.String)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).getValuePointer();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).setValue(((java.lang.Object)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getValuePointer();
    Object v21 = "/";
    Object v22 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).namespacePointer(((java.lang.String)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v19 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v18));
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).remove();
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getImmediateValuePointer();
    Object v21 = "C";
    Object v22 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v20).getNamespaceURI(((java.lang.String)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v20).getValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "namespace-uri";
    Object v1 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "4'";
    Object v4 = "] ";
    Object v5 = "org.apa";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "xmlnT";
    Object v8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v6),((java.lang.String)v7));
    Object v9 = "4'";
    Object v10 = "] ";
    Object v11 = "org.apa";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v8),((java.util.Locale)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getParent();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v7 = "namespace-uri";
    Object v8 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "4'";
    Object v11 = "] ";
    Object v12 = "org.apa";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "xmlnT";
    Object v15 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v13),((java.lang.String)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).getValuePointer();
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v6),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).isCollection();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getImmediateValuePointer();
    Object v21 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v20).getImmediateNode();
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).getNamespaceURI();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = null;
    Object v10 = "4'";
    Object v11 = "] ";
    Object v12 = "org.apa";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v9),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v14).getLength();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v5),((org.apache.commons.jxpath.ri.QName)v8),((java.lang.Object)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getImmediateValuePointer();
    Object v18 = "namespace-uri";
    Object v19 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v20 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = "4'";
    Object v22 = "] ";
    Object v23 = "org.apa";
    Object v24 = new java.util.Locale(((java.lang.String)v21),((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = "xmlnT";
    Object v26 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v24),((java.lang.String)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v26).clone();
    Object v28 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v17),((org.apache.commons.jxpath.ri.QName)v20),((java.lang.Object)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).printPointerChain();
    Object v6 = null;
    Object v7 = false;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setAttribute((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getImmediateValuePointer();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v20).remove();
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = "#nd";
    Object v21 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).isLanguage(((java.lang.String)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "namespace-uri";
    Object v1 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.QName)v2).hashCode();
    Object v4 = "4'";
    Object v5 = "] ";
    Object v6 = "org.apa";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "xmlnT";
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v7),((java.lang.String)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getNamespaceResolver();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getLocale();
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNamespaceResolver();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getLocale();
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v11),((java.util.Locale)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = "4'";
    Object v10 = "] ";
    Object v11 = "org.apa";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "xmlnT";
    Object v14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v12),((java.lang.String)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getValuePointer();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).compareTo(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v20).getLength();
    org.junit.Assert.assertEquals((Object)(1), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "namespace-uri";
    Object v1 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "4'";
    Object v4 = "] ";
    Object v5 = "org.apa";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "xmlnT";
    Object v8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v6),((java.lang.String)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isCollection();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isRoot();
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNamespaceResolver();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getLocale();
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v11),((java.util.Locale)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getLocale();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = null;
    Object v10 = "4'";
    Object v11 = "] ";
    Object v12 = "org.apa";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v9),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v14).getLength();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v5),((org.apache.commons.jxpath.ri.QName)v8),((java.lang.Object)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getImmediateValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getValuePointer();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getImmediateParentPointer();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getNamespaceResolver();
    Object v22 = "4'";
    Object v23 = "] ";
    Object v24 = "org.apa";
    Object v25 = new java.util.Locale(((java.lang.String)v22),((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = "xmlnT";
    Object v27 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v25),((java.lang.String)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.model.NodePointer)v27).getValuePointer();
    Object v29 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).compareTo(((java.lang.Object)v28));
    org.junit.Assert.assertEquals((Object)(0), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getValuePointer();
    Object v21 = "/";
    Object v22 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).namespacePointer(((java.lang.String)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getImmediateNode();
    Object v24 = false;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v22).setAttribute((((java.lang.Boolean)v24).booleanValue()));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).getImmediateNode();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getImmediateNode();
    Object v21 = "namespace-uri";
    Object v22 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v23 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).compareTo(((java.lang.Object)v23));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).getImmediateNode();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = "namespace-uri";
    Object v22 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v23 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v23));
    Object v25 = ((org.apache.commons.jxpath.JXPathContext)v24).getLocale();
    Object v26 = "'";
    Object v27 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v20).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v24),((java.lang.String)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "namespace-uri";
    Object v1 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.QName)v2).hashCode();
    Object v4 = "4'";
    Object v5 = "] ";
    Object v6 = "org.apa";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "xmlnT";
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v7),((java.lang.String)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getNamespaceResolver();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getLocale();
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNamespaceResolver();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getLocale();
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v11),((java.util.Locale)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).asPath();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v22);
  }
}
