package org.apache.commons.jxpath.ri.model;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = "\"ancestor:'\"";
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).isDefaultNamespace(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getLocale();
    org.junit.Assert.assertNotNull(v9);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).isLeaf();
    org.junit.Assert.assertEquals((Object)(false), v9);
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
    Object v9 = 0;
    Object v10 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).isCollection();
    org.junit.Assert.assertEquals((Object)(false), v9);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).isNode();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).getValue();
    Object v10 = "session";
    Object v11 = "&apo(s;";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "session";
    Object v14 = "&apo(s;";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ")";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v15),((java.util.Locale)v17));
    Object v19 = "\"ancestor:'\"";
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).isDefaultNamespace(((java.lang.String)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).compareTo(((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getBaseValue();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = "session";
    Object v11 = "&apo(s;";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).attributeIterator(((org.apache.commons.jxpath.ri.QName)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = 0;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest((((java.lang.Integer)v10).intValue()));
    Object v12 = true;
    Object v13 = "session";
    Object v14 = "&apo(s;";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "session";
    Object v17 = "&apo(s;";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ")";
    Object v20 = new java.util.Locale(((java.lang.String)v19));
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v15),((java.lang.Object)v18),((java.util.Locale)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v11),(((java.lang.Boolean)v12).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getName();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getLength();
    org.junit.Assert.assertEquals((Object)(1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getLocale();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = "";
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).namespacePointer(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = "session";
    Object v11 = "&apo(s;";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "session";
    Object v14 = "&apo(s;";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ")";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v15),((java.util.Locale)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).clone();
    Object v20 = "session";
    Object v21 = "&apo(s;";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = "session";
    Object v24 = "&apo(s;";
    Object v25 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = ")";
    Object v27 = new java.util.Locale(((java.lang.String)v26));
    Object v28 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v22),((java.lang.Object)v25),((java.util.Locale)v27));
    Object v29 = ((org.apache.commons.jxpath.ri.model.NodePointer)v28).clone();
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v19),((org.apache.commons.jxpath.ri.model.NodePointer)v29));
    org.junit.Assert.assertEquals((Object)(0), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isLeaf();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v10);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = false;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setAttribute((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = "session";
    Object v13 = "&apo(s;";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "session";
    Object v16 = "&apo(s;";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ")";
    Object v19 = new java.util.Locale(((java.lang.String)v18));
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v17),((java.util.Locale)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v22 = "session";
    Object v23 = "&apo(s;";
    Object v24 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = "session";
    Object v26 = "&apo(s;";
    Object v27 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = ")";
    Object v29 = new java.util.Locale(((java.lang.String)v28));
    Object v30 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v24),((java.lang.Object)v27),((java.util.Locale)v29));
    Object v31 = ((org.apache.commons.jxpath.ri.model.NodePointer)v30).clone();
    Object v32 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v21),((org.apache.commons.jxpath.ri.model.NodePointer)v31));
    org.junit.Assert.assertEquals((Object)(0), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = "session";
    Object v11 = "&apo(s;";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).attributeIterator(((org.apache.commons.jxpath.ri.QName)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getBaseValue();
    org.junit.Assert.assertNotNull(v14);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = 0;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest((((java.lang.Integer)v10).intValue()));
    Object v12 = true;
    Object v13 = "session";
    Object v14 = "&apo(s;";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "session";
    Object v17 = "&apo(s;";
    Object v18 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ")";
    Object v20 = new java.util.Locale(((java.lang.String)v19));
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v15),((java.lang.Object)v18),((java.util.Locale)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).clone();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v11),(((java.lang.Boolean)v12).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v24);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    org.junit.Assert.assertNull(v10);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    org.junit.Assert.assertNotNull(v10);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getImmediateNode();
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    org.junit.Assert.assertNotNull(v12);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getLocale();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "session";
    Object v12 = "&apo(s;";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).compareTo(((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
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
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getLocale();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v10).setValue(((java.lang.Object)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = "&qut;";
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isLanguage(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getParent();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getNodeValue();
    org.junit.Assert.assertNotNull(v10);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = "session";
    Object v11 = "&apo(s;";
    Object v12 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "session";
    Object v14 = "&apo(s;";
    Object v15 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ")";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v15),((java.util.Locale)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v18).clone();
    Object v20 = "session";
    Object v21 = "&apo(s;";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = "session";
    Object v24 = "&apo(s;";
    Object v25 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = ")";
    Object v27 = new java.util.Locale(((java.lang.String)v26));
    Object v28 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v22),((java.lang.Object)v25),((java.util.Locale)v27));
    Object v29 = ((org.apache.commons.jxpath.ri.model.NodePointer)v28).clone();
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v29).clone();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v30).printPointerChain();
    Object v31 = null;
    Object v32 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).compareChildNodePointers(((org.apache.commons.jxpath.ri.model.NodePointer)v19),((org.apache.commons.jxpath.ri.model.NodePointer)v30));
    org.junit.Assert.assertEquals((Object)(0), v32);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getLength();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getValue();
    org.junit.Assert.assertNotNull(v13);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ",";
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getNamespaceURI(((java.lang.String)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).asPath();
    org.junit.Assert.assertEquals((Object)("/"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v10).remove();
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = "l";
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isDefaultNamespace(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "session";
    Object v7 = "&apo(s;";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getLength();
    Object v14 = ")";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v13),((java.util.Locale)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "session";
    Object v7 = "&apo(s;";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getLength();
    Object v14 = ")";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v13),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).toString();
    org.junit.Assert.assertEquals((Object)("1"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "session";
    Object v7 = "&apo(s;";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getLength();
    Object v14 = ")";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v13),((java.util.Locale)v15));
    Object v17 = 0;
    Object v18 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest((((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
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
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = "session";
    Object v22 = "&apo(s;";
    Object v23 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).attributeIterator(((org.apache.commons.jxpath.ri.QName)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getBaseValue();
    Object v26 = ")";
    Object v27 = new java.util.Locale(((java.lang.String)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.QName)v25).equals(((java.lang.Object)v27));
    Object v29 = "session";
    Object v30 = "&apo(s;";
    Object v31 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v29),((java.lang.String)v30));
    Object v32 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.apache.commons.jxpath.ri.QName)v25),((java.lang.Object)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "session";
    Object v12 = "&apo(s;";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "session";
    Object v15 = "&apo(s;";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = java.util.List.of(((java.lang.Object)v13),((java.lang.Object)v16));
    ((org.apache.commons.jxpath.ri.model.NodePointer)v10).setValue(((java.lang.Object)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "session";
    Object v7 = "&apo(s;";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getLength();
    Object v14 = ")";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v13),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).asPath();
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getNamespaceResolver();
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).printPointerChain();
    Object v10 = null;
    Object v11 = -2;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isNode();
    org.junit.Assert.assertEquals((Object)(true), v12);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isLeaf();
    org.junit.Assert.assertEquals((Object)(false), v11);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "";
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isDefaultNamespace(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getImmediateNode();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "session";
    Object v7 = "&apo(s;";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getLength();
    Object v14 = ")";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v13),((java.util.Locale)v15));
    Object v17 = "&8quot;";
    Object v18 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getNamespaceURI(((java.lang.String)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "session";
    Object v7 = "&apo(s;";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getLength();
    Object v14 = ")";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v13),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getName();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getNodeValue();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isActual();
    org.junit.Assert.assertEquals((Object)(true), v12);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).asPath();
    org.junit.Assert.assertEquals((Object)("/"), v10);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).asPath();
    org.junit.Assert.assertEquals((Object)("/"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "session";
    Object v7 = "&apo(s;";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getLength();
    Object v14 = ")";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v13),((java.util.Locale)v15));
    Object v17 = 0;
    Object v18 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest((((java.lang.Integer)v17).intValue()));
    Object v19 = true;
    Object v20 = "session";
    Object v21 = "&apo(s;";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = "session";
    Object v24 = "&apo(s;";
    Object v25 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = ")";
    Object v27 = new java.util.Locale(((java.lang.String)v26));
    Object v28 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v22),((java.lang.Object)v25),((java.util.Locale)v27));
    Object v29 = ((org.apache.commons.jxpath.ri.model.NodePointer)v28).clone();
    Object v30 = ((org.apache.commons.jxpath.ri.model.NodePointer)v29).clone();
    Object v31 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v18),(((java.lang.Boolean)v19).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v30));
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
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
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).isLeaf();
    Object v22 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v21));
    Object v23 = "*";
    Object v24 = "";
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getPointerByKey(((org.apache.commons.jxpath.JXPathContext)v22),((java.lang.String)v23),((java.lang.String)v24));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "session";
    Object v7 = "&apo(s;";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getLength();
    Object v14 = ")";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v13),((java.util.Locale)v15));
    Object v17 = 0;
    Object v18 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest((((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v18));
    ((org.apache.commons.jxpath.ri.model.NodePointer)v16).printPointerChain();
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getRootNode();
    org.junit.Assert.assertNotNull(v11);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isNode();
    org.junit.Assert.assertEquals((Object)(true), v11);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
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
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = "session";
    Object v22 = "&apo(s;";
    Object v23 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).attributeIterator(((org.apache.commons.jxpath.ri.QName)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).getBaseValue();
    Object v26 = ")";
    Object v27 = new java.util.Locale(((java.lang.String)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.QName)v25).equals(((java.lang.Object)v27));
    Object v29 = "session";
    Object v30 = "&apo(s;";
    Object v31 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v29),((java.lang.String)v30));
    Object v32 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.apache.commons.jxpath.ri.QName)v25),((java.lang.Object)v31));
    Object v33 = "\"";
    Object v34 = ((org.apache.commons.jxpath.ri.model.NodePointer)v32).isDefaultNamespace(((java.lang.String)v33));
    org.junit.Assert.assertEquals((Object)(false), v34);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getBaseValue();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "session";
    Object v7 = "&apo(s;";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).asPath();
    Object v14 = ")";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v13),((java.util.Locale)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getLocale();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "session";
    Object v7 = "&apo(s;";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).asPath();
    Object v14 = ")";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v13),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).isActual();
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "session";
    Object v7 = "&apo(s;";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).asPath();
    Object v14 = ")";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v13),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).getName();
    org.junit.Assert.assertNotNull(v17);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isCollection();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "session";
    Object v7 = "&apo(s;";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).asPath();
    Object v14 = ")";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v13),((java.util.Locale)v15));
    Object v17 = "session";
    Object v18 = "&apo(s;";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = "session";
    Object v21 = "&apo(s;";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = ")";
    Object v24 = new java.util.Locale(((java.lang.String)v23));
    Object v25 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v19),((java.lang.Object)v22),((java.util.Locale)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).clone();
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v26).isLeaf();
    Object v28 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v27));
    Object v29 = "V";
    Object v30 = new java.text.DecimalFormatSymbols();
    ((org.apache.commons.jxpath.JXPathContext)v28).setDecimalFormatSymbols(((java.lang.String)v29),((java.text.DecimalFormatSymbols)v30));
    Object v31 = null;
    Object v32 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).createPath(((org.apache.commons.jxpath.JXPathContext)v28));
    org.junit.Assert.assertNotNull(v32);
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
    Object v9 = ")";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).getLength();
    Object v14 = ")";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v13),((java.util.Locale)v15));
    Object v17 = "session";
    Object v18 = "&apo(s;";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).attributeIterator(((org.apache.commons.jxpath.ri.QName)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
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
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getRootNode();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v10).setValue(((java.lang.Object)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "session";
    Object v12 = "&apo(s;";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "session";
    Object v15 = "&apo(s;";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "session";
    Object v18 = "&apo(s;";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = java.util.List.of(((java.lang.Object)v16),((java.lang.Object)v19));
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v20));
    org.junit.Assert.assertNotNull(v21);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = 0;
    Object v12 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest((((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = "session";
    Object v15 = "&apo(s;";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "session";
    Object v18 = "&apo(s;";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = ")";
    Object v21 = new java.util.Locale(((java.lang.String)v20));
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v19),((java.util.Locale)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).clone();
    Object v25 = "session";
    Object v26 = "&apo(s;";
    Object v27 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = "session";
    Object v29 = "&apo(s;";
    Object v30 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = "session";
    Object v32 = "&apo(s;";
    Object v33 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v31),((java.lang.String)v32));
    Object v34 = java.util.List.of(((java.lang.Object)v30),((java.lang.Object)v33));
    Object v35 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v24),((org.apache.commons.jxpath.ri.QName)v27),((java.lang.Object)v34));
    Object v36 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v12),(((java.lang.Boolean)v13).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v35));
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "session";
    Object v12 = "&apo(s;";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "session";
    Object v15 = "&apo(s;";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "session";
    Object v18 = "&apo(s;";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = java.util.List.of(((java.lang.Object)v16),((java.lang.Object)v19));
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getNamespaceResolver();
    org.junit.Assert.assertNull(v22);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = 0;
    Object v12 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest((((java.lang.Integer)v11).intValue()));
    Object v13 = false;
    Object v14 = "session";
    Object v15 = "&apo(s;";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "session";
    Object v18 = "&apo(s;";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = ")";
    Object v21 = new java.util.Locale(((java.lang.String)v20));
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v19),((java.util.Locale)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v22).clone();
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).clone();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v12),(((java.lang.Boolean)v13).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v24));
    org.junit.Assert.assertNull(v25);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = -38;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getValue();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "session";
    Object v7 = "&apo(s;";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).asPath();
    Object v14 = ")";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v13),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).isCollection();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "session";
    Object v7 = "&apo(s;";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).asPath();
    Object v14 = ")";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v13),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).asPath();
    org.junit.Assert.assertEquals((Object)("'/'"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "session";
    Object v7 = "&apo(s;";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).asPath();
    Object v14 = ")";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v13),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).isCollection();
    Object v18 = "/";
    Object v19 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).namespacePointer(((java.lang.String)v18));
    org.junit.Assert.assertNull(v19);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
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
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).isLeaf();
    Object v22 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).createPath(((org.apache.commons.jxpath.JXPathContext)v22));
    org.junit.Assert.assertNotNull(v23);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).getNamespaceResolver();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isRoot();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
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
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).isLeaf();
    Object v22 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v21));
    Object v23 = "org.apache.commons.jxpath.JXPATH_&ONTEXT";
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getPointerByID(((org.apache.commons.jxpath.JXPathContext)v22),((java.lang.String)v23));
      org.junit.Assert.fail("Expected org.apache.commons.jxpath.JXPathException");
    } catch (org.apache.commons.jxpath.JXPathException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getNamespaceResolver();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "session";
    Object v7 = "&apo(s;";
    Object v8 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ")";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v5),((java.lang.Object)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).clone();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v12).asPath();
    Object v14 = ")";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v13),((java.util.Locale)v15));
    Object v17 = "session";
    Object v18 = "&apo(s;";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = "session";
    Object v21 = "&apo(s;";
    Object v22 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = ")";
    Object v24 = new java.util.Locale(((java.lang.String)v23));
    Object v25 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v19),((java.lang.Object)v22),((java.util.Locale)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).clone();
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v26).isLeaf();
    Object v28 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v27));
    Object v29 = "V";
    Object v30 = new java.text.DecimalFormatSymbols();
    ((org.apache.commons.jxpath.JXPathContext)v28).setDecimalFormatSymbols(((java.lang.String)v29),((java.text.DecimalFormatSymbols)v30));
    Object v31 = null;
    Object v32 = ((org.apache.commons.jxpath.ri.model.NodePointer)v16).createPath(((org.apache.commons.jxpath.JXPathContext)v28));
    Object v33 = "session";
    Object v34 = "&apo(s;";
    Object v35 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v33),((java.lang.String)v34));
    Object v36 = ((org.apache.commons.jxpath.ri.model.NodePointer)v32).attributeIterator(((org.apache.commons.jxpath.ri.QName)v35));
    Object v37 = ((org.apache.commons.jxpath.ri.model.NodePointer)v32).isLeaf();
    org.junit.Assert.assertEquals((Object)(true), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "session";
    Object v12 = "&apo(s;";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "session";
    Object v15 = "&apo(s;";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "session";
    Object v18 = "&apo(s;";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = java.util.List.of(((java.lang.Object)v16),((java.lang.Object)v19));
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getImmediateValuePointer();
    org.junit.Assert.assertNotNull(v22);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
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
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).isLeaf();
    Object v22 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).createPath(((org.apache.commons.jxpath.JXPathContext)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getBaseValue();
    org.junit.Assert.assertNotNull(v24);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getName();
    org.junit.Assert.assertNotNull(v12);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
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
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).isLeaf();
    Object v22 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).createPath(((org.apache.commons.jxpath.JXPathContext)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).getLength();
    org.junit.Assert.assertEquals((Object)(1), v24);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    ((org.apache.commons.jxpath.ri.model.NodePointer)v11).setNamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).getValuePointer();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getImmediateParentPointer();
    org.junit.Assert.assertNull(v12);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = "session";
    Object v12 = "&apo(s;";
    Object v13 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "session";
    Object v15 = "&apo(s;";
    Object v16 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "session";
    Object v18 = "&apo(s;";
    Object v19 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = java.util.List.of(((java.lang.Object)v16),((java.lang.Object)v19));
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(((org.apache.commons.jxpath.ri.model.NodePointer)v10),((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v20));
    Object v22 = "6.";
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).isDefaultNamespace(((java.lang.String)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
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
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).clone();
    Object v22 = ((org.apache.commons.jxpath.ri.model.NodePointer)v21).getImmediateNode();
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).attributeIterator(((org.apache.commons.jxpath.ri.QName)v22));
    org.junit.Assert.assertNotNull(v23);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = 0;
    Object v13 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest((((java.lang.Integer)v12).intValue()));
    Object v14 = false;
    Object v15 = "session";
    Object v16 = "&apo(s;";
    Object v17 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "session";
    Object v19 = "&apo(s;";
    Object v20 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ")";
    Object v22 = new java.util.Locale(((java.lang.String)v21));
    Object v23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v17),((java.lang.Object)v20),((java.util.Locale)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).clone();
    Object v25 = ((org.apache.commons.jxpath.ri.model.NodePointer)v24).clone();
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v25).clone();
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).childIterator(((org.apache.commons.jxpath.ri.compiler.NodeTest)v13),(((java.lang.Boolean)v14).booleanValue()),((org.apache.commons.jxpath.ri.model.NodePointer)v26));
    org.junit.Assert.assertNull(v27);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).isContainer();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = "session";
    Object v13 = "&apo(s;";
    Object v14 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).attributeIterator(((org.apache.commons.jxpath.ri.QName)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).isCollection();
    org.junit.Assert.assertEquals((Object)(false), v10);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isActual();
    org.junit.Assert.assertEquals((Object)(true), v12);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
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
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).isLeaf();
    Object v22 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).createPath(((org.apache.commons.jxpath.JXPathContext)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).isActual();
    org.junit.Assert.assertEquals((Object)(true), v24);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = new org.apache.commons.jxpath.ri.NamespaceResolver();
    ((org.apache.commons.jxpath.ri.NamespaceResolver)v11).seal();
    Object v12 = null;
    ((org.apache.commons.jxpath.ri.model.NodePointer)v10).setNamespaceResolver(((org.apache.commons.jxpath.ri.NamespaceResolver)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).isNode();
    org.junit.Assert.assertEquals((Object)(true), v12);
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
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
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
    Object v20 = ((org.apache.commons.jxpath.ri.model.NodePointer)v19).clone();
    Object v21 = ((org.apache.commons.jxpath.ri.model.NodePointer)v20).isLeaf();
    Object v22 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).createPath(((org.apache.commons.jxpath.JXPathContext)v22));
    Object v24 = 0;
    Object v25 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest((((java.lang.Integer)v24).intValue()));
    Object v26 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).testNode(((org.apache.commons.jxpath.ri.compiler.NodeTest)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.model.NodePointer)v23).isActual();
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getLength();
    Object v13 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getRootNode();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "session";
    Object v1 = "&apo(s;";
    Object v2 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "session";
    Object v4 = "&apo(s;";
    Object v5 = new org.apache.commons.jxpath.ri.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ")";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v2),((java.lang.Object)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.model.NodePointer)v8).clone();
    Object v10 = ((org.apache.commons.jxpath.ri.model.NodePointer)v9).clone();
    Object v11 = ((org.apache.commons.jxpath.ri.model.NodePointer)v10).clone();
    Object v12 = ((org.apache.commons.jxpath.ri.model.NodePointer)v11).getImmediateNode();
    org.junit.Assert.assertNotNull(v12);
  }
}
