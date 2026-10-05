package org.apache.commons.jxpath.ri.model.jdom;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).getNamespaceResolver();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getIndex();
    org.junit.Assert.assertEquals((Object)(-2147483648), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "";
    Object v1 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "*";
    Object v5 = org.jdom.Namespace.getNamespace(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v8 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jdom.Namespace)v5).equals(((java.lang.Object)v8));
    Object v10 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute(((java.lang.Object)v2),((java.lang.String)v3),((org.jdom.Namespace)v5));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "contains";
    Object v1 = "Cannot turn ";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.QName)v2).hashCode();
    Object v4 = "contains";
    Object v5 = "Cannot turn ";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v9 = new java.util.Locale(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v6),((java.util.Locale)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).isNode();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).getValue();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = "a/";
    Object v6 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).getNamespaceURI(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).getValue();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getLocale();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = "contains";
    Object v8 = "Cannot turn ";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "contains";
    Object v1 = "Cannot turn ";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.util.ArrayList();
    Object v4 = ((org.apache.commons.jxpath.ri.QName)v2).equals(((java.lang.Object)v3));
    Object v5 = "contains";
    Object v6 = "Cannot turn ";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.util.ArrayList();
    Object v9 = "";
    Object v10 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v11 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getNodeValue();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getLocale();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v7),((java.util.Locale)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = new java.util.ArrayList();
    Object v8 = "";
    Object v9 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v10 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v7),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getNodeValue();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v14 = new java.util.ArrayList();
    Object v15 = "";
    Object v16 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v17 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getNodeValue();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getValuePointer();
    Object v22 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = new java.util.ArrayList();
    Object v8 = "";
    Object v9 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v10 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v7),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getNodeValue();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getRootNode();
    Object v15 = new java.util.ArrayList();
    Object v16 = "";
    Object v17 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v18 = new java.util.Locale(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getNodeValue();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v21));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).isNode();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = "*";
    Object v8 = org.jdom.Namespace.getNamespace(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = "";
    Object v11 = new java.util.ArrayList();
    Object v12 = "";
    Object v13 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v14 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).isNode();
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getNodeSetByKey(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.String)v10),((java.lang.Object)v16));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).asPath();
    Object v8 = "";
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).getNamespaceURI(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = "*";
    Object v8 = org.jdom.Namespace.getNamespace(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = "contains";
    Object v11 = "Cannot turn ";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = 13;
    Object v14 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).createChild(((org.apache.commons.jxpath.JXPathContext)v9),((org.apache.commons.jxpath.ri.QName)v12),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).remove();
    Object v7 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).getName();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = "contains";
    Object v8 = "Cannot turn ";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7),((java.lang.String)v8));
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).setValue(((java.lang.Object)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).isActual();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "contains";
    Object v1 = "Cannot turn ";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.util.ArrayList();
    Object v4 = ((org.apache.commons.jxpath.ri.QName)v2).equals(((java.lang.Object)v3));
    Object v5 = "contains";
    Object v6 = "Cannot turn ";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.util.ArrayList();
    Object v9 = "";
    Object v10 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v11 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getNodeValue();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getLocale();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v7),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "contains";
    Object v1 = "Cannot turn ";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.util.ArrayList();
    Object v4 = ((org.apache.commons.jxpath.ri.QName)v2).equals(((java.lang.Object)v3));
    Object v5 = "contains";
    Object v6 = "Cannot turn ";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.util.ArrayList();
    Object v9 = "";
    Object v10 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v11 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getNodeValue();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getLocale();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v7),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = "contains";
    Object v19 = "Cannot turn ";
    Object v20 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = "contains";
    Object v22 = "Cannot turn ";
    Object v23 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "*";
    Object v25 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v23),((java.lang.String)v24));
    Object v26 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(((org.apache.commons.jxpath.ri.model.NodePointer)v17),((java.lang.Object)v20),((org.apache.commons.jxpath.ri.compiler.NodeTest)v25));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = new java.util.ArrayList();
    Object v8 = "";
    Object v9 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v10 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v7),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v11).getNamespaceResolver();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v6).setNamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = "*";
    Object v8 = org.jdom.Namespace.getNamespace(((java.lang.String)v7));
    Object v9 = "contains";
    Object v10 = "Cannot turn ";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "*";
    Object v13 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(((org.apache.commons.jxpath.ri.model.NodePointer)v6),((java.lang.Object)v8),((org.apache.commons.jxpath.ri.compiler.NodeTest)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).toString();
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).getName();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = new java.util.ArrayList();
    Object v8 = "";
    Object v9 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v10 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v7),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getNodeValue();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v14 = "contains";
    Object v15 = "Cannot turn ";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new java.util.ArrayList();
    Object v18 = ((org.apache.commons.jxpath.ri.QName)v16).equals(((java.lang.Object)v17));
    Object v19 = "contains";
    Object v20 = "Cannot turn ";
    Object v21 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new java.util.ArrayList();
    Object v23 = "";
    Object v24 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v25 = new java.util.Locale(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v22),((java.util.Locale)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v26).getNodeValue();
    Object v28 = ((org.apache.commons.jxpath.ri.model.NodePointer)v26).clone();
    Object v29 = ((org.apache.commons.jxpath.ri.model.NodePointer)v28).getLocale();
    Object v30 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v21),((java.util.Locale)v29));
    Object v31 = ((org.apache.commons.jxpath.ri.model.NodePointer)v30).toString();
    Object v32 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v30));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).isActual();
    Object v8 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(((java.lang.Object)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "contains";
    Object v1 = "Cannot turn ";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.util.ArrayList();
    Object v4 = ((org.apache.commons.jxpath.ri.QName)v2).equals(((java.lang.Object)v3));
    Object v5 = "contains";
    Object v6 = "Cannot turn ";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.util.ArrayList();
    Object v9 = "";
    Object v10 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v11 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getNodeValue();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getLocale();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v7),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getValuePointer();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "contains";
    Object v1 = "Cannot turn ";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(((java.lang.Object)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "contains";
    Object v1 = "Cannot turn ";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.util.ArrayList();
    Object v4 = ((org.apache.commons.jxpath.ri.QName)v2).equals(((java.lang.Object)v3));
    Object v5 = "contains";
    Object v6 = "Cannot turn ";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.util.ArrayList();
    Object v9 = "";
    Object v10 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v11 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getNodeValue();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getLocale();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v7),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = "*";
    Object v8 = org.jdom.Namespace.getNamespace(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = "contains";
    Object v11 = "Cannot turn ";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = 0;
    Object v14 = "contains";
    Object v15 = "Cannot turn ";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).createChild(((org.apache.commons.jxpath.JXPathContext)v9),((org.apache.commons.jxpath.ri.QName)v12),(((java.lang.Integer)v13).intValue()),((java.lang.Object)v16));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = "*";
    Object v8 = org.jdom.Namespace.getNamespace(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = "";
    Object v6 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).getNamespaceURI(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "contains";
    Object v1 = "Cannot turn ";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.util.ArrayList();
    Object v4 = ((org.apache.commons.jxpath.ri.QName)v2).equals(((java.lang.Object)v3));
    Object v5 = "contains";
    Object v6 = "Cannot turn ";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.util.ArrayList();
    Object v9 = "";
    Object v10 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v11 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getNodeValue();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getLocale();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v7),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getValuePointer();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).clone();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).toString();
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).getName();
    Object v9 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(((java.lang.Object)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getRootNode();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getRootNode();
    Object v8 = "*";
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).namespacePointer(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).asPath();
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = "contains";
    Object v9 = "Cannot turn ";
    Object v10 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "contains";
    Object v12 = "Cannot turn ";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.util.ArrayList();
    Object v15 = ((org.apache.commons.jxpath.ri.QName)v13).equals(((java.lang.Object)v14));
    Object v16 = "contains";
    Object v17 = "Cannot turn ";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new java.util.ArrayList();
    Object v20 = "";
    Object v21 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v22 = new java.util.Locale(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getNodeValue();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).clone();
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).getLocale();
    Object v27 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v18),((java.util.Locale)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.model.NodePointer)v27).getValuePointer();
    Object v29 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v10),((java.lang.Object)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = "contains";
    Object v9 = "Cannot turn ";
    Object v10 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v10),((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).isLeaf();
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = "contains";
    Object v10 = "Cannot turn ";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).compareTo(((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "contains";
    Object v1 = "Cannot turn ";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.util.ArrayList();
    Object v4 = ((org.apache.commons.jxpath.ri.QName)v2).equals(((java.lang.Object)v3));
    Object v5 = "contains";
    Object v6 = "Cannot turn ";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.util.ArrayList();
    Object v9 = "";
    Object v10 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v11 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getNodeValue();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getLocale();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v7),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getValuePointer();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isAttribute();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getRootNode();
    Object v8 = "*";
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).namespacePointer(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getLocale();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isActual();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).getBaseValue();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getParent();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "contains";
    Object v1 = "Cannot turn ";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.util.ArrayList();
    Object v4 = ((org.apache.commons.jxpath.ri.QName)v2).equals(((java.lang.Object)v3));
    Object v5 = "contains";
    Object v6 = "Cannot turn ";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.util.ArrayList();
    Object v9 = "";
    Object v10 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v11 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getNodeValue();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getLocale();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v7),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getValuePointer();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).printPointerChain();
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "contains";
    Object v1 = "Cannot turn ";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.util.ArrayList();
    Object v4 = ((org.apache.commons.jxpath.ri.QName)v2).equals(((java.lang.Object)v3));
    Object v5 = "contains";
    Object v6 = "Cannot turn ";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.util.ArrayList();
    Object v9 = "";
    Object v10 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v11 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getNodeValue();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getLocale();
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v7),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getValuePointer();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).isNode();
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = new java.util.ArrayList();
    Object v8 = "";
    Object v9 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v10 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v7),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getNodeValue();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).compareTo(((java.lang.Object)v13));
    Object v15 = "";
    Object v16 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).isLanguage(((java.lang.String)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getRootNode();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).getLanguage();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).getName();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getIndex();
    Object v6 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(((java.lang.Object)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).getImmediateNode();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getRootNode();
    Object v8 = "*";
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).namespacePointer(((java.lang.String)v8));
    Object v10 = "*";
    Object v11 = org.jdom.Namespace.getNamespace(((java.lang.String)v10));
    Object v12 = "contains";
    Object v13 = "Cannot turn ";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "*";
    Object v16 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.String)v15));
    Object v17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((java.lang.Object)v11),((org.apache.commons.jxpath.ri.compiler.NodeTest)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getRootNode();
    Object v8 = "*";
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).namespacePointer(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isNode();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isNode();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).getLength();
    org.junit.Assert.assertEquals((Object)(1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = new java.util.ArrayList();
    Object v9 = "";
    Object v10 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v11 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getNodeValue();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getRootNode();
    Object v16 = "*";
    Object v17 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v14).namespacePointer(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = org.jdom.Namespace.getNamespace(((java.lang.String)v18));
    Object v20 = "contains";
    Object v21 = "Cannot turn ";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = "*";
    Object v24 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v22),((java.lang.String)v23));
    Object v25 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(((org.apache.commons.jxpath.ri.model.NodePointer)v17),((java.lang.Object)v19),((org.apache.commons.jxpath.ri.compiler.NodeTest)v24));
    Object v26 = "contains";
    Object v27 = "Cannot turn ";
    Object v28 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = "*";
    Object v30 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v28),((java.lang.String)v29));
    Object v31 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((java.lang.Object)v25),((org.apache.commons.jxpath.ri.compiler.NodeTest)v30));
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = "*";
    Object v8 = org.jdom.Namespace.getNamespace(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = "contains";
    Object v11 = "Cannot turn ";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = 0;
    Object v14 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).createChild(((org.apache.commons.jxpath.JXPathContext)v9),((org.apache.commons.jxpath.ri.QName)v12),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "contains";
    Object v1 = "Cannot turn ";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.util.ArrayList();
    Object v4 = "";
    Object v5 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v3),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).toString();
    Object v11 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).getName();
    Object v12 = new java.util.ArrayList();
    Object v13 = "";
    Object v14 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v15 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getNodeValue();
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).clone();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getLocale();
    Object v20 = ((java.util.Locale)v19).clone();
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v11),((java.util.Locale)v19));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = true;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v6).setAttribute((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).getNamespaceURI();
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).getName();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = "";
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).isLanguage(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).getNamespaceURI();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = "*";
    Object v8 = org.jdom.Namespace.getNamespace(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = "2";
    Object v11 = "staHrts-with";
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getPointerByKey(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.String)v10),((java.lang.String)v11));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = "*";
    Object v8 = org.jdom.Namespace.getNamespace(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = " to size ";
    Object v11 = ((org.apache.commons.jxpath.JXPathContext)v9).getPrefix(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = "I";
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getPointerByKey(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.String)v12),((java.lang.String)v13));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = new java.util.ArrayList();
    Object v9 = "";
    Object v10 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v11 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getNodeValue();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).clone();
    Object v16 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v15).getName();
    Object v17 = new java.util.ArrayList();
    Object v18 = "";
    Object v19 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v20 = new java.util.Locale(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v17),((java.util.Locale)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getNodeValue();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).clone();
    Object v25 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v24).getImmediateNode();
    Object v26 = ((org.apache.commons.jxpath.ri.QName)v16).equals(((java.lang.Object)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).attributeIterator(((org.apache.commons.jxpath.ri.QName)v16));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).remove();
    Object v8 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = "*";
    Object v9 = org.jdom.Namespace.getNamespace(((java.lang.String)v8));
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = "contains";
    Object v12 = "Cannot turn ";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "contains";
    Object v15 = "Cannot turn ";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.QName)v13).equals(((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).createAttribute(((org.apache.commons.jxpath.JXPathContext)v10),((org.apache.commons.jxpath.ri.QName)v13));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).getNamespaceResolver();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).getValue();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isContainer();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = "*";
    Object v8 = org.jdom.Namespace.getNamespace(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = "";
    Object v11 = new java.util.ArrayList();
    Object v12 = "";
    Object v13 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v14 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).getNodeValue();
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).clone();
    Object v18 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v17).getBaseValue();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getNodeSetByKey(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.String)v10),((java.lang.Object)v18));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = "*";
    Object v8 = org.jdom.Namespace.getNamespace(((java.lang.String)v7));
    Object v9 = "contains";
    Object v10 = "Cannot turn ";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "*";
    Object v13 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(((org.apache.commons.jxpath.ri.model.NodePointer)v6),((java.lang.Object)v8),((org.apache.commons.jxpath.ri.compiler.NodeTest)v13));
    Object v15 = "/";
    Object v16 = "*";
    Object v17 = org.jdom.Namespace.getNamespace(((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute(((java.lang.Object)v14),((java.lang.String)v15),((org.jdom.Namespace)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getNodeValue();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getRootNode();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getRootNode();
    Object v8 = "*";
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).namespacePointer(((java.lang.String)v8));
    Object v10 = "contains";
    Object v11 = "Cannot turn ";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "contains";
    Object v14 = "Cannot turn ";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "*";
    Object v17 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((java.lang.Object)v12),((org.apache.commons.jxpath.ri.compiler.NodeTest)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).remove();
    Object v9 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(((java.lang.Object)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getRootNode();
    Object v8 = "*";
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).namespacePointer(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getImmediateValuePointer();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).getName();
    Object v9 = "";
    Object v10 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v11 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "";
    Object v13 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v14 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.Object)v11),((java.util.Locale)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getRootNode();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = "*";
    Object v10 = org.jdom.Namespace.getNamespace(((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = "contains";
    Object v13 = "Cannot turn ";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = 0;
    Object v16 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).createChild(((org.apache.commons.jxpath.JXPathContext)v11),((org.apache.commons.jxpath.ri.QName)v14),(((java.lang.Integer)v15).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getRootNode();
    Object v8 = "*";
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).namespacePointer(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getImmediateValuePointer();
    Object v11 = new java.util.ArrayList();
    Object v12 = "";
    Object v13 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v14 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).getNodeValue();
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).clone();
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v19 = "";
    Object v20 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v18).isLanguage(((java.lang.String)v19));
    Object v21 = "contains";
    Object v22 = "Cannot turn ";
    Object v23 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "*";
    Object v25 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v23),((java.lang.String)v24));
    Object v26 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((java.lang.Object)v20),((org.apache.commons.jxpath.ri.compiler.NodeTest)v25));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).namespaceIterator();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).isLeaf();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getRootNode();
    Object v8 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(((java.lang.Object)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).getNamespaceURI();
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).getName();
    Object v10 = new java.util.ArrayList();
    Object v11 = "";
    Object v12 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v13 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v10),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getNodeValue();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).clone();
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).clone();
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).isNode();
    Object v19 = new java.util.ArrayList();
    Object v20 = "";
    Object v21 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v22 = new java.util.Locale(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getNodeValue();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).clone();
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).getLocale();
    Object v27 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v18),((java.util.Locale)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = "*";
    Object v10 = org.jdom.Namespace.getNamespace(((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = new java.util.ArrayList();
    Object v13 = "";
    Object v14 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v15 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getNodeValue();
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).clone();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).clone();
    Object v20 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v19).getName();
    Object v21 = new java.util.ArrayList();
    Object v22 = "";
    Object v23 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v24 = new java.util.Locale(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v21),((java.util.Locale)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).getNodeValue();
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).clone();
    Object v28 = ((org.apache.commons.jxpath.ri.model.NodePointer)v27).getValuePointer();
    Object v29 = ((org.apache.commons.jxpath.ri.QName)v20).equals(((java.lang.Object)v28));
    Object v30 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).createAttribute(((org.apache.commons.jxpath.JXPathContext)v11),((org.apache.commons.jxpath.ri.QName)v20));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).getNamespaceURI();
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).getName();
    Object v10 = new java.util.ArrayList();
    Object v11 = "";
    Object v12 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v13 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v10),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getNodeValue();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).clone();
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).clone();
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v19 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v18).namespaceIterator();
    Object v20 = new java.util.ArrayList();
    Object v21 = "";
    Object v22 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v23 = new java.util.Locale(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v20),((java.util.Locale)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).getNodeValue();
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).clone();
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v26).getLocale();
    Object v28 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v19),((java.util.Locale)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getRootNode();
    Object v8 = "*";
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).namespacePointer(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getRootNode();
    Object v8 = "*";
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).namespacePointer(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getNode();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNodeValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).getName();
    Object v9 = new java.util.ArrayList();
    Object v10 = "";
    Object v11 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v12 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getNodeValue();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).clone();
    Object v16 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v15).getName();
    Object v17 = "";
    Object v18 = "org.apache.commonF.jxpath.JXPATH_CONTEXT";
    Object v19 = new java.util.Locale(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.Object)v16),((java.util.Locale)v19));
    org.junit.Assert.assertNotNull(v20);
  }
}
