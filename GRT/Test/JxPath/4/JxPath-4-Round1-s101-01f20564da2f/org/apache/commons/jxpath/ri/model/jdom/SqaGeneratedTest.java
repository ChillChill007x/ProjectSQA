package org.apache.commons.jxpath.ri.model.jdom;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).getName();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getRootNode();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).asPath();
    Object v9 = 11;
    Object v10 = 24.749968F;
    Object v11 = new java.util.HashSet((((java.lang.Integer)v9).intValue()),(((java.lang.Float)v10).floatValue()));
    Object v12 = "";
    Object v13 = "";
    Object v14 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v15).getName();
    Object v17 = "";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v18));
    Object v20 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((java.lang.Object)v16),((org.apache.commons.jxpath.ri.compiler.NodeTest)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(((java.lang.Object)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNamespaceResolver();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).namespaceIterator();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = "";
    Object v10 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).compareTo(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = 11;
    Object v9 = 24.749968F;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = "";
    Object v12 = "";
    Object v13 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v10),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v14).getName();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).compareTo(((java.lang.Object)v15));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ";";
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).isLanguage(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).getName();
    Object v8 = 11;
    Object v9 = 24.749968F;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = "";
    Object v12 = "";
    Object v13 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v10),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getValuePointer();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).getRootNode();
    Object v17 = "";
    Object v18 = "";
    Object v19 = new java.util.Locale(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v16),((java.util.Locale)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = 11;
    Object v9 = 24.749968F;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = 11;
    Object v13 = 24.749968F;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v12).intValue()),(((java.lang.Float)v13).floatValue()));
    Object v15 = "";
    Object v16 = "";
    Object v17 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getValuePointer();
    ((org.apache.commons.jxpath.JXPathContext)v11).setNamespaceContextPointer(((org.apache.commons.jxpath.Pointer)v19));
    Object v20 = null;
    Object v21 = "";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v21));
    Object v23 = -33;
    Object v24 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).createChild(((org.apache.commons.jxpath.JXPathContext)v11),((org.apache.commons.jxpath.ri.QName)v22),(((java.lang.Integer)v23).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getLocale();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = 11;
    Object v9 = 24.749968F;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = 11;
    Object v13 = 24.749968F;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v12).intValue()),(((java.lang.Float)v13).floatValue()));
    Object v15 = "";
    Object v16 = "";
    Object v17 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v18).getName();
    Object v20 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).createAttribute(((org.apache.commons.jxpath.JXPathContext)v11),((org.apache.commons.jxpath.ri.QName)v19));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = 11;
    Object v9 = 24.749968F;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = 11;
    Object v13 = 24.749968F;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v12).intValue()),(((java.lang.Float)v13).floatValue()));
    Object v15 = "";
    Object v16 = "";
    Object v17 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v18).getName();
    Object v20 = "";
    Object v21 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20));
    Object v22 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.QName)v19).equals(((java.lang.Object)v22));
    Object v24 = 16;
    Object v25 = 11;
    Object v26 = 24.749968F;
    Object v27 = new java.util.HashSet((((java.lang.Integer)v25).intValue()),(((java.lang.Float)v26).floatValue()));
    Object v28 = "";
    Object v29 = "";
    Object v30 = new java.util.Locale(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v27),((java.util.Locale)v30));
    Object v32 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v31).getName();
    Object v33 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).createChild(((org.apache.commons.jxpath.JXPathContext)v11),((org.apache.commons.jxpath.ri.QName)v19),(((java.lang.Integer)v24).intValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = 11;
    Object v9 = 24.749968F;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = "";
    Object v12 = "";
    Object v13 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v10),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v14).getName();
    Object v16 = 11;
    Object v17 = 24.749968F;
    Object v18 = new java.util.HashSet((((java.lang.Integer)v16).intValue()),(((java.lang.Float)v17).floatValue()));
    Object v19 = "";
    Object v20 = "";
    Object v21 = new java.util.Locale(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v18),((java.util.Locale)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getRootNode();
    Object v25 = "";
    Object v26 = "";
    Object v27 = new java.util.Locale(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v15),((java.lang.Object)v24),((java.util.Locale)v27));
    Object v29 = 11;
    Object v30 = 24.749968F;
    Object v31 = new java.util.HashSet((((java.lang.Integer)v29).intValue()),(((java.lang.Float)v30).floatValue()));
    Object v32 = "";
    Object v33 = "";
    Object v34 = new java.util.Locale(((java.lang.String)v32),((java.lang.String)v33));
    Object v35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v31),((java.util.Locale)v34));
    Object v36 = ((org.apache.commons.jxpath.ri.model.NodePointer)v35).getValuePointer();
    Object v37 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v28),((org.apache.commons.jxpath.ri.model.NodePointer)v36));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = 11;
    Object v9 = 24.749968F;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = "";
    Object v12 = "";
    Object v13 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v10),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getValuePointer();
    Object v16 = 11;
    Object v17 = 24.749968F;
    Object v18 = new java.util.HashSet((((java.lang.Integer)v16).intValue()),(((java.lang.Float)v17).floatValue()));
    Object v19 = "";
    Object v20 = "";
    Object v21 = new java.util.Locale(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v18),((java.util.Locale)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = 11;
    Object v9 = 24.749968F;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = "";
    Object v12 = "";
    Object v13 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v10),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v14).getName();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).attributeIterator(((org.apache.commons.jxpath.ri.QName)v15));
    Object v17 = -39;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v7).setIndex((((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v3));
    Object v5 = "";
    Object v6 = "";
    Object v7 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v1),((java.lang.Object)v4),((java.util.Locale)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "line.separ";
    Object v4 = "la;ng";
    Object v5 = org.jdom.Namespace.getNamespace(((java.lang.String)v4));
    Object v6 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute(((java.lang.Object)v2),((java.lang.String)v3),((org.jdom.Namespace)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v9));
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).setValue(((java.lang.Object)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getRootNode();
    Object v9 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(((java.lang.Object)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(((java.lang.Object)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = 11;
    Object v9 = 24.749968F;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = "";
    Object v12 = "";
    Object v13 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v10),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getValuePointer();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).getRootNode();
    Object v17 = "";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v18));
    Object v20 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((java.lang.Object)v16),((org.apache.commons.jxpath.ri.compiler.NodeTest)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isNode();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "\"format-number\"";
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).getNamespaceURI(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).getNamespaceURI();
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).isLeaf();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).asPath();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNode();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getRootNode();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v9));
    Object v11 = true;
    Object v12 = 11;
    Object v13 = 24.749968F;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v12).intValue()),(((java.lang.Float)v13).floatValue()));
    Object v15 = "";
    Object v16 = "";
    Object v17 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getValuePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).asPath();
    org.junit.Assert.assertEquals((Object)(""), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = new java.util.Locale(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = 11;
    Object v11 = 24.749968F;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = "";
    Object v14 = "";
    Object v15 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.QName)v9).equals(((java.lang.Object)v17));
    Object v19 = 11;
    Object v20 = 24.749968F;
    Object v21 = new java.util.HashSet((((java.lang.Integer)v19).intValue()),(((java.lang.Float)v20).floatValue()));
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = 11;
    Object v9 = 24.749968F;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = "";
    Object v12 = "";
    Object v13 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v10),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).getValuePointer();
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).isNode();
    Object v17 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).equals(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((java.lang.Object)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = 11;
    Object v11 = 24.749968F;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = "";
    Object v14 = "";
    Object v15 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.QName)v9).equals(((java.lang.Object)v17));
    Object v19 = 11;
    Object v20 = 24.749968F;
    Object v21 = new java.util.HashSet((((java.lang.Integer)v19).intValue()),(((java.lang.Float)v20).floatValue()));
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = 11;
    Object v11 = 24.749968F;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = "";
    Object v14 = "";
    Object v15 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.QName)v9).equals(((java.lang.Object)v17));
    Object v19 = 11;
    Object v20 = 24.749968F;
    Object v21 = new java.util.HashSet((((java.lang.Integer)v19).intValue()),(((java.lang.Float)v20).floatValue()));
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getNamespaceResolver();
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = 11;
    Object v13 = 24.749968F;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v12).intValue()),(((java.lang.Float)v13).floatValue()));
    Object v15 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v14));
    Object v16 = "";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).createPath(((org.apache.commons.jxpath.JXPathContext)v15),((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = "";
    Object v10 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).attributeIterator(((org.apache.commons.jxpath.ri.QName)v10));
    Object v12 = 11;
    Object v13 = 24.749968F;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v12).intValue()),(((java.lang.Float)v13).floatValue()));
    Object v15 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isActual();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = "";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).compareTo(((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(((java.lang.Object)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).toString();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getValuePointer();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).toString();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getValuePointer();
    Object v11 = "/";
    Object v12 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v10).getNamespaceURI(((java.lang.String)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = 11;
    Object v11 = 24.749968F;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = "";
    Object v14 = "";
    Object v15 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.QName)v9).equals(((java.lang.Object)v17));
    Object v19 = 11;
    Object v20 = 24.749968F;
    Object v21 = new java.util.HashSet((((java.lang.Integer)v19).intValue()),(((java.lang.Float)v20).floatValue()));
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getLocale();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = "";
    Object v13 = "";
    Object v14 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).compareTo(((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).toString();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getValuePointer();
    Object v11 = "t`ue";
    Object v12 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v10).getNamespaceURI(((java.lang.String)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).isLeaf();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getNodeValue();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = 11;
    Object v11 = 24.749968F;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = "";
    Object v14 = "";
    Object v15 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.QName)v9).equals(((java.lang.Object)v17));
    Object v19 = 11;
    Object v20 = 24.749968F;
    Object v21 = new java.util.HashSet((((java.lang.Integer)v19).intValue()),(((java.lang.Float)v20).floatValue()));
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getRootNode();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).getName();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getRootNode();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).getValue();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).toString();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v10).getName();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).toString();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getLocale();
    Object v14 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v12).isLeaf();
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = 11;
    Object v11 = 24.749968F;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = "";
    Object v14 = "";
    Object v15 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.QName)v9).equals(((java.lang.Object)v17));
    Object v19 = 11;
    Object v20 = 24.749968F;
    Object v21 = new java.util.HashSet((((java.lang.Integer)v19).intValue()),(((java.lang.Float)v20).floatValue()));
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).isActual();
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).asPath();
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getParent();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getIndex();
    org.junit.Assert.assertEquals((Object)(-2147483648), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v10).getName();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = 11;
    Object v11 = 24.749968F;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = "";
    Object v14 = "";
    Object v15 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.QName)v9).equals(((java.lang.Object)v17));
    Object v19 = 11;
    Object v20 = 24.749968F;
    Object v21 = new java.util.HashSet((((java.lang.Integer)v19).intValue()),(((java.lang.Float)v20).floatValue()));
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).isNode();
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 11;
    Object v4 = 24.749968F;
    Object v5 = new java.util.HashSet((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = "";
    Object v7 = "";
    Object v8 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v5),((java.util.Locale)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getLocale();
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = 11;
    Object v11 = 24.749968F;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = "";
    Object v14 = "";
    Object v15 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).isActual();
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 11;
    Object v4 = 24.749968F;
    Object v5 = new java.util.HashSet((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = "";
    Object v7 = "";
    Object v8 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v5),((java.util.Locale)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getLocale();
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v11));
    Object v13 = 11;
    Object v14 = 24.749968F;
    Object v15 = new java.util.HashSet((((java.lang.Integer)v13).intValue()),(((java.lang.Float)v14).floatValue()));
    Object v16 = "";
    Object v17 = "";
    Object v18 = new java.util.Locale(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getValuePointer();
    Object v21 = "";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v21));
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v20),((java.lang.Object)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v23).getName();
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v12).setValue(((java.lang.Object)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = "";
    Object v10 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v10));
    Object v12 = false;
    Object v13 = 11;
    Object v14 = 24.749968F;
    Object v15 = new java.util.HashSet((((java.lang.Integer)v13).intValue()),(((java.lang.Float)v14).floatValue()));
    Object v16 = "";
    Object v17 = "";
    Object v18 = new java.util.Locale(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getValuePointer();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v11),(((java.lang.Boolean)v12).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v21));
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).remove();
    Object v23 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 11;
    Object v4 = 24.749968F;
    Object v5 = new java.util.HashSet((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = "";
    Object v7 = "";
    Object v8 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v5),((java.util.Locale)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getLocale();
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v11));
    Object v13 = 11;
    Object v14 = 24.749968F;
    Object v15 = new java.util.HashSet((((java.lang.Integer)v13).intValue()),(((java.lang.Float)v14).floatValue()));
    Object v16 = "";
    Object v17 = "";
    Object v18 = new java.util.Locale(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v19).getName();
    Object v21 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v12).attributeIterator(((org.apache.commons.jxpath.ri.QName)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).toString();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = 11;
    Object v13 = 24.749968F;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v12).intValue()),(((java.lang.Float)v13).floatValue()));
    Object v15 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v14));
    Object v16 = "";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16));
    Object v18 = -2;
    Object v19 = 11;
    Object v20 = 24.749968F;
    Object v21 = new java.util.HashSet((((java.lang.Integer)v19).intValue()),(((java.lang.Float)v20).floatValue()));
    Object v22 = "";
    Object v23 = "";
    Object v24 = new java.util.Locale(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v21),((java.util.Locale)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).getValuePointer();
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v26).getLocale();
    Object v28 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v11).createChild(((org.apache.commons.jxpath.JXPathContext)v15),((org.apache.commons.jxpath.ri.QName)v17),(((java.lang.Integer)v18).intValue()),((java.lang.Object)v27));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = "";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v11).attributeIterator(((org.apache.commons.jxpath.ri.QName)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = 11;
    Object v10 = 24.749968F;
    Object v11 = new java.util.HashSet((((java.lang.Integer)v9).intValue()),(((java.lang.Float)v10).floatValue()));
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = "";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).createAttribute(((org.apache.commons.jxpath.JXPathContext)v12),((org.apache.commons.jxpath.ri.QName)v14));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = 11;
    Object v13 = 24.749968F;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v12).intValue()),(((java.lang.Float)v13).floatValue()));
    Object v15 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v14));
    Object v16 = "";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16));
    Object v18 = 11;
    Object v19 = 24.749968F;
    Object v20 = new java.util.HashSet((((java.lang.Integer)v18).intValue()),(((java.lang.Float)v19).floatValue()));
    Object v21 = "";
    Object v22 = "";
    Object v23 = new java.util.Locale(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v20),((java.util.Locale)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).getValuePointer();
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).clone();
    Object v27 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v26).asPath();
    Object v28 = ((org.apache.commons.jxpath.ri.QName)v17).equals(((java.lang.Object)v27));
    Object v29 = 0;
    Object v30 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v11).createChild(((org.apache.commons.jxpath.JXPathContext)v15),((org.apache.commons.jxpath.ri.QName)v17),(((java.lang.Integer)v29).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getIndex();
    org.junit.Assert.assertEquals((Object)(-2147483648), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).toString();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isLeaf();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getRootNode();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = 11;
    Object v11 = 24.749968F;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = "";
    Object v14 = "";
    Object v15 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.QName)v9).equals(((java.lang.Object)v17));
    Object v19 = 11;
    Object v20 = 24.749968F;
    Object v21 = new java.util.HashSet((((java.lang.Integer)v19).intValue()),(((java.lang.Float)v20).floatValue()));
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getNodeValue();
    Object v24 = 11;
    Object v25 = 24.749968F;
    Object v26 = new java.util.HashSet((((java.lang.Integer)v24).intValue()),(((java.lang.Float)v25).floatValue()));
    Object v27 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v26));
    Object v28 = "\"";
    Object v29 = "ancest";
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getPointerByKey(((org.apache.commons.jxpath.JXPathContext)v27),((java.lang.String)v28),((java.lang.String)v29));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).isNode();
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).toString();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getName();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = 11;
    Object v10 = 24.749968F;
    Object v11 = new java.util.HashSet((((java.lang.Integer)v9).intValue()),(((java.lang.Float)v10).floatValue()));
    Object v12 = "";
    Object v13 = "";
    Object v14 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v15).getValuePointer();
    Object v17 = "";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v16),((java.lang.Object)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v19).getName();
    Object v21 = 11;
    Object v22 = 24.749968F;
    Object v23 = new java.util.HashSet((((java.lang.Integer)v21).intValue()),(((java.lang.Float)v22).floatValue()));
    Object v24 = "";
    Object v25 = "";
    Object v26 = new java.util.Locale(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v23),((java.util.Locale)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.model.NodePointer)v27).getValuePointer();
    Object v29 = ((org.apache.commons.jxpath.ri.model.NodePointer)v28).clone();
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v29).toString();
    Object v31 = ((org.apache.commons.jxpath.ri.model.NodePointer)v29).getValuePointer();
    Object v32 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((org.apache.commons.jxpath.ri.QName)v20),((java.lang.Object)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).toString();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v11).remove();
    Object v12 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getValuePointer();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getImmediateNode();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isContainer();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 11;
    Object v4 = 24.749968F;
    Object v5 = new java.util.HashSet((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = "";
    Object v7 = "";
    Object v8 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v5),((java.util.Locale)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getLocale();
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v11));
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v12).remove();
    Object v13 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).toString();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getName();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v13 = "";
    Object v14 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v12).getNamespaceURI(((java.lang.String)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isAttribute();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).toString();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getName();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v13 = 11;
    Object v14 = 24.749968F;
    Object v15 = new java.util.HashSet((((java.lang.Integer)v13).intValue()),(((java.lang.Float)v14).floatValue()));
    Object v16 = "";
    Object v17 = "";
    Object v18 = new java.util.Locale(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getValuePointer();
    Object v21 = "";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v21));
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v20),((java.lang.Object)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).clone();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).getParent();
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).isNode();
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).compareTo(((java.lang.Object)v26));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = new java.util.Locale(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v6).equals(((java.lang.Object)v9));
    Object v11 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v12 = "la;ng";
    Object v13 = org.jdom.Namespace.getNamespace(((java.lang.String)v12));
    Object v14 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute(((java.lang.Object)v10),((java.lang.String)v11),((org.jdom.Namespace)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).asPath();
    Object v10 = "";
    Object v11 = "la;ng";
    Object v12 = org.jdom.Namespace.getNamespace(((java.lang.String)v11));
    Object v13 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute(((java.lang.Object)v9),((java.lang.String)v10),((org.jdom.Namespace)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v11).getName();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0));
    Object v2 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(((java.lang.Object)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v8).getValue();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = 11;
    Object v11 = 24.749968F;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = "";
    Object v14 = "";
    Object v15 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.QName)v9).equals(((java.lang.Object)v17));
    Object v19 = 11;
    Object v20 = 24.749968F;
    Object v21 = new java.util.HashSet((((java.lang.Integer)v19).intValue()),(((java.lang.Float)v20).floatValue()));
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v13 = 0;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v12).setIndex((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).toString();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getValuePointer();
    Object v11 = true;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v10).setAttribute((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = "";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v8));
    Object v10 = 11;
    Object v11 = 24.749968F;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = "";
    Object v14 = "";
    Object v15 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getValuePointer();
    Object v18 = ((org.apache.commons.jxpath.ri.QName)v9).equals(((java.lang.Object)v17));
    Object v19 = 11;
    Object v20 = 24.749968F;
    Object v21 = new java.util.HashSet((((java.lang.Integer)v19).intValue()),(((java.lang.Float)v20).floatValue()));
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v7),((org.apache.commons.jxpath.ri.QName)v9),((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = true;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v23).setAttribute((((java.lang.Boolean)v24).booleanValue()));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).toString();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getName();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v13 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v12).getName();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).toString();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isActual();
    Object v13 = 11;
    Object v14 = 24.749968F;
    Object v15 = new java.util.HashSet((((java.lang.Integer)v13).intValue()),(((java.lang.Float)v14).floatValue()));
    Object v16 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v15));
    Object v17 = 11;
    Object v18 = 24.749968F;
    Object v19 = new java.util.HashSet((((java.lang.Integer)v17).intValue()),(((java.lang.Float)v18).floatValue()));
    Object v20 = "";
    Object v21 = "";
    Object v22 = new java.util.Locale(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v23).getName();
    Object v25 = 7;
    Object v26 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v11).createChild(((org.apache.commons.jxpath.JXPathContext)v16),((org.apache.commons.jxpath.ri.QName)v24),(((java.lang.Integer)v25).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 24.749968F;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v0).intValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = "";
    Object v4 = "";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.jxpath.ri.model.NodePointer)v6).getValuePointer();
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).toString();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = 11;
    Object v13 = 24.749968F;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v12).intValue()),(((java.lang.Float)v13).floatValue()));
    Object v15 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v14));
    Object v16 = 11;
    Object v17 = 24.749968F;
    Object v18 = new java.util.HashSet((((java.lang.Integer)v16).intValue()),(((java.lang.Float)v17).floatValue()));
    Object v19 = "";
    Object v20 = "";
    Object v21 = new java.util.Locale(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v18),((java.util.Locale)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).clone();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).toString();
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).getValuePointer();
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v26).getName();
    Object v28 = ((org.apache.commons.jxpath.ri.model.NodePointer)v26).getValuePointer();
    ((org.apache.commons.jxpath.JXPathContext)v15).setNamespaceContextPointer(((org.apache.commons.jxpath.Pointer)v28));
    Object v29 = null;
    Object v30 = "";
    Object v31 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v30));
    Object v32 = 1;
    Object v33 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v11).createChild(((org.apache.commons.jxpath.JXPathContext)v15),((org.apache.commons.jxpath.ri.QName)v31),(((java.lang.Integer)v32).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }
}
