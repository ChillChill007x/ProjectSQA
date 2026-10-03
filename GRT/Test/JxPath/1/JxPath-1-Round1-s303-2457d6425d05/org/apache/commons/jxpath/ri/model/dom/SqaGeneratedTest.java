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
    Object v12 = "xmlnT";
    Object v13 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getLocale();
    Object v15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v7),((java.util.Locale)v14));
    org.junit.Assert.assertNotNull(v15);
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
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).getDefaultNamespaceURI();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
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
  public void test20() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "4'";
    Object v7 = "] ";
    Object v8 = "org.apa";
    Object v9 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "xmlnT";
    Object v11 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v9),((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getNamespaceResolver();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getLocale();
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).isActual();
    org.junit.Assert.assertEquals((Object)(true), v6);
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
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).getNamespaceURI(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getNamespaceResolver();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "/";
    Object v7 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).isLanguage(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
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
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getLength();
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getIndex();
    org.junit.Assert.assertEquals((Object)(-2147483648), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
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
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).isNode();
    org.junit.Assert.assertEquals((Object)(true), v17);
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
    Object v11 = true;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v20);
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
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = "namespace-uri";
    Object v11 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.QName)v12).hashCode();
    Object v14 = -6;
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).createChild(((org.apache.commons.jxpath.JXPathContext)v9),((org.apache.commons.jxpath.ri.QName)v12),(((java.lang.Integer)v14).intValue()));
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
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.JXPathContext)v9).getVariables();
    Object v11 = "namespace-uri";
    Object v12 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).createAttribute(((org.apache.commons.jxpath.JXPathContext)v9),((org.apache.commons.jxpath.ri.QName)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
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
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
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
  public void test35() throws Throwable {
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
    Object v10 = "\",\"";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
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
  public void test37() throws Throwable {
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
  public void test38() throws Throwable {
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
  public void test39() throws Throwable {
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
  public void test40() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).isNode();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getImmediateValuePointer();
    org.junit.Assert.assertNotNull(v7);
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
  public void test43() throws Throwable {
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
  public void test44() throws Throwable {
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
  public void test45() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getImmediateValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).isCollection();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
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
    Object v10 = "";
    Object v11 = new java.text.DecimalFormatSymbols();
    ((org.apache.commons.jxpath.JXPathContext)v9).setDecimalFormatSymbols(((java.lang.String)v10),((java.text.DecimalFormatSymbols)v11));
    Object v12 = null;
    Object v13 = "namespace-uri";
    Object v14 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.QName)v15).toString();
    Object v17 = -67;
    Object v18 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).createChild(((org.apache.commons.jxpath.JXPathContext)v9),((org.apache.commons.jxpath.ri.QName)v15),(((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "v";
    Object v7 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).isLanguage(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getRootNode();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "  ";
    Object v7 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).getNamespaceURI(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
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
    Object v17 = "namespace-uri";
    Object v18 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = "4'";
    Object v22 = "] ";
    Object v23 = "org.apa";
    Object v24 = new java.util.Locale(((java.lang.String)v21),((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v20),((java.util.Locale)v24));
    Object v26 = "namespace-uri";
    Object v27 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v28 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = "-";
    Object v30 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v28),((java.lang.String)v29));
    Object v31 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v25).equals(((java.lang.Object)v30));
    Object v32 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v16),((org.apache.commons.jxpath.ri.QName)v19),((java.lang.Object)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
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
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).setValue(((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
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
  public void test54() throws Throwable {
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
    Object v10 = "\":\"";
    ((org.apache.commons.jxpath.JXPathContext)v9).registerDefaultNamespace(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = "namespace-uri";
    Object v13 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).createAttribute(((org.apache.commons.jxpath.JXPathContext)v9),((org.apache.commons.jxpath.ri.QName)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v6 = "4'";
    Object v7 = "] ";
    Object v8 = "org.apa";
    Object v9 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "xmlnT";
    Object v11 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v9),((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = "4'";
    Object v14 = "] ";
    Object v15 = "org.apa";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "xmlnT";
    Object v18 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v16),((java.lang.String)v17));
    Object v19 = "namespace-uri";
    Object v20 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v21 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = null;
    Object v23 = "4'";
    Object v24 = "] ";
    Object v25 = "org.apa";
    Object v26 = new java.util.Locale(((java.lang.String)v23),((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v22),((java.util.Locale)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v27).getLength();
    Object v29 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v18),((org.apache.commons.jxpath.ri.QName)v21),((java.lang.Object)v28));
    Object v30 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v29));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setIndex((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).getLength();
    org.junit.Assert.assertEquals((Object)(1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ",";
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).isLanguage(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getParent();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.jxpath.BasicVariables();
    ((org.apache.commons.jxpath.JXPathContext)v9).setVariables(((org.apache.commons.jxpath.Variables)v10));
    Object v11 = null;
    Object v12 = new org.apache.commons.jxpath.BasicVariables();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).createPath(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getNode();
    Object v7 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
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
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).compareTo(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "4'";
    Object v7 = "] ";
    Object v8 = "org.apa";
    Object v9 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "xmlnT";
    Object v11 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v9),((java.lang.String)v10));
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "xmlnT";
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v11),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    org.junit.Assert.assertEquals((Object)(0), v18);
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
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getImmediateValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).remove();
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "C";
    Object v7 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).getNamespaceURI(((java.lang.String)v6));
    Object v8 = "k";
    Object v9 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).isLanguage(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "4'";
    Object v7 = "] ";
    Object v8 = "org.apa";
    Object v9 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "xmlnT";
    Object v11 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v9),((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getImmediateValuePointer();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getLocale();
    Object v15 = "4'";
    Object v16 = "] ";
    Object v17 = "org.apa";
    Object v18 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = "xmlnT";
    Object v20 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v18),((java.lang.String)v19));
    Object v21 = "namespace-uri";
    Object v22 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v23 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "-";
    Object v25 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v23),((java.lang.String)v24));
    Object v26 = true;
    Object v27 = "4'";
    Object v28 = "] ";
    Object v29 = "org.apa";
    Object v30 = new java.util.Locale(((java.lang.String)v27),((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = "xmlnT";
    Object v32 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v30),((java.lang.String)v31));
    Object v33 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v25),(((java.lang.Boolean)v26).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v32));
    Object v34 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getValuePointer();
    Object v35 = ((org.apache.commons.jxpath.ri.model.NodePointer)v34).getImmediateValuePointer();
    Object v36 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v35));
    org.junit.Assert.assertEquals((Object)(0), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = 40;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v6).setIndex((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getImmediateValuePointer();
    Object v8 = "namespace-uri";
    Object v9 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v10 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).compareTo(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "\"*g\"";
    Object v7 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).isLanguage(((java.lang.String)v6));
    Object v8 = "4'";
    Object v9 = "] ";
    Object v10 = "org.apa";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "xmlnT";
    Object v13 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).clone();
    Object v15 = "4'";
    Object v16 = "] ";
    Object v17 = "org.apa";
    Object v18 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = "xmlnT";
    Object v20 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v18),((java.lang.String)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getImmediateValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v14),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    org.junit.Assert.assertEquals((Object)(0), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
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
    Object v10 = ((org.apache.commons.jxpath.ri.QName)v2).equals(((java.lang.Object)v9));
    Object v11 = null;
    Object v12 = "4'";
    Object v13 = "] ";
    Object v14 = "org.apa";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v11),((java.util.Locale)v15));
    Object v17 = "namespace-uri";
    Object v18 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = "-";
    Object v21 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v19),((java.lang.String)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v16).equals(((java.lang.Object)v21));
    Object v23 = "4'";
    Object v24 = "] ";
    Object v25 = "org.apa";
    Object v26 = new java.util.Locale(((java.lang.String)v23),((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = ((java.util.Locale)v26).clone();
    Object v28 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v22),((java.util.Locale)v26));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "#";
    Object v7 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).isLanguage(((java.lang.String)v6));
    Object v8 = "/";
    Object v9 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).namespacePointer(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
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
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "\\>";
    Object v7 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).isLanguage(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "(";
    Object v7 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).namespacePointer(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).getImmediateNode();
    org.junit.Assert.assertNull(v8);
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
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = "namespace-uri";
    Object v11 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = 31;
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).createChild(((org.apache.commons.jxpath.JXPathContext)v9),((org.apache.commons.jxpath.ri.QName)v12),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
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
    Object v12 = new org.apache.commons.jxpath.BasicVariables();
    ((org.apache.commons.jxpath.JXPathContext)v11).setVariables(((org.apache.commons.jxpath.Variables)v12));
    Object v13 = null;
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).createPath(((org.apache.commons.jxpath.JXPathContext)v11));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = "namespace-uri";
    Object v7 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.JXPathContext)v9).getNamespaceContextPointer();
    Object v11 = ", ";
    Object v12 = "Unknown namespace prefix: ";
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getPointerByKey(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.String)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
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
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).attributeIterator(((org.apache.commons.jxpath.ri.QName)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).toString();
    org.junit.Assert.assertEquals((Object)("id(xmlnT)"), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = null;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setNamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).getName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
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
  public void test80() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "4'";
    Object v7 = "] ";
    Object v8 = "org.apa";
    Object v9 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "xmlnT";
    Object v11 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v9),((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isAttribute();
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
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
    Object v13 = 0;
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).createChild(((org.apache.commons.jxpath.JXPathContext)v9),((org.apache.commons.jxpath.ri.QName)v12),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = "4'";
    Object v7 = "] ";
    Object v8 = "org.apa";
    Object v9 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "xmlnT";
    Object v11 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v9),((java.lang.String)v10));
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
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).getImmediateValuePointer();
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v26).clone();
    Object v28 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).compareTo(((java.lang.Object)v27));
    Object v29 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isNode();
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
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
    Object v17 = "namespace-uri";
    Object v18 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v19));
    Object v21 = "/";
    Object v22 = "'";
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getPointerByKey(((org.apache.commons.jxpath.JXPathContext)v20),((java.lang.String)v21),((java.lang.String)v22));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isNode();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).attributeIterator(((org.apache.commons.jxpath.ri.QName)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "4'";
    Object v7 = "] ";
    Object v8 = "org.apa";
    Object v9 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "xmlnT";
    Object v11 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v9),((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValuePointer();
    Object v13 = "4'";
    Object v14 = "] ";
    Object v15 = "org.apa";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "xmlnT";
    Object v18 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v16),((java.lang.String)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).clone();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    org.junit.Assert.assertEquals((Object)(0), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
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
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
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
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v22 = "namespace-uri";
    Object v23 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v24 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = "namespace-uri";
    Object v26 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v27 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v21),((org.apache.commons.jxpath.ri.QName)v24),((java.lang.Object)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "4'";
    Object v1 = "] ";
    Object v2 = "org.apa";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "xmlnT";
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getImmediateValuePointer();
    Object v8 = new org.apache.commons.jxpath.BasicVariables();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).compareTo(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "4'";
    Object v7 = "] ";
    Object v8 = "org.apa";
    Object v9 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "xmlnT";
    Object v11 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v9),((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getValuePointer();
    Object v14 = "4'";
    Object v15 = "] ";
    Object v16 = "org.apa";
    Object v17 = new java.util.Locale(((java.lang.String)v14),((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "xmlnT";
    Object v19 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = "namespace-uri";
    Object v22 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v23 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v23));
    Object v25 = "namespace-uri";
    Object v26 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v27 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.QName)v27).toString();
    Object v29 = 0;
    Object v30 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).createChild(((org.apache.commons.jxpath.JXPathContext)v24),((org.apache.commons.jxpath.ri.QName)v27),(((java.lang.Integer)v29).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = "'";
    Object v7 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).isLanguage(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
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
    Object v10 = new org.apache.commons.jxpath.BasicVariables();
    ((org.apache.commons.jxpath.JXPathContext)v9).setVariables(((org.apache.commons.jxpath.Variables)v10));
    Object v11 = null;
    Object v12 = "namespace-uri";
    Object v13 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = 1;
    Object v16 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).createChild(((org.apache.commons.jxpath.JXPathContext)v9),((org.apache.commons.jxpath.ri.QName)v14),(((java.lang.Integer)v15).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
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
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).compareTo(((java.lang.Object)v22));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
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
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getLength();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getLocale();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "namespace-uri";
    Object v1 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = "4'";
    Object v5 = "] ";
    Object v6 = "org.apa";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v3),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v8).isCollection();
    Object v10 = "4'";
    Object v11 = "] ";
    Object v12 = "org.apa";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((java.util.Locale)v13).getUnicodeLocaleKeys();
    Object v15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v9),((java.util.Locale)v13));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
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
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).isNode();
    org.junit.Assert.assertEquals((Object)(true), v22);
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
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v7 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = null;
    Object v1 = "4'";
    Object v2 = "] ";
    Object v3 = "org.apa";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v4));
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }
}
