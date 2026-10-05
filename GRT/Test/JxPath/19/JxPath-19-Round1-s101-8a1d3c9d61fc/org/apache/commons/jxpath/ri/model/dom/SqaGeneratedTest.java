package org.apache.commons.jxpath.ri.model.dom;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isNode();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
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
    Object v4 = "/";
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
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
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
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getNodeValue();
    Object v11 = java.util.Locale.getDefault();
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = "}";
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v12),((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "H";
    Object v11 = "/";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v12));
    Object v14 = false;
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "H";
    Object v19 = "/";
    Object v20 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = java.util.Locale.getDefault();
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v17),((java.lang.Object)v20),((java.util.Locale)v21));
    Object v23 = null;
    Object v24 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v22),((org.w3c.dom.Node)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v13),(((java.lang.Boolean)v14).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v24));
    Object v26 = java.util.Locale.getDefault();
    Object v27 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v26));
    Object v28 = "";
    Object v29 = ".";
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getPointerByKey(((org.apache.commons.jxpath.JXPathContext)v27),((java.lang.String)v28),((java.lang.String)v29));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).isActual();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getRootNode();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = java.util.Locale.getDefault();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).setValue(((java.lang.Object)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).remove();
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getRootNode();
    Object v21 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).getDefaultNamespaceURI();
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = "H";
    Object v11 = "/";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "H";
    Object v14 = "/";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = java.util.Locale.getDefault();
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = null;
    Object v19 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v17),((org.w3c.dom.Node)v18));
    Object v20 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v19).setIndex((((java.lang.Integer)v20).intValue()));
    Object v21 = null;
    Object v22 = "H";
    Object v23 = "/";
    Object v24 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = "H";
    Object v26 = "/";
    Object v27 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v19),((org.apache.commons.jxpath.ri.QName)v24),((java.lang.Object)v27));
    Object v29 = ((org.apache.commons.jxpath.ri.model.NodePointer)v28).getParent();
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).compareTo(((java.lang.Object)v29));
    Object v31 = "H";
    Object v32 = "/";
    Object v33 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v31),((java.lang.String)v32));
    Object v34 = java.util.Locale.getDefault();
    Object v35 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v33),((java.lang.Object)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).getNamespaceResolver();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).getDefaultNamespaceURI();
    Object v21 = java.util.Locale.getDefault();
    Object v22 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v21));
    Object v23 = "H";
    Object v24 = "/";
    Object v25 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = -70;
    Object v27 = "H";
    Object v28 = "/";
    Object v29 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v29));
    Object v31 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).createChild(((org.apache.commons.jxpath.JXPathContext)v22),((org.apache.commons.jxpath.ri.QName)v25),(((java.lang.Integer)v26).intValue()),((java.lang.Object)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getValuePointer();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getNamespaceURI();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = "H";
    Object v21 = "/";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v22));
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).setValue(((java.lang.Object)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "H";
    Object v7 = "/";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isNode();
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = java.util.Locale.getDefault();
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v11),((java.util.Locale)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = java.util.Locale.getDefault();
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = "H";
    Object v14 = "/";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).createPath(((org.apache.commons.jxpath.JXPathContext)v12),((java.lang.Object)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = java.util.Locale.getDefault();
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = "y";
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v12),((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getNode();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isRoot();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "\"";
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getNamespaceURI(((java.lang.String)v11));
    Object v13 = ",";
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getNamespaceURI(((java.lang.String)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getRootNode();
    Object v21 = "I";
    Object v22 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).isLanguage(((java.lang.String)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "H";
    Object v7 = "/";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isNode();
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = java.util.Locale.getDefault();
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v11),((java.util.Locale)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getImmediateValuePointer();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = java.util.Locale.getDefault();
    Object v21 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v20));
    Object v22 = "H";
    Object v23 = "/";
    Object v24 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).createAttribute(((org.apache.commons.jxpath.JXPathContext)v21),((org.apache.commons.jxpath.ri.QName)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).toString();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).isLeaf();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "/";
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getNamespaceURI(((java.lang.String)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "H";
    Object v7 = "/";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isNode();
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = java.util.Locale.getDefault();
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v11),((java.util.Locale)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getImmediateValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getNodeValue();
    Object v25 = java.util.Locale.getDefault();
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).compareTo(((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = java.util.Locale.getDefault();
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = "<";
    Object v14 = "H']";
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getPointerByKey(((org.apache.commons.jxpath.JXPathContext)v12),((java.lang.String)v13),((java.lang.String)v14));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "H";
    Object v7 = "/";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isNode();
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = java.util.Locale.getDefault();
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v11),((java.util.Locale)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).isNode();
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getNode();
    Object v13 = java.util.Locale.getDefault();
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = "P";
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getNamespaceURI(((java.lang.String)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "H";
    Object v7 = "/";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isNode();
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = java.util.Locale.getDefault();
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v11),((java.util.Locale)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getImmediateValuePointer();
    Object v24 = "H";
    Object v25 = "/";
    Object v26 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).compareTo(((java.lang.Object)v27));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v6),((java.util.Locale)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "H";
    Object v7 = "/";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = null;
    Object v12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.w3c.dom.Node)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getNode();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).isRoot();
    Object v16 = java.util.Locale.getDefault();
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v15),((java.util.Locale)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = "";
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getNamespaceURI(((java.lang.String)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getNodeValue();
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "H";
    Object v7 = "/";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isNode();
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = java.util.Locale.getDefault();
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v11),((java.util.Locale)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getImmediateValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getImmediateValuePointer();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
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
  public void test47() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = java.util.Locale.getDefault();
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = "H";
    Object v14 = "/";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.QName)v15).hashCode();
    Object v17 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).createAttribute(((org.apache.commons.jxpath.JXPathContext)v12),((org.apache.commons.jxpath.ri.QName)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = true;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v11).setAttribute((((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isNode();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).attributeIterator(((org.apache.commons.jxpath.ri.QName)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = "H";
    Object v20 = "/";
    Object v21 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = "H";
    Object v23 = "/";
    Object v24 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = "H";
    Object v26 = "/";
    Object v27 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = java.util.Locale.getDefault();
    Object v29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v24),((java.lang.Object)v27),((java.util.Locale)v28));
    Object v30 = null;
    Object v31 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v29),((org.w3c.dom.Node)v30));
    Object v32 = ((org.apache.commons.jxpath.ri.model.NodePointer)v31).clone();
    Object v33 = ((org.apache.commons.jxpath.ri.model.NodePointer)v32).clone();
    Object v34 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v18),((org.apache.commons.jxpath.ri.QName)v21),((java.lang.Object)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).remove();
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "H";
    Object v7 = "/";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = null;
    Object v12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.w3c.dom.Node)v11));
    Object v13 = java.util.Locale.getDefault();
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).equals(((java.lang.Object)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v14),((java.util.Locale)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
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
  public void test56() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "H";
    Object v7 = "/";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = null;
    Object v12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.w3c.dom.Node)v11));
    Object v13 = java.util.Locale.getDefault();
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).equals(((java.lang.Object)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v14),((java.util.Locale)v15));
    Object v17 = false;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v16).setAttribute((((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = java.util.Locale.getDefault();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = "H";
    Object v15 = "/";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = 41;
    Object v18 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).createChild(((org.apache.commons.jxpath.JXPathContext)v13),((org.apache.commons.jxpath.ri.QName)v16),(((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.util.Locale.getDefault();
    Object v4 = java.util.Locale.getDefault();
    Object v5 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v3),((java.util.Locale)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getLocale();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValuePointer();
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = java.util.Locale.getDefault();
    Object v20 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).createPath(((org.apache.commons.jxpath.JXPathContext)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).getName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getNamespaceURI();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getNamespaceResolver();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.util.Locale.getDefault();
    Object v4 = java.util.Locale.getDefault();
    Object v5 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v3),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getImmediateNode();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getLocale();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
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
  public void test67() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "H";
    Object v7 = "/";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isNode();
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = java.util.Locale.getDefault();
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v11),((java.util.Locale)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getImmediateValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getImmediateValuePointer();
    Object v25 = "H";
    Object v26 = "/";
    Object v27 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = "H";
    Object v29 = "/";
    Object v30 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = java.util.Locale.getDefault();
    Object v32 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v27),((java.lang.Object)v30),((java.util.Locale)v31));
    Object v33 = null;
    Object v34 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v32),((org.w3c.dom.Node)v33));
    Object v35 = ((org.apache.commons.jxpath.ri.model.NodePointer)v34).clone();
    Object v36 = ((org.apache.commons.jxpath.ri.model.NodePointer)v35).getValuePointer();
    Object v37 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v36).getNamespaceResolver();
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v37).seal();
    Object v38 = null;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v24).setNamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v37));
    Object v39 = null;
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "H";
    Object v7 = "/";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = null;
    Object v12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.w3c.dom.Node)v11));
    Object v13 = java.util.Locale.getDefault();
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).equals(((java.lang.Object)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v14),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).clone();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getLength();
    org.junit.Assert.assertEquals((Object)(1), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = "";
    Object v21 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).namespacePointer(((java.lang.String)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.util.Locale.getDefault();
    Object v4 = java.util.Locale.getDefault();
    Object v5 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v3),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "H";
    Object v7 = "/";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = null;
    Object v12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.w3c.dom.Node)v11));
    Object v13 = java.util.Locale.getDefault();
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).equals(((java.lang.Object)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v14),((java.util.Locale)v15));
    ((org.apache.commons.jxpath.ri.model.NodePointer)v16).printPointerChain();
    Object v17 = null;
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).isAttribute();
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = java.util.Locale.getDefault();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = "H";
    Object v15 = "/";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "H";
    Object v18 = "/";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = java.util.Locale.getDefault();
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v19),((java.util.Locale)v20));
    Object v22 = null;
    Object v23 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v21),((org.w3c.dom.Node)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).clone();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).getRootNode();
    Object v26 = 0;
    Object v27 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).createChild(((org.apache.commons.jxpath.JXPathContext)v13),((org.apache.commons.jxpath.ri.QName)v25),(((java.lang.Integer)v26).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "H";
    Object v12 = "/";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "H";
    Object v15 = "/";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = java.util.Locale.getDefault();
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v16),((java.util.Locale)v17));
    Object v19 = null;
    Object v20 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v18),((org.w3c.dom.Node)v19));
    Object v21 = "H";
    Object v22 = "/";
    Object v23 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "H";
    Object v25 = "/";
    Object v26 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = java.util.Locale.getDefault();
    Object v28 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v23),((java.lang.Object)v26),((java.util.Locale)v27));
    Object v29 = null;
    Object v30 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v28),((org.w3c.dom.Node)v29));
    Object v31 = ((org.apache.commons.jxpath.ri.model.NodePointer)v30).clone();
    Object v32 = ((org.apache.commons.jxpath.ri.model.NodePointer)v31).clone();
    Object v33 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v20),((org.apache.commons.jxpath.ri.model.NodePointer)v32));
    Object v34 = "H";
    Object v35 = "/";
    Object v36 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v34),((java.lang.String)v35));
    Object v37 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).equals(((java.lang.Object)v36));
    org.junit.Assert.assertEquals((Object)(false), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = java.util.Locale.getDefault();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = "/";
    Object v15 = ((org.apache.commons.jxpath.JXPathContext)v13).selectSingleNode(((java.lang.String)v14));
    Object v16 = "H";
    Object v17 = "/";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = -7;
    Object v20 = "H";
    Object v21 = "/";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = "H";
    Object v24 = "/";
    Object v25 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = java.util.Locale.getDefault();
    Object v27 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v22),((java.lang.Object)v25),((java.util.Locale)v26));
    Object v28 = null;
    Object v29 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v27),((org.w3c.dom.Node)v28));
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v29).clone();
    Object v31 = ((org.apache.commons.jxpath.ri.model.NodePointer)v30).getNode();
    Object v32 = ((org.apache.commons.jxpath.ri.model.NodePointer)v30).isRoot();
    Object v33 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).createChild(((org.apache.commons.jxpath.JXPathContext)v13),((org.apache.commons.jxpath.ri.QName)v18),(((java.lang.Integer)v19).intValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
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
  public void test77() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).isCollection();
    Object v20 = java.util.Locale.getDefault();
    Object v21 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v20));
    Object v22 = "or";
    Object v23 = ((org.apache.commons.jxpath.JXPathContext)v21).getDecimalFormatSymbols(((java.lang.String)v22));
    Object v24 = "*";
    Object v25 = "H";
    Object v26 = "/";
    Object v27 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = "H";
    Object v29 = "/";
    Object v30 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = java.util.Locale.getDefault();
    Object v32 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v27),((java.lang.Object)v30),((java.util.Locale)v31));
    Object v33 = null;
    Object v34 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v32),((org.w3c.dom.Node)v33));
    Object v35 = ((org.apache.commons.jxpath.ri.model.NodePointer)v34).clone();
    Object v36 = ((org.apache.commons.jxpath.ri.model.NodePointer)v35).clone();
    Object v37 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getNodeSetByKey(((org.apache.commons.jxpath.JXPathContext)v21),((java.lang.String)v24),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "H";
    Object v7 = "/";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = null;
    Object v12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.w3c.dom.Node)v11));
    Object v13 = java.util.Locale.getDefault();
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).equals(((java.lang.Object)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v14),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "H";
    Object v7 = "/";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = null;
    Object v12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.w3c.dom.Node)v11));
    Object v13 = java.util.Locale.getDefault();
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).equals(((java.lang.Object)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v14),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNode();
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = java.util.Locale.getDefault();
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v6),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).isRoot();
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ((java.util.Locale)v10).getUnicodeLocaleAttributes();
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v9),((java.util.Locale)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = "H";
    Object v21 = "/";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = "H";
    Object v24 = "/";
    Object v25 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = java.util.Locale.getDefault();
    Object v27 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v22),((java.lang.Object)v25),((java.util.Locale)v26));
    Object v28 = null;
    Object v29 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v27),((org.w3c.dom.Node)v28));
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v29).clone();
    Object v31 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).equals(((java.lang.Object)v30));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getParent();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = java.util.Locale.getDefault();
    Object v21 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v20));
    Object v22 = "7";
    Object v23 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v21),((java.lang.String)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = "0";
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).isLanguage(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = java.util.Locale.getDefault();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = "H";
    Object v15 = "/";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = 62;
    Object v18 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).createChild(((org.apache.commons.jxpath.JXPathContext)v13),((org.apache.commons.jxpath.ri.QName)v16),(((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = "*";
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).isLanguage(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getNode();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.util.Locale.getDefault();
    Object v4 = java.util.Locale.getDefault();
    Object v5 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v3),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getImmediateValuePointer();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getParent();
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "H";
    Object v19 = "/";
    Object v20 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = "H";
    Object v22 = "/";
    Object v23 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = java.util.Locale.getDefault();
    Object v25 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v20),((java.lang.Object)v23),((java.util.Locale)v24));
    Object v26 = null;
    Object v27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v25),((org.w3c.dom.Node)v26));
    Object v28 = java.util.Locale.getDefault();
    Object v29 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v27).equals(((java.lang.Object)v28));
    Object v30 = java.util.Locale.getDefault();
    Object v31 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v17),((java.lang.Object)v29),((java.util.Locale)v30));
    Object v32 = ((org.apache.commons.jxpath.ri.model.NodePointer)v31).getValuePointer();
    Object v33 = ((org.apache.commons.jxpath.ri.model.NodePointer)v32).getNode();
    Object v34 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v11),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = java.util.Locale.getDefault();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = "*";
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v13),((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "H";
    Object v7 = "/";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = null;
    Object v12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.w3c.dom.Node)v11));
    Object v13 = java.util.Locale.getDefault();
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).equals(((java.lang.Object)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v14),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).clone();
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).isNode();
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = "Cannot determine the length of the indexed prop erty ";
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).getNamespaceURI(((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = java.util.Locale.getDefault();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = "H";
    Object v15 = "/";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "H";
    Object v18 = "/";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = java.util.Locale.getDefault();
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v19),((java.util.Locale)v20));
    Object v22 = null;
    Object v23 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v21),((org.w3c.dom.Node)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).clone();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).getRootNode();
    Object v26 = ((org.apache.commons.jxpath.ri.QName)v25).hashCode();
    Object v27 = -62;
    Object v28 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).createChild(((org.apache.commons.jxpath.JXPathContext)v13),((org.apache.commons.jxpath.ri.QName)v25),(((java.lang.Integer)v27).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "/";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "/";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getValuePointer();
    Object v21 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v20).setIndex((((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).toString();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.util.Locale.getDefault();
    Object v4 = java.util.Locale.getDefault();
    Object v5 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v3),((java.util.Locale)v4));
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).printPointerChain();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = java.util.Locale.getDefault();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = "H";
    Object v15 = "/";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = 1;
    Object v18 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).createChild(((org.apache.commons.jxpath.JXPathContext)v13),((org.apache.commons.jxpath.ri.QName)v16),(((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "H";
    Object v1 = "/";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = "/";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.w3c.dom.Node)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = "Un$efined variable: ";
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v11).isLanguage(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }
}
