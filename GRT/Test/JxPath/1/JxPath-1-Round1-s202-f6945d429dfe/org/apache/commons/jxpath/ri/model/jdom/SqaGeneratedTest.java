package org.apache.commons.jxpath.ri.model.jdom;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = "substring";
    Object v6 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).getNamespaceURI(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v6 = "Factory is not s";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = ")";
    Object v9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v5),((java.util.Locale)v7),((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v11 = "Factory is not s";
    Object v12 = new java.util.Locale(((java.lang.String)v11));
    Object v13 = ")";
    Object v14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v10),((java.util.Locale)v12),((java.lang.String)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.model.NodePointer)v14));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getRootNode();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).getName();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getParent();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).getName();
    Object v6 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v7 = "Factory is not s";
    Object v8 = new java.util.Locale(((java.lang.String)v7));
    Object v9 = "Factory is not s";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = ((java.util.Locale)v8).getDisplayScript(((java.util.Locale)v10));
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v6),((java.util.Locale)v8));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = "w";
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).getNamespaceURI(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).getName();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = "<G";
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).getNamespaceURI(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v10 = "Factory is not s";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = ")";
    Object v13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).clone();
    Object v16 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v15).getName();
    Object v17 = -19;
    Object v18 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).createChild(((org.apache.commons.jxpath.JXPathContext)v8),((org.apache.commons.jxpath.ri.QName)v16),(((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = "Factory is not s";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(((java.lang.Object)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getParent();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getRootNode();
    Object v7 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(((java.lang.Object)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v9 = "Factory is not s";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = ")";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v12).getName();
    Object v14 = 0;
    Object v15 = "Factory is not s";
    Object v16 = new java.util.Locale(((java.lang.String)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).createChild(((org.apache.commons.jxpath.JXPathContext)v7),((org.apache.commons.jxpath.ri.QName)v13),(((java.lang.Integer)v14).intValue()),((java.lang.Object)v16));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).isActual();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v7 = "Factory is not s";
    Object v8 = new java.util.Locale(((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v6),((java.util.Locale)v8),((java.lang.String)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v14 = "Factory is not s";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = ")";
    Object v17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v13),((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getValuePointer();
    Object v19 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v18));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).compareTo(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).isLeaf();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getNodeValue();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).getValue();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).remove();
    Object v7 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setIndex((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getImmediateParentPointer();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).isLeaf();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v8 = "Factory is not s";
    Object v9 = new java.util.Locale(((java.lang.String)v8));
    Object v10 = ")";
    Object v11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v7),((java.util.Locale)v9),((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValuePointer();
    Object v13 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v12).setIndex((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v16 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getRootNode();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = "";
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).isLanguage(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v7 = "Factory is not s";
    Object v8 = new java.util.Locale(((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v6),((java.util.Locale)v8),((java.lang.String)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = "";
    Object v13 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v11).isLanguage(((java.lang.String)v12));
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).setValue(((java.lang.Object)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v9 = "Factory is not s";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = ")";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v12).getName();
    Object v14 = -9;
    Object v15 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).createChild(((org.apache.commons.jxpath.JXPathContext)v7),((org.apache.commons.jxpath.ri.QName)v13),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getNamespaceResolver();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isCollection();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isActual();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setIndex((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v9 = "Cannot invoke extension functiIon ";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest(((java.lang.String)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v7 = "Factory is not s";
    Object v8 = new java.util.Locale(((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v6),((java.util.Locale)v8),((java.lang.String)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v10).getName();
    Object v12 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).attributeIterator(((org.apache.commons.jxpath.ri.QName)v11));
    Object v13 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v14 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v13));
    Object v15 = new org.apache.commons.jxpath.FunctionLibrary();
    ((org.apache.commons.jxpath.JXPathContext)v14).setFunctions(((org.apache.commons.jxpath.Functions)v15));
    Object v16 = null;
    Object v17 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v18 = "Factory is not s";
    Object v19 = new java.util.Locale(((java.lang.String)v18));
    Object v20 = ")";
    Object v21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v17),((java.util.Locale)v19),((java.lang.String)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v21).getName();
    Object v23 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).createAttribute(((org.apache.commons.jxpath.JXPathContext)v14),((org.apache.commons.jxpath.ri.QName)v22));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isAttribute();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).isNode();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = "Cannot invoke extension functiIon ";
    Object v7 = new org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest(((java.lang.String)v6));
    Object v8 = false;
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v10 = "Factory is not s";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = ")";
    Object v13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v7),(((java.lang.Boolean)v8).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isNode();
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getLocale();
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).asPath();
    org.junit.Assert.assertEquals((Object)("id(')')"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = "Cannot invoke extension functiIon ";
    Object v7 = new org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).asPath();
    org.junit.Assert.assertEquals((Object)("id(')')"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getLocale();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).getName();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setIndex((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getNamespaceResolver();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v10 = "Factory is not s";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = ")";
    Object v13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v13).getName();
    Object v15 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).createAttribute(((org.apache.commons.jxpath.JXPathContext)v8),((org.apache.commons.jxpath.ri.QName)v14));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = "Cannot invoke extension functiIon ";
    Object v7 = new org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).compareTo(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).getLength();
    org.junit.Assert.assertEquals((Object)(1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isNode();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setIndex((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v9 = "";
    Object v10 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).isLanguage(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setIndex((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).isLeaf();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setIndex((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v12 = "Factory is not s";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    Object v14 = ")";
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v13),((java.lang.String)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).getValuePointer();
    Object v17 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v16).getName();
    Object v18 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).createAttribute(((org.apache.commons.jxpath.JXPathContext)v10),((org.apache.commons.jxpath.ri.QName)v17));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).isNode();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = "Factory is not s";
    Object v8 = new java.util.Locale(((java.lang.String)v7));
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).setValue(((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.FunctionLibrary();
    Object v1 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(((java.lang.Object)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = "Cannot invoke extension functiIon ";
    Object v10 = new org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest(((java.lang.String)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).createPath(((org.apache.commons.jxpath.JXPathContext)v8),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isCollection();
    Object v7 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v8 = "Factory is not s";
    Object v9 = new java.util.Locale(((java.lang.String)v8));
    Object v10 = ")";
    Object v11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v7),((java.util.Locale)v9),((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValuePointer();
    Object v13 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v12).getName();
    Object v14 = ((org.apache.commons.jxpath.ri.QName)v13).toString();
    Object v15 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v16 = "Factory is not s";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = ")";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getValuePointer();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).isNode();
    Object v23 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v5),((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = "Cannot invoke extension functiIon ";
    Object v8 = new org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isCollection();
    Object v7 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v8 = "Factory is not s";
    Object v9 = new java.util.Locale(((java.lang.String)v8));
    Object v10 = ")";
    Object v11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v7),((java.util.Locale)v9),((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValuePointer();
    Object v13 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v12).getName();
    Object v14 = ((org.apache.commons.jxpath.ri.QName)v13).toString();
    Object v15 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v16 = "Factory is not s";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = ")";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getValuePointer();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).isNode();
    Object v23 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v5),((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getNamespaceResolver();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).isNode();
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).getName();
    Object v8 = ((org.apache.commons.jxpath.ri.QName)v7).toString();
    Object v9 = "Factory is not s";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v12 = "Factory is not s";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    Object v14 = ")";
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v13),((java.lang.String)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).getValuePointer();
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getLocale();
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v10),((java.util.Locale)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = "";
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).isLanguage(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(((java.lang.Object)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v7 = "Factory is not s";
    Object v8 = new java.util.Locale(((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v6),((java.util.Locale)v8),((java.lang.String)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v12).getName();
    Object v14 = ((org.apache.commons.jxpath.ri.QName)v13).toString();
    Object v15 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v16 = "Factory is not s";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = ")";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getRootNode();
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v5),((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = "Cannot invoke extension functiIon ";
    Object v7 = new org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest(((java.lang.String)v6));
    Object v8 = true;
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v10 = "Factory is not s";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = ")";
    Object v13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    Object v15 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v14).setIndex((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).clone();
    Object v18 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v7),(((java.lang.Boolean)v8).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(((java.lang.Object)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setIndex((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getParent();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = new org.apache.commons.jxpath.FunctionLibrary();
    Object v7 = "Cannot invoke extension functiIon ";
    Object v8 = new org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(((org.apache.commons.jxpath.ri.model.NodePointer)v5),((java.lang.Object)v6),((org.apache.commons.jxpath.ri.compiler.NodeTest)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(((java.lang.Object)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setIndex((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).asPath();
    Object v10 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v11 = "Factory is not s";
    Object v12 = new java.util.Locale(((java.lang.String)v11));
    Object v13 = ")";
    Object v14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v10),((java.util.Locale)v12),((java.lang.String)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getValuePointer();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).clone();
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getBaseValue();
    Object v18 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v19 = "Factory is not s";
    Object v20 = new java.util.Locale(((java.lang.String)v19));
    Object v21 = ")";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v18),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v23).setIndex((((java.lang.Integer)v24).intValue()));
    Object v25 = null;
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).clone();
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v26).getBaseValue();
    Object v28 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v16),((org.apache.commons.jxpath.ri.model.NodePointer)v26));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getLength();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getNodeValue();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).getName();
    Object v8 = ((org.apache.commons.jxpath.ri.QName)v7).toString();
    Object v9 = "Factory is not s";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v12 = "Factory is not s";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    Object v14 = ")";
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v13),((java.lang.String)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).getValuePointer();
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getLocale();
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v10),((java.util.Locale)v17));
    Object v19 = 52;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v18).setIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v22 = "Factory is not s";
    Object v23 = new java.util.Locale(((java.lang.String)v22));
    Object v24 = ")";
    Object v25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v21),((java.util.Locale)v23),((java.lang.String)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v25).getName();
    Object v27 = ((org.apache.commons.jxpath.ri.QName)v26).toString();
    Object v28 = "Factory is not s";
    Object v29 = new java.util.Locale(((java.lang.String)v28));
    Object v30 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v18),((org.apache.commons.jxpath.ri.QName)v26),((java.lang.Object)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.jxpath.JXPathContext)v7).getFactory();
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v10 = "Factory is not s";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = ")";
    Object v13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    Object v15 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v14).getName();
    Object v16 = 0;
    Object v17 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).createChild(((org.apache.commons.jxpath.JXPathContext)v7),((org.apache.commons.jxpath.ri.QName)v15),(((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setIndex((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v10 = "Factory is not s";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = ")";
    Object v13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    Object v15 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v14).setIndex((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).clone();
    Object v18 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v19 = "Factory is not s";
    Object v20 = new java.util.Locale(((java.lang.String)v19));
    Object v21 = ")";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v18),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).getImmediateNode();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = "namespace::";
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).getNamespaceURI(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v9 = "Factory is not s";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = ")";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getValuePointer();
    Object v14 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v13).getName();
    Object v15 = -21;
    Object v16 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).createChild(((org.apache.commons.jxpath.JXPathContext)v7),((org.apache.commons.jxpath.ri.QName)v14),(((java.lang.Integer)v15).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setIndex((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v10 = "Factory is not s";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = ")";
    Object v13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    Object v15 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v14).getName();
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).setValue(((java.lang.Object)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = "";
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).isLanguage(((java.lang.String)v6));
    Object v8 = java.lang.ClassLoader.getSystemClassLoader();
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).setValue(((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).hashCode();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).asPath();
    org.junit.Assert.assertEquals((Object)("id(')')"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setIndex((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v9 = "/";
    Object v10 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).isLanguage(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v7 = "Factory is not s";
    Object v8 = new java.util.Locale(((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v6),((java.util.Locale)v8),((java.lang.String)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v12).getName();
    Object v14 = ((org.apache.commons.jxpath.ri.QName)v13).toString();
    Object v15 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v16 = "Factory is not s";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = ")";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getRootNode();
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v5),((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).asPath();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).isActual();
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).getValue();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v7 = "Factory is not s";
    Object v8 = new java.util.Locale(((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v6),((java.util.Locale)v8),((java.lang.String)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v12).getName();
    Object v14 = ((org.apache.commons.jxpath.ri.QName)v13).toString();
    Object v15 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v16 = "Factory is not s";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = ")";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getRootNode();
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v5),((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getLength();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getLocale();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setIndex((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setIndex((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v11 = "Factory is not s";
    Object v12 = new java.util.Locale(((java.lang.String)v11));
    Object v13 = ")";
    Object v14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v10),((java.util.Locale)v12),((java.lang.String)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getValuePointer();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).clone();
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).isNode();
    Object v18 = "Cannot invoke extension functiIon ";
    Object v19 = new org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest(((java.lang.String)v18));
    Object v20 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((java.lang.Object)v17),((org.apache.commons.jxpath.ri.compiler.NodeTest)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).isLeaf();
    Object v8 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v9 = "Factory is not s";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = ")";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getValuePointer();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getLocale();
    Object v15 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v16 = "Factory is not s";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = ")";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getValuePointer();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getLocale();
    Object v22 = ((java.util.Locale)v14).getDisplayLanguage(((java.util.Locale)v21));
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v7),((java.util.Locale)v14));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).getValue();
    Object v7 = "http://www.w3.org/2000/xmlns/";
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).isLanguage(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setIndex((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).getName();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getImmediateValuePointer();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v8 = "Factory is not s";
    Object v9 = new java.util.Locale(((java.lang.String)v8));
    Object v10 = ")";
    Object v11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v7),((java.util.Locale)v9),((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValuePointer();
    Object v13 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v12).setIndex((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).clone();
    Object v17 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v16).getName();
    Object v18 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v6),((org.apache.commons.jxpath.ri.QName)v17),((java.lang.Object)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setIndex((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).getValue();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isCollection();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getLocale();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).getName();
    Object v8 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v9 = "Factory is not s";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = ")";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getValuePointer();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).isCollection();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).isActual();
    Object v16 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v17 = "Factory is not s";
    Object v18 = new java.util.Locale(((java.lang.String)v17));
    Object v19 = ")";
    Object v20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v16),((java.util.Locale)v18),((java.lang.String)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getValuePointer();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).isCollection();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getLocale();
    Object v24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v15),((java.util.Locale)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v9 = "Factory is not s";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = ")";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getValuePointer();
    Object v14 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v13).setIndex((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).clone();
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).clone();
    Object v18 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v17).getName();
    Object v19 = 0;
    Object v20 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).createChild(((org.apache.commons.jxpath.JXPathContext)v7),((org.apache.commons.jxpath.ri.QName)v18),(((java.lang.Integer)v19).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getImmediateValuePointer();
    Object v7 = "Factory is not s";
    Object v8 = new java.util.Locale(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).compareTo(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isCollection();
    Object v7 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v8 = "Factory is not s";
    Object v9 = new java.util.Locale(((java.lang.String)v8));
    Object v10 = ")";
    Object v11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v7),((java.util.Locale)v9),((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValuePointer();
    Object v13 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v12).getName();
    Object v14 = ((org.apache.commons.jxpath.ri.QName)v13).toString();
    Object v15 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v16 = "Factory is not s";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = ")";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getValuePointer();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).isNode();
    Object v23 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v5),((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getNamespaceResolver();
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v7 = "Factory is not s";
    Object v8 = new java.util.Locale(((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v6),((java.util.Locale)v8),((java.lang.String)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v11).setIndex((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).clone();
    Object v16 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v15).getName();
    Object v17 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).attributeIterator(((org.apache.commons.jxpath.ri.QName)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getParent();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).isLeaf();
    Object v8 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v9 = "Factory is not s";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = ")";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getValuePointer();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getLocale();
    Object v15 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v16 = "Factory is not s";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = ")";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getValuePointer();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getLocale();
    Object v22 = ((java.util.Locale)v14).getDisplayLanguage(((java.util.Locale)v21));
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v7),((java.util.Locale)v14));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
    Object v1 = "Factory is not s";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v6 = 37;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setIndex((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isActual();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }
}
