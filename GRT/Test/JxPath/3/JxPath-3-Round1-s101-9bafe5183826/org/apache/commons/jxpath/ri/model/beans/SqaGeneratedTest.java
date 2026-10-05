package org.apache.commons.jxpath.ri.model.beans;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ")";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v9).createPath(((org.apache.commons.jxpath.JXPathContext)v12));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v9).asPath();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v9).isActual();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = -56;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest((((java.lang.Integer)v10).intValue()));
    Object v12 = false;
    Object v13 = "session";
    Object v14 = "&apo(s;";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "session";
    Object v17 = "&apo(s;";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ")";
    Object v20 = new java.util.Locale(((java.lang.String)v19));
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v15),((java.lang.Object)v18),((java.util.Locale)v20));
    Object v22 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v11),(((java.lang.Boolean)v12).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getNamespaceResolver();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v9).isContainer();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v9).isCollection();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v9).asPath();
    org.junit.Assert.assertEquals((Object)("/*"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ")";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.jxpath.JXPathContext)v12).getKeyManager();
    Object v14 = "session";
    Object v15 = "&apo(s;";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "session";
    Object v18 = "&apo(s;";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = java.util.List.of(((java.lang.Object)v16),((java.lang.Object)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v9).createPath(((org.apache.commons.jxpath.JXPathContext)v12),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathInvalidAccessException");
    } catch (org.apache.commons.jxpath.JXPathInvalidAccessException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new java.util.Locale(((java.lang.String)v3));
    Object v5 = ")";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v4),((java.util.Locale)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new java.util.Locale(((java.lang.String)v3));
    Object v5 = ")";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v4),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getValue();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new java.util.Locale(((java.lang.String)v3));
    Object v5 = ")";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v4),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isNode();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new java.util.Locale(((java.lang.String)v3));
    Object v5 = ")";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v4),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getRootNode();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new java.util.Locale(((java.lang.String)v3));
    Object v5 = ")";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v4),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getLocale();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new java.util.Locale(((java.lang.String)v3));
    Object v5 = ")";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v4),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getParent();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ")";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = "session";
    Object v14 = "&apo(s;";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v9).createPath(((org.apache.commons.jxpath.JXPathContext)v12),((java.lang.Object)v15));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathInvalidAccessException");
    } catch (org.apache.commons.jxpath.JXPathInvalidAccessException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new java.util.Locale(((java.lang.String)v3));
    Object v5 = ")";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v4),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).getValue();
    Object v9 = "session";
    Object v10 = "&apo(s;";
    Object v11 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).attributeIterator(((org.apache.commons.jxpath.ri.QName)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new java.util.Locale(((java.lang.String)v3));
    Object v5 = ")";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v4),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getBaseValue();
    Object v11 = "session";
    Object v12 = "&apo(s;";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ")";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = ")";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v17));
    Object v19 = "session";
    Object v20 = "&apo(s;";
    Object v21 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = ")";
    Object v23 = new java.util.Locale(((java.lang.String)v22));
    Object v24 = ")";
    Object v25 = new java.util.Locale(((java.lang.String)v24));
    Object v26 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v21),((java.lang.Object)v23),((java.util.Locale)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.model.beans.PropertyPointer)v9).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v18),((org.apache.commons.jxpath.ri.model.NodePointer)v26));
    org.junit.Assert.assertEquals((Object)(0), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = "org.jdom.Document";
    ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v9).setNameAttributeValue(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = "session";
    Object v13 = "&apo(s;";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v9).setValue(((java.lang.Object)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathInvalidAccessException");
    } catch (org.apache.commons.jxpath.JXPathInvalidAccessException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getImmediateParentPointer();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getImmediateParentPointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getNamespaceResolver();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getRootNode();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getImmediateParentPointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValue();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getLength();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getNamespaceResolver();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.beans.PropertyPointer)v9).getBean();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.PropertyPointer)v10).getBean();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValue();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getImmediateParentPointer();
    Object v11 = ")";
    Object v12 = new java.util.Locale(((java.lang.String)v11));
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = "XML URL i null";
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v13),((java.lang.String)v14));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.beans.PropertyPointer)v9).getImmediateValuePointer();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.beans.PropertyPointer)v9).getImmediateValuePointer();
    Object v11 = "session";
    Object v12 = "&apo(s;";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "session";
    Object v15 = "&apo(s;";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ")";
    Object v18 = new java.util.Locale(((java.lang.String)v17));
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v16),((java.util.Locale)v18));
    Object v20 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.beans.PropertyPointer)v21).getBean();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).attributeIterator(((org.apache.commons.jxpath.ri.QName)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "K";
    ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).setPropertyName(((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ")";
    Object v12 = new java.util.Locale(((java.lang.String)v11));
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.jxpath.JXPathContext)v13).getIdentityManager();
    Object v15 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).createPath(((org.apache.commons.jxpath.JXPathContext)v13));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v12 = ((org.apache.commons.jxpath.ri.model.beans.PropertyPointer)v10).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getLocale();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getImmediateParentPointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isNode();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).getValuePointer();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).getPropertyCount();
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ")";
    Object v12 = new java.util.Locale(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.beans.PropertyPointer)v10).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "session";
    Object v12 = "&apo(s;";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "session";
    Object v15 = "&apo(s;";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ")";
    Object v18 = new java.util.Locale(((java.lang.String)v17));
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v16),((java.util.Locale)v18));
    Object v20 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v20).asPath();
    Object v22 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v20).isActual();
    ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).setValue(((java.lang.Object)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathInvalidAccessException");
    } catch (org.apache.commons.jxpath.JXPathInvalidAccessException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "session";
    Object v12 = "&apo(s;";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).compareTo(((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.beans.PropertyPointer)v9).getImmediateValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getNodeValue();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getImmediateParentPointer();
    Object v11 = -56;
    Object v12 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getRootNode();
    Object v12 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).getPropertyName();
    org.junit.Assert.assertEquals((Object)("*"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.beans.PropertyPointer)v9).getImmediateValuePointer();
    Object v11 = "session";
    Object v12 = "&apo(s;";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).attributeIterator(((org.apache.commons.jxpath.ri.QName)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValue();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValue();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getImmediateParentPointer();
    Object v11 = ")";
    Object v12 = new java.util.Locale(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).compareTo(((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = -56;
    Object v12 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getImmediateParentPointer();
    Object v11 = "session";
    Object v12 = "&apo(s;";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.QName)v13).hashCode();
    Object v15 = "session";
    Object v16 = "&apo(s;";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "session";
    Object v19 = "&apo(s;";
    Object v20 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ")";
    Object v22 = new java.util.Locale(((java.lang.String)v21));
    Object v23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v17),((java.lang.Object)v20),((java.util.Locale)v22));
    Object v24 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).getImmediateParentPointer();
    Object v26 = -56;
    Object v27 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest((((java.lang.Integer)v26).intValue()));
    Object v28 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v27));
    Object v29 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.beans.PropertyPointer)v9).getImmediateValuePointer();
    Object v11 = true;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v10).setAttribute((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isAttribute();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).toString();
    org.junit.Assert.assertEquals((Object)("/*"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).isLeaf();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v11).isCollection();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isRoot();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v11).asPath();
    org.junit.Assert.assertEquals((Object)("/*"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isRoot();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ")";
    Object v12 = new java.util.Locale(((java.lang.String)v11));
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).createPath(((org.apache.commons.jxpath.JXPathContext)v13));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getBaseValue();
    Object v13 = ((org.apache.commons.jxpath.ri.model.beans.PropertyPointer)v11).getPropertyIndex();
    org.junit.Assert.assertEquals((Object)(-2147483648), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).asPath();
    org.junit.Assert.assertEquals((Object)("/*"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).getName();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ")";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    Object v14 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v11).createPath(((org.apache.commons.jxpath.JXPathContext)v14));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "session";
    Object v7 = "&apo(s;";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.List.of(((java.lang.Object)v5),((java.lang.Object)v8));
    Object v10 = "session";
    Object v11 = "&apo(s;";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ")";
    Object v14 = new java.util.Locale(((java.lang.String)v13));
    Object v15 = ")";
    Object v16 = new java.util.Locale(((java.lang.String)v15));
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v14),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getLocale();
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v9),((java.util.Locale)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "session";
    Object v12 = "&apo(s;";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "session";
    Object v15 = "&apo(s;";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ")";
    Object v18 = new java.util.Locale(((java.lang.String)v17));
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v16),((java.util.Locale)v18));
    Object v20 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.beans.PropertyPointer)v21).getBean();
    Object v23 = "session";
    Object v24 = "&apo(s;";
    Object v25 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.apache.commons.jxpath.ri.QName)v22),((java.lang.Object)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getImmediateParentPointer();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).getValuePointer();
    Object v12 = -56;
    Object v13 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new java.util.Locale(((java.lang.String)v3));
    Object v5 = ")";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v4),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getNode();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "";
    ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).setNameAttributeValue(((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = "session";
    Object v13 = "&apo(s;";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "session";
    Object v16 = "&apo(s;";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ")";
    Object v19 = new java.util.Locale(((java.lang.String)v18));
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17),((java.util.Locale)v19));
    Object v21 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    Object v23 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v22).getValuePointer();
    Object v24 = -56;
    Object v25 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest((((java.lang.Integer)v24).intValue()));
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getRootNode();
    Object v28 = ((org.apache.commons.jxpath.ri.model.beans.PropertyPointer)v11).equals(((java.lang.Object)v27));
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).toString();
    Object v12 = ")";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).setValue(((java.lang.Object)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathInvalidAccessException");
    } catch (org.apache.commons.jxpath.JXPathInvalidAccessException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.beans.PropertyPointer)v9).getImmediateValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getLocale();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getImmediateNode();
    Object v13 = "session";
    Object v14 = "&apo(s;";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "session";
    Object v17 = "&apo(s;";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = "session";
    Object v20 = "&apo(s;";
    Object v21 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = ")";
    Object v23 = new java.util.Locale(((java.lang.String)v22));
    Object v24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v18),((java.lang.Object)v21),((java.util.Locale)v23));
    Object v25 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).clone();
    Object v27 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v26).getName();
    Object v28 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v11),((org.apache.commons.jxpath.ri.QName)v15),((java.lang.Object)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v11).getPropertyName();
    org.junit.Assert.assertEquals((Object)("*"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "session";
    Object v12 = "&apo(s;";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "session";
    Object v15 = "&apo(s;";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ")";
    Object v18 = new java.util.Locale(((java.lang.String)v17));
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v16),((java.util.Locale)v18));
    Object v20 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getImmediateParentPointer();
    ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).setValue(((java.lang.Object)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathInvalidAccessException");
    } catch (org.apache.commons.jxpath.JXPathInvalidAccessException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "session";
    Object v7 = "&apo(s;";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.List.of(((java.lang.Object)v5),((java.lang.Object)v8));
    Object v10 = "session";
    Object v11 = "&apo(s;";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ")";
    Object v14 = new java.util.Locale(((java.lang.String)v13));
    Object v15 = ")";
    Object v16 = new java.util.Locale(((java.lang.String)v15));
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v14),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getLocale();
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v9),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = "session";
    Object v13 = "&apo(s;";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "session";
    Object v16 = "&apo(s;";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "session";
    Object v19 = "&apo(s;";
    Object v20 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = java.util.List.of(((java.lang.Object)v17),((java.lang.Object)v20));
    Object v22 = "session";
    Object v23 = "&apo(s;";
    Object v24 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = ")";
    Object v26 = new java.util.Locale(((java.lang.String)v25));
    Object v27 = ")";
    Object v28 = new java.util.Locale(((java.lang.String)v27));
    Object v29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v24),((java.lang.Object)v26),((java.util.Locale)v28));
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v29).getLocale();
    Object v31 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v21),((java.util.Locale)v30));
    Object v32 = ((org.apache.commons.jxpath.ri.model.beans.PropertyPointer)v11).equals(((java.lang.Object)v31));
    Object v33 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v11).getBaseValue();
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "session";
    Object v7 = "&apo(s;";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.List.of(((java.lang.Object)v5),((java.lang.Object)v8));
    Object v10 = "session";
    Object v11 = "&apo(s;";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ")";
    Object v14 = new java.util.Locale(((java.lang.String)v13));
    Object v15 = ")";
    Object v16 = new java.util.Locale(((java.lang.String)v15));
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v14),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v17).getLocale();
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v9),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).getName();
    Object v21 = -56;
    Object v22 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest((((java.lang.Integer)v21).intValue()));
    Object v23 = true;
    Object v24 = "session";
    Object v25 = "&apo(s;";
    Object v26 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = ")";
    Object v28 = new java.util.Locale(((java.lang.String)v27));
    Object v29 = ")";
    Object v30 = new java.util.Locale(((java.lang.String)v29));
    Object v31 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v26),((java.lang.Object)v28),((java.util.Locale)v30));
    Object v32 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v22),(((java.lang.Boolean)v23).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v13 = "session";
    Object v14 = "&apo(s;";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).attributeIterator(((org.apache.commons.jxpath.ri.QName)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v11).isContainer();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getIndex();
    org.junit.Assert.assertEquals((Object)(-2147483648), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v11).getLength();
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v11).isActualProperty();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.beans.PropertyPointer)v9).getImmediateValuePointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValue();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v13 = true;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v12).setAttribute((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getParent();
    Object v13 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getImmediateParentPointer();
    Object v11 = "session";
    Object v12 = "&apo(s;";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).compareTo(((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "session";
    Object v12 = "&apo(s;";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "session";
    Object v15 = "&apo(s;";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ")";
    Object v18 = new java.util.Locale(((java.lang.String)v17));
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v16),((java.util.Locale)v18));
    Object v20 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v20).isContainer();
    ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).setValue(((java.lang.Object)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathInvalidAccessException");
    } catch (org.apache.commons.jxpath.JXPathInvalidAccessException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getImmediateParentPointer();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isActual();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isAttribute();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v10).printPointerChain();
    Object v11 = null;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v10).remove();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = "session";
    Object v13 = "&apo(s;";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "session";
    Object v16 = "&apo(s;";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v11),((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v10).getPropertyNames();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getImmediateParentPointer();
    Object v11 = "session";
    Object v12 = "&apo(s;";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "session";
    Object v15 = "&apo(s;";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ")";
    Object v18 = new java.util.Locale(((java.lang.String)v17));
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v16),((java.util.Locale)v18));
    Object v20 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.beans.PropertyPointer)v21).getBean();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).attributeIterator(((org.apache.commons.jxpath.ri.QName)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(((org.apache.commons.jxpath.ri.model.NodePointer)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getNodeValue();
    Object v13 = ")";
    Object v14 = new java.util.Locale(((java.lang.String)v13));
    Object v15 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer)v11).createPath(((org.apache.commons.jxpath.JXPathContext)v15));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = new java.util.Locale(((java.lang.String)v3));
    Object v5 = ")";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v4),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.model.NodePointer)v7).clone();
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getParent();
    org.junit.Assert.assertNull(v9);
  }
}
