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
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    org.junit.Assert.assertNotNull(v18);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).isActual();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getRootNode();
    org.junit.Assert.assertNotNull(v20);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    org.junit.Assert.assertNotNull(v19);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = "H";
    Object v21 = "text";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20),((java.lang.String)v21));
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).setValue(((java.lang.Object)v22));
    Object v23 = null;
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
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
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getRootNode();
    Object v21 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).getDefaultNamespaceURI();
    org.junit.Assert.assertNull(v21);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getRootNode();
    org.junit.Assert.assertNotNull(v20);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = "=.";
    Object v21 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).getNamespaceURI(((java.lang.String)v20));
    org.junit.Assert.assertNull(v21);
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
    Object v10 = "A";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).getNamespaceURI(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
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
    Object v10 = "tr";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).namespacePointer(((java.lang.String)v10));
    Object v12 = "di ";
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v9).isLanguage(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).getNamespaceResolver();
    Object v21 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).asPath();
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    org.junit.Assert.assertNotNull(v21);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    org.junit.Assert.assertNotNull(v22);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getIndex();
    org.junit.Assert.assertEquals((Object)(1), v23);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getValuePointer();
    Object v25 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).getName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).remove();
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
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
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getNode();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
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
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).isActual();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getNode();
    org.junit.Assert.assertNull(v25);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v22).getNamespaceResolver();
    org.junit.Assert.assertNotNull(v23);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v24 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v22).equals(((java.lang.Object)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v22).getNamespaceResolver();
    Object v24 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v22).getNamespaceResolver();
    org.junit.Assert.assertNotNull(v24);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getRootNode();
    org.junit.Assert.assertNotNull(v24);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = java.util.Locale.getDefault();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).compareTo(((java.lang.Object)v24));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
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
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getLocale();
    org.junit.Assert.assertNotNull(v24);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    org.junit.Assert.assertNotNull(v22);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = java.util.Locale.getDefault();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).compareTo(((java.lang.Object)v22));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).isRoot();
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getLocale();
    Object v24 = "H";
    Object v25 = "text";
    Object v26 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v26));
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v22).setValue(((java.lang.Object)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = java.util.Locale.getDefault();
    Object v25 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v24));
    Object v26 = "/";
    Object v27 = java.util.Locale.getDefault();
    Object v28 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getNodeSetByKey(((org.apache.commons.jxpath.JXPathContext)v25),((java.lang.String)v26),((java.lang.Object)v27));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(((org.w3c.dom.Node)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getRootNode();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
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
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).getDefaultNamespaceURI();
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).isLeaf();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getNodeValue();
    Object v25 = "fa0lse";
    Object v26 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).isLanguage(((java.lang.String)v25));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
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
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getNodeValue();
    Object v25 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).isCollection();
    org.junit.Assert.assertEquals((Object)(false), v25);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getImmediateValuePointer();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
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
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).isRoot();
    org.junit.Assert.assertEquals((Object)(false), v22);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = java.util.Locale.getDefault();
    Object v24 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v23));
    Object v25 = "H";
    Object v26 = "text";
    Object v27 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.QName)v27).hashCode();
    Object v29 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v22).createAttribute(((org.apache.commons.jxpath.JXPathContext)v24),((org.apache.commons.jxpath.ri.QName)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
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
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getImmediateValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).isNode();
    org.junit.Assert.assertEquals((Object)(true), v24);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getLocale();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
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
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).isRoot();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).isLeaf();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = "";
    Object v24 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v22).getNamespaceURI(((java.lang.String)v23));
    org.junit.Assert.assertNull(v24);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getImmediateValuePointer();
    Object v24 = "H";
    Object v25 = "text";
    Object v26 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v22).getNamespaceResolver();
    Object v24 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v22).namespaceIterator();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    Object v23 = java.util.Locale.getDefault();
    Object v24 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v23));
    Object v25 = "H";
    Object v26 = "text";
    Object v27 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v22).createAttribute(((org.apache.commons.jxpath.JXPathContext)v24),((org.apache.commons.jxpath.ri.QName)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getNode();
    Object v23 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v21).getImmediateNode();
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getRootNode();
    Object v25 = java.util.Locale.getDefault();
    Object v26 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v25));
    Object v27 = "H";
    Object v28 = "text";
    Object v29 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = 9;
    Object v31 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).createChild(((org.apache.commons.jxpath.JXPathContext)v26),((org.apache.commons.jxpath.ri.QName)v29),(((java.lang.Integer)v30).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
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
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getImmediateValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).getLength();
    org.junit.Assert.assertEquals((Object)(1), v24);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).getName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getRootNode();
    org.junit.Assert.assertNotNull(v23);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = java.util.Locale.getDefault();
    Object v25 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v24));
    Object v26 = ((org.apache.commons.jxpath.JXPathContext)v25).getFactory();
    Object v27 = "";
    Object v28 = "d";
    Object v29 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getPointerByKey(((org.apache.commons.jxpath.JXPathContext)v25),((java.lang.String)v27),((java.lang.String)v28));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v22).getDefaultNamespaceURI();
    Object v24 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v22).isLeaf();
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
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getImmediateValuePointer();
    Object v24 = 5;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v23).setIndex((((java.lang.Integer)v24).intValue()));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
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
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).isNode();
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
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
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).getNamespaceResolver();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName(((org.w3c.dom.Node)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
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
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getParent();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v22).getName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
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
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).isNode();
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).hashCode();
    Object v25 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getImmediateValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    Object v23 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v24 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v22).equals(((java.lang.Object)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).getBaseValue();
    org.junit.Assert.assertNull(v20);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getImmediateValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).isRoot();
    org.junit.Assert.assertEquals((Object)(false), v24);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getImmediateValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getParent();
    org.junit.Assert.assertNotNull(v24);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getParent();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getRootNode();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getNode();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v24 = java.util.Locale.getDefault();
    Object v25 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v24));
    Object v26 = "";
    Object v27 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v25),((java.lang.String)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
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
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getImmediateValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).getDefaultNamespaceURI();
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getLocale();
    Object v23 = java.util.Locale.getDefault();
    Object v24 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v23));
    Object v25 = "H";
    Object v26 = "text";
    Object v27 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v21).createAttribute(((org.apache.commons.jxpath.JXPathContext)v24),((org.apache.commons.jxpath.ri.QName)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = java.util.Locale.getDefault();
    Object v25 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v24));
    Object v26 = "Factory is not set on the JXPathContext - cannot create path: ";
    Object v27 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v25),((java.lang.String)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = java.util.Locale.getDefault();
    Object v25 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v24));
    Object v26 = "H";
    Object v27 = "text";
    Object v28 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = 0;
    Object v30 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).createChild(((org.apache.commons.jxpath.JXPathContext)v25),((org.apache.commons.jxpath.ri.QName)v28),(((java.lang.Integer)v29).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
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
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getParent();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getParent();
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
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
    Object v13 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v12).setIndex((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "H";
    Object v19 = "text";
    Object v20 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v12),((org.apache.commons.jxpath.ri.QName)v17),((java.lang.Object)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getParent();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getParent();
    Object v24 = java.util.Locale.getDefault();
    Object v25 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v23),((java.util.Locale)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
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
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).isNode();
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v22).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getImmediateValuePointer();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).remove();
    Object v24 = null;
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = "H";
    Object v24 = "text";
    Object v25 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v22).attributeIterator(((org.apache.commons.jxpath.ri.QName)v25));
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getImmediateValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getParent();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).toString();
    org.junit.Assert.assertEquals((Object)("/"), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v22).getValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getImmediateValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getParent();
    Object v25 = java.util.Locale.getDefault();
    Object v26 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).createPath(((org.apache.commons.jxpath.JXPathContext)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = java.util.Locale.getDefault();
    Object v24 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v23));
    Object v25 = "";
    Object v26 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v22).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v24),((java.lang.String)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v21).getNamespaceURI();
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getValuePointer();
    org.junit.Assert.assertNotNull(v24);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getImmediateValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getRootNode();
    org.junit.Assert.assertNotNull(v24);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).isNode();
    org.junit.Assert.assertEquals((Object)(true), v24);
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getValuePointer();
    Object v25 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v24).isLeaf();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).getValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
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
    Object v10 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "H";
    Object v13 = "text";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "H";
    Object v16 = "text";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getNodeValue();
    Object v21 = java.util.Locale.getDefault();
    Object v22 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v21));
    Object v23 = "H";
    Object v24 = "text";
    Object v25 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).createAttribute(((org.apache.commons.jxpath.JXPathContext)v22),((org.apache.commons.jxpath.ri.QName)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
