package org.apache.commons.jxpath.ri.model.jdom;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = "!";
    Object v4 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v2).getNamespaceURI(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "&a";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(((java.lang.Object)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).remove();
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).isLeaf();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "&a";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v5));
    Object v7 = false;
    Object v8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v9 = java.util.Locale.getDefault();
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v6),(((java.lang.Boolean)v7).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v11));
    Object v13 = java.util.Locale.getDefault();
    Object v14 = "&a";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v15));
    Object v17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((java.lang.Object)v13),((org.apache.commons.jxpath.ri.compiler.NodeTest)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).getValue();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = java.util.Locale.getDefault();
    Object v5 = "&a";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((java.lang.Object)v4),((org.apache.commons.jxpath.ri.compiler.NodeTest)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = "=";
    Object v4 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v2).getNamespaceURI(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "&a";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.jxpath.JXPathContext)v7).getNamespaceContextPointer();
    Object v9 = "&a";
    Object v10 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v9));
    Object v11 = 47;
    Object v12 = "&a";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).createChild(((org.apache.commons.jxpath.JXPathContext)v7),((org.apache.commons.jxpath.ri.QName)v10),(((java.lang.Integer)v11).intValue()),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "&a";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = "name";
    Object v9 = "2";
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getPointerByKey(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.String)v8),((java.lang.String)v9));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).isActual();
    Object v4 = "&a";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = "&a";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.QName)v5).equals(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v2),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "&a";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getParent();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).getNamespaceResolver();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).getLocale();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).asPath();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "&a";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v5));
    Object v7 = false;
    Object v8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v9 = java.util.Locale.getDefault();
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v6),(((java.lang.Boolean)v7).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).isActual();
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getNamespaceResolver();
    Object v5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v6 = java.util.Locale.getDefault();
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).isLeaf();
    Object v10 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "&a";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getLocale();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getLocale();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "9";
    Object v5 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).getNamespaceURI(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "&a";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).hashCode();
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "&a";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getName();
    Object v9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v10 = java.util.Locale.getDefault();
    Object v11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v12).asPath();
    Object v14 = "&a";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v15));
    Object v17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((java.lang.Object)v13),((org.apache.commons.jxpath.ri.compiler.NodeTest)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).getName();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).isContainer();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).remove();
    Object v5 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "/&";
    Object v5 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).isLanguage(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).isNode();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(((java.lang.Object)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = java.util.Locale.getDefault();
    Object v6 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).isActual();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getNamespaceResolver();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).isAttribute();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).asPath();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "<<unknown namespace>>";
    Object v5 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).namespacePointer(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).getName();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).isLeaf();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = "&a";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).attributeIterator(((org.apache.commons.jxpath.ri.QName)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = "&a";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "&a";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v1));
    Object v3 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(((java.lang.Object)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v4).printPointerChain();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getRootNode();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).setValue(((java.lang.Object)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getParent();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v5 = java.util.Locale.getDefault();
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v4),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = "&a";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.QName)v9).hashCode();
    Object v11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v11));
    ((org.apache.commons.jxpath.ri.model.NodePointer)v12).printPointerChain();
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).clone();
    Object v18 = "<<unknown namespace>>";
    Object v19 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v17).namespacePointer(((java.lang.String)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v3).printPointerChain();
    Object v4 = null;
    Object v5 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).getLength();
    org.junit.Assert.assertEquals((Object)(1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ">";
    Object v6 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).isLanguage(((java.lang.String)v5));
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).remove();
    Object v7 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ",";
    Object v5 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).isLanguage(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getLocale();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).isNode();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v4).printPointerChain();
    Object v5 = null;
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = "&a";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v8 = java.util.Locale.getDefault();
    Object v9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v7),((java.util.Locale)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "&a";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v12));
    Object v14 = false;
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v16 = java.util.Locale.getDefault();
    Object v17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v13),(((java.lang.Boolean)v14).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isActual();
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v4),((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = "&a";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v6));
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = "&a";
    Object v10 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).createAttribute(((org.apache.commons.jxpath.JXPathContext)v8),((org.apache.commons.jxpath.ri.QName)v10));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v6 = java.util.Locale.getDefault();
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v5),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getValuePointer();
    Object v10 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).asPath();
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).setValue(((java.lang.Object)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).getImmediateNode();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(((java.lang.Object)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).setValue(((java.lang.Object)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = "&a";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = "&a";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).createAttribute(((org.apache.commons.jxpath.JXPathContext)v9),((org.apache.commons.jxpath.ri.QName)v11));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = "&a";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).compareTo(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).printPointerChain();
    Object v6 = null;
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).asPath();
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "<<unknown namespace>>";
    Object v5 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).namespacePointer(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isNode();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = true;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v4).setAttribute((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v4).printPointerChain();
    Object v5 = null;
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v8 = java.util.Locale.getDefault();
    Object v9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v7),((java.util.Locale)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "<<unknown namespace>>";
    Object v5 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).namespacePointer(((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v7 = java.util.Locale.getDefault();
    Object v8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v6),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v10).getName();
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v13 = java.util.Locale.getDefault();
    Object v14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).clone();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).getValuePointer();
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).isRoot();
    Object v18 = ((org.apache.commons.jxpath.ri.QName)v11).equals(((java.lang.Object)v17));
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v20 = java.util.Locale.getDefault();
    Object v21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getRootNode();
    Object v25 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v5),((org.apache.commons.jxpath.ri.QName)v11),((java.lang.Object)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = "&a";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v6));
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = "&a";
    Object v10 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v9));
    Object v11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v12 = java.util.Locale.getDefault();
    Object v13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).clone();
    Object v15 = "&a";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.QName)v16).hashCode();
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v14),((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.QName)v10).equals(((java.lang.Object)v19));
    Object v21 = 0;
    Object v22 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).createChild(((org.apache.commons.jxpath.JXPathContext)v8),((org.apache.commons.jxpath.ri.QName)v10),(((java.lang.Integer)v21).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = "&a";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v7));
    Object v9 = false;
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v11 = java.util.Locale.getDefault();
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v10),((java.util.Locale)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v14 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isNode();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "&a";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).hashCode();
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v7));
    Object v9 = "&a";
    Object v10 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getImmediateParentPointer();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = "&a";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).attributeIterator(((org.apache.commons.jxpath.ri.QName)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).getBaseValue();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "&a";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).hashCode();
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getRootNode();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "&a";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).hashCode();
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v7));
    Object v9 = "&a";
    Object v10 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getImmediateParentPointer();
    Object v14 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v13).getValue();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "&a";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(((java.lang.Object)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v5 = java.util.Locale.getDefault();
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v4),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = "&a";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.QName)v9).hashCode();
    Object v11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v11));
    Object v13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v14 = java.util.Locale.getDefault();
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v13),((java.util.Locale)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).clone();
    Object v17 = "&a";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.QName)v18).hashCode();
    Object v20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v16),((org.apache.commons.jxpath.ri.QName)v18),((java.lang.Object)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v21));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = "&a";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = "&a";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10));
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v13 = java.util.Locale.getDefault();
    Object v14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).clone();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).getValuePointer();
    Object v17 = ((org.apache.commons.jxpath.ri.QName)v11).equals(((java.lang.Object)v16));
    Object v18 = 0;
    Object v19 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).createChild(((org.apache.commons.jxpath.JXPathContext)v9),((org.apache.commons.jxpath.ri.QName)v11),(((java.lang.Integer)v18).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = "&a";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.JXPathContext)v9).isLenient();
    Object v11 = "&a";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).createAttribute(((org.apache.commons.jxpath.JXPathContext)v9),((org.apache.commons.jxpath.ri.QName)v12));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "&a";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = true;
    ((org.apache.commons.jxpath.JXPathContext)v7).setLenient((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = "&a";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).createChild(((org.apache.commons.jxpath.JXPathContext)v7),((org.apache.commons.jxpath.ri.QName)v11),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "&a";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v3 = java.util.Locale.getDefault();
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).equals(((java.lang.Object)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v8),((java.util.Locale)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).isContainer();
    Object v6 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(((java.lang.Object)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v4).printPointerChain();
    Object v5 = null;
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v7 = "&a";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v8));
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v12 = java.util.Locale.getDefault();
    Object v13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).clone();
    Object v15 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v14).getName();
    Object v16 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).createAttribute(((org.apache.commons.jxpath.JXPathContext)v10),((org.apache.commons.jxpath.ri.QName)v15));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "&a";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = false;
    ((org.apache.commons.jxpath.JXPathContext)v7).setLenient((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = "&a";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10));
    Object v12 = -37;
    Object v13 = "&a";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).createChild(((org.apache.commons.jxpath.JXPathContext)v7),((org.apache.commons.jxpath.ri.QName)v11),(((java.lang.Integer)v12).intValue()),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "<<unknown namespace>>";
    Object v5 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).namespacePointer(((java.lang.String)v4));
    Object v6 = "&a";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.JXPathContext)v9).getContextPointer();
    Object v11 = "r";
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.String)v11));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).isNode();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = "&a";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v8 = java.util.Locale.getDefault();
    Object v9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v7),((java.util.Locale)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).compareTo(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v4).printPointerChain();
    Object v5 = null;
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).remove();
    Object v7 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "&a";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v3 = java.util.Locale.getDefault();
    Object v4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getValuePointer();
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).equals(((java.lang.Object)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v8),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getNodeValue();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).getName();
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v7 = java.util.Locale.getDefault();
    Object v8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v6),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v10).getName();
    Object v12 = java.util.Locale.getDefault();
    Object v13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v11),((java.util.Locale)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNamespaceResolver();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "<<unknown namespace>>";
    Object v5 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v3).namespacePointer(((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v7 = java.util.Locale.getDefault();
    Object v8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v6),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v10).getName();
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v13 = java.util.Locale.getDefault();
    Object v14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).clone();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).getValuePointer();
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).isRoot();
    Object v18 = ((org.apache.commons.jxpath.ri.QName)v11).equals(((java.lang.Object)v17));
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v20 = java.util.Locale.getDefault();
    Object v21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getRootNode();
    Object v25 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v5),((org.apache.commons.jxpath.ri.QName)v11),((java.lang.Object)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).isLeaf();
    Object v27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v28 = java.util.Locale.getDefault();
    Object v29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v27),((java.util.Locale)v28));
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v29).clone();
    Object v31 = ((org.apache.commons.jxpath.ri.model.NodePointer)v30).getValuePointer();
    Object v32 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v31).asPath();
    Object v33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v25),((java.lang.Object)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).getValue();
    Object v6 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).getName();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v4).printPointerChain();
    Object v5 = null;
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getIndex();
    org.junit.Assert.assertEquals((Object)(-2147483648), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v7 = java.util.Locale.getDefault();
    Object v8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v6),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getValuePointer();
    Object v11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v12 = java.util.Locale.getDefault();
    Object v13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).clone();
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getValuePointer();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).clone();
    Object v17 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v5).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.apache.commons.jxpath.ri.model.NodePointer)v16));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = "&a";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).hashCode();
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v7));
    Object v9 = "&a";
    Object v10 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getImmediateParentPointer();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getNamespaceResolver();
    Object v15 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v13).getBaseValue();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isActual();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).getNamespaceURI();
    Object v6 = "')";
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v4).getNamespaceURI(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v0),((java.util.Locale)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.model.NodePointer)v2).clone();
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v4).printPointerChain();
    Object v5 = null;
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).namespaceIterator();
    org.junit.Assert.assertNotNull(v7);
  }
}
