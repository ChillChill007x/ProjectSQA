package org.apache.commons.jxpath.ri.model.jdom;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isActual();
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).getNamespaceResolver();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "'";
    Object v4 = "";
    Object v5 = "w";
    Object v6 = org.jdom.Namespace.getNamespace(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "xmlns";
    Object v8 = "";
    Object v9 = "=";
    Object v10 = new java.util.Locale(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jdom.Namespace)v6).equals(((java.lang.Object)v10));
    Object v12 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute(((java.lang.Object)v2),((java.lang.String)v3),((org.jdom.Namespace)v6));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isNode();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).getValue();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = "a/";
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).getNamespaceURI(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = "";
    Object v11 = "4";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "";
    Object v1 = "4";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 0;
    Object v4 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v3).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v2).equals(((java.lang.Object)v5));
    Object v7 = "";
    Object v8 = "4";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "xmlns";
    Object v11 = "";
    Object v12 = "=";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v9),((java.util.Locale)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = 0;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v10).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "xmlns";
    Object v14 = "";
    Object v15 = "=";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNodeValue();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v20 = 0;
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v20).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = "xmlns";
    Object v24 = "";
    Object v25 = "=";
    Object v26 = new java.util.Locale(((java.lang.String)v23),((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v22),((java.util.Locale)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.model.NodePointer)v27).getNodeValue();
    Object v29 = ((org.apache.commons.jxpath.ri.model.NodePointer)v27).clone();
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v29).getValuePointer();
    Object v31 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v19),((org.apache.commons.jxpath.ri.model.NodePointer)v29));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = 0;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v10).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "xmlns";
    Object v14 = "";
    Object v15 = "=";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNodeValue();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getRootNode();
    Object v21 = 0;
    Object v22 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v21).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v22));
    Object v24 = "xmlns";
    Object v25 = "";
    Object v26 = "=";
    Object v27 = new java.util.Locale(((java.lang.String)v24),((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v23),((java.util.Locale)v27));
    Object v29 = ((org.apache.commons.jxpath.ri.model.NodePointer)v28).getNodeValue();
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v28).clone();
    Object v31 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v19),((org.apache.commons.jxpath.ri.model.NodePointer)v30));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isNode();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getLocale();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "";
    Object v1 = "4";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 0;
    Object v4 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v3).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v2).equals(((java.lang.Object)v5));
    Object v7 = "";
    Object v8 = "4";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "xmlns";
    Object v11 = "";
    Object v12 = "=";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v9),((java.util.Locale)v13));
    Object v15 = "";
    Object v16 = "";
    Object v17 = "w";
    Object v18 = org.jdom.Namespace.getNamespace(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute(((java.lang.Object)v14),((java.lang.String)v15),((org.jdom.Namespace)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(((java.lang.Object)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = "xmlns";
    Object v11 = "";
    Object v12 = "=";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).setValue(((java.lang.Object)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "4";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 0;
    Object v4 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v3).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v2).equals(((java.lang.Object)v5));
    Object v7 = "";
    Object v8 = "4";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "xmlns";
    Object v11 = "";
    Object v12 = "=";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v9),((java.util.Locale)v13));
    Object v15 = 0;
    Object v16 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v15).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).compareTo(((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).isLeaf();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "xmlns";
    Object v1 = "";
    Object v2 = "=";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "&quot;";
    Object v5 = "";
    Object v6 = "w";
    Object v7 = org.jdom.Namespace.getNamespace(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute(((java.lang.Object)v3),((java.lang.String)v4),((org.jdom.Namespace)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "";
    Object v1 = "4";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 0;
    Object v4 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v3).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v2).equals(((java.lang.Object)v5));
    Object v7 = "";
    Object v8 = "4";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "xmlns";
    Object v11 = "";
    Object v12 = "=";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v9),((java.util.Locale)v13));
    Object v15 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(((java.lang.Object)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).getNamespaceResolver();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).asPath();
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getRootNode();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getNodeValue();
    Object v11 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).asPath();
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = "xmlns";
    Object v11 = "";
    Object v12 = "=";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v13));
    Object v15 = "*";
    Object v16 = ((org.apache.commons.jxpath.JXPathContext)v14).createPath(((java.lang.String)v15));
    Object v17 = "";
    Object v18 = "4";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).createAttribute(((org.apache.commons.jxpath.JXPathContext)v14),((org.apache.commons.jxpath.ri.QName)v19));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = "";
    Object v11 = "4";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "xmlns";
    Object v14 = "";
    Object v15 = "=";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.QName)v12).equals(((java.lang.Object)v16));
    Object v18 = 0;
    Object v19 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v18).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v19));
    Object v21 = "xmlns";
    Object v22 = "";
    Object v23 = "=";
    Object v24 = new java.util.Locale(((java.lang.String)v21),((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v20),((java.util.Locale)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).isActual();
    Object v27 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v25).getNamespaceResolver();
    Object v28 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = "";
    Object v11 = "4";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).attributeIterator(((org.apache.commons.jxpath.ri.QName)v12));
    Object v14 = "";
    Object v15 = "4";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).setValue(((java.lang.Object)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).toString();
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).remove();
    Object v11 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "";
    Object v1 = "4";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 0;
    Object v4 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v3).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v4));
    Object v6 = "xmlns";
    Object v7 = "";
    Object v8 = "=";
    Object v9 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v5),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getNodeValue();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getRootNode();
    Object v14 = "xmlns";
    Object v15 = "";
    Object v16 = "=";
    Object v17 = new java.util.Locale(((java.lang.String)v14),((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v13),((java.util.Locale)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ";";
    Object v11 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).isLanguage(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "";
    Object v4 = "";
    Object v5 = "w";
    Object v6 = org.jdom.Namespace.getNamespace(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute(((java.lang.Object)v2),((java.lang.String)v3),((org.jdom.Namespace)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getIndex();
    org.junit.Assert.assertEquals((Object)(-2147483648), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).getName();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "";
    Object v1 = "4";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(((java.lang.Object)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = "xmlns";
    Object v11 = "";
    Object v12 = "=";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v13));
    Object v15 = "";
    Object v16 = "4";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = 0;
    Object v19 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).createChild(((org.apache.commons.jxpath.JXPathContext)v14),((org.apache.commons.jxpath.ri.QName)v17),(((java.lang.Integer)v18).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = "";
    Object v11 = "4";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "xmlns";
    Object v14 = "";
    Object v15 = "=";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.QName)v12).equals(((java.lang.Object)v16));
    Object v18 = 0;
    Object v19 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v18).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v19));
    Object v21 = "xmlns";
    Object v22 = "";
    Object v23 = "=";
    Object v24 = new java.util.Locale(((java.lang.String)v21),((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v20),((java.util.Locale)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).isActual();
    Object v27 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v25).getNamespaceResolver();
    Object v28 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v27));
    Object v29 = false;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v28).setAttribute((((java.lang.Boolean)v29).booleanValue()));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getNode();
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).remove();
    Object v11 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = "substringbefore";
    Object v11 = new org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest(((java.lang.String)v10));
    Object v12 = true;
    Object v13 = 0;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v13).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "xmlns";
    Object v17 = "";
    Object v18 = "=";
    Object v19 = new java.util.Locale(((java.lang.String)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getNodeValue();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v23 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v11),(((java.lang.Boolean)v12).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "xmlns";
    Object v1 = "";
    Object v2 = "=";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(((java.lang.Object)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isContainer();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = "/";
    Object v11 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).getNamespaceURI(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getNodeValue();
    Object v11 = 0;
    Object v12 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v11).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v12));
    Object v14 = "xmlns";
    Object v15 = "";
    Object v16 = "=";
    Object v17 = new java.util.Locale(((java.lang.String)v14),((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v13),((java.util.Locale)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).isNode();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).compareTo(((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "";
    Object v1 = "4";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 0;
    Object v4 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v3).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v2).equals(((java.lang.Object)v5));
    Object v7 = "";
    Object v8 = "4";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "xmlns";
    Object v11 = "";
    Object v12 = "=";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v9),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).isActual();
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getLocale();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isActual();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = 0;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v10).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "xmlns";
    Object v14 = "";
    Object v15 = "=";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNodeValue();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v20 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v19).getName();
    Object v21 = "substringbefore";
    Object v22 = new org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest(((java.lang.String)v21));
    Object v23 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((java.lang.Object)v20),((org.apache.commons.jxpath.ri.compiler.NodeTest)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = 0;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v10).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "xmlns";
    Object v14 = "";
    Object v15 = "=";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNodeValue();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v20 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v19).getNamespaceResolver();
    Object v21 = "substringbefore";
    Object v22 = new org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest(((java.lang.String)v21));
    Object v23 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((java.lang.Object)v20),((org.apache.commons.jxpath.ri.compiler.NodeTest)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getRootNode();
    Object v11 = "D";
    Object v12 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).isLanguage(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).getValue();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "";
    Object v1 = "4";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 0;
    Object v4 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v3).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v4));
    Object v6 = ((org.apache.commons.jxpath.ri.QName)v2).equals(((java.lang.Object)v5));
    Object v7 = "";
    Object v8 = "4";
    Object v9 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "xmlns";
    Object v11 = "";
    Object v12 = "=";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v9),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v14).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = "xmlns";
    Object v11 = "";
    Object v12 = "=";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v13));
    Object v15 = 0;
    Object v16 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v15).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v16));
    Object v18 = "xmlns";
    Object v19 = "";
    Object v20 = "=";
    Object v21 = new java.util.Locale(((java.lang.String)v18),((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v17),((java.util.Locale)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getNodeValue();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v25 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v24).getName();
    Object v26 = "xmlns";
    Object v27 = "";
    Object v28 = "=";
    Object v29 = new java.util.Locale(((java.lang.String)v26),((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = ((org.apache.commons.jxpath.ri.QName)v25).equals(((java.lang.Object)v29));
    Object v31 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).createAttribute(((org.apache.commons.jxpath.JXPathContext)v14),((org.apache.commons.jxpath.ri.QName)v25));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = "xmlns";
    Object v11 = "";
    Object v12 = "=";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = 0;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v10).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "xmlns";
    Object v14 = "";
    Object v15 = "=";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNodeValue();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = "\"=\"";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v20),((java.lang.String)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = 0;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v10).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "xmlns";
    Object v14 = "";
    Object v15 = "=";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNodeValue();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = "\"=\"";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).getLength();
    org.junit.Assert.assertEquals((Object)(1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = "";
    Object v11 = "4";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "substringbefore";
    Object v14 = new org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest(((java.lang.String)v13));
    Object v15 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9),((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = 0;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v10).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "xmlns";
    Object v14 = "";
    Object v15 = "=";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNodeValue();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = "\"=\"";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getValuePointer();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "xmlns";
    Object v12 = "";
    Object v13 = "=";
    Object v14 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v14));
    Object v16 = 0;
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v16).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = "xmlns";
    Object v20 = "";
    Object v21 = "=";
    Object v22 = new java.util.Locale(((java.lang.String)v19),((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v18),((java.util.Locale)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getNodeValue();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).clone();
    Object v26 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v25).getName();
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).createPath(((org.apache.commons.jxpath.JXPathContext)v15),((java.lang.Object)v26));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = 0;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v10).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "xmlns";
    Object v14 = "";
    Object v15 = "=";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNodeValue();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = "\"=\"";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getValuePointer();
    Object v25 = 31;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v24).setIndex((((java.lang.Integer)v25).intValue()));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = 0;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v10).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "xmlns";
    Object v14 = "";
    Object v15 = "=";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNodeValue();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = "\"=\"";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getValuePointer();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).getParent();
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = 0;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v10).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "xmlns";
    Object v14 = "";
    Object v15 = "=";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNodeValue();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).isActual();
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).setValue(((java.lang.Object)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "";
    Object v1 = "4";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "4";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "xmlns";
    Object v7 = "";
    Object v8 = "=";
    Object v9 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).toString();
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = 0;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v10).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "xmlns";
    Object v14 = "";
    Object v15 = "=";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNodeValue();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = "\"=\"";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v23).getValue();
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = "xmlns";
    Object v13 = "";
    Object v14 = "=";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v15));
    Object v17 = "";
    Object v18 = "4";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = -9;
    Object v21 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v11).createChild(((org.apache.commons.jxpath.JXPathContext)v16),((org.apache.commons.jxpath.ri.QName)v19),(((java.lang.Integer)v20).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "xmlns";
    Object v12 = "";
    Object v13 = "=";
    Object v14 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v10),((java.util.Locale)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = 0;
    Object v12 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v11).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v12));
    Object v14 = "xmlns";
    Object v15 = "";
    Object v16 = "=";
    Object v17 = new java.util.Locale(((java.lang.String)v14),((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v13),((java.util.Locale)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getNodeValue();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).clone();
    Object v21 = 0;
    Object v22 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v21).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v22));
    Object v24 = "xmlns";
    Object v25 = "";
    Object v26 = "=";
    Object v27 = new java.util.Locale(((java.lang.String)v24),((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v23),((java.util.Locale)v27));
    Object v29 = ((org.apache.commons.jxpath.ri.model.NodePointer)v28).getNodeValue();
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v28).clone();
    Object v31 = "";
    Object v32 = "4";
    Object v33 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v31),((java.lang.String)v32));
    Object v34 = ((org.apache.commons.jxpath.ri.model.NodePointer)v30).attributeIterator(((org.apache.commons.jxpath.ri.QName)v33));
    Object v35 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v10).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v20),((org.apache.commons.jxpath.ri.model.NodePointer)v30));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getImmediateValuePointer();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "xmlns";
    Object v1 = "";
    Object v2 = "=";
    Object v3 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(((java.lang.Object)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getImmediateValuePointer();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getValuePointer();
    Object v14 = 0;
    Object v15 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v16 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v14).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v15));
    Object v17 = "xmlns";
    Object v18 = "";
    Object v19 = "=";
    Object v20 = new java.util.Locale(((java.lang.String)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v16),((java.util.Locale)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getNodeValue();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).isContainer();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).compareTo(((java.lang.Object)v24));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getImmediateValuePointer();
    Object v13 = "substringbefore";
    Object v14 = new org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest(((java.lang.String)v13));
    Object v15 = false;
    Object v16 = 0;
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v16).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = "xmlns";
    Object v20 = "";
    Object v21 = "=";
    Object v22 = new java.util.Locale(((java.lang.String)v19),((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v18),((java.util.Locale)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getNodeValue();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).clone();
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).clone();
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v26).clone();
    Object v28 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v12).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v14),(((java.lang.Boolean)v15).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v27));
    Object v29 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v12).getNamespaceResolver();
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isActual();
    Object v9 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v7).getNamespaceResolver();
    Object v10 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(((java.lang.Object)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getNodeValue();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getNode();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = "false";
    Object v11 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v9).isLanguage(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = 0;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v10).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "xmlns";
    Object v14 = "";
    Object v15 = "=";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNodeValue();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = "\"=\"";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getValuePointer();
    Object v25 = "xmlns";
    Object v26 = "";
    Object v27 = "=";
    Object v28 = new java.util.Locale(((java.lang.String)v25),((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v28));
    Object v30 = "\\u";
    Object v31 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v29),((java.lang.String)v30));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = 0;
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v12).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = "xmlns";
    Object v16 = "";
    Object v17 = "=";
    Object v18 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getNodeValue();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getImmediateValuePointer();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).clone();
    Object v26 = 0;
    Object v27 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v28 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v26).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v27));
    Object v29 = "xmlns";
    Object v30 = "";
    Object v31 = "=";
    Object v32 = new java.util.Locale(((java.lang.String)v29),((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v28),((java.util.Locale)v32));
    Object v34 = ((org.apache.commons.jxpath.ri.model.NodePointer)v33).getNodeValue();
    Object v35 = ((org.apache.commons.jxpath.ri.model.NodePointer)v33).clone();
    Object v36 = ((org.apache.commons.jxpath.ri.model.NodePointer)v35).clone();
    Object v37 = ((org.apache.commons.jxpath.ri.model.NodePointer)v36).clone();
    Object v38 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v11).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v24),((org.apache.commons.jxpath.ri.model.NodePointer)v37));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isContainer();
    Object v11 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(((java.lang.Object)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getImmediateValuePointer();
    Object v13 = 0;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v13).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "xmlns";
    Object v17 = "";
    Object v18 = "=";
    Object v19 = new java.util.Locale(((java.lang.String)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getNodeValue();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v23 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v22).getNamespaceResolver();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v12).setNamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v23));
    Object v24 = null;
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v12).remove();
    Object v25 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "";
    Object v12 = "4";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.QName)v13).hashCode();
    Object v15 = 0;
    Object v16 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v15).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v16));
    Object v18 = "xmlns";
    Object v19 = "";
    Object v20 = "=";
    Object v21 = new java.util.Locale(((java.lang.String)v18),((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v17),((java.util.Locale)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getNodeValue();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v25 = ";";
    Object v26 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v24).isLanguage(((java.lang.String)v25));
    Object v27 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isActual();
    Object v12 = 0;
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v12).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = "xmlns";
    Object v16 = "";
    Object v17 = "=";
    Object v18 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getNodeValue();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).compareTo(((java.lang.Object)v22));
    org.junit.Assert.assertEquals((Object)(0), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getImmediateValuePointer();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getLocale();
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).isAttribute();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = 0;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v10).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "xmlns";
    Object v14 = "";
    Object v15 = "=";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNodeValue();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = "\"=\"";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getValuePointer();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).isNode();
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "";
    Object v12 = "4";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.QName)v13).hashCode();
    Object v15 = 0;
    Object v16 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v15).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v16));
    Object v18 = "xmlns";
    Object v19 = "";
    Object v20 = "=";
    Object v21 = new java.util.Locale(((java.lang.String)v18),((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v17),((java.util.Locale)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getNodeValue();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v25 = ";";
    Object v26 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v24).isLanguage(((java.lang.String)v25));
    Object v27 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v26));
    Object v28 = 0;
    Object v29 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v30 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v28).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v29));
    Object v31 = "xmlns";
    Object v32 = "";
    Object v33 = "=";
    Object v34 = new java.util.Locale(((java.lang.String)v31),((java.lang.String)v32),((java.lang.String)v33));
    Object v35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v30),((java.util.Locale)v34));
    Object v36 = ((org.apache.commons.jxpath.ri.model.NodePointer)v35).isActual();
    Object v37 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v35).getNamespaceResolver();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v27).setNamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v37));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getImmediateValuePointer();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).isNode();
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getLocale();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "xmlns";
    Object v12 = "";
    Object v13 = "=";
    Object v14 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v10),((java.util.Locale)v14));
    Object v16 = 1;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v15).setIndex((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = 0;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v10).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "xmlns";
    Object v14 = "";
    Object v15 = "=";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNodeValue();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = "\"=\"";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getValuePointer();
    ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v24).remove();
    Object v25 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = 0;
    Object v12 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v11).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v12));
    Object v14 = "xmlns";
    Object v15 = "";
    Object v16 = "=";
    Object v17 = new java.util.Locale(((java.lang.String)v14),((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v13),((java.util.Locale)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).getNodeValue();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getImmediateValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).isNode();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).compareTo(((java.lang.Object)v24));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getImmediateValuePointer();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).toString();
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = 0;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v10).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "xmlns";
    Object v14 = "";
    Object v15 = "=";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNodeValue();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = "\"=\"";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getValuePointer();
    Object v25 = "xmlns";
    Object v26 = "";
    Object v27 = "=";
    Object v28 = new java.util.Locale(((java.lang.String)v25),((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v28));
    Object v30 = "";
    Object v31 = "4";
    Object v32 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = 0;
    Object v34 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v24).createChild(((org.apache.commons.jxpath.JXPathContext)v29),((org.apache.commons.jxpath.ri.QName)v32),(((java.lang.Integer)v33).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = 0;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v10).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "xmlns";
    Object v14 = "";
    Object v15 = "=";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getNodeValue();
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).clone();
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getLocale();
    Object v21 = "\"=\"";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).getValuePointer();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getValuePointer();
    Object v25 = "xmlns";
    Object v26 = "";
    Object v27 = "=";
    Object v28 = new java.util.Locale(((java.lang.String)v25),((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v28));
    Object v30 = "";
    Object v31 = "/..";
    Object v32 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).getPointerByKey(((org.apache.commons.jxpath.JXPathContext)v29),((java.lang.String)v30),((java.lang.String)v31));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v11).getNamespaceURI();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.jxpath.ri.compiler.Expression[]{null,null};
    Object v2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction((((java.lang.Integer)v0).intValue()),((org.apache.commons.jxpath.ri.compiler.Expression[])v1));
    Object v3 = "xmlns";
    Object v4 = "";
    Object v5 = "=";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getNodeValue();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer)v11).asPath();
    org.junit.Assert.assertEquals((Object)(""), v12);
  }
}
