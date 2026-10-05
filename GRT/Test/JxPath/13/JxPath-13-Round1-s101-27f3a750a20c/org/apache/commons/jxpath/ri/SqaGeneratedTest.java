package org.apache.commons.jxpath.ri;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "request";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "request";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = "\"namespace:'\"";
    Object v10 = org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getNamespaceContextPointer();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "XML URL is null";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getExternallyRegisteredPrefix(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).seal();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "i";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getNamespaceURI(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "request";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "request";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = "D";
    Object v10 = org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    Object v2 = "Factory is ";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getPrefix(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "";
    Object v2 = "org.apache.commons.jxpath.JXPATH_CONEXT";
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).registerNamespace(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    Object v2 = "L";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getNamespaceURI(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getNamespaceContextPointer();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getNamespaceURI(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "\"following-siblinE::\"";
    Object v2 = "Q";
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).registerNamespace(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = new org.apache.commons.jxpath.ri.NamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getNamespaceContextPointer();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = new org.apache.commons.jxpath.ri.NamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v0));
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).clone();
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).seal();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    Object v2 = "*";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getExternallyRegisteredNamespaceURI(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    Object v2 = "";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getPrefix(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = new org.apache.commons.jxpath.ri.NamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v0));
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getNamespaceContextPointer();
    Object v3 = "[";
    Object v4 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getPrefix(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "=";
    Object v2 = "R";
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).registerNamespace(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    Object v2 = "\"-\"";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getPrefix(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getNamespaceContextPointer();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = new org.apache.commons.jxpath.ri.NamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v0));
    Object v2 = "page~";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getExternallyRegisteredNamespaceURI(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = new org.apache.commons.jxpath.ri.NamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v0));
    Object v2 = "";
    Object v3 = "fals";
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).registerNamespace(((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "request";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "request";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = "*";
    Object v10 = org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "request";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "request";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = "request";
    Object v10 = "&apo(s;";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(((org.apache.commons.jxpath.ri.QName)v11));
    Object v13 = false;
    Object v14 = "request";
    Object v15 = "&apo(s;";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "request";
    Object v18 = "&apo(s;";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = ")";
    Object v21 = new java.util.Locale(((java.lang.String)v20));
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v19),((java.util.Locale)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v12),(((java.lang.Boolean)v13).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = "- expression ";
    Object v25 = org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((java.lang.String)v24));
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "\"!=\"";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getPrefix(((java.lang.String)v1));
    Object v3 = "Q";
    Object v4 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getExternallyRegisteredNamespaceURI(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    Object v2 = "mdiv\"";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getExternallyRegisteredPrefix(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = new org.apache.commons.jxpath.ri.NamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v0));
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).isSealed();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "request";
    Object v2 = "&apo(s;";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "request";
    Object v5 = "&apo(s;";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ")";
    Object v8 = new java.util.Locale(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.Object)v6),((java.util.Locale)v8));
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).setNamespaceContextPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9));
    Object v10 = null;
    Object v11 = "JXPath: f";
    Object v12 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getNamespaceURI(((java.lang.String)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "'";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getPrefix(((java.lang.String)v1));
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getNamespaceContextPointer();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getPrefix(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "]";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getNamespaceURI(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = new org.apache.commons.jxpath.ri.NamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v0));
    Object v2 = "lang";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getExternallyRegisteredNamespaceURI(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "request";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "request";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = "=.";
    Object v10 = org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).isSealed();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "\\t";
    Object v2 = ".0";
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).registerNamespace(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).seal();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "&quot;";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getPrefix(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = new org.apache.commons.jxpath.ri.NamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v0));
    Object v2 = "";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getExternallyRegisteredNamespaceURI(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = new org.apache.commons.jxpath.ri.NamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v0));
    Object v2 = "";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getExternallyRegisteredPrefix(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = new org.apache.commons.jxpath.ri.NamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v0));
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).seal();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "request";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "request";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = "l";
    Object v10 = org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "XML URL i null";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getNamespaceURI(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "request";
    Object v2 = "&apo(s;";
    Object v3 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "request";
    Object v5 = "&apo(s;";
    Object v6 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ")";
    Object v8 = new java.util.Locale(((java.lang.String)v7));
    Object v9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v3),((java.lang.Object)v6),((java.util.Locale)v8));
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).setNamespaceContextPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = new org.apache.commons.jxpath.ri.NamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v0));
    Object v2 = "Y";
    Object v3 = "Cannot declare new keyword variables.";
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).registerNamespace(((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "request";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "request";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = "";
    Object v10 = org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "request";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "request";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = "N";
    Object v10 = org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "@xml:laUng";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getExternallyRegisteredPrefix(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    Object v2 = "request";
    Object v3 = "&apo(s;";
    Object v4 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "request";
    Object v6 = "&apo(s;";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ")";
    Object v9 = new java.util.Locale(((java.lang.String)v8));
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v4),((java.lang.Object)v7),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getBaseValue();
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).setNamespaceContextPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = new org.apache.commons.jxpath.ri.NamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v0));
    Object v2 = "";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getNamespaceURI(((java.lang.String)v2));
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).seal();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ">";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getPrefix(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "0";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getExternallyRegisteredPrefix(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "request";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "request";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getValuePointer();
    Object v10 = "";
    Object v11 = org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "/t";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getPrefix(((java.lang.String)v1));
    Object v3 = "translate";
    Object v4 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getPrefix(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "request";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "request";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = "<EOF+> ";
    Object v10 = org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    Object v2 = "";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getExternallyRegisteredPrefix(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    Object v2 = "H/";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getPrefix(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = new org.apache.commons.jxpath.ri.NamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v0));
    Object v2 = ">";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getNamespaceURI(((java.lang.String)v2));
    Object v4 = "x9ml";
    Object v5 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getExternallyRegisteredPrefix(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "/";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getExternallyRegisteredPrefix(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "request";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "request";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = "\"";
    Object v10 = org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    Object v2 = "key";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getExternallyRegisteredPrefix(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "line.separator";
    Object v2 = " -";
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).registerNamespace(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "concat";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getPrefix(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "B";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getNamespaceURI(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    Object v2 = "";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getExternallyRegisteredNamespaceURI(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "B[";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getPrefix(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getNamespaceURI(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = new org.apache.commons.jxpath.ri.NamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v0));
    Object v2 = "1";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getPrefix(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    Object v2 = "\"substring-after\"";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getPrefix(((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = "xmlns:";
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).registerNamespace(((java.lang.String)v4),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "request";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "request";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = "/";
    Object v10 = org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "/";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getExternallyRegisteredNamespaceURI(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "xmlns\\";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getNamespaceURI(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "session";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getExternallyRegisteredNamespaceURI(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "<";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getExternallyRegisteredNamespaceURI(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    Object v2 = "/text(()";
    Object v3 = "";
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).registerNamespace(((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "tru";
    Object v6 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getNamespaceURI(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).seal();
    Object v1 = null;
    Object v2 = "x";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getPrefix(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = new org.apache.commons.jxpath.ri.NamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v0));
    Object v2 = "request";
    Object v3 = "&apo(s;";
    Object v4 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "request";
    Object v6 = "&apo(s;";
    Object v7 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ")";
    Object v9 = new java.util.Locale(((java.lang.String)v8));
    Object v10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v4),((java.lang.Object)v7),((java.util.Locale)v9));
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).setNamespaceContextPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "}";
    Object v2 = "1";
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).registerNamespace(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "request";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "request";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = "reiuest";
    Object v10 = org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "o";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getPrefix(((java.lang.String)v1));
    Object v3 = "]";
    Object v4 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getExternallyRegisteredPrefix(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "lang";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getExternallyRegisteredNamespaceURI(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "";
    Object v2 = "";
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).registerNamespace(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    Object v2 = "";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getNamespaceURI(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "/";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getNamespaceURI(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "Unknown namespace prefix:";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getNamespaceURI(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = new org.apache.commons.jxpath.ri.NamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v0));
    Object v2 = "";
    Object v3 = "&quot;";
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).registerNamespace(((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    Object v2 = "\"";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getExternallyRegisteredNamespaceURI(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "request";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "request";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = "6.";
    Object v10 = org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = new org.apache.commons.jxpath.ri.NamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v0));
    Object v2 = "/";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getNamespaceURI(((java.lang.String)v2));
    Object v4 = "names/pace-uri";
    Object v5 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getNamespaceURI(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "request";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "request";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = "null()";
    Object v10 = org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getExternallyRegisteredNamespaceURI(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = new org.apache.commons.jxpath.ri.NamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v0));
    Object v2 = "org.apache.commons.jxpath.JXPATH_CONTEXT";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getExternallyRegisteredPrefix(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).seal();
    Object v1 = null;
    Object v2 = "No such function: ";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getExternallyRegisteredNamespaceURI(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = new org.apache.commons.jxpath.ri.NamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v0));
    Object v2 = "*W";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getNamespaceURI(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "request";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "request";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getImmediateNode();
    Object v10 = "l";
    Object v11 = org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "request";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "request";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getImmediateNode();
    Object v10 = "xml";
    Object v11 = org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "]";
    Object v2 = "";
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).registerNamespace(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).seal();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    Object v2 = "Channot turn ";
    Object v3 = "' for path:";
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).registerNamespace(((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = "#";
    Object v2 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).getPrefix(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    Object v1 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v0).clone();
    Object v2 = ".";
    Object v3 = ((org.apache.commons.jxpath.ri.NamespaceResolver)v1).getExternallyRegisteredNamespaceURI(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "request";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "request";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = "BeanInfo";
    Object v10 = org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(((org.apache.commons.jxpath.ri.model.NodePointer)v8),((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }
}
