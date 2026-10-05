package org.apache.commons.jxpath.ri.model.dom;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isNode();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getLocale();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.getDefault();
    Object v2 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v0).createChild(((org.apache.commons.jxpath.JXPathContext)v2),((org.apache.commons.jxpath.ri.QName)v5),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).getValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getNodeValue();
    Object v11 = java.util.Locale.getDefault();
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = "fo}lowing";
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v12),((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "H";
    Object v11 = "text";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v12));
    Object v14 = false;
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "H";
    Object v19 = "text";
    Object v20 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = java.util.Locale.getDefault();
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v17),((java.lang.Object)v20),((java.util.Locale)v21));
    Object v23 = null;
    Object v24 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v22),((org.w3c.dom.Node)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v13),(((java.lang.Boolean)v14).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v24));
    Object v26 = java.util.Locale.getDefault();
    Object v27 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v26));
    Object v28 = "o";
    Object v29 = "<<unknown namespace>>";
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getPointerByKey(((org.apache.commons.jxpath.JXPathContext)v27),((java.lang.String)v28),((java.lang.String)v29));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v17));
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isActual();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getRootNode();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "H";
    Object v11 = "text";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).setValue(((java.lang.Object)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).remove();
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "H";
    Object v11 = "text";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "H";
    Object v14 = "text";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = java.util.Locale.getDefault();
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = null;
    Object v19 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v17),((org.w3c.dom.Node)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getParent();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).compareTo(((java.lang.Object)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).getDefaultNamespaceURI();
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ";";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).isLanguage(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "H";
    Object v12 = "text";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).getNamespaceResolver();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getDefaultNamespaceURI();
    Object v12 = java.util.Locale.getDefault();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = "H";
    Object v15 = "text";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = -71;
    Object v18 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).createChild(((org.apache.commons.jxpath.JXPathContext)v13),((org.apache.commons.jxpath.ri.QName)v16),(((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).asPath();
    Object v12 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v10).setIndex((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "*";
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getNamespaceURI(((java.lang.String)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getNamespaceResolver();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getRootNode();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = java.util.Locale.getDefault();
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.jxpath.JXPathContext)v12).getKeyManager();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).createPath(((org.apache.commons.jxpath.JXPathContext)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v10).printPointerChain();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "]";
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).isLanguage(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "H";
    Object v12 = "text";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "H";
    Object v15 = "text";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = java.util.Locale.getDefault();
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v16),((java.util.Locale)v17));
    Object v19 = null;
    Object v20 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v18),((org.w3c.dom.Node)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v21).getNamespaceResolver();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).compareTo(((java.lang.Object)v22));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getNamespaceResolver();
    Object v12 = java.util.Locale.getDefault();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = "H";
    Object v15 = "text";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).createAttribute(((org.apache.commons.jxpath.JXPathContext)v13),((org.apache.commons.jxpath.ri.QName)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = java.util.Locale.getDefault();
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.jxpath.JXPathContext)v12).getKeyManager();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).createPath(((org.apache.commons.jxpath.JXPathContext)v12));
    Object v15 = "sel\"::";
    Object v16 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v14).isLanguage(((java.lang.String)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).toString();
    org.junit.Assert.assertEquals((Object)("/"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = java.util.Locale.getDefault();
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.jxpath.JXPathContext)v12).getKeyManager();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).createPath(((org.apache.commons.jxpath.JXPathContext)v12));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).isRoot();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isContainer();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = java.util.Locale.getDefault();
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.jxpath.JXPathContext)v12).getKeyManager();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).createPath(((org.apache.commons.jxpath.JXPathContext)v12));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getImmediateValuePointer();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = java.util.Locale.getDefault();
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.jxpath.JXPathContext)v12).getKeyManager();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).createPath(((org.apache.commons.jxpath.JXPathContext)v12));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getImmediateValuePointer();
    Object v16 = "H";
    Object v17 = "text";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.QName)v18).hashCode();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v15).attributeIterator(((org.apache.commons.jxpath.ri.QName)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getImmediateValuePointer();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = "H";
    Object v14 = "text";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "H";
    Object v17 = "text";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = java.util.Locale.getDefault();
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v15),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = null;
    Object v22 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v20),((org.w3c.dom.Node)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).isActual();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getRootNode();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).setValue(((java.lang.Object)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = "H";
    Object v8 = "text";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "H";
    Object v11 = "text";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = java.util.Locale.getDefault();
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v12),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getLocale();
    Object v16 = ((java.util.Locale)v6).getDisplayCountry(((java.util.Locale)v15));
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "\"";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).getNamespaceURI(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = java.util.Locale.getDefault();
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.jxpath.JXPathContext)v12).getKeyManager();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).createPath(((org.apache.commons.jxpath.JXPathContext)v12));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getImmediateValuePointer();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).isNode();
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = "H";
    Object v14 = "text";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getImmediateValuePointer();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).isContainer();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = java.util.Locale.getDefault();
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.jxpath.JXPathContext)v12).getKeyManager();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).createPath(((org.apache.commons.jxpath.JXPathContext)v12));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getImmediateValuePointer();
    Object v16 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v15).isLeaf();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getImmediateValuePointer();
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v13).getImmediateNode();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).getBaseValue();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = "H";
    Object v14 = "text";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "H";
    Object v17 = "text";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = java.util.Locale.getDefault();
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v15),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = null;
    Object v22 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v20),((org.w3c.dom.Node)v21));
    Object v23 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v22).setIndex((((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).setValue(((java.lang.Object)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getImmediateValuePointer();
    Object v14 = java.util.Locale.getDefault();
    Object v15 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v14));
    Object v16 = "H&quot;";
    Object v17 = ((org.apache.commons.jxpath.JXPathContext)v15).getDecimalFormatSymbols(((java.lang.String)v16));
    Object v18 = "'. Invalid symbol '";
    Object v19 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v13).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v15),((java.lang.String)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).remove();
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).getName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = java.util.Locale.getDefault();
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = "H";
    Object v14 = "text";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.QName)v15).hashCode();
    Object v17 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).createAttribute(((org.apache.commons.jxpath.JXPathContext)v12),((org.apache.commons.jxpath.ri.QName)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getValuePointer();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = false;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v12).setAttribute((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = "H";
    Object v14 = "text";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "H";
    Object v17 = "text";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = java.util.Locale.getDefault();
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v15),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = null;
    Object v22 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v20),((org.w3c.dom.Node)v21));
    Object v23 = "";
    Object v24 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v22).namespacePointer(((java.lang.String)v23));
    Object v25 = "H";
    Object v26 = "text";
    Object v27 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = "H";
    Object v29 = "text";
    Object v30 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = java.util.Locale.getDefault();
    Object v32 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v27),((java.lang.Object)v30),((java.util.Locale)v31));
    Object v33 = null;
    Object v34 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v32),((org.w3c.dom.Node)v33));
    Object v35 = ((org.apache.commons.jxpath.ri.model.NodePointer)v34).getParent();
    Object v36 = ((org.apache.commons.jxpath.ri.model.NodePointer)v35).clone();
    Object v37 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v24),((org.apache.commons.jxpath.ri.model.NodePointer)v36));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getImmediateValuePointer();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getNodeValue();
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v13).getValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = "H";
    Object v8 = "text";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "H";
    Object v11 = "text";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = java.util.Locale.getDefault();
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v12),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getLocale();
    Object v16 = ((java.util.Locale)v6).getDisplayCountry(((java.util.Locale)v15));
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getNode();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getNodeValue();
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).getValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = java.util.Locale.getDefault();
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).compareTo(((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isNode();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = java.util.Locale.getDefault();
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = new org.apache.commons.jxpath.BasicVariables();
    ((org.apache.commons.jxpath.JXPathContext)v12).setVariables(((org.apache.commons.jxpath.Variables)v13));
    Object v14 = null;
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).createAttribute(((org.apache.commons.jxpath.JXPathContext)v12),((org.apache.commons.jxpath.ri.QName)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).getValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "H";
    Object v7 = "text";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = null;
    Object v12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.w3c.dom.Node)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v13).getNamespaceResolver();
    Object v15 = java.util.Locale.getDefault();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v14),((java.util.Locale)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v17));
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getImmediateValuePointer();
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v13).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isActual();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getRootNode();
    Object v12 = java.util.Locale.getDefault();
    Object v13 = java.util.Locale.getDefault();
    Object v14 = ((java.util.Locale)v13).getExtensionKeys();
    Object v15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v11),((java.lang.Object)v12),((java.util.Locale)v13));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getImmediateValuePointer();
    Object v14 = "7";
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v13).getNamespaceURI(((java.lang.String)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).namespaceIterator();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getRootNode();
    Object v14 = "H";
    Object v15 = "text";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "H";
    Object v18 = "text";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = java.util.Locale.getDefault();
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v19),((java.util.Locale)v20));
    Object v22 = null;
    Object v23 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v21),((org.w3c.dom.Node)v22));
    Object v24 = "";
    Object v25 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).namespacePointer(((java.lang.String)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).clone();
    Object v27 = "H";
    Object v28 = "text";
    Object v29 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = "H";
    Object v31 = "text";
    Object v32 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = java.util.Locale.getDefault();
    Object v34 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v29),((java.lang.Object)v32),((java.util.Locale)v33));
    Object v35 = null;
    Object v36 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v34),((org.w3c.dom.Node)v35));
    Object v37 = ((org.apache.commons.jxpath.ri.model.NodePointer)v36).clone();
    Object v38 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v26),((org.apache.commons.jxpath.ri.model.NodePointer)v37));
    org.junit.Assert.assertEquals((Object)(0), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = java.util.Locale.getDefault();
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.jxpath.JXPathContext)v12).getKeyManager();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).createPath(((org.apache.commons.jxpath.JXPathContext)v12));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getImmediateValuePointer();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).isActual();
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).getRootNode();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getParent();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "false";
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).isLanguage(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValuePointer();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValuePointer();
    Object v13 = "H";
    Object v14 = "text";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "H";
    Object v17 = "text";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = java.util.Locale.getDefault();
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v15),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = null;
    Object v22 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v20),((org.w3c.dom.Node)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).getNamespaceResolver();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v12).setNamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v24));
    Object v25 = null;
    Object v26 = "H";
    Object v27 = "text";
    Object v28 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = ((org.apache.commons.jxpath.ri.QName)v28).hashCode();
    Object v30 = "H";
    Object v31 = "text";
    Object v32 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v32));
    Object v34 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v12),((org.apache.commons.jxpath.ri.QName)v28),((java.lang.Object)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getValuePointer();
    Object v14 = "";
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).getNamespaceURI(((java.lang.String)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = java.util.Locale.getDefault();
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).createAttribute(((org.apache.commons.jxpath.JXPathContext)v11),((org.apache.commons.jxpath.ri.QName)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "H";
    Object v7 = "text";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = null;
    Object v12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.w3c.dom.Node)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v14 = java.util.Locale.getDefault();
    Object v15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v13),((java.util.Locale)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).isLeaf();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "Unknown namespace prefix: ";
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getNamespaceURI(((java.lang.String)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValuePointer();
    Object v13 = "H";
    Object v14 = "text";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "H";
    Object v17 = "text";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = java.util.Locale.getDefault();
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v15),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = null;
    Object v22 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v20),((org.w3c.dom.Node)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getParent();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).clone();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).compareTo(((java.lang.Object)v24));
    org.junit.Assert.assertEquals((Object)(0), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = java.util.Locale.getDefault();
    Object v14 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.jxpath.JXPathContext)v14).getKeyManager();
    Object v16 = "H";
    Object v17 = "text";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = 0;
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).createChild(((org.apache.commons.jxpath.JXPathContext)v14),((org.apache.commons.jxpath.ri.QName)v18),(((java.lang.Integer)v19).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = java.util.Locale.getDefault();
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.jxpath.JXPathContext)v12).getKeyManager();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).createPath(((org.apache.commons.jxpath.JXPathContext)v12));
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v14).isActual();
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "H";
    Object v7 = "text";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getLocale();
    Object v12 = java.util.Locale.getDefault();
    Object v13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v11),((java.util.Locale)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = java.util.Locale.getDefault();
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.jxpath.JXPathContext)v12).getKeyManager();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).createPath(((org.apache.commons.jxpath.JXPathContext)v12));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v15));
    Object v17 = "H";
    Object v18 = "text";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = -2147483648;
    Object v21 = "H";
    Object v22 = "text";
    Object v23 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "H";
    Object v25 = "text";
    Object v26 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = java.util.Locale.getDefault();
    Object v28 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v23),((java.lang.Object)v26),((java.util.Locale)v27));
    Object v29 = null;
    Object v30 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v28),((org.w3c.dom.Node)v29));
    Object v31 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v30).setIndex((((java.lang.Integer)v31).intValue()));
    Object v32 = null;
    Object v33 = ((org.apache.commons.jxpath.ri.model.NodePointer)v30).clone();
    Object v34 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v14).createChild(((org.apache.commons.jxpath.JXPathContext)v16),((org.apache.commons.jxpath.ri.QName)v19),(((java.lang.Integer)v20).intValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getNode();
    Object v14 = java.util.Locale.getDefault();
    Object v15 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v14));
    Object v16 = "H";
    Object v17 = "text";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = "H";
    Object v20 = "text";
    Object v21 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = java.util.Locale.getDefault();
    Object v23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v18),((java.lang.Object)v21),((java.util.Locale)v22));
    Object v24 = null;
    Object v25 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v23),((org.w3c.dom.Node)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).isActual();
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).getRootNode();
    Object v28 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).createAttribute(((org.apache.commons.jxpath.JXPathContext)v15),((org.apache.commons.jxpath.ri.QName)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getValuePointer();
    Object v14 = "H";
    Object v15 = "text";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "H";
    Object v18 = "text";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = java.util.Locale.getDefault();
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v19),((java.util.Locale)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getLocale();
    Object v23 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v13).equals(((java.lang.Object)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getLocale();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getValuePointer();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 42;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getParent();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).getNamespaceURI();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValuePointer();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getParent();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValuePointer();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getParent();
    Object v14 = -100;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v13).setIndex((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValuePointer();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getNode();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValuePointer();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getRootNode();
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v13).getDefaultNamespaceURI();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "H";
    Object v1 = "text";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "text";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValuePointer();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getParent();
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v13).getNamespaceResolver();
    org.junit.Assert.assertNotNull(v14);
  }
}
