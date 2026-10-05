package org.apache.commons.jxpath.ri.model.dom;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = null;
    Object v1 = ">";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v1));
    Object v3 = ">";
    Object v4 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3));
    Object v5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v0),((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = null;
    Object v1 = ">";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v1));
    Object v3 = ">";
    Object v4 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3));
    Object v5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v0),((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getNamespaceResolver();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = null;
    Object v1 = ">";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v1));
    Object v3 = ">";
    Object v4 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3));
    Object v5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v0),((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isNode();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v1));
    Object v3 = ">";
    Object v4 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3));
    Object v5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v0),((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v4));
    Object v6 = ">";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).compareTo(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = null;
    Object v1 = ">";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v1));
    Object v3 = ">";
    Object v4 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3));
    Object v5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v0),((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getLength();
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isNode();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = null;
    Object v1 = ">";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v1));
    Object v3 = ">";
    Object v4 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3));
    Object v5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v0),((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v4));
    Object v6 = false;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setAttribute((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = "[";
    Object v5 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v3).getNamespaceURI(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v3).getDefaultNamespaceURI();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = null;
    Object v1 = ">";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v1));
    Object v3 = ">";
    Object v4 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3));
    Object v5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v0),((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v4));
    Object v6 = false;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setAttribute((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getLocale();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = null;
    Object v5 = ">";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v4),((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isNode();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).compareTo(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).isNode();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getLocale();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v3).getLanguage();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = null;
    Object v5 = ">=";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v4),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isNode();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v3).setValue(((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = null;
    Object v5 = ">=";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v4),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isNode();
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = "z";
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v3).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = null;
    Object v5 = ">=";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v4),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isNode();
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = ">";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).createPath(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = null;
    Object v12 = ">=";
    Object v13 = java.util.Locale.forLanguageTag(((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v11),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).isNode();
    Object v16 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v15));
    Object v17 = "";
    Object v18 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v16),((java.lang.String)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = ">";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).isLeaf();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = ">";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11));
    Object v13 = ">";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13));
    Object v15 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = -1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v10).setIndex((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = null;
    Object v14 = ">=";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v13),((java.util.Locale)v15));
    Object v17 = ">";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.QName)v18).toString();
    Object v20 = ">";
    Object v21 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20));
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v16),((org.apache.commons.jxpath.ri.QName)v18),((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getParent();
    Object v24 = ">";
    Object v25 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v23).equals(((java.lang.Object)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).equals(((java.lang.Object)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = null;
    Object v6 = ">=";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = null;
    Object v11 = ">=";
    Object v12 = java.util.Locale.forLanguageTag(((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v10),((java.util.Locale)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).clone();
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.model.NodePointer)v14));
    org.junit.Assert.assertEquals((Object)(0), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = ">";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = ">=";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v4),((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = ">";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).setValue(((java.lang.Object)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = ">=";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v7),((java.util.Locale)v9));
    Object v11 = ">";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.QName)v12).toString();
    Object v14 = ">";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getParent();
    Object v18 = ">";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v17).equals(((java.lang.Object)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).compareTo(((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = null;
    Object v12 = ">=";
    Object v13 = java.util.Locale.forLanguageTag(((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v11),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).clone();
    Object v16 = "";
    Object v17 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v15).namespacePointer(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = ">=";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v18),((java.util.Locale)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v21));
    org.junit.Assert.assertEquals((Object)(0), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = ">";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = null;
    Object v3 = ">=";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).clone();
    Object v7 = null;
    Object v8 = ">=";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v7),((java.util.Locale)v9));
    Object v11 = ">";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.QName)v12).toString();
    Object v14 = ">";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getLocale();
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v6),((java.util.Locale)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getParent();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = ">";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.jxpath.ri.QName)v1).toString();
    Object v3 = null;
    Object v4 = ">=";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).clone();
    Object v8 = null;
    Object v9 = ">=";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = null;
    Object v14 = ">=";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v13),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).clone();
    Object v18 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v7).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ">=";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v18),((java.util.Locale)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getParent();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getLocale();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getNodeValue();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getParent();
    Object v8 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v7).getDefaultNamespaceURI();
    Object v9 = null;
    Object v10 = ">";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10));
    Object v12 = ">";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12));
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v11),((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getLength();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).isNode();
    Object v17 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v7).equals(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getParent();
    Object v8 = "'";
    Object v9 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v7).isLanguage(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).getName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = null;
    Object v12 = ">=";
    Object v13 = java.util.Locale.forLanguageTag(((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v11),((java.util.Locale)v13));
    Object v15 = ">";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.QName)v16).toString();
    Object v18 = ">";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18));
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v14),((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getNodeValue();
    Object v22 = null;
    Object v23 = ">=";
    Object v24 = java.util.Locale.forLanguageTag(((java.lang.String)v23));
    Object v25 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v22),((java.util.Locale)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).isNode();
    Object v27 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.apache.commons.jxpath.ri.QName)v21),((java.lang.Object)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = -41;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v4).setIndex((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).isCollection();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).remove();
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isAttribute();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getParent();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v7).getDefaultNamespaceURI();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = null;
    Object v12 = ">=";
    Object v13 = java.util.Locale.forLanguageTag(((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v11),((java.util.Locale)v13));
    Object v15 = ">";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.QName)v16).toString();
    Object v18 = ">";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18));
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v14),((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getNodeValue();
    Object v22 = null;
    Object v23 = ">=";
    Object v24 = java.util.Locale.forLanguageTag(((java.lang.String)v23));
    Object v25 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v22),((java.util.Locale)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).isNode();
    Object v27 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.apache.commons.jxpath.ri.QName)v21),((java.lang.Object)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.model.NodePointer)v27).getNamespaceResolver();
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = "*";
    Object v6 = new org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest(((java.lang.String)v5));
    Object v7 = false;
    Object v8 = null;
    Object v9 = ">=";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = "";
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v12).namespacePointer(((java.lang.String)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getParent();
    Object v16 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v6),(((java.lang.Boolean)v7).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getNamespaceResolver();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getParent();
    Object v8 = "?";
    Object v9 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v7).isLanguage(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).isCollection();
    Object v6 = null;
    Object v7 = ">=";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v6),((java.util.Locale)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isNode();
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).createPath(((org.apache.commons.jxpath.JXPathContext)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = ">";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = ">=";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v4),((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getImmediateValuePointer();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).getDefaultNamespaceURI();
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).isLeaf();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getParent();
    Object v8 = null;
    Object v9 = ">=";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isNode();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = ">";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14));
    Object v16 = ">";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.QName)v15).equals(((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v7).createAttribute(((org.apache.commons.jxpath.JXPathContext)v13),((org.apache.commons.jxpath.ri.QName)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getImmediateValuePointer();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).remove();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getImmediateValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).getBaseValue();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).isContainer();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getImmediateValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getNamespaceResolver();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getRootNode();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getParent();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getRootNode();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getImmediateValuePointer();
    Object v6 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v5).setIndex((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = null;
    Object v9 = ">=";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isNode();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = ">";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).createAttribute(((org.apache.commons.jxpath.JXPathContext)v13),((org.apache.commons.jxpath.ri.QName)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = ">";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = ">=";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v4),((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getLocale();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getParent();
    Object v8 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v7).getValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getParent();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getParent();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = ">";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = ">=";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v4),((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isAttribute();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = null;
    Object v6 = ">=";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).isNode();
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = "~";
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v10),((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(((org.w3c.dom.Node)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getParent();
    Object v8 = null;
    Object v9 = ">=";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isNode();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.jxpath.JXPathContext)v13).getLocale();
    Object v15 = "!";
    Object v16 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v7).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v13),((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getImmediateValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).isActual();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNamespaceResolver();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getImmediateValuePointer();
    Object v6 = "q";
    Object v7 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).isLanguage(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getImmediateValuePointer();
    Object v6 = null;
    Object v7 = ">=";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v6),((java.util.Locale)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isNode();
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = ">";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12));
    Object v14 = 48;
    Object v15 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).createChild(((org.apache.commons.jxpath.JXPathContext)v11),((org.apache.commons.jxpath.ri.QName)v13),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getImmediateNode();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getNamespaceResolver();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getImmediateValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).isLeaf();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getLanguage();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = ">";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = null;
    Object v3 = ">";
    Object v4 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3));
    Object v5 = ">";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v2),((org.apache.commons.jxpath.ri.QName)v4),((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isNode();
    Object v9 = null;
    Object v10 = ">=";
    Object v11 = java.util.Locale.forLanguageTag(((java.lang.String)v10));
    Object v12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v9),((java.util.Locale)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).clone();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getLocale();
    Object v15 = null;
    Object v16 = ">=";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v15),((java.util.Locale)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).clone();
    Object v20 = "";
    Object v21 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).namespacePointer(((java.lang.String)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getParent();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getLocale();
    Object v24 = ((java.util.Locale)v14).getDisplayVariant(((java.util.Locale)v23));
    Object v25 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v8),((java.util.Locale)v14));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = ">";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = ">=";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v4),((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isRoot();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getImmediateValuePointer();
    Object v6 = "]}";
    Object v7 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).namespacePointer(((java.lang.String)v6));
    Object v8 = "]";
    Object v9 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).getNamespaceURI(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getParent();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).toString();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = null;
    Object v6 = ">=";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v5),((java.util.Locale)v7));
    Object v9 = ">";
    Object v10 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.QName)v10).toString();
    Object v12 = ">";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12));
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.apache.commons.jxpath.ri.QName)v10),((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getParent();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).isActual();
    Object v17 = null;
    Object v18 = ">=";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v17),((java.util.Locale)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getValuePointer();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getImmediateValuePointer();
    Object v23 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    org.junit.Assert.assertEquals((Object)(0), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getImmediateValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).isNode();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = "J";
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).isLanguage(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = null;
    Object v6 = ">=";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).isNode();
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = ">";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).createChild(((org.apache.commons.jxpath.JXPathContext)v10),((org.apache.commons.jxpath.ri.QName)v12),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).getLanguage();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getNamespaceResolver();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).remove();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = "J";
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).isLanguage(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v8 = "v";
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isLanguage(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isNode();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = "J";
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).isLanguage(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getLocale();
    Object v9 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v7).namespaceIterator();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getImmediateValuePointer();
    Object v6 = null;
    Object v7 = ">=";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v6),((java.util.Locale)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getValuePointer();
    Object v11 = "J";
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isLanguage(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v13).getValuePointer();
    Object v15 = null;
    Object v16 = ">=";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v15),((java.util.Locale)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getImmediateValuePointer();
    Object v21 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    org.junit.Assert.assertEquals((Object)(0), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = ">";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = ">=";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v4),((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v11).printPointerChain();
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ">";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v5).toString();
    Object v7 = ">";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v3),((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    Object v11 = "id('";
    Object v12 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v10).getNamespaceURI(((java.lang.String)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).asPath();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = ">";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5));
    Object v7 = ">=";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v4),((org.apache.commons.jxpath.ri.QName)v6),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = null;
    Object v13 = ">=";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v12),((java.util.Locale)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).clone();
    Object v17 = "";
    Object v18 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v16).namespacePointer(((java.lang.String)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getParent();
    Object v20 = "?";
    Object v21 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v19).isLanguage(((java.lang.String)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).compareTo(((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getParent();
    Object v8 = null;
    Object v9 = ">=";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isNode();
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.jxpath.JXPathContext)v13).getContextPointer();
    Object v15 = null;
    Object v16 = ">=";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v15),((java.util.Locale)v17));
    Object v19 = ">";
    Object v20 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.QName)v20).toString();
    Object v22 = ">";
    Object v23 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v22));
    Object v24 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v18),((org.apache.commons.jxpath.ri.QName)v20),((java.lang.Object)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).getNodeValue();
    Object v26 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v7).createAttribute(((org.apache.commons.jxpath.JXPathContext)v13),((org.apache.commons.jxpath.ri.QName)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).getImmediateValuePointer();
    Object v6 = ((org.apache.commons.jxpath.ri.model.NodePointer)v5).getLocale();
    Object v7 = "/";
    Object v8 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v5).isLanguage(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = "L";
    Object v6 = ((org.apache.commons.jxpath.ri.model.dom.DOMNodePointer)v4).namespacePointer(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).isCollection();
    Object v6 = null;
    Object v7 = ">=";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v6),((java.util.Locale)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isNode();
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).createPath(((org.apache.commons.jxpath.JXPathContext)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getNode();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).getValuePointer();
    Object v5 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = null;
    Object v1 = ">=";
    Object v2 = java.util.Locale.forLanguageTag(((java.lang.String)v1));
    Object v3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v0),((java.util.Locale)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.model.NodePointer)v3).clone();
    Object v5 = true;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v4).setAttribute((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = null;
    Object v8 = ">=";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(((org.w3c.dom.Node)v7),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getImmediateValuePointer();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v4).compareTo(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(0), v13);
  }
}
